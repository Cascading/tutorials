package cascading.legstar.cobolcopybook.beans.bean10;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp07V05BalTab complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp07V05BalTab">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp07V05BalIdent">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp07V05Bal">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="15"/>
 *               &lt;fractionDigits value="2"/>
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
@XmlType(name = "Kcp07V05BalTab", propOrder = {"kcp07V05BalIdent", "kcp07V05Bal"})
public class Kcp07V05BalTab implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @CobolElement(cobolName = "KCP07V05-BAL-IDENT", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 7, isSigned = true, totalDigits = 3, picture = "S999", usage = "PACKED-DECIMAL", srceLine = 14)
  protected short kcp07V05BalIdent;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP07V05-BAL", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 7, isSigned = true, totalDigits = 15, fractionDigits = 2, picture = "S9(13)V99", usage = "PACKED-DECIMAL", srceLine = 16)
  protected BigDecimal kcp07V05Bal;

  /**
   * Gets the value of the kcp07V05BalIdent property.
   */
  public short getKcp07V05BalIdent()
    {
    return kcp07V05BalIdent;
    }

  /**
   * Sets the value of the kcp07V05BalIdent property.
   */
  public void setKcp07V05BalIdent( short value )
    {
    this.kcp07V05BalIdent = value;
    }

  /**
   * Gets the value of the kcp07V05Bal property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getKcp07V05Bal()
    {
    return kcp07V05Bal;
    }

  /**
   * Sets the value of the kcp07V05Bal property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setKcp07V05Bal( BigDecimal value )
    {
    this.kcp07V05Bal = value;
    }

  }
