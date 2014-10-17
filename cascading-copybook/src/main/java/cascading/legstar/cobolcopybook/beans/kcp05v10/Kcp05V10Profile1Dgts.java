package cascading.legstar.cobolcopybook.beans.kcp05v10;

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
 * <p>Java class for Kcp05V10Profile1Dgts complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp05V10Profile1Dgts">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp05V10Prof3049" maxOccurs="20" minOccurs="20">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="1"/>
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
@XmlType(name = "Kcp05V10Profile1Dgts", propOrder = {
  "kcp05V10Prof3049"
})
public class Kcp05V10Profile1Dgts
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(type = Short.class)
  @CobolElement(cobolName = "KCP05V10-PROF-30-49", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 9, isSigned = true, totalDigits = 1, minOccurs = 20, maxOccurs = 20, picture = "S9", usage = "PACKED-DECIMAL", srceLine = 31)
  protected List<Short> kcp05V10Prof3049;

  /**
   * Gets the value of the kcp05V10Prof3049 property.
   * <p/>
   * <p/>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the kcp05V10Prof3049 property.
   * <p/>
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getKcp05V10Prof3049().add(newItem);
   * </pre>
   * <p/>
   * <p/>
   * <p/>
   * Objects of the following type(s) are allowed in the list
   * {@link Short }
   */
  public List<Short> getKcp05V10Prof3049()
    {
    if( kcp05V10Prof3049 == null )
      {
      kcp05V10Prof3049 = new ArrayList<Short>();
      }
    return this.kcp05V10Prof3049;
    }

  }
