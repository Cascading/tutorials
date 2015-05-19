package cascading.legstar.cobolcopybook.beans.bean21;

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
 * <p>Java class for Kcp97V05InterestRateData complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp97V05InterestRateData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp97V05TierRateData" type="{http://beans.cobolcopybook.legstar.cascading/bean21}Kcp97V05TierRateData" maxOccurs="4" minOccurs="4"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp97V05InterestRateData", propOrder = {"kcp97V05TierRateData"})
public class Kcp97V05InterestRateData implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP97V05-TIER-RATE-DATA", type = CobolType.GROUP_ITEM, levelNumber = 7, minOccurs = 4, maxOccurs = 4, srceLine = 12)
  protected List<Kcp97V05TierRateData> kcp97V05TierRateData;

  /**
   * Gets the value of the kcp97V05TierRateData property.
   * <p/>
   * <p/>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the kcp97V05TierRateData property.
   * <p/>
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKcp97V05TierRateData().add(newItem);
   * </pre>
   * <p/>
   * <p/>
   * <p/>
   * Objects of the following type(s) are allowed in the list
   * {@link Kcp97V05TierRateData }
   */
  public List<Kcp97V05TierRateData> getKcp97V05TierRateData()
    {
    if( kcp97V05TierRateData == null )
      {
      kcp97V05TierRateData = new ArrayList<Kcp97V05TierRateData>();
      }
    return this.kcp97V05TierRateData;
    }

  }
