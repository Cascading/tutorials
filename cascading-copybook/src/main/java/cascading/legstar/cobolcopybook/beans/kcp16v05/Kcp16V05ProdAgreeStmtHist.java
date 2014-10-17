package cascading.legstar.cobolcopybook.beans.kcp16v05;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp16V05ProdAgreeStmtHist complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp16V05ProdAgreeStmtHist">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp16V05StatementHistData" type="{http://beans.cobolcopybook.legstar.cascading/kcp16v05}Kcp16V05StatementHistData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Kcp16V05ProdAgreeStmtHist", propOrder = {
  "kcp16V05StatementHistData"
})
public class Kcp16V05ProdAgreeStmtHist
  implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP16V05-STATEMENT-HIST-DATA", type = CobolType.GROUP_ITEM, levelNumber = 3, srceLine = 8)
  protected Kcp16V05StatementHistData kcp16V05StatementHistData;

  /**
   * Gets the value of the kcp16V05StatementHistData property.
   *
   * @return possible object is
   * {@link Kcp16V05StatementHistData }
   */
  public Kcp16V05StatementHistData getKcp16V05StatementHistData()
    {
    return kcp16V05StatementHistData;
    }

  /**
   * Sets the value of the kcp16V05StatementHistData property.
   *
   * @param value allowed object is
   *              {@link Kcp16V05StatementHistData }
   */
  public void setKcp16V05StatementHistData( Kcp16V05StatementHistData value )
    {
    this.kcp16V05StatementHistData = value;
    }

  }
