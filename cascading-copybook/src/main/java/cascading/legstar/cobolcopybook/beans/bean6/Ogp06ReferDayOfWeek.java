package cascading.legstar.cobolcopybook.beans.bean6;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Ogp06ReferDayOfWeek complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Ogp06ReferDayOfWeek">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ogp06ReferFreqDaysDue">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
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
@XmlType(name = "Ogp06ReferDayOfWeek", propOrder = {"ogp06ReferFreqDaysDue"})
public class Ogp06ReferDayOfWeek implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "OGP06-REFER-FREQ-DAYS-DUE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 7, picture = "X", srceLine = 21)
  protected String ogp06ReferFreqDaysDue;

  /**
   * Gets the value of the ogp06ReferFreqDaysDue property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getOgp06ReferFreqDaysDue()
    {
    return ogp06ReferFreqDaysDue;
    }

  /**
   * Sets the value of the ogp06ReferFreqDaysDue property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setOgp06ReferFreqDaysDue( String value )
    {
    this.ogp06ReferFreqDaysDue = value;
    }

  }
