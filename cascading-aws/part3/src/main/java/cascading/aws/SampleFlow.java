package cascading.aws;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import cascading.cascade.Cascade;
import cascading.cascade.CascadeConnector;
import cascading.flow.Flow;
import cascading.flow.FlowDef;
import cascading.flow.hadoop.HadoopFlowConnector;
import cascading.jdbc.AWSCredentials;
import cascading.jdbc.RedshiftScheme;
import cascading.jdbc.RedshiftTableDesc;
import cascading.jdbc.RedshiftTap;
import cascading.operation.regex.RegexFilter;
import cascading.pipe.Each;
import cascading.pipe.HashJoin;
import cascading.pipe.Pipe;
import cascading.pipe.assembly.AverageBy;
import cascading.pipe.assembly.Retain;
import cascading.property.AppProps;
import cascading.scheme.hadoop.TextDelimited;
import cascading.tap.SinkMode;
import cascading.tap.Tap;
import cascading.tap.hadoop.Hfs;
import cascading.tuple.Fields;

public class SampleFlow
  {

  // create Cascading Fields, Redshift table fields, Redshift column types for all applicable data sets
  public static final Fields DATE_DIM_FIELDS = new Fields( "d_date_sk", "d_date_id", "d_date", "d_month_seq", "d_week_seq", "d_quarter_seq", "d_year", "d_dow", "d_moy", "d_dom", "d_qoy", "d_fy_year", "d_fy_quarter_seq", "d_fy_week_seq", "d_day_name", "d_quarter_name", "d_holiday", "d_weekend", "d_following_holiday", "d_first_dom", "d_last_dom", "d_same_day_ly", "d_same_day_lq", "d_current_day", "d_current_week", "d_current_month", "d_current_quarter", "d_current_year", "d_trailing_field" );
  public static final String[] DATE_DIM_TABLE_FIELDS = new String[]{"d_date_sk", "d_date_id", "d_date", "d_month_seq", "d_week_seq", "d_quarter_seq", "d_year", "d_dow", "d_moy", "d_dom", "d_qoy", "d_fy_year", "d_fy_quarter_seq", "d_fy_week_seq", "d_day_name", "d_quarter_name", "d_holiday", "d_weekend", "d_following_holiday", "d_first_dom", "d_last_dom", "d_same_day_ly", "d_same_day_lq", "d_current_day", "d_current_week", "d_current_month", "d_current_quarter", "d_current_year", "d_trailing_field"};
  public static final String[] DATE_DIM_TABLE_TYPES = new String[]{"int", "varchar(100)", "date", "int", "int", "int", "int", "int", "int", "int", "int", "int", "int", "int", "varchar(100)", "varchar(100)", "varchar(100)", "varchar(100)", "varchar(100)", "int", "int", "int", "int", "varchar(100)", "varchar(100)", "varchar(100)", "varchar(100)", "varchar(100)", "varchar(100)"};

  public static final Fields CUSTOMER_DEM_FIELDS = new Fields( "cd_demo_sk", "cd_gender", "cd_marital_status", "cd_education_status", "cd_purchase_estimate", "cd_credit_rating", "cd_dep_count", "cd_dep_employed_count", "cd_dep_college_count", "trailing_field" );
  public static final String[] CUSTOMER_DEM_TABLE_FIELDS = new String[]{"cd_demo_sk", "cd_gender", "cd_marital_status", "cd_education_status", "cd_purchase_estimate", "cd_credit_rating", "cd_dep_count", "cd_dep_employed_count", "cd_dep_college_count", "trailing_field"};
  public static final String[] CUSTOMER_DEM_TABLE_TYPES = new String[]{"int", "varchar(100)", "varchar(100)", "varchar(100)", "int", "varchar(100)", "int", "int", "int", "varchar(100)"};

  public static final Fields STORE_SALES_FIELDS = new Fields( "ss_sold_date_sk", "ss_sold_time_sk", "ss_item_sk", "ss_customer_sk", "ss_cdemo_sk", "ss_hdemo_sk", "ss_addr_sk", "ss_store_sk", "ss_promo_sk ", "ss_ticket_number", "ss_quantity", "ss_wholesale_cost", "ss_list_price", "ss_sales_price", "ss_ext_discount_amt", "ss_ext_sales_price", "ss_ext_wholesale_cost", "ss_ext_list_price", "ss_ext_tax", "ss_coupon_amt", "ss_net_paid", "ss_net_paid_inc_tax", "ss_net_profit", "ss_trailing_field" );
  public static final String[] STORE_SALES_TABLE_FIELDS = new String[]{"ss_sold_date_sk", "ss_sold_time_sk", "ss_item_sk", "ss_customer_sk", "ss_cdemo_sk", "ss_hdemo_sk", "ss_addr_sk", "ss_store_sk", "ss_promo_sk ", "ss_ticket_number", "ss_quantity", "ss_wholesale_cost", "ss_list_price", "ss_sales_price", "ss_ext_discount_amt", "ss_ext_sales_price", "ss_ext_wholesale_cost", "ss_ext_list_price", "ss_ext_tax", "ss_coupon_amt", "ss_net_paid", "ss_net_paid_inc_tax", "ss_net_profit", "ss_trailing_field"};
  public static final String[] STORE_SALES_TABLE_TYPES = new String[]{"int", "int", "int", "int", "int", "int", "int", "int", "int", "int", "int", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "varchar(100)"};

  public static final Fields ITEM_FIELDS = new Fields( "i_item_sk", "i_item_id", "i_rec_start_date", "i_rec_end_date", "i_item_desc", "i_current_price", "i_wholesale_cost", "i_brand_id", "i_brand", "i_class_id", "i_class", "i_category_id", "i_category", "i_manufact_id", "i_manufact", "i_size", "i_formulation", "i_color", "i_units", "i_container", "i_manager_id", "i_product_name", "i_trailing_field" );

  public static final Fields STORE_FIELDS = new Fields( "s_store_sk", "s_store_id", "s_rec_start_date", "s_rec_end_date", "s_closed_date_sk", "s_store_name", "s_number_employees", "s_floor_space", "s_hours", "s_manager", "s_market_id", "s_geography_class", "s_market_desc", "s_market_manager", "s_division_id", "s_division_name", "s_company_id", "s_company_name", "s_street_number", "s_street_name", "s_street_type", "s_suite_number", "s_city", "s_county", "s_state", "s_zip", "s_country", "s_gmt_offset", "s_tax_precentage", "s_trailing_field" );
  public static final String[] STORE_TABLE_FIELDS = new String[]{"s_store_sk", "s_store_id", "s_rec_start_date", "s_rec_end_date", "s_closed_date_sk", "s_store_name", "s_number_employees", "s_floor_space", "s_hours", "s_manager", "s_market_id", "s_geography_class", "s_market_desc", "s_market_manager", "s_division_id", "s_division_name", "s_company_id", "s_company_name", "s_street_number", "s_street_name", "s_street_type", "s_suite_number", "s_city", "s_county", "s_state", "s_zip", "s_country", "s_gmt_offset", "s_tax_precentage", "s_trailing_field"};
  public static final String[] STORE_TABLE_TYPES = new String[]{"int", "varchar(100)", "date", "date", "int", "varchar(100)", "int", "int", "varchar(100)", "varchar(100)", "int", "varchar(100)", "varchar(100)", "varchar(100)", "int", "varchar(100)", "int", "varchar(100)", "varchar(100)", "varchar(100)", "varchar(100)", "varchar(100)", "varchar(100)", "varchar(100)", "varchar(100)", "varchar(100)", "varchar(100)", "decimal(5,2)", "decimal(5,2)", "varchar(100)"};

  public static final Fields SALES_REPORT_FIELDS = new Fields( "i_item_id", "s_state", "ss_quantity", "ss_list_price", "ss_coupon_amt", "ss_sales_price" );
  public static final String[] SALES_REPORT_TABLE_FIELDS = new String[]{"i_item_id", "s_state", "ss_quantity", "ss_list_price", "ss_coupon_amt", "ss_sales_price"};
  public static final String[] SALES_REPORT_TABLE_TYPES = new String[]{"varchar(100)", "varchar(100)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)", "decimal(7,2)"};

  public static void main( String[] args )
    {
    String redshiftJdbcUrl = args[ 0 ];
    String redshiftUsername = args[ 1 ];
    String redshiftPassword = args[ 2 ];
    String accessKey = args[ 3 ];
    String secretKey = args[ 4 ];
    String bucket = args[ 5 ];

    String S3_PATH_ROOT = "s3n://" + bucket + "/tmp";

    AWSCredentials awsCredentials = new AWSCredentials( accessKey, secretKey );

    Properties properties = new Properties();
    AppProps.setApplicationJarClass( properties, SampleFlow.class );

    // add ApplicationTag for Driven identification and search functionality
    AppProps.addApplicationTag( properties, "Cascading-AWS-Tutorial Part3" );
    AppProps.setApplicationName( properties, "Cascading-AWS-Tutorial Part3" );
    HadoopFlowConnector flowConnector = new HadoopFlowConnector( properties );

    List<Flow> queryFlows = new ArrayList<Flow>();

    // create FlowDef for date filter flow
    FlowDef dateDimFilterFlow = FlowDef.flowDef();
    // give name to FlowDef for Driven visibility
    dateDimFilterFlow.setName( "FilterDateDim" );
    // create initial Pipe
    Pipe inputFilesPipe = new Pipe( "datedim_filter" );
    // create RegexFilter to filter for all data from 2002
    RegexFilter regexFilter = new RegexFilter( "2002" );
    // create Each pipe to iterate over each record and apply regexFilter
    inputFilesPipe = new Each( inputFilesPipe, new Fields( "d_year" ), regexFilter );
    // add source and pipe to dateDimFilterFlow
    dateDimFilterFlow.addSource( inputFilesPipe, new Hfs( new TextDelimited( DATE_DIM_FIELDS, "|" ), "s3n://" + bucket + "/date_dim.dat" ) );

    Tap dateDimSinkTap = getOutputTap( "filtered_date_dim", Fields.ALL, bucket );
    // add tail sink to dateDimFilterFlow
    dateDimFilterFlow.addTailSink( inputFilesPipe, dateDimSinkTap );

    // add dateDimFilterFlow to queryFlows ArrayList for later use
    queryFlows.add( flowConnector.connect( dateDimFilterFlow ) );


    // create new FlowDef for customer demographics flow
    FlowDef customerDemographicsFilterFlow = FlowDef.flowDef();
    // give name to FlowDef for Driven visibility
    customerDemographicsFilterFlow.setName( "FilterDemographics" );
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
    customerDemographicsFilterFlow.addSource( custDemographicsFilter, new Hfs( new TextDelimited( CUSTOMER_DEM_FIELDS, "|" ), "s3n://" + bucket + "/customer_demographics.dat" ) );

    // create RedshiftTableDesc for customer_demopgraphics data
    Tap customerDemographicsFilterSinkTap = getOutputTap( "filtered_customer_demographics", Fields.ALL, bucket );
    // add tail sink to customerDemographicsFilterFlow
    customerDemographicsFilterFlow.addTailSink( custDemographicsFilter, customerDemographicsFilterSinkTap );

    // add customerDemographicsFilterFlow to queryFlows ArrayList for later use
    queryFlows.add( flowConnector.connect( customerDemographicsFilterFlow ) );

    // create new FlowDef for storeFilterFlow - apply pipe/regex/source/sink as before
    FlowDef storeFilterFlow = FlowDef.flowDef();
    storeFilterFlow.setName( "FilterStore" );
    Pipe stateFilter = new Pipe( "store_filter" );
    RegexFilter storeStateFilter = new RegexFilter( "(TN|SD)" );
    stateFilter = new Each( stateFilter, new Fields( "s_state" ).applyTypes( String.class ), storeStateFilter );
    storeFilterFlow.addSource( stateFilter, new Hfs( new TextDelimited( STORE_FIELDS, "|" ), "s3n://" + bucket + "/store.dat" ) );
    Tap storeStateSinkTap = getOutputTap( "filtered_store", Fields.ALL, bucket );
    storeFilterFlow.addTailSink( stateFilter, storeStateSinkTap );
    // add customerDemographicsFilterFlow to queryFlows ArrayList for later use
    queryFlows.add( flowConnector.connect( storeFilterFlow ) );

    Map<String, Tap> sources = new HashMap<String, Tap>();
    Map<String, Tap> sinks = new HashMap<String, Tap>();

    // create Redshift table for sales<>item join results
    Tap storeSaleItemSink = getOutputTap( "store_sales_item_join", Fields.ALL, bucket );
    sinks.put( "store_sales_item_join", storeSaleItemSink );

    // everything joins against store_sales so put that in first.
    Tap storeSales = new Hfs( new TextDelimited( STORE_SALES_FIELDS, "|" ), "s3n://" + bucket + "/store_sales.dat" );
    sources.put( "StoreSales", storeSales );
    Pipe storeSalesPipe = new Pipe( "StoreSales" );

    // JOIN item on (store_sales.ss_item_sk = item.i_item_sk)
    Tap item = new Hfs( new TextDelimited( ITEM_FIELDS, "|" ), "s3n://" + bucket + "/item.dat" );
    sources.put( "Item", item );
    Pipe itemPipe = new Pipe( "Item" );
    Pipe storeSalesItemJoin = new HashJoin( "store_sales_item_join", storeSalesPipe, new Fields( "ss_item_sk" ), itemPipe, new Fields( "i_item_sk" ) );

    //JOIN date_dim on (store_sales.ss_sold_date_sk = date_dim.d_date_sk)
    sources.put( "DateDimFiltered", dateDimSinkTap );
    Pipe dateDimFilteredPipe = new Pipe( "DateDimFiltered" );
    Tap storeSaleDateDimSink = getOutputTap( "StoreSaleDateDimJoin", Fields.ALL, bucket );
    sinks.put( "store_sale_date_dim_join", storeSaleDateDimSink );
    Pipe storeSalesDateDimJoin = new HashJoin( "store_sale_date_dim_join", storeSalesItemJoin, new Fields( "ss_sold_date_sk" ), dateDimFilteredPipe, new Fields( "d_date_sk" ) );

    sources.put( "StoreFiltered", storeStateSinkTap );
    Pipe storeFilteredPipe = new Pipe( "StoreFiltered" );
    RedshiftTableDesc StoreSalesStoreJoinSinkTableDescriptor = new RedshiftTableDesc( "store_sales_join_store", STORE_SALES_TABLE_FIELDS, STORE_SALES_TABLE_TYPES, null, null );
    Tap storeSalesStoreSink = getOutputTap( "StoreSalesStoreJoin", Fields.ALL, bucket );
    sinks.put( "store_sales_join_store", storeSalesStoreSink );
    Pipe storeSalesStoreJoin = new HashJoin( "store_sales_join_store", storeFilteredPipe, new Fields( "s_store_sk" ), storeSalesDateDimJoin, new Fields( "ss_store_sk" ) );

    // JOIN customer_demographics on (store_sales.ss_cdemo_sk = customer_demographics.cd_demo_sk)
    sources.put( "CustomerDemographicsFiltered", customerDemographicsFilterSinkTap );
    Pipe customerDemographicsFilteredPipe = new Pipe( "CustomerDemographicsFiltered" );
    Tap storeSaleCustDemSink = getOutputTap( "StoreSalesCustomerDemographicsJoin", Fields.ALL, bucket );
    sinks.put( "StoreSalesCustomerDemographicsJoin", storeSaleCustDemSink );
    Pipe storeSalesCustomerDemographicsJoin = new HashJoin( "StoreSalesCustomerDemographicsJoin", storeSalesStoreJoin, new Fields( "ss_cdemo_sk" ), customerDemographicsFilteredPipe, new Fields( "cd_demo_sk" ) );

    // wire all the join flows together
    queryFlows.add( flowConnector.connect( "JoinStoreSales", sources, sinks, storeSalesItemJoin, storeSalesDateDimJoin, storeSalesCustomerDemographicsJoin, storeSalesStoreJoin ) );

     /*
    * Strip out extraneous fields now
     */
    Fields finalFields = new Fields( new Comparable[]{"i_item_id", "s_state", "ss_quantity", "ss_list_price", "ss_coupon_amt", "ss_sales_price"}, new Type[]{String.class, String.class, Double.class, Double.class, Double.class, Double.class} );
    FlowDef fieldRemovingFlowDef = FlowDef.flowDef();
    fieldRemovingFlowDef.setName( "RemoveExtraFields" );
    Pipe allFieldsPipe = new Pipe( "all_fields" );
    Pipe fieldRemovingPipe = new Retain( allFieldsPipe, finalFields );
    fieldRemovingFlowDef.addSource( fieldRemovingPipe, storeSaleCustDemSink );
    RedshiftTableDesc redactedFieldsTapTableDescriptor = new RedshiftTableDesc( "all_fields", SALES_REPORT_TABLE_FIELDS, SALES_REPORT_TABLE_TYPES, null, null );
    Tap redactedFieldsTap = new RedshiftTap( redshiftJdbcUrl, redshiftUsername, redshiftPassword, S3_PATH_ROOT + "all_fields", awsCredentials, redactedFieldsTapTableDescriptor, new RedshiftScheme( SALES_REPORT_FIELDS, redactedFieldsTapTableDescriptor ), SinkMode.REPLACE, true, false );
    fieldRemovingFlowDef.addTailSink( fieldRemovingPipe, redactedFieldsTap );
    queryFlows.add( flowConnector.connect( fieldRemovingFlowDef ) );

     /*
    * Compute the averages by item and state and join them
     */
    Fields groupingFields = new Fields( "i_item_id", "s_state" ).applyTypes( String.class, String.class );

    FlowDef calculateQuantityResults = FlowDef.flowDef();
    calculateQuantityResults.setName( "CalculateAverageQuantity" );
    Pipe quantityAveragingPipe = new Pipe( "quantity_average" );
    quantityAveragingPipe = new AverageBy( quantityAveragingPipe, groupingFields, new Fields( "ss_quantity" ), new Fields( "ss_quantity" ) );
    calculateQuantityResults.addSource( quantityAveragingPipe, redactedFieldsTap );
    Fields quantity_average_fields = new Fields( "i_item_id", "ss_quantity", "s_state" ).applyTypes( String.class, Double.class, String.class );
    RedshiftTableDesc avgQuantityTableDescriptor = new RedshiftTableDesc( "quantity_average", new String[]{"i_item_id", "ss_quantity", "s_state"}, new String[]{"varchar(100)", "decimal(7,2)", "varchar(100)"}, null, null );
    Tap quantityAverageTap = new RedshiftTap( redshiftJdbcUrl, redshiftUsername, redshiftPassword, S3_PATH_ROOT + "quantity_average", awsCredentials, avgQuantityTableDescriptor, new RedshiftScheme( quantity_average_fields, avgQuantityTableDescriptor ), SinkMode.REPLACE, true, false );
    calculateQuantityResults.addTailSink( quantityAveragingPipe, quantityAverageTap );
    queryFlows.add( flowConnector.connect( calculateQuantityResults ) );

    FlowDef calculateListPriceResults = FlowDef.flowDef();
    calculateListPriceResults.setName( "CalculateAverageListPrice" );
    Pipe listPriceAveragingPipe = new Pipe( "list_price_average" );
    listPriceAveragingPipe = new AverageBy( listPriceAveragingPipe, groupingFields, new Fields( "ss_list_price" ), new Fields( "ss_list_price" ) );
    calculateListPriceResults.addSource( listPriceAveragingPipe, redactedFieldsTap );
    Fields price_average_fields = new Fields( "i_item_id", "ss_list_price", "s_state" ).applyTypes( String.class, Double.class, String.class );
    RedshiftTableDesc avgPriceTableDescriptor = new RedshiftTableDesc( "list_price_average", new String[]{"i_item_id", "ss_list_price", "s_state"}, new String[]{"varchar(100)", "decimal(7,2)", "varchar(100)"}, null, null );
    Tap listPipeAverageTap = new RedshiftTap( redshiftJdbcUrl, redshiftUsername, redshiftPassword, S3_PATH_ROOT + "list_price_average", awsCredentials, avgPriceTableDescriptor, new RedshiftScheme( price_average_fields, avgPriceTableDescriptor ), SinkMode.REPLACE, true, false );
    calculateListPriceResults.addTailSink( listPriceAveragingPipe, listPipeAverageTap );
    queryFlows.add( flowConnector.connect( calculateListPriceResults ) );

    FlowDef calculateCouponAmountResults = FlowDef.flowDef();
    calculateCouponAmountResults.setName( "CalculateAverageCouponAmount" );
    Pipe couponAmountAveragingPipe = new Pipe( "coupon_amount_average" );
    couponAmountAveragingPipe = new AverageBy( couponAmountAveragingPipe, groupingFields, new Fields( "ss_coupon_amt" ), new Fields( "ss_coupon_amt" ) );
    calculateCouponAmountResults.addSource( couponAmountAveragingPipe, redactedFieldsTap );
    Fields coupon_average_fields = new Fields( "i_item_id", "ss_coupon_amt", "s_state" ).applyTypes( String.class, Double.class, String.class );
    RedshiftTableDesc avgCouponTableDescriptor = new RedshiftTableDesc( "coupon_amount_average", new String[]{"i_item_id", "ss_coupon_amt", "s_state"}, new String[]{"varchar(100)", "decimal(7,2)", "varchar(100)"}, null, null );
    Tap couponAmountAverageTap = new RedshiftTap( redshiftJdbcUrl, redshiftUsername, redshiftPassword, S3_PATH_ROOT + "coupon_amount_average", awsCredentials, avgCouponTableDescriptor, new RedshiftScheme( coupon_average_fields, avgCouponTableDescriptor ), SinkMode.REPLACE, true, false );
    calculateCouponAmountResults.addTailSink( couponAmountAveragingPipe, couponAmountAverageTap );
    queryFlows.add( flowConnector.connect( calculateCouponAmountResults ) );

    FlowDef calculateSalePriceResults = FlowDef.flowDef();
    calculateSalePriceResults.setName( "CalculateAverageSalePrice" );
    Pipe salePriceAveragingPipe = new Pipe( "sale_price_average" );
    salePriceAveragingPipe = new AverageBy( salePriceAveragingPipe, groupingFields, new Fields( "ss_sales_price" ), new Fields( "ss_sales_price" ) );
    calculateSalePriceResults.addSource( salePriceAveragingPipe, redactedFieldsTap );
    Fields sales_price_average_fields = new Fields( "i_item_id", "ss_sales_price", "s_state" ).applyTypes( String.class, Double.class, String.class );
    RedshiftTableDesc avgSalesPriceTableDescriptor = new RedshiftTableDesc( "sale_price_average", new String[]{"i_item_id", "ss_sales_price", "s_state"}, new String[]{"varchar(100)", "decimal(7,2)", "varchar(100)"}, null, null );
    Tap salePriceAverageTap = new RedshiftTap( redshiftJdbcUrl, redshiftUsername, redshiftPassword, S3_PATH_ROOT + "sale_price_average", awsCredentials, avgSalesPriceTableDescriptor, new RedshiftScheme( sales_price_average_fields, avgSalesPriceTableDescriptor ), SinkMode.REPLACE, true, false );
    calculateSalePriceResults.addTailSink( salePriceAveragingPipe, salePriceAverageTap );
    queryFlows.add( flowConnector.connect( calculateSalePriceResults ) );

    // create, connect (all flows from queryFlows) and complete cascade
    CascadeConnector connector = new CascadeConnector();
    Cascade cascade = connector.connect( queryFlows.toArray( new Flow[ 0 ] ) );
    cascade.complete();

    }

  // generate standard Hfs tap
  protected static Tap getOutputTap( String tapName, Fields fields, String bucket )
    {
    return new Hfs( new TextDelimited( fields ), "s3n://" + bucket + "/output/" + tapName, SinkMode.REPLACE );
    }
  }