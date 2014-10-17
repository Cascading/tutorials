package cascading.legstar.cobolcopybook.beans.kcp96v05;

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
 * <p>Java class for Kcp96V05InterestLimitData complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp96V05InterestLimitData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp96V05TierLimitData" type="{http://beans.cobolcopybook.legstar.cascading/kcp96v05}Kcp96V05TierLimitData" maxOccurs="3" minOccurs="3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp96V05InterestLimitData", propOrder = {
  "kcp96V05TierLimitData"
})
public class Kcp96V05InterestLimitData
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP96V05-TIER-LIMIT-DATA", type = CobolType.GROUP_ITEM, levelNumber = 7, minOccurs = 3, maxOccurs = 3, srceLine = 14)
  protected List<Kcp96V05TierLimitData> kcp96V05TierLimitData;

  /**
   * Gets the value of the kcp96V05TierLimitData property.
   * <p/>
   * <p/>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the kcp96V05TierLimitData property.
   * <p/>
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKcp96V05TierLimitData().add(newItem);
   * </pre>
   * <p/>
   * <p/>
   * <p/>
   * Objects of the following type(s) are allowed in the list
   * {@link Kcp96V05TierLimitData }
   */
  public List<Kcp96V05TierLimitData> getKcp96V05TierLimitData()
    {
    if( kcp96V05TierLimitData == null )
      {
      kcp96V05TierLimitData = new ArrayList<Kcp96V05TierLimitData>();
      }
    return this.kcp96V05TierLimitData;
    }

  }
