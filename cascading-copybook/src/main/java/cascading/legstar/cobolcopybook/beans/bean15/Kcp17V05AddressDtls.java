package cascading.legstar.cobolcopybook.beans.bean15;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp17V05AddressDtls complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp17V05AddressDtls">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp17V05AddIdent">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp17V05StartDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp17V05EndDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp17V05AddressPostCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp17V05AddressL1">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="34"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp17V05AddressL2">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="34"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp17V05AddressL3">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="34"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp17V05AddressL4">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="34"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp17V05AddressL5">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="34"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp17V05AddressL6">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="24"/>
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
@XmlType(name = "Kcp17V05AddressDtls", propOrder = {"kcp17V05AddIdent", "kcp17V05StartDate", "kcp17V05EndDate", "kcp17V05AddressPostCode", "kcp17V05AddressL1", "kcp17V05AddressL2", "kcp17V05AddressL3", "kcp17V05AddressL4", "kcp17V05AddressL5", "kcp17V05AddressL6"})
public class Kcp17V05AddressDtls implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @CobolElement(cobolName = "KCP17V05-ADD-IDENT", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 7, isSigned = true, totalDigits = 1, picture = "S9", usage = "PACKED-DECIMAL", srceLine = 14)
  protected short kcp17V05AddIdent;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP17V05-START-DATE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "XX", srceLine = 16)
  protected String kcp17V05StartDate;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP17V05-END-DATE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "XX", srceLine = 18)
  protected String kcp17V05EndDate;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP17V05-ADDRESS-POST-CODE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "X(8)", srceLine = 20)
  protected String kcp17V05AddressPostCode;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP17V05-ADDRESS-L1", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "X(34)", srceLine = 22)
  protected String kcp17V05AddressL1;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP17V05-ADDRESS-L2", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "X(34)", srceLine = 24)
  protected String kcp17V05AddressL2;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP17V05-ADDRESS-L3", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "X(34)", srceLine = 26)
  protected String kcp17V05AddressL3;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP17V05-ADDRESS-L4", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "X(34)", srceLine = 28)
  protected String kcp17V05AddressL4;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP17V05-ADDRESS-L5", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "X(34)", srceLine = 30)
  protected String kcp17V05AddressL5;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP17V05-ADDRESS-L6", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "X(24)", srceLine = 32)
  protected String kcp17V05AddressL6;

  /**
   * Gets the value of the kcp17V05AddIdent property.
   */
  public short getKcp17V05AddIdent()
    {
    return kcp17V05AddIdent;
    }

  /**
   * Sets the value of the kcp17V05AddIdent property.
   */
  public void setKcp17V05AddIdent( short value )
    {
    this.kcp17V05AddIdent = value;
    }

  /**
   * Gets the value of the kcp17V05StartDate property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp17V05StartDate()
    {
    return kcp17V05StartDate;
    }

  /**
   * Sets the value of the kcp17V05StartDate property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp17V05StartDate( String value )
    {
    this.kcp17V05StartDate = value;
    }

  /**
   * Gets the value of the kcp17V05EndDate property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp17V05EndDate()
    {
    return kcp17V05EndDate;
    }

  /**
   * Sets the value of the kcp17V05EndDate property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp17V05EndDate( String value )
    {
    this.kcp17V05EndDate = value;
    }

  /**
   * Gets the value of the kcp17V05AddressPostCode property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp17V05AddressPostCode()
    {
    return kcp17V05AddressPostCode;
    }

  /**
   * Sets the value of the kcp17V05AddressPostCode property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp17V05AddressPostCode( String value )
    {
    this.kcp17V05AddressPostCode = value;
    }

  /**
   * Gets the value of the kcp17V05AddressL1 property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp17V05AddressL1()
    {
    return kcp17V05AddressL1;
    }

  /**
   * Sets the value of the kcp17V05AddressL1 property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp17V05AddressL1( String value )
    {
    this.kcp17V05AddressL1 = value;
    }

  /**
   * Gets the value of the kcp17V05AddressL2 property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp17V05AddressL2()
    {
    return kcp17V05AddressL2;
    }

  /**
   * Sets the value of the kcp17V05AddressL2 property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp17V05AddressL2( String value )
    {
    this.kcp17V05AddressL2 = value;
    }

  /**
   * Gets the value of the kcp17V05AddressL3 property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp17V05AddressL3()
    {
    return kcp17V05AddressL3;
    }

  /**
   * Sets the value of the kcp17V05AddressL3 property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp17V05AddressL3( String value )
    {
    this.kcp17V05AddressL3 = value;
    }

  /**
   * Gets the value of the kcp17V05AddressL4 property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp17V05AddressL4()
    {
    return kcp17V05AddressL4;
    }

  /**
   * Sets the value of the kcp17V05AddressL4 property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp17V05AddressL4( String value )
    {
    this.kcp17V05AddressL4 = value;
    }

  /**
   * Gets the value of the kcp17V05AddressL5 property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp17V05AddressL5()
    {
    return kcp17V05AddressL5;
    }

  /**
   * Sets the value of the kcp17V05AddressL5 property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp17V05AddressL5( String value )
    {
    this.kcp17V05AddressL5 = value;
    }

  /**
   * Gets the value of the kcp17V05AddressL6 property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp17V05AddressL6()
    {
    return kcp17V05AddressL6;
    }

  /**
   * Sets the value of the kcp17V05AddressL6 property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp17V05AddressL6( String value )
    {
    this.kcp17V05AddressL6 = value;
    }

  }
