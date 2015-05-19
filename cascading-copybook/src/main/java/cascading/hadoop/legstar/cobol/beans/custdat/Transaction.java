package cascading.hadoop.legstar.cobol.beans.custdat;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Transaction complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Transaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionDate" type="{http://beans.cobol.legstar.cascading/custdat}TransactionDate"/>
 *         &lt;element name="transactionAmount">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="15"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="transactionComment">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="9"/>
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
@XmlType(name = "Transaction", propOrder = {"transactionDate", "transactionAmount", "transactionComment"})
public class Transaction implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "TRANSACTION-DATE", type = CobolType.GROUP_ITEM, levelNumber = 15, srceLine = 11)
  protected TransactionDate transactionDate;
  @XmlElement(required = true)
  @CobolElement(cobolName = "TRANSACTION-AMOUNT", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 15, isSigned = true, totalDigits = 15, fractionDigits = 2, picture = "S9(13)V99", usage = "PACKED-DECIMAL", srceLine = 17)
  protected BigDecimal transactionAmount;
  @XmlElement(required = true)
  @CobolElement(cobolName = "TRANSACTION-COMMENT", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 15, picture = "X(9)", srceLine = 18)
  protected String transactionComment;

  /**
   * Gets the value of the transactionDate property.
   *
   * @return possible object is
   * {@link TransactionDate }
   */
  public TransactionDate getTransactionDate()
    {
    return transactionDate;
    }

  /**
   * Sets the value of the transactionDate property.
   *
   * @param value allowed object is
   *              {@link TransactionDate }
   */
  public void setTransactionDate( TransactionDate value )
    {
    this.transactionDate = value;
    }

  /**
   * Gets the value of the transactionAmount property.
   *
   * @return possible object is
   * {@link java.math.BigDecimal }
   */
  public BigDecimal getTransactionAmount()
    {
    return transactionAmount;
    }

  /**
   * Sets the value of the transactionAmount property.
   *
   * @param value allowed object is
   *              {@link java.math.BigDecimal }
   */
  public void setTransactionAmount( BigDecimal value )
    {
    this.transactionAmount = value;
    }

  /**
   * Gets the value of the transactionComment property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getTransactionComment()
    {
    return transactionComment;
    }

  /**
   * Sets the value of the transactionComment property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setTransactionComment( String value )
    {
    this.transactionComment = value;
    }

  }
