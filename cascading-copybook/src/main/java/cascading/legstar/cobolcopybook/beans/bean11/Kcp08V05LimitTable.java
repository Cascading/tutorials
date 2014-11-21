package cascading.legstar.cobolcopybook.beans.bean11;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp08V05LimitTable complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp08V05LimitTable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp08V05LimitIdent">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp08V05Limit">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="15"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp08V05LimitSubCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
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
@XmlType(name = "Kcp08V05LimitTable", propOrder = {
  "kcp08V05LimitIdent",
  "kcp08V05Limit",
  "kcp08V05LimitSubCode"
})
public class Kcp08V05LimitTable
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @CobolElement(cobolName = "KCP08V05-LIMIT-IDENT", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 7, isSigned = true, totalDigits = 3, picture = "S999", usage = "PACKED-DECIMAL", srceLine = 16)
  protected short kcp08V05LimitIdent;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP08V05-LIMIT", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 7, isSigned = true, totalDigits = 15, fractionDigits = 2, picture = "S9(13)V99", usage = "PACKED-DECIMAL", srceLine = 18)
  protected BigDecimal kcp08V05Limit;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP08V05-LIMIT-SUB-CODE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "X", srceLine = 20)
  protected String kcp08V05LimitSubCode;

  /**
   * Gets the value of the kcp08V05LimitIdent property.
   */
  public short getKcp08V05LimitIdent()
    {
    return kcp08V05LimitIdent;
    }

  /**
   * Sets the value of the kcp08V05LimitIdent property.
   */
  public void setKcp08V05LimitIdent( short value )
    {
    this.kcp08V05LimitIdent = value;
    }

  /**
   * Gets the value of the kcp08V05Limit property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getKcp08V05Limit()
    {
    return kcp08V05Limit;
    }

  /**
   * Sets the value of the kcp08V05Limit property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setKcp08V05Limit( BigDecimal value )
    {
    this.kcp08V05Limit = value;
    }

  /**
   * Gets the value of the kcp08V05LimitSubCode property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp08V05LimitSubCode()
    {
    return kcp08V05LimitSubCode;
    }

  /**
   * Sets the value of the kcp08V05LimitSubCode property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp08V05LimitSubCode( String value )
    {
    this.kcp08V05LimitSubCode = value;
    }

  }
