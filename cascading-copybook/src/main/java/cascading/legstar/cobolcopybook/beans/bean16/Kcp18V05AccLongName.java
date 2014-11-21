package cascading.legstar.cobolcopybook.beans.bean16;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp18V05AccLongName complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp18V05AccLongName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp18V05LongNameData" type="{http://beans.cobolcopybook.legstar.cascading/bean16}Kcp18V05LongNameData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp18V05AccLongName", propOrder = {
  "kcp18V05LongNameData"
})
public class Kcp18V05AccLongName
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP18V05-LONG-NAME-DATA", type = CobolType.GROUP_ITEM, levelNumber = 3, srceLine = 8)
  protected Kcp18V05LongNameData kcp18V05LongNameData;

  /**
   * Gets the value of the kcp18V05LongNameData property.
   *
   * @return possible object is
   * {@link Kcp18V05LongNameData }
   */
  public Kcp18V05LongNameData getKcp18V05LongNameData()
    {
    return kcp18V05LongNameData;
    }

  /**
   * Sets the value of the kcp18V05LongNameData property.
   *
   * @param value allowed object is
   *              {@link Kcp18V05LongNameData }
   */
  public void setKcp18V05LongNameData( Kcp18V05LongNameData value )
    {
    this.kcp18V05LongNameData = value;
    }

  }
