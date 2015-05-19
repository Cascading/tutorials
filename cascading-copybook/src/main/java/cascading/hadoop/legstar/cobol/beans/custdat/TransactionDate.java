package cascading.hadoop.legstar.cobol.beans.custdat;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for TransactionDate complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="TransactionDate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionDay">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="filler13">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="transactionMonth">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="filler15">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="transactionYear">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
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
@XmlType(name = "TransactionDate", propOrder = {"transactionDay", "filler13", "transactionMonth", "filler15", "transactionYear"})
public class TransactionDate implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "TRANSACTION-DAY", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 20, picture = "X(2)", srceLine = 12)
  protected String transactionDay;
  @XmlElement(required = true)
  @CobolElement(cobolName = "FILLER", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 20, picture = "X", srceLine = 13)
  protected String filler13;
  @XmlElement(required = true)
  @CobolElement(cobolName = "TRANSACTION-MONTH", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 20, picture = "X(2)", srceLine = 14)
  protected String transactionMonth;
  @XmlElement(required = true)
  @CobolElement(cobolName = "FILLER", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 20, picture = "X", srceLine = 15)
  protected String filler15;
  @XmlElement(required = true)
  @CobolElement(cobolName = "TRANSACTION-YEAR", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 20, picture = "X(2)", srceLine = 16)
  protected String transactionYear;

  /**
   * Gets the value of the transactionDay property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getTransactionDay()
    {
    return transactionDay;
    }

  /**
   * Sets the value of the transactionDay property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setTransactionDay( String value )
    {
    this.transactionDay = value;
    }

  /**
   * Gets the value of the filler13 property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getFiller13()
    {
    return filler13;
    }

  /**
   * Sets the value of the filler13 property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setFiller13( String value )
    {
    this.filler13 = value;
    }

  /**
   * Gets the value of the transactionMonth property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getTransactionMonth()
    {
    return transactionMonth;
    }

  /**
   * Sets the value of the transactionMonth property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setTransactionMonth( String value )
    {
    this.transactionMonth = value;
    }

  /**
   * Gets the value of the filler15 property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getFiller15()
    {
    return filler15;
    }

  /**
   * Sets the value of the filler15 property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setFiller15( String value )
    {
    this.filler15 = value;
    }

  /**
   * Gets the value of the transactionYear property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getTransactionYear()
    {
    return transactionYear;
    }

  /**
   * Sets the value of the transactionYear property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setTransactionYear( String value )
    {
    this.transactionYear = value;
    }

  }
