package cascading.legstar.cobolcopybook.beans.kcp02v05.bind;

import com.legstar.coxb.CobolBindingException;
import com.legstar.coxb.CobolContext;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.transform.AbstractHostToJavaTransformer;

/**
 * Transforms mainframe data to a Kcp02V05AccountStatus data object.
 * <p/>
 * This is a typical use of this class:
 * <pre>
 *  Kcp02V05AccountStatusHostToJavaTransformer transformer = new Kcp02V05AccountStatusHostToJavaTransformer();
 *  Kcp02V05AccountStatus javaValue = (Kcp02V05AccountStatus) transformer.transform(hostByteArray);
 * </pre>
 */
public class Kcp02V05AccountStatusHostToJavaTransformer extends AbstractHostToJavaTransformer
  {


  /**
   * Create a Host to Java transformer using default COBOL parameters.
   */
  public Kcp02V05AccountStatusHostToJavaTransformer()
    {
    super();
    }

  /**
   * Create a Host to Java transformer using a specific COBOL parameters set.
   *
   * @param cobolContext the COBOL parameters set.
   */
  public Kcp02V05AccountStatusHostToJavaTransformer( final CobolContext cobolContext )
    {
    super( cobolContext );
    }

  /**
   * Create a Host to Java transformer using a specific host character set while
   * other COBOL parameters are set by default.
   *
   * @param hostCharset the host character set
   */
  public Kcp02V05AccountStatusHostToJavaTransformer( final String hostCharset )
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
    return new Kcp02V05AccountStatusBinding();
    }

  }
