package cascading.legstar.cobolcopybook.beans.bean10.bind;

import com.legstar.coxb.CobolBindingException;
import com.legstar.coxb.CobolContext;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.transform.AbstractJavaToHostTransformer;

/**
 * Transforms a Kcp07V05BalDetails data object to mainframe data.
 * <p/>
 * This is a typical use of this class:
 * <pre>
 *  Kcp07V05BalDetailsJavaToHostTransformer transformer = new Kcp07V05BalDetailsJavaToHostTransformer();
 *  byte[] hostByteArray = transformer.transform(javaValue);
 * </pre>
 */
public class Kcp07V05BalDetailsJavaToHostTransformer extends AbstractJavaToHostTransformer
  {


  /**
   * Create a Java to Host transformer using default COBOL parameters.
   */
  public Kcp07V05BalDetailsJavaToHostTransformer()
    {
    super();
    }

  /**
   * Create a Java to Host transformer using a specific COBOL parameters set.
   *
   * @param cobolContext the COBOL parameters set.
   */
  public Kcp07V05BalDetailsJavaToHostTransformer( final CobolContext cobolContext )
    {
    super( cobolContext );
    }

  /**
   * Create a Java to Host transformer using a specific host character set while
   * other COBOL parameters are set by default.
   *
   * @param hostCharset the host character set
   */
  public Kcp07V05BalDetailsJavaToHostTransformer( final String hostCharset )
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
