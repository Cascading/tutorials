package cascading.legstar.cobolcopybook.beans.bean13;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the cascading.legstar.cobolcopybook.beans.bean13 package.
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

  private final static QName _Kcp13V05NotifDiaryFormat_QNAME = new QName( "http://beans.cobolcopybook.legstar.cascading/bean13", "kcp13V05NotifDiaryFormat" );

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cascading.legstar.cobolcopybook.beans.bean13
   */
  public ObjectFactory()
    {
    }

  /**
   * Create an instance of {@link Kcp13V05PrenotPrintDates }
   */
  public Kcp13V05PrenotPrintDates createKcp13V05PrenotPrintDates()
    {
    return new Kcp13V05PrenotPrintDates();
    }

  /**
   * Create an instance of {@link Kcp13V05NotificatDiaryData }
   */
  public Kcp13V05NotificatDiaryData createKcp13V05NotificatDiaryData()
    {
    return new Kcp13V05NotificatDiaryData();
    }

  /**
   * Create an instance of {@link Kcp13V05NotifDiaryFormat }
   */
  public Kcp13V05NotifDiaryFormat createKcp13V05NotifDiaryFormat()
    {
    return new Kcp13V05NotifDiaryFormat();
    }

  /**
   * Create an instance of {@link Kcp13V05NotificatFreqDetail }
   */
  public Kcp13V05NotificatFreqDetail createKcp13V05NotificatFreqDetail()
    {
    return new Kcp13V05NotificatFreqDetail();
    }

  /**
   * Create an instance of {@link Kcp13V05NotificationData }
   */
  public Kcp13V05NotificationData createKcp13V05NotificationData()
    {
    return new Kcp13V05NotificationData();
    }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Kcp13V05NotifDiaryFormat }{@code >}}
   */
  @XmlElementDecl(namespace = "http://beans.cobolcopybook.legstar.cascading/bean13", name = "kcp13V05NotifDiaryFormat")
  public JAXBElement<Kcp13V05NotifDiaryFormat> createKcp13V05NotifDiaryFormat( Kcp13V05NotifDiaryFormat value )
    {
    return new JAXBElement<Kcp13V05NotifDiaryFormat>( _Kcp13V05NotifDiaryFormat_QNAME, Kcp13V05NotifDiaryFormat.class, null, value );
    }

  }
