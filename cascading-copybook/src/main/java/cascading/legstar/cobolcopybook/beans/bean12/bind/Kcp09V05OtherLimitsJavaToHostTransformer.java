package cascading.legstar.cobolcopybook.beans.bean12.bind;

import com.legstar.coxb.CobolBindingException;
import com.legstar.coxb.CobolContext;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.transform.AbstractJavaToHostTransformer;

/**
 * Transforms a Kcp09V05OtherLimits data object to mainframe data.
 * <p/>
 * This is a typical use of this class:
 * <pre>
 *  Kcp09V05OtherLimitsJavaToHostTransformer transformer = new Kcp09V05OtherLimitsJavaToHostTransformer();
 *  byte[] hostByteArray = transformer.transform(javaValue);
 * </pre>
 */
public class Kcp09V05OtherLimitsJavaToHostTransformer extends AbstractJavaToHostTransformer
  {


  /**
   * Create a Java to Host transformer using default COBOL parameters.
   */
  public Kcp09V05OtherLimitsJavaToHostTransformer()
    {
    super();
    }

  /**
   * Create a Java to Host transformer using a specific COBOL parameters set.
   *
   * @param cobolContext the COBOL parameters set.
   */
  public Kcp09V05OtherLimitsJavaToHostTransformer( final CobolContext cobolContext )
    {
    super( cobolContext );
    }

  /**
   * Create a Java to Host transformer using a specific host character set while
   * other COBOL parameters are set by default.
   *
   * @param hostCharset the host character set
   */
  public Kcp09V05OtherLimitsJavaToHostTransformer( final String hostCharset )
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
