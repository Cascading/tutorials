package cascading.legstar.cobolcopybook.beans.bean16;

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
 * <p>Java class for Kcp18V05LongNameData complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp18V05LongNameData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp18V05NoOfLongNames">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;totalDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp18V05LnameData" type="{http://beans.cobolcopybook.legstar.cascading/bean16}Kcp18V05LnameData" maxOccurs="10" minOccurs="10"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp18V05LongNameData", propOrder = {"kcp18V05NoOfLongNames", "kcp18V05LnameData"})
public class Kcp18V05LongNameData implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @CobolElement(cobolName = "KCP18V05-NO-OF-LONG-NAMES", type = CobolType.ZONED_DECIMAL_ITEM, levelNumber = 5, isSigned = false, totalDigits = 2, isODOObject = true, picture = "99", srceLine = 9)
  protected int kcp18V05NoOfLongNames;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP18V05-LNAME-DATA", type = CobolType.GROUP_ITEM, levelNumber = 5, minOccurs = -1, maxOccurs = 10, dependingOn = "KCP18V05-NO-OF-LONG-NAMES", srceLine = 11)
  protected List<Kcp18V05LnameData> kcp18V05LnameData;

  /**
   * Gets the value of the kcp18V05NoOfLongNames property.
   */
  public int getKcp18V05NoOfLongNames()
    {
    return kcp18V05NoOfLongNames;
    }

  /**
   * Sets the value of the kcp18V05NoOfLongNames property.
   */
  public void setKcp18V05NoOfLongNames( int value )
    {
    this.kcp18V05NoOfLongNames = value;
    }

  /**
   * Gets the value of the kcp18V05LnameData property.
   * <p/>
   * <p/>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the kcp18V05LnameData property.
   * <p/>
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKcp18V05LnameData().add(newItem);
   * </pre>
   * <p/>
   * <p/>
   * <p/>
   * Objects of the following type(s) are allowed in the list
   * {@link Kcp18V05LnameData }
   */
  public List<Kcp18V05LnameData> getKcp18V05LnameData()
    {
    if( kcp18V05LnameData == null )
      {
      kcp18V05LnameData = new ArrayList<Kcp18V05LnameData>();
      }
    return this.kcp18V05LnameData;
    }

  }
