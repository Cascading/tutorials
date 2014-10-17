package cascading.legstar.cobolcopybook.beans.kcp93v05;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the cascading.legstar.cobolcopybook.beans.kcp93v05 package.
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

  private final static QName _Kcp93V05AccLevelCrint_QNAME = new QName( "http://beans.cobolcopybook.legstar.cascading/kcp93v05", "kcp93V05AccLevelCrint" );

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cascading.legstar.cobolcopybook.beans.kcp93v05
   */
  public ObjectFactory()
    {
    }

  /**
   * Create an instance of {@link Kcp93V05AccLevelCrint }
   */
  public Kcp93V05AccLevelCrint createKcp93V05AccLevelCrint()
    {
    return new Kcp93V05AccLevelCrint();
    }

  /**
   * Create an instance of {@link Kcp93V05HistoricalTierData }
   */
  public Kcp93V05HistoricalTierData createKcp93V05HistoricalTierData()
    {
    return new Kcp93V05HistoricalTierData();
    }

  /**
   * Create an instance of {@link Kcp93V05InterestLimitData }
   */
  public Kcp93V05InterestLimitData createKcp93V05InterestLimitData()
    {
    return new Kcp93V05InterestLimitData();
    }

  /**
   * Create an instance of {@link Kcp93V05AccLevelCrintTiers }
   */
  public Kcp93V05AccLevelCrintTiers createKcp93V05AccLevelCrintTiers()
    {
    return new Kcp93V05AccLevelCrintTiers();
    }

  /**
   * Create an instance of {@link Kcp93V05TierLimitData }
   */
  public Kcp93V05TierLimitData createKcp93V05TierLimitData()
    {
    return new Kcp93V05TierLimitData();
    }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Kcp93V05AccLevelCrint }{@code >}}
   */
  @XmlElementDecl(namespace = "http://beans.cobolcopybook.legstar.cascading/kcp93v05", name = "kcp93V05AccLevelCrint")
  public JAXBElement<Kcp93V05AccLevelCrint> createKcp93V05AccLevelCrint( Kcp93V05AccLevelCrint value )
    {
    return new JAXBElement<Kcp93V05AccLevelCrint>( _Kcp93V05AccLevelCrint_QNAME, Kcp93V05AccLevelCrint.class, null, value );
    }

  }
