package cascading.legstar.cobolcopybook.beans.bean9.bind;

import com.legstar.coxb.CobolBindingException;
import com.legstar.coxb.CobolContext;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.transform.AbstractHostToJavaTransformer;

/**
 * Transforms mainframe data to a Kcp05V10ProfileMarkers data object.
 * <p/>
 * This is a typical use of this class:
 * <pre>
 *  Kcp05V10ProfileMarkersHostToJavaTransformer transformer = new Kcp05V10ProfileMarkersHostToJavaTransformer();
 *  Kcp05V10ProfileMarkers javaValue = (Kcp05V10ProfileMarkers) transformer.transform(hostByteArray);
 * </pre>
 */
public class Kcp05V10ProfileMarkersHostToJavaTransformer extends AbstractHostToJavaTransformer
  {


  /**
   * Create a Host to Java transformer using default COBOL parameters.
   */
  public Kcp05V10ProfileMarkersHostToJavaTransformer()
    {
    super();
    }

  /**
   * Create a Host to Java transformer using a specific COBOL parameters set.
   *
   * @param cobolContext the COBOL parameters set.
   */
  public Kcp05V10ProfileMarkersHostToJavaTransformer( final CobolContext cobolContext )
    {
    super( cobolContext );
    }

  /**
   * Create a Host to Java transformer using a specific host character set while
   * other COBOL parameters are set by default.
   *
   * @param hostCharset the host character set
   */
  public Kcp05V10ProfileMarkersHostToJavaTransformer( final String hostCharset )
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
    return new Kcp05V10ProfileMarkersBinding();
    }

  }
