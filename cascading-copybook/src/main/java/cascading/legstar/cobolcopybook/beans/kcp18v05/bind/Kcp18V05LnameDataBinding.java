package cascading.legstar.cobolcopybook.beans.kcp18v05.bind;

import cascading.legstar.cobolcopybook.beans.kcp18v05.Kcp18V05LnameData;
import cascading.legstar.cobolcopybook.beans.kcp18v05.ObjectFactory;
import com.legstar.coxb.CobolBindingFactory;
import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.ICobolBindingFactory;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.ICobolStringBinding;
import com.legstar.coxb.common.CComplexBinding;
import com.legstar.coxb.host.HostException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * LegStar Binding for Complex element :
 * Kcp18V05LnameData.
 * <p/>
 * This class was generated by LegStar Binding generator.
 */
public class Kcp18V05LnameDataBinding
  extends CComplexBinding
  {

  /** Maximum host bytes size for this complex object. */
  private static final int BYTE_LENGTH = 178;
  /** Binding factory. */
  private static final ICobolBindingFactory BF
    = CobolBindingFactory.getBindingFactory();
  /** Static reference to Value object factory to be used as default. */
  private static final ObjectFactory JF = new ObjectFactory();
  /**
   * Current Value object factory (Defaults to the static one but can be
   * changed).
   */
  private ObjectFactory mValueObjectFactory = JF;
  /** Logger. */
  private final Log _log = LogFactory.getLog( getClass() );
  /** Child bound to value object property Kcp18V05LnameStartDate(String). */
  public ICobolStringBinding _kcp18V05LnameStartDate;
  /** Child bound to value object property Kcp18V05LnameEndDate(String). */
  public ICobolStringBinding _kcp18V05LnameEndDate;
  /** Child bound to value object property Kcp18V05LnameL1(String). */
  public ICobolStringBinding _kcp18V05LnameL1;
  /** Child bound to value object property Kcp18V05LnameL2(String). */
  public ICobolStringBinding _kcp18V05LnameL2;
  /** Child bound to value object property Kcp18V05LnameL3(String). */
  public ICobolStringBinding _kcp18V05LnameL3;
  /** Value object to which this cobol complex element is bound. */
  private Kcp18V05LnameData mValueObject;
  /**
   * Indicates that the associated Value object just came from the constructor
   * and doesn't need to be recreated.
   */
  private boolean mUnusedValueObject = false;

  /**
   * Constructor for a root Complex element without a bound Value object.
   */
  public Kcp18V05LnameDataBinding()
    {
    this( null );
    }

  /**
   * Constructor for a root Complex element with a bound Value object.
   *
   * @param valueObject the concrete Value object instance bound to this
   *                    complex element
   */
  public Kcp18V05LnameDataBinding(
    final Kcp18V05LnameData valueObject )
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
  public Kcp18V05LnameDataBinding(
    final String bindingName,
    final String fieldName,
    final ICobolComplexBinding parentBinding,
    final Kcp18V05LnameData valueObject )
    {

    super( bindingName, fieldName, Kcp18V05LnameData.class, null, parentBinding );
    mValueObject = valueObject;
    if( mValueObject != null )
      {
      mUnusedValueObject = true;
      }
    initChildren();
    setByteLength( BYTE_LENGTH );
    }

  /** Creates a binding property for each child. */
  private void initChildren()
    {
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Initializing started" );
      }
        /* Create binding children instances */

    _kcp18V05LnameStartDate = BF.createStringBinding( "Kcp18V05LnameStartDate",
      "Kcp18V05LnameStartDate", String.class, this );
    _kcp18V05LnameStartDate.setCobolName( "KCP18V05-LNAME-START-DATE" );
    _kcp18V05LnameStartDate.setByteLength( 2 );
    _kcp18V05LnameEndDate = BF.createStringBinding( "Kcp18V05LnameEndDate",
      "Kcp18V05LnameEndDate", String.class, this );
    _kcp18V05LnameEndDate.setCobolName( "KCP18V05-LNAME-END-DATE" );
    _kcp18V05LnameEndDate.setByteLength( 2 );
    _kcp18V05LnameL1 = BF.createStringBinding( "Kcp18V05LnameL1",
      "Kcp18V05LnameL1", String.class, this );
    _kcp18V05LnameL1.setCobolName( "KCP18V05-LNAME-L1" );
    _kcp18V05LnameL1.setByteLength( 58 );
    _kcp18V05LnameL2 = BF.createStringBinding( "Kcp18V05LnameL2",
      "Kcp18V05LnameL2", String.class, this );
    _kcp18V05LnameL2.setCobolName( "KCP18V05-LNAME-L2" );
    _kcp18V05LnameL2.setByteLength( 58 );
    _kcp18V05LnameL3 = BF.createStringBinding( "Kcp18V05LnameL3",
      "Kcp18V05LnameL3", String.class, this );
    _kcp18V05LnameL3.setCobolName( "KCP18V05-LNAME-L3" );
    _kcp18V05LnameL3.setByteLength( 58 );

        /* Add children to children list */
    getChildrenList().add( _kcp18V05LnameStartDate );
    getChildrenList().add( _kcp18V05LnameEndDate );
    getChildrenList().add( _kcp18V05LnameL1 );
    getChildrenList().add( _kcp18V05LnameL2 );
    getChildrenList().add( _kcp18V05LnameL3 );

    if( _log.isDebugEnabled() )
      {
      _log.debug( "Initializing successful" );
      }
    }

  /** {@inheritDoc} */
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
    mValueObject = mValueObjectFactory.createKcp18V05LnameData();
    }

  /** {@inheritDoc} */
  public void setChildrenValues() throws HostException
    {

         /* Make sure there is an associated Value object*/
    if( mValueObject == null )
      {
      createValueObject();
      }
        /* Get Value object property _kcp18V05LnameStartDate */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property "
        + "_kcp18V05LnameStartDate"
        + " value=" + mValueObject.getKcp18V05LnameStartDate() );
      }
    _kcp18V05LnameStartDate.setObjectValue( mValueObject.getKcp18V05LnameStartDate() );
        /* Get Value object property _kcp18V05LnameEndDate */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property "
        + "_kcp18V05LnameEndDate"
        + " value=" + mValueObject.getKcp18V05LnameEndDate() );
      }
    _kcp18V05LnameEndDate.setObjectValue( mValueObject.getKcp18V05LnameEndDate() );
        /* Get Value object property _kcp18V05LnameL1 */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property "
        + "_kcp18V05LnameL1"
        + " value=" + mValueObject.getKcp18V05LnameL1() );
      }
    _kcp18V05LnameL1.setObjectValue( mValueObject.getKcp18V05LnameL1() );
        /* Get Value object property _kcp18V05LnameL2 */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property "
        + "_kcp18V05LnameL2"
        + " value=" + mValueObject.getKcp18V05LnameL2() );
      }
    _kcp18V05LnameL2.setObjectValue( mValueObject.getKcp18V05LnameL2() );
        /* Get Value object property _kcp18V05LnameL3 */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property "
        + "_kcp18V05LnameL3"
        + " value=" + mValueObject.getKcp18V05LnameL3() );
      }
    _kcp18V05LnameL3.setObjectValue( mValueObject.getKcp18V05LnameL3() );
    }

  /** {@inheritDoc} */
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
        bindingValue = child.getObjectValue( String.class );
        mValueObject.setKcp18V05LnameStartDate( (String) bindingValue );
        break;
      case 1:
        bindingValue = child.getObjectValue( String.class );
        mValueObject.setKcp18V05LnameEndDate( (String) bindingValue );
        break;
      case 2:
        bindingValue = child.getObjectValue( String.class );
        mValueObject.setKcp18V05LnameL1( (String) bindingValue );
        break;
      case 3:
        bindingValue = child.getObjectValue( String.class );
        mValueObject.setKcp18V05LnameL2( (String) bindingValue );
        break;
      case 4:
        bindingValue = child.getObjectValue( String.class );
        mValueObject.setKcp18V05LnameL3( (String) bindingValue );
        break;
      default:
        break;
      }
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Setting value of Value object property "
        + child.getJaxbName()
        + " value=" + bindingValue );
      }
    }

  /** {@inheritDoc} */
  public Object getObjectValue(
    final Class<?> type ) throws HostException
    {
    if( type.equals( Kcp18V05LnameData.class ) )
      {
      return mValueObject;
      }
    else
      {
      throw new HostException( "Attempt to get binding " + getBindingName()
        + " as an incompatible type " + type );
      }
    }

  /** {@inheritDoc} */
  public void setObjectValue(
    final Object bindingValue ) throws HostException
    {
    if( bindingValue == null )
      {
      mValueObject = null;
      return;
      }
    if( bindingValue.getClass().equals( Kcp18V05LnameData.class ) )
      {
      mValueObject = (Kcp18V05LnameData) bindingValue;
      }
    else
      {
      throw new HostException( "Attempt to set binding " + getBindingName()
        + " from an incompatible value " + bindingValue );
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

  /** {@inheritDoc} */
  public boolean isSet()
    {
    return ( mValueObject != null );
    }

  /**
   * @return the bound Value object
   */
  public Kcp18V05LnameData getKcp18V05LnameData()
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
