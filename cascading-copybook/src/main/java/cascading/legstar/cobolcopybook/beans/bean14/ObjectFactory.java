package cascading.legstar.cobolcopybook.beans.bean14;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the cascading.legstar.cobolcopybook.beans.bean14 package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory
  {

  private final static QName _Kcp16V05ProdAgreeStmtHist_QNAME = new QName( "http://beans.cobolcopybook.legstar.cascading/bean14", "kcp16V05ProdAgreeStmtHist" );

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cascading.legstar.cobolcopybook.beans.bean14
   */
  public ObjectFactory()
    {
    }

  /**
   * Create an instance of {@link Kcp16V05CrSuppList }
   */
  public Kcp16V05CrSuppList createKcp16V05CrSuppList()
    {
    return new Kcp16V05CrSuppList();
    }

  /**
   * Create an instance of {@link Kcp16V05ProdAgreeStmtHist }
   */
  public Kcp16V05ProdAgreeStmtHist createKcp16V05ProdAgreeStmtHist()
    {
    return new Kcp16V05ProdAgreeStmtHist();
    }

  /**
   * Create an instance of {@link Kcp16V05DrSuppList }
   */
  public Kcp16V05DrSuppList createKcp16V05DrSuppList()
    {
    return new Kcp16V05DrSuppList();
    }

  /**
   * Create an instance of {@link Kcp16V05NotificationTable }
   */
  public Kcp16V05NotificationTable createKcp16V05NotificationTable()
    {
    return new Kcp16V05NotificationTable();
    }

  /**
   * Create an instance of {@link Kcp16V05StatementHistData }
   */
  public Kcp16V05StatementHistData createKcp16V05StatementHistData()
    {
    return new Kcp16V05StatementHistData();
    }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Kcp16V05ProdAgreeStmtHist }{@code >}}
   */
  @XmlElementDecl(namespace = "http://beans.cobolcopybook.legstar.cascading/bean14", name = "kcp16V05ProdAgreeStmtHist")
  public JAXBElement<Kcp16V05ProdAgreeStmtHist> createKcp16V05ProdAgreeStmtHist( Kcp16V05ProdAgreeStmtHist value )
    {
    return new JAXBElement<Kcp16V05ProdAgreeStmtHist>( _Kcp16V05ProdAgreeStmtHist_QNAME, Kcp16V05ProdAgreeStmtHist.class, null, value );
    }

  }
