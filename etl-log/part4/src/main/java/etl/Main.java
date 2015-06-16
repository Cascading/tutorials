/*
 * Copyright (c) 2007-2012 Concurrent, Inc. All Rights Reserved.
 *
 * Project and contact information: http://www.cascading.org/
 *
 * This file is part of the Cascading project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package etl;

import cascading.flow.Flow;
import cascading.flow.FlowDef;
import cascading.flow.hadoop2.Hadoop2MR1FlowConnector;
import cascading.operation.AssertionLevel;
import cascading.operation.aggregator.Count;
import cascading.operation.filter.Limit;
import cascading.operation.regex.RegexParser;
import cascading.operation.text.DateParser;
import cascading.pipe.Each;
import cascading.pipe.Every;
import cascading.pipe.GroupBy;
import cascading.pipe.Pipe;
import cascading.property.AppProps;
import cascading.scheme.hadoop.TextDelimited;
import cascading.scheme.hadoop.TextLine;
import cascading.tap.SinkMode;
import cascading.tap.hadoop.Hfs;
import cascading.tuple.Fields;

import java.util.Properties;

//
// Merge and Top 10
//
public class Main
  {
  public static void main( String[] args )
    {

    Properties properties = new Properties();
    AppProps.setApplicationJarClass( properties, Main.class );
    Hadoop2MR1FlowConnector flowConnector = new Hadoop2MR1FlowConnector( properties );

    // Input file
    String inputPath = args[ 0 ];

    // Output file
    String outputPath = args[ 1 ];

    // Creates a source tap using scheme and local input file
    // Using default TextLine scheme
    Hfs inTap = new Hfs( new TextLine(), inputPath );

    // Creates a sink tap to write to the default filesystem; by default, TextDelimited writes all fields out
    // For TextDelimited use header = true and delimiter = "\t"
    Hfs outTap = new Hfs( new TextDelimited( true, "\t" ), outputPath, SinkMode.REPLACE );

    // Declares the field names used to parse out of the log file
    Fields apacheFields = new Fields( "ip", "time", "request", "response", "size" );

    // Defines the regular expression used to parse the log file
    String apacheRegex = "^([^ ]*) \\S+ \\S+ \\[([\\w:/]+\\s[+\\-]\\d{4})\\] \"(.+?)\" (\\d{3}) ([^ ]*).*$";

    // Declares the groups from the above regex. Each group will be given a field name from 'apacheFields'
    int[] allGroups = {1, 2, 3, 4, 5};

    // Creates the parser
    RegexParser parser = new RegexParser( apacheFields, apacheRegex, allGroups );

    // Creates the main import pipe element, and with the input argument named "line"
    // replace the incoming tuple with the parser results
    Pipe regexImport = new Each( "regexImport", new Fields( "line" ), parser, Fields.RESULTS );

    // Applies a text parser to create a timestamp from date and replace date by this timestamp
    DateParser dateParser = new DateParser( new Fields( "time" ), "dd/MMM/yyyy:HH:mm:ss Z" );
    Pipe transformPipe = new Each( regexImport, new Fields( "time" ), dateParser, Fields.REPLACE );

    // Creates a simple aggregation (using group by + count) by ip address.
    Pipe countByIpPipe = new Pipe( "countByIpPipe", transformPipe );
    countByIpPipe = new GroupBy( countByIpPipe, new Fields( "ip" ) );
    countByIpPipe = new Every( countByIpPipe, Fields.GROUP, new Count( new Fields( "IPcount" ) ), Fields.ALL );

    // Sort the ip addresses by count hits by creating a sortedByCount ByIpCount and Grouping by "count"
    Pipe sortedCountByIpPipe = new Pipe( "sortedCountByIpPipe", countByIpPipe );
    sortedCountByIpPipe = new GroupBy( sortedCountByIpPipe, new Fields( "IPcount" ), true );

    // Create a sortedCountByIpPipe using Each and Retain to limit to top 10 results
    sortedCountByIpPipe = new Each( sortedCountByIpPipe, new Fields( "IPcount" ), new Limit( 10 ) );

    AppProps.addApplicationTag( properties, "tutorials" );
    AppProps.addApplicationTag( properties, "cluster:development" );
    AppProps.setApplicationName( properties, "etl-part4-count" );

    // connect the taps, pipes, etc., into a flow
    FlowDef flowDef = FlowDef.flowDef().setName( "part 4" ).addSource( regexImport, inTap ).addTailSink( sortedCountByIpPipe, outTap );

    // Run the flow
    Flow wcFlow = flowConnector.connect( flowDef );

    flowDef.setAssertionLevel( AssertionLevel.VALID );

    wcFlow.complete();
    }

  }

