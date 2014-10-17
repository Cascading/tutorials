package cascading.legstar.cobolcopybook.beans.kcp09v05;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the cascading.legstar.cobolcopybook.beans.kcp09v05 package.
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

  private final static QName _Kcp09V05OtherLimits_QNAME = new QName( "http://beans.cobolcopybook.legstar.cascading/kcp09v05", "kcp09V05OtherLimits" );

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cascading.legstar.cobolcopybook.beans.kcp09v05
   */
  public ObjectFactory()
    {
    }

  /**
   * Create an instance of {@link Kcp09V05OtherLimits }
   */
  public Kcp09V05OtherLimits createKcp09V05OtherLimits()
    {
    return new Kcp09V05OtherLimits();
    }

  /**
   * Create an instance of {@link Kcp09V05OtherLimitsData }
   */
  public Kcp09V05OtherLimitsData createKcp09V05OtherLimitsData()
    {
    return new Kcp09V05OtherLimitsData();
    }

  /**
   * Create an instance of {@link Kcp09V05LimitTable }
   */
  public Kcp09V05LimitTable createKcp09V05LimitTable()
    {
    return new Kcp09V05LimitTable();
    }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Kcp09V05OtherLimits }{@code >}}
   */
  @XmlElementDecl(namespace = "http://beans.cobolcopybook.legstar.cascading/kcp09v05", name = "kcp09V05OtherLimits")
  public JAXBElement<Kcp09V05OtherLimits> createKcp09V05OtherLimits( Kcp09V05OtherLimits value )
    {
    return new JAXBElement<Kcp09V05OtherLimits>( _Kcp09V05OtherLimits_QNAME, Kcp09V05OtherLimits.class, null, value );
    }

  }
