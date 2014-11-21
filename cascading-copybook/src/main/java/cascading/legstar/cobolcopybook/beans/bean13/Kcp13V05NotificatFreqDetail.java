package cascading.legstar.cobolcopybook.beans.bean13;

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
 * <p>Java class for Kcp13V05NotificatFreqDetail complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp13V05NotificatFreqDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp13V05NotificatFreqCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp13V05NotificatDayOfMnth">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp13V05NotificatDayOfWeek" maxOccurs="5" minOccurs="5">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp13V05NotificatDueDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp13V05NotificatRecurChg">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp13V05ReasonCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp13V05NotificatCommAction">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp13V05NotificatCrintActn">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp13V05NotificatDrintActn">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="1"/>
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
@XmlType(name = "Kcp13V05NotificatFreqDetail", propOrder = {
  "kcp13V05NotificatFreqCode",
  "kcp13V05NotificatDayOfMnth",
  "kcp13V05NotificatDayOfWeek",
  "kcp13V05NotificatDueDate",
  "kcp13V05NotificatRecurChg",
  "kcp13V05ReasonCode",
  "kcp13V05NotificatCommAction",
  "kcp13V05NotificatCrintActn",
  "kcp13V05NotificatDrintActn"
})
public class Kcp13V05NotificatFreqDetail
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP13V05-NOTIFICAT-FREQ-CODE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 9, picture = "X", srceLine = 50)
  protected String kcp13V05NotificatFreqCode;
  @CobolElement(cobolName = "KCP13V05-NOTIFICAT-DAY-OF-MNTH", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 9, isSigned = true, totalDigits = 3, picture = "S999", usage = "PACKED-DECIMAL", srceLine = 52)
  protected short kcp13V05NotificatDayOfMnth;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP13V05-NOTIFICAT-DAY-OF-WEEK", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 9, minOccurs = 5, maxOccurs = 5, picture = "X", srceLine = 54)
  protected List<String> kcp13V05NotificatDayOfWeek;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP13V05-NOTIFICAT-DUE-DATE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 9, picture = "XX", srceLine = 57)
  protected String kcp13V05NotificatDueDate;
  @CobolElement(cobolName = "KCP13V05-NOTIFICAT-RECUR-CHG", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 9, isSigned = true, totalDigits = 1, picture = "S9", usage = "PACKED-DECIMAL", srceLine = 59)
  protected short kcp13V05NotificatRecurChg;
  @CobolElement(cobolName = "KCP13V05-REASON-CODE", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 9, isSigned = true, totalDigits = 1, picture = "S9", usage = "PACKED-DECIMAL", srceLine = 61)
  protected short kcp13V05ReasonCode;
  @CobolElement(cobolName = "KCP13V05-NOTIFICAT-COMM-ACTION", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 9, isSigned = true, totalDigits = 1, picture = "S9", usage = "PACKED-DECIMAL", srceLine = 63)
  protected short kcp13V05NotificatCommAction;
  @CobolElement(cobolName = "KCP13V05-NOTIFICAT-CRINT-ACTN", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 9, isSigned = true, totalDigits = 1, picture = "S9", usage = "PACKED-DECIMAL", srceLine = 65)
  protected short kcp13V05NotificatCrintActn;
  @CobolElement(cobolName = "KCP13V05-NOTIFICAT-DRINT-ACTN", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 9, isSigned = true, totalDigits = 1, picture = "S9", usage = "PACKED-DECIMAL", srceLine = 67)
  protected short kcp13V05NotificatDrintActn;

  /**
   * Gets the value of the kcp13V05NotificatFreqCode property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp13V05NotificatFreqCode()
    {
    return kcp13V05NotificatFreqCode;
    }

  /**
   * Sets the value of the kcp13V05NotificatFreqCode property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp13V05NotificatFreqCode( String value )
    {
    this.kcp13V05NotificatFreqCode = value;
    }

  /**
   * Gets the value of the kcp13V05NotificatDayOfMnth property.
   */
  public short getKcp13V05NotificatDayOfMnth()
    {
    return kcp13V05NotificatDayOfMnth;
    }

  /**
   * Sets the value of the kcp13V05NotificatDayOfMnth property.
   */
  public void setKcp13V05NotificatDayOfMnth( short value )
    {
    this.kcp13V05NotificatDayOfMnth = value;
    }

  /**
   * Gets the value of the kcp13V05NotificatDayOfWeek property.
   * <p/>
   * <p/>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the kcp13V05NotificatDayOfWeek property.
   * <p/>
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKcp13V05NotificatDayOfWeek().add(newItem);
   * </pre>
   * <p/>
   * <p/>
   * <p/>
   * Objects of the following type(s) are allowed in the list
   * {@link String }
   */
  public List<String> getKcp13V05NotificatDayOfWeek()
    {
    if( kcp13V05NotificatDayOfWeek == null )
      {
      kcp13V05NotificatDayOfWeek = new ArrayList<String>();
      }
    return this.kcp13V05NotificatDayOfWeek;
    }

  /**
   * Gets the value of the kcp13V05NotificatDueDate property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp13V05NotificatDueDate()
    {
    return kcp13V05NotificatDueDate;
    }

  /**
   * Sets the value of the kcp13V05NotificatDueDate property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp13V05NotificatDueDate( String value )
    {
    this.kcp13V05NotificatDueDate = value;
    }

  /**
   * Gets the value of the kcp13V05NotificatRecurChg property.
   */
  public short getKcp13V05NotificatRecurChg()
    {
    return kcp13V05NotificatRecurChg;
    }

  /**
   * Sets the value of the kcp13V05NotificatRecurChg property.
   */
  public void setKcp13V05NotificatRecurChg( short value )
    {
    this.kcp13V05NotificatRecurChg = value;
    }

  /**
   * Gets the value of the kcp13V05ReasonCode property.
   */
  public short getKcp13V05ReasonCode()
    {
    return kcp13V05ReasonCode;
    }

  /**
   * Sets the value of the kcp13V05ReasonCode property.
   */
  public void setKcp13V05ReasonCode( short value )
    {
    this.kcp13V05ReasonCode = value;
    }

  /**
   * Gets the value of the kcp13V05NotificatCommAction property.
   */
  public short getKcp13V05NotificatCommAction()
    {
    return kcp13V05NotificatCommAction;
    }

  /**
   * Sets the value of the kcp13V05NotificatCommAction property.
   */
  public void setKcp13V05NotificatCommAction( short value )
    {
    this.kcp13V05NotificatCommAction = value;
    }

  /**
   * Gets the value of the kcp13V05NotificatCrintActn property.
   */
  public short getKcp13V05NotificatCrintActn()
    {
    return kcp13V05NotificatCrintActn;
    }

  /**
   * Sets the value of the kcp13V05NotificatCrintActn property.
   */
  public void setKcp13V05NotificatCrintActn( short value )
    {
    this.kcp13V05NotificatCrintActn = value;
    }

  /**
   * Gets the value of the kcp13V05NotificatDrintActn property.
   */
  public short getKcp13V05NotificatDrintActn()
    {
    return kcp13V05NotificatDrintActn;
    }

  /**
   * Sets the value of the kcp13V05NotificatDrintActn property.
   */
  public void setKcp13V05NotificatDrintActn( short value )
    {
    this.kcp13V05NotificatDrintActn = value;
    }

  }
