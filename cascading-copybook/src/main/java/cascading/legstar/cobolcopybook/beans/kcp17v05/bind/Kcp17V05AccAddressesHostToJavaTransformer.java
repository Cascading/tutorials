package cascading.legstar.cobolcopybook.beans.kcp17v05.bind;

import com.legstar.coxb.CobolBindingException;
import com.legstar.coxb.CobolContext;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.transform.AbstractHostToJavaTransformer;

/**
 * Transforms mainframe data to a Kcp17V05AccAddresses data object.
 * <p/>
 * This is a typical use of this class:
 * <pre>
 *  Kcp17V05AccAddressesHostToJavaTransformer transformer = new Kcp17V05AccAddressesHostToJavaTransformer();
 *  Kcp17V05AccAddresses javaValue = (Kcp17V05AccAddresses) transformer.transform(hostByteArray);
 * </pre>
 */
public class Kcp17V05AccAddressesHostToJavaTransformer extends AbstractHostToJavaTransformer
  {


  /**
   * Create a Host to Java transformer using default COBOL parameters.
   */
  public Kcp17V05AccAddressesHostToJavaTransformer()
    {
    super();
    }

  /**
   * Create a Host to Java transformer using a specific COBOL parameters set.
   *
   * @param cobolContext the COBOL parameters set.
   */
  public Kcp17V05AccAddressesHostToJavaTransformer( final CobolContext cobolContext )
    {
    super( cobolContext );
    }

  /**
   * Create a Host to Java transformer using a specific host character set while
   * other COBOL parameters are set by default.
   *
   * @param hostCharset the host character set
   */
  public Kcp17V05AccAddressesHostToJavaTransformer( final String hostCharset )
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
    return new Kcp17V05AccAddressesBinding();
    }

  }
