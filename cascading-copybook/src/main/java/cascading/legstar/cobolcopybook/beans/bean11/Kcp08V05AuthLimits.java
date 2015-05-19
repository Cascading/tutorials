package cascading.legstar.cobolcopybook.beans.bean11;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp08V05AuthLimits complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp08V05AuthLimits">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp08V05AuthLimitData" type="{http://beans.cobolcopybook.legstar.cascading/bean11}Kcp08V05AuthLimitData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp08V05AuthLimits", propOrder = {"kcp08V05AuthLimitData"})
public class Kcp08V05AuthLimits implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP08V05-AUTH-LIMIT-DATA", type = CobolType.GROUP_ITEM, levelNumber = 3, srceLine = 8)
  protected Kcp08V05AuthLimitData kcp08V05AuthLimitData;

  /**
   * Gets the value of the kcp08V05AuthLimitData property.
   *
   * @return possible object is
   * {@link Kcp08V05AuthLimitData }
   */
  public Kcp08V05AuthLimitData getKcp08V05AuthLimitData()
    {
    return kcp08V05AuthLimitData;
    }

  /**
   * Sets the value of the kcp08V05AuthLimitData property.
   *
   * @param value allowed object is
   *              {@link Kcp08V05AuthLimitData }
   */
  public void setKcp08V05AuthLimitData( Kcp08V05AuthLimitData value )
    {
    this.kcp08V05AuthLimitData = value;
    }

  }
