package cascading.legstar.cobolcopybook.transform;

import java.util.List;

import cascading.legstar.cobolcopybook.translate.Cob2FieldsNames;
import cascading.tuple.TupleEntry;
import com.legstar.coxb.ICobolArrayBinaryBinding;
import com.legstar.coxb.ICobolArrayComplexBinding;
import com.legstar.coxb.ICobolArrayDbcsBinding;
import com.legstar.coxb.ICobolArrayDoubleBinding;
import com.legstar.coxb.ICobolArrayFloatBinding;
import com.legstar.coxb.ICobolArrayNationalBinding;
import com.legstar.coxb.ICobolArrayOctetStreamBinding;
import com.legstar.coxb.ICobolArrayPackedDecimalBinding;
import com.legstar.coxb.ICobolArrayStringBinding;
import com.legstar.coxb.ICobolArrayZonedDecimalBinding;
import com.legstar.coxb.ICobolBinaryBinding;
import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.ICobolDbcsBinding;
import com.legstar.coxb.ICobolDoubleBinding;
import com.legstar.coxb.ICobolFloatBinding;
import com.legstar.coxb.ICobolNationalBinding;
import com.legstar.coxb.ICobolOctetStreamBinding;
import com.legstar.coxb.ICobolPackedDecimalBinding;
import com.legstar.coxb.ICobolStringBinding;
import com.legstar.coxb.ICobolZonedDecimalBinding;
import com.legstar.coxb.convert.ICobolConverters;
import com.legstar.coxb.host.HostException;
import com.legstar.coxb.impl.visitor.CobolUnmarshalVisitor;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Implements the visitor pattern in order to convert cobol items into Tuple
 * Entries. More precisely, a Tuple within a Tuple entry.
 * <p/>
 * COBOl items form a hierarchy and this allows tree traversal of the entire
 * hierarchy.
 * <p/>
 * This visitor flattens the cobol data so that it fits in a Tuple.
 */
public class TupleEntryCobolUnmarshalVisitor extends CobolUnmarshalVisitor
  {

  /** Unmarshaler populates this tuple entry. */
  private final TupleEntry tupleEntry;
  /** Logger. */
  private final Log _log = LogFactory.getLog( getClass() );
  /**
   * Contextual suffix to uniquely identify a map entry (used for array
   * items).
   */
  private String _suffix = "";
  /**
   * Used for name conflict resolution
   */
  private Cob2FieldsNames names = new Cob2FieldsNames();

  /**
   * Visitor constructor.
   *
   * @param hostBytes       host buffer used by visitor
   * @param offset          offset in host buffer
   * @param cobolConverters set of converters to use for cobol elements
   * @param tupleEntry      the tuple entry to be populated
   */
  public TupleEntryCobolUnmarshalVisitor( byte[] hostBytes, int offset,
                                          ICobolConverters cobolConverters, TupleEntry tupleEntry )
    {
    super( hostBytes, offset, cobolConverters );
    this.tupleEntry = tupleEntry;
    }

  /** {@inheritDoc} */
  @Override
  public void visit( ICobolComplexBinding ce ) throws HostException
    {
    String prevHierarchy = names.upHierarchy( ce.getJaxbName() );
    super.visit( ce );
    names.setHierarchy( prevHierarchy );
    }

  /** {@inheritDoc} */
  @Override
  public void visit( ICobolArrayComplexBinding ce ) throws HostException
    {
    if( _log.isDebugEnabled() )
      {
      _log.debug( "Unmarshaling started for array of complex bindings "
        + ce.getBindingName() );
      }
        /*
         * Ask complex array binding to initialize bound array so that it is
         * ready for unmarshaling.
         */
    ce.createValueObject();

    String prevSuffix = _suffix;

        /*
         * Visit each item of the array in turn creating a contextual suffix for
         * each item.
         */
    for( int i = 0; i < ce.getCurrentOccurs(); i++ )
      {
      _suffix = _suffix + "_" + Integer.toString( i );
      ICobolBinding itemDesc = ce.getComplexItemBinding();
      itemDesc.accept( this );
      ce.addPropertyValue( i );
      _suffix = prevSuffix;
      }

    if( _log.isDebugEnabled() )
      {
      _log.debug( "Unmarshaling successful for array of complex bindings "
        + ce.getBindingName() );
      }
    }

  /** {@inheritDoc} */
  @Override
  public void visit( ICobolStringBinding ce ) throws HostException
    {
    super.visit( ce );
    tupleEntry.setRaw( uniqueName( ce.getJaxbName() + _suffix ),
      ce.getStringValue() );
    }

  /** {@inheritDoc} */
  @Override
  public void visit( ICobolArrayStringBinding ce ) throws HostException
    {
    super.visit( ce );
    for( int i = 0; i < ce.getCurrentOccurs(); i++ )
      {
      String newSuffix = _suffix + "_" + Integer.toString( i );
      tupleEntry.setRaw( uniqueName( ce.getJaxbName() + newSuffix ), ce
        .getStringList().get( i ) );
      }
    }

  /** {@inheritDoc} */
  @Override
  public void visit( ICobolNationalBinding ce ) throws HostException
    {
    super.visit( ce );
    tupleEntry.setRaw( uniqueName( ce.getJaxbName() + _suffix ),
      ce.getStringValue() );
    }

  /** {@inheritDoc} */
  @Override
  public void visit( ICobolArrayNationalBinding ce ) throws HostException
    {
    super.visit( ce );
    for( int i = 0; i < ce.getCurrentOccurs(); i++ )
      {
      String newSuffix = _suffix + "_" + Integer.toString( i );
      tupleEntry.setRaw( uniqueName( ce.getJaxbName() + newSuffix ), ce
        .getStringList().get( i ) );
      }
    }

  /** {@inheritDoc} */
  @Override
  public void visit( ICobolDbcsBinding ce ) throws HostException
    {
    super.visit( ce );
    tupleEntry.setRaw( uniqueName( ce.getJaxbName() + _suffix ),
      ce.getStringValue() );
    }

  /** {@inheritDoc} */
  @Override
  public void visit( ICobolArrayDbcsBinding ce ) throws HostException
    {
    super.visit( ce );
    for( int i = 0; i < ce.getCurrentOccurs(); i++ )
      {
      String newSuffix = _suffix + "_" + Integer.toString( i );
      tupleEntry.setRaw( uniqueName( ce.getJaxbName() + newSuffix ), ce
        .getStringList().get( i ) );
      }
    }

  /** {@inheritDoc} */
  @Override
  public void visit( ICobolZonedDecimalBinding ce ) throws HostException
    {
    super.visit( ce );
    tupleEntry.setRaw( uniqueName( ce.getJaxbName() + _suffix ),
      ce.getObjectValue( ce.getJaxbType() ) );
    }

  /** {@inheritDoc} */
  @Override
  public void visit( ICobolArrayZonedDecimalBinding ce ) throws HostException
    {
    super.visit( ce );
    for( int i = 0; i < ce.getCurrentOccurs(); i++ )
      {
      String newSuffix = _suffix + "_" + Integer.toString( i );
      tupleEntry.setRaw( uniqueName( ce.getJaxbName() + newSuffix ),
        ( (List<?>) ce.getObjectValue( ce.getJaxbType() ) ).get( i ) );
      }
    }

  /** {@inheritDoc} */
  @Override
  public void visit( ICobolPackedDecimalBinding ce ) throws HostException
    {
    super.visit( ce );
    tupleEntry.setRaw( uniqueName( ce.getJaxbName() + _suffix ),
      ce.getObjectValue( ce.getJaxbType() ) );
    }

  /** {@inheritDoc} */
  @Override
  public void visit( ICobolArrayPackedDecimalBinding ce ) throws HostException
    {
    super.visit( ce );
    for( int i = 0; i < ce.getCurrentOccurs(); i++ )
      {
      String newSuffix = _suffix + "_" + Integer.toString( i );
      tupleEntry.setRaw( uniqueName( ce.getJaxbName() + newSuffix ),
        ( (List<?>) ce.getObjectValue( ce.getJaxbType() ) ).get( i ) );
      }
    }

  /** {@inheritDoc} */
  @Override
  public void visit( ICobolBinaryBinding ce ) throws HostException
    {
    super.visit( ce );
    tupleEntry.setRaw( uniqueName( ce.getJaxbName() + _suffix ),
      ce.getObjectValue( ce.getJaxbType() ) );
    }

  /** {@inheritDoc} */
  @Override
  public void visit( ICobolArrayBinaryBinding ce ) throws HostException
    {
    super.visit( ce );
    for( int i = 0; i < ce.getCurrentOccurs(); i++ )
      {
      String newSuffix = _suffix + "_" + Integer.toString( i );
      tupleEntry.setRaw( uniqueName( ce.getJaxbName() + newSuffix ),
        ( (List<?>) ce.getObjectValue( ce.getJaxbType() ) ).get( i ) );
      }
    }

  /** {@inheritDoc} */
  @Override
  public void visit( ICobolFloatBinding ce ) throws HostException
    {
    super.visit( ce );
    tupleEntry.setRaw( uniqueName( ce.getJaxbName() + _suffix ),
      ce.getFloatValue() );
    }

  /** {@inheritDoc} */
  @Override
  public void visit( ICobolArrayFloatBinding ce ) throws HostException
    {
    super.visit( ce );
    for( int i = 0; i < ce.getCurrentOccurs(); i++ )
      {
      String newSuffix = _suffix + "_" + Integer.toString( i );
      tupleEntry.setRaw( uniqueName( ce.getJaxbName() + newSuffix ), ce
        .getFloatList().get( i ) );
      }
    }

  /** {@inheritDoc} */
  @Override
  public void visit( ICobolDoubleBinding ce ) throws HostException
    {
    super.visit( ce );
    tupleEntry.setRaw( uniqueName( ce.getJaxbName() + _suffix ),
      ce.getDoubleValue() );
    }

  /** {@inheritDoc} */
  @Override
  public void visit( ICobolArrayDoubleBinding ce ) throws HostException
    {
    super.visit( ce );
    for( int i = 0; i < ce.getCurrentOccurs(); i++ )
      {
      String newSuffix = _suffix + "_" + Integer.toString( i );
      tupleEntry.setRaw( uniqueName( ce.getJaxbName() + newSuffix ), ce
        .getDoubleList().get( i ) );
      }
    }

  /** {@inheritDoc} */
  @Override
  public void visit( ICobolOctetStreamBinding ce ) throws HostException
    {
    super.visit( ce );
    tupleEntry.setRaw( uniqueName( ce.getJaxbName() + _suffix ),
      ce.getByteArrayValue() );
    }

  /** {@inheritDoc} */
  @Override
  public void visit( ICobolArrayOctetStreamBinding ce ) throws HostException
    {
    super.visit( ce );
    for( int i = 0; i < ce.getCurrentOccurs(); i++ )
      {
      String newSuffix = _suffix + "_" + Integer.toString( i );
      tupleEntry.setRaw( uniqueName( ce.getJaxbName() + newSuffix ), ce
        .getByteArrayList().get( i ) );
      }
    }

  /**
   * Creates a unique column name based on a proposed name.
   *
   * @param proposedName the proposed name
   * @return a unique name for a column
   */
  protected String uniqueName( final String proposedName )
    {
    return names.getUniqueName( proposedName );
    }

  /**
   * @return the tuple entry built from mainframe data
   */
  public TupleEntry getTupleEntry()
    {
    return tupleEntry;
    }

  }
