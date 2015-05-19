package cascading.legstar.cobolcopybook.beans.bean18;

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
 * <p>Java class for Kcp93V05InterestLimitData complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp93V05InterestLimitData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp93V05TierLimitData" type="{http://beans.cobolcopybook.legstar.cascading/bean18}Kcp93V05TierLimitData" maxOccurs="5" minOccurs="5"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp93V05InterestLimitData", propOrder = {"kcp93V05TierLimitData"})
public class Kcp93V05InterestLimitData implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP93V05-TIER-LIMIT-DATA", type = CobolType.GROUP_ITEM, levelNumber = 7, minOccurs = 5, maxOccurs = 5, srceLine = 14)
  protected List<Kcp93V05TierLimitData> kcp93V05TierLimitData;

  /**
   * Gets the value of the kcp93V05TierLimitData property.
   * <p/>
   * <p/>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the kcp93V05TierLimitData property.
   * <p/>
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKcp93V05TierLimitData().add(newItem);
   * </pre>
   * <p/>
   * <p/>
   * <p/>
   * Objects of the following type(s) are allowed in the list
   * {@link Kcp93V05TierLimitData }
   */
  public List<Kcp93V05TierLimitData> getKcp93V05TierLimitData()
    {
    if( kcp93V05TierLimitData == null )
      {
      kcp93V05TierLimitData = new ArrayList<Kcp93V05TierLimitData>();
      }
    return this.kcp93V05TierLimitData;
    }

  }
