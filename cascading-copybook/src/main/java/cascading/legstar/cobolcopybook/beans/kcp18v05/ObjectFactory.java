package cascading.legstar.cobolcopybook.beans.kcp18v05;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the cascading.legstar.cobolcopybook.beans.kcp18v05 package.
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

  private final static QName _Kcp18V05AccLongName_QNAME = new QName( "http://beans.cobolcopybook.legstar.cascading/kcp18v05", "kcp18V05AccLongName" );

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cascading.legstar.cobolcopybook.beans.kcp18v05
   */
  public ObjectFactory()
    {
    }

  /**
   * Create an instance of {@link Kcp18V05LongNameData }
   */
  public Kcp18V05LongNameData createKcp18V05LongNameData()
    {
    return new Kcp18V05LongNameData();
    }

  /**
   * Create an instance of {@link Kcp18V05AccLongName }
   */
  public Kcp18V05AccLongName createKcp18V05AccLongName()
    {
    return new Kcp18V05AccLongName();
    }

  /**
   * Create an instance of {@link Kcp18V05LnameData }
   */
  public Kcp18V05LnameData createKcp18V05LnameData()
    {
    return new Kcp18V05LnameData();
    }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Kcp18V05AccLongName }{@code >}}
   */
  @XmlElementDecl(namespace = "http://beans.cobolcopybook.legstar.cascading/kcp18v05", name = "kcp18V05AccLongName")
  public JAXBElement<Kcp18V05AccLongName> createKcp18V05AccLongName( Kcp18V05AccLongName value )
    {
    return new JAXBElement<Kcp18V05AccLongName>( _Kcp18V05AccLongName_QNAME, Kcp18V05AccLongName.class, null, value );
    }

  }
