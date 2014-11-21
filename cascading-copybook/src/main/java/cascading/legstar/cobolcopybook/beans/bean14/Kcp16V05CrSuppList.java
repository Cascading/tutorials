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
 * <p>Java class for Kcp16V05CrSuppList complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp16V05CrSuppList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp16V05SuppCrPrt">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp16V05NoOfCrTypes">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp16V05SuppListCrtypes" maxOccurs="9" minOccurs="9">
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
@XmlType(name = "Kcp16V05CrSuppList", propOrder = {
  "kcp16V05SuppCrPrt",
  "kcp16V05NoOfCrTypes",
  "kcp16V05SuppListCrtypes"
})
public class Kcp16V05CrSuppList
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP16V05-SUPP-CR-PRT", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 9, picture = "X", srceLine = 58)
  protected String kcp16V05SuppCrPrt;
  @CobolElement(cobolName = "KCP16V05-NO-OF-CR-TYPES", type = CobolType.ZONED_DECIMAL_ITEM, levelNumber = 9, isSigned = false, totalDigits = 1, picture = "9", srceLine = 60)
  protected int kcp16V05NoOfCrTypes;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP16V05-SUPP-LIST-CRTYPES", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 9, minOccurs = 9, maxOccurs = 9, picture = "X", srceLine = 62)
  protected List<String> kcp16V05SuppListCrtypes;

  /**
   * Gets the value of the kcp16V05SuppCrPrt property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp16V05SuppCrPrt()
    {
    return kcp16V05SuppCrPrt;
    }

  /**
   * Sets the value of the kcp16V05SuppCrPrt property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp16V05SuppCrPrt( String value )
    {
    this.kcp16V05SuppCrPrt = value;
    }

  /**
   * Gets the value of the kcp16V05NoOfCrTypes property.
   */
  public int getKcp16V05NoOfCrTypes()
    {
    return kcp16V05NoOfCrTypes;
    }

  /**
   * Sets the value of the kcp16V05NoOfCrTypes property.
   */
  public void setKcp16V05NoOfCrTypes( int value )
    {
    this.kcp16V05NoOfCrTypes = value;
    }

  /**
   * Gets the value of the kcp16V05SuppListCrtypes property.
   * <p/>
   * <p/>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the kcp16V05SuppListCrtypes property.
   * <p/>
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKcp16V05SuppListCrtypes().add(newItem);
   * </pre>
   * <p/>
   * <p/>
   * <p/>
   * Objects of the following type(s) are allowed in the list
   * {@link String }
   */
  public List<String> getKcp16V05SuppListCrtypes()
    {
    if( kcp16V05SuppListCrtypes == null )
      {
      kcp16V05SuppListCrtypes = new ArrayList<String>();
      }
    return this.kcp16V05SuppListCrtypes;
    }

  }
