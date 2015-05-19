package cascading.legstar.cobolcopybook.beans.bean12;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp09V05LimitTable complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp09V05LimitTable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp09V05LimitIdent">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp09V05Limit">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="15"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp09V05LimitSubCode">
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
@XmlType(name = "Kcp09V05LimitTable", propOrder = {"kcp09V05LimitIdent", "kcp09V05Limit", "kcp09V05LimitSubCode"})
public class Kcp09V05LimitTable implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @CobolElement(cobolName = "KCP09V05-LIMIT-IDENT", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 7, isSigned = true, totalDigits = 3, picture = "S999", usage = "PACKED-DECIMAL", srceLine = 14)
  protected short kcp09V05LimitIdent;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP09V05-LIMIT", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 7, isSigned = true, totalDigits = 15, fractionDigits = 2, picture = "S9(13)V99", usage = "PACKED-DECIMAL", srceLine = 16)
  protected BigDecimal kcp09V05Limit;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP09V05-LIMIT-SUB-CODE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "X", srceLine = 18)
  protected String kcp09V05LimitSubCode;

  /**
   * Gets the value of the kcp09V05LimitIdent property.
   */
  public short getKcp09V05LimitIdent()
    {
    return kcp09V05LimitIdent;
    }

  /**
   * Sets the value of the kcp09V05LimitIdent property.
   */
  public void setKcp09V05LimitIdent( short value )
    {
    this.kcp09V05LimitIdent = value;
    }

  /**
   * Gets the value of the kcp09V05Limit property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getKcp09V05Limit()
    {
    return kcp09V05Limit;
    }

  /**
   * Sets the value of the kcp09V05Limit property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setKcp09V05Limit( BigDecimal value )
    {
    this.kcp09V05Limit = value;
    }

  /**
   * Gets the value of the kcp09V05LimitSubCode property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp09V05LimitSubCode()
    {
    return kcp09V05LimitSubCode;
    }

  /**
   * Sets the value of the kcp09V05LimitSubCode property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp09V05LimitSubCode( String value )
    {
    this.kcp09V05LimitSubCode = value;
    }

  }
