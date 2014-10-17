package cascading.legstar.cobolcopybook.beans.kcp05v10;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp05V10ProfileMarkers complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp05V10ProfileMarkers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp05V10Profile3Dgts" type="{http://beans.cobolcopybook.legstar.cascading/kcp05v10}Kcp05V10Profile3Dgts"/>
 *         &lt;element name="kcp05V10Profile5Dgts" type="{http://beans.cobolcopybook.legstar.cascading/kcp05v10}Kcp05V10Profile5Dgts"/>
 *         &lt;element name="kcp05V10Profile7Dgts" type="{http://beans.cobolcopybook.legstar.cascading/kcp05v10}Kcp05V10Profile7Dgts"/>
 *         &lt;element name="kcp05V10Profile1Dgts" type="{http://beans.cobolcopybook.legstar.cascading/kcp05v10}Kcp05V10Profile1Dgts"/>
 *         &lt;element name="kcp05V10Profile2Nd7Dgts" type="{http://beans.cobolcopybook.legstar.cascading/kcp05v10}Kcp05V10Profile2Nd7Dgts"/>
 *         &lt;element name="kcp05V10Profile3Rd7Dgts" type="{http://beans.cobolcopybook.legstar.cascading/kcp05v10}Kcp05V10Profile3Rd7Dgts"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp05V10ProfileMarkers", propOrder = {
  "kcp05V10Profile3Dgts",
  "kcp05V10Profile5Dgts",
  "kcp05V10Profile7Dgts",
  "kcp05V10Profile1Dgts",
  "kcp05V10Profile2Nd7Dgts",
  "kcp05V10Profile3Rd7Dgts"
})
public class Kcp05V10ProfileMarkers
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP05V10-PROFILE-3DGTS", type = CobolType.GROUP_ITEM, levelNumber = 7, srceLine = 15)
  protected Kcp05V10Profile3Dgts kcp05V10Profile3Dgts;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP05V10-PROFILE-5DGTS", type = CobolType.GROUP_ITEM, levelNumber = 7, srceLine = 20)
  protected Kcp05V10Profile5Dgts kcp05V10Profile5Dgts;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP05V10-PROFILE-7DGTS", type = CobolType.GROUP_ITEM, levelNumber = 7, srceLine = 25)
  protected Kcp05V10Profile7Dgts kcp05V10Profile7Dgts;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP05V10-PROFILE-1DGTS", type = CobolType.GROUP_ITEM, levelNumber = 7, srceLine = 30)
  protected Kcp05V10Profile1Dgts kcp05V10Profile1Dgts;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP05V10-PROFILE-2ND-7DGTS", type = CobolType.GROUP_ITEM, levelNumber = 7, srceLine = 35)
  protected Kcp05V10Profile2Nd7Dgts kcp05V10Profile2Nd7Dgts;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP05V10-PROFILE-3RD-7DGTS", type = CobolType.GROUP_ITEM, levelNumber = 7, srceLine = 40)
  protected Kcp05V10Profile3Rd7Dgts kcp05V10Profile3Rd7Dgts;

  /**
   * Gets the value of the kcp05V10Profile3Dgts property.
   *
   * @return possible object is
   * {@link Kcp05V10Profile3Dgts }
   */
  public Kcp05V10Profile3Dgts getKcp05V10Profile3Dgts()
    {
    return kcp05V10Profile3Dgts;
    }

  /**
   * Sets the value of the kcp05V10Profile3Dgts property.
   *
   * @param value allowed object is
   *              {@link Kcp05V10Profile3Dgts }
   */
  public void setKcp05V10Profile3Dgts( Kcp05V10Profile3Dgts value )
    {
    this.kcp05V10Profile3Dgts = value;
    }

  /**
   * Gets the value of the kcp05V10Profile5Dgts property.
   *
   * @return possible object is
   * {@link Kcp05V10Profile5Dgts }
   */
  public Kcp05V10Profile5Dgts getKcp05V10Profile5Dgts()
    {
    return kcp05V10Profile5Dgts;
    }

  /**
   * Sets the value of the kcp05V10Profile5Dgts property.
   *
   * @param value allowed object is
   *              {@link Kcp05V10Profile5Dgts }
   */
  public void setKcp05V10Profile5Dgts( Kcp05V10Profile5Dgts value )
    {
    this.kcp05V10Profile5Dgts = value;
    }

  /**
   * Gets the value of the kcp05V10Profile7Dgts property.
   *
   * @return possible object is
   * {@link Kcp05V10Profile7Dgts }
   */
  public Kcp05V10Profile7Dgts getKcp05V10Profile7Dgts()
    {
    return kcp05V10Profile7Dgts;
    }

  /**
   * Sets the value of the kcp05V10Profile7Dgts property.
   *
   * @param value allowed object is
   *              {@link Kcp05V10Profile7Dgts }
   */
  public void setKcp05V10Profile7Dgts( Kcp05V10Profile7Dgts value )
    {
    this.kcp05V10Profile7Dgts = value;
    }

  /**
   * Gets the value of the kcp05V10Profile1Dgts property.
   *
   * @return possible object is
   * {@link Kcp05V10Profile1Dgts }
   */
  public Kcp05V10Profile1Dgts getKcp05V10Profile1Dgts()
    {
    return kcp05V10Profile1Dgts;
    }

  /**
   * Sets the value of the kcp05V10Profile1Dgts property.
   *
   * @param value allowed object is
   *              {@link Kcp05V10Profile1Dgts }
   */
  public void setKcp05V10Profile1Dgts( Kcp05V10Profile1Dgts value )
    {
    this.kcp05V10Profile1Dgts = value;
    }

  /**
   * Gets the value of the kcp05V10Profile2Nd7Dgts property.
   *
   * @return possible object is
   * {@link Kcp05V10Profile2Nd7Dgts }
   */
  public Kcp05V10Profile2Nd7Dgts getKcp05V10Profile2Nd7Dgts()
    {
    return kcp05V10Profile2Nd7Dgts;
    }

  /**
   * Sets the value of the kcp05V10Profile2Nd7Dgts property.
   *
   * @param value allowed object is
   *              {@link Kcp05V10Profile2Nd7Dgts }
   */
  public void setKcp05V10Profile2Nd7Dgts( Kcp05V10Profile2Nd7Dgts value )
    {
    this.kcp05V10Profile2Nd7Dgts = value;
    }

  /**
   * Gets the value of the kcp05V10Profile3Rd7Dgts property.
   *
   * @return possible object is
   * {@link Kcp05V10Profile3Rd7Dgts }
   */
  public Kcp05V10Profile3Rd7Dgts getKcp05V10Profile3Rd7Dgts()
    {
    return kcp05V10Profile3Rd7Dgts;
    }

  /**
   * Sets the value of the kcp05V10Profile3Rd7Dgts property.
   *
   * @param value allowed object is
   *              {@link Kcp05V10Profile3Rd7Dgts }
   */
  public void setKcp05V10Profile3Rd7Dgts( Kcp05V10Profile3Rd7Dgts value )
    {
    this.kcp05V10Profile3Rd7Dgts = value;
    }

  }
