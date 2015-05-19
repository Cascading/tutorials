package cascading.legstar.cobolcopybook.transform;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import cascading.tuple.Tuple;
import cascading.tuple.TupleEntry;
import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.convert.simple.CobolSimpleConverters;
import com.legstar.coxb.host.HostException;
import com.legstar.coxb.transform.HostTransformException;

/**
 * Transforms COBOL data taken off an input stream into a Tuple in a Tuple
 * entry.
 */
public class TupleEntryCobolTransformer
  {

  private final CobolSimpleConverters cobolConverters = new CobolSimpleConverters();
  /**
   * Cache bindings to reduce instantiation cost.
   */
  private Map<String, ICobolBinding> bindings = new HashMap<String, ICobolBinding>();

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

    tupleEntry.setTuple( Tuple.size( tupleEntry.getFields().size() ) );

    byte[] hostData = new byte[ hostByteLen ];
    if( is.read( hostData ) > -1 )
      {

      try
        {
        TupleEntryCobolUnmarshalVisitor tcuv = new TupleEntryCobolUnmarshalVisitor( hostData, 0, cobolConverters, tupleEntry );
        getBinding( beanClass.getName() ).accept( tcuv );
        return true;
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
    else
      {
      // Signal EOF
      return false;
      }
    }

  /**
   * When mainframe data is irrelevant, we just skip it.
   *
   * @param is          the input stream
   * @param hostByteLen how many mainframe bytes to skip
   */
  public void skip( InputStream is, int hostByteLen ) throws IOException
    {
    byte[] hostData = new byte[ hostByteLen ];
    is.read( hostData );
    }

  /**
   * Retrieve the cached LegStar binding for a bean class.
   *
   * @param beanClassName the bean class name
   * @return a legstar binding
   * @throws HostTransformException
   */
  private ICobolBinding getBinding( String beanClassName ) throws HostTransformException
    {
    ICobolBinding binding = bindings.get( beanClassName );
    if( binding == null )
      {
      binding = LegStarUtils.createBinding( beanClassName );
      bindings.put( beanClassName, binding );
      }
    return binding;
    }

  }
