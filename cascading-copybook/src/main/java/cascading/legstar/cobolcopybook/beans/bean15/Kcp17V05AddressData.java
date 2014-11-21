package cascading.legstar.cobolcopybook.beans.bean15;

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
 * <p>Java class for Kcp17V05AddressData complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp17V05AddressData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp17V05NoOfAddresses">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;totalDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp17V05AddressDtls" type="{http://beans.cobolcopybook.legstar.cascading/bean15}Kcp17V05AddressDtls" maxOccurs="10" minOccurs="10"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp17V05AddressData", propOrder = {
  "kcp17V05NoOfAddresses",
  "kcp17V05AddressDtls"
})
public class Kcp17V05AddressData
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @CobolElement(cobolName = "KCP17V05-NO-OF-ADDRESSES", type = CobolType.ZONED_DECIMAL_ITEM, levelNumber = 5, isSigned = false, totalDigits = 2, isODOObject = true, picture = "99", srceLine = 9)
  protected int kcp17V05NoOfAddresses;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP17V05-ADDRESS-DTLS", type = CobolType.GROUP_ITEM, levelNumber = 5, minOccurs = -1, maxOccurs = 10, dependingOn = "KCP17V05-NO-OF-ADDRESSES", srceLine = 11)
  protected List<Kcp17V05AddressDtls> kcp17V05AddressDtls;

  /**
   * Gets the value of the kcp17V05NoOfAddresses property.
   */
  public int getKcp17V05NoOfAddresses()
    {
    return kcp17V05NoOfAddresses;
    }

  /**
   * Sets the value of the kcp17V05NoOfAddresses property.
   */
  public void setKcp17V05NoOfAddresses( int value )
    {
    this.kcp17V05NoOfAddresses = value;
    }

  /**
   * Gets the value of the kcp17V05AddressDtls property.
   * <p/>
   * <p/>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the kcp17V05AddressDtls property.
   * <p/>
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKcp17V05AddressDtls().add(newItem);
   * </pre>
   * <p/>
   * <p/>
   * <p/>
   * Objects of the following type(s) are allowed in the list
   * {@link Kcp17V05AddressDtls }
   */
  public List<Kcp17V05AddressDtls> getKcp17V05AddressDtls()
    {
    if( kcp17V05AddressDtls == null )
      {
      kcp17V05AddressDtls = new ArrayList<Kcp17V05AddressDtls>();
      }
    return this.kcp17V05AddressDtls;
    }

  }
