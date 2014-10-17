package cascading.legstar.cobolcopybook.beans.kcp08v05.bind;

import com.legstar.coxb.CobolBindingException;
import com.legstar.coxb.CobolContext;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.transform.AbstractHostToJavaTransformer;

/**
 * Transforms mainframe data to a Kcp08V05AuthLimits data object.
 * <p/>
 * This is a typical use of this class:
 * <pre>
 *  Kcp08V05AuthLimitsHostToJavaTransformer transformer = new Kcp08V05AuthLimitsHostToJavaTransformer();
 *  Kcp08V05AuthLimits javaValue = (Kcp08V05AuthLimits) transformer.transform(hostByteArray);
 * </pre>
 */
public class Kcp08V05AuthLimitsHostToJavaTransformer extends AbstractHostToJavaTransformer
  {


  /**
   * Create a Host to Java transformer using default COBOL parameters.
   */
  public Kcp08V05AuthLimitsHostToJavaTransformer()
    {
    super();
    }

  /**
   * Create a Host to Java transformer using a specific COBOL parameters set.
   *
   * @param cobolContext the COBOL parameters set.
   */
  public Kcp08V05AuthLimitsHostToJavaTransformer( final CobolContext cobolContext )
    {
    super( cobolContext );
    }

  /**
   * Create a Host to Java transformer using a specific host character set while
   * other COBOL parameters are set by default.
   *
   * @param hostCharset the host character set
   */
  public Kcp08V05AuthLimitsHostToJavaTransformer( final String hostCharset )
    {
    super( hostCharset );
    }

  /**
   * Binding is statically produced by {@link com.legstar.coxb.gen.CoxbBindingGenerator}.
   *
   * @return a new binding corresponding to the host structure type.
   * @throws CobolBindingException if binding cannot be returned
   */
  public ICobolComplexBinding newBinding() throws CobolBindingException
    {
    return new Kcp08V05AuthLimitsBinding();
    }

  }
