package cascading.legstar.cobolcopybook.beans.bean5;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Ogp04RepaymentData complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Ogp04RepaymentData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ogp04LbloanMat">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ogp04Repamt">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="13"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ogp04Repfreq">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ogp04Repdte">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ogp04Reptyp">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ogp04Borrow">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ogp04Amtsanc">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="11"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ogp04MirasDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
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
@XmlType(name = "Ogp04RepaymentData", propOrder = {
  "ogp04LbloanMat",
  "ogp04Repamt",
  "ogp04Repfreq",
  "ogp04Repdte",
  "ogp04Reptyp",
  "ogp04Borrow",
  "ogp04Amtsanc",
  "ogp04MirasDate"
})
public class Ogp04RepaymentData
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "OGP04-LBLOAN-MAT", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "XX", srceLine = 7)
  protected String ogp04LbloanMat;
  @XmlElement(required = true)
  @CobolElement(cobolName = "OGP04-REPAMT", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 13, fractionDigits = 2, picture = "S9(11)V99", usage = "PACKED-DECIMAL", srceLine = 8)
  protected BigDecimal ogp04Repamt;
  @CobolElement(cobolName = "OGP04-REPFREQ", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 1, picture = "S9", usage = "PACKED-DECIMAL", srceLine = 9)
  protected short ogp04Repfreq;
  @XmlElement(required = true)
  @CobolElement(cobolName = "OGP04-REPDTE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "XX", srceLine = 10)
  protected String ogp04Repdte;
  @CobolElement(cobolName = "OGP04-REPTYP", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 1, picture = "S9", usage = "PACKED-DECIMAL", srceLine = 11)
  protected short ogp04Reptyp;
  @CobolElement(cobolName = "OGP04-BORROW", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 3, picture = "S999", usage = "PACKED-DECIMAL", srceLine = 12)
  protected short ogp04Borrow;
  @XmlElement(required = true)
  @CobolElement(cobolName = "OGP04-AMTSANC", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 11, fractionDigits = 2, picture = "S9(9)V99", usage = "PACKED-DECIMAL", srceLine = 13)
  protected BigDecimal ogp04Amtsanc;
  @XmlElement(required = true)
  @CobolElement(cobolName = "OGP04-MIRAS-DATE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "XX", srceLine = 14)
  protected String ogp04MirasDate;

  /**
   * Gets the value of the ogp04LbloanMat property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getOgp04LbloanMat()
    {
    return ogp04LbloanMat;
    }

  /**
   * Sets the value of the ogp04LbloanMat property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setOgp04LbloanMat( String value )
    {
    this.ogp04LbloanMat = value;
    }

  /**
   * Gets the value of the ogp04Repamt property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getOgp04Repamt()
    {
    return ogp04Repamt;
    }

  /**
   * Sets the value of the ogp04Repamt property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setOgp04Repamt( BigDecimal value )
    {
    this.ogp04Repamt = value;
    }

  /**
   * Gets the value of the ogp04Repfreq property.
   */
  public short getOgp04Repfreq()
    {
    return ogp04Repfreq;
    }

  /**
   * Sets the value of the ogp04Repfreq property.
   */
  public void setOgp04Repfreq( short value )
    {
    this.ogp04Repfreq = value;
    }

  /**
   * Gets the value of the ogp04Repdte property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getOgp04Repdte()
    {
    return ogp04Repdte;
    }

  /**
   * Sets the value of the ogp04Repdte property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setOgp04Repdte( String value )
    {
    this.ogp04Repdte = value;
    }

  /**
   * Gets the value of the ogp04Reptyp property.
   */
  public short getOgp04Reptyp()
    {
    return ogp04Reptyp;
    }

  /**
   * Sets the value of the ogp04Reptyp property.
   */
  public void setOgp04Reptyp( short value )
    {
    this.ogp04Reptyp = value;
    }

  /**
   * Gets the value of the ogp04Borrow property.
   */
  public short getOgp04Borrow()
    {
    return ogp04Borrow;
    }

  /**
   * Sets the value of the ogp04Borrow property.
   */
  public void setOgp04Borrow( short value )
    {
    this.ogp04Borrow = value;
    }

  /**
   * Gets the value of the ogp04Amtsanc property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getOgp04Amtsanc()
    {
    return ogp04Amtsanc;
    }

  /**
   * Sets the value of the ogp04Amtsanc property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setOgp04Amtsanc( BigDecimal value )
    {
    this.ogp04Amtsanc = value;
    }

  /**
   * Gets the value of the ogp04MirasDate property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getOgp04MirasDate()
    {
    return ogp04MirasDate;
    }

  /**
   * Sets the value of the ogp04MirasDate property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setOgp04MirasDate( String value )
    {
    this.ogp04MirasDate = value;
    }

  }
