package cascading.legstar.cobolcopybook.beans.kcp18v05.bind;

import com.legstar.coxb.CobolBindingException;
import com.legstar.coxb.CobolContext;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.transform.AbstractHostToJavaTransformer;

/**
 * Transforms mainframe data to a Kcp18V05AccLongName data object.
 * <p/>
 * This is a typical use of this class:
 * <pre>
 *  Kcp18V05AccLongNameHostToJavaTransformer transformer = new Kcp18V05AccLongNameHostToJavaTransformer();
 *  Kcp18V05AccLongName javaValue = (Kcp18V05AccLongName) transformer.transform(hostByteArray);
 * </pre>
 */
public class Kcp18V05AccLongNameHostToJavaTransformer extends AbstractHostToJavaTransformer
  {


  /**
   * Create a Host to Java transformer using default COBOL parameters.
   */
  public Kcp18V05AccLongNameHostToJavaTransformer()
    {
    super();
    }

  /**
   * Create a Host to Java transformer using a specific COBOL parameters set.
   *
   * @param cobolContext the COBOL parameters set.
   */
  public Kcp18V05AccLongNameHostToJavaTransformer( final CobolContext cobolContext )
    {
    super( cobolContext );
    }

  /**
   * Create a Host to Java transformer using a specific host character set while
   * other COBOL parameters are set by default.
   *
   * @param hostCharset the host character set
   */
  public Kcp18V05AccLongNameHostToJavaTransformer( final String hostCharset )
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
    return new Kcp18V05AccLongNameBinding();
    }

  }
