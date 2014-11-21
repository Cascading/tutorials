package cascading.legstar.cobolcopybook.beans.bean21;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the cascading.legstar.cobolcopybook.beans.bean21 package.
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

  private final static QName _Kcp97V05DrintRates_QNAME = new QName( "http://beans.cobolcopybook.legstar.cascading/bean21", "kcp97V05DrintRates" );

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cascading.legstar.cobolcopybook.beans.bean21
   */
  public ObjectFactory()
    {
    }

  /**
   * Create an instance of {@link Kcp97V05InterestRateData }
   */
  public Kcp97V05InterestRateData createKcp97V05InterestRateData()
    {
    return new Kcp97V05InterestRateData();
    }

  /**
   * Create an instance of {@link Kcp97V05TierRateData }
   */
  public Kcp97V05TierRateData createKcp97V05TierRateData()
    {
    return new Kcp97V05TierRateData();
    }

  /**
   * Create an instance of {@link Kcp97V05HistoricalRateData }
   */
  public Kcp97V05HistoricalRateData createKcp97V05HistoricalRateData()
    {
    return new Kcp97V05HistoricalRateData();
    }

  /**
   * Create an instance of {@link Kcp97V05DrintRates }
   */
  public Kcp97V05DrintRates createKcp97V05DrintRates()
    {
    return new Kcp97V05DrintRates();
    }

  /**
   * Create an instance of {@link Kcp97V05DrintRateData }
   */
  public Kcp97V05DrintRateData createKcp97V05DrintRateData()
    {
    return new Kcp97V05DrintRateData();
    }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Kcp97V05DrintRates }{@code >}}
   */
  @XmlElementDecl(namespace = "http://beans.cobolcopybook.legstar.cascading/bean21", name = "kcp97V05DrintRates")
  public JAXBElement<Kcp97V05DrintRates> createKcp97V05DrintRates( Kcp97V05DrintRates value )
    {
    return new JAXBElement<Kcp97V05DrintRates>( _Kcp97V05DrintRates_QNAME, Kcp97V05DrintRates.class, null, value );
    }

  }
