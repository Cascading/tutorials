package cascading.legstar.cobolcopybook.beans.bean6;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the cascading.legstar.cobolcopybook.beans.bean6 package.
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

  private final static QName _Ogp06ReferralData_QNAME = new QName( "http://beans.cobolcopybook.legstar.cascading/bean6", "ogp06ReferralData" );

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cascading.legstar.cobolcopybook.beans.bean6
   */
  public ObjectFactory()
    {
    }

  /**
   * Create an instance of {@link Ogp06ReferralData }
   */
  public Ogp06ReferralData createOgp06ReferralData()
    {
    return new Ogp06ReferralData();
    }

  /**
   * Create an instance of {@link Ogp06ReferDayOfWeek }
   */
  public Ogp06ReferDayOfWeek createOgp06ReferDayOfWeek()
    {
    return new Ogp06ReferDayOfWeek();
    }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Ogp06ReferralData }{@code >}}
   */
  @XmlElementDecl(namespace = "http://beans.cobolcopybook.legstar.cascading/bean6", name = "ogp06ReferralData")
  public JAXBElement<Ogp06ReferralData> createOgp06ReferralData( Ogp06ReferralData value )
    {
    return new JAXBElement<Ogp06ReferralData>( _Ogp06ReferralData_QNAME, Ogp06ReferralData.class, null, value );
    }

  }
