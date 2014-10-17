package cascading.legstar.cobolcopybook.beans.kcp94v05;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the cascading.legstar.cobolcopybook.beans.kcp94v05 package.
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

  private final static QName _Kcp94V05AccLevelCrint_QNAME = new QName( "http://beans.cobolcopybook.legstar.cascading/kcp94v05", "kcp94V05AccLevelCrint" );

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cascading.legstar.cobolcopybook.beans.kcp94v05
   */
  public ObjectFactory()
    {
    }

  /**
   * Create an instance of {@link Kcp94V05AccLevelCrintData }
   */
  public Kcp94V05AccLevelCrintData createKcp94V05AccLevelCrintData()
    {
    return new Kcp94V05AccLevelCrintData();
    }

  /**
   * Create an instance of {@link Kcp94V05InterestRateData }
   */
  public Kcp94V05InterestRateData createKcp94V05InterestRateData()
    {
    return new Kcp94V05InterestRateData();
    }

  /**
   * Create an instance of {@link Kcp94V05TierRateData }
   */
  public Kcp94V05TierRateData createKcp94V05TierRateData()
    {
    return new Kcp94V05TierRateData();
    }

  /**
   * Create an instance of {@link Kcp94V05HistoricalRateData }
   */
  public Kcp94V05HistoricalRateData createKcp94V05HistoricalRateData()
    {
    return new Kcp94V05HistoricalRateData();
    }

  /**
   * Create an instance of {@link Kcp94V05AccLevelCrint }
   */
  public Kcp94V05AccLevelCrint createKcp94V05AccLevelCrint()
    {
    return new Kcp94V05AccLevelCrint();
    }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Kcp94V05AccLevelCrint }{@code >}}
   */
  @XmlElementDecl(namespace = "http://beans.cobolcopybook.legstar.cascading/kcp94v05", name = "kcp94V05AccLevelCrint")
  public JAXBElement<Kcp94V05AccLevelCrint> createKcp94V05AccLevelCrint( Kcp94V05AccLevelCrint value )
    {
    return new JAXBElement<Kcp94V05AccLevelCrint>( _Kcp94V05AccLevelCrint_QNAME, Kcp94V05AccLevelCrint.class, null, value );
    }

  }
