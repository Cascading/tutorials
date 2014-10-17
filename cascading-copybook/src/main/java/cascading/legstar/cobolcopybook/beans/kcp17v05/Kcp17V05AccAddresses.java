package cascading.legstar.cobolcopybook.beans.kcp17v05;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp17V05AccAddresses complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp17V05AccAddresses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp17V05AddressData" type="{http://beans.cobolcopybook.legstar.cascading/kcp17v05}Kcp17V05AddressData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp17V05AccAddresses", propOrder = {
  "kcp17V05AddressData"
})
public class Kcp17V05AccAddresses
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP17V05-ADDRESS-DATA", type = CobolType.GROUP_ITEM, levelNumber = 3, srceLine = 8)
  protected Kcp17V05AddressData kcp17V05AddressData;

  /**
   * Gets the value of the kcp17V05AddressData property.
   *
   * @return possible object is
   * {@link Kcp17V05AddressData }
   */
  public Kcp17V05AddressData getKcp17V05AddressData()
    {
    return kcp17V05AddressData;
    }

  /**
   * Sets the value of the kcp17V05AddressData property.
   *
   * @param value allowed object is
   *              {@link Kcp17V05AddressData }
   */
  public void setKcp17V05AddressData( Kcp17V05AddressData value )
    {
    this.kcp17V05AddressData = value;
    }

  }
