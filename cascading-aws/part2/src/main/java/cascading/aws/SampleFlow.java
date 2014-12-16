package cascading.aws;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import cascading.cascade.Cascade;
import cascading.cascade.CascadeConnector;
import cascading.flow.Flow;
import cascading.flow.FlowDef;
import cascading.flow.hadoop.HadoopFlowConnector;
import cascading.jdbc.AWSCredentials;
import cascading.lingual.flow.SQLPlanner;
import cascading.pipe.Pipe;
import cascading.pipe.assembly.Retain;
import cascading.property.AppProps;
import cascading.scheme.hadoop.TextDelimited;
import cascading.tap.SinkMode;
import cascading.tap.Tap;
import cascading.tap.hadoop.Hfs;
import cascading.tuple.Fields;


public class SampleFlow
  {
  public static void main( String[] args ) throws Exception
    {
    new SampleFlow().run( args );
    }

  public void run( String[] args ) throws IOException
    {
    String hfsDataDir = args[ 0 ];
    String s3ResultsDir = args[ 1 ];
    String redshiftJdbcUrl = args[ 2 ];
    String redshiftUsername = args[ 3 ];
    String redshiftPassword = args[ 4 ];
    String accessKey = args[ 5 ];
    String secretKey = args[ 6 ];

    Properties properties = new Properties();
    AppProps.setApplicationJarClass( properties, SampleFlow.class );

    // add ApplicationTag for Driven identification and search functionality
    AppProps.addApplicationTag( properties, "Cascading-AWS-Tutorial Part2" );
    AppProps.setApplicationName( properties, "Cascading-AWS-Tutorial Part2" );

    // format directory string
    hfsDataDir = trimTrailingSlash( hfsDataDir );
    s3ResultsDir = trimTrailingSlash( s3ResultsDir );

    // setup our AWS Credentials
    AWSCredentials awsCredentials = new AWSCredentials( accessKey, secretKey );

    // declare our field names and types
    Fields DATE_DIM_FIELDS = new Fields( "d_date_sk", "d_date_id", "d_date", "d_month_seq", "d_week_seq", "d_quarter_seq", "d_year", "d_dow", "d_moy", "d_dom", "d_qoy", "d_fy_year", "d_fy_quarter_seq", "d_fy_week_seq", "d_day_name", "d_quarter_name", "d_holiday", "d_weekend", "d_following_holiday", "d_first_dom", "d_last_dom", "d_same_day_ly", "d_same_day_lq", "d_current_day", "d_current_week", "d_current_month", "d_current_quarter", "d_current_year", "d_trailing_field" );
    Class[] DATE_DIM_TABLE_TYPES = new Class[]{Integer.class, String.class, Date.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, String.class, String.class, String.class, String.class, String.class, Integer.class, Integer.class, Integer.class, Integer.class, String.class, String.class, String.class, String.class, String.class, String.class};

    Fields STORE_SALES_FIELDS = new Fields( "ss_sold_date_sk", "ss_sold_time_sk", "ss_item_sk", "ss_customer_sk", "ss_cdemo_sk", "ss_hdemo_sk", "ss_addr_sk", "ss_store_sk", "ss_promo_sk ", "ss_ticket_number", "ss_quantity", "ss_wholesale_cost", "ss_list_price", "ss_sales_price", "ss_ext_discount_amt", "ss_ext_sales_price", "ss_ext_wholesale_cost", "ss_ext_list_price", "ss_ext_tax", "ss_coupon_amt", "ss_net_paid", "ss_net_paid_inc_tax", "ss_net_profit", "ss_trailing_field" );
    Class[] STORE_SALES_TABLE_TYPES = new Class[]{Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Integer.class, Double.class, Double.class, Double.class, Double.class, Double.class, Double.class, Double.class, Double.class, Double.class, Double.class, Double.class, Double.class, String.class};

    Fields ITEM_FIELDS = new Fields( "i_item_sk", "i_item_id", "i_rec_start_date", "i_rec_end_date", "i_item_desc", "i_current_price", "i_wholesale_cost", "i_brand_id", "i_brand", "i_class_id", "i_class", "i_category_id", "i_category", "i_manufact_id", "i_manufact", "i_size", "i_formulation", "i_color", "i_units", "i_container", "i_manager_id", "i_product_name", "i_trailing_field" );
    Class[] ITEM_FIELDS_TYPES = new Class[]{Integer.class, String.class, Date.class, Date.class, String.class, Double.class, Double.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.class, String.class, String.class, String.class, String.class};

    // define our SQL statement
    String statement = ( "select count(store_sales.\"ss_item_sk\") as sales_count, items.\"i_category\" as category, dates.\"d_day_name\" " +
      "from \"example\".\"dates\" as dates " +
      "join \"example\".\"store_sales\" as store_sales on dates.\"d_date_sk\" = store_sales.\"ss_sold_date_sk\" " +
      "join \"example\".\"items\" as items on items.\"i_item_sk\" = store_sales.\"ss_item_sk\" " +
      "where items.\"i_category\" is not null " +
      "group by items.\"i_category\", dates.\"d_day_name\" order by count(store_sales.\"ss_item_sk\") desc " );

    // set up new Fields for only the fields we want to Retain
    Fields retainDates = new Fields( "d_day_name", "d_date_sk" );
    Fields retainSales = new Fields( "ss_item_sk", "ss_sold_date_sk" );
    Fields retainItems = new Fields( "i_category", "i_item_sk" );

    // set up Retain subassembly pipes
    Pipe retainDatesPipe = new Pipe( "retainDates" );
    retainDatesPipe = new Retain( retainDatesPipe, retainDates );

    // set up Retain subassembly pipes
    Pipe retainSalesPipe = new Pipe( "retainStoreSales" );
    retainSalesPipe = new Retain( retainSalesPipe, retainSales );

    // set up Retain subassembly pipes
    Pipe retainItemsPipe = new Pipe( "retainItems" );
    retainItemsPipe = new Retain( retainItemsPipe, retainItems );

    // create our input tap to read from HDFS
    Tap datesDataTap = new Hfs( new TextDelimited( DATE_DIM_FIELDS, "|", DATE_DIM_TABLE_TYPES ), hfsDataDir + "/date_dim.dat" );
    Tap salesDataTap = new Hfs( new TextDelimited( STORE_SALES_FIELDS, "|", STORE_SALES_TABLE_TYPES ), hfsDataDir + "/store_sales.dat" );
    Tap itemsDataTap = new Hfs( new TextDelimited( ITEM_FIELDS, "|", ITEM_FIELDS_TYPES ), hfsDataDir + "/item.dat" );

    // create our results taps to write to S3
    Tap resultsDatesTap = new Hfs( new TextDelimited( new Fields( "d_day_name", "d_date_sk" ) ), "s3n://" + accessKey + ":" + secretKey + "@" + s3ResultsDir + "/part2-dates", SinkMode.REPLACE );
    Tap resultsItemsTap = new Hfs( new TextDelimited( new Fields( "i_category", "i_item_sk" ) ), "s3n://" + accessKey + ":" + secretKey + "@" + s3ResultsDir + "/part2-items", SinkMode.REPLACE );
    Tap resultsSalesTap = new Hfs( new TextDelimited( new Fields( "ss_item_sk", "ss_sold_date_sk" ) ), "s3n://" + accessKey + ":" + secretKey + "@" + s3ResultsDir + "/part2-sales", SinkMode.REPLACE );
    Tap resultsTap = new Hfs( new TextDelimited( Fields.ALL ), "s3n://" + accessKey + ":" + secretKey + "@" + s3ResultsDir + "/part2-results", SinkMode.REPLACE );

    // set up our FlowDefs - we will add their sources, their retain pipes and their sinks
    FlowDef flowDefSales = FlowDef.flowDef().setName( "retain sales info flow" ).addSource( retainSalesPipe, salesDataTap ).addTailSink( retainSalesPipe, resultsSalesTap );
    FlowDef flowDefItems = FlowDef.flowDef().setName( "retain items info flow" ).addSource( retainItemsPipe, itemsDataTap ).addTailSink( retainItemsPipe, resultsItemsTap );
    FlowDef flowDefDates = FlowDef.flowDef().setName( "retain dates info flow" ).addSource( retainDatesPipe, datesDataTap ).addTailSink( retainDatesPipe, resultsDatesTap );
    FlowDef flowDef = FlowDef.flowDef().setName( "sql flow" ).addSource( "example.store_sales", resultsSalesTap ).addSource( "example.items", resultsItemsTap ).addSource( "example.dates", resultsDatesTap ).addSink( "part2_results", resultsTap );

    // instantiate SQLPLanner with our SQL statement
    SQLPlanner sqlPlanner = new SQLPlanner().setSql( statement );
    flowDef.addAssemblyPlanner( sqlPlanner );

    // create flows
    Flow flow1 = new HadoopFlowConnector( properties ).connect( flowDefSales );
    Flow flow2 = new HadoopFlowConnector( properties ).connect( flowDefItems );
    Flow flow3 = new HadoopFlowConnector( properties ).connect( flowDefDates );
    Flow flow4 = new HadoopFlowConnector( properties ).connect( flowDef );

    List<Flow> queryFlows = new ArrayList<Flow>();
    queryFlows.add( flow1 );
    queryFlows.add( flow2 );
    queryFlows.add( flow3 );
    queryFlows.add( flow4 );

    // connect and complete all flows in a Cascade
    CascadeConnector connector = new CascadeConnector();
    Cascade cascade = connector.connect( queryFlows.toArray( new Flow[ 0 ] ) );
    cascade.complete();
    }

  private String trimTrailingSlash( String dir )
    {
    if( dir.endsWith( "/" ) ) return dir.substring( 0, dir.length() - 1 );
    return dir;
    }
  }