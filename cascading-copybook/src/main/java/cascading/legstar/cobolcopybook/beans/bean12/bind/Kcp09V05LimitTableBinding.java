package cascading.legstar.cobolcopybook.beans.bean12.bind;

import java.math.BigDecimal;

import cascading.legstar.cobolcopybook.beans.bean12.Kcp09V05LimitTable;
import cascading.legstar.cobolcopybook.beans.bean12.ObjectFactory;
import com.legstar.coxb.CobolBindingFactory;
import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.ICobolBindingFactory;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.ICobolPackedDecimalBinding;
import com.legstar.coxb.ICobolStringBinding;
import com.legstar.coxb.common.CComplexBinding;
import com.legstar.coxb.host.HostException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * LegStar Binding for Complex element :
 * Kcp09V05LimitTable.
 * <p/>
 * This class was generated by LegStar Binding generator.
 */
public class Kcp09V05LimitTableBinding extends CComplexBinding
  {

  /**
   * Maximum host bytes size for this complex object.
   */
  private static final int BYTE_LENGTH = 11;
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
   * Child bound to value object property Kcp09V05LimitIdent(Short).
   */
  public ICobolPackedDecimalBinding _kcp09V05LimitIdent;
  /**
   * Child bound to value object property Kcp09V05Limit(BigDecimal).
   */
  public ICobolPackedDecimalBinding _kcp09V05Limit;
  /**
   * Child bound to value object property Kcp09V05LimitSubCode(String).
   */
  public ICobolStringBinding _kcp09V05LimitSubCode;
  /**
   * Value object to which this cobol complex element is bound.
   */
  private Kcp09V05LimitTable mValueObject;
  /**
   * Indicates that the associated Value object just came from the constructor
   * and doesn't need to be recreated.
   */
  private boolean mUnusedValueObject = false;

  /**
   * Constructor for a root Complex element without a bound Value object.
   */
  public Kcp09V05LimitTableBinding()
    {
    this( null );
    }

  /**
   * Constructor for a root Complex element with a bound Value object.
   *
   * @param valueObject the concrete Value object instance bound to this
   *                    complex element
   */
  public Kcp09V05LimitTableBinding( final Kcp09V05LimitTable valueObject )
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
  public Kcp09V05LimitTableBinding( final String bindingName, final String fieldName, final ICobolComplexBinding parentBinding, final Kcp09V05LimitTable valueObject )
    {

    super( bindingName, fieldName, Kcp09V05LimitTable.class, null, parentBinding );
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

    _kcp09V05LimitIdent = BF.createPackedDecimalBinding( "Kcp09V05LimitIdent", "Kcp09V05LimitIdent", Short.class, this );
    _kcp09V05LimitIdent.setCobolName( "KCP09V05-LIMIT-IDENT" );
    _kcp09V05LimitIdent.setByteLength( 2 );
    _kcp09V05LimitIdent.setTotalDigits( 3 );
    _kcp09V05LimitIdent.setIsSigned( true );
    _kcp09V05Limit = BF.createPackedDecimalBinding( "Kcp09V05Limit", "Kcp09V05Limit", BigDecimal.class, this );
    _kcp09V05Limit.setCobolName( "KCP09V05-LIMIT" );
    _kcp09V05Limit.setByteLength( 8 );
    _kcp09V05Limit.setTotalDigits( 15 );
    _kcp09V05Limit.setFractionDigits( 2 );
    _kcp09V05Limit.setIsSigned( true );
    _kcp09V05LimitSubCode = BF.createStringBinding( "Kcp09V05LimitSubCode", "Kcp09V05LimitSubCode", String.class, this );
    _kcp09V05LimitSubCode.setCobolName( "KCP09V05-LIMIT-SUB-CODE" );
    _kcp09V05LimitSubCode.setByteLength( 1 );

        /* Add children to children list */
    getChildrenList().add( _kcp09V05LimitIdent );
    getChildrenList().add( _kcp09V05Limit );
    getChildrenList().add( _kcp09V05LimitSubCode );

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
    mValueObject = mValueObjectFactory.createKcp09V05LimitTable();
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
        /* Get Value object property _kcp09V05LimitIdent */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp09V05LimitIdent" + " value=" + mValueObject.getKcp09V05LimitIdent() );
      }
    _kcp09V05LimitIdent.setObjectValue( mValueObject.getKcp09V05LimitIdent() );
        /* Get Value object property _kcp09V05Limit */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp09V05Limit" + " value=" + mValueObject.getKcp09V05Limit() );
      }
    _kcp09V05Limit.setObjectValue( mValueObject.getKcp09V05Limit() );
        /* Get Value object property _kcp09V05LimitSubCode */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp09V05LimitSubCode" + " value=" + mValueObject.getKcp09V05LimitSubCode() );
      }
    _kcp09V05LimitSubCode.setObjectValue( mValueObject.getKcp09V05LimitSubCode() );
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
        bindingValue = child.getObjectValue( Short.class );
        mValueObject.setKcp09V05LimitIdent( (Short) bindingValue );
        break;
      case 1:
        bindingValue = child.getObjectValue( BigDecimal.class );
        mValueObject.setKcp09V05Limit( (BigDecimal) bindingValue );
        break;
      case 2:
        bindingValue = child.getObjectValue( String.class );
        mValueObject.setKcp09V05LimitSubCode( (String) bindingValue );
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
    if( type.equals( Kcp09V05LimitTable.class ) )
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
    if( bindingValue.getClass().equals( Kcp09V05LimitTable.class ) )
      {
      mValueObject = (Kcp09V05LimitTable) bindingValue;
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
  public Kcp09V05LimitTable getKcp09V05LimitTable()
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

