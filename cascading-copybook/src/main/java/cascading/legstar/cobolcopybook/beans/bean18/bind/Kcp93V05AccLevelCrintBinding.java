package cascading.legstar.cobolcopybook.beans.bean18.bind;

import cascading.legstar.cobolcopybook.beans.bean18.Kcp93V05AccLevelCrint;
import cascading.legstar.cobolcopybook.beans.bean18.Kcp93V05AccLevelCrintTiers;
import cascading.legstar.cobolcopybook.beans.bean18.ObjectFactory;
import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.common.CComplexBinding;
import com.legstar.coxb.host.HostException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * LegStar Binding for Complex element :
 * Kcp93V05AccLevelCrint.
 * <p/>
 * This class was generated by LegStar Binding generator.
 */
public class Kcp93V05AccLevelCrintBinding extends CComplexBinding
  {

  /**
   * Maximum host bytes size for this complex object.
   */
  private static final int BYTE_LENGTH = 168;
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
   * Child bound to value object property Kcp93V05AccLevelCrintTiers(Kcp93V05AccLevelCrintTiers).
   */
  public ICobolComplexBinding _kcp93V05AccLevelCrintTiers;
  /**
   * Value object to which this cobol complex element is bound.
   */
  private Kcp93V05AccLevelCrint mValueObject;
  /**
   * Indicates that the associated Value object just came from the constructor
   * and doesn't need to be recreated.
   */
  private boolean mUnusedValueObject = false;

  /**
   * Constructor for a root Complex element without a bound Value object.
   */
  public Kcp93V05AccLevelCrintBinding()
    {
    this( null );
    }

  /**
   * Constructor for a root Complex element with a bound Value object.
   *
   * @param valueObject the concrete Value object instance bound to this
   *                    complex element
   */
  public Kcp93V05AccLevelCrintBinding( final Kcp93V05AccLevelCrint valueObject )
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
  public Kcp93V05AccLevelCrintBinding( final String bindingName, final String fieldName, final ICobolComplexBinding parentBinding, final Kcp93V05AccLevelCrint valueObject )
    {

    super( bindingName, fieldName, Kcp93V05AccLevelCrint.class, null, parentBinding );
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

    _kcp93V05AccLevelCrintTiers = new Kcp93V05AccLevelCrintTiersBinding( "Kcp93V05AccLevelCrintTiers", "Kcp93V05AccLevelCrintTiers", this, null );
    _kcp93V05AccLevelCrintTiers.setCobolName( "KCP93V05-ACC-LEVEL-CRINT-TIERS" );
    _kcp93V05AccLevelCrintTiers.setByteLength( 168 );

        /* Add children to children list */
    getChildrenList().add( _kcp93V05AccLevelCrintTiers );

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
    mValueObject = mValueObjectFactory.createKcp93V05AccLevelCrint();
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
        /* Get Value object property _kcp93V05AccLevelCrintTiers */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp93V05AccLevelCrintTiers" + " value=" + mValueObject.getKcp93V05AccLevelCrintTiers() );
      }
    _kcp93V05AccLevelCrintTiers.setObjectValue( mValueObject.getKcp93V05AccLevelCrintTiers() );
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
        bindingValue = child.getObjectValue( Kcp93V05AccLevelCrintTiers.class );
        mValueObject.setKcp93V05AccLevelCrintTiers( (Kcp93V05AccLevelCrintTiers) bindingValue );
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
    if( type.equals( Kcp93V05AccLevelCrint.class ) )
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
    if( bindingValue.getClass().equals( Kcp93V05AccLevelCrint.class ) )
      {
      mValueObject = (Kcp93V05AccLevelCrint) bindingValue;
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
  public Kcp93V05AccLevelCrint getKcp93V05AccLevelCrint()
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

