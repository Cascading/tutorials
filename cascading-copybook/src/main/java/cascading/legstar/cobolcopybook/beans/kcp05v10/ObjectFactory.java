package cascading.legstar.cobolcopybook.beans.kcp05v10;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the cascading.legstar.cobolcopybook.beans.kcp05v10 package.
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

  private final static QName _Kcp05V10ProfileMarkers_QNAME = new QName( "http://beans.cobolcopybook.legstar.cascading/kcp05v10", "kcp05V10ProfileMarkers" );

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cascading.legstar.cobolcopybook.beans.kcp05v10
   */
  public ObjectFactory()
    {
    }

  /**
   * Create an instance of {@link Kcp05V10Profile3Rd7Dgts }
   */
  public Kcp05V10Profile3Rd7Dgts createKcp05V10Profile3Rd7Dgts()
    {
    return new Kcp05V10Profile3Rd7Dgts();
    }

  /**
   * Create an instance of {@link Kcp05V10Profile1Dgts }
   */
  public Kcp05V10Profile1Dgts createKcp05V10Profile1Dgts()
    {
    return new Kcp05V10Profile1Dgts();
    }

  /**
   * Create an instance of {@link Kcp05V10ProfileMarkers }
   */
  public Kcp05V10ProfileMarkers createKcp05V10ProfileMarkers()
    {
    return new Kcp05V10ProfileMarkers();
    }

  /**
   * Create an instance of {@link Kcp05V10Profile5Dgts }
   */
  public Kcp05V10Profile5Dgts createKcp05V10Profile5Dgts()
    {
    return new Kcp05V10Profile5Dgts();
    }

  /**
   * Create an instance of {@link Kcp05V10Profile2Nd7Dgts }
   */
  public Kcp05V10Profile2Nd7Dgts createKcp05V10Profile2Nd7Dgts()
    {
    return new Kcp05V10Profile2Nd7Dgts();
    }

  /**
   * Create an instance of {@link Kcp05V10Profile3Dgts }
   */
  public Kcp05V10Profile3Dgts createKcp05V10Profile3Dgts()
    {
    return new Kcp05V10Profile3Dgts();
    }

  /**
   * Create an instance of {@link Kcp05V10Profile7Dgts }
   */
  public Kcp05V10Profile7Dgts createKcp05V10Profile7Dgts()
    {
    return new Kcp05V10Profile7Dgts();
    }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Kcp05V10ProfileMarkers }{@code >}}
   */
  @XmlElementDecl(namespace = "http://beans.cobolcopybook.legstar.cascading/kcp05v10", name = "kcp05V10ProfileMarkers")
  public JAXBElement<Kcp05V10ProfileMarkers> createKcp05V10ProfileMarkers( Kcp05V10ProfileMarkers value )
    {
    return new JAXBElement<Kcp05V10ProfileMarkers>( _Kcp05V10ProfileMarkers_QNAME, Kcp05V10ProfileMarkers.class, null, value );
    }

  }
