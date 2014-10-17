package cascading.legstar.cobolcopybook.scheme;

import java.util.Map;
import java.util.Map.Entry;

import cascading.legstar.cobolcopybook.transform.TupleEntryCobolTransformer;
import cascading.tuple.Fields;
import cascading.tuple.TupleEntry;
import com.google.common.collect.Maps;

/**
 * During the course of the {@link Bdfo27Scheme} execution, this will hold the
 * context in a threadsafe fashion.
 */
public class Bdfo27SourceContext
  {

  /** A helper for cobol to tuple conversions. */
  private final TupleEntryCobolTransformer transformer = new TupleEntryCobolTransformer();

  /** A tuple entry for common data record. */
  private final TupleEntry commonDataTupleEntry;
  /** Associates a sub record with a tuple entry. */
  private final Map<String, TupleEntry> tupleEntries = Maps
    .newLinkedHashMap();

  public Bdfo27SourceContext( Bdfo27Config config )
    {

    commonDataTupleEntry = new TupleEntry( config.getCommonDataFields() );

    for( Entry<String, Fields> entry : config.getFields().entrySet() )
      {
      tupleEntries.put( entry.getKey(), new TupleEntry( entry.getValue() ) );
      }

    }

  public TupleEntry getCommonDataTupleEntry()
    {
    return commonDataTupleEntry;
    }

  public Map<String, TupleEntry> getTupleEntries()
    {
    return tupleEntries;
    }

  public TupleEntryCobolTransformer getTransformer()
    {
    return transformer;
    }

  }
