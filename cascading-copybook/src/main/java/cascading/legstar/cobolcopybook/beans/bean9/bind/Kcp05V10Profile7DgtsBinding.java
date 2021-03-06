package cascading.legstar.cobolcopybook.beans.bean9.bind;

import java.util.List;

import cascading.legstar.cobolcopybook.beans.bean9.Kcp05V10Profile7Dgts;
import cascading.legstar.cobolcopybook.beans.bean9.ObjectFactory;
import com.legstar.coxb.CobolBindingFactory;
import com.legstar.coxb.ICobolArrayPackedDecimalBinding;
import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.ICobolBindingFactory;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.common.CComplexBinding;
import com.legstar.coxb.host.HostException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * LegStar Binding for Complex element :
 * Kcp05V10Profile7Dgts.
 * <p/>
 * This class was generated by LegStar Binding generator.
 */
public class Kcp05V10Profile7DgtsBinding extends CComplexBinding
  {

  /**
   * Maximum host bytes size for this complex object.
   */
  private static final int BYTE_LENGTH = 20;
  /**
   * Binding factory.
   */
  private static final ICobolBindingFactory BF = CobolBindingFactory.getBindingFactory();
  /**
   * Static reference to Value object factory to be used as default.
   */
  private static final ObjectFactory JF = new ObjectFactory();
  /**
   * Current Value object factory (Defaults to the static one but can be
   * changed).
   */
  private ObjectFactory mValueObjectFactory = JF;
  /**
   * Logger.
   */
  private final Log _log = LogFactory.getLog( getClass() );
  /**
   * Child bound to value object property Kcp05V10Prof2529(Integer).
   */
  public ICobolArrayPackedDecimalBinding _kcp05V10Prof2529;
  /**
   * Value object to which this cobol complex element is bound.
   */
  private Kcp05V10Profile7Dgts mValueObject;
  /**
   * Indicates that the associated Value object just came from the constructor
   * and doesn't need to be recreated.
   */
  private boolean mUnusedValueObject = false;

  /**
   * Constructor for a root Complex element without a bound Value object.
   */
  public Kcp05V10Profile7DgtsBinding()
    {
    this( null );
    }

  /**
   * Constructor for a root Complex element with a bound Value object.
   *
   * @param valueObject the concrete Value object instance bound to this
   *                    complex element
   */
  public Kcp05V10Profile7DgtsBinding( final Kcp05V10Profile7Dgts valueObject )
    {
    this( "", "", null, valueObject );
    }

  /**
   * Constructor for a Complex element as a child of another element and
   * an associated Value object.
   *
   * @param bindingName   the identifier for this binding
   * @param fieldName     field name in parent Value object
   * @param valueObject   the concrete Value object instance bound to this
   *                      complex element
   * @param parentBinding a reference to the parent binding
   */
  public Kcp05V10Profile7DgtsBinding( final String bindingName, final String fieldName, final ICobolComplexBinding parentBinding, final Kcp05V10Profile7Dgts valueObject )
    {

    super( bindingName, fieldName, Kcp05V10Profile7Dgts.class, null, parentBinding );
    mValueObject = valueObject;
    if( mValueObject != null )
      {
      mUnusedValueObject = true;
      }
    initChildren();
    setByteLength( BYTE_LENGTH );
    }

  /**
   * Creates a binding property for each child.
   */
  private void initChildren()
    {
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Initializing started" );
      }
        /* Create binding children instances */

    _kcp05V10Prof2529 = BF.createArrayPackedDecimalBinding( "Kcp05V10Prof2529", "Kcp05V10Prof2529", Integer.class, this );
    _kcp05V10Prof2529.setCobolName( "KCP05V10-PROF-25-29" );
    _kcp05V10Prof2529.setByteLength( 20 );
    _kcp05V10Prof2529.setItemByteLength( 4 );
    _kcp05V10Prof2529.setTotalDigits( 7 );
    _kcp05V10Prof2529.setIsSigned( true );
    _kcp05V10Prof2529.setMinOccurs( 5 );
    _kcp05V10Prof2529.setMaxOccurs( 5 );

        /* Add children to children list */
    getChildrenList().add( _kcp05V10Prof2529 );

    if( _log.isDebugEnabled() )
      {
      _log.debug( "Initializing successful" );
      }
    }

  /**
   * {@inheritDoc}
   */
  public void createValueObject() throws HostException
    {
        /* Since this complex binding has a constructor that takes a
         * Value object, we might already have a Value object that
         * was not used yet. */
    if( mUnusedValueObject && mValueObject != null )
      {
      mUnusedValueObject = false;
      return;
      }
    mValueObject = mValueObjectFactory.createKcp05V10Profile7Dgts();
    }

  /**
   * {@inheritDoc}
   */
  public void setChildrenValues() throws HostException
    {

         /* Make sure there is an associated Value object*/
    if( mValueObject == null )
      {
      createValueObject();
      }
        /* Get Value object property _kcp05V10Prof2529 */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp05V10Prof2529" + " value=" + mValueObject.getKcp05V10Prof2529() );
      }
    _kcp05V10Prof2529.setObjectValue( mValueObject.getKcp05V10Prof2529() );
    }

  /**
   * {@inheritDoc}
   */
  public void setPropertyValue( final int index ) throws HostException
    {

    ICobolBinding child = getChildrenList().get( index );

       /* Children that are not bound to a value object are ignored.
        * This includes Choices and dynamically generated counters
        * for instance.  */
    if( !child.isBound() )
      {
      return;
      }

        /* Set the Value object property value from binding object */
    Object bindingValue = null;
    switch( index )
      {
      case 0:
        bindingValue = child.getObjectValue( Integer.class );
        List<Integer> listKcp05V10Prof2529 = cast( bindingValue );
        mValueObject.getKcp05V10Prof2529().clear();
        mValueObject.getKcp05V10Prof2529().addAll( listKcp05V10Prof2529 );
        break;
      default:
        break;
      }
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Setting value of Value object property " + child.getJaxbName() + " value=" + bindingValue );
      }
    }

  /**
   * {@inheritDoc}
   */
  public Object getObjectValue( final Class<?> type ) throws HostException
    {
    if( type.equals( Kcp05V10Profile7Dgts.class ) )
      {
      return mValueObject;
      }
    else
      {
      throw new HostException( "Attempt to get binding " + getBindingName() + " as an incompatible type " + type );
      }
    }

  /**
   * {@inheritDoc}
   */
  public void setObjectValue( final Object bindingValue ) throws HostException
    {
    if( bindingValue == null )
      {
      mValueObject = null;
      return;
      }
    if( bindingValue.getClass().equals( Kcp05V10Profile7Dgts.class ) )
      {
      mValueObject = (Kcp05V10Profile7Dgts) bindingValue;
      }
    else
      {
      throw new HostException( "Attempt to set binding " + getBindingName() + " from an incompatible value " + bindingValue );
      }
    }

  /**
   * @return the java object factory for objects creation
   */
  public ObjectFactory getObjectFactory()
    {
    return mValueObjectFactory;
    }

  /**
   * @param valueObjectFactory the java object factory for objects creation
   */
  public void setObjectFactory( final Object valueObjectFactory )
    {
    mValueObjectFactory = (ObjectFactory) valueObjectFactory;
    }

  /**
   * {@inheritDoc}
   */
  public boolean isSet()
    {
    return ( mValueObject != null );
    }

  /**
   * @return the bound Value object
   */
  public Kcp05V10Profile7Dgts getKcp05V10Profile7Dgts()
    {
    return mValueObject;
    }

  /**
   * The COBOL complex element maximum length in bytes.
   *
   * @return COBOL complex element maximum length in bytes
   */
  public int getByteLength()
    {
    return BYTE_LENGTH;
    }
  }

