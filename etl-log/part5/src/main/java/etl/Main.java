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
import cascading.operation.BaseOperation;
import cascading.operation.Buffer;
import cascading.operation.BufferCall;
import cascading.operation.Function;
import cascading.operation.FunctionCall;
import cascading.operation.expression.ExpressionFilter;
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
import cascading.tuple.Tuple;
import cascading.tuple.TupleEntry;

import java.util.*;

public class Main
  {
  public static void main( String[] args )
    {

    Properties properties = new Properties();
    AppProps.setApplicationJarClass( properties, Main.class );
    HadoopFlowConnector flowConnector = new HadoopFlowConnector( properties );

    AppProps.addApplicationTag( properties, "ETL Tutorial" );

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

    // We have to filter out the tuples with no size (- instead) such as the one with 404 and 30x response codes
    Pipe filterResponsePipe = new Pipe( "filterResponsePipe", transformPipe );
    ExpressionFilter filterResponse =
      new ExpressionFilter( "size.equals(\"-\")", String.class );
    filterResponsePipe = new Each( filterResponsePipe, new Fields( "size" ), filterResponse );

    // Create a new Each named moving_avgSizeByMinPipe to augment the tuple with hour of the day for time
    Pipe moving_avgSizeByMinPipe = new Each( filterResponsePipe, new Fields( "time" ), new DayForTimestamp(), Fields.ALL );

    // Calculates moving average 60 mins based on bandwith
    // Groups by min, calculates 60 mins moving average on field size
    moving_avgSizeByMinPipe = new GroupBy( moving_avgSizeByMinPipe, new Fields( "day" ) );
    moving_avgSizeByMinPipe = new Every( moving_avgSizeByMinPipe, new Fields( "size", "time" ),
                            new MovingAverageBuffer( new Fields( "min", "moving_average" ) ), Fields.RESULTS );

    AppProps.addApplicationTag( properties, "tutorials" );
    AppProps.addApplicationTag( properties, "cluster:development" );
    AppProps.setApplicationName( properties, "etl-part5-moving-average") ;

    // connect the taps, pipes, etc., into a flow
    FlowDef flowDef = FlowDef.flowDef()
      .setName("part 5")
      .addSource( regexImport, inTap )
      .addTailSink( moving_avgSizeByMinPipe, outTap );

    // Run the flow
    Flow wcFlow = flowConnector.connect( flowDef );

    wcFlow.complete();
    }

  public static class MovingAverageBuffer extends BaseOperation implements Buffer
    {

    //
    // Create a time period variable
    //

    // Create a time period variable for the 60 mins moving average
    private final static int period = 60;

    public MovingAverageBuffer()
      {
      super( 2, new Fields( "min", "mavg" ) );
      }

    public MovingAverageBuffer( Fields fieldDeclaration )
      {
      super( 2, fieldDeclaration );
      }

    //
    // Create an operate function
    //

    // The operate function has two arguments - FlowProcess and BufferCall
    public void operate( FlowProcess flowProcess, BufferCall bufferCall )
      {
      // Init
      long sum = 0;
      // Holds a day = 60 * 24 minutes
      long[] sums = new long[ 60 * 24 ];
      long[] nums = new long[ 60 * 24 ];
      Queue<Long> window = new LinkedList<Long>();

      // Get all the current argument values for this daily grouping
      Iterator<TupleEntry> arguments = bufferCall.getArgumentsIterator();

      boolean init = true;
      int c = 0;
      while( arguments.hasNext() )
        {
        // Get the arguments TupleEntry
        TupleEntry entry = arguments.next();
        // Get size for Tuple
        int size = entry.getInteger( 0 );
        // Get time for Tuple
        long time = entry.getLong( 1 );

        // Modulo for every min
        int i = (int) ( time / ( 1000 * 60 ) ) % ( 60 * 24 );
        // Init, 1st min of the day might be different than zero
        if( init )
          {
          c = i;
          init = false;
          }

        // For every new min
        if( c != i )
          {
          sum += sums[ c ] / nums[ c ];
          window.add( sums[ c ] / nums[ c ] );
          c = i;
          if( window.size() > period )
            {
            sum -= window.remove();
            }
          // create a Tuple to hold our result values
          Tuple result = new Tuple( time / ( 1000 * 60 ), sum / window.size() );
          // return the result Tuple
          bufferCall.getOutputCollector().add( result );
          }

        sums[ i ] += size;
        nums[ i ]++;
        }
      }

    }

  // Breaks down the time in days for further analysis
  public static class DayForTimestamp extends BaseOperation implements Function
    {
    public DayForTimestamp()
      {
      // expects 1 argument, fails otherwise
      super( 1, new Fields( "day" ) );
      }

    public DayForTimestamp( Fields fieldDeclaration )
      {
      // expects 1 argument, fails otherwise
      super( 1, fieldDeclaration );
      }

    public void operate( FlowProcess flowProcess, FunctionCall functionCall )
      {
      // gets the arguments TupleEntry
      TupleEntry arguments = functionCall.getArguments();

      // creates a Tuple to hold our result values
      Tuple result = new Tuple();

      Calendar calendar = Calendar.getInstance();
      calendar.setTimeZone( TimeZone.getTimeZone( "UTC" ) );
      calendar.setTimeInMillis( arguments.getLong( 0 ) );
      int day = calendar.get( java.util.Calendar.DAY_OF_MONTH );

      // adds the day value to the result Tuple
      result.add( day );

      // returns the result Tuple
      functionCall.getOutputCollector().add( result );
      }
    }
  }

