package cascading.legstar.cobolcopybook.beans.kcp93v05;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp93V05HistoricalTierData complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp93V05HistoricalTierData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp93V05LimitEffectiveDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp93V05TierUpperLimit">
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
@XmlType(name = "Kcp93V05HistoricalTierData", propOrder = {
  "kcp93V05LimitEffectiveDate",
  "kcp93V05TierUpperLimit"
})
public class Kcp93V05HistoricalTierData
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP93V05-LIMIT-EFFECTIVE-DATE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 11, picture = "XX", srceLine = 24)
  protected String kcp93V05LimitEffectiveDate;
  @CobolElement(cobolName = "KCP93V05-TIER-UPPER-LIMIT", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 11, isSigned = true, totalDigits = 9, picture = "S9(9)", usage = "PACKED-DECIMAL", srceLine = 26)
  protected int kcp93V05TierUpperLimit;

  /**
   * Gets the value of the kcp93V05LimitEffectiveDate property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp93V05LimitEffectiveDate()
    {
    return kcp93V05LimitEffectiveDate;
    }

  /**
   * Sets the value of the kcp93V05LimitEffectiveDate property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp93V05LimitEffectiveDate( String value )
    {
    this.kcp93V05LimitEffectiveDate = value;
    }

  /**
   * Gets the value of the kcp93V05TierUpperLimit property.
   */
  public int getKcp93V05TierUpperLimit()
    {
    return kcp93V05TierUpperLimit;
    }

  /**
   * Sets the value of the kcp93V05TierUpperLimit property.
   */
  public void setKcp93V05TierUpperLimit( int value )
    {
    this.kcp93V05TierUpperLimit = value;
    }

  }
