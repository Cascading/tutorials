package cascading.legstar.cobolcopybook.beans.bean14;

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
 * <p>Java class for Kcp16V05NotificationTable complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp16V05NotificationTable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp16V05NotificatTypeCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp16V05NotificatSubTypeCd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp16V05NotificationProdDat">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp16V05StmtFirstSheet">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp16V05StmtLastSheet">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp16V05SpecialSheetNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp16V05StmtDest">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp16V05StmtDupDest">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp16V05StmtStdte">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp16V05StmtEnddte">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp16V05StmtCind">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp16V05Dissenter">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp16V05StmtReasno">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp16V05StmtIssreas" maxOccurs="10" minOccurs="10">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp16V05DrSuppListno">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp16V05DrSuppList" type="{http://beans.cobolcopybook.legstar.cascading/bean14}Kcp16V05DrSuppList" maxOccurs="4" minOccurs="4"/>
 *         &lt;element name="kcp16V05CrSuppListno">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp16V05CrSuppList" type="{http://beans.cobolcopybook.legstar.cascading/bean14}Kcp16V05CrSuppList" maxOccurs="9" minOccurs="9"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp16V05NotificationTable", propOrder = {"kcp16V05NotificatTypeCode", "kcp16V05NotificatSubTypeCd", "kcp16V05NotificationProdDat", "kcp16V05StmtFirstSheet", "kcp16V05StmtLastSheet", "kcp16V05SpecialSheetNumber", "kcp16V05StmtDest", "kcp16V05StmtDupDest", "kcp16V05StmtStdte", "kcp16V05StmtEnddte", "kcp16V05StmtCind", "kcp16V05Dissenter", "kcp16V05StmtReasno", "kcp16V05StmtIssreas", "kcp16V05DrSuppListno", "kcp16V05DrSuppList", "kcp16V05CrSuppListno", "kcp16V05CrSuppList"})
public class Kcp16V05NotificationTable implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP16V05-NOTIFICAT-TYPE-CODE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "X", srceLine = 14)
  protected String kcp16V05NotificatTypeCode;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP16V05-NOTIFICAT-SUB-TYPE-CD", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "X", srceLine = 16)
  protected String kcp16V05NotificatSubTypeCd;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP16V05-NOTIFICATION-PROD-DAT", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "XX", srceLine = 18)
  protected String kcp16V05NotificationProdDat;
  @CobolElement(cobolName = "KCP16V05-STMT-FIRST-SHEET", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 7, isSigned = true, totalDigits = 5, picture = "S9(5)", usage = "PACKED-DECIMAL", srceLine = 20)
  protected int kcp16V05StmtFirstSheet;
  @CobolElement(cobolName = "KCP16V05-STMT-LAST-SHEET", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 7, isSigned = true, totalDigits = 5, picture = "S9(5)", usage = "PACKED-DECIMAL", srceLine = 22)
  protected int kcp16V05StmtLastSheet;
  @CobolElement(cobolName = "KCP16V05-SPECIAL-SHEET-NUMBER", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 7, isSigned = true, totalDigits = 5, picture = "S9(5)", usage = "PACKED-DECIMAL", srceLine = 24)
  protected int kcp16V05SpecialSheetNumber;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP16V05-STMT-DEST", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "X", srceLine = 26)
  protected String kcp16V05StmtDest;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP16V05-STMT-DUP-DEST", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "X", srceLine = 28)
  protected String kcp16V05StmtDupDest;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP16V05-STMT-STDTE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "XX", srceLine = 30)
  protected String kcp16V05StmtStdte;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP16V05-STMT-ENDDTE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "XX", srceLine = 32)
  protected String kcp16V05StmtEnddte;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP16V05-STMT-CIND", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "X", srceLine = 34)
  protected String kcp16V05StmtCind;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP16V05-DISSENTER", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "X", srceLine = 36)
  protected String kcp16V05Dissenter;
  @CobolElement(cobolName = "KCP16V05-STMT-REASNO", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 7, isSigned = true, totalDigits = 3, picture = "S999", usage = "PACKED-DECIMAL", srceLine = 38)
  protected short kcp16V05StmtReasno;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP16V05-STMT-ISSREAS", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, minOccurs = 10, maxOccurs = 10, picture = "X", srceLine = 40)
  protected List<String> kcp16V05StmtIssreas;
  @CobolElement(cobolName = "KCP16V05-DR-SUPP-LISTNO", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 7, isSigned = true, totalDigits = 1, picture = "S9", usage = "PACKED-DECIMAL", srceLine = 43)
  protected short kcp16V05DrSuppListno;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP16V05-DR-SUPP-LIST", type = CobolType.GROUP_ITEM, levelNumber = 7, minOccurs = 4, maxOccurs = 4, srceLine = 45)
  protected List<Kcp16V05DrSuppList> kcp16V05DrSuppList;
  @CobolElement(cobolName = "KCP16V05-CR-SUPP-LISTNO", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 7, isSigned = true, totalDigits = 1, picture = "S9", usage = "PACKED-DECIMAL", srceLine = 54)
  protected short kcp16V05CrSuppListno;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP16V05-CR-SUPP-LIST", type = CobolType.GROUP_ITEM, levelNumber = 7, minOccurs = 9, maxOccurs = 9, srceLine = 56)
  protected List<Kcp16V05CrSuppList> kcp16V05CrSuppList;

  /**
   * Gets the value of the kcp16V05NotificatTypeCode property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp16V05NotificatTypeCode()
    {
    return kcp16V05NotificatTypeCode;
    }

  /**
   * Sets the value of the kcp16V05NotificatTypeCode property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp16V05NotificatTypeCode( String value )
    {
    this.kcp16V05NotificatTypeCode = value;
    }

  /**
   * Gets the value of the kcp16V05NotificatSubTypeCd property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp16V05NotificatSubTypeCd()
    {
    return kcp16V05NotificatSubTypeCd;
    }

  /**
   * Sets the value of the kcp16V05NotificatSubTypeCd property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp16V05NotificatSubTypeCd( String value )
    {
    this.kcp16V05NotificatSubTypeCd = value;
    }

  /**
   * Gets the value of the kcp16V05NotificationProdDat property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp16V05NotificationProdDat()
    {
    return kcp16V05NotificationProdDat;
    }

  /**
   * Sets the value of the kcp16V05NotificationProdDat property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp16V05NotificationProdDat( String value )
    {
    this.kcp16V05NotificationProdDat = value;
    }

  /**
   * Gets the value of the kcp16V05StmtFirstSheet property.
   */
  public int getKcp16V05StmtFirstSheet()
    {
    return kcp16V05StmtFirstSheet;
    }

  /**
   * Sets the value of the kcp16V05StmtFirstSheet property.
   */
  public void setKcp16V05StmtFirstSheet( int value )
    {
    this.kcp16V05StmtFirstSheet = value;
    }

  /**
   * Gets the value of the kcp16V05StmtLastSheet property.
   */
  public int getKcp16V05StmtLastSheet()
    {
    return kcp16V05StmtLastSheet;
    }

  /**
   * Sets the value of the kcp16V05StmtLastSheet property.
   */
  public void setKcp16V05StmtLastSheet( int value )
    {
    this.kcp16V05StmtLastSheet = value;
    }

  /**
   * Gets the value of the kcp16V05SpecialSheetNumber property.
   */
  public int getKcp16V05SpecialSheetNumber()
    {
    return kcp16V05SpecialSheetNumber;
    }

  /**
   * Sets the value of the kcp16V05SpecialSheetNumber property.
   */
  public void setKcp16V05SpecialSheetNumber( int value )
    {
    this.kcp16V05SpecialSheetNumber = value;
    }

  /**
   * Gets the value of the kcp16V05StmtDest property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp16V05StmtDest()
    {
    return kcp16V05StmtDest;
    }

  /**
   * Sets the value of the kcp16V05StmtDest property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp16V05StmtDest( String value )
    {
    this.kcp16V05StmtDest = value;
    }

  /**
   * Gets the value of the kcp16V05StmtDupDest property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp16V05StmtDupDest()
    {
    return kcp16V05StmtDupDest;
    }

  /**
   * Sets the value of the kcp16V05StmtDupDest property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp16V05StmtDupDest( String value )
    {
    this.kcp16V05StmtDupDest = value;
    }

  /**
   * Gets the value of the kcp16V05StmtStdte property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp16V05StmtStdte()
    {
    return kcp16V05StmtStdte;
    }

  /**
   * Sets the value of the kcp16V05StmtStdte property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp16V05StmtStdte( String value )
    {
    this.kcp16V05StmtStdte = value;
    }

  /**
   * Gets the value of the kcp16V05StmtEnddte property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp16V05StmtEnddte()
    {
    return kcp16V05StmtEnddte;
    }

  /**
   * Sets the value of the kcp16V05StmtEnddte property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp16V05StmtEnddte( String value )
    {
    this.kcp16V05StmtEnddte = value;
    }

  /**
   * Gets the value of the kcp16V05StmtCind property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp16V05StmtCind()
    {
    return kcp16V05StmtCind;
    }

  /**
   * Sets the value of the kcp16V05StmtCind property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp16V05StmtCind( String value )
    {
    this.kcp16V05StmtCind = value;
    }

  /**
   * Gets the value of the kcp16V05Dissenter property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp16V05Dissenter()
    {
    return kcp16V05Dissenter;
    }

  /**
   * Sets the value of the kcp16V05Dissenter property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp16V05Dissenter( String value )
    {
    this.kcp16V05Dissenter = value;
    }

  /**
   * Gets the value of the kcp16V05StmtReasno property.
   */
  public short getKcp16V05StmtReasno()
    {
    return kcp16V05StmtReasno;
    }

  /**
   * Sets the value of the kcp16V05StmtReasno property.
   */
  public void setKcp16V05StmtReasno( short value )
    {
    this.kcp16V05StmtReasno = value;
    }

  /**
   * Gets the value of the kcp16V05StmtIssreas property.
   * <p/>
   * <p/>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the kcp16V05StmtIssreas property.
   * <p/>
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKcp16V05StmtIssreas().add(newItem);
   * </pre>
   * <p/>
   * <p/>
   * <p/>
   * Objects of the following type(s) are allowed in the list
   * {@link String }
   */
  public List<String> getKcp16V05StmtIssreas()
    {
    if( kcp16V05StmtIssreas == null )
      {
      kcp16V05StmtIssreas = new ArrayList<String>();
      }
    return this.kcp16V05StmtIssreas;
    }

  /**
   * Gets the value of the kcp16V05DrSuppListno property.
   */
  public short getKcp16V05DrSuppListno()
    {
    return kcp16V05DrSuppListno;
    }

  /**
   * Sets the value of the kcp16V05DrSuppListno property.
   */
  public void setKcp16V05DrSuppListno( short value )
    {
    this.kcp16V05DrSuppListno = value;
    }

  /**
   * Gets the value of the kcp16V05DrSuppList property.
   * <p/>
   * <p/>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the kcp16V05DrSuppList property.
   * <p/>
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKcp16V05DrSuppList().add(newItem);
   * </pre>
   * <p/>
   * <p/>
   * <p/>
   * Objects of the following type(s) are allowed in the list
   * {@link Kcp16V05DrSuppList }
   */
  public List<Kcp16V05DrSuppList> getKcp16V05DrSuppList()
    {
    if( kcp16V05DrSuppList == null )
      {
      kcp16V05DrSuppList = new ArrayList<Kcp16V05DrSuppList>();
      }
    return this.kcp16V05DrSuppList;
    }

  /**
   * Gets the value of the kcp16V05CrSuppListno property.
   */
  public short getKcp16V05CrSuppListno()
    {
    return kcp16V05CrSuppListno;
    }

  /**
   * Sets the value of the kcp16V05CrSuppListno property.
   */
  public void setKcp16V05CrSuppListno( short value )
    {
    this.kcp16V05CrSuppListno = value;
    }

  /**
   * Gets the value of the kcp16V05CrSuppList property.
   * <p/>
   * <p/>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the kcp16V05CrSuppList property.
   * <p/>
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKcp16V05CrSuppList().add(newItem);
   * </pre>
   * <p/>
   * <p/>
   * <p/>
   * Objects of the following type(s) are allowed in the list
   * {@link Kcp16V05CrSuppList }
   */
  public List<Kcp16V05CrSuppList> getKcp16V05CrSuppList()
    {
    if( kcp16V05CrSuppList == null )
      {
      kcp16V05CrSuppList = new ArrayList<Kcp16V05CrSuppList>();
      }
    return this.kcp16V05CrSuppList;
    }

  }
