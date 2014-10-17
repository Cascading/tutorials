package cascading.legstar.cobolcopybook.beans.kcp83v05.bind;

import com.legstar.coxb.CobolBindingException;
import com.legstar.coxb.CobolContext;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.transform.AbstractHostToJavaTransformer;

/**
 * Transforms mainframe data to a Kcp83V05InterestRewardData data object.
 * <p/>
 * This is a typical use of this class:
 * <pre>
 *  Kcp83V05InterestRewardDataHostToJavaTransformer transformer = new Kcp83V05InterestRewardDataHostToJavaTransformer();
 *  Kcp83V05InterestRewardData javaValue = (Kcp83V05InterestRewardData) transformer.transform(hostByteArray);
 * </pre>
 */
public class Kcp83V05InterestRewardDataHostToJavaTransformer extends AbstractHostToJavaTransformer
  {


  /**
   * Create a Host to Java transformer using default COBOL parameters.
   */
  public Kcp83V05InterestRewardDataHostToJavaTransformer()
    {
    super();
    }

  /**
   * Create a Host to Java transformer using a specific COBOL parameters set.
   *
   * @param cobolContext the COBOL parameters set.
   */
  public Kcp83V05InterestRewardDataHostToJavaTransformer( final CobolContext cobolContext )
    {
    super( cobolContext );
    }

  /**
   * Create a Host to Java transformer using a specific host character set while
   * other COBOL parameters are set by default.
   *
   * @param hostCharset the host character set
   */
  public Kcp83V05InterestRewardDataHostToJavaTransformer( final String hostCharset )
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
    return new Kcp83V05InterestRewardDataBinding();
    }

  }
