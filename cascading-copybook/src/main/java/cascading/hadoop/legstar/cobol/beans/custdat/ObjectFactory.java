package cascading.hadoop.legstar.cobol.beans.custdat;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the cascading.hadoop.legstar.cobol.beans.custdat package.
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

  private final static QName _CustomerData_QNAME = new QName( "http://beans.cobol.legstar.cascading/custdat", "customerData" );

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cascading.hadoop.legstar.cobol.beans.custdat
   */
  public ObjectFactory()
    {
    }

  /**
   * Create an instance of {@link CustomerData }
   */
  public CustomerData createCustomerData()
    {
    return new CustomerData();
    }

  /**
   * Create an instance of {@link Transaction }
   */
  public Transaction createTransaction()
    {
    return new Transaction();
    }

  /**
   * Create an instance of {@link TransactionDate }
   */
  public TransactionDate createTransactionDate()
    {
    return new TransactionDate();
    }

  /**
   * Create an instance of {@link Transactions }
   */
  public Transactions createTransactions()
    {
    return new Transactions();
    }

  /**
   * Create an instance of {@link PersonalData }
   */
  public PersonalData createPersonalData()
    {
    return new PersonalData();
    }

  /**
   * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link CustomerData }{@code >}}
   */
  @XmlElementDecl(namespace = "http://beans.cobol.legstar.cascading/custdat", name = "customerData")
  public JAXBElement<CustomerData> createCustomerData( CustomerData value )
    {
    return new JAXBElement<CustomerData>( _CustomerData_QNAME, CustomerData.class, null, value );
    }

  }
