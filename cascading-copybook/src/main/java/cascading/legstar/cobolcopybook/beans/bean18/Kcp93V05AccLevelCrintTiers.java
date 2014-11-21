package cascading.legstar.cobolcopybook.beans.bean18;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp93V05AccLevelCrintTiers complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp93V05AccLevelCrintTiers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp93V05CutOffInd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp93V05NoOfTiers2">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp93V05InterestLimitData" type="{http://beans.cobolcopybook.legstar.cascading/bean18}Kcp93V05InterestLimitData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp93V05AccLevelCrintTiers", propOrder = {
  "kcp93V05CutOffInd",
  "kcp93V05NoOfTiers2",
  "kcp93V05InterestLimitData"
})
public class Kcp93V05AccLevelCrintTiers
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP93V05-CUT-OFF-IND", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X", srceLine = 9)
  protected String kcp93V05CutOffInd;
  @CobolElement(cobolName = "KCP93V05-NO-OF-TIERS2", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 3, picture = "S999", usage = "PACKED-DECIMAL", srceLine = 11)
  protected short kcp93V05NoOfTiers2;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP93V05-INTEREST-LIMIT-DATA", type = CobolType.GROUP_ITEM, levelNumber = 5, srceLine = 13)
  protected Kcp93V05InterestLimitData kcp93V05InterestLimitData;

  /**
   * Gets the value of the kcp93V05CutOffInd property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp93V05CutOffInd()
    {
    return kcp93V05CutOffInd;
    }

  /**
   * Sets the value of the kcp93V05CutOffInd property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp93V05CutOffInd( String value )
    {
    this.kcp93V05CutOffInd = value;
    }

  /**
   * Gets the value of the kcp93V05NoOfTiers2 property.
   */
  public short getKcp93V05NoOfTiers2()
    {
    return kcp93V05NoOfTiers2;
    }

  /**
   * Sets the value of the kcp93V05NoOfTiers2 property.
   */
  public void setKcp93V05NoOfTiers2( short value )
    {
    this.kcp93V05NoOfTiers2 = value;
    }

  /**
   * Gets the value of the kcp93V05InterestLimitData property.
   *
   * @return possible object is
   * {@link Kcp93V05InterestLimitData }
   */
  public Kcp93V05InterestLimitData getKcp93V05InterestLimitData()
    {
    return kcp93V05InterestLimitData;
    }

  /**
   * Sets the value of the kcp93V05InterestLimitData property.
   *
   * @param value allowed object is
   *              {@link Kcp93V05InterestLimitData }
   */
  public void setKcp93V05InterestLimitData( Kcp93V05InterestLimitData value )
    {
    this.kcp93V05InterestLimitData = value;
    }

  }
