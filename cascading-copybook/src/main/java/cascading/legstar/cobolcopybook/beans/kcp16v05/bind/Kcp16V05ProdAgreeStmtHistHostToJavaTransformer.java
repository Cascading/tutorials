package cascading.legstar.cobolcopybook.beans.kcp16v05.bind;

import com.legstar.coxb.CobolBindingException;
import com.legstar.coxb.CobolContext;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.transform.AbstractHostToJavaTransformer;

/**
 * Transforms mainframe data to a Kcp16V05ProdAgreeStmtHist data object.
 * <p/>
 * This is a typical use of this class:
 * <pre>
 *  Kcp16V05ProdAgreeStmtHistHostToJavaTransformer transformer = new Kcp16V05ProdAgreeStmtHistHostToJavaTransformer();
 *  Kcp16V05ProdAgreeStmtHist javaValue = (Kcp16V05ProdAgreeStmtHist) transformer.transform(hostByteArray);
 * </pre>
 */
public class Kcp16V05ProdAgreeStmtHistHostToJavaTransformer extends AbstractHostToJavaTransformer
  {


  /**
   * Create a Host to Java transformer using default COBOL parameters.
   */
  public Kcp16V05ProdAgreeStmtHistHostToJavaTransformer()
    {
    super();
    }

  /**
   * Create a Host to Java transformer using a specific COBOL parameters set.
   *
   * @param cobolContext the COBOL parameters set.
   */
  public Kcp16V05ProdAgreeStmtHistHostToJavaTransformer( final CobolContext cobolContext )
    {
    super( cobolContext );
    }

  /**
   * Create a Host to Java transformer using a specific host character set while
   * other COBOL parameters are set by default.
   *
   * @param hostCharset the host character set
   */
  public Kcp16V05ProdAgreeStmtHistHostToJavaTransformer( final String hostCharset )
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
    return new Kcp16V05ProdAgreeStmtHistBinding();
    }

  }
