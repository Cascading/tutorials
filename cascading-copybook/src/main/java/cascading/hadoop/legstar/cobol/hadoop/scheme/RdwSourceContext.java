package cascading.hadoop.legstar.cobol.hadoop.scheme;

import java.io.IOException;

import cascading.hadoop.legstar.cobol.hadoop.transform.TupleEntryTransformersManager;
import cascading.tuple.TupleEntry;

/**
 * Context for an RDW based Scheme where mainframe records start with 4 bytes
 * giving the actual record size.
 * <p/>
 * Allows Transformers and buffers to get reused when a large number of records
 * is read.
 */
public class RdwSourceContext
  {

  /**
   * A helper for cobol to tuple conversions.
   */
  private final TupleEntryTransformersManager transformer = new TupleEntryTransformersManager();

  /**
   * Will contain the record actual size.
   */
  private final byte[] rdwBuffer = new byte[ 4 ];

  /**
   * Reusable buffer for record reading (length is maximum record size)
   */
  private final byte[] dataBuffer;

  /**
   * Bean representing the mainframe record.
   */
  private final Class<?> beanClass;

  public RdwSourceContext( Class<?> beanClass )
    {
    this.beanClass = beanClass;
    this.dataBuffer = new byte[ transformer.getByteLength( beanClass ) ];
    }

  public TupleEntryTransformersManager getTransformer()
    {
    return transformer;
    }

  public byte[] getReadBuffer()
    {
    return dataBuffer;
    }

  public byte[] getRdwBuffer()
    {
    return rdwBuffer;
    }

  public void toTupleEntry( TupleEntry incomingEntry ) throws IOException
    {
    transformer.set( dataBuffer, beanClass, incomingEntry );

    }

  }
