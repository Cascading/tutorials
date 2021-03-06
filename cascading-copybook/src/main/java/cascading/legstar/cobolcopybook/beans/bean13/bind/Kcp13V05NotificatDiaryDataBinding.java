package cascading.legstar.cobolcopybook.beans.bean13.bind;

import java.util.List;

import cascading.legstar.cobolcopybook.beans.bean13.Kcp13V05NotificatDiaryData;
import cascading.legstar.cobolcopybook.beans.bean13.Kcp13V05NotificatFreqDetail;
import cascading.legstar.cobolcopybook.beans.bean13.Kcp13V05PrenotPrintDates;
import cascading.legstar.cobolcopybook.beans.bean13.ObjectFactory;
import com.legstar.coxb.CobolBindingFactory;
import com.legstar.coxb.ICobolArrayComplexBinding;
import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.ICobolBindingFactory;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.ICobolPackedDecimalBinding;
import com.legstar.coxb.ICobolStringBinding;
import com.legstar.coxb.ICobolZonedDecimalBinding;
import com.legstar.coxb.common.CComplexBinding;
import com.legstar.coxb.host.HostException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * LegStar Binding for Complex element :
 * Kcp13V05NotificatDiaryData.
 * <p/>
 * This class was generated by LegStar Binding generator.
 */
public class Kcp13V05NotificatDiaryDataBinding extends CComplexBinding
  {

  /**
   * Maximum host bytes size for this complex object.
   */
  private static final int BYTE_LENGTH = 159;
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
   * Child bound to value object property Kcp13V05NotificatTypeCode(String).
   */
  public ICobolStringBinding _kcp13V05NotificatTypeCode;
  /**
   * Child bound to value object property Kcp13V05NotificatSubTypeCd(String).
   */
  public ICobolStringBinding _kcp13V05NotificatSubTypeCd;
  /**
   * Child bound to value object property Kcp13V05NotificatSuppressCd(String).
   */
  public ICobolStringBinding _kcp13V05NotificatSuppressCd;
  /**
   * Child bound to value object property Kcp13V05NotificatMmsgSupCd(String).
   */
  public ICobolStringBinding _kcp13V05NotificatMmsgSupCd;
  /**
   * Child bound to value object property Kcp13V05NotificatPmsgSupCd(String).
   */
  public ICobolStringBinding _kcp13V05NotificatPmsgSupCd;
  /**
   * Child bound to value object property Kcp13V05StmtDest(String).
   */
  public ICobolStringBinding _kcp13V05StmtDest;
  /**
   * Child bound to value object property Kcp13V05StmtDupDest(String).
   */
  public ICobolStringBinding _kcp13V05StmtDupDest;
  /**
   * Child bound to value object property Kcp13V05StmtCind(String).
   */
  public ICobolStringBinding _kcp13V05StmtCind;
  /**
   * Child bound to value object property Kcp13V05Dissenter(String).
   */
  public ICobolStringBinding _kcp13V05Dissenter;
  /**
   * Child bound to value object property Kcp13V05StmtDup(String).
   */
  public ICobolStringBinding _kcp13V05StmtDup;
  /**
   * Child bound to value object property Kcp13V05StmtDestClass(Integer).
   */
  public ICobolZonedDecimalBinding _kcp13V05StmtDestClass;
  /**
   * Child bound to value object property Kcp13V05StmtLayout(Short).
   */
  public ICobolPackedDecimalBinding _kcp13V05StmtLayout;
  /**
   * Child bound to value object property Kcp13V05NoOfPrenotDates(Integer).
   */
  public ICobolZonedDecimalBinding _kcp13V05NoOfPrenotDates;
  /**
   * Child bound to value object property Kcp13V05PrenotPrintDates(Kcp13V05PrenotPrintDates).
   */
  public ICobolArrayComplexBinding _kcp13V05PrenotPrintDatesWrapper;
  /**
   * Binding item for complex array binding Kcp13V05PrenotPrintDates.
   */
  public ICobolComplexBinding _kcp13V05PrenotPrintDatesWrapperItem;
  /**
   * Child bound to value object property Kcp13V05NoOfFrequencies(Integer).
   */
  public ICobolZonedDecimalBinding _kcp13V05NoOfFrequencies;
  /**
   * Child bound to value object property Kcp13V05NotificatFreqDetail(Kcp13V05NotificatFreqDetail).
   */
  public ICobolArrayComplexBinding _kcp13V05NotificatFreqDetailWrapper;
  /**
   * Binding item for complex array binding Kcp13V05NotificatFreqDetail.
   */
  public ICobolComplexBinding _kcp13V05NotificatFreqDetailWrapperItem;
  /**
   * Value object to which this cobol complex element is bound.
   */
  private Kcp13V05NotificatDiaryData mValueObject;
  /**
   * Indicates that the associated Value object just came from the constructor
   * and doesn't need to be recreated.
   */
  private boolean mUnusedValueObject = false;

  /**
   * Constructor for a root Complex element without a bound Value object.
   */
  public Kcp13V05NotificatDiaryDataBinding()
    {
    this( null );
    }

  /**
   * Constructor for a root Complex element with a bound Value object.
   *
   * @param valueObject the concrete Value object instance bound to this
   *                    complex element
   */
  public Kcp13V05NotificatDiaryDataBinding( final Kcp13V05NotificatDiaryData valueObject )
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
  public Kcp13V05NotificatDiaryDataBinding( final String bindingName, final String fieldName, final ICobolComplexBinding parentBinding, final Kcp13V05NotificatDiaryData valueObject )
    {

    super( bindingName, fieldName, Kcp13V05NotificatDiaryData.class, null, parentBinding );
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

    _kcp13V05NotificatTypeCode = BF.createStringBinding( "Kcp13V05NotificatTypeCode", "Kcp13V05NotificatTypeCode", String.class, this );
    _kcp13V05NotificatTypeCode.setCobolName( "KCP13V05-NOTIFICAT-TYPE-CODE" );
    _kcp13V05NotificatTypeCode.setByteLength( 1 );
    _kcp13V05NotificatSubTypeCd = BF.createStringBinding( "Kcp13V05NotificatSubTypeCd", "Kcp13V05NotificatSubTypeCd", String.class, this );
    _kcp13V05NotificatSubTypeCd.setCobolName( "KCP13V05-NOTIFICAT-SUB-TYPE-CD" );
    _kcp13V05NotificatSubTypeCd.setByteLength( 1 );
    _kcp13V05NotificatSuppressCd = BF.createStringBinding( "Kcp13V05NotificatSuppressCd", "Kcp13V05NotificatSuppressCd", String.class, this );
    _kcp13V05NotificatSuppressCd.setCobolName( "KCP13V05-NOTIFICAT-SUPPRESS-CD" );
    _kcp13V05NotificatSuppressCd.setByteLength( 1 );
    _kcp13V05NotificatMmsgSupCd = BF.createStringBinding( "Kcp13V05NotificatMmsgSupCd", "Kcp13V05NotificatMmsgSupCd", String.class, this );
    _kcp13V05NotificatMmsgSupCd.setCobolName( "KCP13V05-NOTIFICAT-MMSG-SUP-CD" );
    _kcp13V05NotificatMmsgSupCd.setByteLength( 1 );
    _kcp13V05NotificatPmsgSupCd = BF.createStringBinding( "Kcp13V05NotificatPmsgSupCd", "Kcp13V05NotificatPmsgSupCd", String.class, this );
    _kcp13V05NotificatPmsgSupCd.setCobolName( "KCP13V05-NOTIFICAT-PMSG-SUP-CD" );
    _kcp13V05NotificatPmsgSupCd.setByteLength( 1 );
    _kcp13V05StmtDest = BF.createStringBinding( "Kcp13V05StmtDest", "Kcp13V05StmtDest", String.class, this );
    _kcp13V05StmtDest.setCobolName( "KCP13V05-STMT-DEST" );
    _kcp13V05StmtDest.setByteLength( 1 );
    _kcp13V05StmtDupDest = BF.createStringBinding( "Kcp13V05StmtDupDest", "Kcp13V05StmtDupDest", String.class, this );
    _kcp13V05StmtDupDest.setCobolName( "KCP13V05-STMT-DUP-DEST" );
    _kcp13V05StmtDupDest.setByteLength( 1 );
    _kcp13V05StmtCind = BF.createStringBinding( "Kcp13V05StmtCind", "Kcp13V05StmtCind", String.class, this );
    _kcp13V05StmtCind.setCobolName( "KCP13V05-STMT-CIND" );
    _kcp13V05StmtCind.setByteLength( 1 );
    _kcp13V05Dissenter = BF.createStringBinding( "Kcp13V05Dissenter", "Kcp13V05Dissenter", String.class, this );
    _kcp13V05Dissenter.setCobolName( "KCP13V05-DISSENTER" );
    _kcp13V05Dissenter.setByteLength( 1 );
    _kcp13V05StmtDup = BF.createStringBinding( "Kcp13V05StmtDup", "Kcp13V05StmtDup", String.class, this );
    _kcp13V05StmtDup.setCobolName( "KCP13V05-STMT-DUP" );
    _kcp13V05StmtDup.setByteLength( 1 );
    _kcp13V05StmtDestClass = BF.createZonedDecimalBinding( "Kcp13V05StmtDestClass", "Kcp13V05StmtDestClass", Integer.class, this );
    _kcp13V05StmtDestClass.setCobolName( "KCP13V05-STMT-DEST-CLASS" );
    _kcp13V05StmtDestClass.setByteLength( 1 );
    _kcp13V05StmtDestClass.setTotalDigits( 1 );
    _kcp13V05StmtLayout = BF.createPackedDecimalBinding( "Kcp13V05StmtLayout", "Kcp13V05StmtLayout", Short.class, this );
    _kcp13V05StmtLayout.setCobolName( "KCP13V05-STMT-LAYOUT" );
    _kcp13V05StmtLayout.setByteLength( 2 );
    _kcp13V05StmtLayout.setTotalDigits( 3 );
    _kcp13V05StmtLayout.setIsSigned( true );
    _kcp13V05NoOfPrenotDates = BF.createZonedDecimalBinding( "Kcp13V05NoOfPrenotDates", "Kcp13V05NoOfPrenotDates", Integer.class, this );
    _kcp13V05NoOfPrenotDates.setCobolName( "KCP13V05-NO-OF-PRENOT-DATES" );
    _kcp13V05NoOfPrenotDates.setByteLength( 1 );
    _kcp13V05NoOfPrenotDates.setTotalDigits( 1 );
    _kcp13V05PrenotPrintDatesWrapperItem = new Kcp13V05PrenotPrintDatesBinding( "Kcp13V05PrenotPrintDatesWrapperItem", "Kcp13V05PrenotPrintDates", this, null );
    _kcp13V05PrenotPrintDatesWrapper = new Kcp13V05PrenotPrintDatesWrapperBinding( "Kcp13V05PrenotPrintDatesWrapper", "Kcp13V05PrenotPrintDates", this, _kcp13V05PrenotPrintDatesWrapperItem );
    _kcp13V05PrenotPrintDatesWrapper.setCobolName( "KCP13V05-PRENOT-PRINT-DATES" );
    _kcp13V05PrenotPrintDatesWrapper.setByteLength( 9 );
    _kcp13V05PrenotPrintDatesWrapper.setItemByteLength( 3 );
    _kcp13V05PrenotPrintDatesWrapper.setMinOccurs( 3 );
    _kcp13V05PrenotPrintDatesWrapper.setMaxOccurs( 3 );
    _kcp13V05NoOfFrequencies = BF.createZonedDecimalBinding( "Kcp13V05NoOfFrequencies", "Kcp13V05NoOfFrequencies", Integer.class, this );
    _kcp13V05NoOfFrequencies.setCobolName( "KCP13V05-NO-OF-FREQUENCIES" );
    _kcp13V05NoOfFrequencies.setByteLength( 1 );
    _kcp13V05NoOfFrequencies.setTotalDigits( 1 );
    _kcp13V05NotificatFreqDetailWrapperItem = new Kcp13V05NotificatFreqDetailBinding( "Kcp13V05NotificatFreqDetailWrapperItem", "Kcp13V05NotificatFreqDetail", this, null );
    _kcp13V05NotificatFreqDetailWrapper = new Kcp13V05NotificatFreqDetailWrapperBinding( "Kcp13V05NotificatFreqDetailWrapper", "Kcp13V05NotificatFreqDetail", this, _kcp13V05NotificatFreqDetailWrapperItem );
    _kcp13V05NotificatFreqDetailWrapper.setCobolName( "KCP13V05-NOTIFICAT-FREQ-DETAIL" );
    _kcp13V05NotificatFreqDetailWrapper.setByteLength( 135 );
    _kcp13V05NotificatFreqDetailWrapper.setItemByteLength( 15 );
    _kcp13V05NotificatFreqDetailWrapper.setMinOccurs( 9 );
    _kcp13V05NotificatFreqDetailWrapper.setMaxOccurs( 9 );

        /* Add children to children list */
    getChildrenList().add( _kcp13V05NotificatTypeCode );
    getChildrenList().add( _kcp13V05NotificatSubTypeCd );
    getChildrenList().add( _kcp13V05NotificatSuppressCd );
    getChildrenList().add( _kcp13V05NotificatMmsgSupCd );
    getChildrenList().add( _kcp13V05NotificatPmsgSupCd );
    getChildrenList().add( _kcp13V05StmtDest );
    getChildrenList().add( _kcp13V05StmtDupDest );
    getChildrenList().add( _kcp13V05StmtCind );
    getChildrenList().add( _kcp13V05Dissenter );
    getChildrenList().add( _kcp13V05StmtDup );
    getChildrenList().add( _kcp13V05StmtDestClass );
    getChildrenList().add( _kcp13V05StmtLayout );
    getChildrenList().add( _kcp13V05NoOfPrenotDates );
    getChildrenList().add( _kcp13V05PrenotPrintDatesWrapper );
    getChildrenList().add( _kcp13V05NoOfFrequencies );
    getChildrenList().add( _kcp13V05NotificatFreqDetailWrapper );

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
    mValueObject = mValueObjectFactory.createKcp13V05NotificatDiaryData();
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
        /* Get Value object property _kcp13V05NotificatTypeCode */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp13V05NotificatTypeCode" + " value=" + mValueObject.getKcp13V05NotificatTypeCode() );
      }
    _kcp13V05NotificatTypeCode.setObjectValue( mValueObject.getKcp13V05NotificatTypeCode() );
        /* Get Value object property _kcp13V05NotificatSubTypeCd */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp13V05NotificatSubTypeCd" + " value=" + mValueObject.getKcp13V05NotificatSubTypeCd() );
      }
    _kcp13V05NotificatSubTypeCd.setObjectValue( mValueObject.getKcp13V05NotificatSubTypeCd() );
        /* Get Value object property _kcp13V05NotificatSuppressCd */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp13V05NotificatSuppressCd" + " value=" + mValueObject.getKcp13V05NotificatSuppressCd() );
      }
    _kcp13V05NotificatSuppressCd.setObjectValue( mValueObject.getKcp13V05NotificatSuppressCd() );
        /* Get Value object property _kcp13V05NotificatMmsgSupCd */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp13V05NotificatMmsgSupCd" + " value=" + mValueObject.getKcp13V05NotificatMmsgSupCd() );
      }
    _kcp13V05NotificatMmsgSupCd.setObjectValue( mValueObject.getKcp13V05NotificatMmsgSupCd() );
        /* Get Value object property _kcp13V05NotificatPmsgSupCd */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp13V05NotificatPmsgSupCd" + " value=" + mValueObject.getKcp13V05NotificatPmsgSupCd() );
      }
    _kcp13V05NotificatPmsgSupCd.setObjectValue( mValueObject.getKcp13V05NotificatPmsgSupCd() );
        /* Get Value object property _kcp13V05StmtDest */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp13V05StmtDest" + " value=" + mValueObject.getKcp13V05StmtDest() );
      }
    _kcp13V05StmtDest.setObjectValue( mValueObject.getKcp13V05StmtDest() );
        /* Get Value object property _kcp13V05StmtDupDest */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp13V05StmtDupDest" + " value=" + mValueObject.getKcp13V05StmtDupDest() );
      }
    _kcp13V05StmtDupDest.setObjectValue( mValueObject.getKcp13V05StmtDupDest() );
        /* Get Value object property _kcp13V05StmtCind */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp13V05StmtCind" + " value=" + mValueObject.getKcp13V05StmtCind() );
      }
    _kcp13V05StmtCind.setObjectValue( mValueObject.getKcp13V05StmtCind() );
        /* Get Value object property _kcp13V05Dissenter */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp13V05Dissenter" + " value=" + mValueObject.getKcp13V05Dissenter() );
      }
    _kcp13V05Dissenter.setObjectValue( mValueObject.getKcp13V05Dissenter() );
        /* Get Value object property _kcp13V05StmtDup */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp13V05StmtDup" + " value=" + mValueObject.getKcp13V05StmtDup() );
      }
    _kcp13V05StmtDup.setObjectValue( mValueObject.getKcp13V05StmtDup() );
        /* Get Value object property _kcp13V05StmtDestClass */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp13V05StmtDestClass" + " value=" + mValueObject.getKcp13V05StmtDestClass() );
      }
    _kcp13V05StmtDestClass.setObjectValue( mValueObject.getKcp13V05StmtDestClass() );
        /* Get Value object property _kcp13V05StmtLayout */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp13V05StmtLayout" + " value=" + mValueObject.getKcp13V05StmtLayout() );
      }
    _kcp13V05StmtLayout.setObjectValue( mValueObject.getKcp13V05StmtLayout() );
        /* Get Value object property _kcp13V05NoOfPrenotDates */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp13V05NoOfPrenotDates" + " value=" + mValueObject.getKcp13V05NoOfPrenotDates() );
      }
    _kcp13V05NoOfPrenotDates.setObjectValue( mValueObject.getKcp13V05NoOfPrenotDates() );
        /* Get Value object property _kcp13V05PrenotPrintDatesWrapper */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp13V05PrenotPrintDatesWrapper" + " value=" + mValueObject.getKcp13V05PrenotPrintDates() );
      }
    _kcp13V05PrenotPrintDatesWrapper.setObjectValue( mValueObject.getKcp13V05PrenotPrintDates() );
        /* Get Value object property _kcp13V05NoOfFrequencies */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp13V05NoOfFrequencies" + " value=" + mValueObject.getKcp13V05NoOfFrequencies() );
      }
    _kcp13V05NoOfFrequencies.setObjectValue( mValueObject.getKcp13V05NoOfFrequencies() );
        /* Get Value object property _kcp13V05NotificatFreqDetailWrapper */
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Getting value from Value object property " + "_kcp13V05NotificatFreqDetailWrapper" + " value=" + mValueObject.getKcp13V05NotificatFreqDetail() );
      }
    _kcp13V05NotificatFreqDetailWrapper.setObjectValue( mValueObject.getKcp13V05NotificatFreqDetail() );
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
        mValueObject.setKcp13V05NotificatTypeCode( (String) bindingValue );
        break;
      case 1:
        bindingValue = child.getObjectValue( String.class );
        mValueObject.setKcp13V05NotificatSubTypeCd( (String) bindingValue );
        break;
      case 2:
        bindingValue = child.getObjectValue( String.class );
        mValueObject.setKcp13V05NotificatSuppressCd( (String) bindingValue );
        break;
      case 3:
        bindingValue = child.getObjectValue( String.class );
        mValueObject.setKcp13V05NotificatMmsgSupCd( (String) bindingValue );
        break;
      case 4:
        bindingValue = child.getObjectValue( String.class );
        mValueObject.setKcp13V05NotificatPmsgSupCd( (String) bindingValue );
        break;
      case 5:
        bindingValue = child.getObjectValue( String.class );
        mValueObject.setKcp13V05StmtDest( (String) bindingValue );
        break;
      case 6:
        bindingValue = child.getObjectValue( String.class );
        mValueObject.setKcp13V05StmtDupDest( (String) bindingValue );
        break;
      case 7:
        bindingValue = child.getObjectValue( String.class );
        mValueObject.setKcp13V05StmtCind( (String) bindingValue );
        break;
      case 8:
        bindingValue = child.getObjectValue( String.class );
        mValueObject.setKcp13V05Dissenter( (String) bindingValue );
        break;
      case 9:
        bindingValue = child.getObjectValue( String.class );
        mValueObject.setKcp13V05StmtDup( (String) bindingValue );
        break;
      case 10:
        bindingValue = child.getObjectValue( Integer.class );
        mValueObject.setKcp13V05StmtDestClass( (Integer) bindingValue );
        break;
      case 11:
        bindingValue = child.getObjectValue( Short.class );
        mValueObject.setKcp13V05StmtLayout( (Short) bindingValue );
        break;
      case 12:
        bindingValue = child.getObjectValue( Integer.class );
        mValueObject.setKcp13V05NoOfPrenotDates( (Integer) bindingValue );
        break;
      case 13:
        bindingValue = child.getObjectValue( Kcp13V05PrenotPrintDates.class );
        List<Kcp13V05PrenotPrintDates> listKcp13V05PrenotPrintDatesWrapper = cast( bindingValue );
        mValueObject.getKcp13V05PrenotPrintDates().clear();
        mValueObject.getKcp13V05PrenotPrintDates().addAll( listKcp13V05PrenotPrintDatesWrapper );
        break;
      case 14:
        bindingValue = child.getObjectValue( Integer.class );
        mValueObject.setKcp13V05NoOfFrequencies( (Integer) bindingValue );
        break;
      case 15:
        bindingValue = child.getObjectValue( Kcp13V05NotificatFreqDetail.class );
        List<Kcp13V05NotificatFreqDetail> listKcp13V05NotificatFreqDetailWrapper = cast( bindingValue );
        mValueObject.getKcp13V05NotificatFreqDetail().clear();
        mValueObject.getKcp13V05NotificatFreqDetail().addAll( listKcp13V05NotificatFreqDetailWrapper );
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
    if( type.equals( Kcp13V05NotificatDiaryData.class ) )
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
    if( bindingValue.getClass().equals( Kcp13V05NotificatDiaryData.class ) )
      {
      mValueObject = (Kcp13V05NotificatDiaryData) bindingValue;
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
  public Kcp13V05NotificatDiaryData getKcp13V05NotificatDiaryData()
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

