package cascading.legstar.cobolcopybook.beans.bean19.bind;

import cascading.legstar.cobolcopybook.beans.bean19.Kcp94V05AccLevelCrintData;
import cascading.legstar.cobolcopybook.beans.bean19.Kcp94V05InterestRateData;
import cascading.legstar.cobolcopybook.beans.bean19.ObjectFactory;
import com.legstar.coxb.CobolBindingFactory;
import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.ICobolBindingFactory;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.ICobolPackedDecimalBinding;
import com.legstar.coxb.common.CComplexBinding;
import com.legstar.coxb.host.HostException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * LegStar Binding for Complex element :
 * Kcp94V05AccLevelCrintData.
 * <p/>
 * This class was generated by LegStar Binding generator.
 */
public class Kcp94V05AccLevelCrintDataBinding extends CComplexBinding
  {

  /**
   * Maximum host bytes size for this complex object.
   */
  private static final int BYTE_LENGTH = 824;
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
   * Child bound to value object property Kcp94V05NoOfTiers1(Short).
   */
  public ICobolPackedDecimalBinding _kcp94V05NoOfTiers1;
  /**
   * Child bound to value object property Kcp94V05InterestRateData(Kcp94V05InterestRateData).
   */
  public ICobolComplexBinding _kcp94V05InterestRateData;
  /**
   * Value object to which this cobol complex element is bound.
   */
  private Kcp94V05AccLevelCrintData mValueObject;
  /**
   * Indicates that the associated Value object just came from the constructor
   * and doesn't need to be recreated.
   */
  private boolean mUnusedValueObject = false;

  /**
   * Constructor for a root Complex element without a bound Value object.
   */
  public Kcp94V05AccLevelCrintDataBinding()
    {
    this( null );
    }

  /**
   * Constructor for a root Complex element with a bound Value object.
   *
   * @param valueObject the concrete Value object instance bound to this
   *                    complex element
   */
  public Kcp94V05AccLevelCrintDataBinding( final Kcp94V05AccLevelCrintData valueObject )
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
  public Kcp94V05AccLevelCrintDataBinding( final String bindingName, final String fieldName, final ICobolComplexBinding parentBinding, final Kcp94V05AccLevelCrintData valueObject )
    {

    super( bindingName, fieldName, Kcp94V05AccLevelCrintData.class, null, parentBinding );
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

    _kcp94V05NoOfTiers1 = BF.createPackedDecimalBinding( "Kcp94V05NoOfTiers1", "Kcp94V05NoOfTiers1", Short.class, this );
    _kcp94V05NoOfTiers1.setCobolName( "KCP94V05-NO-OF-TIERS1" );
    _kcp94V05NoOfTiers1.setByteLength( 2 );
    _kcp94V05NoOfTiers1.setTotalDigits( 3 );
    _kcp94V05NoOfTiers1.setIsSigned( true );
    _kcp94V05InterestRateData = new Kcp94V05InterestRateDataBinding( "Kcp94V05InterestRateData", "Kcp94V05InterestRateData", this, null );
    _kcp94V05InterestRateData.setCobolName( "KCP94V05-INTEREST-RATE-DATA" );
    _kcp94V05InterestRateData.setByteLength( 822 );

        /* Add children to children list */
    getChildrenList().add( _kcp94V05NoOfTiers1 );
    getChildrenList().add( _kcp94V05InterestRateData );

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
    mValueObject = mValueObjectFactory.createKcp94V05AccLevelCrintData();
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
        /* Get Value object property _kcp94V05NoOfTiers1 */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp94V05NoOfTiers1" + " value=" + mValueObject.getKcp94V05NoOfTiers1() );
      }
    _kcp94V05NoOfTiers1.setObjectValue( mValueObject.getKcp94V05NoOfTiers1() );
        /* Get Value object property _kcp94V05InterestRateData */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp94V05InterestRateData" + " value=" + mValueObject.getKcp94V05InterestRateData() );
      }
    _kcp94V05InterestRateData.setObjectValue( mValueObject.getKcp94V05InterestRateData() );
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
        mValueObject.setKcp94V05NoOfTiers1( (Short) bindingValue );
        break;
      case 1:
        bindingValue = child.getObjectValue( Kcp94V05InterestRateData.class );
        mValueObject.setKcp94V05InterestRateData( (Kcp94V05InterestRateData) bindingValue );
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
    if( type.equals( Kcp94V05AccLevelCrintData.class ) )
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
    if( bindingValue.getClass().equals( Kcp94V05AccLevelCrintData.class ) )
      {
      mValueObject = (Kcp94V05AccLevelCrintData) bindingValue;
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
  public Kcp94V05AccLevelCrintData getKcp94V05AccLevelCrintData()
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

