package cascading.hadoop.legstar.cobol.hadoop.app;

import java.util.Properties;

import cascading.flow.FlowConnector;
import cascading.flow.FlowDef;
import cascading.flow.hadoop2.Hadoop2MR1FlowConnector;
import cascading.hadoop.legstar.cobol.fields.Custdat;
import cascading.hadoop.legstar.cobol.hadoop.scheme.CustdatScheme;
import cascading.operation.DebugLevel;
import cascading.pipe.Pipe;
import cascading.property.AppProps;
import cascading.scheme.Scheme;
import cascading.scheme.hadoop.TextDelimited;
import cascading.tap.SinkMode;
import cascading.tap.Tap;
import cascading.tap.hadoop.Hfs;

/**
 * Use the local CustdatScheme to read mainframe data and create a test
 * delimited file.
 */
@SuppressWarnings({"unchecked", "rawtypes"})
public class Main
  {

  /**
   * Using a local FileTap try a simple flow dumping output to stdout.
   */
  public static void main( String[] args ) throws Exception
    {

    if( args.length != 2 )
      {
      throw new Exception( "first argument is mainframe data file, second is output dir" );
      }

    Properties properties = new Properties();

    AppProps.addApplicationTag( properties, "tutorials" );
    AppProps.addApplicationTag( properties, "cluster:development" );
    AppProps.setApplicationName( properties, "Cascading-Copybook Hadoop" );


    String inPath = args[ 0 ];
    String outPath = args[ 1 ];

    Pipe copyPipe = new Pipe( "testPipe" );

    // Source turns the mainframe data into a flat Tuple
    Scheme sourceScheme = new CustdatScheme();
    Tap inTap = new Hfs( sourceScheme, inPath );

    // Tuples are written to a csv
    Scheme sinkScheme = new TextDelimited( new Custdat(), false, "," );
    Tap outTap = new Hfs( sinkScheme, outPath, SinkMode.REPLACE );

    FlowDef flowDef = FlowDef.flowDef().addSource( copyPipe, inTap ).addTailSink( copyPipe, outTap ).setDebugLevel( DebugLevel.VERBOSE ).setName( "Cascading Cobol" );

    AppProps.setApplicationJarClass( properties, Main.class );
    FlowConnector flowConnector = new Hadoop2MR1FlowConnector( properties );
    flowConnector.connect( flowDef ).complete();

    }
  }
