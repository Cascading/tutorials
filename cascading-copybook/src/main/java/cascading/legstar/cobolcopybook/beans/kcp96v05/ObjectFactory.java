package cascading.legstar.cobolcopybook.beans.kcp96v05;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the cascading.legstar.cobolcopybook.beans.kcp96v05 package.
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

  private final static QName _Kcp96V05AccLevelDrint_QNAME = new QName( "http://beans.cobolcopybook.legstar.cascading/kcp96v05", "kcp96V05AccLevelDrint" );

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cascading.legstar.cobolcopybook.beans.kcp96v05
   */
  public ObjectFactory()
    {
    }

  /**
   * Create an instance of {@link Kcp96V05InterestLimitData }
   */
  public Kcp96V05InterestLimitData createKcp96V05InterestLimitData()
    {
    return new Kcp96V05InterestLimitData();
    }

  /**
   * Create an instance of {@link Kcp96V05AccLevelDrintData }
   */
  public Kcp96V05AccLevelDrintData createKcp96V05AccLevelDrintData()
    {
    return new Kcp96V05AccLevelDrintData();
    }

  /**
   * Create an instance of {@link Kcp96V05AccLevelDrint }
   */
  public Kcp96V05AccLevelDrint createKcp96V05AccLevelDrint()
    {
    return new Kcp96V05AccLevelDrint();
    }

  /**
   * Create an instance of {@link Kcp96V05HistoricalTierData }
   */
  public Kcp96V05HistoricalTierData createKcp96V05HistoricalTierData()
    {
    return new Kcp96V05HistoricalTierData();
    }

  /**
   * Create an instance of {@link Kcp96V05TierLimitData }
   */
  public Kcp96V05TierLimitData createKcp96V05TierLimitData()
    {
    return new Kcp96V05TierLimitData();
    }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Kcp96V05AccLevelDrint }{@code >}}
   */
  @XmlElementDecl(namespace = "http://beans.cobolcopybook.legstar.cascading/kcp96v05", name = "kcp96V05AccLevelDrint")
  public JAXBElement<Kcp96V05AccLevelDrint> createKcp96V05AccLevelDrint( Kcp96V05AccLevelDrint value )
    {
    return new JAXBElement<Kcp96V05AccLevelDrint>( _Kcp96V05AccLevelDrint_QNAME, Kcp96V05AccLevelDrint.class, null, value );
    }

  }
