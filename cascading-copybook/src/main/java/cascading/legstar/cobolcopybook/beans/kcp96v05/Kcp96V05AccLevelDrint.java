package cascading.legstar.cobolcopybook.beans.kcp96v05;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp96V05AccLevelDrint complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp96V05AccLevelDrint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp96V05AccLevelDrintData" type="{http://beans.cobolcopybook.legstar.cascading/kcp96v05}Kcp96V05AccLevelDrintData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp96V05AccLevelDrint", propOrder = {
  "kcp96V05AccLevelDrintData"
})
public class Kcp96V05AccLevelDrint
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP96V05-ACC-LEVEL-DRINT-DATA", type = CobolType.GROUP_ITEM, levelNumber = 3, srceLine = 8)
  protected Kcp96V05AccLevelDrintData kcp96V05AccLevelDrintData;

  /**
   * Gets the value of the kcp96V05AccLevelDrintData property.
   *
   * @return possible object is
   * {@link Kcp96V05AccLevelDrintData }
   */
  public Kcp96V05AccLevelDrintData getKcp96V05AccLevelDrintData()
    {
    return kcp96V05AccLevelDrintData;
    }

  /**
   * Sets the value of the kcp96V05AccLevelDrintData property.
   *
   * @param value allowed object is
   *              {@link Kcp96V05AccLevelDrintData }
   */
  public void setKcp96V05AccLevelDrintData( Kcp96V05AccLevelDrintData value )
    {
    this.kcp96V05AccLevelDrintData = value;
    }

  }
