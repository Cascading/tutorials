package cascading.legstar.cobolcopybook.scheme;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Properties;

import cascading.flow.FlowProcess;
import cascading.legstar.cobolcopybook.beans.bean1.BdfoCommonData;
import cascading.scheme.Scheme;
import cascading.scheme.SinkCall;
import cascading.scheme.SourceCall;
import cascading.tap.Tap;
import cascading.tuple.Fields;
import cascading.tuple.Tuple;
import cascading.tuple.TupleEntry;
import cascading.tuple.util.TupleViews;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Reads physical records off a mainframe bytes stream, groups them into a
 * logical record and converts that into a Tuple.
 * <p/>
 * Fields are assembled from a series of Fields classes each corresponding to a
 * physical record of interest (we ignore header and trailer records)
 */
public class CopybookScheme extends Scheme<Properties, InputStream, OutputStream, CopybookSourceContext, PrintWriter>
  {

  private static final long serialVersionUID = -4185569791736405311L;

  private static final CopybookConfig COPYBOOK_CONFIG = new CopybookConfig();

  private static Logger log = LoggerFactory.getLogger( CopybookScheme.class );

  /**
   * Scheme produces a BdfoKey field followed by the concatenation of all sub record fields
   */
  public CopybookScheme()
    {
    super( Fields.merge( new Fields( "BdfoKey" ), Fields.merge( COPYBOOK_CONFIG.getFields().values().toArray( new Fields[ COPYBOOK_CONFIG.getFields().size() ] ) ) ) );
    }

  @Override
  public void sourceConfInit( FlowProcess<? extends Properties> flowProcess, Tap<Properties, InputStream, OutputStream> tap, Properties conf )
    {
    }

  @Override
  public void sinkConfInit( FlowProcess<? extends Properties> flowProcess, Tap<Properties, InputStream, OutputStream> tap, Properties conf )
    {
    }

  @Override
  public void sink( FlowProcess<? extends Properties> flowProcess, SinkCall<PrintWriter, OutputStream> sinkCall ) throws IOException
    {

    }

  @Override
  public void sourcePrepare( FlowProcess<? extends Properties> flowProcess, SourceCall<CopybookSourceContext, InputStream> sourceCall ) throws IOException
    {

    CopybookSourceContext context = new CopybookSourceContext( COPYBOOK_CONFIG );

    sourceCall.setContext( context );

    sourceCall.getIncomingEntry().setTuple( TupleViews.createObjectArray() );
    }

  @Override
  public boolean source( FlowProcess<? extends Properties> flowProcess, SourceCall<CopybookSourceContext, InputStream> sourceCall ) throws IOException
    {

    log.debug( "Source called" );

    CopybookSourceContext context = sourceCall.getContext();

    Tuple tuple = new Tuple();

    // Sub record type indicator
    int bdfoParmNo = -1;

    // Total mainframe byte length for a logical record (informational)
    int logRecLen = 0;

    do
      {

      InputStream is = sourceCall.getInput();

      // All physical records start with a short common structure
      // containing the length of the sub record
      TupleEntry commonDataTupleEntry = getCommonDataTupleEntry( context, is );
      if( commonDataTupleEntry == null )
        {
        return false;
        }
      short bdfoLen = commonDataTupleEntry.getShort( "BdfoLen" );
      long bdfoKey = commonDataTupleEntry.getLong( "BdfoKey" );
      bdfoParmNo = commonDataTupleEntry.getInteger( "BdfoParmNo" );

      int subRecLen = bdfoLen - COPYBOOK_CONFIG.getBdfoCommonDataLen();

      // The parmNo field determines the type of sub record we are
      // dealing with
      switch( bdfoParmNo )
        {
        case 1:
          // Add account key once per logical record
          tuple.add( bdfoKey );
          set( context, is, subRecLen, "Field7" );
          break;
        case 2:
          set( context, is, subRecLen, "Field8" );
          break;
        case 3:
          set( context, is, subRecLen, "Field4" );
          break;
        case 4:
          set( context, is, subRecLen, "Field5" );
          break;
        case 5:
          set( context, is, subRecLen, "Field9" );
          break;
        case 6:
          set( context, is, subRecLen, "Field6" );
          break;
        case 7:
          set( context, is, subRecLen, "Field10" );
          break;
        case 8:
          set( context, is, subRecLen, "Field11" );
          break;
        case 9:
          set( context, is, subRecLen, "Field12" );
          break;
        case 13:
          set( context, is, subRecLen, "Field13" );
          break;
        case 16:
          set( context, is, subRecLen, "Field14" );
          break;
        case 17:
          set( context, is, subRecLen, "Field15" );
          break;
        case 18:
          set( context, is, subRecLen, "Field16" );
          break;
        case 93:
          set( context, is, subRecLen, "Field18" );
          break;
        case 94:
          set( context, is, subRecLen, "Field19" );
          break;
        case 96:
          set( context, is, subRecLen, "Field20" );
          break;
        case 97:
          set( context, is, subRecLen, "Field21" );
          break;
        case 83:
          set( context, is, subRecLen, "Field17" );
          break;
        default:
          // Read but ignore. Applies to header, trailer and any record
          // commented out above
          skip( context, is, subRecLen );

        }
      logRecLen += bdfoLen;

      log.debug( "Processed physical record type {}", bdfoParmNo );

      }
    while( bdfoParmNo != 83 ); // Signals end of physical
    // records sequence

    // Aggregate tuple entries corresponding to physical records into a
    // tuple corresponding to a logical record;
    for( TupleEntry tupleEntry : context.getTupleEntries().values() )
      {
      tuple.addAll( tupleEntry.getTuple() );
      }

    TupleEntry incomingEntry = sourceCall.getIncomingEntry();
    incomingEntry.setTuple( tuple );

    log.debug( "Logical record emitted. Bytes read: " + logRecLen );

    return true;
    }

  /**
   * Set and retrieve the tuple entry that corresponds to the common data sub
   * record.
   *
   * @param context the current context
   * @param is      the input stream holding mainframe data
   * @return the tuple entry that corresponds to the common data sub record
   * @throws IOException if transformation fails
   */
  private TupleEntry getCommonDataTupleEntry( CopybookSourceContext context, InputStream is ) throws IOException
    {
    boolean tupleSet = context.getTransformer().set( is, COPYBOOK_CONFIG.getBdfoCommonDataLen(), BdfoCommonData.class, context.getCommonDataTupleEntry() );
    return tupleSet ? context.getCommonDataTupleEntry() : null;
    }

  /**
   * Set the tuple entry corresponding to a physical record.
   *
   * @param context    the current context
   * @param is         the input stream holding mainframe data
   * @param subRecLen  the sub record's mainframe byte length
   * @param recordName the name of the sub record
   * @throws IOException if transformation fails
   */
  private void set( CopybookSourceContext context, InputStream is, int subRecLen, String recordName ) throws IOException
    {
    context.getTransformer().set( is, subRecLen, COPYBOOK_CONFIG.getBeans().get( recordName ), context.getTupleEntries().get( recordName ) );
    }

  private void skip( CopybookSourceContext context, InputStream is, int subRecLen ) throws IOException
    {
    context.getTransformer().skip( is, subRecLen );
    }

  }
