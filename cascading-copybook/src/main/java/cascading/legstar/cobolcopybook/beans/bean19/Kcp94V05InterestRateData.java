package cascading.legstar.cobolcopybook.beans.bean19;

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
 * <p>Java class for Kcp94V05InterestRateData complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp94V05InterestRateData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp94V05TierRateData" type="{http://beans.cobolcopybook.legstar.cascading/bean19}Kcp94V05TierRateData" maxOccurs="6" minOccurs="6"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp94V05InterestRateData", propOrder = {
  "kcp94V05TierRateData"
})
public class Kcp94V05InterestRateData
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP94V05-TIER-RATE-DATA", type = CobolType.GROUP_ITEM, levelNumber = 7, minOccurs = 6, maxOccurs = 6, srceLine = 12)
  protected List<Kcp94V05TierRateData> kcp94V05TierRateData;

  /**
   * Gets the value of the kcp94V05TierRateData property.
   * <p/>
   * <p/>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the kcp94V05TierRateData property.
   * <p/>
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKcp94V05TierRateData().add(newItem);
   * </pre>
   * <p/>
   * <p/>
   * <p/>
   * Objects of the following type(s) are allowed in the list
   * {@link Kcp94V05TierRateData }
   */
  public List<Kcp94V05TierRateData> getKcp94V05TierRateData()
    {
    if( kcp94V05TierRateData == null )
      {
      kcp94V05TierRateData = new ArrayList<Kcp94V05TierRateData>();
      }
    return this.kcp94V05TierRateData;
    }

  }
