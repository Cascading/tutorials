package cascading.hadoop.legstar.cobol.hadoop.scheme;

import cascading.flow.FlowProcess;
import cascading.hadoop.legstar.cobol.beans.custdat.CustomerData;
import cascading.hadoop.legstar.cobol.fields.Custdat;
import cascading.hadoop.legstar.cobol.hadoop.io.CustdatInputFormat;
import cascading.tap.Tap;
import org.apache.hadoop.io.ArrayPrimitiveWritable;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.RecordReader;

/**
 * Reads the customer data mainframe file.
 * <p/>
 * Scheme produces a set of Fields corresponding to the flattened CUSTOMER-DATA
 * cobol structure.
 */
public class CustdatScheme extends RdwScheme
  {

  private static final long serialVersionUID = 3613340688808506614L;

  /**
   * Scheme produces a set of Fields corresponding to the flattened
   * CUSTOMER-DATA cobol structure.
   */
  public CustdatScheme()
    {
    super( new Custdat(), CustomerData.class );
    }

  @Override
  public void sourceConfInit( FlowProcess<? extends JobConf> flowProcess, Tap<JobConf, RecordReader<ArrayPrimitiveWritable, ArrayPrimitiveWritable>, OutputCollector<Object, Object>> tap, JobConf conf )
    {
    conf.setInputFormat( CustdatInputFormat.class );
    }

  }
