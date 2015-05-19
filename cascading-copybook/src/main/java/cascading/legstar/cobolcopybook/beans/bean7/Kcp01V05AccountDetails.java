package cascading.legstar.cobolcopybook.beans.bean7;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp01V05AccountDetails complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp01V05AccountDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp01V05BankAccountData" type="{http://beans.cobolcopybook.legstar.cascading/bean7}Kcp01V05BankAccountData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp01V05AccountDetails", propOrder = {"kcp01V05BankAccountData"})
public class Kcp01V05AccountDetails implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP01V05-BANK-ACCOUNT-DATA", type = CobolType.GROUP_ITEM, levelNumber = 3, srceLine = 8)
  protected Kcp01V05BankAccountData kcp01V05BankAccountData;

  /**
   * Gets the value of the kcp01V05BankAccountData property.
   *
   * @return possible object is
   * {@link Kcp01V05BankAccountData }
   */
  public Kcp01V05BankAccountData getKcp01V05BankAccountData()
    {
    return kcp01V05BankAccountData;
    }

  /**
   * Sets the value of the kcp01V05BankAccountData property.
   *
   * @param value allowed object is
   *              {@link Kcp01V05BankAccountData }
   */
  public void setKcp01V05BankAccountData( Kcp01V05BankAccountData value )
    {
    this.kcp01V05BankAccountData = value;
    }

  }
