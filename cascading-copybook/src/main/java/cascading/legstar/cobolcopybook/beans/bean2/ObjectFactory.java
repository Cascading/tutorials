package cascading.legstar.cobolcopybook.beans.bean2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the cascading.legstar.cobolcopybook.beans.bean2 package.
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

  private final static QName _BdfoFileHeader_QNAME = new QName( "http://beans.cobolcopybook.legstar.cascading/bean2", "bdfoFileHeader" );

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cascading.legstar.cobolcopybook.beans.bean2
   */
  public ObjectFactory()
    {
    }

  /**
   * Create an instance of {@link BdfoFileHeader }
   */
  public BdfoFileHeader createBdfoFileHeader()
    {
    return new BdfoFileHeader();
    }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link BdfoFileHeader }{@code >}}
   */
  @XmlElementDecl(namespace = "http://beans.cobolcopybook.legstar.cascading/bean2", name = "bdfoFileHeader")
  public JAXBElement<BdfoFileHeader> createBdfoFileHeader( BdfoFileHeader value )
    {
    return new JAXBElement<BdfoFileHeader>( _BdfoFileHeader_QNAME, BdfoFileHeader.class, null, value );
    }

  }
