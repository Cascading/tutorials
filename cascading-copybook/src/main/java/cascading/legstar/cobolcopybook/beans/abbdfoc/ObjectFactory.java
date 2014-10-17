package cascading.legstar.cobolcopybook.beans.abbdfoc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the cascading.legstar.cobolcopybook.beans.abbdfoc package.
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

  private final static QName _BdfoCommonData_QNAME = new QName( "http://beans.cobolcopybook.legstar.cascading/abbdfoc", "bdfoCommonData" );

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cascading.legstar.cobolcopybook.beans.abbdfoc
   */
  public ObjectFactory()
    {
    }

  /**
   * Create an instance of {@link BdfoCommonData }
   */
  public BdfoCommonData createBdfoCommonData()
    {
    return new BdfoCommonData();
    }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link BdfoCommonData }{@code >}}
   */
  @XmlElementDecl(namespace = "http://beans.cobolcopybook.legstar.cascading/abbdfoc", name = "bdfoCommonData")
  public JAXBElement<BdfoCommonData> createBdfoCommonData( BdfoCommonData value )
    {
    return new JAXBElement<BdfoCommonData>( _BdfoCommonData_QNAME, BdfoCommonData.class, null, value );
    }

  }
