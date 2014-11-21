package cascading.legstar.cobolcopybook.beans.bean10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp07V05BalDetails complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp07V05BalDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp07V05AccountBalanceData" type="{http://beans.cobolcopybook.legstar.cascading/bean10}Kcp07V05AccountBalanceData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp07V05BalDetails", propOrder = {
  "kcp07V05AccountBalanceData"
})
public class Kcp07V05BalDetails
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP07V05-ACCOUNT-BALANCE-DATA", type = CobolType.GROUP_ITEM, levelNumber = 3, srceLine = 8)
  protected Kcp07V05AccountBalanceData kcp07V05AccountBalanceData;

  /**
   * Gets the value of the kcp07V05AccountBalanceData property.
   *
   * @return possible object is
   * {@link Kcp07V05AccountBalanceData }
   */
  public Kcp07V05AccountBalanceData getKcp07V05AccountBalanceData()
    {
    return kcp07V05AccountBalanceData;
    }

  /**
   * Sets the value of the kcp07V05AccountBalanceData property.
   *
   * @param value allowed object is
   *              {@link Kcp07V05AccountBalanceData }
   */
  public void setKcp07V05AccountBalanceData( Kcp07V05AccountBalanceData value )
    {
    this.kcp07V05AccountBalanceData = value;
    }

  }
