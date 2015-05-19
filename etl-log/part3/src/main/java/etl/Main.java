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
import cascading.pipe.GroupBy;
import cascading.pipe.Pipe;
import cascading.property.AppProps;
import cascading.scheme.hadoop.TextDelimited;
import cascading.scheme.hadoop.TextLine;
import cascading.tap.MultiSourceTap;
import cascading.tap.SinkMode;
import cascading.tap.hadoop.GlobHfs;
import cascading.tap.hadoop.Hfs;
import cascading.tuple.Fields;

import java.util.Properties;

//
// Read from two sources and merge sorted by IP address
//
public class Main
  {
  public static void main( String[] args )
    {
    Properties properties = new Properties();
    AppProps.setApplicationJarClass( properties, Main.class );
    HadoopFlowConnector flowConnector = new HadoopFlowConnector( properties );

    // Input file (s)
    String inputPath1 = args[ 0 ];
    String inputPath2 = args[ 1 ];

    // Output file
    String outputPath = args[ 2 ];

    GlobHfs inTap1 = new GlobHfs( new TextLine(), inputPath1 );
    GlobHfs inTap2 = new GlobHfs( new TextLine(), inputPath2 );

    MultiSourceTap sourceTap = new MultiSourceTap( inTap1, inTap2 );

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

    //Sort them by IP address
    processPipe = new GroupBy( processPipe, new Fields( "ip" ), true );

    AppProps.addApplicationTag( properties, "tutorials" );
    AppProps.addApplicationTag( properties, "cluster:development" );
    AppProps.setApplicationName( properties, "etl-part3-merge") ;

    // connect the taps, pipes, etc., into a flow
    FlowDef flowDef = FlowDef.flowDef()
      .setName("part 3")
      .addSource( processPipe, sourceTap )
      .addTailSink( processPipe, outTap );

    // Run the flow
    Flow wcFlow = flowConnector.connect( flowDef );

    flowDef.setAssertionLevel( AssertionLevel.VALID );

    wcFlow.complete();
    }

  }

