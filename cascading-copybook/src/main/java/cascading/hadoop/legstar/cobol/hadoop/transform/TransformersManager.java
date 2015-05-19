package cascading.hadoop.legstar.cobol.hadoop.transform;

import java.util.HashMap;
import java.util.Map;

import com.legstar.coxb.CobolBindingException;
import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.convert.simple.CobolSimpleConverters;
import com.legstar.coxb.host.HostData;
import com.legstar.coxb.transform.HostTransformException;
import com.legstar.coxb.transform.IHostTransformers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * LegStar transformers convert mainframe data to java.
 * <p/>
 * This class provides helper classes for transformers instantiation and cache
 * management.
 */
public class TransformersManager
  {

  private static Logger log = LoggerFactory.getLogger( TransformersManager.class );

  /**
   * Cache transformers to reduce instantiation cost.
   */
  private Map<String, IHostTransformers> transformers = new HashMap<String, IHostTransformers>();

  /**
   * Cache bindings to reduce instantiation cost.
   */
  private Map<String, ICobolBinding> bindings = new HashMap<String, ICobolBinding>();

  private final CobolSimpleConverters cobolConverters = new CobolSimpleConverters();

  /**
   * Transform host data to a java bean instance.
   *
   * @param beanClass the target java bean class
   * @param hostData  the host data as a byte array
   * @return the bean populated with the host data
   */
  @SuppressWarnings("unchecked")
  public <T> T toJava( Class<T> beanClass, byte[] hostData )
    {
    try
      {
      return (T) getTransformers( beanClass.getName() ).toJava( hostData );
      }
    catch( HostTransformException e )
      {
      log.error( "Fault in " + beanClass.getName() + ", hostData=" + HostData.toHexString( hostData ), e );
      throw new RuntimeException( e );
      }
    }

  /**
   * Retrieve the size in bytes of the host payload corresponding to a java
   * bean.
   *
   * @param beanClass the java bean class
   * @return the host payload class
   */
  public int getByteLength( Class<?> beanClass )
    {
    try
      {
      return getTransformers( beanClass.getName() ).getHostToJava().getByteLength();
      }
    catch( CobolBindingException e )
      {
      throw new RuntimeException( e );
      }
    catch( HostTransformException e )
      {
      throw new RuntimeException( e );
      }
    }

  /**
   * Transform a bean into host data.
   *
   * @param bean the java bean
   * @return the corresponding host data
   */
  public byte[] toHost( Object bean )
    {
    try
      {
      return getTransformers( bean.getClass().getName() ).toHost( bean );
      }
    catch( HostTransformException e )
      {
      throw new RuntimeException( e );
      }
    }

  public IHostTransformers getTransformers( String beanClassName ) throws HostTransformException
    {
    IHostTransformers tf = transformers.get( beanClassName );
    if( tf == null )
      {
      tf = createTransformers( beanClassName );
      transformers.put( beanClassName, tf );
      }
    return tf;
    }

  public ICobolBinding getBinding( String beanClassName ) throws HostTransformException
    {
    ICobolBinding cb = bindings.get( beanClassName );
    if( cb == null )
      {
      cb = createBinding( beanClassName );
      bindings.put( beanClassName, cb );
      }
    return cb;
    }

  public CobolSimpleConverters getCobolConverters()
    {
    return cobolConverters;
    }

  public static ICobolBinding createBinding( String beanClassName ) throws HostTransformException
    {
    return (ICobolBinding) create( getBindingClassName( beanClassName ) );
    }

  public static IHostTransformers createTransformers( String beanClassName ) throws HostTransformException
    {
    return (IHostTransformers) create( getTransformersClassName( beanClassName ) );
    }

  private static String getBindingClassName( String className )
    {
    StringBuilder sb = new StringBuilder();
    if( className.lastIndexOf( '.' ) > 0 )
      {
      sb.append( className.substring( 0, className.lastIndexOf( '.' ) ) );
      sb.append( ".bind" );
      sb.append( className.substring( className.lastIndexOf( '.' ) ) );
      sb.append( "Binding" );
      }
    return sb.toString();
    }

  private static String getTransformersClassName( String className )
    {
    StringBuilder sb = new StringBuilder();
    if( className.lastIndexOf( '.' ) > 0 )
      {
      sb.append( className.substring( 0, className.lastIndexOf( '.' ) ) );
      sb.append( ".bind" );
      sb.append( className.substring( className.lastIndexOf( '.' ) ) );
      sb.append( "Transformers" );
      }
    return sb.toString();
    }

  private static Object create( String className ) throws HostTransformException
    {
    try
      {
      Class<?> clazz = loadClass( className );
      return clazz.newInstance();
      }
    catch( InstantiationException e )
      {
      throw new HostTransformException( e );
      }
    catch( IllegalAccessException e )
      {
      throw new HostTransformException( e );
      }
    catch( ClassNotFoundException e )
      {
      throw new HostTransformException( e );
      }
    }

  private static Class<?> loadClass( final String qualifiedClassName ) throws ClassNotFoundException
    {
    ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
    if( contextClassLoader == null )
      {
      return Class.forName( qualifiedClassName );
      }
    try
      {
      return contextClassLoader.loadClass( qualifiedClassName );
      }
    catch( ClassNotFoundException e )
      {
      return Class.forName( qualifiedClassName );
      }
    }

  }
