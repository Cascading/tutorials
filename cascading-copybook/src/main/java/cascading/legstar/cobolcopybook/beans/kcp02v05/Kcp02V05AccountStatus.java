package cascading.legstar.cobolcopybook.beans.kcp02v05;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp02V05AccountStatus complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp02V05AccountStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp02V05AccountStatusData" type="{http://beans.cobolcopybook.legstar.cascading/kcp02v05}Kcp02V05AccountStatusData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp02V05AccountStatus", propOrder = {
  "kcp02V05AccountStatusData"
})
public class Kcp02V05AccountStatus
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP02V05-ACCOUNT-STATUS-DATA", type = CobolType.GROUP_ITEM, levelNumber = 3, srceLine = 8)
  protected Kcp02V05AccountStatusData kcp02V05AccountStatusData;

  /**
   * Gets the value of the kcp02V05AccountStatusData property.
   *
   * @return possible object is
   * {@link Kcp02V05AccountStatusData }
   */
  public Kcp02V05AccountStatusData getKcp02V05AccountStatusData()
    {
    return kcp02V05AccountStatusData;
    }

  /**
   * Sets the value of the kcp02V05AccountStatusData property.
   *
   * @param value allowed object is
   *              {@link Kcp02V05AccountStatusData }
   */
  public void setKcp02V05AccountStatusData( Kcp02V05AccountStatusData value )
    {
    this.kcp02V05AccountStatusData = value;
    }

  }
