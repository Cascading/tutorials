/*
 * Copyright (c) 2007-2014 Concurrent, Inc. All Rights Reserved.
 *
 * Project and contact information: http://www.cascading.org/
 *
 * This file is part of the Cascading project.
 */

package hivedemo;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import cascading.cascade.Cascade;
import cascading.cascade.CascadeConnector;
import cascading.flow.Flow;
import cascading.flow.FlowDef;
import cascading.flow.hadoop.HadoopFlowConnector;
import cascading.flow.hive.HiveFlow;
import cascading.operation.regex.RegexFilter;
import cascading.pipe.CoGroup;
import cascading.pipe.Each;
import cascading.pipe.HashJoin;
import cascading.pipe.Pipe;
import cascading.pipe.assembly.Discard;
import cascading.pipe.assembly.Retain;
import cascading.property.AppProps;
import cascading.scheme.hadoop.TextDelimited;
import cascading.tap.SinkMode;
import cascading.tap.Tap;
import cascading.tap.hadoop.Hfs;
import cascading.tap.hive.HiveTableDescriptor;
import cascading.tap.hive.HiveTap;
import cascading.tuple.Fields;

import static cascading.tap.SinkMode.KEEP;
import static cascading.tap.SinkMode.REPLACE;

/**
 *
 */
public class Main
  {

  // create Cascading Fields, Hive table fields, Hive column types for all applicable data sets
  public static final Fields DATE_DIM_FIELDS = new Fields( "d_date_sk", "d_date_id", "d_date", "d_month_seq", "d_week_seq", "d_quarter_seq", "d_year", "d_dow", "d_moy", "d_dom", "d_qoy", "d_fy_year", "d_fy_quarter_seq", "d_fy_week_seq", "d_day_name", "d_quarter_name", "d_holiday", "d_weekend", "d_following_holiday", "d_first_dom", "d_last_dom", "d_same_day_ly", "d_same_day_lq", "d_current_day", "d_current_week", "d_current_month", "d_current_quarter", "d_current_year", "d_trailing_field" );
  public static final String[] DATE_DIM_TABLE_FIELDS = new String[]{"d_date_sk", "d_date_id", "d_date", "d_month_seq", "d_week_seq", "d_quarter_seq", "d_year", "d_dow", "d_moy", "d_dom", "d_qoy", "d_fy_year", "d_fy_quarter_seq", "d_fy_week_seq", "d_day_name", "d_quarter_name", "d_holiday", "d_weekend", "d_following_holiday", "d_first_dom", "d_last_dom", "d_same_day_ly", "d_same_day_lq", "d_current_day", "d_current_week", "d_current_month", "d_current_quarter", "d_current_year", "d_trailing_field"};
  public static final String[] DATE_DIM_TABLE_TYPES = new String[]{"int", "string", "date", "int", "int", "int", "int", "int", "int", "int", "int", "int", "int", "int", "string", "string", "string", "string", "string", "int", "int", "int", "int", "string", "string", "string", "string", "string", "string"};

  public static final Fields CUSTOMER_DEM_FIELDS = new Fields( "cd_demo_sk", "cd_gender", "cd_marital_status", "cd_education_status", "cd_purchase_estimate", "cd_credit_rating", "cd_dep_count", "cd_dep_employed_count", "cd_dep_college_count", "trailing_field" );
  public static final String[] CUSTOMER_DEM_TABLE_FIELDS = new String[]{"cd_demo_sk", "cd_gender", "cd_marital_status", "cd_education_status", "cd_purchase_estimate", "cd_credit_rating", "cd_dep_count", "cd_dep_employed_count", "cd_dep_college_count", "trailing_field"};
  public static final String[] CUSTOMER_DEM_TABLE_TYPES = new String[]{"int", "string", "string", "string", "int", "string", "int", "int", "int", "string"};

  public static final Fields STORE_SALES_FIELDS = new Fields( "ss_sold_date_sk", "ss_sold_time_sk", "ss_item_sk", "ss_customer_sk", "ss_cdemo_sk", "ss_hdemo_sk", "ss_addr_sk", "ss_store_sk", "ss_promo_sk ", "ss_ticket_number", "ss_quantity", "ss_wholesale_cost", "ss_list_price", "ss_sales_price", "ss_ext_discount_amt", "ss_ext_sales_price", "ss_ext_wholesale_cost", "ss_ext_list_price", "ss_ext_tax", "ss_coupon_amt", "ss_net_paid", "ss_net_paid_inc_tax", "ss_net_profit", "ss_trailing_field" );
  public static final String[] STORE_SALES_TABLE_FIELDS = new String[]{"ss_sold_date_sk", "ss_sold_time_sk", "ss_item_sk", "ss_customer_sk", "ss_cdemo_sk", "ss_hdemo_sk", "ss_addr_sk", "ss_store_sk", "ss_promo_sk ", "ss_ticket_number", "ss_quantity", "ss_wholesale_cost", "ss_list_price", "ss_sales_price", "ss_ext_discount_amt", "ss_ext_sales_price", "ss_ext_wholesale_cost", "ss_ext_list_price", "ss_ext_tax", "ss_coupon_amt", "ss_net_paid", "ss_net_paid_inc_tax", "ss_net_profit", "ss_trailing_field"};
  public static final String[] STORE_SALES_TABLE_TYPES = new String[]{"int", "int", "int", "int", "int", "int", "int", "int", "int", "int", "int", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "string"};

  public static final Fields ITEM_FIELDS = new Fields( "i_item_sk", "i_item_id", "i_rec_start_date", "i_rec_end_date", "i_item_desc", "i_current_price", "i_wholesale_cost", "i_brand_id", "i_brand", "i_class_id", "i_class", "i_category_id", "i_category", "i_manufact_id", "i_manufact", "i_size", "i_formulation", "i_color", "i_units", "i_container", "i_manager_id", "i_product_name", "i_trailing_field" );

  public static final Fields STORE_FIELDS = new Fields( "s_store_sk", "s_store_id", "s_rec_start_date", "s_rec_end_date", "s_closed_date_sk", "s_store_name", "s_number_employees", "s_floor_space", "s_hours", "s_manager", "s_market_id", "s_geography_class", "s_market_desc", "s_market_manager", "s_division_id", "s_division_name", "s_company_id", "s_company_name", "s_street_number", "s_street_name", "s_street_type", "s_suite_number", "s_city", "s_county", "s_state", "s_zip", "s_country", "s_gmt_offset", "s_tax_precentage", "s_trailing_field" );
  public static final String[] STORE_TABLE_FIELDS = new String[]{"s_store_sk", "s_store_id", "s_rec_start_date", "s_rec_end_date", "s_closed_date_sk", "s_store_name", "s_number_employees", "s_floor_space", "s_hours", "s_manager", "s_market_id", "s_geography_class", "s_market_desc", "s_market_manager", "s_division_id", "s_division_name", "s_company_id", "s_company_name", "s_street_number", "s_street_name", "s_street_type", "s_suite_number", "s_city", "s_county", "s_state", "s_zip", "s_country", "s_gmt_offset", "s_tax_precentage", "s_trailing_field"};
  public static final String[] STORE_TABLE_TYPES = new String[]{"int", "string", "date", "date", "int", "string", "int", "int", "string", "string", "int", "string", "string", "string", "int", "string", "int", "string", "string", "string", "string", "string", "string", "string", "string", "string", "string", "decimal(5,2)", "decimal(5,2)", "string"};

  public static final String[] SALES_REPORT_FIELDS = new String[]{"i_item_id", "s_state", "ss_quantity", "ss_list_price", "ss_coupon_amt", "ss_sales_price"};
  public static final String[] SALES_REPORT_TYPES = new String[]{"string", "string", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)"};

  public static void main( String[] args )
    {

    Properties properties = new Properties();
    AppProps.setApplicationJarClass( properties, Main.class );
    // add ApplicationTag for Driven identification and search functionality
    AppProps.addApplicationTag( properties, "tutorials" );
    AppProps.addApplicationTag( properties, "cluster:development" );
    AppProps.setApplicationName( properties, "Cascading-Hive Part3 TPC-DS" );
    HadoopFlowConnector flowConnector = new HadoopFlowConnector( properties );

    List<Flow> queryFlows = new ArrayList<Flow>();

    // create FlowDef for date filter flow
    FlowDef dateDimFilterFlow = FlowDef.flowDef();
    // give name to FlowDef for Driven visibility
    dateDimFilterFlow.setName( "FilterDateDim (Hive Sink)" );
    // create initial Pipe
    Pipe inputFilesPipe = new Pipe( "datedim_filter" );
    // create RegexFilter to filter for all data from 2002
    RegexFilter regexFilter = new RegexFilter( "2002" );
    // create Each pipe to iterate over each record and apply regexFilter
    inputFilesPipe = new Each( inputFilesPipe, new Fields( "d_year" ), regexFilter );
    // add source and pipe to dateDimFilterFlow
    dateDimFilterFlow.addSource( inputFilesPipe, new Hfs( new TextDelimited( DATE_DIM_FIELDS, "|" ), "/tpcds/data/date_dim.dat" ) );

    // create HiveTableDescriptor for date_dim data
    HiveTableDescriptor dateDimSinkTableDescriptor = new HiveTableDescriptor( "filtered_date_dim", DATE_DIM_TABLE_FIELDS, DATE_DIM_TABLE_TYPES );
    // create HiveTap as sink
    HiveTap dateDimSinkTap = new HiveTap( dateDimSinkTableDescriptor, dateDimSinkTableDescriptor.toScheme(), REPLACE, true );
    // add tail sink to dateDimFilterFlow
    dateDimFilterFlow.addTailSink( inputFilesPipe, dateDimSinkTap );

    // add dateDimFilterFlow to queryFlows ArrayList for later use
    queryFlows.add( flowConnector.connect( dateDimFilterFlow ) );


    // create new FlowDef for customer demographics flow
    FlowDef customerDemographicsFilterFlow = FlowDef.flowDef();
    // give name to FlowDef for Driven visibility
    customerDemographicsFilterFlow.setName( "FilterDemographics (Hive Sink)" );
    // create basic initial pipe
    Pipe custDemographicsFilter = new Pipe( "customer_demographics_filter" );
    // add regex filter for all "Males"
    RegexFilter genderFilter = new RegexFilter( "M" );
    // create Each pipe to iterate over each record and apply regexFilter
    custDemographicsFilter = new Each( custDemographicsFilter, new Fields( "cd_gender" ), genderFilter );
    // add regex filter for all "Singles"
    RegexFilter maritalStatusFilter = new RegexFilter( "S" );
    // create Each pipe to iterate over each record and apply regexFilter
    custDemographicsFilter = new Each( custDemographicsFilter, new Fields( "cd_marital_status" ), maritalStatusFilter );
    // add regex filter for all "College" graduates
    RegexFilter educationFilter = new RegexFilter( "College" );
    // create Each pipe to iterate over each record and apply regexFilter
    custDemographicsFilter = new Each( custDemographicsFilter, new Fields( "cd_education_status" ), educationFilter );
    // add source and pipe to customerDemographicsFilterFlow
    customerDemographicsFilterFlow.addSource( custDemographicsFilter, new Hfs( new TextDelimited( CUSTOMER_DEM_FIELDS, "|" ), "/tpcds/data/customer_demographics.dat" ) );

    // create HiveTableDescriptor for customer_demopgraphics data
    HiveTableDescriptor customerDemographicsFilterSinkTableDescriptor = new HiveTableDescriptor( "filtered_customer_demographics", CUSTOMER_DEM_TABLE_FIELDS, CUSTOMER_DEM_TABLE_TYPES );
    // create HiveTap as sink
    HiveTap customerDemographicsFilterSinkTap = new HiveTap( customerDemographicsFilterSinkTableDescriptor, customerDemographicsFilterSinkTableDescriptor.toScheme(), REPLACE, true );
    // add tail sink to customerDemographicsFilterFlow
    customerDemographicsFilterFlow.addTailSink( custDemographicsFilter, customerDemographicsFilterSinkTap );

    // add customerDemographicsFilterFlow to queryFlows ArrayList for later use
    queryFlows.add( flowConnector.connect( customerDemographicsFilterFlow ) );

    // create new FlowDef for storeFilterFlow - apply pipe/regex/source/sink as before
    FlowDef storeFilterFlow = FlowDef.flowDef();
    storeFilterFlow.setName( "FilterStore (Hive Sink)" );
    Pipe stateFilter = new Pipe( "store_filter" );
    RegexFilter storeStateFilter = new RegexFilter( "(TN|SD)" );
    stateFilter = new Each( stateFilter, new Fields( "s_state" ), storeStateFilter );
    storeFilterFlow.addSource( stateFilter, new Hfs( new TextDelimited( STORE_FIELDS, "|" ), "/tpcds/data/store.dat" ) );
    HiveTableDescriptor storeStateSinkTableDescriptor = new HiveTableDescriptor( "filtered_store", STORE_TABLE_FIELDS, STORE_TABLE_TYPES );
    HiveTap storeStateSinkTap = new HiveTap( storeStateSinkTableDescriptor, storeStateSinkTableDescriptor.toScheme(), REPLACE, true );
    storeFilterFlow.addTailSink( stateFilter, storeStateSinkTap );
    // add customerDemographicsFilterFlow to queryFlows ArrayList for later use
    queryFlows.add( flowConnector.connect( storeFilterFlow ) );

    Map<String, Tap> sources = new HashMap<String, Tap>();
    Map<String, Tap> sinks = new HashMap<String, Tap>();
    // create Hive table for sales<>item join results
    HiveTableDescriptor storeSaleItemSinkTableDescriptor = new HiveTableDescriptor( "StoreSalesItemJoin", STORE_SALES_TABLE_FIELDS, STORE_SALES_TABLE_TYPES );
    HiveTap storeSaleItemSink = new HiveTap( storeSaleItemSinkTableDescriptor, storeSaleItemSinkTableDescriptor.toScheme(), REPLACE, true );
    sinks.put( "StoreSalesItemJoin", storeSaleItemSink );

    // everything joins against store_sales so put that in first.
    Tap storeSales = new Hfs( new TextDelimited( STORE_SALES_FIELDS, "|" ), "/tpcds/data/store_sales.dat" );
    sources.put( "StoreSales", storeSales );
    Pipe storeSalesPipe = new Pipe( "StoreSales" );

    // JOIN item on (store_sales.ss_item_sk = item.i_item_sk)
    Tap item = new Hfs( new TextDelimited( ITEM_FIELDS, "|" ), "/tpcds/data/item.dat" );
    sources.put( "Item", item );
    Pipe itemPipe = new Pipe( "Item" );
    Pipe storeSalesItemJoin = new HashJoin( "StoreSalesItemJoin", storeSalesPipe, new Fields( "ss_item_sk" ), itemPipe, new Fields( "i_item_sk" ) );

    //JOIN date_dim on (store_sales.ss_sold_date_sk = date_dim.d_date_sk)
    HiveTableDescriptor dateDimTableDescriptor = new HiveTableDescriptor( "filtered_date_dim", DATE_DIM_TABLE_FIELDS, DATE_DIM_TABLE_TYPES );
    HiveTap dateDimFiltered = new HiveTap( dateDimTableDescriptor, dateDimTableDescriptor.toScheme(), KEEP, true );
    sources.put( "DateDimFiltered", dateDimFiltered );
    Pipe dateDimFilteredPipe = new Pipe( "DateDimFiltered" );
    HiveTableDescriptor storeSaleDateDimSinkTableDescriptor = new HiveTableDescriptor( "StoreSaleDateDimJoin", STORE_SALES_TABLE_FIELDS, STORE_SALES_TABLE_TYPES );
    HiveTap storeSaleDateDimSink = new HiveTap( storeSaleDateDimSinkTableDescriptor, storeSaleDateDimSinkTableDescriptor.toScheme(), REPLACE, true );
    sinks.put( "StoreSaleDateDimJoin", storeSaleDateDimSink );
    Pipe storeSalesDateDimJoin = new HashJoin( "StoreSaleDateDimJoin", storeSalesItemJoin, new Fields( "ss_sold_date_sk" ), dateDimFilteredPipe, new Fields( "d_date_sk" ) );

    //* JOIN store on (store_sales.ss_store_sk = store.s_store_sk)
    HiveTap storeFiltered = new HiveTap( storeStateSinkTableDescriptor, storeStateSinkTableDescriptor.toScheme(), KEEP, true );
    sources.put( "StoreFiltered", storeFiltered );
    Pipe storeFilteredPipe = new Pipe( "StoreFiltered" );
    HiveTableDescriptor StoreSalesStoreJoinSinkTableDescriptor = new HiveTableDescriptor( "StoreSalesStoreJoin", STORE_SALES_TABLE_FIELDS, STORE_SALES_TABLE_TYPES );
    HiveTap storeSalesStoreSink = new HiveTap( StoreSalesStoreJoinSinkTableDescriptor, StoreSalesStoreJoinSinkTableDescriptor.toScheme(), REPLACE, true ); //getOutputTap( "StoreSalesStoreJoin", Fields.ALL );
    sinks.put( "StoreSalesStoreJoin", storeSalesStoreSink );
    Pipe storeSalesStoreJoin = new HashJoin( "StoreSalesStoreJoin", storeFilteredPipe, new Fields( "s_store_sk" ), storeSalesDateDimJoin, new Fields( "ss_store_sk" ) );

    // JOIN customer_demographics on (store_sales.ss_cdemo_sk = customer_demographics.cd_demo_sk)
    HiveTap customerDemographicsFiltered = new HiveTap( customerDemographicsFilterSinkTableDescriptor, customerDemographicsFilterSinkTableDescriptor.toScheme(), KEEP, true );
    sources.put( "CustomerDemographicsFiltered", customerDemographicsFiltered );
    Pipe customerDemographicsFilteredPipe = new Pipe( "CustomerDemographicsFiltered" );
    Tap storeSaleCustDemSink = getOutputTap( "StoreSalesCustomerDemographicsJoin", Fields.ALL );
    sinks.put( "StoreSalesCustomerDemographicsJoin", storeSaleCustDemSink );
    Pipe storeSalesCustomerDemographicsJoin = new HashJoin( "StoreSalesCustomerDemographicsJoin", storeSalesStoreJoin, new Fields( "ss_cdemo_sk" ), customerDemographicsFilteredPipe, new Fields( "cd_demo_sk" ) );

    // wire all the join flows together
    queryFlows.add( flowConnector.connect( "JoinStoreSales (Hive Sources)", sources, sinks, storeSalesItemJoin, storeSalesDateDimJoin, storeSalesCustomerDemographicsJoin, storeSalesStoreJoin ) );


     /*
    * Strip out extraneous fields now
     */
    Fields finalFields = new Fields( new Comparable[]{"i_item_id", "s_state", "ss_quantity", "ss_list_price", "ss_coupon_amt", "ss_sales_price"}, new Type[]{String.class, String.class, Double.class, Double.class, Double.class, Double.class} );
    FlowDef fieldRemovingFlowDef = FlowDef.flowDef();
    fieldRemovingFlowDef.setName( "RemoveExtraFields" );
    Pipe allFieldsPipe = new Pipe( "AllFields" );
    Pipe fieldRemovingPipe = new Retain( allFieldsPipe, finalFields );
    fieldRemovingFlowDef.addSource( fieldRemovingPipe, storeSaleCustDemSink );
    HiveTableDescriptor redactedFieldsTapTableDescriptor = new HiveTableDescriptor( "AllFields", SALES_REPORT_FIELDS, SALES_REPORT_TYPES );
    HiveTap redactedFieldsTap = new HiveTap( redactedFieldsTapTableDescriptor, redactedFieldsTapTableDescriptor.toScheme(), REPLACE, true );
    fieldRemovingFlowDef.addTailSink( fieldRemovingPipe, redactedFieldsTap );
    queryFlows.add( flowConnector.connect( fieldRemovingFlowDef ) );

    Fields groupingFields = new Fields( "i_item_id", "s_state" );

    // average quantity Hive query
    String queryAvgQuantity = "SELECT i_item_id, AVG(ss_quantity), s_state FROM AllFields GROUP BY i_item_id, s_state";
    String queriesAvgQuantity[] = {queryAvgQuantity};
    // Hive table for average quantity results
    HiveTableDescriptor avgQuantityTableDescriptor = new HiveTableDescriptor( "QuantityAverage", new String[]{"i_item_id", "ss_quantity", "s_state"}, new String[]{"string", "int", "string"} );
    HiveTap quantityAverageTap = new HiveTap( avgQuantityTableDescriptor, avgQuantityTableDescriptor.toScheme(), REPLACE, true );
    // quantity average Hive flow
    HiveFlow avgQuantityHiveFlow = new HiveFlow( "Hive Flow - CalculateAverageQuantity", queriesAvgQuantity, Arrays.<Tap>asList( redactedFieldsTap ), quantityAverageTap );
    // add avgQuantityHiveFlow to queryFlows ArrayList for later use
    queryFlows.add( avgQuantityHiveFlow );

    // average price Hive query
    String queryAvgListPrice = "SELECT i_item_id, AVG(ss_list_price), s_state FROM AllFields GROUP BY i_item_id, s_state";
    String queriesAvgPrice[] = {queryAvgListPrice};
    // Hive table for average price results
    HiveTableDescriptor avgPriceTableDescriptor = new HiveTableDescriptor( "ListPriceAverage", new String[]{"i_item_id", "ss_price", "s_state"}, new String[]{"string", "int", "string"} );
    HiveTap listPipeAverageTap = new HiveTap( avgPriceTableDescriptor, avgPriceTableDescriptor.toScheme(), REPLACE, true );
    // average price Hive flow
    HiveFlow avgPriceHiveFlow = new HiveFlow( "Hive Flow - CalculateAverageListPrice", queriesAvgPrice, Arrays.<Tap>asList( redactedFieldsTap ), listPipeAverageTap );
    // add avgPriceHiveFlow to queryFlows ArrayList for later use
    queryFlows.add( avgPriceHiveFlow );

    // average coupn amount Hive query
    String queryAvgCouponAmt = "SELECT i_item_id, AVG(ss_coupon_amt), s_state FROM AllFields GROUP BY i_item_id, s_state";
    String queriesAvgCoupon[] = {queryAvgCouponAmt};
    // Hive table for average coupon amount results
    HiveTableDescriptor avgCouponTableDescriptor = new HiveTableDescriptor( "CouponAmountAverage", new String[]{"i_item_id", "ss_coupon_amt", "s_state"}, new String[]{"string", "int", "string"} );
    HiveTap couponAmountAverageTap = new HiveTap( avgCouponTableDescriptor, avgCouponTableDescriptor.toScheme(), REPLACE, true );
    // average coupon amount Hive flow
    HiveFlow avgCouponAmtHiveFlow = new HiveFlow( "Hive Flow - CalculateAverageCouponAmt", queriesAvgCoupon, Arrays.<Tap>asList( redactedFieldsTap ), couponAmountAverageTap );
    queryFlows.add( avgCouponAmtHiveFlow );

    // average sales price Hive query
    String queryAvgSalesPrice = "SELECT i_item_id, AVG(ss_sales_price), s_state FROM AllFields GROUP BY i_item_id, s_state";
    String queriesAvgSalesPrice[] = {queryAvgSalesPrice};
    // Hive table for average sales price results
    HiveTableDescriptor avgSalesPriceTableDescriptor = new HiveTableDescriptor( "SalePriceAverage", new String[]{"i_item_id", "ss_sales_price", "s_state"}, new String[]{"string", "int", "string"} );
    HiveTap salePriceAverageTap = new HiveTap( avgSalesPriceTableDescriptor, avgSalesPriceTableDescriptor.toScheme(), REPLACE, true );
    // average sales price Hive flow
    HiveFlow avgListPriceHiveFlow = new HiveFlow( "Hive Flow - CalculateAverageSalePrice", queriesAvgCoupon, Arrays.<Tap>asList( redactedFieldsTap ), salePriceAverageTap );
    queryFlows.add( avgListPriceHiveFlow );

    /*
    * Join the averages together
     */
    Map<String, Tap> reportSources = new HashMap<String, Tap>();
    Map<String, Tap> reportSinks = new HashMap<String, Tap>();

    reportSources.put( "QuantityAveragePipe", quantityAverageTap );
    Pipe quantityAveragePipe = new Pipe( "QuantityAveragePipe" );
    reportSources.put( "ListPriceAverage", listPipeAverageTap );
    Pipe listPriceAveragePipe = new Pipe( "ListPriceAverage" );
    reportSources.put( "CouponAmountAverage", couponAmountAverageTap );
    Pipe couponAmountAveragePipe = new Pipe( "CouponAmountAverage" );
    reportSources.put( "SalePriceAverage", salePriceAverageTap );
    Pipe salePriceAveragePipe = new Pipe( "SalePriceAverage" );

    Fields junkFields = new Fields( "i_item_id_junk", "s_state_junk" );

    // cogroup quantityAveragePipe & listPriceAveragePipe on "i_item_id" and "s_state"
    Pipe salesReportPipe = new CoGroup( "SalesReportQL", quantityAveragePipe, groupingFields, listPriceAveragePipe, groupingFields, new Fields( "i_item_id", "s_state", "ss_quantity", "i_item_id_junk", "s_state_junk", "ss_list_price" ) );
    // strip unnecessary fields from salesReportPipe
    salesReportPipe = new Discard( salesReportPipe, junkFields );
    // cogroup salesReportPipe & couponAmountAveragePipe on "i_item_id" and "s_state"
    salesReportPipe = new CoGroup( "SalesReportQLC", salesReportPipe, groupingFields, couponAmountAveragePipe, groupingFields, new Fields( "i_item_id", "s_state", "ss_quantity", "ss_list_price", "i_item_id_junk", "s_state_junk", "ss_coupon_amt" ) );
    // strip unnecessary fields from salesReportPipe
    salesReportPipe = new Discard( salesReportPipe, junkFields );
    // cogroup salesReportPipe & salePriceAveragePipe on "i_item_id" and "s_state"
    salesReportPipe = new CoGroup( "SalesReport", salesReportPipe, groupingFields, salePriceAveragePipe, groupingFields, new Fields( "i_item_id", "s_state", "ss_quantity", "ss_list_price", "ss_coupon_amt", "i_item_id_junk", "s_state_junk", "ss_sales_price" ) );
    // strip unnecessary fields from salesReportPipe
    salesReportPipe = new Discard( salesReportPipe, junkFields );
    // create report output Hfs sinks
    reportSinks.put( "SalesReportQL", getOutputTap( "SalesReportQL", Fields.ALL ) );
    reportSinks.put( "SalesReportQLC", getOutputTap( "SalesReportQLC", Fields.ALL ) );

    // create SalesReport Hive table and add as sink
    HiveTableDescriptor allReportTableDescriptor = new HiveTableDescriptor( "SalesReport", SALES_REPORT_FIELDS, SALES_REPORT_TYPES );
    HiveTap allReportTap = new HiveTap( allReportTableDescriptor, allReportTableDescriptor.toScheme(), REPLACE, true );
    sinks.put( "SalesReport", allReportTap );
    reportSinks.put( "SalesReport", allReportTap );
    queryFlows.add( flowConnector.connect( "GenerateReport (Hive Sources)", reportSources, reportSinks, salesReportPipe ) );

    // finalReport Hive query
    String query1 = "Select * FROM SalesReport GROUP BY i_item_id, s_state LIMIT 100";
    String queries[] = {query1};
    // finalReport Hive table
    HiveTableDescriptor finalReportTableDescriptor = new HiveTableDescriptor( "FinalReport", SALES_REPORT_FIELDS, SALES_REPORT_TYPES );
    // finalReport HiveTap
    HiveTap finalReportTap = new HiveTap( finalReportTableDescriptor, finalReportTableDescriptor.toScheme(), REPLACE, true );
    // finalReport HiveFlow
    HiveFlow finalHiveFlow = new HiveFlow( "Hive Flow - Format Report", queries, Arrays.<Tap>asList( allReportTap ), finalReportTap );
    queryFlows.add( finalHiveFlow );

    // create, connect (all flows from queryFlows) and complete cascade
    CascadeConnector connector = new CascadeConnector();
    Cascade cascade = connector.connect( queryFlows.toArray( new Flow[ 0 ] ) );
    cascade.complete();

    }

  // generate standard Hfs tap
  protected static Tap getOutputTap( String tapName, Fields fields )
    {
    return new Hfs( new TextDelimited( fields ), "/tpcds/taps/" + tapName, SinkMode.REPLACE );
    }
  }
