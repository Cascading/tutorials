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
import cascading.flow.FlowProcess;
import cascading.flow.hadoop.HadoopFlowConnector;
import cascading.operation.AssertionLevel;
import cascading.operation.BaseOperation;
import cascading.operation.Function;
import cascading.operation.FunctionCall;
import cascading.operation.assertion.AssertExpression;
import cascading.operation.regex.RegexParser;
import cascading.operation.text.DateParser;
import cascading.pipe.Each;
import cascading.pipe.GroupBy;
import cascading.pipe.Pipe;
import cascading.property.AppProps;
import cascading.scheme.hadoop.TextDelimited;
import cascading.scheme.hadoop.TextLine;
import cascading.tap.SinkMode;
import cascading.tap.Tap;
import cascading.tap.hadoop.Hfs;
import cascading.tap.hadoop.PartitionTap;
import cascading.tap.partition.DelimitedPartition;
import cascading.tuple.Fields;
import cascading.tuple.Tuple;
import cascading.tuple.TupleEntry;

import java.util.Calendar;
import java.util.Properties;
import java.util.TimeZone;

public class Main
  {
  public static void main( String[] args )
    {

    Properties properties = new Properties();
    AppProps.setApplicationJarClass( properties, Main.class );
    HadoopFlowConnector flowConnector = new HadoopFlowConnector( properties );

    AppProps.addApplicationTag( properties, "tutorials" );
    AppProps.addApplicationTag( properties, "cluster:development" );
    AppProps.setApplicationName( properties, "etl-part1-filecopy") ;

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

    //trap for catching 404 messages
    AssertExpression assertExp = new AssertExpression( "response != 404", Long.class );
    processPipe = new Each( processPipe, AssertionLevel.VALID, assertExp );

    // Applies a text parser to create a timestamp from date and replace date by this timestamp
    DateParser dateParser = new DateParser( new Fields( "time" ), "dd/MMM/yyyy:HH:mm:ss Z" );
    processPipe = new Each( processPipe, new Fields( "time" ), dateParser, Fields.REPLACE );

    // Augment the tuple with day for time
    processPipe = new Each( processPipe, new Fields( "time" ), new DayForTimestamp(), Fields.ALL );
    processPipe = new GroupBy( processPipe, new Fields( "day" ) );

    // Create a TextDelimited scheme
    TextDelimited scheme = new TextDelimited( new Fields( "day", "ip", "time", "request", "size" ), true, "\t" );

    // Create DelimitedPartition instance used to partition the files based on Fields("day")
    DelimitedPartition partition = new DelimitedPartition( new Fields( "day" ), "-" );

    // Create the Partition Tap
    Tap daysTap = new PartitionTap( outTap, partition, SinkMode.REPLACE );

    Tap trapTap = new Hfs( new TextDelimited( true, "\t" ), outputPath + "/trap", SinkMode.REPLACE );

    // connect the taps, pipes, etc., into a flow
    FlowDef flowDef = FlowDef.flowDef()
      .setName("part 1")
      .addSource( processPipe, inTap )
      .addTailSink( processPipe, daysTap )
      .addTrap( "processPipe", trapTap );

    // Run the flow
    Flow wcFlow = flowConnector.connect( flowDef );

    flowDef.setAssertionLevel( AssertionLevel.VALID );

    wcFlow.complete();
    }

  // Breaks down the time in days for further analysis
  public static class DayForTimestamp extends BaseOperation implements Function
    {
    public DayForTimestamp()
      {
      super( 1, new Fields( "day" ) );
      }

    public DayForTimestamp( Fields fieldDeclaration )
      {
      super( 1, fieldDeclaration );
      }

    public void operate( FlowProcess flowProcess, FunctionCall functionCall )
      {
      // Gets the arguments TupleEntry
      TupleEntry arguments = functionCall.getArguments();

      // Creates a Tuple to hold our result values
      Tuple result = new Tuple();

      Calendar calendar = Calendar.getInstance();
      calendar.setTimeZone( TimeZone.getTimeZone( "UTC" ) );
      calendar.setTimeInMillis( arguments.getLong( 0 ) );
      int day = calendar.get( java.util.Calendar.DAY_OF_MONTH );

      // Adds the day value to the result Tuple
      result.add( day );

      // Returns the result Tuple
      functionCall.getOutputCollector().add( result );
      }
    }
  }

