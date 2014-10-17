package cascading.legstar.cobolcopybook.beans.abbdfot;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for BdfoFileTrailer complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="BdfoFileTrailer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bdfoFileTally">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="bdfoFileHash">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="bdfoNumAccountsSelected">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="9"/>
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
@XmlType(name = "BdfoFileTrailer", propOrder = {
  "bdfoFileTally",
  "bdfoFileHash",
  "bdfoNumAccountsSelected"
})
public class BdfoFileTrailer
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @CobolElement(cobolName = "BDFO-FILE-TALLY", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 9, picture = "S9(9)", usage = "PACKED-DECIMAL", srceLine = 6)
  protected int bdfoFileTally;
  @CobolElement(cobolName = "BDFO-FILE-HASH", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 9, picture = "S9(9)", usage = "PACKED-DECIMAL", srceLine = 7)
  protected int bdfoFileHash;
  @CobolElement(cobolName = "BDFO-NUM-ACCOUNTS-SELECTED", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 9, picture = "S9(9)", usage = "PACKED-DECIMAL", srceLine = 8)
  protected int bdfoNumAccountsSelected;

  /**
   * Gets the value of the bdfoFileTally property.
   */
  public int getBdfoFileTally()
    {
    return bdfoFileTally;
    }

  /**
   * Sets the value of the bdfoFileTally property.
   */
  public void setBdfoFileTally( int value )
    {
    this.bdfoFileTally = value;
    }

  /**
   * Gets the value of the bdfoFileHash property.
   */
  public int getBdfoFileHash()
    {
    return bdfoFileHash;
    }

  /**
   * Sets the value of the bdfoFileHash property.
   */
  public void setBdfoFileHash( int value )
    {
    this.bdfoFileHash = value;
    }

  /**
   * Gets the value of the bdfoNumAccountsSelected property.
   */
  public int getBdfoNumAccountsSelected()
    {
    return bdfoNumAccountsSelected;
    }

  /**
   * Sets the value of the bdfoNumAccountsSelected property.
   */
  public void setBdfoNumAccountsSelected( int value )
    {
    this.bdfoNumAccountsSelected = value;
    }

  }
