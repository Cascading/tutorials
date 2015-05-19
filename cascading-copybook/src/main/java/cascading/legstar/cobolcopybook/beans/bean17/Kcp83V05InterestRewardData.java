package cascading.legstar.cobolcopybook.beans.bean17;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp83V05InterestRewardData complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp83V05InterestRewardData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp83V05InterestRewardTiers" type="{http://beans.cobolcopybook.legstar.cascading/bean17}Kcp83V05InterestRewardTiers"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp83V05InterestRewardData", propOrder = {"kcp83V05InterestRewardTiers"})
public class Kcp83V05InterestRewardData implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP83V05-INTEREST-REWARD-TIERS", type = CobolType.GROUP_ITEM, levelNumber = 3, srceLine = 8)
  protected Kcp83V05InterestRewardTiers kcp83V05InterestRewardTiers;

  /**
   * Gets the value of the kcp83V05InterestRewardTiers property.
   *
   * @return possible object is
   * {@link Kcp83V05InterestRewardTiers }
   */
  public Kcp83V05InterestRewardTiers getKcp83V05InterestRewardTiers()
    {
    return kcp83V05InterestRewardTiers;
    }

  /**
   * Sets the value of the kcp83V05InterestRewardTiers property.
   *
   * @param value allowed object is
   *              {@link Kcp83V05InterestRewardTiers }
   */
  public void setKcp83V05InterestRewardTiers( Kcp83V05InterestRewardTiers value )
    {
    this.kcp83V05InterestRewardTiers = value;
    }

  }
