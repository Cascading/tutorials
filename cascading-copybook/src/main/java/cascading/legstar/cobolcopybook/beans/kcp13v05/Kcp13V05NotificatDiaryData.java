package cascading.legstar.cobolcopybook.beans.kcp13v05;

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
 * <p>Java class for Kcp13V05NotificatDiaryData complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp13V05NotificatDiaryData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp13V05NotificatTypeCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp13V05NotificatSubTypeCd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp13V05NotificatSuppressCd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp13V05NotificatMmsgSupCd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp13V05NotificatPmsgSupCd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp13V05StmtDest">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp13V05StmtDupDest">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp13V05StmtCind">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp13V05Dissenter">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp13V05StmtDup">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp13V05StmtDestClass">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp13V05StmtLayout">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp13V05NoOfPrenotDates">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp13V05PrenotPrintDates" type="{http://beans.cobolcopybook.legstar.cascading/kcp13v05}Kcp13V05PrenotPrintDates" maxOccurs="3" minOccurs="3"/>
 *         &lt;element name="kcp13V05NoOfFrequencies">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp13V05NotificatFreqDetail" type="{http://beans.cobolcopybook.legstar.cascading/kcp13v05}Kcp13V05NotificatFreqDetail" maxOccurs="9" minOccurs="9"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp13V05NotificatDiaryData", propOrder = {
  "kcp13V05NotificatTypeCode",
  "kcp13V05NotificatSubTypeCd",
  "kcp13V05NotificatSuppressCd",
  "kcp13V05NotificatMmsgSupCd",
  "kcp13V05NotificatPmsgSupCd",
  "kcp13V05StmtDest",
  "kcp13V05StmtDupDest",
  "kcp13V05StmtCind",
  "kcp13V05Dissenter",
  "kcp13V05StmtDup",
  "kcp13V05StmtDestClass",
  "kcp13V05StmtLayout",
  "kcp13V05NoOfPrenotDates",
  "kcp13V05PrenotPrintDates",
  "kcp13V05NoOfFrequencies",
  "kcp13V05NotificatFreqDetail"
})
public class Kcp13V05NotificatDiaryData
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP13V05-NOTIFICAT-TYPE-CODE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "X", srceLine = 14)
  protected String kcp13V05NotificatTypeCode;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP13V05-NOTIFICAT-SUB-TYPE-CD", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "X", srceLine = 16)
  protected String kcp13V05NotificatSubTypeCd;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP13V05-NOTIFICAT-SUPPRESS-CD", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "X", srceLine = 18)
  protected String kcp13V05NotificatSuppressCd;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP13V05-NOTIFICAT-MMSG-SUP-CD", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "X", srceLine = 20)
  protected String kcp13V05NotificatMmsgSupCd;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP13V05-NOTIFICAT-PMSG-SUP-CD", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "X", srceLine = 22)
  protected String kcp13V05NotificatPmsgSupCd;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP13V05-STMT-DEST", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "X", srceLine = 24)
  protected String kcp13V05StmtDest;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP13V05-STMT-DUP-DEST", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "X", srceLine = 26)
  protected String kcp13V05StmtDupDest;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP13V05-STMT-CIND", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "X", srceLine = 28)
  protected String kcp13V05StmtCind;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP13V05-DISSENTER", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "X", srceLine = 30)
  protected String kcp13V05Dissenter;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP13V05-STMT-DUP", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "X", srceLine = 32)
  protected String kcp13V05StmtDup;
  @CobolElement(cobolName = "KCP13V05-STMT-DEST-CLASS", type = CobolType.ZONED_DECIMAL_ITEM, levelNumber = 7, isSigned = false, totalDigits = 1, picture = "9", srceLine = 34)
  protected int kcp13V05StmtDestClass;
  @CobolElement(cobolName = "KCP13V05-STMT-LAYOUT", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 7, isSigned = true, totalDigits = 3, picture = "S999", usage = "PACKED-DECIMAL", srceLine = 36)
  protected short kcp13V05StmtLayout;
  @CobolElement(cobolName = "KCP13V05-NO-OF-PRENOT-DATES", type = CobolType.ZONED_DECIMAL_ITEM, levelNumber = 7, isSigned = false, totalDigits = 1, picture = "9", srceLine = 38)
  protected int kcp13V05NoOfPrenotDates;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP13V05-PRENOT-PRINT-DATES", type = CobolType.GROUP_ITEM, levelNumber = 7, minOccurs = 3, maxOccurs = 3, srceLine = 40)
  protected List<Kcp13V05PrenotPrintDates> kcp13V05PrenotPrintDates;
  @CobolElement(cobolName = "KCP13V05-NO-OF-FREQUENCIES", type = CobolType.ZONED_DECIMAL_ITEM, levelNumber = 7, isSigned = false, totalDigits = 1, picture = "9", srceLine = 46)
  protected int kcp13V05NoOfFrequencies;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP13V05-NOTIFICAT-FREQ-DETAIL", type = CobolType.GROUP_ITEM, levelNumber = 7, minOccurs = 9, maxOccurs = 9, srceLine = 48)
  protected List<Kcp13V05NotificatFreqDetail> kcp13V05NotificatFreqDetail;

  /**
   * Gets the value of the kcp13V05NotificatTypeCode property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp13V05NotificatTypeCode()
    {
    return kcp13V05NotificatTypeCode;
    }

  /**
   * Sets the value of the kcp13V05NotificatTypeCode property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp13V05NotificatTypeCode( String value )
    {
    this.kcp13V05NotificatTypeCode = value;
    }

  /**
   * Gets the value of the kcp13V05NotificatSubTypeCd property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp13V05NotificatSubTypeCd()
    {
    return kcp13V05NotificatSubTypeCd;
    }

  /**
   * Sets the value of the kcp13V05NotificatSubTypeCd property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp13V05NotificatSubTypeCd( String value )
    {
    this.kcp13V05NotificatSubTypeCd = value;
    }

  /**
   * Gets the value of the kcp13V05NotificatSuppressCd property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp13V05NotificatSuppressCd()
    {
    return kcp13V05NotificatSuppressCd;
    }

  /**
   * Sets the value of the kcp13V05NotificatSuppressCd property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp13V05NotificatSuppressCd( String value )
    {
    this.kcp13V05NotificatSuppressCd = value;
    }

  /**
   * Gets the value of the kcp13V05NotificatMmsgSupCd property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp13V05NotificatMmsgSupCd()
    {
    return kcp13V05NotificatMmsgSupCd;
    }

  /**
   * Sets the value of the kcp13V05NotificatMmsgSupCd property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp13V05NotificatMmsgSupCd( String value )
    {
    this.kcp13V05NotificatMmsgSupCd = value;
    }

  /**
   * Gets the value of the kcp13V05NotificatPmsgSupCd property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp13V05NotificatPmsgSupCd()
    {
    return kcp13V05NotificatPmsgSupCd;
    }

  /**
   * Sets the value of the kcp13V05NotificatPmsgSupCd property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp13V05NotificatPmsgSupCd( String value )
    {
    this.kcp13V05NotificatPmsgSupCd = value;
    }

  /**
   * Gets the value of the kcp13V05StmtDest property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp13V05StmtDest()
    {
    return kcp13V05StmtDest;
    }

  /**
   * Sets the value of the kcp13V05StmtDest property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp13V05StmtDest( String value )
    {
    this.kcp13V05StmtDest = value;
    }

  /**
   * Gets the value of the kcp13V05StmtDupDest property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp13V05StmtDupDest()
    {
    return kcp13V05StmtDupDest;
    }

  /**
   * Sets the value of the kcp13V05StmtDupDest property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp13V05StmtDupDest( String value )
    {
    this.kcp13V05StmtDupDest = value;
    }

  /**
   * Gets the value of the kcp13V05StmtCind property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp13V05StmtCind()
    {
    return kcp13V05StmtCind;
    }

  /**
   * Sets the value of the kcp13V05StmtCind property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp13V05StmtCind( String value )
    {
    this.kcp13V05StmtCind = value;
    }

  /**
   * Gets the value of the kcp13V05Dissenter property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp13V05Dissenter()
    {
    return kcp13V05Dissenter;
    }

  /**
   * Sets the value of the kcp13V05Dissenter property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp13V05Dissenter( String value )
    {
    this.kcp13V05Dissenter = value;
    }

  /**
   * Gets the value of the kcp13V05StmtDup property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp13V05StmtDup()
    {
    return kcp13V05StmtDup;
    }

  /**
   * Sets the value of the kcp13V05StmtDup property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp13V05StmtDup( String value )
    {
    this.kcp13V05StmtDup = value;
    }

  /**
   * Gets the value of the kcp13V05StmtDestClass property.
   */
  public int getKcp13V05StmtDestClass()
    {
    return kcp13V05StmtDestClass;
    }

  /**
   * Sets the value of the kcp13V05StmtDestClass property.
   */
  public void setKcp13V05StmtDestClass( int value )
    {
    this.kcp13V05StmtDestClass = value;
    }

  /**
   * Gets the value of the kcp13V05StmtLayout property.
   */
  public short getKcp13V05StmtLayout()
    {
    return kcp13V05StmtLayout;
    }

  /**
   * Sets the value of the kcp13V05StmtLayout property.
   */
  public void setKcp13V05StmtLayout( short value )
    {
    this.kcp13V05StmtLayout = value;
    }

  /**
   * Gets the value of the kcp13V05NoOfPrenotDates property.
   */
  public int getKcp13V05NoOfPrenotDates()
    {
    return kcp13V05NoOfPrenotDates;
    }

  /**
   * Sets the value of the kcp13V05NoOfPrenotDates property.
   */
  public void setKcp13V05NoOfPrenotDates( int value )
    {
    this.kcp13V05NoOfPrenotDates = value;
    }

  /**
   * Gets the value of the kcp13V05PrenotPrintDates property.
   * <p/>
   * <p/>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the kcp13V05PrenotPrintDates property.
   * <p/>
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKcp13V05PrenotPrintDates().add(newItem);
   * </pre>
   * <p/>
   * <p/>
   * <p/>
   * Objects of the following type(s) are allowed in the list
   * {@link Kcp13V05PrenotPrintDates }
   */
  public List<Kcp13V05PrenotPrintDates> getKcp13V05PrenotPrintDates()
    {
    if( kcp13V05PrenotPrintDates == null )
      {
      kcp13V05PrenotPrintDates = new ArrayList<Kcp13V05PrenotPrintDates>();
      }
    return this.kcp13V05PrenotPrintDates;
    }

  /**
   * Gets the value of the kcp13V05NoOfFrequencies property.
   */
  public int getKcp13V05NoOfFrequencies()
    {
    return kcp13V05NoOfFrequencies;
    }

  /**
   * Sets the value of the kcp13V05NoOfFrequencies property.
   */
  public void setKcp13V05NoOfFrequencies( int value )
    {
    this.kcp13V05NoOfFrequencies = value;
    }

  /**
   * Gets the value of the kcp13V05NotificatFreqDetail property.
   * <p/>
   * <p/>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the kcp13V05NotificatFreqDetail property.
   * <p/>
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKcp13V05NotificatFreqDetail().add(newItem);
   * </pre>
   * <p/>
   * <p/>
   * <p/>
   * Objects of the following type(s) are allowed in the list
   * {@link Kcp13V05NotificatFreqDetail }
   */
  public List<Kcp13V05NotificatFreqDetail> getKcp13V05NotificatFreqDetail()
    {
    if( kcp13V05NotificatFreqDetail == null )
      {
      kcp13V05NotificatFreqDetail = new ArrayList<Kcp13V05NotificatFreqDetail>();
      }
    return this.kcp13V05NotificatFreqDetail;
    }

  }
