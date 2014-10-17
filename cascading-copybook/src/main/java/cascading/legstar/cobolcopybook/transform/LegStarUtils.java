package cascading.legstar.cobolcopybook.transform;

import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.transform.HostTransformException;
import com.legstar.coxb.transform.IHostTransformers;

/**
 * Utility for LegStar bindings and transformers instantiation.
 */
public class LegStarUtils
  {

  private LegStarUtils()
    {
    }

  public static ICobolBinding createBinding( String beanClassName )
    throws HostTransformException
    {
    return (ICobolBinding) create( getBindingClassName( beanClassName ) );
    }

  public static IHostTransformers createTransformers( String beanClassName )
    throws HostTransformException
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

  private static Object create( String className )
    throws HostTransformException
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

  private static Class<?> loadClass( final String qualifiedClassName )
    throws ClassNotFoundException
    {
    ClassLoader contextClassLoader = Thread.currentThread()
      .getContextClassLoader();
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
