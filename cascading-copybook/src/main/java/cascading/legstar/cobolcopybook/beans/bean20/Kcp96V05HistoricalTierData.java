package cascading.legstar.cobolcopybook.beans.bean20;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp96V05HistoricalTierData complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp96V05HistoricalTierData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp96V05LimitEffectiveDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp96V05TierUpperLimit">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="9"/>
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
@XmlType(name = "Kcp96V05HistoricalTierData", propOrder = {
  "kcp96V05LimitEffectiveDate",
  "kcp96V05TierUpperLimit"
})
public class Kcp96V05HistoricalTierData
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP96V05-LIMIT-EFFECTIVE-DATE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 11, picture = "XX", srceLine = 24)
  protected String kcp96V05LimitEffectiveDate;
  @CobolElement(cobolName = "KCP96V05-TIER-UPPER-LIMIT", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 11, isSigned = true, totalDigits = 9, picture = "S9(9)", usage = "PACKED-DECIMAL", srceLine = 26)
  protected int kcp96V05TierUpperLimit;

  /**
   * Gets the value of the kcp96V05LimitEffectiveDate property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp96V05LimitEffectiveDate()
    {
    return kcp96V05LimitEffectiveDate;
    }

  /**
   * Sets the value of the kcp96V05LimitEffectiveDate property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp96V05LimitEffectiveDate( String value )
    {
    this.kcp96V05LimitEffectiveDate = value;
    }

  /**
   * Gets the value of the kcp96V05TierUpperLimit property.
   */
  public int getKcp96V05TierUpperLimit()
    {
    return kcp96V05TierUpperLimit;
    }

  /**
   * Sets the value of the kcp96V05TierUpperLimit property.
   */
  public void setKcp96V05TierUpperLimit( int value )
    {
    this.kcp96V05TierUpperLimit = value;
    }

  }
