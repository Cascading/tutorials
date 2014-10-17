package cascading.legstar.cobolcopybook.beans.kcp07v05;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the cascading.legstar.cobolcopybook.beans.kcp07v05 package.
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

  private final static QName _Kcp07V05BalDetails_QNAME = new QName( "http://beans.cobolcopybook.legstar.cascading/kcp07v05", "kcp07V05BalDetails" );

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cascading.legstar.cobolcopybook.beans.kcp07v05
   */
  public ObjectFactory()
    {
    }

  /**
   * Create an instance of {@link Kcp07V05BalTab }
   */
  public Kcp07V05BalTab createKcp07V05BalTab()
    {
    return new Kcp07V05BalTab();
    }

  /**
   * Create an instance of {@link Kcp07V05AccountBalanceData }
   */
  public Kcp07V05AccountBalanceData createKcp07V05AccountBalanceData()
    {
    return new Kcp07V05AccountBalanceData();
    }

  /**
   * Create an instance of {@link Kcp07V05BalDetails }
   */
  public Kcp07V05BalDetails createKcp07V05BalDetails()
    {
    return new Kcp07V05BalDetails();
    }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Kcp07V05BalDetails }{@code >}}
   */
  @XmlElementDecl(namespace = "http://beans.cobolcopybook.legstar.cascading/kcp07v05", name = "kcp07V05BalDetails")
  public JAXBElement<Kcp07V05BalDetails> createKcp07V05BalDetails( Kcp07V05BalDetails value )
    {
    return new JAXBElement<Kcp07V05BalDetails>( _Kcp07V05BalDetails_QNAME, Kcp07V05BalDetails.class, null, value );
    }

  }
