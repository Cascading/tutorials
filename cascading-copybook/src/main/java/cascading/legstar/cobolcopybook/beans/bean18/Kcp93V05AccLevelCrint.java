package cascading.legstar.cobolcopybook.beans.bean18;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp93V05AccLevelCrint complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp93V05AccLevelCrint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp93V05AccLevelCrintTiers" type="{http://beans.cobolcopybook.legstar.cascading/bean18}Kcp93V05AccLevelCrintTiers"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp93V05AccLevelCrint", propOrder = {
  "kcp93V05AccLevelCrintTiers"
})
public class Kcp93V05AccLevelCrint
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP93V05-ACC-LEVEL-CRINT-TIERS", type = CobolType.GROUP_ITEM, levelNumber = 3, srceLine = 8)
  protected Kcp93V05AccLevelCrintTiers kcp93V05AccLevelCrintTiers;

  /**
   * Gets the value of the kcp93V05AccLevelCrintTiers property.
   *
   * @return possible object is
   * {@link Kcp93V05AccLevelCrintTiers }
   */
  public Kcp93V05AccLevelCrintTiers getKcp93V05AccLevelCrintTiers()
    {
    return kcp93V05AccLevelCrintTiers;
    }

  /**
   * Sets the value of the kcp93V05AccLevelCrintTiers property.
   *
   * @param value allowed object is
   *              {@link Kcp93V05AccLevelCrintTiers }
   */
  public void setKcp93V05AccLevelCrintTiers( Kcp93V05AccLevelCrintTiers value )
    {
    this.kcp93V05AccLevelCrintTiers = value;
    }

  }
