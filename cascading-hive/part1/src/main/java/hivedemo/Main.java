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

package hivedemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

import cascading.cascade.Cascade;
import cascading.cascade.CascadeConnector;
import cascading.flow.Flow;
import cascading.flow.hadoop.HadoopFlowConnector;
import cascading.pipe.Pipe;
import cascading.property.AppProps;
import cascading.scheme.hadoop.TextDelimited;
import cascading.tap.Tap;
import cascading.tap.hadoop.Hfs;
import cascading.tap.hive.HiveTableDescriptor;
import cascading.tap.hive.HiveTap;
import cascading.tuple.Fields;

import static cascading.tap.SinkMode.REPLACE;

public class Main
  {
  // Cascading Fields for call center data
  public static final Fields CALL_CENTER_FIELDS = new Fields( "cc_call_center_sk", "cc_call_center_id", "cc_rec_start_date", "cc_rec_end_date", "cc_closed_date_sk", "cc_open_date_sk", "cc_name", "cc_class", "cc_employees", "cc_sq_ft", "cc_hours", "cc_manager", "cc_mkt_id", "cc_mkt_class", "cc_mkt_desc", "cc_market_manager", "cc_division", "cc_division_name", "cc_company", "cc_company_name", "cc_street_number", "cc_street_name", "cc_street_type", "cc_suite_number", "cc_city", "cc_county", "cc_state", "cc_zip", "cc_country", "cc_gmt_offset", "cc_tax_percentage", "trailing field" );
  // Hive table fields for call center data
  public static final String[] CALL_CENTER_TABLE_FIELDS = new String[]{"cc_call_center_sk", "cc_call_center_id", "cc_rec_start_date", "cc_rec_end_date", "cc_closed_date_sk", "cc_open_date_sk", "cc_name", "cc_class", "cc_employees", "cc_sq_ft", "cc_hours", "cc_manager", "cc_mkt_id", "cc_mkt_class", "cc_mkt_desc", "cc_market_manager", "cc_division", "cc_division_name", "cc_company", "cc_company_name", "cc_street_number", "cc_street_name", "cc_street_type", "cc_suite_number", "cc_city", "cc_county", "cc_state", "cc_zip", "cc_country", "cc_gmt_offset", "cc_tax_percentage", "trailing field"};
  // Hive column typs for call center data
  public static final String[] CALL_CENTER_TABLE_TYPES = new String[]{"int", "string", "date", "date", "int", "int", "string", "string", "int", "int", "string", "string", "int", "string", "string", "string", "int", "string", "int", "string", "string", "string", "string", "string", "string", "string", "string", "string", "string", "decimal(5,2)", "decimal(5,2)", "string"};

  public static void main( String[] args )
    {

    Properties properties = new Properties();
    AppProps.setApplicationJarClass( properties, Main.class );

    // add ApplicationTag for Driven identification and search functionality
    AppProps.addApplicationTag( properties, "tutorials" );
    AppProps.addApplicationTag( properties, "cluster:development" );
    AppProps.setApplicationName( properties, "cascading-hive part1 file copy" );

    // create initial Hfs tap to read call_center.dat from local HDFS
    Tap inTapCallCenter = new Hfs( new TextDelimited( CALL_CENTER_FIELDS, "|" ), "/tpcds/data/call_center.dat" );

    // create HiveTableDescriptor to describe and create (if needed) call_center Hive table
    HiveTableDescriptor sinkTableDescriptor = new HiveTableDescriptor( "call_center", CALL_CENTER_TABLE_FIELDS, CALL_CENTER_TABLE_TYPES );

    // create HiveTap sinkTap using HiveTableDescriptor and descriptor scheme
    HiveTap sinkTap = new HiveTap( sinkTableDescriptor, sinkTableDescriptor.toScheme(), REPLACE, true );

    // create simple Pipe for copying data from HDFS to Hive
    Pipe copyPipe = new Pipe( "copyPipe" );

    HadoopFlowConnector flowConnector = new HadoopFlowConnector( properties );

    // create flow using HadoopFlowConnector, inTapCallCenter(HfsTap) as source, sinkTap (HIveTap) as sink and copyPipe to copy
    Flow flow1 = flowConnector.connect( "flow1", inTapCallCenter, sinkTap, copyPipe );

    // create, connect and complete cascade
    CascadeConnector connector = new CascadeConnector();
    Cascade cascade = connector.connect( flow1 );
    cascade.complete();

    try
      {
      // to verify the application create a direct jdbc connection to Hive
      Class.forName( "org.apache.hadoop.hive.jdbc.HiveDriver" );

      // create local connection to Hive - your connection parameters may differ
      Connection con = DriverManager.getConnection( "jdbc:hive://", "", "" );
      Statement stmt = con.createStatement();

      // select * from call_center Hive table we just populated
      ResultSet rs = stmt.executeQuery( "select * from call_center" );
      System.out.println( "---------------------- Hive JDBC --------------------------" );
      while( rs.next() )
        System.out.printf( "data from hive table copy: key=%s,value=%s\n", rs.getString( 1 ), rs.getString( 2 ) );

      System.out.println( "-----------------------------------------------------------" );
      stmt.close();
      con.close();
      }
    catch( Exception e )
      {
      System.out.println( "*** CONNECTION EXCEPTION E = " + e.getMessage() );
      }

    System.out.println( "*** Process Complete." );
    }
  }
