package cascading.legstar.cobolcopybook.beans.bean20;

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
 * <p>Java class for Kcp96V05TierLimitData complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp96V05TierLimitData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp96V05LimitTierNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp96V05XsLimitChangesInd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp96V05NoOfLimitChanges">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp96V05HistoricalTierData" type="{http://beans.cobolcopybook.legstar.cascading/bean20}Kcp96V05HistoricalTierData" maxOccurs="4" minOccurs="4"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp96V05TierLimitData", propOrder = {
  "kcp96V05LimitTierNumber",
  "kcp96V05XsLimitChangesInd",
  "kcp96V05NoOfLimitChanges",
  "kcp96V05HistoricalTierData"
})
public class Kcp96V05TierLimitData
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @CobolElement(cobolName = "KCP96V05-LIMIT-TIER-NUMBER", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 9, isSigned = true, totalDigits = 3, picture = "S999", usage = "PACKED-DECIMAL", srceLine = 16)
  protected short kcp96V05LimitTierNumber;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP96V05-XS-LIMIT-CHANGES-IND", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 9, picture = "X", srceLine = 18)
  protected String kcp96V05XsLimitChangesInd;
  @CobolElement(cobolName = "KCP96V05-NO-OF-LIMIT-CHANGES", type = CobolType.ZONED_DECIMAL_ITEM, levelNumber = 9, isSigned = false, totalDigits = 1, picture = "9", srceLine = 20)
  protected int kcp96V05NoOfLimitChanges;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP96V05-HISTORICAL-TIER-DATA", type = CobolType.GROUP_ITEM, levelNumber = 9, minOccurs = 4, maxOccurs = 4, srceLine = 22)
  protected List<Kcp96V05HistoricalTierData> kcp96V05HistoricalTierData;

  /**
   * Gets the value of the kcp96V05LimitTierNumber property.
   */
  public short getKcp96V05LimitTierNumber()
    {
    return kcp96V05LimitTierNumber;
    }

  /**
   * Sets the value of the kcp96V05LimitTierNumber property.
   */
  public void setKcp96V05LimitTierNumber( short value )
    {
    this.kcp96V05LimitTierNumber = value;
    }

  /**
   * Gets the value of the kcp96V05XsLimitChangesInd property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp96V05XsLimitChangesInd()
    {
    return kcp96V05XsLimitChangesInd;
    }

  /**
   * Sets the value of the kcp96V05XsLimitChangesInd property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp96V05XsLimitChangesInd( String value )
    {
    this.kcp96V05XsLimitChangesInd = value;
    }

  /**
   * Gets the value of the kcp96V05NoOfLimitChanges property.
   */
  public int getKcp96V05NoOfLimitChanges()
    {
    return kcp96V05NoOfLimitChanges;
    }

  /**
   * Sets the value of the kcp96V05NoOfLimitChanges property.
   */
  public void setKcp96V05NoOfLimitChanges( int value )
    {
    this.kcp96V05NoOfLimitChanges = value;
    }

  /**
   * Gets the value of the kcp96V05HistoricalTierData property.
   * <p/>
   * <p/>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the kcp96V05HistoricalTierData property.
   * <p/>
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKcp96V05HistoricalTierData().add(newItem);
   * </pre>
   * <p/>
   * <p/>
   * <p/>
   * Objects of the following type(s) are allowed in the list
   * {@link Kcp96V05HistoricalTierData }
   */
  public List<Kcp96V05HistoricalTierData> getKcp96V05HistoricalTierData()
    {
    if( kcp96V05HistoricalTierData == null )
      {
      kcp96V05HistoricalTierData = new ArrayList<Kcp96V05HistoricalTierData>();
      }
    return this.kcp96V05HistoricalTierData;
    }

  }
