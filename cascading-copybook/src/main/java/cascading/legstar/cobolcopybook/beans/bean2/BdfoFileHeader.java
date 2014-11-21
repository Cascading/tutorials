package cascading.legstar.cobolcopybook.beans.bean2;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for BdfoFileHeader complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="BdfoFileHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bdfoRundate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="bdfoFileId">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="bdfoCentreId">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="bdfoSbiFileInd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="bdfoDenReturned">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="3"/>
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
@XmlType(name = "BdfoFileHeader", propOrder = {
  "bdfoRundate",
  "bdfoFileId",
  "bdfoCentreId",
  "bdfoSbiFileInd",
  "bdfoDenReturned"
})
public class BdfoFileHeader
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "BDFO-RUNDATE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "XX", srceLine = 6)
  protected String bdfoRundate;
  @XmlElement(required = true)
  @CobolElement(cobolName = "BDFO-FILE-ID", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(8)", srceLine = 7)
  protected String bdfoFileId;
  @XmlElement(required = true)
  @CobolElement(cobolName = "BDFO-CENTRE-ID", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X", srceLine = 8)
  protected String bdfoCentreId;
  @XmlElement(required = true)
  @CobolElement(cobolName = "BDFO-SBI-FILE-IND", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(50)", srceLine = 9)
  protected String bdfoSbiFileInd;
  @XmlElement(required = true)
  @CobolElement(cobolName = "BDFO-DEN-RETURNED", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "XXX", srceLine = 10)
  protected String bdfoDenReturned;

  /**
   * Gets the value of the bdfoRundate property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getBdfoRundate()
    {
    return bdfoRundate;
    }

  /**
   * Sets the value of the bdfoRundate property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setBdfoRundate( String value )
    {
    this.bdfoRundate = value;
    }

  /**
   * Gets the value of the bdfoFileId property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getBdfoFileId()
    {
    return bdfoFileId;
    }

  /**
   * Sets the value of the bdfoFileId property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setBdfoFileId( String value )
    {
    this.bdfoFileId = value;
    }

  /**
   * Gets the value of the bdfoCentreId property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getBdfoCentreId()
    {
    return bdfoCentreId;
    }

  /**
   * Sets the value of the bdfoCentreId property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setBdfoCentreId( String value )
    {
    this.bdfoCentreId = value;
    }

  /**
   * Gets the value of the bdfoSbiFileInd property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getBdfoSbiFileInd()
    {
    return bdfoSbiFileInd;
    }

  /**
   * Sets the value of the bdfoSbiFileInd property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setBdfoSbiFileInd( String value )
    {
    this.bdfoSbiFileInd = value;
    }

  /**
   * Gets the value of the bdfoDenReturned property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getBdfoDenReturned()
    {
    return bdfoDenReturned;
    }

  /**
   * Sets the value of the bdfoDenReturned property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setBdfoDenReturned( String value )
    {
    this.bdfoDenReturned = value;
    }

  }
