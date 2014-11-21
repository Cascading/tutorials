package cascading.legstar.cobolcopybook.beans.bean17;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the cascading.legstar.cobolcopybook.beans.bean17 package.
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

  private final static QName _Kcp83V05InterestRewardData_QNAME = new QName( "http://beans.cobolcopybook.legstar.cascading/bean17", "kcp83V05InterestRewardData" );

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cascading.legstar.cobolcopybook.beans.bean17
   */
  public ObjectFactory()
    {
    }

  /**
   * Create an instance of {@link Kcp83V05InterestRewardTiers }
   */
  public Kcp83V05InterestRewardTiers createKcp83V05InterestRewardTiers()
    {
    return new Kcp83V05InterestRewardTiers();
    }

  /**
   * Create an instance of {@link Kcp83V05RewardTierData }
   */
  public Kcp83V05RewardTierData createKcp83V05RewardTierData()
    {
    return new Kcp83V05RewardTierData();
    }

  /**
   * Create an instance of {@link Kcp83V05InterestRewardData }
   */
  public Kcp83V05InterestRewardData createKcp83V05InterestRewardData()
    {
    return new Kcp83V05InterestRewardData();
    }

  /**
   * Create an instance of {@link Kcp83V05RewardTiersData }
   */
  public Kcp83V05RewardTiersData createKcp83V05RewardTiersData()
    {
    return new Kcp83V05RewardTiersData();
    }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Kcp83V05InterestRewardData }{@code >}}
   */
  @XmlElementDecl(namespace = "http://beans.cobolcopybook.legstar.cascading/bean17", name = "kcp83V05InterestRewardData")
  public JAXBElement<Kcp83V05InterestRewardData> createKcp83V05InterestRewardData( Kcp83V05InterestRewardData value )
    {
    return new JAXBElement<Kcp83V05InterestRewardData>( _Kcp83V05InterestRewardData_QNAME, Kcp83V05InterestRewardData.class, null, value );
    }

  }
