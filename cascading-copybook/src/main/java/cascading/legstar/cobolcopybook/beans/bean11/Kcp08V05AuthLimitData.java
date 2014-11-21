package cascading.legstar.cobolcopybook.beans.bean11;

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
 * <p>Java class for Kcp08V05AuthLimitData complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp08V05AuthLimitData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp08V05OpLimitInd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp08V05NoOfLims">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp08V05LimitTable" type="{http://beans.cobolcopybook.legstar.cascading/bean11}Kcp08V05LimitTable" maxOccurs="10" minOccurs="10"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp08V05AuthLimitData", propOrder = {
  "kcp08V05OpLimitInd",
  "kcp08V05NoOfLims",
  "kcp08V05LimitTable"
})
public class Kcp08V05AuthLimitData
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @CobolElement(cobolName = "KCP08V05-OP-LIMIT-IND", type = CobolType.ZONED_DECIMAL_ITEM, levelNumber = 5, isSigned = false, totalDigits = 1, picture = "9", srceLine = 9)
  protected int kcp08V05OpLimitInd;
  @CobolElement(cobolName = "KCP08V05-NO-OF-LIMS", type = CobolType.ZONED_DECIMAL_ITEM, levelNumber = 5, isSigned = false, totalDigits = 3, isODOObject = true, picture = "999", srceLine = 11)
  protected int kcp08V05NoOfLims;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP08V05-LIMIT-TABLE", type = CobolType.GROUP_ITEM, levelNumber = 5, minOccurs = -1, maxOccurs = 10, dependingOn = "KCP08V05-NO-OF-LIMS", srceLine = 13)
  protected List<Kcp08V05LimitTable> kcp08V05LimitTable;

  /**
   * Gets the value of the kcp08V05OpLimitInd property.
   */
  public int getKcp08V05OpLimitInd()
    {
    return kcp08V05OpLimitInd;
    }

  /**
   * Sets the value of the kcp08V05OpLimitInd property.
   */
  public void setKcp08V05OpLimitInd( int value )
    {
    this.kcp08V05OpLimitInd = value;
    }

  /**
   * Gets the value of the kcp08V05NoOfLims property.
   */
  public int getKcp08V05NoOfLims()
    {
    return kcp08V05NoOfLims;
    }

  /**
   * Sets the value of the kcp08V05NoOfLims property.
   */
  public void setKcp08V05NoOfLims( int value )
    {
    this.kcp08V05NoOfLims = value;
    }

  /**
   * Gets the value of the kcp08V05LimitTable property.
   * <p/>
   * <p/>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the kcp08V05LimitTable property.
   * <p/>
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKcp08V05LimitTable().add(newItem);
   * </pre>
   * <p/>
   * <p/>
   * <p/>
   * Objects of the following type(s) are allowed in the list
   * {@link Kcp08V05LimitTable }
   */
  public List<Kcp08V05LimitTable> getKcp08V05LimitTable()
    {
    if( kcp08V05LimitTable == null )
      {
      kcp08V05LimitTable = new ArrayList<Kcp08V05LimitTable>();
      }
    return this.kcp08V05LimitTable;
    }

  }
