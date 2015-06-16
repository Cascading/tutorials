package cascading.hadoop.legstar.cobol.hadoop.scheme;

import java.io.IOException;
import java.io.PrintWriter;

import cascading.flow.FlowProcess;
import cascading.hadoop.legstar.cobol.hadoop.transform.RdwUtils;
import cascading.scheme.Scheme;
import cascading.scheme.SinkCall;
import cascading.scheme.SourceCall;
import cascading.tap.Tap;
import cascading.tuple.Fields;
import cascading.tuple.TupleEntry;
import org.apache.hadoop.io.ArrayPrimitiveWritable;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.RecordReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Reads records off a mainframe bytes stream and converts them into a Tuple.
 * <p/>
 * Records in the mainframe byte stream are of a variable size but they all
 * conform to a single COBOL data structure.
 * <p/>
 * Records are assumed to start with 4 bytes giving the actual size of the
 * record.
 */
public abstract class RdwScheme extends Scheme<JobConf, RecordReader<ArrayPrimitiveWritable, ArrayPrimitiveWritable>, OutputCollector<Object, Object>, RdwSourceContext, PrintWriter>
  {

  private static final long serialVersionUID = 2708799638886951160L;

  private static Logger log = LoggerFactory.getLogger( RdwScheme.class );

  /**
   * Bean representing the mainframe record.
   */
  private final Class<?> beanClass;

  /**
   * Constructor
   *
   * @param fields    the Cascading fields produced by this scheme. These a flat
   *                  representation of the bean obtained by converting a COBOL
   *                  structure. This class is usually generated using the
   *                  cascading.legstar.translator
   * @param beanClass the class of the bean representing the COBOL structure.
   *                  This class is usually generated using the legstar binding
   *                  generator
   */
  public RdwScheme( Fields fields, Class<?> beanClass )
    {
    super( fields );
    this.beanClass = beanClass;
    }

  @Override
  public void sourcePrepare( FlowProcess<? extends JobConf> flowProcess, SourceCall<RdwSourceContext, RecordReader<ArrayPrimitiveWritable, ArrayPrimitiveWritable>> sourceCall )
    {

    RdwSourceContext context = new RdwSourceContext( beanClass );
    sourceCall.setContext( context );
    }

  public boolean source( FlowProcess<? extends JobConf> flowProcess, SourceCall<RdwSourceContext, RecordReader<ArrayPrimitiveWritable, ArrayPrimitiveWritable>> sourceCall ) throws IOException
    {

    log.debug( "Source called" );

    RdwSourceContext context = sourceCall.getContext();

    ArrayPrimitiveWritable key = new ArrayPrimitiveWritable();
    ArrayPrimitiveWritable value = new ArrayPrimitiveWritable();
    boolean result = sourceCall.getInput().next( key, value );

    if( !result )
      {
      return false;
      }

    byte[] keyBytes = (byte[]) key.get();
    byte[] valueBytes = (byte[]) value.get();

    System.arraycopy( keyBytes, 0, context.getRdwBuffer(), 0, RdwUtils.RDW_LEN );
    System.arraycopy( keyBytes, RdwUtils.RDW_LEN, context.getReadBuffer(), 0, keyBytes.length - RdwUtils.RDW_LEN );
    System.arraycopy( valueBytes, 0, context.getReadBuffer(), keyBytes.length - RdwUtils.RDW_LEN, valueBytes.length );

    // Transform the record to a Tuple
    TupleEntry incomingEntry = sourceCall.getIncomingEntry();
    context.toTupleEntry( incomingEntry );

    log.debug( "Record emitted. Bytes read: {}", keyBytes.length + valueBytes.length );

    return true;
    }

  @Override
  public void sinkConfInit( FlowProcess<? extends JobConf> flowProcess, Tap<JobConf, RecordReader<ArrayPrimitiveWritable, ArrayPrimitiveWritable>, OutputCollector<Object, Object>> tap, JobConf conf )
    {
    }

  @Override
  public void sink( FlowProcess<? extends JobConf> flowProcess, SinkCall<PrintWriter, OutputCollector<Object, Object>> sinkCall ) throws IOException
    {
    throw new IOException( "This scheme cannot be used as a sink" );

    }

  }
