package cascading.legstar.cobolcopybook.beans.bean8.bind;

import com.legstar.coxb.CobolBindingException;
import com.legstar.coxb.CobolContext;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.transform.AbstractJavaToHostTransformer;

/**
 * Transforms a Kcp02V05AccountStatus data object to mainframe data.
 * <p/>
 * This is a typical use of this class:
 * <pre>
 *  Kcp02V05AccountStatusJavaToHostTransformer transformer = new Kcp02V05AccountStatusJavaToHostTransformer();
 *  byte[] hostByteArray = transformer.transform(javaValue);
 * </pre>
 */
public class Kcp02V05AccountStatusJavaToHostTransformer extends AbstractJavaToHostTransformer
  {


  /**
   * Create a Java to Host transformer using default COBOL parameters.
   */
  public Kcp02V05AccountStatusJavaToHostTransformer()
    {
    super();
    }

  /**
   * Create a Java to Host transformer using a specific COBOL parameters set.
   *
   * @param cobolContext the COBOL parameters set.
   */
  public Kcp02V05AccountStatusJavaToHostTransformer( final CobolContext cobolContext )
    {
    super( cobolContext );
    }

  /**
   * Create a Java to Host transformer using a specific host character set while
   * other COBOL parameters are set by default.
   *
   * @param hostCharset the host character set
   */
  public Kcp02V05AccountStatusJavaToHostTransformer( final String hostCharset )
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
