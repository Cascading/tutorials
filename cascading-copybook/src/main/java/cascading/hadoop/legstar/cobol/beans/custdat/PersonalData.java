package cascading.hadoop.legstar.cobol.beans.custdat;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for PersonalData complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="PersonalData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="customerAddress">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="customerPhone">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonalData", propOrder = {"customerName", "customerAddress", "customerPhone"})
public class PersonalData implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "CUSTOMER-NAME", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 10, picture = "X(20)", srceLine = 4)
  protected String customerName;
  @XmlElement(required = true)
  @CobolElement(cobolName = "CUSTOMER-ADDRESS", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 10, picture = "X(20)", srceLine = 5)
  protected String customerAddress;
  @XmlElement(required = true)
  @CobolElement(cobolName = "CUSTOMER-PHONE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 10, picture = "X(8)", srceLine = 6)
  protected String customerPhone;

  /**
   * Gets the value of the customerName property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getCustomerName()
    {
    return customerName;
    }

  /**
   * Sets the value of the customerName property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setCustomerName( String value )
    {
    this.customerName = value;
    }

  /**
   * Gets the value of the customerAddress property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getCustomerAddress()
    {
    return customerAddress;
    }

  /**
   * Sets the value of the customerAddress property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setCustomerAddress( String value )
    {
    this.customerAddress = value;
    }

  /**
   * Gets the value of the customerPhone property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getCustomerPhone()
    {
    return customerPhone;
    }

  /**
   * Sets the value of the customerPhone property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setCustomerPhone( String value )
    {
    this.customerPhone = value;
    }

  }
