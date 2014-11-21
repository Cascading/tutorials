package cascading.legstar.cobolcopybook.beans.bean21;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp97V05DrintRateData complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp97V05DrintRateData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp97V05NoOfTiers">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp97V05InterestRateData" type="{http://beans.cobolcopybook.legstar.cascading/bean21}Kcp97V05InterestRateData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp97V05DrintRateData", propOrder = {
  "kcp97V05NoOfTiers",
  "kcp97V05InterestRateData"
})
public class Kcp97V05DrintRateData
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @CobolElement(cobolName = "KCP97V05-NO-OF-TIERS", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 3, picture = "S999", usage = "PACKED-DECIMAL", srceLine = 9)
  protected short kcp97V05NoOfTiers;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP97V05-INTEREST-RATE-DATA", type = CobolType.GROUP_ITEM, levelNumber = 5, srceLine = 11)
  protected Kcp97V05InterestRateData kcp97V05InterestRateData;

  /**
   * Gets the value of the kcp97V05NoOfTiers property.
   */
  public short getKcp97V05NoOfTiers()
    {
    return kcp97V05NoOfTiers;
    }

  /**
   * Sets the value of the kcp97V05NoOfTiers property.
   */
  public void setKcp97V05NoOfTiers( short value )
    {
    this.kcp97V05NoOfTiers = value;
    }

  /**
   * Gets the value of the kcp97V05InterestRateData property.
   *
   * @return possible object is
   * {@link Kcp97V05InterestRateData }
   */
  public Kcp97V05InterestRateData getKcp97V05InterestRateData()
    {
    return kcp97V05InterestRateData;
    }

  /**
   * Sets the value of the kcp97V05InterestRateData property.
   *
   * @param value allowed object is
   *              {@link Kcp97V05InterestRateData }
   */
  public void setKcp97V05InterestRateData( Kcp97V05InterestRateData value )
    {
    this.kcp97V05InterestRateData = value;
    }

  }
