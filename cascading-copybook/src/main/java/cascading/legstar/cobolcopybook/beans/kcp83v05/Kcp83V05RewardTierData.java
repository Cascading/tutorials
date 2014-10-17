package cascading.legstar.cobolcopybook.beans.kcp83v05;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp83V05RewardTierData complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp83V05RewardTierData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp83V05RewardTierNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp83V05RewardFromValue">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp83V05RewardToValue">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="5"/>
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
@XmlType(name = "Kcp83V05RewardTierData", propOrder = {
  "kcp83V05RewardTierNumber",
  "kcp83V05RewardFromValue",
  "kcp83V05RewardToValue"
})
public class Kcp83V05RewardTierData
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @CobolElement(cobolName = "KCP83V05-REWARD-TIER-NUMBER", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 9, isSigned = true, totalDigits = 3, picture = "S999", usage = "PACKED-DECIMAL", srceLine = 14)
  protected short kcp83V05RewardTierNumber;
  @CobolElement(cobolName = "KCP83V05-REWARD-FROM-VALUE", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 9, isSigned = true, totalDigits = 5, picture = "S9(5)", usage = "PACKED-DECIMAL", srceLine = 16)
  protected int kcp83V05RewardFromValue;
  @CobolElement(cobolName = "KCP83V05-REWARD-TO-VALUE", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 9, isSigned = true, totalDigits = 5, picture = "S9(5)", usage = "PACKED-DECIMAL", srceLine = 18)
  protected int kcp83V05RewardToValue;

  /**
   * Gets the value of the kcp83V05RewardTierNumber property.
   */
  public short getKcp83V05RewardTierNumber()
    {
    return kcp83V05RewardTierNumber;
    }

  /**
   * Sets the value of the kcp83V05RewardTierNumber property.
   */
  public void setKcp83V05RewardTierNumber( short value )
    {
    this.kcp83V05RewardTierNumber = value;
    }

  /**
   * Gets the value of the kcp83V05RewardFromValue property.
   */
  public int getKcp83V05RewardFromValue()
    {
    return kcp83V05RewardFromValue;
    }

  /**
   * Sets the value of the kcp83V05RewardFromValue property.
   */
  public void setKcp83V05RewardFromValue( int value )
    {
    this.kcp83V05RewardFromValue = value;
    }

  /**
   * Gets the value of the kcp83V05RewardToValue property.
   */
  public int getKcp83V05RewardToValue()
    {
    return kcp83V05RewardToValue;
    }

  /**
   * Sets the value of the kcp83V05RewardToValue property.
   */
  public void setKcp83V05RewardToValue( int value )
    {
    this.kcp83V05RewardToValue = value;
    }

  }
