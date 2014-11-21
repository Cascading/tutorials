package cascading.legstar.cobolcopybook.beans.bean8;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the cascading.legstar.cobolcopybook.beans.bean8 package.
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

  private final static QName _Kcp02V05AccountStatus_QNAME = new QName( "http://beans.cobolcopybook.legstar.cascading/bean8", "kcp02V05AccountStatus" );

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cascading.legstar.cobolcopybook.beans.bean8
   */
  public ObjectFactory()
    {
    }

  /**
   * Create an instance of {@link Kcp02V05Dormancy }
   */
  public Kcp02V05Dormancy createKcp02V05Dormancy()
    {
    return new Kcp02V05Dormancy();
    }

  /**
   * Create an instance of {@link Kcp02V05AccountStatusData }
   */
  public Kcp02V05AccountStatusData createKcp02V05AccountStatusData()
    {
    return new Kcp02V05AccountStatusData();
    }

  /**
   * Create an instance of {@link Kcp02V05AccountStatus }
   */
  public Kcp02V05AccountStatus createKcp02V05AccountStatus()
    {
    return new Kcp02V05AccountStatus();
    }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Kcp02V05AccountStatus }{@code >}}
   */
  @XmlElementDecl(namespace = "http://beans.cobolcopybook.legstar.cascading/bean8", name = "kcp02V05AccountStatus")
  public JAXBElement<Kcp02V05AccountStatus> createKcp02V05AccountStatus( Kcp02V05AccountStatus value )
    {
    return new JAXBElement<Kcp02V05AccountStatus>( _Kcp02V05AccountStatus_QNAME, Kcp02V05AccountStatus.class, null, value );
    }

  }
