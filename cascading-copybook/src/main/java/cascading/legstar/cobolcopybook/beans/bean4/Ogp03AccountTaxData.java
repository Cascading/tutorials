package cascading.legstar.cobolcopybook.beans.bean4;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Ogp03AccountTaxData complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Ogp03AccountTaxData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ogp03TaxReliefTypeInd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ogp03Earner">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ogp03TaxcertHeld">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ogp03VatMarker">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ogp03PartiesToAccount">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ogp03IntCertIss">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ogp03OresCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="3"/>
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
@XmlType(name = "Ogp03AccountTaxData", propOrder = {"ogp03TaxReliefTypeInd", "ogp03Earner", "ogp03TaxcertHeld", "ogp03VatMarker", "ogp03PartiesToAccount", "ogp03IntCertIss", "ogp03OresCode"})
public class Ogp03AccountTaxData implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @CobolElement(cobolName = "OGP03-TAX-RELIEF-TYPE-IND", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 1, picture = "S9", usage = "PACKED-DECIMAL", srceLine = 7)
  protected short ogp03TaxReliefTypeInd;
  @CobolElement(cobolName = "OGP03-EARNER", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 1, picture = "S9", usage = "PACKED-DECIMAL", srceLine = 9)
  protected short ogp03Earner;
  @XmlElement(required = true)
  @CobolElement(cobolName = "OGP03-TAXCERT-HELD", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X", srceLine = 10)
  protected String ogp03TaxcertHeld;
  @CobolElement(cobolName = "OGP03-VAT-MARKER", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 1, picture = "S9", usage = "PACKED-DECIMAL", srceLine = 12)
  protected short ogp03VatMarker;
  @CobolElement(cobolName = "OGP03-PARTIES-TO-ACCOUNT", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 1, picture = "S9", usage = "PACKED-DECIMAL", srceLine = 13)
  protected short ogp03PartiesToAccount;
  @CobolElement(cobolName = "OGP03-INT-CERT-ISS", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 1, picture = "S9", usage = "PACKED-DECIMAL", srceLine = 15)
  protected short ogp03IntCertIss;
  @CobolElement(cobolName = "OGP03-ORES-CODE", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 3, picture = "S999", usage = "PACKED-DECIMAL", srceLine = 17)
  protected short ogp03OresCode;

  /**
   * Gets the value of the ogp03TaxReliefTypeInd property.
   */
  public short getOgp03TaxReliefTypeInd()
    {
    return ogp03TaxReliefTypeInd;
    }

  /**
   * Sets the value of the ogp03TaxReliefTypeInd property.
   */
  public void setOgp03TaxReliefTypeInd( short value )
    {
    this.ogp03TaxReliefTypeInd = value;
    }

  /**
   * Gets the value of the ogp03Earner property.
   */
  public short getOgp03Earner()
    {
    return ogp03Earner;
    }

  /**
   * Sets the value of the ogp03Earner property.
   */
  public void setOgp03Earner( short value )
    {
    this.ogp03Earner = value;
    }

  /**
   * Gets the value of the ogp03TaxcertHeld property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getOgp03TaxcertHeld()
    {
    return ogp03TaxcertHeld;
    }

  /**
   * Sets the value of the ogp03TaxcertHeld property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setOgp03TaxcertHeld( String value )
    {
    this.ogp03TaxcertHeld = value;
    }

  /**
   * Gets the value of the ogp03VatMarker property.
   */
  public short getOgp03VatMarker()
    {
    return ogp03VatMarker;
    }

  /**
   * Sets the value of the ogp03VatMarker property.
   */
  public void setOgp03VatMarker( short value )
    {
    this.ogp03VatMarker = value;
    }

  /**
   * Gets the value of the ogp03PartiesToAccount property.
   */
  public short getOgp03PartiesToAccount()
    {
    return ogp03PartiesToAccount;
    }

  /**
   * Sets the value of the ogp03PartiesToAccount property.
   */
  public void setOgp03PartiesToAccount( short value )
    {
    this.ogp03PartiesToAccount = value;
    }

  /**
   * Gets the value of the ogp03IntCertIss property.
   */
  public short getOgp03IntCertIss()
    {
    return ogp03IntCertIss;
    }

  /**
   * Sets the value of the ogp03IntCertIss property.
   */
  public void setOgp03IntCertIss( short value )
    {
    this.ogp03IntCertIss = value;
    }

  /**
   * Gets the value of the ogp03OresCode property.
   */
  public short getOgp03OresCode()
    {
    return ogp03OresCode;
    }

  /**
   * Sets the value of the ogp03OresCode property.
   */
  public void setOgp03OresCode( short value )
    {
    this.ogp03OresCode = value;
    }

  }
