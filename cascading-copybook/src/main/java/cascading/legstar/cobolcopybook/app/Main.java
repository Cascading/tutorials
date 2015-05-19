package cascading.legstar.cobolcopybook.app;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import cascading.flow.FlowConnector;
import cascading.flow.FlowDef;
import cascading.flow.local.LocalFlowConnector;
import cascading.legstar.cobolcopybook.scheme.CopybookScheme;
import cascading.operation.DebugLevel;
import cascading.pipe.Pipe;
import cascading.property.AppProps;
import cascading.scheme.local.TextDelimited;
import cascading.tap.SinkTap;
import cascading.tap.Tap;
import cascading.tap.local.FileTap;
import cascading.tap.local.StdOutTap;
import cascading.tuple.Fields;

/**
 * Use the CopybookScheme to read EBCDIC data and print some field values on the screen
 */
public class Main
  {

  public static void main( String[] args ) throws Exception
    {
    if( args.length != 1 )
      {
      throw new Exception( "missing input ebcdic data" );
      }

    Properties properties = new Properties();
    AppProps.setApplicationJarClass( properties, Main.class );

    AppProps.addApplicationTag( properties, "tutorials" );
    AppProps.addApplicationTag( properties, "cluster:development" );
    AppProps.setApplicationName( properties, "Cascading-Copybook Local" );

    String path = args[ 0 ];
    Tap<Properties, InputStream, OutputStream> inTap = new FileTap( new CopybookScheme(), path );
    SinkTap<Properties, OutputStream> outTap = new StdOutTap( new TextDelimited( new Fields( "BdfoKey", "Kcp01V05Sname", "Kcp01V05BicIndclass", "Kcp02V05TransfFromSortCode", "Kcp07V05BalIdent_0", "Kcp07V05Bal_0", "Kcp07V05BalIdent_1", "Kcp07V05Bal_1" ), true, "," ) );
    Pipe copyPipe = new Pipe( "testPipe" );
    FlowDef flowDef = FlowDef.flowDef().addSource( copyPipe, inTap ).addTailSink( copyPipe, outTap ).setDebugLevel( DebugLevel.VERBOSE ).setName( "Cascading Copybook" );

    FlowConnector flowConnector = new LocalFlowConnector();
    flowConnector.connect( flowDef ).complete();
    }
  }
