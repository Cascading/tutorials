package cascading.legstar.cobolcopybook.beans.bean20;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp96V05AccLevelDrintData complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp96V05AccLevelDrintData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp96V05CutOffInd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp96V05NoOfTiers2">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp96V05InterestLimitData" type="{http://beans.cobolcopybook.legstar.cascading/bean20}Kcp96V05InterestLimitData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp96V05AccLevelDrintData", propOrder = {"kcp96V05CutOffInd", "kcp96V05NoOfTiers2", "kcp96V05InterestLimitData"})
public class Kcp96V05AccLevelDrintData implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP96V05-CUT-OFF-IND", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X", srceLine = 9)
  protected String kcp96V05CutOffInd;
  @CobolElement(cobolName = "KCP96V05-NO-OF-TIERS2", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 3, picture = "S999", usage = "PACKED-DECIMAL", srceLine = 11)
  protected short kcp96V05NoOfTiers2;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP96V05-INTEREST-LIMIT-DATA", type = CobolType.GROUP_ITEM, levelNumber = 5, srceLine = 13)
  protected Kcp96V05InterestLimitData kcp96V05InterestLimitData;

  /**
   * Gets the value of the kcp96V05CutOffInd property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp96V05CutOffInd()
    {
    return kcp96V05CutOffInd;
    }

  /**
   * Sets the value of the kcp96V05CutOffInd property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp96V05CutOffInd( String value )
    {
    this.kcp96V05CutOffInd = value;
    }

  /**
   * Gets the value of the kcp96V05NoOfTiers2 property.
   */
  public short getKcp96V05NoOfTiers2()
    {
    return kcp96V05NoOfTiers2;
    }

  /**
   * Sets the value of the kcp96V05NoOfTiers2 property.
   */
  public void setKcp96V05NoOfTiers2( short value )
    {
    this.kcp96V05NoOfTiers2 = value;
    }

  /**
   * Gets the value of the kcp96V05InterestLimitData property.
   *
   * @return possible object is
   * {@link Kcp96V05InterestLimitData }
   */
  public Kcp96V05InterestLimitData getKcp96V05InterestLimitData()
    {
    return kcp96V05InterestLimitData;
    }

  /**
   * Sets the value of the kcp96V05InterestLimitData property.
   *
   * @param value allowed object is
   *              {@link Kcp96V05InterestLimitData }
   */
  public void setKcp96V05InterestLimitData( Kcp96V05InterestLimitData value )
    {
    this.kcp96V05InterestLimitData = value;
    }

  }
