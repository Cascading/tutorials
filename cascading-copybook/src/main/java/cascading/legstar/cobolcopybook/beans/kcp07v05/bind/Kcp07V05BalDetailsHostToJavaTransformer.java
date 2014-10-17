package cascading.legstar.cobolcopybook.beans.kcp07v05.bind;

import com.legstar.coxb.CobolBindingException;
import com.legstar.coxb.CobolContext;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.transform.AbstractHostToJavaTransformer;

/**
 * Transforms mainframe data to a Kcp07V05BalDetails data object.
 * <p/>
 * This is a typical use of this class:
 * <pre>
 *  Kcp07V05BalDetailsHostToJavaTransformer transformer = new Kcp07V05BalDetailsHostToJavaTransformer();
 *  Kcp07V05BalDetails javaValue = (Kcp07V05BalDetails) transformer.transform(hostByteArray);
 * </pre>
 */
public class Kcp07V05BalDetailsHostToJavaTransformer extends AbstractHostToJavaTransformer
  {


  /**
   * Create a Host to Java transformer using default COBOL parameters.
   */
  public Kcp07V05BalDetailsHostToJavaTransformer()
    {
    super();
    }

  /**
   * Create a Host to Java transformer using a specific COBOL parameters set.
   *
   * @param cobolContext the COBOL parameters set.
   */
  public Kcp07V05BalDetailsHostToJavaTransformer( final CobolContext cobolContext )
    {
    super( cobolContext );
    }

  /**
   * Create a Host to Java transformer using a specific host character set while
   * other COBOL parameters are set by default.
   *
   * @param hostCharset the host character set
   */
  public Kcp07V05BalDetailsHostToJavaTransformer( final String hostCharset )
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
    return new Kcp07V05BalDetailsBinding();
    }

  }
