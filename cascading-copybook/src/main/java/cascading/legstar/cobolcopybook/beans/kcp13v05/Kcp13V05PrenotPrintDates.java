package cascading.legstar.cobolcopybook.beans.kcp13v05;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp13V05PrenotPrintDates complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp13V05PrenotPrintDates">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp13V05PrenotPrintType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp13V05PrenotPrintDate">
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
@XmlType(name = "Kcp13V05PrenotPrintDates", propOrder = {
  "kcp13V05PrenotPrintType",
  "kcp13V05PrenotPrintDate"
})
public class Kcp13V05PrenotPrintDates
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP13V05-PRENOT-PRINT-TYPE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 9, picture = "X", srceLine = 42)
  protected String kcp13V05PrenotPrintType;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP13V05-PRENOT-PRINT-DATE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 9, picture = "XX", srceLine = 44)
  protected String kcp13V05PrenotPrintDate;

  /**
   * Gets the value of the kcp13V05PrenotPrintType property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp13V05PrenotPrintType()
    {
    return kcp13V05PrenotPrintType;
    }

  /**
   * Sets the value of the kcp13V05PrenotPrintType property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp13V05PrenotPrintType( String value )
    {
    this.kcp13V05PrenotPrintType = value;
    }

  /**
   * Gets the value of the kcp13V05PrenotPrintDate property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp13V05PrenotPrintDate()
    {
    return kcp13V05PrenotPrintDate;
    }

  /**
   * Sets the value of the kcp13V05PrenotPrintDate property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp13V05PrenotPrintDate( String value )
    {
    this.kcp13V05PrenotPrintDate = value;
    }

  }
