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
import cascading.operation.Function;
import cascading.operation.FunctionCall;
import cascading.operation.expression.ExpressionFilter;
import cascading.operation.regex.RegexFilter;
import cascading.operation.regex.RegexParser;
import cascading.operation.text.DateParser;
import cascading.pipe.Checkpoint;
import cascading.pipe.Each;
import cascading.pipe.GroupBy;
import cascading.pipe.HashJoin;
import cascading.pipe.Pipe;
import cascading.pipe.assembly.Discard;
import cascading.pipe.assembly.Rename;
import cascading.pipe.assembly.Retain;
import cascading.pipe.assembly.Unique;
import cascading.pipe.joiner.InnerJoin;
import cascading.property.AppProps;
import cascading.scheme.hadoop.TextDelimited;
import cascading.scheme.hadoop.TextLine;
import cascading.tap.SinkMode;
import cascading.tap.Tap;
import cascading.tap.hadoop.Hfs;
import cascading.tuple.Fields;
import cascading.tuple.Tuple;
import cascading.tuple.TupleEntry;

import java.util.Properties;

public class Main
  {
  public static void main( String[] args )
    {

    // Input file
    String inputPath = args[ 0 ];
    // Output file
    String outputPath = args[ 1 ];

    // Creates a source tap using scheme and local input file
    // Using default TextLine scheme
    Tap inTap = new Hfs( new TextLine(), inputPath );

    // Creates a sink tap to write to the Hfs; by default, TextDelimited writes all fields out
    // For TextDelimited use header = true and delimiter = "\t"
    Tap outTap = new Hfs( new TextDelimited( true, "\t" ), outputPath, SinkMode.REPLACE );

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

    // We want look for IPs which have accessed "GET /images/",
    // (in reality URL would represent particular products or content in shopping carts, etc.)
    // and do a join with our preferred ip list (using their score) which we will generate in a new branch

    // 1st branch: filter IPs which have accessed GET /images/
    Pipe filteredPipe = new Pipe( "filteredPipe", transformPipe );
    filteredPipe = new Each( filteredPipe, new Fields( "request" ), new RegexFilter( "GET /images/" ) );
    filteredPipe = new Retain( filteredPipe, new Fields( "ip" ) );
    filteredPipe = new Unique( filteredPipe, new Fields( "ip" ) );

    // 2nd branch: add a generated score
    Pipe userPipe = new Pipe( "userPipe", transformPipe );
    // Narrows stream to just IPS, remove duplicates and rename for subsequent join
    userPipe = new Retain( userPipe, new Fields( "ip" ) );
    userPipe = new Unique( userPipe, new Fields( "ip" ) );
    userPipe = new Rename( userPipe, new Fields( "ip" ), new Fields( "userip" ) );
    // Add a field score generated from userip using hash function
    userPipe = new Each( userPipe, new Fields( "userip" ), new ScoreNumber( new Fields( "score" ) ), Fields.ALL );

    // Finally we filter out IPs with score lower than 60
    ExpressionFilter filterScore = new ExpressionFilter( "score < 60", Integer.TYPE );
    userPipe = new Each( userPipe, new Fields( "score" ), filterScore );

    Checkpoint userPipeCheckpoint = new Checkpoint( "checkpoint", userPipe );

    // We will now join both branches with a HashJoin on IP address, creating "userip" and using InnerJoin
    Pipe join = new HashJoin( filteredPipe, new Fields( "ip" ), userPipeCheckpoint, new Fields( "userip" ), new InnerJoin() );

    // Then do a discard on the "userip" field
    join = new Discard( join, new Fields( "userip" ) );

    // Sort the users by average score in reverse order
    join = new GroupBy( join, new Fields( "score" ), true );

    // Creates the flow definition by connecting the taps and pipes
    FlowDef flowDef = FlowDef.flowDef()
      .setName("part 6")
      .addSource( transformPipe, inTap )
      .addTailSink( join, outTap ) ;

    // Creates a planner for executing the flow
    Properties properties = AppProps.appProps()
      .setName( "etl-part6-join" )
      .buildProperties();

    AppProps.addApplicationTag( properties, "tutorials" );
    AppProps.addApplicationTag( properties, "cluster:development" );

    // Create a Hadoop Flow Connector
    Flow parsedLogFlow = new HadoopFlowConnector( properties ).connect( flowDef );

    // Runs the flow
    parsedLogFlow.complete();
    }

  // Generates a score number between 1 & 100
  public static class ScoreNumber extends BaseOperation implements Function
    {
    public ScoreNumber()
      {
      // expects 1 argument, fails otherwise
      super( 1, new Fields( "score" ) );
      }

    public ScoreNumber( Fields fieldDeclaration )
      {
      // expects 1 argument, fails otherwise
      super( 1, fieldDeclaration );
      }

    public void operate( FlowProcess flowProcess, FunctionCall functionCall )
      {
      // gets the arguments TupleEntry
      TupleEntry arguments = functionCall.getArguments();

      // creates a Tuple to hold our result value
      Tuple result = new Tuple();
      String ip = arguments.getString( 0 );
      int hash = 7;
      for( int i = 0; i < ip.length(); i++ )
        {
        hash = hash * 31 + ip.indexOf( i );
        }

      int score = hash % 100;
      // adds the score value to the result Tuple
      result.add( score );

      // returns the result Tuple
      functionCall.getOutputCollector().add( result );
      }
    }

  }