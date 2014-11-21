package cascading.legstar.cobolcopybook.beans.bean20.bind;

import com.legstar.coxb.CobolBindingException;
import com.legstar.coxb.CobolContext;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.transform.AbstractHostToJavaTransformer;

/**
 * Transforms mainframe data to a Kcp96V05AccLevelDrint data object.
 * <p/>
 * This is a typical use of this class:
 * <pre>
 *  Kcp96V05AccLevelDrintHostToJavaTransformer transformer = new Kcp96V05AccLevelDrintHostToJavaTransformer();
 *  Kcp96V05AccLevelDrint javaValue = (Kcp96V05AccLevelDrint) transformer.transform(hostByteArray);
 * </pre>
 */
public class Kcp96V05AccLevelDrintHostToJavaTransformer extends AbstractHostToJavaTransformer
  {


  /**
   * Create a Host to Java transformer using default COBOL parameters.
   */
  public Kcp96V05AccLevelDrintHostToJavaTransformer()
    {
    super();
    }

  /**
   * Create a Host to Java transformer using a specific COBOL parameters set.
   *
   * @param cobolContext the COBOL parameters set.
   */
  public Kcp96V05AccLevelDrintHostToJavaTransformer( final CobolContext cobolContext )
    {
    super( cobolContext );
    }

  /**
   * Create a Host to Java transformer using a specific host character set while
   * other COBOL parameters are set by default.
   *
   * @param hostCharset the host character set
   */
  public Kcp96V05AccLevelDrintHostToJavaTransformer( final String hostCharset )
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
    return new Kcp96V05AccLevelDrintBinding();
    }

  }
