package cascading.legstar.cobolcopybook.beans.bean8;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp02V05Dormancy complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp02V05Dormancy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp02V05DormancyLastUpdate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp02V05DormancyInd">
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
@XmlType(name = "Kcp02V05Dormancy", propOrder = {
  "kcp02V05DormancyLastUpdate",
  "kcp02V05DormancyInd"
})
public class Kcp02V05Dormancy
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP02V05-DORMANCY-LAST-UPDATE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "XX", srceLine = 50)
  protected String kcp02V05DormancyLastUpdate;
  @CobolElement(cobolName = "KCP02V05-DORMANCY-IND", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 7, isSigned = true, totalDigits = 1, picture = "S9", usage = "PACKED-DECIMAL", srceLine = 52)
  protected short kcp02V05DormancyInd;

  /**
   * Gets the value of the kcp02V05DormancyLastUpdate property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp02V05DormancyLastUpdate()
    {
    return kcp02V05DormancyLastUpdate;
    }

  /**
   * Sets the value of the kcp02V05DormancyLastUpdate property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp02V05DormancyLastUpdate( String value )
    {
    this.kcp02V05DormancyLastUpdate = value;
    }

  /**
   * Gets the value of the kcp02V05DormancyInd property.
   */
  public short getKcp02V05DormancyInd()
    {
    return kcp02V05DormancyInd;
    }

  /**
   * Sets the value of the kcp02V05DormancyInd property.
   */
  public void setKcp02V05DormancyInd( short value )
    {
    this.kcp02V05DormancyInd = value;
    }

  }
