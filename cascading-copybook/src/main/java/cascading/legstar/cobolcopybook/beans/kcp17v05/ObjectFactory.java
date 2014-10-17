package cascading.legstar.cobolcopybook.beans.kcp17v05;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the cascading.legstar.cobolcopybook.beans.kcp17v05 package.
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

  private final static QName _Kcp17V05AccAddresses_QNAME = new QName( "http://beans.cobolcopybook.legstar.cascading/kcp17v05", "kcp17V05AccAddresses" );

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cascading.legstar.cobolcopybook.beans.kcp17v05
   */
  public ObjectFactory()
    {
    }

  /**
   * Create an instance of {@link Kcp17V05AddressData }
   */
  public Kcp17V05AddressData createKcp17V05AddressData()
    {
    return new Kcp17V05AddressData();
    }

  /**
   * Create an instance of {@link Kcp17V05AccAddresses }
   */
  public Kcp17V05AccAddresses createKcp17V05AccAddresses()
    {
    return new Kcp17V05AccAddresses();
    }

  /**
   * Create an instance of {@link Kcp17V05AddressDtls }
   */
  public Kcp17V05AddressDtls createKcp17V05AddressDtls()
    {
    return new Kcp17V05AddressDtls();
    }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Kcp17V05AccAddresses }{@code >}}
   */
  @XmlElementDecl(namespace = "http://beans.cobolcopybook.legstar.cascading/kcp17v05", name = "kcp17V05AccAddresses")
  public JAXBElement<Kcp17V05AccAddresses> createKcp17V05AccAddresses( Kcp17V05AccAddresses value )
    {
    return new JAXBElement<Kcp17V05AccAddresses>( _Kcp17V05AccAddresses_QNAME, Kcp17V05AccAddresses.class, null, value );
    }

  }
