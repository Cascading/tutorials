package cascading.legstar.cobolcopybook.beans.bean21;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp97V05HistoricalRateData complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp97V05HistoricalRateData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp97V05RateEffectiveDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp97V05EffectiveRate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp97V05RateCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp97V05DefaultRateCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp97V05MinimumRate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp97V05RateLink">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp97V05RateConsistencyInd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp97V05RateName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp97V05ZeroRateCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp97V05DrintType">
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
@XmlType(name = "Kcp97V05HistoricalRateData", propOrder = {
  "kcp97V05RateEffectiveDate",
  "kcp97V05EffectiveRate",
  "kcp97V05RateCode",
  "kcp97V05DefaultRateCode",
  "kcp97V05MinimumRate",
  "kcp97V05RateLink",
  "kcp97V05RateConsistencyInd",
  "kcp97V05RateName",
  "kcp97V05ZeroRateCode",
  "kcp97V05DrintType"
})
public class Kcp97V05HistoricalRateData
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP97V05-RATE-EFFECTIVE-DATE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 11, picture = "XX", srceLine = 24)
  protected String kcp97V05RateEffectiveDate;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP97V05-EFFECTIVE-RATE", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 11, isSigned = true, totalDigits = 5, fractionDigits = 3, picture = "S99V999", usage = "PACKED-DECIMAL", srceLine = 26)
  protected BigDecimal kcp97V05EffectiveRate;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP97V05-RATE-CODE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 11, picture = "X", srceLine = 28)
  protected String kcp97V05RateCode;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP97V05-DEFAULT-RATE-CODE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 11, picture = "X", srceLine = 30)
  protected String kcp97V05DefaultRateCode;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP97V05-MINIMUM-RATE", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 11, isSigned = true, totalDigits = 5, fractionDigits = 3, picture = "S99V999", usage = "PACKED-DECIMAL", srceLine = 32)
  protected BigDecimal kcp97V05MinimumRate;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP97V05-RATE-LINK", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 11, isSigned = true, totalDigits = 5, fractionDigits = 3, picture = "S99V999", usage = "PACKED-DECIMAL", srceLine = 34)
  protected BigDecimal kcp97V05RateLink;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP97V05-RATE-CONSISTENCY-IND", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 11, picture = "X", srceLine = 36)
  protected String kcp97V05RateConsistencyInd;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP97V05-RATE-NAME", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 11, picture = "X(15)", srceLine = 38)
  protected String kcp97V05RateName;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP97V05-ZERO-RATE-CODE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 11, picture = "X", srceLine = 40)
  protected String kcp97V05ZeroRateCode;
  @CobolElement(cobolName = "KCP97V05-DRINT-TYPE", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 11, isSigned = true, totalDigits = 3, picture = "S999", usage = "PACKED-DECIMAL", srceLine = 42)
  protected short kcp97V05DrintType;

  /**
   * Gets the value of the kcp97V05RateEffectiveDate property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp97V05RateEffectiveDate()
    {
    return kcp97V05RateEffectiveDate;
    }

  /**
   * Sets the value of the kcp97V05RateEffectiveDate property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp97V05RateEffectiveDate( String value )
    {
    this.kcp97V05RateEffectiveDate = value;
    }

  /**
   * Gets the value of the kcp97V05EffectiveRate property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getKcp97V05EffectiveRate()
    {
    return kcp97V05EffectiveRate;
    }

  /**
   * Sets the value of the kcp97V05EffectiveRate property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setKcp97V05EffectiveRate( BigDecimal value )
    {
    this.kcp97V05EffectiveRate = value;
    }

  /**
   * Gets the value of the kcp97V05RateCode property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp97V05RateCode()
    {
    return kcp97V05RateCode;
    }

  /**
   * Sets the value of the kcp97V05RateCode property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp97V05RateCode( String value )
    {
    this.kcp97V05RateCode = value;
    }

  /**
   * Gets the value of the kcp97V05DefaultRateCode property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp97V05DefaultRateCode()
    {
    return kcp97V05DefaultRateCode;
    }

  /**
   * Sets the value of the kcp97V05DefaultRateCode property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp97V05DefaultRateCode( String value )
    {
    this.kcp97V05DefaultRateCode = value;
    }

  /**
   * Gets the value of the kcp97V05MinimumRate property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getKcp97V05MinimumRate()
    {
    return kcp97V05MinimumRate;
    }

  /**
   * Sets the value of the kcp97V05MinimumRate property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setKcp97V05MinimumRate( BigDecimal value )
    {
    this.kcp97V05MinimumRate = value;
    }

  /**
   * Gets the value of the kcp97V05RateLink property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getKcp97V05RateLink()
    {
    return kcp97V05RateLink;
    }

  /**
   * Sets the value of the kcp97V05RateLink property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setKcp97V05RateLink( BigDecimal value )
    {
    this.kcp97V05RateLink = value;
    }

  /**
   * Gets the value of the kcp97V05RateConsistencyInd property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp97V05RateConsistencyInd()
    {
    return kcp97V05RateConsistencyInd;
    }

  /**
   * Sets the value of the kcp97V05RateConsistencyInd property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp97V05RateConsistencyInd( String value )
    {
    this.kcp97V05RateConsistencyInd = value;
    }

  /**
   * Gets the value of the kcp97V05RateName property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp97V05RateName()
    {
    return kcp97V05RateName;
    }

  /**
   * Sets the value of the kcp97V05RateName property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp97V05RateName( String value )
    {
    this.kcp97V05RateName = value;
    }

  /**
   * Gets the value of the kcp97V05ZeroRateCode property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp97V05ZeroRateCode()
    {
    return kcp97V05ZeroRateCode;
    }

  /**
   * Sets the value of the kcp97V05ZeroRateCode property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp97V05ZeroRateCode( String value )
    {
    this.kcp97V05ZeroRateCode = value;
    }

  /**
   * Gets the value of the kcp97V05DrintType property.
   */
  public short getKcp97V05DrintType()
    {
    return kcp97V05DrintType;
    }

  /**
   * Sets the value of the kcp97V05DrintType property.
   */
  public void setKcp97V05DrintType( short value )
    {
    this.kcp97V05DrintType = value;
    }

  }
