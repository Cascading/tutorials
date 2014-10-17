package cascading.legstar.cobolcopybook.beans.kcp02v05;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp02V05AccountStatusData complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp02V05AccountStatusData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp02V05Status">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp02V05Opdate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp02V05Cldate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp02V05Chdate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp02V05ReopenDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp02V05TransferDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp02V05BadDoubt">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp02V05OpenPrimeRc">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp02V05OpenSupplemRc">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp02V05FromFinInstRef">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp02V05FromFinInstScode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *               &lt;totalDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp02V05ClosePrimeRc">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp02V05CloseSupplemRc">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp02V05ToFinInstRef">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp02V05ToFinInstSortCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *               &lt;totalDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp02V05TransferToSortCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *               &lt;totalDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp02V05TransfrToAccNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *               &lt;totalDigits value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp02V05TransfFromSortCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *               &lt;totalDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp02V05TransferFromAccNum">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *               &lt;totalDigits value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp02V05NewChangeDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp02V05OldChangeDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp02V05MergeIndicator">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp02V05Dormancy" type="{http://beans.cobolcopybook.legstar.cascading/kcp02v05}Kcp02V05Dormancy"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp02V05AccountStatusData", propOrder = {
  "kcp02V05Status",
  "kcp02V05Opdate",
  "kcp02V05Cldate",
  "kcp02V05Chdate",
  "kcp02V05ReopenDate",
  "kcp02V05TransferDate",
  "kcp02V05BadDoubt",
  "kcp02V05OpenPrimeRc",
  "kcp02V05OpenSupplemRc",
  "kcp02V05FromFinInstRef",
  "kcp02V05FromFinInstScode",
  "kcp02V05ClosePrimeRc",
  "kcp02V05CloseSupplemRc",
  "kcp02V05ToFinInstRef",
  "kcp02V05ToFinInstSortCode",
  "kcp02V05TransferToSortCode",
  "kcp02V05TransfrToAccNumber",
  "kcp02V05TransfFromSortCode",
  "kcp02V05TransferFromAccNum",
  "kcp02V05NewChangeDate",
  "kcp02V05OldChangeDate",
  "kcp02V05MergeIndicator",
  "kcp02V05Dormancy"
})
public class Kcp02V05AccountStatusData
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @CobolElement(cobolName = "KCP02V05-STATUS", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 1, picture = "S9", usage = "PACKED-DECIMAL", srceLine = 9)
  protected short kcp02V05Status;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP02V05-OPDATE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "XX", srceLine = 10)
  protected String kcp02V05Opdate;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP02V05-CLDATE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "XX", srceLine = 11)
  protected String kcp02V05Cldate;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP02V05-CHDATE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "XX", srceLine = 12)
  protected String kcp02V05Chdate;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP02V05-REOPEN-DATE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "XX", srceLine = 13)
  protected String kcp02V05ReopenDate;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP02V05-TRANSFER-DATE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "XX", srceLine = 15)
  protected String kcp02V05TransferDate;
  @CobolElement(cobolName = "KCP02V05-BAD-DOUBT", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 1, picture = "S9", usage = "PACKED-DECIMAL", srceLine = 17)
  protected short kcp02V05BadDoubt;
  @CobolElement(cobolName = "KCP02V05-OPEN-PRIME-RC", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 3, picture = "S999", usage = "PACKED-DECIMAL", srceLine = 19)
  protected short kcp02V05OpenPrimeRc;
  @CobolElement(cobolName = "KCP02V05-OPEN-SUPPLEM-RC", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 3, picture = "S999", usage = "PACKED-DECIMAL", srceLine = 21)
  protected short kcp02V05OpenSupplemRc;
  @CobolElement(cobolName = "KCP02V05-FROM-FIN-INST-REF", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 7, picture = "S9(7)", usage = "PACKED-DECIMAL", srceLine = 23)
  protected int kcp02V05FromFinInstRef;
  @CobolElement(cobolName = "KCP02V05-FROM-FIN-INST-SCODE", type = CobolType.ZONED_DECIMAL_ITEM, levelNumber = 5, isSigned = false, totalDigits = 6, picture = "9(6)", srceLine = 25)
  protected long kcp02V05FromFinInstScode;
  @CobolElement(cobolName = "KCP02V05-CLOSE-PRIME-RC", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 3, picture = "S999", usage = "PACKED-DECIMAL", srceLine = 27)
  protected short kcp02V05ClosePrimeRc;
  @CobolElement(cobolName = "KCP02V05-CLOSE-SUPPLEM-RC", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 3, picture = "S999", usage = "PACKED-DECIMAL", srceLine = 29)
  protected short kcp02V05CloseSupplemRc;
  @CobolElement(cobolName = "KCP02V05-TO-FIN-INST-REF", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 7, picture = "S9(7)", usage = "PACKED-DECIMAL", srceLine = 31)
  protected int kcp02V05ToFinInstRef;
  @CobolElement(cobolName = "KCP02V05-TO-FIN-INST-SORT-CODE", type = CobolType.ZONED_DECIMAL_ITEM, levelNumber = 5, isSigned = false, totalDigits = 6, picture = "9(6)", srceLine = 33)
  protected long kcp02V05ToFinInstSortCode;
  @CobolElement(cobolName = "KCP02V05-TRANSFER-TO-SORT-CODE", type = CobolType.ZONED_DECIMAL_ITEM, levelNumber = 5, isSigned = false, totalDigits = 6, picture = "9(6)", srceLine = 35)
  protected long kcp02V05TransferToSortCode;
  @CobolElement(cobolName = "KCP02V05-TRANSFR-TO-ACC-NUMBER", type = CobolType.ZONED_DECIMAL_ITEM, levelNumber = 5, isSigned = false, totalDigits = 8, picture = "9(8)", srceLine = 37)
  protected long kcp02V05TransfrToAccNumber;
  @CobolElement(cobolName = "KCP02V05-TRANSF-FROM-SORT-CODE", type = CobolType.ZONED_DECIMAL_ITEM, levelNumber = 5, isSigned = false, totalDigits = 6, picture = "9(6)", srceLine = 39)
  protected long kcp02V05TransfFromSortCode;
  @CobolElement(cobolName = "KCP02V05-TRANSFER-FROM-ACC-NUM", type = CobolType.ZONED_DECIMAL_ITEM, levelNumber = 5, isSigned = false, totalDigits = 8, picture = "9(8)", srceLine = 41)
  protected long kcp02V05TransferFromAccNum;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP02V05-NEW-CHANGE-DATE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "XX", srceLine = 43)
  protected String kcp02V05NewChangeDate;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP02V05-OLD-CHANGE-DATE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "XX", srceLine = 45)
  protected String kcp02V05OldChangeDate;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP02V05-MERGE-INDICATOR", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X", srceLine = 47)
  protected String kcp02V05MergeIndicator;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP02V05-DORMANCY", type = CobolType.GROUP_ITEM, levelNumber = 5, srceLine = 49)
  protected Kcp02V05Dormancy kcp02V05Dormancy;

  /**
   * Gets the value of the kcp02V05Status property.
   */
  public short getKcp02V05Status()
    {
    return kcp02V05Status;
    }

  /**
   * Sets the value of the kcp02V05Status property.
   */
  public void setKcp02V05Status( short value )
    {
    this.kcp02V05Status = value;
    }

  /**
   * Gets the value of the kcp02V05Opdate property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp02V05Opdate()
    {
    return kcp02V05Opdate;
    }

  /**
   * Sets the value of the kcp02V05Opdate property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp02V05Opdate( String value )
    {
    this.kcp02V05Opdate = value;
    }

  /**
   * Gets the value of the kcp02V05Cldate property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp02V05Cldate()
    {
    return kcp02V05Cldate;
    }

  /**
   * Sets the value of the kcp02V05Cldate property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp02V05Cldate( String value )
    {
    this.kcp02V05Cldate = value;
    }

  /**
   * Gets the value of the kcp02V05Chdate property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp02V05Chdate()
    {
    return kcp02V05Chdate;
    }

  /**
   * Sets the value of the kcp02V05Chdate property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp02V05Chdate( String value )
    {
    this.kcp02V05Chdate = value;
    }

  /**
   * Gets the value of the kcp02V05ReopenDate property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp02V05ReopenDate()
    {
    return kcp02V05ReopenDate;
    }

  /**
   * Sets the value of the kcp02V05ReopenDate property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp02V05ReopenDate( String value )
    {
    this.kcp02V05ReopenDate = value;
    }

  /**
   * Gets the value of the kcp02V05TransferDate property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp02V05TransferDate()
    {
    return kcp02V05TransferDate;
    }

  /**
   * Sets the value of the kcp02V05TransferDate property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp02V05TransferDate( String value )
    {
    this.kcp02V05TransferDate = value;
    }

  /**
   * Gets the value of the kcp02V05BadDoubt property.
   */
  public short getKcp02V05BadDoubt()
    {
    return kcp02V05BadDoubt;
    }

  /**
   * Sets the value of the kcp02V05BadDoubt property.
   */
  public void setKcp02V05BadDoubt( short value )
    {
    this.kcp02V05BadDoubt = value;
    }

  /**
   * Gets the value of the kcp02V05OpenPrimeRc property.
   */
  public short getKcp02V05OpenPrimeRc()
    {
    return kcp02V05OpenPrimeRc;
    }

  /**
   * Sets the value of the kcp02V05OpenPrimeRc property.
   */
  public void setKcp02V05OpenPrimeRc( short value )
    {
    this.kcp02V05OpenPrimeRc = value;
    }

  /**
   * Gets the value of the kcp02V05OpenSupplemRc property.
   */
  public short getKcp02V05OpenSupplemRc()
    {
    return kcp02V05OpenSupplemRc;
    }

  /**
   * Sets the value of the kcp02V05OpenSupplemRc property.
   */
  public void setKcp02V05OpenSupplemRc( short value )
    {
    this.kcp02V05OpenSupplemRc = value;
    }

  /**
   * Gets the value of the kcp02V05FromFinInstRef property.
   */
  public int getKcp02V05FromFinInstRef()
    {
    return kcp02V05FromFinInstRef;
    }

  /**
   * Sets the value of the kcp02V05FromFinInstRef property.
   */
  public void setKcp02V05FromFinInstRef( int value )
    {
    this.kcp02V05FromFinInstRef = value;
    }

  /**
   * Gets the value of the kcp02V05FromFinInstScode property.
   */
  public long getKcp02V05FromFinInstScode()
    {
    return kcp02V05FromFinInstScode;
    }

  /**
   * Sets the value of the kcp02V05FromFinInstScode property.
   */
  public void setKcp02V05FromFinInstScode( long value )
    {
    this.kcp02V05FromFinInstScode = value;
    }

  /**
   * Gets the value of the kcp02V05ClosePrimeRc property.
   */
  public short getKcp02V05ClosePrimeRc()
    {
    return kcp02V05ClosePrimeRc;
    }

  /**
   * Sets the value of the kcp02V05ClosePrimeRc property.
   */
  public void setKcp02V05ClosePrimeRc( short value )
    {
    this.kcp02V05ClosePrimeRc = value;
    }

  /**
   * Gets the value of the kcp02V05CloseSupplemRc property.
   */
  public short getKcp02V05CloseSupplemRc()
    {
    return kcp02V05CloseSupplemRc;
    }

  /**
   * Sets the value of the kcp02V05CloseSupplemRc property.
   */
  public void setKcp02V05CloseSupplemRc( short value )
    {
    this.kcp02V05CloseSupplemRc = value;
    }

  /**
   * Gets the value of the kcp02V05ToFinInstRef property.
   */
  public int getKcp02V05ToFinInstRef()
    {
    return kcp02V05ToFinInstRef;
    }

  /**
   * Sets the value of the kcp02V05ToFinInstRef property.
   */
  public void setKcp02V05ToFinInstRef( int value )
    {
    this.kcp02V05ToFinInstRef = value;
    }

  /**
   * Gets the value of the kcp02V05ToFinInstSortCode property.
   */
  public long getKcp02V05ToFinInstSortCode()
    {
    return kcp02V05ToFinInstSortCode;
    }

  /**
   * Sets the value of the kcp02V05ToFinInstSortCode property.
   */
  public void setKcp02V05ToFinInstSortCode( long value )
    {
    this.kcp02V05ToFinInstSortCode = value;
    }

  /**
   * Gets the value of the kcp02V05TransferToSortCode property.
   */
  public long getKcp02V05TransferToSortCode()
    {
    return kcp02V05TransferToSortCode;
    }

  /**
   * Sets the value of the kcp02V05TransferToSortCode property.
   */
  public void setKcp02V05TransferToSortCode( long value )
    {
    this.kcp02V05TransferToSortCode = value;
    }

  /**
   * Gets the value of the kcp02V05TransfrToAccNumber property.
   */
  public long getKcp02V05TransfrToAccNumber()
    {
    return kcp02V05TransfrToAccNumber;
    }

  /**
   * Sets the value of the kcp02V05TransfrToAccNumber property.
   */
  public void setKcp02V05TransfrToAccNumber( long value )
    {
    this.kcp02V05TransfrToAccNumber = value;
    }

  /**
   * Gets the value of the kcp02V05TransfFromSortCode property.
   */
  public long getKcp02V05TransfFromSortCode()
    {
    return kcp02V05TransfFromSortCode;
    }

  /**
   * Sets the value of the kcp02V05TransfFromSortCode property.
   */
  public void setKcp02V05TransfFromSortCode( long value )
    {
    this.kcp02V05TransfFromSortCode = value;
    }

  /**
   * Gets the value of the kcp02V05TransferFromAccNum property.
   */
  public long getKcp02V05TransferFromAccNum()
    {
    return kcp02V05TransferFromAccNum;
    }

  /**
   * Sets the value of the kcp02V05TransferFromAccNum property.
   */
  public void setKcp02V05TransferFromAccNum( long value )
    {
    this.kcp02V05TransferFromAccNum = value;
    }

  /**
   * Gets the value of the kcp02V05NewChangeDate property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp02V05NewChangeDate()
    {
    return kcp02V05NewChangeDate;
    }

  /**
   * Sets the value of the kcp02V05NewChangeDate property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp02V05NewChangeDate( String value )
    {
    this.kcp02V05NewChangeDate = value;
    }

  /**
   * Gets the value of the kcp02V05OldChangeDate property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp02V05OldChangeDate()
    {
    return kcp02V05OldChangeDate;
    }

  /**
   * Sets the value of the kcp02V05OldChangeDate property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp02V05OldChangeDate( String value )
    {
    this.kcp02V05OldChangeDate = value;
    }

  /**
   * Gets the value of the kcp02V05MergeIndicator property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp02V05MergeIndicator()
    {
    return kcp02V05MergeIndicator;
    }

  /**
   * Sets the value of the kcp02V05MergeIndicator property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp02V05MergeIndicator( String value )
    {
    this.kcp02V05MergeIndicator = value;
    }

  /**
   * Gets the value of the kcp02V05Dormancy property.
   *
   * @return possible object is
   * {@link Kcp02V05Dormancy }
   */
  public Kcp02V05Dormancy getKcp02V05Dormancy()
    {
    return kcp02V05Dormancy;
    }

  /**
   * Sets the value of the kcp02V05Dormancy property.
   *
   * @param value allowed object is
   *              {@link Kcp02V05Dormancy }
   */
  public void setKcp02V05Dormancy( Kcp02V05Dormancy value )
    {
    this.kcp02V05Dormancy = value;
    }

  }
