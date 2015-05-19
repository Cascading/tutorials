package cascading.legstar.cobolcopybook.beans.bean12;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp09V05OtherLimits complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp09V05OtherLimits">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp09V05OtherLimitsData" type="{http://beans.cobolcopybook.legstar.cascading/bean12}Kcp09V05OtherLimitsData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp09V05OtherLimits", propOrder = {"kcp09V05OtherLimitsData"})
public class Kcp09V05OtherLimits implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP09V05-OTHER-LIMITS-DATA", type = CobolType.GROUP_ITEM, levelNumber = 3, srceLine = 8)
  protected Kcp09V05OtherLimitsData kcp09V05OtherLimitsData;

  /**
   * Gets the value of the kcp09V05OtherLimitsData property.
   *
   * @return possible object is
   * {@link Kcp09V05OtherLimitsData }
   */
  public Kcp09V05OtherLimitsData getKcp09V05OtherLimitsData()
    {
    return kcp09V05OtherLimitsData;
    }

  /**
   * Sets the value of the kcp09V05OtherLimitsData property.
   *
   * @param value allowed object is
   *              {@link Kcp09V05OtherLimitsData }
   */
  public void setKcp09V05OtherLimitsData( Kcp09V05OtherLimitsData value )
    {
    this.kcp09V05OtherLimitsData = value;
    }

  }
