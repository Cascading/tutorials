package cascading.legstar.cobolcopybook.beans.bean7;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for Kcp01V05BankAccountData complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="Kcp01V05BankAccountData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kcp01V05Sname">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05Busclass">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05Satind">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05ProductId">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05Genname">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05Actname">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05Chtname">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05SnameCode">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05CorpDiv">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05ApplicationScore">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05InsOnDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05InsChgDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05FxdTermStartDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05FxdTermEndDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05StudOff">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05BcrNpfInd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05AlwaysRep">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05ActualRenDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05RenewDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05Excess">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05MthlyDaysExcess">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="filler42" maxOccurs="2" minOccurs="2">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05SameDayEnt">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;totalDigits value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05LstDrDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05LstCrDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05StatsToGrp">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05BicIndclass">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05StaffNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05FirstCrIntDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05LastConsDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05BranchShortName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05Birthdate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05Birthdate2">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05NationalInsuranNo1" type="{http://beans.cobolcopybook.legstar.cascading/bean7}Kcp01V05NationalInsuranNo1"/>
 *         &lt;element name="kcp01V05NationalInsuranNo2" type="{http://beans.cobolcopybook.legstar.cascading/bean7}Kcp01V05NationalInsuranNo2"/>
 *         &lt;element name="kcp01V05CloseAccountBal">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="13"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05ExpManInd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05SensAccInd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05ChosenName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="25"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05PooledOffsetInd">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kcp01V05PooledBal">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="11"/>
 *               &lt;fractionDigits value="2"/>
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
@XmlType(name = "Kcp01V05BankAccountData", propOrder = {"kcp01V05Sname", "kcp01V05Busclass", "kcp01V05Satind", "kcp01V05ProductId", "kcp01V05Genname", "kcp01V05Actname", "kcp01V05Chtname", "kcp01V05SnameCode", "kcp01V05CorpDiv", "kcp01V05ApplicationScore", "kcp01V05InsOnDate", "kcp01V05InsChgDate", "kcp01V05FxdTermStartDate", "kcp01V05FxdTermEndDate", "kcp01V05StudOff", "kcp01V05BcrNpfInd", "kcp01V05AlwaysRep", "kcp01V05ActualRenDate", "kcp01V05RenewDate", "kcp01V05Excess", "kcp01V05MthlyDaysExcess", "filler42", "kcp01V05SameDayEnt", "kcp01V05LstDrDate", "kcp01V05LstCrDate", "kcp01V05StatsToGrp", "kcp01V05BicIndclass", "kcp01V05StaffNumber", "kcp01V05FirstCrIntDate", "kcp01V05LastConsDate", "kcp01V05BranchShortName", "kcp01V05Birthdate", "kcp01V05Birthdate2", "kcp01V05NationalInsuranNo1", "kcp01V05NationalInsuranNo2", "kcp01V05CloseAccountBal", "kcp01V05ExpManInd", "kcp01V05SensAccInd", "kcp01V05ChosenName", "kcp01V05PooledOffsetInd", "kcp01V05PooledBal"})
public class Kcp01V05BankAccountData implements Serializable
  {

  private final static long serialVersionUID = 1L;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP01V05-SNAME", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(20)", srceLine = 9)
  protected String kcp01V05Sname;
  @CobolElement(cobolName = "KCP01V05-BUSCLASS", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 3, picture = "S999", usage = "PACKED-DECIMAL", srceLine = 10)
  protected short kcp01V05Busclass;
  @CobolElement(cobolName = "KCP01V05-SATIND", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 3, picture = "S999", usage = "PACKED-DECIMAL", srceLine = 11)
  protected short kcp01V05Satind;
  @CobolElement(cobolName = "KCP01V05-PRODUCT-ID", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 5, picture = "S9(5)", usage = "PACKED-DECIMAL", srceLine = 12)
  protected int kcp01V05ProductId;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP01V05-GENNAME", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(20)", srceLine = 14)
  protected String kcp01V05Genname;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP01V05-ACTNAME", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(15)", srceLine = 15)
  protected String kcp01V05Actname;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP01V05-CHTNAME", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(15)", srceLine = 16)
  protected String kcp01V05Chtname;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP01V05-SNAME-CODE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "XXXX", srceLine = 17)
  protected String kcp01V05SnameCode;
  @CobolElement(cobolName = "KCP01V05-CORP-DIV", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 3, picture = "S999", usage = "PACKED-DECIMAL", srceLine = 19)
  protected short kcp01V05CorpDiv;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP01V05-APPLICATION-SCORE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(11)", srceLine = 20)
  protected String kcp01V05ApplicationScore;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP01V05-INS-ON-DATE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "XX", srceLine = 22)
  protected String kcp01V05InsOnDate;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP01V05-INS-CHG-DATE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "XX", srceLine = 24)
  protected String kcp01V05InsChgDate;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP01V05-FXD-TERM-START-DATE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "XX", srceLine = 26)
  protected String kcp01V05FxdTermStartDate;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP01V05-FXD-TERM-END-DATE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "XX", srceLine = 28)
  protected String kcp01V05FxdTermEndDate;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP01V05-STUD-OFF", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "XX", srceLine = 30)
  protected String kcp01V05StudOff;
  @CobolElement(cobolName = "KCP01V05-BCR-NPF-IND", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 1, picture = "S9", usage = "PACKED-DECIMAL", srceLine = 31)
  protected short kcp01V05BcrNpfInd;
  @CobolElement(cobolName = "KCP01V05-ALWAYS-REP", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 1, picture = "S9", usage = "PACKED-DECIMAL", srceLine = 33)
  protected short kcp01V05AlwaysRep;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP01V05-ACTUAL-REN-DATE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "XX", srceLine = 35)
  protected String kcp01V05ActualRenDate;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP01V05-RENEW-DATE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "XX", srceLine = 37)
  protected String kcp01V05RenewDate;
  @CobolElement(cobolName = "KCP01V05-EXCESS", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 3, picture = "S999", usage = "PACKED-DECIMAL", srceLine = 39)
  protected short kcp01V05Excess;
  @CobolElement(cobolName = "KCP01V05-MTHLY-DAYS-EXCESS", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 3, picture = "S999", usage = "PACKED-DECIMAL", srceLine = 40)
  protected short kcp01V05MthlyDaysExcess;
  @XmlElement(required = true)
  @CobolElement(cobolName = "FILLER", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, minOccurs = 2, maxOccurs = 2, picture = "X", srceLine = 42)
  protected List<String> filler42;
  @CobolElement(cobolName = "KCP01V05-SAME-DAY-ENT", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 11, picture = "S9(11)", usage = "PACKED-DECIMAL", srceLine = 44)
  protected long kcp01V05SameDayEnt;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP01V05-LST-DR-DATE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "XX", srceLine = 46)
  protected String kcp01V05LstDrDate;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP01V05-LST-CR-DATE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "XX", srceLine = 48)
  protected String kcp01V05LstCrDate;
  @CobolElement(cobolName = "KCP01V05-STATS-TO-GRP", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 1, picture = "S9", usage = "PACKED-DECIMAL", srceLine = 50)
  protected short kcp01V05StatsToGrp;
  @CobolElement(cobolName = "KCP01V05-BIC-INDCLASS", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 5, picture = "S9(5)", usage = "PACKED-DECIMAL", srceLine = 52)
  protected int kcp01V05BicIndclass;
  @CobolElement(cobolName = "KCP01V05-STAFF-NUMBER", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 7, picture = "S9(7)", usage = "PACKED-DECIMAL", srceLine = 54)
  protected int kcp01V05StaffNumber;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP01V05-FIRST-CR-INT-DATE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "XX", srceLine = 56)
  protected String kcp01V05FirstCrIntDate;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP01V05-LAST-CONS-DATE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "XX", srceLine = 58)
  protected String kcp01V05LastConsDate;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP01V05-BRANCH-SHORT-NAME", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(16)", srceLine = 60)
  protected String kcp01V05BranchShortName;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP01V05-BIRTHDATE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "XX", srceLine = 62)
  protected String kcp01V05Birthdate;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP01V05-BIRTHDATE-2", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "XX", srceLine = 64)
  protected String kcp01V05Birthdate2;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP01V05-NATIONAL-INSURAN-NO-1", type = CobolType.GROUP_ITEM, levelNumber = 5, srceLine = 66)
  protected Kcp01V05NationalInsuranNo1 kcp01V05NationalInsuranNo1;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP01V05-NATIONAL-INSURAN-NO-2", type = CobolType.GROUP_ITEM, levelNumber = 5, srceLine = 73)
  protected Kcp01V05NationalInsuranNo2 kcp01V05NationalInsuranNo2;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP01V05-CLOSE-ACCOUNT-BAL", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 13, fractionDigits = 2, picture = "S9(11)V99", usage = "PACKED-DECIMAL", srceLine = 80)
  protected BigDecimal kcp01V05CloseAccountBal;
  @CobolElement(cobolName = "KCP01V05-EXP-MAN-IND", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 3, picture = "S999", usage = "PACKED-DECIMAL", srceLine = 82)
  protected short kcp01V05ExpManInd;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP01V05-SENS-ACC-IND", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X", srceLine = 84)
  protected String kcp01V05SensAccInd;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP01V05-CHOSEN-NAME", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X(25)", srceLine = 86)
  protected String kcp01V05ChosenName;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP01V05-POOLED-OFFSET-IND", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, picture = "X", srceLine = 88)
  protected String kcp01V05PooledOffsetInd;
  @XmlElement(required = true)
  @CobolElement(cobolName = "KCP01V05-POOLED-BAL", type = CobolType.PACKED_DECIMAL_ITEM, levelNumber = 5, isSigned = true, totalDigits = 11, fractionDigits = 2, picture = "S9(9)V99", usage = "PACKED-DECIMAL", srceLine = 90)
  protected BigDecimal kcp01V05PooledBal;

  /**
   * Gets the value of the kcp01V05Sname property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp01V05Sname()
    {
    return kcp01V05Sname;
    }

  /**
   * Sets the value of the kcp01V05Sname property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp01V05Sname( String value )
    {
    this.kcp01V05Sname = value;
    }

  /**
   * Gets the value of the kcp01V05Busclass property.
   */
  public short getKcp01V05Busclass()
    {
    return kcp01V05Busclass;
    }

  /**
   * Sets the value of the kcp01V05Busclass property.
   */
  public void setKcp01V05Busclass( short value )
    {
    this.kcp01V05Busclass = value;
    }

  /**
   * Gets the value of the kcp01V05Satind property.
   */
  public short getKcp01V05Satind()
    {
    return kcp01V05Satind;
    }

  /**
   * Sets the value of the kcp01V05Satind property.
   */
  public void setKcp01V05Satind( short value )
    {
    this.kcp01V05Satind = value;
    }

  /**
   * Gets the value of the kcp01V05ProductId property.
   */
  public int getKcp01V05ProductId()
    {
    return kcp01V05ProductId;
    }

  /**
   * Sets the value of the kcp01V05ProductId property.
   */
  public void setKcp01V05ProductId( int value )
    {
    this.kcp01V05ProductId = value;
    }

  /**
   * Gets the value of the kcp01V05Genname property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp01V05Genname()
    {
    return kcp01V05Genname;
    }

  /**
   * Sets the value of the kcp01V05Genname property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp01V05Genname( String value )
    {
    this.kcp01V05Genname = value;
    }

  /**
   * Gets the value of the kcp01V05Actname property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp01V05Actname()
    {
    return kcp01V05Actname;
    }

  /**
   * Sets the value of the kcp01V05Actname property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp01V05Actname( String value )
    {
    this.kcp01V05Actname = value;
    }

  /**
   * Gets the value of the kcp01V05Chtname property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp01V05Chtname()
    {
    return kcp01V05Chtname;
    }

  /**
   * Sets the value of the kcp01V05Chtname property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp01V05Chtname( String value )
    {
    this.kcp01V05Chtname = value;
    }

  /**
   * Gets the value of the kcp01V05SnameCode property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp01V05SnameCode()
    {
    return kcp01V05SnameCode;
    }

  /**
   * Sets the value of the kcp01V05SnameCode property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp01V05SnameCode( String value )
    {
    this.kcp01V05SnameCode = value;
    }

  /**
   * Gets the value of the kcp01V05CorpDiv property.
   */
  public short getKcp01V05CorpDiv()
    {
    return kcp01V05CorpDiv;
    }

  /**
   * Sets the value of the kcp01V05CorpDiv property.
   */
  public void setKcp01V05CorpDiv( short value )
    {
    this.kcp01V05CorpDiv = value;
    }

  /**
   * Gets the value of the kcp01V05ApplicationScore property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp01V05ApplicationScore()
    {
    return kcp01V05ApplicationScore;
    }

  /**
   * Sets the value of the kcp01V05ApplicationScore property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp01V05ApplicationScore( String value )
    {
    this.kcp01V05ApplicationScore = value;
    }

  /**
   * Gets the value of the kcp01V05InsOnDate property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp01V05InsOnDate()
    {
    return kcp01V05InsOnDate;
    }

  /**
   * Sets the value of the kcp01V05InsOnDate property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp01V05InsOnDate( String value )
    {
    this.kcp01V05InsOnDate = value;
    }

  /**
   * Gets the value of the kcp01V05InsChgDate property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp01V05InsChgDate()
    {
    return kcp01V05InsChgDate;
    }

  /**
   * Sets the value of the kcp01V05InsChgDate property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp01V05InsChgDate( String value )
    {
    this.kcp01V05InsChgDate = value;
    }

  /**
   * Gets the value of the kcp01V05FxdTermStartDate property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp01V05FxdTermStartDate()
    {
    return kcp01V05FxdTermStartDate;
    }

  /**
   * Sets the value of the kcp01V05FxdTermStartDate property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp01V05FxdTermStartDate( String value )
    {
    this.kcp01V05FxdTermStartDate = value;
    }

  /**
   * Gets the value of the kcp01V05FxdTermEndDate property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp01V05FxdTermEndDate()
    {
    return kcp01V05FxdTermEndDate;
    }

  /**
   * Sets the value of the kcp01V05FxdTermEndDate property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp01V05FxdTermEndDate( String value )
    {
    this.kcp01V05FxdTermEndDate = value;
    }

  /**
   * Gets the value of the kcp01V05StudOff property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp01V05StudOff()
    {
    return kcp01V05StudOff;
    }

  /**
   * Sets the value of the kcp01V05StudOff property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp01V05StudOff( String value )
    {
    this.kcp01V05StudOff = value;
    }

  /**
   * Gets the value of the kcp01V05BcrNpfInd property.
   */
  public short getKcp01V05BcrNpfInd()
    {
    return kcp01V05BcrNpfInd;
    }

  /**
   * Sets the value of the kcp01V05BcrNpfInd property.
   */
  public void setKcp01V05BcrNpfInd( short value )
    {
    this.kcp01V05BcrNpfInd = value;
    }

  /**
   * Gets the value of the kcp01V05AlwaysRep property.
   */
  public short getKcp01V05AlwaysRep()
    {
    return kcp01V05AlwaysRep;
    }

  /**
   * Sets the value of the kcp01V05AlwaysRep property.
   */
  public void setKcp01V05AlwaysRep( short value )
    {
    this.kcp01V05AlwaysRep = value;
    }

  /**
   * Gets the value of the kcp01V05ActualRenDate property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp01V05ActualRenDate()
    {
    return kcp01V05ActualRenDate;
    }

  /**
   * Sets the value of the kcp01V05ActualRenDate property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp01V05ActualRenDate( String value )
    {
    this.kcp01V05ActualRenDate = value;
    }

  /**
   * Gets the value of the kcp01V05RenewDate property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp01V05RenewDate()
    {
    return kcp01V05RenewDate;
    }

  /**
   * Sets the value of the kcp01V05RenewDate property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp01V05RenewDate( String value )
    {
    this.kcp01V05RenewDate = value;
    }

  /**
   * Gets the value of the kcp01V05Excess property.
   */
  public short getKcp01V05Excess()
    {
    return kcp01V05Excess;
    }

  /**
   * Sets the value of the kcp01V05Excess property.
   */
  public void setKcp01V05Excess( short value )
    {
    this.kcp01V05Excess = value;
    }

  /**
   * Gets the value of the kcp01V05MthlyDaysExcess property.
   */
  public short getKcp01V05MthlyDaysExcess()
    {
    return kcp01V05MthlyDaysExcess;
    }

  /**
   * Sets the value of the kcp01V05MthlyDaysExcess property.
   */
  public void setKcp01V05MthlyDaysExcess( short value )
    {
    this.kcp01V05MthlyDaysExcess = value;
    }

  /**
   * Gets the value of the filler42 property.
   * <p/>
   * <p/>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the filler42 property.
   * <p/>
   * <p/>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getFiller42().add(newItem);
   * </pre>
   * <p/>
   * <p/>
   * <p/>
   * Objects of the following type(s) are allowed in the list
   * {@link String }
   */
  public List<String> getFiller42()
    {
    if( filler42 == null )
      {
      filler42 = new ArrayList<String>();
      }
    return this.filler42;
    }

  /**
   * Gets the value of the kcp01V05SameDayEnt property.
   */
  public long getKcp01V05SameDayEnt()
    {
    return kcp01V05SameDayEnt;
    }

  /**
   * Sets the value of the kcp01V05SameDayEnt property.
   */
  public void setKcp01V05SameDayEnt( long value )
    {
    this.kcp01V05SameDayEnt = value;
    }

  /**
   * Gets the value of the kcp01V05LstDrDate property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp01V05LstDrDate()
    {
    return kcp01V05LstDrDate;
    }

  /**
   * Sets the value of the kcp01V05LstDrDate property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp01V05LstDrDate( String value )
    {
    this.kcp01V05LstDrDate = value;
    }

  /**
   * Gets the value of the kcp01V05LstCrDate property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp01V05LstCrDate()
    {
    return kcp01V05LstCrDate;
    }

  /**
   * Sets the value of the kcp01V05LstCrDate property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp01V05LstCrDate( String value )
    {
    this.kcp01V05LstCrDate = value;
    }

  /**
   * Gets the value of the kcp01V05StatsToGrp property.
   */
  public short getKcp01V05StatsToGrp()
    {
    return kcp01V05StatsToGrp;
    }

  /**
   * Sets the value of the kcp01V05StatsToGrp property.
   */
  public void setKcp01V05StatsToGrp( short value )
    {
    this.kcp01V05StatsToGrp = value;
    }

  /**
   * Gets the value of the kcp01V05BicIndclass property.
   */
  public int getKcp01V05BicIndclass()
    {
    return kcp01V05BicIndclass;
    }

  /**
   * Sets the value of the kcp01V05BicIndclass property.
   */
  public void setKcp01V05BicIndclass( int value )
    {
    this.kcp01V05BicIndclass = value;
    }

  /**
   * Gets the value of the kcp01V05StaffNumber property.
   */
  public int getKcp01V05StaffNumber()
    {
    return kcp01V05StaffNumber;
    }

  /**
   * Sets the value of the kcp01V05StaffNumber property.
   */
  public void setKcp01V05StaffNumber( int value )
    {
    this.kcp01V05StaffNumber = value;
    }

  /**
   * Gets the value of the kcp01V05FirstCrIntDate property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp01V05FirstCrIntDate()
    {
    return kcp01V05FirstCrIntDate;
    }

  /**
   * Sets the value of the kcp01V05FirstCrIntDate property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp01V05FirstCrIntDate( String value )
    {
    this.kcp01V05FirstCrIntDate = value;
    }

  /**
   * Gets the value of the kcp01V05LastConsDate property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp01V05LastConsDate()
    {
    return kcp01V05LastConsDate;
    }

  /**
   * Sets the value of the kcp01V05LastConsDate property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp01V05LastConsDate( String value )
    {
    this.kcp01V05LastConsDate = value;
    }

  /**
   * Gets the value of the kcp01V05BranchShortName property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp01V05BranchShortName()
    {
    return kcp01V05BranchShortName;
    }

  /**
   * Sets the value of the kcp01V05BranchShortName property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp01V05BranchShortName( String value )
    {
    this.kcp01V05BranchShortName = value;
    }

  /**
   * Gets the value of the kcp01V05Birthdate property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp01V05Birthdate()
    {
    return kcp01V05Birthdate;
    }

  /**
   * Sets the value of the kcp01V05Birthdate property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp01V05Birthdate( String value )
    {
    this.kcp01V05Birthdate = value;
    }

  /**
   * Gets the value of the kcp01V05Birthdate2 property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp01V05Birthdate2()
    {
    return kcp01V05Birthdate2;
    }

  /**
   * Sets the value of the kcp01V05Birthdate2 property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp01V05Birthdate2( String value )
    {
    this.kcp01V05Birthdate2 = value;
    }

  /**
   * Gets the value of the kcp01V05NationalInsuranNo1 property.
   *
   * @return possible object is
   * {@link Kcp01V05NationalInsuranNo1 }
   */
  public Kcp01V05NationalInsuranNo1 getKcp01V05NationalInsuranNo1()
    {
    return kcp01V05NationalInsuranNo1;
    }

  /**
   * Sets the value of the kcp01V05NationalInsuranNo1 property.
   *
   * @param value allowed object is
   *              {@link Kcp01V05NationalInsuranNo1 }
   */
  public void setKcp01V05NationalInsuranNo1( Kcp01V05NationalInsuranNo1 value )
    {
    this.kcp01V05NationalInsuranNo1 = value;
    }

  /**
   * Gets the value of the kcp01V05NationalInsuranNo2 property.
   *
   * @return possible object is
   * {@link Kcp01V05NationalInsuranNo2 }
   */
  public Kcp01V05NationalInsuranNo2 getKcp01V05NationalInsuranNo2()
    {
    return kcp01V05NationalInsuranNo2;
    }

  /**
   * Sets the value of the kcp01V05NationalInsuranNo2 property.
   *
   * @param value allowed object is
   *              {@link Kcp01V05NationalInsuranNo2 }
   */
  public void setKcp01V05NationalInsuranNo2( Kcp01V05NationalInsuranNo2 value )
    {
    this.kcp01V05NationalInsuranNo2 = value;
    }

  /**
   * Gets the value of the kcp01V05CloseAccountBal property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getKcp01V05CloseAccountBal()
    {
    return kcp01V05CloseAccountBal;
    }

  /**
   * Sets the value of the kcp01V05CloseAccountBal property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setKcp01V05CloseAccountBal( BigDecimal value )
    {
    this.kcp01V05CloseAccountBal = value;
    }

  /**
   * Gets the value of the kcp01V05ExpManInd property.
   */
  public short getKcp01V05ExpManInd()
    {
    return kcp01V05ExpManInd;
    }

  /**
   * Sets the value of the kcp01V05ExpManInd property.
   */
  public void setKcp01V05ExpManInd( short value )
    {
    this.kcp01V05ExpManInd = value;
    }

  /**
   * Gets the value of the kcp01V05SensAccInd property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp01V05SensAccInd()
    {
    return kcp01V05SensAccInd;
    }

  /**
   * Sets the value of the kcp01V05SensAccInd property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp01V05SensAccInd( String value )
    {
    this.kcp01V05SensAccInd = value;
    }

  /**
   * Gets the value of the kcp01V05ChosenName property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp01V05ChosenName()
    {
    return kcp01V05ChosenName;
    }

  /**
   * Sets the value of the kcp01V05ChosenName property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp01V05ChosenName( String value )
    {
    this.kcp01V05ChosenName = value;
    }

  /**
   * Gets the value of the kcp01V05PooledOffsetInd property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKcp01V05PooledOffsetInd()
    {
    return kcp01V05PooledOffsetInd;
    }

  /**
   * Sets the value of the kcp01V05PooledOffsetInd property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKcp01V05PooledOffsetInd( String value )
    {
    this.kcp01V05PooledOffsetInd = value;
    }

  /**
   * Gets the value of the kcp01V05PooledBal property.
   *
   * @return possible object is
   * {@link BigDecimal }
   */
  public BigDecimal getKcp01V05PooledBal()
    {
    return kcp01V05PooledBal;
    }

  /**
   * Sets the value of the kcp01V05PooledBal property.
   *
   * @param value allowed object is
   *              {@link BigDecimal }
   */
  public void setKcp01V05PooledBal( BigDecimal value )
    {
    this.kcp01V05PooledBal = value;
    }

  }
