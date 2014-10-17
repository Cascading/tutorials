package cascading.legstar.cobolcopybook.beans.kcp13v05;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp13V05NotificationData complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp13V05NotificationData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp13V05NoOfDiaries">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp13V05NotificatDiaryData" type="{http://beans.cobolcopybook.legstar.cascading/kcp13v05}Kcp13V05NotificatDiaryData" maxOccurs="4"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp13V05NotificationData", propOrder = {
  "kcp13V05NoOfDiaries",
  "kcp13V05NotificatDiaryData"
})
public class Kcp13V05NotificationData
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @CobolElement(cobolName = "KCP13V05-NO-OF-DIARIES", type = CobolType.ZONED_DECIMAL_ITEM, levelNumber = 5, isSigned = false, totalDigits = 1, isODOObject = true, picture = "9", srceLine = 9)
  protected int kcp13V05NoOfDiaries;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP13V05-NOTIFICAT-DIARY-DATA", type = CobolType.GROUP_ITEM, levelNumber = 5, minOccurs = 1, maxOccurs = 4, dependingOn = "KCP13V05-NO-OF-DIARIES", srceLine = 11)
  protected List<Kcp13V05NotificatDiaryData> kcp13V05NotificatDiaryData;

  /**
   * Gets the value of the kcp13V05NoOfDiaries property.
   */
  public int getKcp13V05NoOfDiaries()
    {
    return kcp13V05NoOfDiaries;
    }

  /**
   * Sets the value of the kcp13V05NoOfDiaries property.
   */
  public void setKcp13V05NoOfDiaries( int value )
    {
    this.kcp13V05NoOfDiaries = value;
    }

  /**
   * Gets the value of the kcp13V05NotificatDiaryData property.
   * <p/>
   * <p/>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the kcp13V05NotificatDiaryData property.
   * <p/>
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKcp13V05NotificatDiaryData().add(newItem);
   * </pre>
   * <p/>
   * <p/>
   * <p/>
   * Objects of the following type(s) are allowed in the list
   * {@link Kcp13V05NotificatDiaryData }
   */
  public List<Kcp13V05NotificatDiaryData> getKcp13V05NotificatDiaryData()
    {
    if( kcp13V05NotificatDiaryData == null )
      {
      kcp13V05NotificatDiaryData = new ArrayList<Kcp13V05NotificatDiaryData>();
      }
    return this.kcp13V05NotificatDiaryData;
    }

  }
