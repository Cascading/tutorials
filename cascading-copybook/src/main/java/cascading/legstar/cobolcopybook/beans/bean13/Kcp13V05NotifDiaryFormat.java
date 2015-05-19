package cascading.legstar.cobolcopybook.beans.bean13;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp13V05NotifDiaryFormat complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp13V05NotifDiaryFormat">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp13V05NotificationData" type="{http://beans.cobolcopybook.legstar.cascading/bean13}Kcp13V05NotificationData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp13V05NotifDiaryFormat", propOrder = {"kcp13V05NotificationData"})
public class Kcp13V05NotifDiaryFormat implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP13V05-NOTIFICATION-DATA", type = CobolType.GROUP_ITEM, levelNumber = 3, srceLine = 8)
  protected Kcp13V05NotificationData kcp13V05NotificationData;

  /**
   * Gets the value of the kcp13V05NotificationData property.
   *
   * @return possible object is
   * {@link Kcp13V05NotificationData }
   */
  public Kcp13V05NotificationData getKcp13V05NotificationData()
    {
    return kcp13V05NotificationData;
    }

  /**
   * Sets the value of the kcp13V05NotificationData property.
   *
   * @param value allowed object is
   *              {@link Kcp13V05NotificationData }
   */
  public void setKcp13V05NotificationData( Kcp13V05NotificationData value )
    {
    this.kcp13V05NotificationData = value;
    }

  }
