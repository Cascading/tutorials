package cascading.legstar.cobolcopybook.beans.bean19;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp94V05AccLevelCrint complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp94V05AccLevelCrint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp94V05AccLevelCrintData" type="{http://beans.cobolcopybook.legstar.cascading/bean19}Kcp94V05AccLevelCrintData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp94V05AccLevelCrint", propOrder = {
  "kcp94V05AccLevelCrintData"
})
public class Kcp94V05AccLevelCrint
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP94V05-ACC-LEVEL-CRINT-DATA", type = CobolType.GROUP_ITEM, levelNumber = 3, srceLine = 8)
  protected Kcp94V05AccLevelCrintData kcp94V05AccLevelCrintData;

  /**
   * Gets the value of the kcp94V05AccLevelCrintData property.
   *
   * @return possible object is
   * {@link Kcp94V05AccLevelCrintData }
   */
  public Kcp94V05AccLevelCrintData getKcp94V05AccLevelCrintData()
    {
    return kcp94V05AccLevelCrintData;
    }

  /**
   * Sets the value of the kcp94V05AccLevelCrintData property.
   *
   * @param value allowed object is
   *              {@link Kcp94V05AccLevelCrintData }
   */
  public void setKcp94V05AccLevelCrintData( Kcp94V05AccLevelCrintData value )
    {
    this.kcp94V05AccLevelCrintData = value;
    }

  }
