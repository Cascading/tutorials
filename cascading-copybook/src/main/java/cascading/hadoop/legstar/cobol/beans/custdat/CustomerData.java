package cascading.hadoop.legstar.cobol.beans.custdat;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for CustomerData complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="CustomerData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerId">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *               &lt;totalDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="personalData" type="{http://beans.cobol.legstar.cascading/custdat}PersonalData"/>
 *         &lt;element name="transactions" type="{http://beans.cobol.legstar.cascading/custdat}Transactions"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerData", propOrder = {"customerId", "personalData", "transactions"})
public class CustomerData implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @CobolElement(cobolName = "CUSTOMER-ID", type = CobolType.ZONED_DECIMAL_ITEM, levelNumber = 5, isSigned = false, totalDigits = 6, picture = "9(6)", srceLine = 2)
  protected long customerId;
  @XmlElement(required = true)
  @CobolElement(cobolName = "PERSONAL-DATA", type = CobolType.GROUP_ITEM, levelNumber = 5, srceLine = 3)
  protected PersonalData personalData;
  @XmlElement(required = true)
  @CobolElement(cobolName = "TRANSACTIONS", type = CobolType.GROUP_ITEM, levelNumber = 5, srceLine = 7)
  protected Transactions transactions;

  /**
   * Gets the value of the customerId property.
   */
  public long getCustomerId()
    {
    return customerId;
    }

  /**
   * Sets the value of the customerId property.
   */
  public void setCustomerId( long value )
    {
    this.customerId = value;
    }

  /**
   * Gets the value of the personalData property.
   *
   * @return possible object is
   * {@link PersonalData }
   */
  public PersonalData getPersonalData()
    {
    return personalData;
    }

  /**
   * Sets the value of the personalData property.
   *
   * @param value allowed object is
   *              {@link PersonalData }
   */
  public void setPersonalData( PersonalData value )
    {
    this.personalData = value;
    }

  /**
   * Gets the value of the transactions property.
   *
   * @return possible object is
   * {@link Transactions }
   */
  public Transactions getTransactions()
    {
    return transactions;
    }

  /**
   * Sets the value of the transactions property.
   *
   * @param value allowed object is
   *              {@link Transactions }
   */
  public void setTransactions( Transactions value )
    {
    this.transactions = value;
    }

  }
