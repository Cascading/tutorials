package cascading.legstar.cobolcopybook.beans.kcp01v05.bind;

import com.legstar.coxb.CobolBindingException;
import com.legstar.coxb.CobolContext;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.transform.AbstractHostToJavaTransformer;

/**
 * Transforms mainframe data to a Kcp01V05AccountDetails data object.
 * <p/>
 * This is a typical use of this class:
 * <pre>
 *  Kcp01V05AccountDetailsHostToJavaTransformer transformer = new Kcp01V05AccountDetailsHostToJavaTransformer();
 *  Kcp01V05AccountDetails javaValue = (Kcp01V05AccountDetails) transformer.transform(hostByteArray);
 * </pre>
 */
public class Kcp01V05AccountDetailsHostToJavaTransformer extends AbstractHostToJavaTransformer
  {


  /**
   * Create a Host to Java transformer using default COBOL parameters.
   */
  public Kcp01V05AccountDetailsHostToJavaTransformer()
    {
    super();
    }

  /**
   * Create a Host to Java transformer using a specific COBOL parameters set.
   *
   * @param cobolContext the COBOL parameters set.
   */
  public Kcp01V05AccountDetailsHostToJavaTransformer( final CobolContext cobolContext )
    {
    super( cobolContext );
    }

  /**
   * Create a Host to Java transformer using a specific host character set while
   * other COBOL parameters are set by default.
   *
   * @param hostCharset the host character set
   */
  public Kcp01V05AccountDetailsHostToJavaTransformer( final String hostCharset )
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
    return new Kcp01V05AccountDetailsBinding();
    }

  }
