package cascading.legstar.cobolcopybook.beans.kcp83v05;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp83V05InterestRewardTiers complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp83V05InterestRewardTiers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp83V05NoOfTiers">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp83V05RewardTiersData" type="{http://beans.cobolcopybook.legstar.cascading/kcp83v05}Kcp83V05RewardTiersData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp83V05InterestRewardTiers", propOrder = {
  "kcp83V05NoOfTiers",
  "kcp83V05RewardTiersData"
})
public class Kcp83V05InterestRewardTiers
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @CobolElement(cobolName = "KCP83V05-NO-OF-TIERS", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 3, picture = "S999", usage = "PACKED-DECIMAL", srceLine = 9)
  protected short kcp83V05NoOfTiers;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP83V05-REWARD-TIERS-DATA", type = CobolType.GROUP_ITEM, levelNumber = 5, srceLine = 11)
  protected Kcp83V05RewardTiersData kcp83V05RewardTiersData;

  /**
   * Gets the value of the kcp83V05NoOfTiers property.
   */
  public short getKcp83V05NoOfTiers()
    {
    return kcp83V05NoOfTiers;
    }

  /**
   * Sets the value of the kcp83V05NoOfTiers property.
   */
  public void setKcp83V05NoOfTiers( short value )
    {
    this.kcp83V05NoOfTiers = value;
    }

  /**
   * Gets the value of the kcp83V05RewardTiersData property.
   *
   * @return possible object is
   * {@link Kcp83V05RewardTiersData }
   */
  public Kcp83V05RewardTiersData getKcp83V05RewardTiersData()
    {
    return kcp83V05RewardTiersData;
    }

  /**
   * Sets the value of the kcp83V05RewardTiersData property.
   *
   * @param value allowed object is
   *              {@link Kcp83V05RewardTiersData }
   */
  public void setKcp83V05RewardTiersData( Kcp83V05RewardTiersData value )
    {
    this.kcp83V05RewardTiersData = value;
    }

  }
