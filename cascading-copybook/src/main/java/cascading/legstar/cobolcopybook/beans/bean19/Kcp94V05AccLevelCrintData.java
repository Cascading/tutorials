package cascading.legstar.cobolcopybook.beans.bean19;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp94V05AccLevelCrintData complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp94V05AccLevelCrintData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp94V05NoOfTiers1">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp94V05InterestRateData" type="{http://beans.cobolcopybook.legstar.cascading/bean19}Kcp94V05InterestRateData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp94V05AccLevelCrintData", propOrder = {
  "kcp94V05NoOfTiers1",
  "kcp94V05InterestRateData"
})
public class Kcp94V05AccLevelCrintData
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @CobolElement(cobolName = "KCP94V05-NO-OF-TIERS1", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 3, picture = "S999", usage = "PACKED-DECIMAL", srceLine = 9)
  protected short kcp94V05NoOfTiers1;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP94V05-INTEREST-RATE-DATA", type = CobolType.GROUP_ITEM, levelNumber = 5, srceLine = 11)
  protected Kcp94V05InterestRateData kcp94V05InterestRateData;

  /**
   * Gets the value of the kcp94V05NoOfTiers1 property.
   */
  public short getKcp94V05NoOfTiers1()
    {
    return kcp94V05NoOfTiers1;
    }

  /**
   * Sets the value of the kcp94V05NoOfTiers1 property.
   */
  public void setKcp94V05NoOfTiers1( short value )
    {
    this.kcp94V05NoOfTiers1 = value;
    }

  /**
   * Gets the value of the kcp94V05InterestRateData property.
   *
   * @return possible object is
   * {@link Kcp94V05InterestRateData }
   */
  public Kcp94V05InterestRateData getKcp94V05InterestRateData()
    {
    return kcp94V05InterestRateData;
    }

  /**
   * Sets the value of the kcp94V05InterestRateData property.
   *
   * @param value allowed object is
   *              {@link Kcp94V05InterestRateData }
   */
  public void setKcp94V05InterestRateData( Kcp94V05InterestRateData value )
    {
    this.kcp94V05InterestRateData = value;
    }

  }
