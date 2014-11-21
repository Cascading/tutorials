package cascading.legstar.cobolcopybook.beans.bean14;

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
 * <p>Java class for Kcp16V05StatementHistData complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp16V05StatementHistData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp16V05NoOfNotifications">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;totalDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp16V05NotificationTable" type="{http://beans.cobolcopybook.legstar.cascading/bean14}Kcp16V05NotificationTable" maxOccurs="10" minOccurs="10"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp16V05StatementHistData", propOrder = {
  "kcp16V05NoOfNotifications",
  "kcp16V05NotificationTable"
})
public class Kcp16V05StatementHistData
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @CobolElement(cobolName = "KCP16V05-NO-OF-NOTIFICATIONS", type = CobolType.ZONED_DECIMAL_ITEM, levelNumber = 5, isSigned = false, totalDigits = 2, isODOObject = true, picture = "99", srceLine = 9)
  protected int kcp16V05NoOfNotifications;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP16V05-NOTIFICATION-TABLE", type = CobolType.GROUP_ITEM, levelNumber = 5, minOccurs = -1, maxOccurs = 10, dependingOn = "KCP16V05-NO-OF-NOTIFICATIONS", srceLine = 11)
  protected List<Kcp16V05NotificationTable> kcp16V05NotificationTable;

  /**
   * Gets the value of the kcp16V05NoOfNotifications property.
   */
  public int getKcp16V05NoOfNotifications()
    {
    return kcp16V05NoOfNotifications;
    }

  /**
   * Sets the value of the kcp16V05NoOfNotifications property.
   */
  public void setKcp16V05NoOfNotifications( int value )
    {
    this.kcp16V05NoOfNotifications = value;
    }

  /**
   * Gets the value of the kcp16V05NotificationTable property.
   * <p/>
   * <p/>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the kcp16V05NotificationTable property.
   * <p/>
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKcp16V05NotificationTable().add(newItem);
   * </pre>
   * <p/>
   * <p/>
   * <p/>
   * Objects of the following type(s) are allowed in the list
   * {@link Kcp16V05NotificationTable }
   */
  public List<Kcp16V05NotificationTable> getKcp16V05NotificationTable()
    {
    if( kcp16V05NotificationTable == null )
      {
      kcp16V05NotificationTable = new ArrayList<Kcp16V05NotificationTable>();
      }
    return this.kcp16V05NotificationTable;
    }

  }
