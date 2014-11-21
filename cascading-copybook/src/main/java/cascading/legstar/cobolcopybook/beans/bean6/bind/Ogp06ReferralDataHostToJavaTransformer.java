package cascading.legstar.cobolcopybook.beans.bean6.bind;

import com.legstar.coxb.CobolBindingException;
import com.legstar.coxb.CobolContext;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.transform.AbstractHostToJavaTransformer;

/**
 * Transforms mainframe data to a Ogp06ReferralData data object.
 * <p/>
 * This is a typical use of this class:
 * <pre>
 *  Ogp06ReferralDataHostToJavaTransformer transformer = new Ogp06ReferralDataHostToJavaTransformer();
 *  Ogp06ReferralData javaValue = (Ogp06ReferralData) transformer.transform(hostByteArray);
 * </pre>
 */
public class Ogp06ReferralDataHostToJavaTransformer extends AbstractHostToJavaTransformer
  {


  /**
   * Create a Host to Java transformer using default COBOL parameters.
   */
  public Ogp06ReferralDataHostToJavaTransformer()
    {
    super();
    }

  /**
   * Create a Host to Java transformer using a specific COBOL parameters set.
   *
   * @param cobolContext the COBOL parameters set.
   */
  public Ogp06ReferralDataHostToJavaTransformer( final CobolContext cobolContext )
    {
    super( cobolContext );
    }

  /**
   * Create a Host to Java transformer using a specific host character set while
   * other COBOL parameters are set by default.
   *
   * @param hostCharset the host character set
   */
  public Ogp06ReferralDataHostToJavaTransformer( final String hostCharset )
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
    return new Ogp06ReferralDataBinding();
    }

  }
