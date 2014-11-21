package cascading.legstar.cobolcopybook.beans.bean5;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the cascading.legstar.cobolcopybook.beans.bean5 package.
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

  private final static QName _Ogp04RepaymentData_QNAME = new QName( "http://beans.cobolcopybook.legstar.cascading/bean5", "ogp04RepaymentData" );

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cascading.legstar.cobolcopybook.beans.bean5
   */
  public ObjectFactory()
    {
    }

  /**
   * Create an instance of {@link Ogp04RepaymentData }
   */
  public Ogp04RepaymentData createOgp04RepaymentData()
    {
    return new Ogp04RepaymentData();
    }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Ogp04RepaymentData }{@code >}}
   */
  @XmlElementDecl(namespace = "http://beans.cobolcopybook.legstar.cascading/bean5", name = "ogp04RepaymentData")
  public JAXBElement<Ogp04RepaymentData> createOgp04RepaymentData( Ogp04RepaymentData value )
    {
    return new JAXBElement<Ogp04RepaymentData>( _Ogp04RepaymentData_QNAME, Ogp04RepaymentData.class, null, value );
    }

  }
