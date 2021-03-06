package cascading.legstar.cobolcopybook.beans.bean11.bind;

import java.util.List;

import cascading.legstar.cobolcopybook.beans.bean11.Kcp08V05AuthLimitData;
import cascading.legstar.cobolcopybook.beans.bean11.Kcp08V05LimitTable;
import cascading.legstar.cobolcopybook.beans.bean11.ObjectFactory;
import com.legstar.coxb.CobolBindingFactory;
import com.legstar.coxb.ICobolArrayComplexBinding;
import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.ICobolBindingFactory;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.ICobolZonedDecimalBinding;
import com.legstar.coxb.common.CComplexBinding;
import com.legstar.coxb.host.HostException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * LegStar Binding for Complex element :
 * Kcp08V05AuthLimitData.
 * <p/>
 * This class was generated by LegStar Binding generator.
 */
public class Kcp08V05AuthLimitDataBinding extends CComplexBinding
  {

  /**
   * Maximum host bytes size for this complex object.
   */
  private static final int BYTE_LENGTH = 114;
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
   * Child bound to value object property Kcp08V05OpLimitInd(Integer).
   */
  public ICobolZonedDecimalBinding _kcp08V05OpLimitInd;
  /**
   * Child bound to value object property Kcp08V05NoOfLims(Integer).
   */
  public ICobolZonedDecimalBinding _kcp08V05NoOfLims;
  /**
   * Child bound to value object property Kcp08V05LimitTable(Kcp08V05LimitTable).
   */
  public ICobolArrayComplexBinding _kcp08V05LimitTableWrapper;
  /**
   * Binding item for complex array binding Kcp08V05LimitTable.
   */
  public ICobolComplexBinding _kcp08V05LimitTableWrapperItem;
  /**
   * Value object to which this cobol complex element is bound.
   */
  private Kcp08V05AuthLimitData mValueObject;
  /**
   * Indicates that the associated Value object just came from the constructor
   * and doesn't need to be recreated.
   */
  private boolean mUnusedValueObject = false;

  /**
   * Constructor for a root Complex element without a bound Value object.
   */
  public Kcp08V05AuthLimitDataBinding()
    {
    this( null );
    }

  /**
   * Constructor for a root Complex element with a bound Value object.
   *
   * @param valueObject the concrete Value object instance bound to this
   *                    complex element
   */
  public Kcp08V05AuthLimitDataBinding( final Kcp08V05AuthLimitData valueObject )
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
  public Kcp08V05AuthLimitDataBinding( final String bindingName, final String fieldName, final ICobolComplexBinding parentBinding, final Kcp08V05AuthLimitData valueObject )
    {

    super( bindingName, fieldName, Kcp08V05AuthLimitData.class, null, parentBinding );
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

    _kcp08V05OpLimitInd = BF.createZonedDecimalBinding( "Kcp08V05OpLimitInd", "Kcp08V05OpLimitInd", Integer.class, this );
    _kcp08V05OpLimitInd.setCobolName( "KCP08V05-OP-LIMIT-IND" );
    _kcp08V05OpLimitInd.setByteLength( 1 );
    _kcp08V05OpLimitInd.setTotalDigits( 1 );
    _kcp08V05NoOfLims = BF.createZonedDecimalBinding( "Kcp08V05NoOfLims", "Kcp08V05NoOfLims", Integer.class, this );
    _kcp08V05NoOfLims.setCobolName( "KCP08V05-NO-OF-LIMS" );
    _kcp08V05NoOfLims.setByteLength( 3 );
    _kcp08V05NoOfLims.setTotalDigits( 3 );
    _kcp08V05NoOfLims.setIsODOObject( true );
    _kcp08V05LimitTableWrapperItem = new Kcp08V05LimitTableBinding( "Kcp08V05LimitTableWrapperItem", "Kcp08V05LimitTable", this, null );
    _kcp08V05LimitTableWrapper = new Kcp08V05LimitTableWrapperBinding( "Kcp08V05LimitTableWrapper", "Kcp08V05LimitTable", this, _kcp08V05LimitTableWrapperItem );
    _kcp08V05LimitTableWrapper.setCobolName( "KCP08V05-LIMIT-TABLE" );
    _kcp08V05LimitTableWrapper.setByteLength( 110 );
    _kcp08V05LimitTableWrapper.setItemByteLength( 11 );
    _kcp08V05LimitTableWrapper.setMaxOccurs( 10 );
    _kcp08V05LimitTableWrapper.setDependingOn( "KCP08V05-NO-OF-LIMS" );

        /* Add children to children list */
    getChildrenList().add( _kcp08V05OpLimitInd );
    getChildrenList().add( _kcp08V05NoOfLims );
    getChildrenList().add( _kcp08V05LimitTableWrapper );

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
    mValueObject = mValueObjectFactory.createKcp08V05AuthLimitData();
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
        /* Get Value object property _kcp08V05OpLimitInd */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp08V05OpLimitInd" + " value=" + mValueObject.getKcp08V05OpLimitInd() );
      }
    _kcp08V05OpLimitInd.setObjectValue( mValueObject.getKcp08V05OpLimitInd() );
        /* Get Value object property _kcp08V05NoOfLims */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp08V05NoOfLims" + " value=" + mValueObject.getKcp08V05NoOfLims() );
      }
    _kcp08V05NoOfLims.setObjectValue( mValueObject.getKcp08V05NoOfLims() );
        /* Get Value object property _kcp08V05LimitTableWrapper */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp08V05LimitTableWrapper" + " value=" + mValueObject.getKcp08V05LimitTable() );
      }
    _kcp08V05LimitTableWrapper.setObjectValue( mValueObject.getKcp08V05LimitTable() );
        /* For variable size array or list, we make sure any
         * associated counter is updated */
    setCounterValue( _kcp08V05LimitTableWrapper.getDependingOn(), ( (List<?>) mValueObject.getKcp08V05LimitTable() ).size() );
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
        mValueObject.setKcp08V05OpLimitInd( (Integer) bindingValue );
        break;
      case 1:
        bindingValue = child.getObjectValue( Integer.class );
        mValueObject.setKcp08V05NoOfLims( (Integer) bindingValue );
        break;
      case 2:
        bindingValue = child.getObjectValue( Kcp08V05LimitTable.class );
        List<Kcp08V05LimitTable> listKcp08V05LimitTableWrapper = cast( bindingValue );
        mValueObject.getKcp08V05LimitTable().clear();
        mValueObject.getKcp08V05LimitTable().addAll( listKcp08V05LimitTableWrapper );
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
    if( type.equals( Kcp08V05AuthLimitData.class ) )
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
    if( bindingValue.getClass().equals( Kcp08V05AuthLimitData.class ) )
      {
      mValueObject = (Kcp08V05AuthLimitData) bindingValue;
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
  public Kcp08V05AuthLimitData getKcp08V05AuthLimitData()
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

