package cascading.legstar.cobolcopybook.beans.bean9;

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
 * <p>Java class for Kcp05V10Profile3Dgts complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp05V10Profile3Dgts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp05V10Prof0112" maxOccurs="12" minOccurs="12">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="3"/>
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
@XmlType(name = "Kcp05V10Profile3Dgts", propOrder = {
  "kcp05V10Prof0112"
})
public class Kcp05V10Profile3Dgts
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(type = Short.class)
  @CobolElement(cobolName = "KCP05V10-PROF-01-12", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 9, isSigned = true, totalDigits = 3, minOccurs = 12, maxOccurs = 12, picture = "S999", usage = "PACKED-DECIMAL", srceLine = 16)
  protected List<Short> kcp05V10Prof0112;

  /**
   * Gets the value of the kcp05V10Prof0112 property.
   * <p/>
   * <p/>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the kcp05V10Prof0112 property.
   * <p/>
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKcp05V10Prof0112().add(newItem);
   * </pre>
   * <p/>
   * <p/>
   * <p/>
   * Objects of the following type(s) are allowed in the list
   * {@link Short }
   */
  public List<Short> getKcp05V10Prof0112()
    {
    if( kcp05V10Prof0112 == null )
      {
      kcp05V10Prof0112 = new ArrayList<Short>();
      }
    return this.kcp05V10Prof0112;
    }

  }
