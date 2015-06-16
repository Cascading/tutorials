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

import java.util.Arrays;
import java.util.Properties;

import cascading.cascade.Cascade;
import cascading.cascade.CascadeConnector;
import cascading.flow.Flow;
//import cascading.flow.hadoop.HadoopFlowConnector;
import cascading.flow.hadoop2.Hadoop2MR1FlowConnector;
import cascading.flow.process.ProcessFlow;
import cascading.flow.hive.HiveFlow;
import cascading.pipe.Pipe;
import cascading.pipe.assembly.Discard;
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
  // create Cascading Fields for catalog sales data
  public static final Fields CATALOG_SALES_FIELDS = new Fields( "cs_sold_date_sk", "cs_sold_time_sk", "cs_ship_date_sk", "cs_bill_customer_sk", "cs_bill_cdemo_sk", "cs_bill_hdemo_sk", "cs_bill_addr_sk", "cs_ship_customer_sk", "cs_ship_cdemo_sk", "cs_ship_hdemo_sk", "cs_ship_addr_sk", "cs_call_center_sk", "cs_catalog_page_sk", "cs_ship_mode_sk", "cs_warehouse_sk", "cs_item_sk", "cs_promo_sk", "cs_order_number", "cs_quantity", "cs_wholesale_cost", "cs_list_price", "cs_sales_price", "cs_ext_discount_amt", "cs_ext_sales_price", "cs_ext_wholesale_cost", "cs_ext_list_price", "cs_ext_tax", "cs_coupon_amt", "cs_ext_ship_cost", "cs_net_paid", "cs_net_paid_inc_tax", "cs_net_paid_inc_ship", "cs_net_paid_inc_ship_tax", "cs_net_profit", "trailing_field" );
  // create Hive table fields for catalog sales data
  public static final String[] CATALOG_SALES_TABLE_FIELDS = new String[]{"cs_sold_date_sk", "cs_sold_time_sk", "cs_ship_date_sk", "cs_bill_customer_sk", "cs_bill_cdemo_sk", "cs_bill_hdemo_sk", "cs_bill_addr_sk", "cs_ship_customer_sk", "cs_ship_cdemo_sk", "cs_ship_hdemo_sk", "cs_ship_addr_sk", "cs_call_center_sk", "cs_catalog_page_sk", "cs_ship_mode_sk", "cs_warehouse_sk", "cs_item_sk", "cs_promo_sk", "cs_order_number", "cs_quantity", "cs_wholesale_cost", "cs_list_price", "cs_sales_price", "cs_ext_discount_amt", "cs_ext_sales_price", "cs_ext_wholesale_cost", "cs_ext_list_price", "cs_ext_tax", "cs_coupon_amt", "cs_ext_ship_cost", "cs_net_paid", "cs_net_paid_inc_tax", "cs_net_paid_inc_ship", "cs_net_paid_inc_ship_tax", "cs_net_profit"};
  // create Hive column types for catalog sales data
  public static final String[] CATALOG_SALES_TABLE_TYPES = new String[]{"int", "int", "int", "int", "int", "int", "int", "int", "int", "int", "int", "int", "int", "int", "int", "int", "int", "int", "int", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)"};

  // same as above for catalog returns data
  public static final Fields CATALOG_RETURNS_FIELDS = new Fields( "cr_returned_date_sk", "cr_returned_time_sk", "cr_item_sk", "cr_refunded_customer_sk", "cr_refunded_cdemo_sk", "cr_refunded_hdemo_sk", "cr_refunded_addr_sk", "cr_returning_customer_sk", "cr_returning_cdemo_sk", "cr_returning_hdemo_sk", "cr_returning_addr_sk", "cr_call_center_sk", "cr_catalog_page_sk", "cr_ship_mode_sk", "cr_warehouse_sk", "cr_reason_sk", "cr_order_number", "cr_return_quantity", "cr_return_amount", "cr_return_tax", "cr_return_amt_inc_tax", "cr_fee", "cr_return_ship_cost", "cr_refunded_cash", "cr_reversed_charge", "cr_store_credit", "cr_net_loss", "trailing_field" );
  public static final String[] CATALOG_RETURN_TABLE_FIELDS = new String[]{"cr_returned_date_sk", "cr_returned_time_sk", "cr_item_sk", "cr_refunded_customer_sk", "cr_refunded_cdemo_sk", "cr_refunded_hdemo_sk", "cr_refunded_addr_sk", "cr_returning_customer_sk", "cr_returning_cdemo_sk", "cr_returning_hdemo_sk", "cr_returning_addr_sk", "cr_call_center_sk", "cr_catalog_page_sk", "cr_ship_mode_sk", "cr_warehouse_sk", "cr_reason_sk", "cr_order_number", "cr_return_quantity", "cr_return_amount", "cr_return_tax", "cr_return_amt_inc_tax", "cr_fee", "cr_return_ship_cost", "cr_refunded_cash", "cr_reversed_charge", "cr_store_credit", "cr_net_loss"};
  public static final String[] CATALOG_RETURNS_TABLE_TYPES = new String[]{"int", "int", "int", "int", "int", "int", "int", "int", "int", "int", "int", "int", "int", "int", "int", "int", "int", "int", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)"};

  public static void main( String[] args ) throws Exception
    {

    Properties properties = new Properties();
    AppProps.setApplicationJarClass( properties, Main.class );

    // add ApplicationTag for Driven identification and search functionality
    AppProps.addApplicationTag( properties, "tutorials" );
    AppProps.addApplicationTag( properties, "cluster:development" );
    AppProps.setApplicationName( properties, "Cascading-Hive Part2 Hive Flow" );

    Hadoop2MR1FlowConnector flowConnector = new Hadoop2MR1FlowConnector( properties );

    // create source Hfs taps for catalog_sales, catalog_returns data
    Tap salesHdfsTap = new Hfs( new TextDelimited( CATALOG_SALES_FIELDS, "|" ), "/tpcds/data/catalog_sales.dat" );
    Tap returnsHdfsTap = new Hfs( new TextDelimited( CATALOG_RETURNS_FIELDS, "|" ), "/tpcds/data/catalog_returns.dat" );


    // create HiveTableDescriptors for catalog_sales, catalog_returns Hive tables
    HiveTableDescriptor salesSinkTableDescriptor = new HiveTableDescriptor( "sales_catalog", CATALOG_SALES_TABLE_FIELDS, CATALOG_SALES_TABLE_TYPES );
    HiveTableDescriptor returnsSinkTableDescriptor = new HiveTableDescriptor( "returns_catalog", CATALOG_RETURN_TABLE_FIELDS, CATALOG_RETURNS_TABLE_TYPES );

    // create HiveTaps for catalog_sales, catalog_returns Hive tables (these tables will be created automatically if they do not already exist)
    HiveTap salesTap = new HiveTap( salesSinkTableDescriptor, salesSinkTableDescriptor.toScheme(), REPLACE, true );
    HiveTap returnsTap = new HiveTap( returnsSinkTableDescriptor, returnsSinkTableDescriptor.toScheme(), REPLACE, true );

    // create simple Pipes for copying data from Hfs to Hive
    Pipe salesCopyPipe = new Pipe( "salesCopyPipe" );
    Pipe returnsCopyPipe = new Pipe( "returnsCopyPipe" );

    // add Discard subassembly to each pipe to discard trailing field off each row in data files
    salesCopyPipe = new Discard( salesCopyPipe, new Fields( "trailing_field" ) );
    returnsCopyPipe = new Discard( returnsCopyPipe, new Fields( "trailing_field" ) );

    // create flows for each file -> table copy
    Flow flow1 = flowConnector.connect( "Create Hive Table - Sales", salesHdfsTap, salesTap, salesCopyPipe );
    Flow flow2 = flowConnector.connect( "Create Hive Table - Returns", returnsHdfsTap, returnsTap, returnsCopyPipe );

    // create Hive query for sales_catalog tables
    String salesQuery = "SELECT cs_item_sk, COUNT(cs_item_sk) AS quantity_sold " +
      "FROM sales_catalog " +
      "GROUP BY cs_item_sk ORDER BY quantity_sold DESC LIMIT 20";

    // add salesQuery to array for use in HiveFlow
    String queriesSales[] = {salesQuery};

    // create HiveTableDescriptor for salesQuery results
    HiveTableDescriptor topSalesTableDescriptor = new HiveTableDescriptor( "Top_20_Sales", new String[]{"cs_item_sk", "quantity_sold"}, new String[]{"string", "int"} );

    // create HiveTap as sink for salesQuery results
    HiveTap topSalesTap = new HiveTap( topSalesTableDescriptor, topSalesTableDescriptor.toScheme(), REPLACE, true );

    // create HiveFlow using salesQuery, salesTap (HiveTap) i as sources, topSalesTap (HiveTap) as sink
    HiveFlow topSalesByCategoryHiveFlow = new HiveFlow( "Hive Flow - TopSalesByCategory", queriesSales, Arrays.<Tap>asList( salesTap ), topSalesTap );

    // create Hive query for returns_catalog tables
    String returnsQuery = "SELECT cr_item_sk, COUNT(cr_item_sk) AS quantity_returned " +
      "FROM returns_catalog " +
      "GROUP BY cr_item_sk ORDER BY quantity_returned DESC LIMIT 20";

    // add returnsQuery to array for use in HiveFlow
    String queriesReturns[] = {returnsQuery};

    // create HiveTableDescriprtor for returnsQuery results
    HiveTableDescriptor topReturnsTableDescriptor = new HiveTableDescriptor( "Top_20_Returns", new String[]{"cr_item_sk", "quantity_returned"}, new String[]{"string", "int"} );

    // create HiveTap as sink for returnsQuery results
    HiveTap topReturnsTap = new HiveTap( topReturnsTableDescriptor, topReturnsTableDescriptor.toScheme(), REPLACE, true );

    // create HiveFlow using returnsQuery, returnsTap (HiveTap) as sources, topReturnsTap (HiveTap) as sink
    HiveFlow topReturnsByCategoryHiveFlow = new HiveFlow( "Hive Flow - TopReturnsByCategory", queriesReturns, Arrays.<Tap>asList( returnsTap ), topReturnsTap );

    // create, connect and complete cascade including HiveFlows
    CascadeConnector connector = new CascadeConnector();
    Cascade cascade = connector.connect( flow1, flow2, topSalesByCategoryHiveFlow, topReturnsByCategoryHiveFlow );
    cascade.complete();

    System.out.println( "*** PROCESS COMPLETE *** " );
    }
  }
