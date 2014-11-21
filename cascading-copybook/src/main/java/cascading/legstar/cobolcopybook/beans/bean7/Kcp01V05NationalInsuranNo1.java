package cascading.legstar.cobolcopybook.beans.bean7;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp01V05NationalInsuranNo1 complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp01V05NationalInsuranNo1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp01V05NatinsNo1A">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05NatinsNo1B">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05NatinsNo1C">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
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
@XmlType(name = "Kcp01V05NationalInsuranNo1", propOrder = {
  "kcp01V05NatinsNo1A",
  "kcp01V05NatinsNo1B",
  "kcp01V05NatinsNo1C"
})
public class Kcp01V05NationalInsuranNo1
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP01V05-NATINS-NO-1A", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "XX", srceLine = 67)
  protected String kcp01V05NatinsNo1A;
  @CobolElement(cobolName = "KCP01V05-NATINS-NO-1B", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 7, isSigned = true, totalDigits = 7, picture = "S9(7)", usage = "PACKED-DECIMAL", srceLine = 69)
  protected int kcp01V05NatinsNo1B;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP01V05-NATINS-NO-1C", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "X", srceLine = 71)
  protected String kcp01V05NatinsNo1C;

  /**
   * Gets the value of the kcp01V05NatinsNo1A property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp01V05NatinsNo1A()
    {
    return kcp01V05NatinsNo1A;
    }

  /**
   * Sets the value of the kcp01V05NatinsNo1A property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp01V05NatinsNo1A( String value )
    {
    this.kcp01V05NatinsNo1A = value;
    }

  /**
   * Gets the value of the kcp01V05NatinsNo1B property.
   */
  public int getKcp01V05NatinsNo1B()
    {
    return kcp01V05NatinsNo1B;
    }

  /**
   * Sets the value of the kcp01V05NatinsNo1B property.
   */
  public void setKcp01V05NatinsNo1B( int value )
    {
    this.kcp01V05NatinsNo1B = value;
    }

  /**
   * Gets the value of the kcp01V05NatinsNo1C property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp01V05NatinsNo1C()
    {
    return kcp01V05NatinsNo1C;
    }

  /**
   * Sets the value of the kcp01V05NatinsNo1C property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp01V05NatinsNo1C( String value )
    {
    this.kcp01V05NatinsNo1C = value;
    }

  }
