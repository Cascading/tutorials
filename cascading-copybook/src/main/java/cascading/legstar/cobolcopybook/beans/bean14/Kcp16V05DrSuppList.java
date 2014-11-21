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
 * <p>Java class for Kcp16V05DrSuppList complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp16V05DrSuppList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp16V05SuppDrPrt">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp16V05NoOfDrTypes">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp16V05SuppListDrtypes" maxOccurs="4" minOccurs="4">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp16V05DrSuppList", propOrder = {
  "kcp16V05SuppDrPrt",
  "kcp16V05NoOfDrTypes",
  "kcp16V05SuppListDrtypes"
})
public class Kcp16V05DrSuppList
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP16V05-SUPP-DR-PRT", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 9, picture = "X", srceLine = 47)
  protected String kcp16V05SuppDrPrt;
  @CobolElement(cobolName = "KCP16V05-NO-OF-DR-TYPES", type = CobolType.ZONED_DECIMAL_ITEM, levelNumber = 9, isSigned = false, totalDigits = 1, picture = "9", srceLine = 49)
  protected int kcp16V05NoOfDrTypes;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP16V05-SUPP-LIST-DRTYPES", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 9, minOccurs = 4, maxOccurs = 4, picture = "X", srceLine = 51)
  protected List<String> kcp16V05SuppListDrtypes;

  /**
   * Gets the value of the kcp16V05SuppDrPrt property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp16V05SuppDrPrt()
    {
    return kcp16V05SuppDrPrt;
    }

  /**
   * Sets the value of the kcp16V05SuppDrPrt property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp16V05SuppDrPrt( String value )
    {
    this.kcp16V05SuppDrPrt = value;
    }

  /**
   * Gets the value of the kcp16V05NoOfDrTypes property.
   */
  public int getKcp16V05NoOfDrTypes()
    {
    return kcp16V05NoOfDrTypes;
    }

  /**
   * Sets the value of the kcp16V05NoOfDrTypes property.
   */
  public void setKcp16V05NoOfDrTypes( int value )
    {
    this.kcp16V05NoOfDrTypes = value;
    }

  /**
   * Gets the value of the kcp16V05SuppListDrtypes property.
   * <p/>
   * <p/>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the kcp16V05SuppListDrtypes property.
   * <p/>
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKcp16V05SuppListDrtypes().add(newItem);
   * </pre>
   * <p/>
   * <p/>
   * <p/>
   * Objects of the following type(s) are allowed in the list
   * {@link String }
   */
  public List<String> getKcp16V05SuppListDrtypes()
    {
    if( kcp16V05SuppListDrtypes == null )
      {
      kcp16V05SuppListDrtypes = new ArrayList<String>();
      }
    return this.kcp16V05SuppListDrtypes;
    }

  }
