package cascading.legstar.cobolcopybook.beans.bean19;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp94V05HistoricalRateData complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp94V05HistoricalRateData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp94V05RateEffectiveDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp94V05EffectiveRate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp94V05RateCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp94V05DefaultRateCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp94V05MinimumRate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp94V05RateLink">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp94V05RateConsistencyInd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp94V05RateName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp94V05ZeroRateCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp94V05CrintType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="3"/>
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
@XmlType(name = "Kcp94V05HistoricalRateData", propOrder = {"kcp94V05RateEffectiveDate", "kcp94V05EffectiveRate", "kcp94V05RateCode", "kcp94V05DefaultRateCode", "kcp94V05MinimumRate", "kcp94V05RateLink", "kcp94V05RateConsistencyInd", "kcp94V05RateName", "kcp94V05ZeroRateCode", "kcp94V05CrintType"})
public class Kcp94V05HistoricalRateData implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP94V05-RATE-EFFECTIVE-DATE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 11, picture = "XX", srceLine = 22)
  protected String kcp94V05RateEffectiveDate;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP94V05-EFFECTIVE-RATE", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 11, isSigned = true, totalDigits = 5, fractionDigits = 3, picture = "S99V999", usage = "PACKED-DECIMAL", srceLine = 24)
  protected BigDecimal kcp94V05EffectiveRate;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP94V05-RATE-CODE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 11, picture = "X", srceLine = 26)
  protected String kcp94V05RateCode;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP94V05-DEFAULT-RATE-CODE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 11, picture = "X", srceLine = 28)
  protected String kcp94V05DefaultRateCode;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP94V05-MINIMUM-RATE", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 11, isSigned = true, totalDigits = 5, fractionDigits = 3, picture = "S99V999", usage = "PACKED-DECIMAL", srceLine = 30)
  protected BigDecimal kcp94V05MinimumRate;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP94V05-RATE-LINK", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 11, isSigned = true, totalDigits = 5, fractionDigits = 3, picture = "S99V999", usage = "PACKED-DECIMAL", srceLine = 32)
  protected BigDecimal kcp94V05RateLink;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP94V05-RATE-CONSISTENCY-IND", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 11, picture = "X", srceLine = 34)
  protected String kcp94V05RateConsistencyInd;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP94V05-RATE-NAME", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 11, picture = "X(15)", srceLine = 36)
  protected String kcp94V05RateName;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP94V05-ZERO-RATE-CODE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 11, picture = "X", srceLine = 38)
  protected String kcp94V05ZeroRateCode;
  @CobolElement(cobolName = "KCP94V05-CRINT-TYPE", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 11, isSigned = true, totalDigits = 3, picture = "S999", usage = "PACKED-DECIMAL", srceLine = 40)
  protected short kcp94V05CrintType;

  /**
   * Gets the value of the kcp94V05RateEffectiveDate property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp94V05RateEffectiveDate()
    {
    return kcp94V05RateEffectiveDate;
    }

  /**
   * Sets the value of the kcp94V05RateEffectiveDate property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp94V05RateEffectiveDate( String value )
    {
    this.kcp94V05RateEffectiveDate = value;
    }

  /**
   * Gets the value of the kcp94V05EffectiveRate property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getKcp94V05EffectiveRate()
    {
    return kcp94V05EffectiveRate;
    }

  /**
   * Sets the value of the kcp94V05EffectiveRate property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setKcp94V05EffectiveRate( BigDecimal value )
    {
    this.kcp94V05EffectiveRate = value;
    }

  /**
   * Gets the value of the kcp94V05RateCode property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp94V05RateCode()
    {
    return kcp94V05RateCode;
    }

  /**
   * Sets the value of the kcp94V05RateCode property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp94V05RateCode( String value )
    {
    this.kcp94V05RateCode = value;
    }

  /**
   * Gets the value of the kcp94V05DefaultRateCode property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp94V05DefaultRateCode()
    {
    return kcp94V05DefaultRateCode;
    }

  /**
   * Sets the value of the kcp94V05DefaultRateCode property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp94V05DefaultRateCode( String value )
    {
    this.kcp94V05DefaultRateCode = value;
    }

  /**
   * Gets the value of the kcp94V05MinimumRate property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getKcp94V05MinimumRate()
    {
    return kcp94V05MinimumRate;
    }

  /**
   * Sets the value of the kcp94V05MinimumRate property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setKcp94V05MinimumRate( BigDecimal value )
    {
    this.kcp94V05MinimumRate = value;
    }

  /**
   * Gets the value of the kcp94V05RateLink property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getKcp94V05RateLink()
    {
    return kcp94V05RateLink;
    }

  /**
   * Sets the value of the kcp94V05RateLink property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setKcp94V05RateLink( BigDecimal value )
    {
    this.kcp94V05RateLink = value;
    }

  /**
   * Gets the value of the kcp94V05RateConsistencyInd property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp94V05RateConsistencyInd()
    {
    return kcp94V05RateConsistencyInd;
    }

  /**
   * Sets the value of the kcp94V05RateConsistencyInd property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp94V05RateConsistencyInd( String value )
    {
    this.kcp94V05RateConsistencyInd = value;
    }

  /**
   * Gets the value of the kcp94V05RateName property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp94V05RateName()
    {
    return kcp94V05RateName;
    }

  /**
   * Sets the value of the kcp94V05RateName property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp94V05RateName( String value )
    {
    this.kcp94V05RateName = value;
    }

  /**
   * Gets the value of the kcp94V05ZeroRateCode property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp94V05ZeroRateCode()
    {
    return kcp94V05ZeroRateCode;
    }

  /**
   * Sets the value of the kcp94V05ZeroRateCode property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp94V05ZeroRateCode( String value )
    {
    this.kcp94V05ZeroRateCode = value;
    }

  /**
   * Gets the value of the kcp94V05CrintType property.
   */
  public short getKcp94V05CrintType()
    {
    return kcp94V05CrintType;
    }

  /**
   * Sets the value of the kcp94V05CrintType property.
   */
  public void setKcp94V05CrintType( short value )
    {
    this.kcp94V05CrintType = value;
    }

  }
