package cascading.kinesis.sample;

import java.io.IOException;
import java.util.Properties;

import cascading.flow.Flow;
import cascading.flow.FlowProcess;
import cascading.flow.hadoop2.Hadoop2MR1FlowConnector;
import cascading.operation.Aggregator;
import cascading.operation.AssertionLevel;
import cascading.operation.aggregator.Count;
import cascading.operation.assertion.AssertNotNull;
import cascading.operation.regex.RegexParser;
import cascading.pipe.Each;
import cascading.pipe.Every;
import cascading.pipe.GroupBy;
import cascading.pipe.Pipe;
import cascading.pipe.HashJoin;
import cascading.pipe.joiner.RightJoin;
import cascading.pipe.joiner.LeftJoin;
import cascading.pipe.assembly.Retain;
import cascading.property.AppProps;
import cascading.scheme.hadoop.TextDelimited;
import cascading.tap.SinkMode;
import cascading.tap.Tap;
import cascading.tap.hadoop.Hfs;
import cascading.tuple.Fields;
import cascading.tuple.Tuple;
import cascading.tuple.TupleEntry;
import com.amazon.emr.kinesis.cascading.KinesisHadoopScheme;
import com.amazon.emr.kinesis.cascading.KinesisHadoopTap;
import cascading.flow.FlowDef;
import cascading.jdbc.RedshiftScheme;
import cascading.jdbc.RedshiftTableDesc;
import cascading.jdbc.RedshiftTap;
import cascading.jdbc.AWSCredentials;
import cascading.pipe.assembly.Discard;
import cascading.pipe.assembly.Rename;

public class KinesisLogProcessingApp
  {
  public static void main(String[] args) throws IOException {

    // Instantiate command line arguments
    String redshiftJdbcUrl = args[ 0 ];
    String redshiftUsername = args[ 1 ];
    String redshiftPassword = args[ 2 ];
    String accessKey = args[ 3 ];
    String secretKey = args[ 4 ];
    String s3Bucket = args[ 5 ];

    // Create properties, define application jar class as well as application name/tags for Driven
    Properties properties = new Properties();
    AppProps.setApplicationJarClass( properties, KinesisLogProcessingApp.class );
    AppProps.addApplicationTag( properties, "Cluster:Dev" );
    AppProps.addApplicationTag( properties, "Technology:Kinesis" );
    AppProps.addApplicationTag( properties, "Technology:EMR" );
    AppProps.addApplicationTag( properties, "Technology:Redshift" );
    AppProps.addApplicationTag( properties, "Technology:S3" );
    AppProps.setApplicationName( properties, "Cascading Kinesis Sample" );

    // Define S3 data buckets
    String s3InStr = "s3n://" + s3Bucket + "/data/hashjoin_sample.csv";
    String s3OutStr = "s3n://" + s3Bucket + "/results/item_2-3.dat";
    String s3TrapStr = "s3n://" + s3Bucket + "/results/item_2-3-trap.dat";
    String s3Path = "s3n://" + s3Bucket + "/output/";

    // instantiate AWS credentials
    AWSCredentials awsCredentials = new AWSCredentials( accessKey, secretKey );

    // instantiate incoming fields, in this case "data" for the Kinesis stream
    Fields columns = new Fields("data");
    // instantiate KinesisHadoopScheme to be used with KinesisHadoopTap
    KinesisHadoopScheme scheme = new KinesisHadoopScheme(columns);
    // set noDateTimeout to true
    scheme.setNoDataTimeout(1);
    // apply our AWS access and secret keys
    scheme.setCredentials(accessKey,secretKey);

    // instantiate Kinesis Tap
    Tap kinesisSourceTap = new KinesisHadoopTap("AccessLogStream", scheme);

    // instantiate S3 source Tap using Hfs. This Tap will source a comma delimited file of IP address found at the location of s3InStr
    Tap s3SourceTap = new Hfs( new TextDelimited( new Fields("ip"), "|" ), s3InStr );
    // instantiate S3 trap tap to catch any bad data for later review
    Tap trapTap = new Hfs(new TextDelimited(true, "\t"),  s3TrapStr, SinkMode.REPLACE);

    // Fields for redshift Tap
    Fields rsFields = new Fields("ip", "count" ).applyTypes( String.class, Integer.class );
    // Redshift table descriptor
    RedshiftTableDesc redshiftTableDescriptor = new RedshiftTableDesc( "cascading_results", new String[]{"ip", "count"}, new String[]{"varchar(100)", "integer"}, null, null );
    // instantiate RedshiftTap - setting useDirectInsert (COPY) to true
    Tap sinkTap = new RedshiftTap( redshiftJdbcUrl, redshiftUsername, redshiftPassword, s3Path + "cascading_copy_rs", awsCredentials, redshiftTableDescriptor, new RedshiftScheme( rsFields, redshiftTableDescriptor ), SinkMode.REPLACE, false, true );

    // instantiate empty processPipe for Kinesis stream
    Pipe processPipe = new Pipe("process_pipe");
    // instantiate empty joinPipe for S3 file join
    Pipe joinPipe = new Pipe("join_pipe");
    // assert all fields in each tuple of the processPipe are not null
    processPipe = new Each(processPipe, AssertionLevel.STRICT, new AssertNotNull());
    // Declare the field names used to parse out of the Kinesis stream
    Fields apacheFields = new Fields("ip", "time", "request", "response", "size");
    // Define the regular expression used to parse the log file
    String apacheRegex = "^([^ ]*) \\S+ \\S+ \\[([\\w:/]+\\s[+\\-]\\d{4})\\] \"(.+?)\" (\\d{3}) ([^ ]*).*$";
    // Declare the groups from the above regex. Each group will be given a field name from 'apacheFields'
    int[] allGroups = {1, 2, 3, 4, 5};
    // Create the parser
    RegexParser parser = new RegexParser(apacheFields, apacheRegex, allGroups);
    // apply regex parser to each tuple in the Kinesis stream
    processPipe = new Each(processPipe, columns, parser);
    // retain only the field "ip" from Kinesis stream
    processPipe = new Retain(processPipe, new Fields("ip"));
    // in anticipation of the upcoming join rename S3 file field to avoid naming collision
    joinPipe = new Rename( joinPipe, new Fields( "ip" ), new Fields( "userip" ) );
    // rightJoin processPipe and joinPipe (IPs in S3 file) on ip (and renamed "userip") in new outputPipe
    Pipe outputPipe = new HashJoin(processPipe, new Fields("ip"), joinPipe, new Fields("userip"), new RightJoin());
    // discard unnecessary "userip"
    outputPipe = new Discard(outputPipe, new Fields("userip"));
    // group all by "ip"
    outputPipe = new GroupBy(outputPipe, new Fields("ip"));
    // calculate count of every group of IP's
    outputPipe = new Every(outputPipe, new Count(new Fields("count")));

    // define the flow definition
    FlowDef flowDef = FlowDef.flowDef()
      .addSource( processPipe, kinesisSourceTap )   // connect processPipe to KinesisTap
      .addSource( joinPipe, s3SourceTap )           // connect joinPipe to s3Tap
      .addTailSink( outputPipe, sinkTap )           // connect outputPipe to S3 sink Tap
      .setName( "Cascading-Kinesis-Flow" )          // name the flow
      .addTrap( processPipe, trapTap );             // add the trap to catch any bad data in processPipe

    // instantiate HadoopFlowConnector - other flowConnectors include:
    //  -- Hadoop2Mr1FlowConnector
    //  -- LocalFlowConnector
    //  -- Hadoop2TezFlowConnector
    //  -- Spark and Flink FlowConnectors under development
    Hadoop2MR1FlowConnector flowConnector = new Hadoop2MR1FlowConnector( properties );
    // attach the flow definition to the flow connector
    Flow kinesisFlow = flowConnector.connect(flowDef);
    // run the flow
    kinesisFlow.complete();
  }
}
