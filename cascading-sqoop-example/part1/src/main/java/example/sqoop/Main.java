/*
 * Copyright (c) 2007-2015 Concurrent, Inc. All Rights Reserved.
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

package example.sqoop;

import cascading.cascade.Cascade;
import cascading.cascade.CascadeConnector;
import cascading.flow.Flow;
import cascading.flow.FlowDef;
import cascading.flow.hadoop2.Hadoop2MR1FlowConnector;
import cascading.flow.process.ProcessFlow;
import cascading.pipe.Pipe;
import cascading.property.AppProps;
import cascading.scheme.hadoop.TextDelimited;
import cascading.tap.Tap;
import cascading.tap.hadoop.Hfs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Collections;
import java.util.Properties;

public class Main
  {
  private static final Logger log = LoggerFactory.getLogger( Main.class );

  public static void main( String[] args )
    {

    // Set some App properties
    Properties properties = new Properties();
    AppProps.setApplicationJarClass( properties, Main.class );
    AppProps.addApplicationTag( properties, "tutorials" );
    AppProps.addApplicationTag( properties, "cluster:development" );
    AppProps.setApplicationName( properties, "Custom Flow - Sqoop" );

    // Use hadoop flow connector
    Hadoop2MR1FlowConnector flowConnector = new Hadoop2MR1FlowConnector( properties );

    String inPath = args[ 0 ]; // <Input file>
    String outPath = args[ 1 ]; // <Output file>
    String sqoopOutPath = args[ 2 ]; // <Sqoop Destination File>
    String url = args[ 3 ]; // "http://192.168.59.103:12000/sqoop/"
    long jobId = Long.parseLong( args[ 4 ] ); // <Sqoop Job ID>

    // create the source tap for <Input file>
    Tap inTap = new Hfs( new TextDelimited( true, "\t" ), inPath );

    // create the sink tap <Output file>
    Tap outTap = new Hfs( new TextDelimited( true, "\t" ), outPath );

    // Sqoop Output file <Sqoop Destination File>
    Tap sqoopOutTap = new Hfs( new TextDelimited( true, "\t" ), sqoopOutPath );

    // specify a pipe to connect the taps, as simple copy
    Pipe copyPipe = new Pipe( "copy" );

    // connect the taps, pipes, etc., into a flow
    FlowDef flowDef = FlowDef.flowDef()
      .addSource( copyPipe, inTap )
      .addTailSink( copyPipe, outTap )
      .setName( "Data Prepare" );

    // Connect first part, dataPrepFlow that copies HDFS file
    Flow dataPrepFlow = flowConnector.connect( flowDef );

    // Create a process flow to contain our custom Sqoop client
    ProcessFlow sqoopFlow = new ProcessFlow( "Run Sqoop Job",
      new SqoopRiffle( Collections.unmodifiableCollection( Arrays.asList( outTap ) ),
        sqoopOutTap,
        url,
        jobId ) );

    // Connect dataPrepFlow and sqoopFlow using a Cascade
    CascadeConnector connector = new CascadeConnector();
    Cascade cascade = connector.connect( dataPrepFlow, sqoopFlow );

    // Run the Cascade
    cascade.start();
    cascade.complete();

    }

  }

