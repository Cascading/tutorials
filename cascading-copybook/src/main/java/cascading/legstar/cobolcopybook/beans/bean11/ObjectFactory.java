package cascading.legstar.cobolcopybook.beans.bean11;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the cascading.legstar.cobolcopybook.beans.bean11 package.
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

  private final static QName _Kcp08V05AuthLimits_QNAME = new QName( "http://beans.cobolcopybook.legstar.cascading/bean11", "kcp08V05AuthLimits" );

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cascading.legstar.cobolcopybook.beans.bean11
   */
  public ObjectFactory()
    {
    }

  /**
   * Create an instance of {@link Kcp08V05LimitTable }
   */
  public Kcp08V05LimitTable createKcp08V05LimitTable()
    {
    return new Kcp08V05LimitTable();
    }

  /**
   * Create an instance of {@link Kcp08V05AuthLimitData }
   */
  public Kcp08V05AuthLimitData createKcp08V05AuthLimitData()
    {
    return new Kcp08V05AuthLimitData();
    }

  /**
   * Create an instance of {@link Kcp08V05AuthLimits }
   */
  public Kcp08V05AuthLimits createKcp08V05AuthLimits()
    {
    return new Kcp08V05AuthLimits();
    }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Kcp08V05AuthLimits }{@code >}}
   */
  @XmlElementDecl(namespace = "http://beans.cobolcopybook.legstar.cascading/bean11", name = "kcp08V05AuthLimits")
  public JAXBElement<Kcp08V05AuthLimits> createKcp08V05AuthLimits( Kcp08V05AuthLimits value )
    {
    return new JAXBElement<Kcp08V05AuthLimits>( _Kcp08V05AuthLimits_QNAME, Kcp08V05AuthLimits.class, null, value );
    }

  }
