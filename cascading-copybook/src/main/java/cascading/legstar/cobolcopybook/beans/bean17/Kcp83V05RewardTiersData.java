package cascading.legstar.cobolcopybook.beans.bean17;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp83V05RewardTiersData complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp83V05RewardTiersData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp83V05RewardTierData" type="{http://beans.cobolcopybook.legstar.cascading/bean17}Kcp83V05RewardTierData" maxOccurs="6" minOccurs="6"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp83V05RewardTiersData", propOrder = {
  "kcp83V05RewardTierData"
})
public class Kcp83V05RewardTiersData
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP83V05-REWARD-TIER-DATA", type = CobolType.GROUP_ITEM, levelNumber = 7, minOccurs = 6, maxOccurs = 6, srceLine = 12)
  protected List<Kcp83V05RewardTierData> kcp83V05RewardTierData;

  /**
   * Gets the value of the kcp83V05RewardTierData property.
   * <p/>
   * <p/>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the kcp83V05RewardTierData property.
   * <p/>
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKcp83V05RewardTierData().add(newItem);
   * </pre>
   * <p/>
   * <p/>
   * <p/>
   * Objects of the following type(s) are allowed in the list
   * {@link Kcp83V05RewardTierData }
   */
  public List<Kcp83V05RewardTierData> getKcp83V05RewardTierData()
    {
    if( kcp83V05RewardTierData == null )
      {
      kcp83V05RewardTierData = new ArrayList<Kcp83V05RewardTierData>();
      }
    return this.kcp83V05RewardTierData;
    }

  }
