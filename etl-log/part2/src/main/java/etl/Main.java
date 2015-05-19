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
import cascading.flow.hadoop.HadoopFlowConnector;
import cascading.operation.AssertionLevel;
import cascading.operation.regex.RegexParser;
import cascading.pipe.Each;
import cascading.pipe.Pipe;
import cascading.property.AppProps;
import cascading.scheme.hadoop.TextDelimited;
import cascading.scheme.hadoop.TextLine;
import cascading.tap.SinkMode;
import cascading.tap.hadoop.Hfs;
import cascading.tuple.Fields;
import cascading.operation.expression.ExpressionFilter;

import java.util.Properties;

//
// Part 2: Filter zero sized files
//

public class Main
  {
  public static void main( String[] args )
    {

    Properties properties = new Properties();
    AppProps.setApplicationJarClass( properties, Main.class );
    HadoopFlowConnector flowConnector = new HadoopFlowConnector( properties );

    AppProps.addApplicationTag( properties, "tutorials" );
    AppProps.addApplicationTag( properties, "cluster:development" );
    AppProps.setApplicationName( properties, "etl-part2-filters") ;

    // Input file
    String inputPath = args[ 0 ];

    // Output file
    String outputPath = args[ 1 ];

    Hfs inTap = new Hfs( new TextLine(), inputPath );

    // Create a sink tap to write to the Hfs; by default, TextDelimited writes all fields out
    Hfs outTap = new Hfs( new TextDelimited( true, "\t" ), outputPath, SinkMode.REPLACE );

    // Declare the field names used to parse out of the log file
    Fields apacheFields = new Fields( "ip", "time", "request", "response", "size" );

    // Define the regular expression used to parse the log file
    String apacheRegex = "^([^ ]*) \\S+ \\S+ \\[([\\w:/]+\\s[+\\-]\\d{4})\\] \"(.+?)\" (\\d{3}) ([^ ]*).*$";

    // Declare the groups from the above regex. Each group will be given a field name from 'apacheFields'
    int[] allGroups = {1, 2, 3, 4, 5};

    // Create the parser
    RegexParser parser = new RegexParser( apacheFields, apacheRegex, allGroups );

    // Create the main import pipe element, and with the input argument named "line"
    Pipe processPipe = new Each( "processPipe", new Fields( "line" ), parser, Fields.RESULTS );

    // We have to filter out the tuples with no size (- instead) such as the one with 404 and 30x response codes
    ExpressionFilter filterResponse =
      new ExpressionFilter( "size.equals(\"-\")", String.class );
    processPipe = new Each( processPipe, new Fields( "size" ), filterResponse );

    // connect the taps, pipes, etc., into a flow
    FlowDef flowDef = FlowDef.flowDef()
      .setName("part 2")
      .addSource( processPipe, inTap )
      .addTailSink( processPipe, outTap );

    // Run the flow
    Flow wcFlow = flowConnector.connect( flowDef );

    flowDef.setAssertionLevel( AssertionLevel.VALID );

    wcFlow.complete();
    }

  }

