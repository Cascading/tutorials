package cascading.legstar.cobolcopybook.beans.bean3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the cascading.legstar.cobolcopybook.beans.bean3 package.
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

  private final static QName _BdfoFileTrailer_QNAME = new QName( "http://beans.cobolcopybook.legstar.cascading/bean3", "bdfoFileTrailer" );

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cascading.legstar.cobolcopybook.beans.bean3
   */
  public ObjectFactory()
    {
    }

  /**
   * Create an instance of {@link BdfoFileTrailer }
   */
  public BdfoFileTrailer createBdfoFileTrailer()
    {
    return new BdfoFileTrailer();
    }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link BdfoFileTrailer }{@code >}}
   */
  @XmlElementDecl(namespace = "http://beans.cobolcopybook.legstar.cascading/bean3", name = "bdfoFileTrailer")
  public JAXBElement<BdfoFileTrailer> createBdfoFileTrailer( BdfoFileTrailer value )
    {
    return new JAXBElement<BdfoFileTrailer>( _BdfoFileTrailer_QNAME, BdfoFileTrailer.class, null, value );
    }

  }
