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

package teradata;

import java.util.Properties;

import cascading.cascade.Cascade;
import cascading.cascade.CascadeConnector;
import cascading.flow.Flow;
import cascading.flow.hadoop2.Hadoop2MR1FlowConnector;
import cascading.jdbc.JDBCScheme;
import cascading.jdbc.JDBCTap;
import cascading.jdbc.TableDesc;
import cascading.pipe.Pipe;
import cascading.property.AppProps;
import cascading.scheme.hadoop.TextDelimited;
import cascading.tap.Tap;
import cascading.tap.hadoop.Hfs;
import cascading.tuple.Fields;

/**
 * This class demonstrates the use of Cascading to transfer and transform data
 * between HDFS and Teradata.
 */
public class SampleFlow
  {

  public static final Fields FIELDS = new Fields( "startIpNum", "endIpNum", "locId" );
  private static final String[] _urlsSinkColumnNames = {"startIpNum", "endIpNum", "locId"};
  private static final String[] _urlsSinkColumnDefs = {"INTEGER NOT NULL", "INTEGER", "INTEGER"};
  private String[] primaryKeys = {"startIpNum"};
  private String driver = "com.teradata.jdbc.TeraDriver";

  public static void main( String[] args )
    {
    String srcFile = args[ 0 ];        // HDFS filepath to sampledata.csv
    String sinkDir = args[ 1 ];        // HDFS filepath to write output
    String connStr = args[ 2 ];        // src table connection string, ie jdbc:teradata://ec2-1-2-3-4.compute-1.amazonaws.com
    String dbUser = args[ 3 ];         // DB username
    String dbPass = args[ 4 ];         // DB password


    SampleFlow obj = new SampleFlow();

    Properties properties = new Properties();
    AppProps.setApplicationJarClass( properties, SampleFlow.class );

    // Create Hfs source tap
    Tap inTap = new Hfs( new TextDelimited( new Fields( "startIpNum", "endIpNum", "locId" ), false, "," ), srcFile );

    // Create JDBCTap for uploading data to Teradata
    Tap uploadTeradataTap = obj.createTeraDataDbTap( "cascading_test_table", connStr, dbUser, dbPass );

    // Create JDBCTap for exporting data from Teradata using FASTEXPORT
    Tap exportTeradataTap = obj.createTeraDataDbTap( "cascading_test_table", connStr + "/TYPE=FASTEXPORT", dbUser, dbPass );

    // Create Hfs sink tap for writing data to HDFS from Teradata
    Tap sinkTap = new Hfs( new TextDelimited( new Fields( "startIpNum", "endIpNum", "locId" ), false, "," ), sinkDir + "/CascadingSink_" + getTimestamp() );

    // Create two simple copy pipes - here you can add further pipes for data transformation
    Pipe sourceCopyPipe = new Pipe( "sourcePipe" );
    Pipe sinkCopyPipe = new Pipe( "sinkPipe" );

    // Create and connect flows
    Hadoop2MR1FlowConnector flowConnector = new Hadoop2MR1FlowConnector();
    Flow flow1 = flowConnector.connect( "UploadFlow", inTap, uploadTeradataTap, sourceCopyPipe );
    Flow flow2 = flowConnector.connect( "ExportFlow", exportTeradataTap, sinkTap, sinkCopyPipe );

    // Create, connect and complete cascade
    CascadeConnector connector = new CascadeConnector();
    Cascade cascade = connector.connect( flow1, flow2 );
    cascade.complete();

    }

  public Tap createTeraDataDbTap( String tableName, String connectionUrl, String user, String password )
    {
    TableDesc tableDesc = new TableDesc( tableName, _urlsSinkColumnNames, _urlsSinkColumnDefs, primaryKeys );

    // Invoke TeradataDBInputFormat.class to pick up Teradata specific behaviour
    JDBCScheme scheme = new JDBCScheme( FIELDS, _urlsSinkColumnNames, "" );

    // Create standard JDBCTap
    Tap teradataTap = new JDBCTap( connectionUrl, user, password, driver, tableDesc, scheme );
    return teradataTap;
    }

  private static long getTimestamp()
    {
    return System.currentTimeMillis() % 1000;
    }
  }
