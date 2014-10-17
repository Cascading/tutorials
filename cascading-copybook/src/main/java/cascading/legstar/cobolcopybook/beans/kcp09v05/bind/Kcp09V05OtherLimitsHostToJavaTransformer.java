package cascading.legstar.cobolcopybook.beans.kcp09v05.bind;

import com.legstar.coxb.CobolBindingException;
import com.legstar.coxb.CobolContext;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.transform.AbstractHostToJavaTransformer;

/**
 * Transforms mainframe data to a Kcp09V05OtherLimits data object.
 * <p/>
 * This is a typical use of this class:
 * <pre>
 *  Kcp09V05OtherLimitsHostToJavaTransformer transformer = new Kcp09V05OtherLimitsHostToJavaTransformer();
 *  Kcp09V05OtherLimits javaValue = (Kcp09V05OtherLimits) transformer.transform(hostByteArray);
 * </pre>
 */
public class Kcp09V05OtherLimitsHostToJavaTransformer extends AbstractHostToJavaTransformer
  {


  /**
   * Create a Host to Java transformer using default COBOL parameters.
   */
  public Kcp09V05OtherLimitsHostToJavaTransformer()
    {
    super();
    }

  /**
   * Create a Host to Java transformer using a specific COBOL parameters set.
   *
   * @param cobolContext the COBOL parameters set.
   */
  public Kcp09V05OtherLimitsHostToJavaTransformer( final CobolContext cobolContext )
    {
    super( cobolContext );
    }

  /**
   * Create a Host to Java transformer using a specific host character set while
   * other COBOL parameters are set by default.
   *
   * @param hostCharset the host character set
   */
  public Kcp09V05OtherLimitsHostToJavaTransformer( final String hostCharset )
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
    return new Kcp09V05OtherLimitsBinding();
    }

  }
