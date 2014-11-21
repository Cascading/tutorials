package cascading.legstar.cobolcopybook.beans.bean12;

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
 * <p>Java class for Kcp09V05OtherLimitsData complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp09V05OtherLimitsData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp09V05NoOfLims">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp09V05LimitTable" type="{http://beans.cobolcopybook.legstar.cascading/bean12}Kcp09V05LimitTable" maxOccurs="10" minOccurs="10"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp09V05OtherLimitsData", propOrder = {
  "kcp09V05NoOfLims",
  "kcp09V05LimitTable"
})
public class Kcp09V05OtherLimitsData
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @CobolElement(cobolName = "KCP09V05-NO-OF-LIMS", type = CobolType.ZONED_DECIMAL_ITEM, levelNumber = 5, isSigned = false, totalDigits = 3, isODOObject = true, picture = "999", srceLine = 9)
  protected int kcp09V05NoOfLims;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP09V05-LIMIT-TABLE", type = CobolType.GROUP_ITEM, levelNumber = 5, minOccurs = -1, maxOccurs = 10, dependingOn = "KCP09V05-NO-OF-LIMS", srceLine = 11)
  protected List<Kcp09V05LimitTable> kcp09V05LimitTable;

  /**
   * Gets the value of the kcp09V05NoOfLims property.
   */
  public int getKcp09V05NoOfLims()
    {
    return kcp09V05NoOfLims;
    }

  /**
   * Sets the value of the kcp09V05NoOfLims property.
   */
  public void setKcp09V05NoOfLims( int value )
    {
    this.kcp09V05NoOfLims = value;
    }

  /**
   * Gets the value of the kcp09V05LimitTable property.
   * <p/>
   * <p/>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the kcp09V05LimitTable property.
   * <p/>
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKcp09V05LimitTable().add(newItem);
   * </pre>
   * <p/>
   * <p/>
   * <p/>
   * Objects of the following type(s) are allowed in the list
   * {@link Kcp09V05LimitTable }
   */
  public List<Kcp09V05LimitTable> getKcp09V05LimitTable()
    {
    if( kcp09V05LimitTable == null )
      {
      kcp09V05LimitTable = new ArrayList<Kcp09V05LimitTable>();
      }
    return this.kcp09V05LimitTable;
    }

  }
