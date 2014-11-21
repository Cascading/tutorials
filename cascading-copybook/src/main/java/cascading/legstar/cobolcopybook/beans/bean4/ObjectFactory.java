package cascading.legstar.cobolcopybook.beans.bean4;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the cascading.legstar.cobolcopybook.beans.bean4 package.
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

  private final static QName _Ogp03AccountTaxData_QNAME = new QName( "http://beans.cobolcopybook.legstar.cascading/bean4", "ogp03AccountTaxData" );

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cascading.legstar.cobolcopybook.beans.bean4
   */
  public ObjectFactory()
    {
    }

  /**
   * Create an instance of {@link Ogp03AccountTaxData }
   */
  public Ogp03AccountTaxData createOgp03AccountTaxData()
    {
    return new Ogp03AccountTaxData();
    }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Ogp03AccountTaxData }{@code >}}
   */
  @XmlElementDecl(namespace = "http://beans.cobolcopybook.legstar.cascading/bean4", name = "ogp03AccountTaxData")
  public JAXBElement<Ogp03AccountTaxData> createOgp03AccountTaxData( Ogp03AccountTaxData value )
    {
    return new JAXBElement<Ogp03AccountTaxData>( _Ogp03AccountTaxData_QNAME, Ogp03AccountTaxData.class, null, value );
    }

  }
