package cascading.legstar.cobolcopybook.beans.bean1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for BdfoCommonData complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="BdfoCommonData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bdfoLen">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="bdfoKey">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="13"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="bdfoParmNo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
 *               &lt;totalDigits value="3"/>
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
@XmlType(name = "BdfoCommonData", propOrder = {
  "bdfoLen",
  "bdfoKey",
  "bdfoParmNo"
})
public class BdfoCommonData
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @CobolElement(cobolName = "BDFO-LEN", type = CobolType.BINARY_ITEM, levelNumber = 5, isSigned = true, totalDigits = 4, picture = "S9999", usage = "BINARY", srceLine = 6)
  protected short bdfoLen;
  @CobolElement(cobolName = "BDFO-KEY", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 13, picture = "S9(13)", usage = "PACKED-DECIMAL", srceLine = 7)
  protected long bdfoKey;
  @CobolElement(cobolName = "BDFO-PARM-NO", type = CobolType.ZONED_DECIMAL_ITEM, levelNumber = 5, isSigned = false, totalDigits = 3, picture = "999", srceLine = 8)
  protected int bdfoParmNo;

  /**
   * Gets the value of the bdfoLen property.
   */
  public short getBdfoLen()
    {
    return bdfoLen;
    }

  /**
   * Sets the value of the bdfoLen property.
   */
  public void setBdfoLen( short value )
    {
    this.bdfoLen = value;
    }

  /**
   * Gets the value of the bdfoKey property.
   */
  public long getBdfoKey()
    {
    return bdfoKey;
    }

  /**
   * Sets the value of the bdfoKey property.
   */
  public void setBdfoKey( long value )
    {
    this.bdfoKey = value;
    }

  /**
   * Gets the value of the bdfoParmNo property.
   */
  public int getBdfoParmNo()
    {
    return bdfoParmNo;
    }

  /**
   * Sets the value of the bdfoParmNo property.
   */
  public void setBdfoParmNo( int value )
    {
    this.bdfoParmNo = value;
    }

  }
