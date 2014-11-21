package cascading.legstar.cobolcopybook.beans.bean16;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp18V05LnameData complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp18V05LnameData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp18V05LnameStartDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp18V05LnameEndDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp18V05LnameL1">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="58"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp18V05LnameL2">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="58"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp18V05LnameL3">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="58"/>
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
@XmlType(name = "Kcp18V05LnameData", propOrder = {
  "kcp18V05LnameStartDate",
  "kcp18V05LnameEndDate",
  "kcp18V05LnameL1",
  "kcp18V05LnameL2",
  "kcp18V05LnameL3"
})
public class Kcp18V05LnameData
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP18V05-LNAME-START-DATE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "XX", srceLine = 14)
  protected String kcp18V05LnameStartDate;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP18V05-LNAME-END-DATE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "XX", srceLine = 16)
  protected String kcp18V05LnameEndDate;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP18V05-LNAME-L1", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "X(58)", srceLine = 18)
  protected String kcp18V05LnameL1;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP18V05-LNAME-L2", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "X(58)", srceLine = 20)
  protected String kcp18V05LnameL2;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP18V05-LNAME-L3", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "X(58)", srceLine = 22)
  protected String kcp18V05LnameL3;

  /**
   * Gets the value of the kcp18V05LnameStartDate property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp18V05LnameStartDate()
    {
    return kcp18V05LnameStartDate;
    }

  /**
   * Sets the value of the kcp18V05LnameStartDate property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp18V05LnameStartDate( String value )
    {
    this.kcp18V05LnameStartDate = value;
    }

  /**
   * Gets the value of the kcp18V05LnameEndDate property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp18V05LnameEndDate()
    {
    return kcp18V05LnameEndDate;
    }

  /**
   * Sets the value of the kcp18V05LnameEndDate property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp18V05LnameEndDate( String value )
    {
    this.kcp18V05LnameEndDate = value;
    }

  /**
   * Gets the value of the kcp18V05LnameL1 property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp18V05LnameL1()
    {
    return kcp18V05LnameL1;
    }

  /**
   * Sets the value of the kcp18V05LnameL1 property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp18V05LnameL1( String value )
    {
    this.kcp18V05LnameL1 = value;
    }

  /**
   * Gets the value of the kcp18V05LnameL2 property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp18V05LnameL2()
    {
    return kcp18V05LnameL2;
    }

  /**
   * Sets the value of the kcp18V05LnameL2 property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp18V05LnameL2( String value )
    {
    this.kcp18V05LnameL2 = value;
    }

  /**
   * Gets the value of the kcp18V05LnameL3 property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp18V05LnameL3()
    {
    return kcp18V05LnameL3;
    }

  /**
   * Sets the value of the kcp18V05LnameL3 property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp18V05LnameL3( String value )
    {
    this.kcp18V05LnameL3 = value;
    }

  }
