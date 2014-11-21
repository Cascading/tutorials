package cascading.legstar.cobolcopybook.beans.bean21;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp97V05DrintRates complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp97V05DrintRates">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp97V05DrintRateData" type="{http://beans.cobolcopybook.legstar.cascading/bean21}Kcp97V05DrintRateData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp97V05DrintRates", propOrder = {
  "kcp97V05DrintRateData"
})
public class Kcp97V05DrintRates
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP97V05-DRINT-RATE-DATA", type = CobolType.GROUP_ITEM, levelNumber = 3, srceLine = 8)
  protected Kcp97V05DrintRateData kcp97V05DrintRateData;

  /**
   * Gets the value of the kcp97V05DrintRateData property.
   *
   * @return possible object is
   * {@link Kcp97V05DrintRateData }
   */
  public Kcp97V05DrintRateData getKcp97V05DrintRateData()
    {
    return kcp97V05DrintRateData;
    }

  /**
   * Sets the value of the kcp97V05DrintRateData property.
   *
   * @param value allowed object is
   *              {@link Kcp97V05DrintRateData }
   */
  public void setKcp97V05DrintRateData( Kcp97V05DrintRateData value )
    {
    this.kcp97V05DrintRateData = value;
    }

  }
