package cascading.hadoop.legstar.cobol.hadoop.transform;

import java.io.IOException;
import java.io.InputStream;

import cascading.tuple.Tuple;
import cascading.tuple.TupleEntry;
import com.legstar.coxb.host.HostException;
import com.legstar.coxb.transform.HostTransformException;

public class TupleEntryTransformersManager extends TransformersManager
  {

  /**
   * Transform host data read off an input stream to a tuple entry tuple.
   *
   * @param is          the host data as an input stream
   * @param hostByteLen the expected host byte length
   * @param beanClass   the target java bean class
   * @param tupleEntry  the tuple entry to be populated
   * @return true if setting worked, false if we reached end of file
   */
  public boolean set( InputStream is, int hostByteLen, Class<?> beanClass, TupleEntry tupleEntry ) throws IOException
    {

    byte[] hostData = new byte[ hostByteLen ];
    if( is.read( hostData ) > -1 )
      {
      set( hostData, beanClass, tupleEntry );
      return true;
      }
    else
      {
      // Signal EOF
      return false;
      }
    }

  /**
   * Transform host data to a tuple entry tuple.
   *
   * @param hostData   the host data unconverted yet
   * @param beanClass  the target java bean class
   * @param tupleEntry the tuple entry to be populated
   */
  public void set( byte[] hostData, Class<?> beanClass, TupleEntry tupleEntry ) throws IOException
    {

    // QUESTION is this the best way to initialize the tuple
    // cascading does not accept less tuples then fields
    tupleEntry.setTuple( Tuple.size( tupleEntry.getFields().size() ) );
    try
      {
      TupleEntryCobolUnmarshalVisitor tcuv = new TupleEntryCobolUnmarshalVisitor( hostData, 0, getCobolConverters(), tupleEntry );
      getBinding( beanClass.getName() ).accept( tcuv );
      }
    catch( HostException e )
      {
      throw new IOException( e );
      }
    catch( HostTransformException e )
      {
      throw new IOException( e );
      }
    }

  }
