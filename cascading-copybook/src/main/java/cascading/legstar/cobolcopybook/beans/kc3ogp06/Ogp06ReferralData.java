package cascading.legstar.cobolcopybook.beans.kc3ogp06;

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
 * <p>Java class for Ogp06ReferralData complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Ogp06ReferralData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ogp06FhReferStreamNo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ogp06ReferDueDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ogp06Refind">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ogp06ReferReason">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ogp06ReferReasonDesc">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ogp06ReferMonthDay">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ogp06ReferFreq">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ogp06ReferDayOfWeek" type="{http://beans.cobolcopybook.legstar.cascading/kc3ogp06}Ogp06ReferDayOfWeek" maxOccurs="5" minOccurs="5"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ogp06ReferralData", propOrder = {
  "ogp06FhReferStreamNo",
  "ogp06ReferDueDate",
  "ogp06Refind",
  "ogp06ReferReason",
  "ogp06ReferReasonDesc",
  "ogp06ReferMonthDay",
  "ogp06ReferFreq",
  "ogp06ReferDayOfWeek"
})
public class Ogp06ReferralData
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @CobolElement(cobolName = "OGP06-FH-REFER-STREAM-NO", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 3, picture = "S999", usage = "PACKED-DECIMAL", srceLine = 7)
  protected short ogp06FhReferStreamNo;
  @XmlElement(required = true)
  @CobolElement(cobolName = "OGP06-REFER-DUE-DATE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "XX", srceLine = 9)
  protected String ogp06ReferDueDate;
  @CobolElement(cobolName = "OGP06-REFIND", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 1, picture = "S9", usage = "PACKED-DECIMAL", srceLine = 11)
  protected short ogp06Refind;
  @CobolElement(cobolName = "OGP06-REFER-REASON", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 3, picture = "S999", usage = "PACKED-DECIMAL", srceLine = 12)
  protected short ogp06ReferReason;
  @XmlElement(required = true)
  @CobolElement(cobolName = "OGP06-REFER-REASON-DESC", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(30)", srceLine = 14)
  protected String ogp06ReferReasonDesc;
  @CobolElement(cobolName = "OGP06-REFER-MONTH-DAY", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 3, picture = "S999", usage = "PACKED-DECIMAL", srceLine = 16)
  protected short ogp06ReferMonthDay;
  @XmlElement(required = true)
  @CobolElement(cobolName = "OGP06-REFER-FREQ", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X", srceLine = 18)
  protected String ogp06ReferFreq;
  @XmlElement(required = true)
  @CobolElement(cobolName = "OGP06-REFER-DAY-OF-WEEK", type = CobolType.GROUP_ITEM, levelNumber = 5, minOccurs = 5, maxOccurs = 5, srceLine = 19)
  protected List<Ogp06ReferDayOfWeek> ogp06ReferDayOfWeek;

  /**
   * Gets the value of the ogp06FhReferStreamNo property.
   */
  public short getOgp06FhReferStreamNo()
    {
    return ogp06FhReferStreamNo;
    }

  /**
   * Sets the value of the ogp06FhReferStreamNo property.
   */
  public void setOgp06FhReferStreamNo( short value )
    {
    this.ogp06FhReferStreamNo = value;
    }

  /**
   * Gets the value of the ogp06ReferDueDate property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getOgp06ReferDueDate()
    {
    return ogp06ReferDueDate;
    }

  /**
   * Sets the value of the ogp06ReferDueDate property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setOgp06ReferDueDate( String value )
    {
    this.ogp06ReferDueDate = value;
    }

  /**
   * Gets the value of the ogp06Refind property.
   */
  public short getOgp06Refind()
    {
    return ogp06Refind;
    }

  /**
   * Sets the value of the ogp06Refind property.
   */
  public void setOgp06Refind( short value )
    {
    this.ogp06Refind = value;
    }

  /**
   * Gets the value of the ogp06ReferReason property.
   */
  public short getOgp06ReferReason()
    {
    return ogp06ReferReason;
    }

  /**
   * Sets the value of the ogp06ReferReason property.
   */
  public void setOgp06ReferReason( short value )
    {
    this.ogp06ReferReason = value;
    }

  /**
   * Gets the value of the ogp06ReferReasonDesc property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getOgp06ReferReasonDesc()
    {
    return ogp06ReferReasonDesc;
    }

  /**
   * Sets the value of the ogp06ReferReasonDesc property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setOgp06ReferReasonDesc( String value )
    {
    this.ogp06ReferReasonDesc = value;
    }

  /**
   * Gets the value of the ogp06ReferMonthDay property.
   */
  public short getOgp06ReferMonthDay()
    {
    return ogp06ReferMonthDay;
    }

  /**
   * Sets the value of the ogp06ReferMonthDay property.
   */
  public void setOgp06ReferMonthDay( short value )
    {
    this.ogp06ReferMonthDay = value;
    }

  /**
   * Gets the value of the ogp06ReferFreq property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getOgp06ReferFreq()
    {
    return ogp06ReferFreq;
    }

  /**
   * Sets the value of the ogp06ReferFreq property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setOgp06ReferFreq( String value )
    {
    this.ogp06ReferFreq = value;
    }

  /**
   * Gets the value of the ogp06ReferDayOfWeek property.
   * <p/>
   * <p/>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the ogp06ReferDayOfWeek property.
   * <p/>
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getOgp06ReferDayOfWeek().add(newItem);
   * </pre>
   * <p/>
   * <p/>
   * <p/>
   * Objects of the following type(s) are allowed in the list
   * {@link Ogp06ReferDayOfWeek }
   */
  public List<Ogp06ReferDayOfWeek> getOgp06ReferDayOfWeek()
    {
    if( ogp06ReferDayOfWeek == null )
      {
      ogp06ReferDayOfWeek = new ArrayList<Ogp06ReferDayOfWeek>();
      }
    return this.ogp06ReferDayOfWeek;
    }

  }
