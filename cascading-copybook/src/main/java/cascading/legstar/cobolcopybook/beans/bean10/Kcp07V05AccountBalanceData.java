package cascading.legstar.cobolcopybook.beans.bean10;

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
 * <p>Java class for Kcp07V05AccountBalanceData complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp07V05AccountBalanceData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp07V05Baldate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp07V05NoOfBalances">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp07V05BalTab" type="{http://beans.cobolcopybook.legstar.cascading/bean10}Kcp07V05BalTab" maxOccurs="20" minOccurs="20"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp07V05AccountBalanceData", propOrder = {
  "kcp07V05Baldate",
  "kcp07V05NoOfBalances",
  "kcp07V05BalTab"
})
public class Kcp07V05AccountBalanceData
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @CobolElement(cobolName = "KCP07V05-BALDATE", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 5, picture = "S9(5)", usage = "PACKED-DECIMAL", srceLine = 9)
  protected int kcp07V05Baldate;
  @CobolElement(cobolName = "KCP07V05-NO-OF-BALANCES", type = CobolType.ZONED_DECIMAL_ITEM, levelNumber = 5, isSigned = false, totalDigits = 3, isODOObject = true, picture = "999", srceLine = 10)
  protected int kcp07V05NoOfBalances;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP07V05-BAL-TAB", type = CobolType.GROUP_ITEM, levelNumber = 5, minOccurs = -1, maxOccurs = 20, dependingOn = "KCP07V05-NO-OF-BALANCES", srceLine = 12)
  protected List<Kcp07V05BalTab> kcp07V05BalTab;

  /**
   * Gets the value of the kcp07V05Baldate property.
   */
  public int getKcp07V05Baldate()
    {
    return kcp07V05Baldate;
    }

  /**
   * Sets the value of the kcp07V05Baldate property.
   */
  public void setKcp07V05Baldate( int value )
    {
    this.kcp07V05Baldate = value;
    }

  /**
   * Gets the value of the kcp07V05NoOfBalances property.
   */
  public int getKcp07V05NoOfBalances()
    {
    return kcp07V05NoOfBalances;
    }

  /**
   * Sets the value of the kcp07V05NoOfBalances property.
   */
  public void setKcp07V05NoOfBalances( int value )
    {
    this.kcp07V05NoOfBalances = value;
    }

  /**
   * Gets the value of the kcp07V05BalTab property.
   * <p/>
   * <p/>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the kcp07V05BalTab property.
   * <p/>
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKcp07V05BalTab().add(newItem);
   * </pre>
   * <p/>
   * <p/>
   * <p/>
   * Objects of the following type(s) are allowed in the list
   * {@link Kcp07V05BalTab }
   */
  public List<Kcp07V05BalTab> getKcp07V05BalTab()
    {
    if( kcp07V05BalTab == null )
      {
      kcp07V05BalTab = new ArrayList<Kcp07V05BalTab>();
      }
    return this.kcp07V05BalTab;
    }

  }
