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
 * <p>Java class for Kcp94V05TierRateData complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp94V05TierRateData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp94V05RateTierNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp94V05XsRateChangeInd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp94V05NoOfChanges">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp94V05HistoricalRateData" type="{http://beans.cobolcopybook.legstar.cascading/bean19}Kcp94V05HistoricalRateData" maxOccurs="4" minOccurs="4"/>
 *         &lt;element name="kcp94V05DefaultRateT006Key">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp94V05TierRateData", propOrder = {
  "kcp94V05RateTierNumber",
  "kcp94V05XsRateChangeInd",
  "kcp94V05NoOfChanges",
  "kcp94V05HistoricalRateData",
  "kcp94V05DefaultRateT006Key"
})
public class Kcp94V05TierRateData
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @CobolElement(cobolName = "KCP94V05-RATE-TIER-NUMBER", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 9, isSigned = true, totalDigits = 3, picture = "S999", usage = "PACKED-DECIMAL", srceLine = 14)
  protected short kcp94V05RateTierNumber;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP94V05-XS-RATE-CHANGE-IND", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 9, picture = "X", srceLine = 16)
  protected String kcp94V05XsRateChangeInd;
  @CobolElement(cobolName = "KCP94V05-NO-OF-CHANGES", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 9, isSigned = true, totalDigits = 3, picture = "S999", usage = "PACKED-DECIMAL", srceLine = 18)
  protected short kcp94V05NoOfChanges;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP94V05-HISTORICAL-RATE-DATA", type = CobolType.GROUP_ITEM, levelNumber = 9, minOccurs = 4, maxOccurs = 4, srceLine = 20)
  protected List<Kcp94V05HistoricalRateData> kcp94V05HistoricalRateData;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP94V05-DEFAULT-RATE-T006-KEY", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 9, picture = "XXXX", srceLine = 42)
  protected String kcp94V05DefaultRateT006Key;

  /**
   * Gets the value of the kcp94V05RateTierNumber property.
   */
  public short getKcp94V05RateTierNumber()
    {
    return kcp94V05RateTierNumber;
    }

  /**
   * Sets the value of the kcp94V05RateTierNumber property.
   */
  public void setKcp94V05RateTierNumber( short value )
    {
    this.kcp94V05RateTierNumber = value;
    }

  /**
   * Gets the value of the kcp94V05XsRateChangeInd property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp94V05XsRateChangeInd()
    {
    return kcp94V05XsRateChangeInd;
    }

  /**
   * Sets the value of the kcp94V05XsRateChangeInd property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp94V05XsRateChangeInd( String value )
    {
    this.kcp94V05XsRateChangeInd = value;
    }

  /**
   * Gets the value of the kcp94V05NoOfChanges property.
   */
  public short getKcp94V05NoOfChanges()
    {
    return kcp94V05NoOfChanges;
    }

  /**
   * Sets the value of the kcp94V05NoOfChanges property.
   */
  public void setKcp94V05NoOfChanges( short value )
    {
    this.kcp94V05NoOfChanges = value;
    }

  /**
   * Gets the value of the kcp94V05HistoricalRateData property.
   * <p/>
   * <p/>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the kcp94V05HistoricalRateData property.
   * <p/>
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKcp94V05HistoricalRateData().add(newItem);
   * </pre>
   * <p/>
   * <p/>
   * <p/>
   * Objects of the following type(s) are allowed in the list
   * {@link Kcp94V05HistoricalRateData }
   */
  public List<Kcp94V05HistoricalRateData> getKcp94V05HistoricalRateData()
    {
    if( kcp94V05HistoricalRateData == null )
      {
      kcp94V05HistoricalRateData = new ArrayList<Kcp94V05HistoricalRateData>();
      }
    return this.kcp94V05HistoricalRateData;
    }

  /**
   * Gets the value of the kcp94V05DefaultRateT006Key property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp94V05DefaultRateT006Key()
    {
    return kcp94V05DefaultRateT006Key;
    }

  /**
   * Sets the value of the kcp94V05DefaultRateT006Key property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp94V05DefaultRateT006Key( String value )
    {
    this.kcp94V05DefaultRateT006Key = value;
    }

  }
