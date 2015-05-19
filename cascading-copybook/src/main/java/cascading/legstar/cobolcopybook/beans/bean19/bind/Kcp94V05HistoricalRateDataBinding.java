package cascading.legstar.cobolcopybook.beans.bean19.bind;

import java.math.BigDecimal;

import cascading.legstar.cobolcopybook.beans.bean19.Kcp94V05HistoricalRateData;
import cascading.legstar.cobolcopybook.beans.bean19.ObjectFactory;
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
 * Kcp94V05HistoricalRateData.
 * <p/>
 * This class was generated by LegStar Binding generator.
 */
public class Kcp94V05HistoricalRateDataBinding extends CComplexBinding
  {

  /**
   * Maximum host bytes size for this complex object.
   */
  private static final int BYTE_LENGTH = 32;
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
   * Child bound to value object property Kcp94V05RateEffectiveDate(String).
   */
  public ICobolStringBinding _kcp94V05RateEffectiveDate;
  /**
   * Child bound to value object property Kcp94V05EffectiveRate(BigDecimal).
   */
  public ICobolPackedDecimalBinding _kcp94V05EffectiveRate;
  /**
   * Child bound to value object property Kcp94V05RateCode(String).
   */
  public ICobolStringBinding _kcp94V05RateCode;
  /**
   * Child bound to value object property Kcp94V05DefaultRateCode(String).
   */
  public ICobolStringBinding _kcp94V05DefaultRateCode;
  /**
   * Child bound to value object property Kcp94V05MinimumRate(BigDecimal).
   */
  public ICobolPackedDecimalBinding _kcp94V05MinimumRate;
  /**
   * Child bound to value object property Kcp94V05RateLink(BigDecimal).
   */
  public ICobolPackedDecimalBinding _kcp94V05RateLink;
  /**
   * Child bound to value object property Kcp94V05RateConsistencyInd(String).
   */
  public ICobolStringBinding _kcp94V05RateConsistencyInd;
  /**
   * Child bound to value object property Kcp94V05RateName(String).
   */
  public ICobolStringBinding _kcp94V05RateName;
  /**
   * Child bound to value object property Kcp94V05ZeroRateCode(String).
   */
  public ICobolStringBinding _kcp94V05ZeroRateCode;
  /**
   * Child bound to value object property Kcp94V05CrintType(Short).
   */
  public ICobolPackedDecimalBinding _kcp94V05CrintType;
  /**
   * Value object to which this cobol complex element is bound.
   */
  private Kcp94V05HistoricalRateData mValueObject;
  /**
   * Indicates that the associated Value object just came from the constructor
   * and doesn't need to be recreated.
   */
  private boolean mUnusedValueObject = false;

  /**
   * Constructor for a root Complex element without a bound Value object.
   */
  public Kcp94V05HistoricalRateDataBinding()
    {
    this( null );
    }

  /**
   * Constructor for a root Complex element with a bound Value object.
   *
   * @param valueObject the concrete Value object instance bound to this
   *                    complex element
   */
  public Kcp94V05HistoricalRateDataBinding( final Kcp94V05HistoricalRateData valueObject )
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
  public Kcp94V05HistoricalRateDataBinding( final String bindingName, final String fieldName, final ICobolComplexBinding parentBinding, final Kcp94V05HistoricalRateData valueObject )
    {

    super( bindingName, fieldName, Kcp94V05HistoricalRateData.class, null, parentBinding );
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

    _kcp94V05RateEffectiveDate = BF.createStringBinding( "Kcp94V05RateEffectiveDate", "Kcp94V05RateEffectiveDate", String.class, this );
    _kcp94V05RateEffectiveDate.setCobolName( "KCP94V05-RATE-EFFECTIVE-DATE" );
    _kcp94V05RateEffectiveDate.setByteLength( 2 );
    _kcp94V05EffectiveRate = BF.createPackedDecimalBinding( "Kcp94V05EffectiveRate", "Kcp94V05EffectiveRate", BigDecimal.class, this );
    _kcp94V05EffectiveRate.setCobolName( "KCP94V05-EFFECTIVE-RATE" );
    _kcp94V05EffectiveRate.setByteLength( 3 );
    _kcp94V05EffectiveRate.setTotalDigits( 5 );
    _kcp94V05EffectiveRate.setFractionDigits( 3 );
    _kcp94V05EffectiveRate.setIsSigned( true );
    _kcp94V05RateCode = BF.createStringBinding( "Kcp94V05RateCode", "Kcp94V05RateCode", String.class, this );
    _kcp94V05RateCode.setCobolName( "KCP94V05-RATE-CODE" );
    _kcp94V05RateCode.setByteLength( 1 );
    _kcp94V05DefaultRateCode = BF.createStringBinding( "Kcp94V05DefaultRateCode", "Kcp94V05DefaultRateCode", String.class, this );
    _kcp94V05DefaultRateCode.setCobolName( "KCP94V05-DEFAULT-RATE-CODE" );
    _kcp94V05DefaultRateCode.setByteLength( 1 );
    _kcp94V05MinimumRate = BF.createPackedDecimalBinding( "Kcp94V05MinimumRate", "Kcp94V05MinimumRate", BigDecimal.class, this );
    _kcp94V05MinimumRate.setCobolName( "KCP94V05-MINIMUM-RATE" );
    _kcp94V05MinimumRate.setByteLength( 3 );
    _kcp94V05MinimumRate.setTotalDigits( 5 );
    _kcp94V05MinimumRate.setFractionDigits( 3 );
    _kcp94V05MinimumRate.setIsSigned( true );
    _kcp94V05RateLink = BF.createPackedDecimalBinding( "Kcp94V05RateLink", "Kcp94V05RateLink", BigDecimal.class, this );
    _kcp94V05RateLink.setCobolName( "KCP94V05-RATE-LINK" );
    _kcp94V05RateLink.setByteLength( 3 );
    _kcp94V05RateLink.setTotalDigits( 5 );
    _kcp94V05RateLink.setFractionDigits( 3 );
    _kcp94V05RateLink.setIsSigned( true );
    _kcp94V05RateConsistencyInd = BF.createStringBinding( "Kcp94V05RateConsistencyInd", "Kcp94V05RateConsistencyInd", String.class, this );
    _kcp94V05RateConsistencyInd.setCobolName( "KCP94V05-RATE-CONSISTENCY-IND" );
    _kcp94V05RateConsistencyInd.setByteLength( 1 );
    _kcp94V05RateName = BF.createStringBinding( "Kcp94V05RateName", "Kcp94V05RateName", String.class, this );
    _kcp94V05RateName.setCobolName( "KCP94V05-RATE-NAME" );
    _kcp94V05RateName.setByteLength( 15 );
    _kcp94V05ZeroRateCode = BF.createStringBinding( "Kcp94V05ZeroRateCode", "Kcp94V05ZeroRateCode", String.class, this );
    _kcp94V05ZeroRateCode.setCobolName( "KCP94V05-ZERO-RATE-CODE" );
    _kcp94V05ZeroRateCode.setByteLength( 1 );
    _kcp94V05CrintType = BF.createPackedDecimalBinding( "Kcp94V05CrintType", "Kcp94V05CrintType", Short.class, this );
    _kcp94V05CrintType.setCobolName( "KCP94V05-CRINT-TYPE" );
    _kcp94V05CrintType.setByteLength( 2 );
    _kcp94V05CrintType.setTotalDigits( 3 );
    _kcp94V05CrintType.setIsSigned( true );

        /* Add children to children list */
    getChildrenList().add( _kcp94V05RateEffectiveDate );
    getChildrenList().add( _kcp94V05EffectiveRate );
    getChildrenList().add( _kcp94V05RateCode );
    getChildrenList().add( _kcp94V05DefaultRateCode );
    getChildrenList().add( _kcp94V05MinimumRate );
    getChildrenList().add( _kcp94V05RateLink );
    getChildrenList().add( _kcp94V05RateConsistencyInd );
    getChildrenList().add( _kcp94V05RateName );
    getChildrenList().add( _kcp94V05ZeroRateCode );
    getChildrenList().add( _kcp94V05CrintType );

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
    mValueObject = mValueObjectFactory.createKcp94V05HistoricalRateData();
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
        /* Get Value object property _kcp94V05RateEffectiveDate */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp94V05RateEffectiveDate" + " value=" + mValueObject.getKcp94V05RateEffectiveDate() );
      }
    _kcp94V05RateEffectiveDate.setObjectValue( mValueObject.getKcp94V05RateEffectiveDate() );
        /* Get Value object property _kcp94V05EffectiveRate */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp94V05EffectiveRate" + " value=" + mValueObject.getKcp94V05EffectiveRate() );
      }
    _kcp94V05EffectiveRate.setObjectValue( mValueObject.getKcp94V05EffectiveRate() );
        /* Get Value object property _kcp94V05RateCode */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp94V05RateCode" + " value=" + mValueObject.getKcp94V05RateCode() );
      }
    _kcp94V05RateCode.setObjectValue( mValueObject.getKcp94V05RateCode() );
        /* Get Value object property _kcp94V05DefaultRateCode */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp94V05DefaultRateCode" + " value=" + mValueObject.getKcp94V05DefaultRateCode() );
      }
    _kcp94V05DefaultRateCode.setObjectValue( mValueObject.getKcp94V05DefaultRateCode() );
        /* Get Value object property _kcp94V05MinimumRate */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp94V05MinimumRate" + " value=" + mValueObject.getKcp94V05MinimumRate() );
      }
    _kcp94V05MinimumRate.setObjectValue( mValueObject.getKcp94V05MinimumRate() );
        /* Get Value object property _kcp94V05RateLink */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp94V05RateLink" + " value=" + mValueObject.getKcp94V05RateLink() );
      }
    _kcp94V05RateLink.setObjectValue( mValueObject.getKcp94V05RateLink() );
        /* Get Value object property _kcp94V05RateConsistencyInd */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp94V05RateConsistencyInd" + " value=" + mValueObject.getKcp94V05RateConsistencyInd() );
      }
    _kcp94V05RateConsistencyInd.setObjectValue( mValueObject.getKcp94V05RateConsistencyInd() );
        /* Get Value object property _kcp94V05RateName */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp94V05RateName" + " value=" + mValueObject.getKcp94V05RateName() );
      }
    _kcp94V05RateName.setObjectValue( mValueObject.getKcp94V05RateName() );
        /* Get Value object property _kcp94V05ZeroRateCode */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp94V05ZeroRateCode" + " value=" + mValueObject.getKcp94V05ZeroRateCode() );
      }
    _kcp94V05ZeroRateCode.setObjectValue( mValueObject.getKcp94V05ZeroRateCode() );
        /* Get Value object property _kcp94V05CrintType */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp94V05CrintType" + " value=" + mValueObject.getKcp94V05CrintType() );
      }
    _kcp94V05CrintType.setObjectValue( mValueObject.getKcp94V05CrintType() );
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
        bindingValue = child.getObjectValue( String.class );
        mValueObject.setKcp94V05RateEffectiveDate( (String) bindingValue );
        break;
      case 1:
        bindingValue = child.getObjectValue( BigDecimal.class );
        mValueObject.setKcp94V05EffectiveRate( (BigDecimal) bindingValue );
        break;
      case 2:
        bindingValue = child.getObjectValue( String.class );
        mValueObject.setKcp94V05RateCode( (String) bindingValue );
        break;
      case 3:
        bindingValue = child.getObjectValue( String.class );
        mValueObject.setKcp94V05DefaultRateCode( (String) bindingValue );
        break;
      case 4:
        bindingValue = child.getObjectValue( BigDecimal.class );
        mValueObject.setKcp94V05MinimumRate( (BigDecimal) bindingValue );
        break;
      case 5:
        bindingValue = child.getObjectValue( BigDecimal.class );
        mValueObject.setKcp94V05RateLink( (BigDecimal) bindingValue );
        break;
      case 6:
        bindingValue = child.getObjectValue( String.class );
        mValueObject.setKcp94V05RateConsistencyInd( (String) bindingValue );
        break;
      case 7:
        bindingValue = child.getObjectValue( String.class );
        mValueObject.setKcp94V05RateName( (String) bindingValue );
        break;
      case 8:
        bindingValue = child.getObjectValue( String.class );
        mValueObject.setKcp94V05ZeroRateCode( (String) bindingValue );
        break;
      case 9:
        bindingValue = child.getObjectValue( Short.class );
        mValueObject.setKcp94V05CrintType( (Short) bindingValue );
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
    if( type.equals( Kcp94V05HistoricalRateData.class ) )
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
    if( bindingValue.getClass().equals( Kcp94V05HistoricalRateData.class ) )
      {
      mValueObject = (Kcp94V05HistoricalRateData) bindingValue;
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
  public Kcp94V05HistoricalRateData getKcp94V05HistoricalRateData()
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

