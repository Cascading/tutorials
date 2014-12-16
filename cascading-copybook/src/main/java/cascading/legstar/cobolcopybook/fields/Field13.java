package cascading.legstar.cobolcopybook.fields;

import java.lang.reflect.Type;

import cascading.tuple.Fields;

public class Field13 extends Fields
  {

  private static final long serialVersionUID = -1L;

  public Field13()
    {
    super(
      new Comparable[]{
        "Kcp13V05NoOfDiaries"
        , "Kcp13V05NotificatTypeCode_0"
        , "Kcp13V05NotificatSubTypeCd_0"
        , "Kcp13V05NotificatSuppressCd_0"
        , "Kcp13V05NotificatMmsgSupCd_0"
        , "Kcp13V05NotificatPmsgSupCd_0"
        , "Kcp13V05StmtDest_0"
        , "Kcp13V05StmtDupDest_0"
        , "Kcp13V05StmtCind_0"
        , "Kcp13V05Dissenter_0"
        , "Kcp13V05StmtDup_0"
        , "Kcp13V05StmtDestClass_0"
        , "Kcp13V05StmtLayout_0"
        , "Kcp13V05NoOfPrenotDates_0"
        , "Kcp13V05PrenotPrintType_0_0"
        , "Kcp13V05PrenotPrintDate_0_0"
        , "Kcp13V05PrenotPrintType_0_1"
        , "Kcp13V05PrenotPrintDate_0_1"
        , "Kcp13V05PrenotPrintType_0_2"
        , "Kcp13V05PrenotPrintDate_0_2"
        , "Kcp13V05NoOfFrequencies_0"
        , "Kcp13V05NotificatFreqCode_0_0"
        , "Kcp13V05NotificatDayOfMnth_0_0"
        , "Kcp13V05NotificatDayOfWeek_0_0_0"
        , "Kcp13V05NotificatDayOfWeek_0_0_1"
        , "Kcp13V05NotificatDayOfWeek_0_0_2"
        , "Kcp13V05NotificatDayOfWeek_0_0_3"
        , "Kcp13V05NotificatDayOfWeek_0_0_4"
        , "Kcp13V05NotificatDueDate_0_0"
        , "Kcp13V05NotificatRecurChg_0_0"
        , "Kcp13V05ReasonCode_0_0"
        , "Kcp13V05NotificatCommAction_0_0"
        , "Kcp13V05NotificatCrintActn_0_0"
        , "Kcp13V05NotificatDrintActn_0_0"
        , "Kcp13V05NotificatFreqCode_0_1"
        , "Kcp13V05NotificatDayOfMnth_0_1"
        , "Kcp13V05NotificatDayOfWeek_0_1_0"
        , "Kcp13V05NotificatDayOfWeek_0_1_1"
        , "Kcp13V05NotificatDayOfWeek_0_1_2"
        , "Kcp13V05NotificatDayOfWeek_0_1_3"
        , "Kcp13V05NotificatDayOfWeek_0_1_4"
        , "Kcp13V05NotificatDueDate_0_1"
        , "Kcp13V05NotificatRecurChg_0_1"
        , "Kcp13V05ReasonCode_0_1"
        , "Kcp13V05NotificatCommAction_0_1"
        , "Kcp13V05NotificatCrintActn_0_1"
        , "Kcp13V05NotificatDrintActn_0_1"
        , "Kcp13V05NotificatFreqCode_0_2"
        , "Kcp13V05NotificatDayOfMnth_0_2"
        , "Kcp13V05NotificatDayOfWeek_0_2_0"
        , "Kcp13V05NotificatDayOfWeek_0_2_1"
        , "Kcp13V05NotificatDayOfWeek_0_2_2"
        , "Kcp13V05NotificatDayOfWeek_0_2_3"
        , "Kcp13V05NotificatDayOfWeek_0_2_4"
        , "Kcp13V05NotificatDueDate_0_2"
        , "Kcp13V05NotificatRecurChg_0_2"
        , "Kcp13V05ReasonCode_0_2"
        , "Kcp13V05NotificatCommAction_0_2"
        , "Kcp13V05NotificatCrintActn_0_2"
        , "Kcp13V05NotificatDrintActn_0_2"
        , "Kcp13V05NotificatFreqCode_0_3"
        , "Kcp13V05NotificatDayOfMnth_0_3"
        , "Kcp13V05NotificatDayOfWeek_0_3_0"
        , "Kcp13V05NotificatDayOfWeek_0_3_1"
        , "Kcp13V05NotificatDayOfWeek_0_3_2"
        , "Kcp13V05NotificatDayOfWeek_0_3_3"
        , "Kcp13V05NotificatDayOfWeek_0_3_4"
        , "Kcp13V05NotificatDueDate_0_3"
        , "Kcp13V05NotificatRecurChg_0_3"
        , "Kcp13V05ReasonCode_0_3"
        , "Kcp13V05NotificatCommAction_0_3"
        , "Kcp13V05NotificatCrintActn_0_3"
        , "Kcp13V05NotificatDrintActn_0_3"
        , "Kcp13V05NotificatFreqCode_0_4"
        , "Kcp13V05NotificatDayOfMnth_0_4"
        , "Kcp13V05NotificatDayOfWeek_0_4_0"
        , "Kcp13V05NotificatDayOfWeek_0_4_1"
        , "Kcp13V05NotificatDayOfWeek_0_4_2"
        , "Kcp13V05NotificatDayOfWeek_0_4_3"
        , "Kcp13V05NotificatDayOfWeek_0_4_4"
        , "Kcp13V05NotificatDueDate_0_4"
        , "Kcp13V05NotificatRecurChg_0_4"
        , "Kcp13V05ReasonCode_0_4"
        , "Kcp13V05NotificatCommAction_0_4"
        , "Kcp13V05NotificatCrintActn_0_4"
        , "Kcp13V05NotificatDrintActn_0_4"
        , "Kcp13V05NotificatFreqCode_0_5"
        , "Kcp13V05NotificatDayOfMnth_0_5"
        , "Kcp13V05NotificatDayOfWeek_0_5_0"
        , "Kcp13V05NotificatDayOfWeek_0_5_1"
        , "Kcp13V05NotificatDayOfWeek_0_5_2"
        , "Kcp13V05NotificatDayOfWeek_0_5_3"
        , "Kcp13V05NotificatDayOfWeek_0_5_4"
        , "Kcp13V05NotificatDueDate_0_5"
        , "Kcp13V05NotificatRecurChg_0_5"
        , "Kcp13V05ReasonCode_0_5"
        , "Kcp13V05NotificatCommAction_0_5"
        , "Kcp13V05NotificatCrintActn_0_5"
        , "Kcp13V05NotificatDrintActn_0_5"
        , "Kcp13V05NotificatFreqCode_0_6"
        , "Kcp13V05NotificatDayOfMnth_0_6"
        , "Kcp13V05NotificatDayOfWeek_0_6_0"
        , "Kcp13V05NotificatDayOfWeek_0_6_1"
        , "Kcp13V05NotificatDayOfWeek_0_6_2"
        , "Kcp13V05NotificatDayOfWeek_0_6_3"
        , "Kcp13V05NotificatDayOfWeek_0_6_4"
        , "Kcp13V05NotificatDueDate_0_6"
        , "Kcp13V05NotificatRecurChg_0_6"
        , "Kcp13V05ReasonCode_0_6"
        , "Kcp13V05NotificatCommAction_0_6"
        , "Kcp13V05NotificatCrintActn_0_6"
        , "Kcp13V05NotificatDrintActn_0_6"
        , "Kcp13V05NotificatFreqCode_0_7"
        , "Kcp13V05NotificatDayOfMnth_0_7"
        , "Kcp13V05NotificatDayOfWeek_0_7_0"
        , "Kcp13V05NotificatDayOfWeek_0_7_1"
        , "Kcp13V05NotificatDayOfWeek_0_7_2"
        , "Kcp13V05NotificatDayOfWeek_0_7_3"
        , "Kcp13V05NotificatDayOfWeek_0_7_4"
        , "Kcp13V05NotificatDueDate_0_7"
        , "Kcp13V05NotificatRecurChg_0_7"
        , "Kcp13V05ReasonCode_0_7"
        , "Kcp13V05NotificatCommAction_0_7"
        , "Kcp13V05NotificatCrintActn_0_7"
        , "Kcp13V05NotificatDrintActn_0_7"
        , "Kcp13V05NotificatFreqCode_0_8"
        , "Kcp13V05NotificatDayOfMnth_0_8"
        , "Kcp13V05NotificatDayOfWeek_0_8_0"
        , "Kcp13V05NotificatDayOfWeek_0_8_1"
        , "Kcp13V05NotificatDayOfWeek_0_8_2"
        , "Kcp13V05NotificatDayOfWeek_0_8_3"
        , "Kcp13V05NotificatDayOfWeek_0_8_4"
        , "Kcp13V05NotificatDueDate_0_8"
        , "Kcp13V05NotificatRecurChg_0_8"
        , "Kcp13V05ReasonCode_0_8"
        , "Kcp13V05NotificatCommAction_0_8"
        , "Kcp13V05NotificatCrintActn_0_8"
        , "Kcp13V05NotificatDrintActn_0_8"
        , "Kcp13V05NotificatTypeCode_1"
        , "Kcp13V05NotificatSubTypeCd_1"
        , "Kcp13V05NotificatSuppressCd_1"
        , "Kcp13V05NotificatMmsgSupCd_1"
        , "Kcp13V05NotificatPmsgSupCd_1"
        , "Kcp13V05StmtDest_1"
        , "Kcp13V05StmtDupDest_1"
        , "Kcp13V05StmtCind_1"
        , "Kcp13V05Dissenter_1"
        , "Kcp13V05StmtDup_1"
        , "Kcp13V05StmtDestClass_1"
        , "Kcp13V05StmtLayout_1"
        , "Kcp13V05NoOfPrenotDates_1"
        , "Kcp13V05PrenotPrintType_1_0"
        , "Kcp13V05PrenotPrintDate_1_0"
        , "Kcp13V05PrenotPrintType_1_1"
        , "Kcp13V05PrenotPrintDate_1_1"
        , "Kcp13V05PrenotPrintType_1_2"
        , "Kcp13V05PrenotPrintDate_1_2"
        , "Kcp13V05NoOfFrequencies_1"
        , "Kcp13V05NotificatFreqCode_1_0"
        , "Kcp13V05NotificatDayOfMnth_1_0"
        , "Kcp13V05NotificatDayOfWeek_1_0_0"
        , "Kcp13V05NotificatDayOfWeek_1_0_1"
        , "Kcp13V05NotificatDayOfWeek_1_0_2"
        , "Kcp13V05NotificatDayOfWeek_1_0_3"
        , "Kcp13V05NotificatDayOfWeek_1_0_4"
        , "Kcp13V05NotificatDueDate_1_0"
        , "Kcp13V05NotificatRecurChg_1_0"
        , "Kcp13V05ReasonCode_1_0"
        , "Kcp13V05NotificatCommAction_1_0"
        , "Kcp13V05NotificatCrintActn_1_0"
        , "Kcp13V05NotificatDrintActn_1_0"
        , "Kcp13V05NotificatFreqCode_1_1"
        , "Kcp13V05NotificatDayOfMnth_1_1"
        , "Kcp13V05NotificatDayOfWeek_1_1_0"
        , "Kcp13V05NotificatDayOfWeek_1_1_1"
        , "Kcp13V05NotificatDayOfWeek_1_1_2"
        , "Kcp13V05NotificatDayOfWeek_1_1_3"
        , "Kcp13V05NotificatDayOfWeek_1_1_4"
        , "Kcp13V05NotificatDueDate_1_1"
        , "Kcp13V05NotificatRecurChg_1_1"
        , "Kcp13V05ReasonCode_1_1"
        , "Kcp13V05NotificatCommAction_1_1"
        , "Kcp13V05NotificatCrintActn_1_1"
        , "Kcp13V05NotificatDrintActn_1_1"
        , "Kcp13V05NotificatFreqCode_1_2"
        , "Kcp13V05NotificatDayOfMnth_1_2"
        , "Kcp13V05NotificatDayOfWeek_1_2_0"
        , "Kcp13V05NotificatDayOfWeek_1_2_1"
        , "Kcp13V05NotificatDayOfWeek_1_2_2"
        , "Kcp13V05NotificatDayOfWeek_1_2_3"
        , "Kcp13V05NotificatDayOfWeek_1_2_4"
        , "Kcp13V05NotificatDueDate_1_2"
        , "Kcp13V05NotificatRecurChg_1_2"
        , "Kcp13V05ReasonCode_1_2"
        , "Kcp13V05NotificatCommAction_1_2"
        , "Kcp13V05NotificatCrintActn_1_2"
        , "Kcp13V05NotificatDrintActn_1_2"
        , "Kcp13V05NotificatFreqCode_1_3"
        , "Kcp13V05NotificatDayOfMnth_1_3"
        , "Kcp13V05NotificatDayOfWeek_1_3_0"
        , "Kcp13V05NotificatDayOfWeek_1_3_1"
        , "Kcp13V05NotificatDayOfWeek_1_3_2"
        , "Kcp13V05NotificatDayOfWeek_1_3_3"
        , "Kcp13V05NotificatDayOfWeek_1_3_4"
        , "Kcp13V05NotificatDueDate_1_3"
        , "Kcp13V05NotificatRecurChg_1_3"
        , "Kcp13V05ReasonCode_1_3"
        , "Kcp13V05NotificatCommAction_1_3"
        , "Kcp13V05NotificatCrintActn_1_3"
        , "Kcp13V05NotificatDrintActn_1_3"
        , "Kcp13V05NotificatFreqCode_1_4"
        , "Kcp13V05NotificatDayOfMnth_1_4"
        , "Kcp13V05NotificatDayOfWeek_1_4_0"
        , "Kcp13V05NotificatDayOfWeek_1_4_1"
        , "Kcp13V05NotificatDayOfWeek_1_4_2"
        , "Kcp13V05NotificatDayOfWeek_1_4_3"
        , "Kcp13V05NotificatDayOfWeek_1_4_4"
        , "Kcp13V05NotificatDueDate_1_4"
        , "Kcp13V05NotificatRecurChg_1_4"
        , "Kcp13V05ReasonCode_1_4"
        , "Kcp13V05NotificatCommAction_1_4"
        , "Kcp13V05NotificatCrintActn_1_4"
        , "Kcp13V05NotificatDrintActn_1_4"
        , "Kcp13V05NotificatFreqCode_1_5"
        , "Kcp13V05NotificatDayOfMnth_1_5"
        , "Kcp13V05NotificatDayOfWeek_1_5_0"
        , "Kcp13V05NotificatDayOfWeek_1_5_1"
        , "Kcp13V05NotificatDayOfWeek_1_5_2"
        , "Kcp13V05NotificatDayOfWeek_1_5_3"
        , "Kcp13V05NotificatDayOfWeek_1_5_4"
        , "Kcp13V05NotificatDueDate_1_5"
        , "Kcp13V05NotificatRecurChg_1_5"
        , "Kcp13V05ReasonCode_1_5"
        , "Kcp13V05NotificatCommAction_1_5"
        , "Kcp13V05NotificatCrintActn_1_5"
        , "Kcp13V05NotificatDrintActn_1_5"
        , "Kcp13V05NotificatFreqCode_1_6"
        , "Kcp13V05NotificatDayOfMnth_1_6"
        , "Kcp13V05NotificatDayOfWeek_1_6_0"
        , "Kcp13V05NotificatDayOfWeek_1_6_1"
        , "Kcp13V05NotificatDayOfWeek_1_6_2"
        , "Kcp13V05NotificatDayOfWeek_1_6_3"
        , "Kcp13V05NotificatDayOfWeek_1_6_4"
        , "Kcp13V05NotificatDueDate_1_6"
        , "Kcp13V05NotificatRecurChg_1_6"
        , "Kcp13V05ReasonCode_1_6"
        , "Kcp13V05NotificatCommAction_1_6"
        , "Kcp13V05NotificatCrintActn_1_6"
        , "Kcp13V05NotificatDrintActn_1_6"
        , "Kcp13V05NotificatFreqCode_1_7"
        , "Kcp13V05NotificatDayOfMnth_1_7"
        , "Kcp13V05NotificatDayOfWeek_1_7_0"
        , "Kcp13V05NotificatDayOfWeek_1_7_1"
        , "Kcp13V05NotificatDayOfWeek_1_7_2"
        , "Kcp13V05NotificatDayOfWeek_1_7_3"
        , "Kcp13V05NotificatDayOfWeek_1_7_4"
        , "Kcp13V05NotificatDueDate_1_7"
        , "Kcp13V05NotificatRecurChg_1_7"
        , "Kcp13V05ReasonCode_1_7"
        , "Kcp13V05NotificatCommAction_1_7"
        , "Kcp13V05NotificatCrintActn_1_7"
        , "Kcp13V05NotificatDrintActn_1_7"
        , "Kcp13V05NotificatFreqCode_1_8"
        , "Kcp13V05NotificatDayOfMnth_1_8"
        , "Kcp13V05NotificatDayOfWeek_1_8_0"
        , "Kcp13V05NotificatDayOfWeek_1_8_1"
        , "Kcp13V05NotificatDayOfWeek_1_8_2"
        , "Kcp13V05NotificatDayOfWeek_1_8_3"
        , "Kcp13V05NotificatDayOfWeek_1_8_4"
        , "Kcp13V05NotificatDueDate_1_8"
        , "Kcp13V05NotificatRecurChg_1_8"
        , "Kcp13V05ReasonCode_1_8"
        , "Kcp13V05NotificatCommAction_1_8"
        , "Kcp13V05NotificatCrintActn_1_8"
        , "Kcp13V05NotificatDrintActn_1_8"
        , "Kcp13V05NotificatTypeCode_2"
        , "Kcp13V05NotificatSubTypeCd_2"
        , "Kcp13V05NotificatSuppressCd_2"
        , "Kcp13V05NotificatMmsgSupCd_2"
        , "Kcp13V05NotificatPmsgSupCd_2"
        , "Kcp13V05StmtDest_2"
        , "Kcp13V05StmtDupDest_2"
        , "Kcp13V05StmtCind_2"
        , "Kcp13V05Dissenter_2"
        , "Kcp13V05StmtDup_2"
        , "Kcp13V05StmtDestClass_2"
        , "Kcp13V05StmtLayout_2"
        , "Kcp13V05NoOfPrenotDates_2"
        , "Kcp13V05PrenotPrintType_2_0"
        , "Kcp13V05PrenotPrintDate_2_0"
        , "Kcp13V05PrenotPrintType_2_1"
        , "Kcp13V05PrenotPrintDate_2_1"
        , "Kcp13V05PrenotPrintType_2_2"
        , "Kcp13V05PrenotPrintDate_2_2"
        , "Kcp13V05NoOfFrequencies_2"
        , "Kcp13V05NotificatFreqCode_2_0"
        , "Kcp13V05NotificatDayOfMnth_2_0"
        , "Kcp13V05NotificatDayOfWeek_2_0_0"
        , "Kcp13V05NotificatDayOfWeek_2_0_1"
        , "Kcp13V05NotificatDayOfWeek_2_0_2"
        , "Kcp13V05NotificatDayOfWeek_2_0_3"
        , "Kcp13V05NotificatDayOfWeek_2_0_4"
        , "Kcp13V05NotificatDueDate_2_0"
        , "Kcp13V05NotificatRecurChg_2_0"
        , "Kcp13V05ReasonCode_2_0"
        , "Kcp13V05NotificatCommAction_2_0"
        , "Kcp13V05NotificatCrintActn_2_0"
        , "Kcp13V05NotificatDrintActn_2_0"
        , "Kcp13V05NotificatFreqCode_2_1"
        , "Kcp13V05NotificatDayOfMnth_2_1"
        , "Kcp13V05NotificatDayOfWeek_2_1_0"
        , "Kcp13V05NotificatDayOfWeek_2_1_1"
        , "Kcp13V05NotificatDayOfWeek_2_1_2"
        , "Kcp13V05NotificatDayOfWeek_2_1_3"
        , "Kcp13V05NotificatDayOfWeek_2_1_4"
        , "Kcp13V05NotificatDueDate_2_1"
        , "Kcp13V05NotificatRecurChg_2_1"
        , "Kcp13V05ReasonCode_2_1"
        , "Kcp13V05NotificatCommAction_2_1"
        , "Kcp13V05NotificatCrintActn_2_1"
        , "Kcp13V05NotificatDrintActn_2_1"
        , "Kcp13V05NotificatFreqCode_2_2"
        , "Kcp13V05NotificatDayOfMnth_2_2"
        , "Kcp13V05NotificatDayOfWeek_2_2_0"
        , "Kcp13V05NotificatDayOfWeek_2_2_1"
        , "Kcp13V05NotificatDayOfWeek_2_2_2"
        , "Kcp13V05NotificatDayOfWeek_2_2_3"
        , "Kcp13V05NotificatDayOfWeek_2_2_4"
        , "Kcp13V05NotificatDueDate_2_2"
        , "Kcp13V05NotificatRecurChg_2_2"
        , "Kcp13V05ReasonCode_2_2"
        , "Kcp13V05NotificatCommAction_2_2"
        , "Kcp13V05NotificatCrintActn_2_2"
        , "Kcp13V05NotificatDrintActn_2_2"
        , "Kcp13V05NotificatFreqCode_2_3"
        , "Kcp13V05NotificatDayOfMnth_2_3"
        , "Kcp13V05NotificatDayOfWeek_2_3_0"
        , "Kcp13V05NotificatDayOfWeek_2_3_1"
        , "Kcp13V05NotificatDayOfWeek_2_3_2"
        , "Kcp13V05NotificatDayOfWeek_2_3_3"
        , "Kcp13V05NotificatDayOfWeek_2_3_4"
        , "Kcp13V05NotificatDueDate_2_3"
        , "Kcp13V05NotificatRecurChg_2_3"
        , "Kcp13V05ReasonCode_2_3"
        , "Kcp13V05NotificatCommAction_2_3"
        , "Kcp13V05NotificatCrintActn_2_3"
        , "Kcp13V05NotificatDrintActn_2_3"
        , "Kcp13V05NotificatFreqCode_2_4"
        , "Kcp13V05NotificatDayOfMnth_2_4"
        , "Kcp13V05NotificatDayOfWeek_2_4_0"
        , "Kcp13V05NotificatDayOfWeek_2_4_1"
        , "Kcp13V05NotificatDayOfWeek_2_4_2"
        , "Kcp13V05NotificatDayOfWeek_2_4_3"
        , "Kcp13V05NotificatDayOfWeek_2_4_4"
        , "Kcp13V05NotificatDueDate_2_4"
        , "Kcp13V05NotificatRecurChg_2_4"
        , "Kcp13V05ReasonCode_2_4"
        , "Kcp13V05NotificatCommAction_2_4"
        , "Kcp13V05NotificatCrintActn_2_4"
        , "Kcp13V05NotificatDrintActn_2_4"
        , "Kcp13V05NotificatFreqCode_2_5"
        , "Kcp13V05NotificatDayOfMnth_2_5"
        , "Kcp13V05NotificatDayOfWeek_2_5_0"
        , "Kcp13V05NotificatDayOfWeek_2_5_1"
        , "Kcp13V05NotificatDayOfWeek_2_5_2"
        , "Kcp13V05NotificatDayOfWeek_2_5_3"
        , "Kcp13V05NotificatDayOfWeek_2_5_4"
        , "Kcp13V05NotificatDueDate_2_5"
        , "Kcp13V05NotificatRecurChg_2_5"
        , "Kcp13V05ReasonCode_2_5"
        , "Kcp13V05NotificatCommAction_2_5"
        , "Kcp13V05NotificatCrintActn_2_5"
        , "Kcp13V05NotificatDrintActn_2_5"
        , "Kcp13V05NotificatFreqCode_2_6"
        , "Kcp13V05NotificatDayOfMnth_2_6"
        , "Kcp13V05NotificatDayOfWeek_2_6_0"
        , "Kcp13V05NotificatDayOfWeek_2_6_1"
        , "Kcp13V05NotificatDayOfWeek_2_6_2"
        , "Kcp13V05NotificatDayOfWeek_2_6_3"
        , "Kcp13V05NotificatDayOfWeek_2_6_4"
        , "Kcp13V05NotificatDueDate_2_6"
        , "Kcp13V05NotificatRecurChg_2_6"
        , "Kcp13V05ReasonCode_2_6"
        , "Kcp13V05NotificatCommAction_2_6"
        , "Kcp13V05NotificatCrintActn_2_6"
        , "Kcp13V05NotificatDrintActn_2_6"
        , "Kcp13V05NotificatFreqCode_2_7"
        , "Kcp13V05NotificatDayOfMnth_2_7"
        , "Kcp13V05NotificatDayOfWeek_2_7_0"
        , "Kcp13V05NotificatDayOfWeek_2_7_1"
        , "Kcp13V05NotificatDayOfWeek_2_7_2"
        , "Kcp13V05NotificatDayOfWeek_2_7_3"
        , "Kcp13V05NotificatDayOfWeek_2_7_4"
        , "Kcp13V05NotificatDueDate_2_7"
        , "Kcp13V05NotificatRecurChg_2_7"
        , "Kcp13V05ReasonCode_2_7"
        , "Kcp13V05NotificatCommAction_2_7"
        , "Kcp13V05NotificatCrintActn_2_7"
        , "Kcp13V05NotificatDrintActn_2_7"
        , "Kcp13V05NotificatFreqCode_2_8"
        , "Kcp13V05NotificatDayOfMnth_2_8"
        , "Kcp13V05NotificatDayOfWeek_2_8_0"
        , "Kcp13V05NotificatDayOfWeek_2_8_1"
        , "Kcp13V05NotificatDayOfWeek_2_8_2"
        , "Kcp13V05NotificatDayOfWeek_2_8_3"
        , "Kcp13V05NotificatDayOfWeek_2_8_4"
        , "Kcp13V05NotificatDueDate_2_8"
        , "Kcp13V05NotificatRecurChg_2_8"
        , "Kcp13V05ReasonCode_2_8"
        , "Kcp13V05NotificatCommAction_2_8"
        , "Kcp13V05NotificatCrintActn_2_8"
        , "Kcp13V05NotificatDrintActn_2_8"
        , "Kcp13V05NotificatTypeCode_3"
        , "Kcp13V05NotificatSubTypeCd_3"
        , "Kcp13V05NotificatSuppressCd_3"
        , "Kcp13V05NotificatMmsgSupCd_3"
        , "Kcp13V05NotificatPmsgSupCd_3"
        , "Kcp13V05StmtDest_3"
        , "Kcp13V05StmtDupDest_3"
        , "Kcp13V05StmtCind_3"
        , "Kcp13V05Dissenter_3"
        , "Kcp13V05StmtDup_3"
        , "Kcp13V05StmtDestClass_3"
        , "Kcp13V05StmtLayout_3"
        , "Kcp13V05NoOfPrenotDates_3"
        , "Kcp13V05PrenotPrintType_3_0"
        , "Kcp13V05PrenotPrintDate_3_0"
        , "Kcp13V05PrenotPrintType_3_1"
        , "Kcp13V05PrenotPrintDate_3_1"
        , "Kcp13V05PrenotPrintType_3_2"
        , "Kcp13V05PrenotPrintDate_3_2"
        , "Kcp13V05NoOfFrequencies_3"
        , "Kcp13V05NotificatFreqCode_3_0"
        , "Kcp13V05NotificatDayOfMnth_3_0"
        , "Kcp13V05NotificatDayOfWeek_3_0_0"
        , "Kcp13V05NotificatDayOfWeek_3_0_1"
        , "Kcp13V05NotificatDayOfWeek_3_0_2"
        , "Kcp13V05NotificatDayOfWeek_3_0_3"
        , "Kcp13V05NotificatDayOfWeek_3_0_4"
        , "Kcp13V05NotificatDueDate_3_0"
        , "Kcp13V05NotificatRecurChg_3_0"
        , "Kcp13V05ReasonCode_3_0"
        , "Kcp13V05NotificatCommAction_3_0"
        , "Kcp13V05NotificatCrintActn_3_0"
        , "Kcp13V05NotificatDrintActn_3_0"
        , "Kcp13V05NotificatFreqCode_3_1"
        , "Kcp13V05NotificatDayOfMnth_3_1"
        , "Kcp13V05NotificatDayOfWeek_3_1_0"
        , "Kcp13V05NotificatDayOfWeek_3_1_1"
        , "Kcp13V05NotificatDayOfWeek_3_1_2"
        , "Kcp13V05NotificatDayOfWeek_3_1_3"
        , "Kcp13V05NotificatDayOfWeek_3_1_4"
        , "Kcp13V05NotificatDueDate_3_1"
        , "Kcp13V05NotificatRecurChg_3_1"
        , "Kcp13V05ReasonCode_3_1"
        , "Kcp13V05NotificatCommAction_3_1"
        , "Kcp13V05NotificatCrintActn_3_1"
        , "Kcp13V05NotificatDrintActn_3_1"
        , "Kcp13V05NotificatFreqCode_3_2"
        , "Kcp13V05NotificatDayOfMnth_3_2"
        , "Kcp13V05NotificatDayOfWeek_3_2_0"
        , "Kcp13V05NotificatDayOfWeek_3_2_1"
        , "Kcp13V05NotificatDayOfWeek_3_2_2"
        , "Kcp13V05NotificatDayOfWeek_3_2_3"
        , "Kcp13V05NotificatDayOfWeek_3_2_4"
        , "Kcp13V05NotificatDueDate_3_2"
        , "Kcp13V05NotificatRecurChg_3_2"
        , "Kcp13V05ReasonCode_3_2"
        , "Kcp13V05NotificatCommAction_3_2"
        , "Kcp13V05NotificatCrintActn_3_2"
        , "Kcp13V05NotificatDrintActn_3_2"
        , "Kcp13V05NotificatFreqCode_3_3"
        , "Kcp13V05NotificatDayOfMnth_3_3"
        , "Kcp13V05NotificatDayOfWeek_3_3_0"
        , "Kcp13V05NotificatDayOfWeek_3_3_1"
        , "Kcp13V05NotificatDayOfWeek_3_3_2"
        , "Kcp13V05NotificatDayOfWeek_3_3_3"
        , "Kcp13V05NotificatDayOfWeek_3_3_4"
        , "Kcp13V05NotificatDueDate_3_3"
        , "Kcp13V05NotificatRecurChg_3_3"
        , "Kcp13V05ReasonCode_3_3"
        , "Kcp13V05NotificatCommAction_3_3"
        , "Kcp13V05NotificatCrintActn_3_3"
        , "Kcp13V05NotificatDrintActn_3_3"
        , "Kcp13V05NotificatFreqCode_3_4"
        , "Kcp13V05NotificatDayOfMnth_3_4"
        , "Kcp13V05NotificatDayOfWeek_3_4_0"
        , "Kcp13V05NotificatDayOfWeek_3_4_1"
        , "Kcp13V05NotificatDayOfWeek_3_4_2"
        , "Kcp13V05NotificatDayOfWeek_3_4_3"
        , "Kcp13V05NotificatDayOfWeek_3_4_4"
        , "Kcp13V05NotificatDueDate_3_4"
        , "Kcp13V05NotificatRecurChg_3_4"
        , "Kcp13V05ReasonCode_3_4"
        , "Kcp13V05NotificatCommAction_3_4"
        , "Kcp13V05NotificatCrintActn_3_4"
        , "Kcp13V05NotificatDrintActn_3_4"
        , "Kcp13V05NotificatFreqCode_3_5"
        , "Kcp13V05NotificatDayOfMnth_3_5"
        , "Kcp13V05NotificatDayOfWeek_3_5_0"
        , "Kcp13V05NotificatDayOfWeek_3_5_1"
        , "Kcp13V05NotificatDayOfWeek_3_5_2"
        , "Kcp13V05NotificatDayOfWeek_3_5_3"
        , "Kcp13V05NotificatDayOfWeek_3_5_4"
        , "Kcp13V05NotificatDueDate_3_5"
        , "Kcp13V05NotificatRecurChg_3_5"
        , "Kcp13V05ReasonCode_3_5"
        , "Kcp13V05NotificatCommAction_3_5"
        , "Kcp13V05NotificatCrintActn_3_5"
        , "Kcp13V05NotificatDrintActn_3_5"
        , "Kcp13V05NotificatFreqCode_3_6"
        , "Kcp13V05NotificatDayOfMnth_3_6"
        , "Kcp13V05NotificatDayOfWeek_3_6_0"
        , "Kcp13V05NotificatDayOfWeek_3_6_1"
        , "Kcp13V05NotificatDayOfWeek_3_6_2"
        , "Kcp13V05NotificatDayOfWeek_3_6_3"
        , "Kcp13V05NotificatDayOfWeek_3_6_4"
        , "Kcp13V05NotificatDueDate_3_6"
        , "Kcp13V05NotificatRecurChg_3_6"
        , "Kcp13V05ReasonCode_3_6"
        , "Kcp13V05NotificatCommAction_3_6"
        , "Kcp13V05NotificatCrintActn_3_6"
        , "Kcp13V05NotificatDrintActn_3_6"
        , "Kcp13V05NotificatFreqCode_3_7"
        , "Kcp13V05NotificatDayOfMnth_3_7"
        , "Kcp13V05NotificatDayOfWeek_3_7_0"
        , "Kcp13V05NotificatDayOfWeek_3_7_1"
        , "Kcp13V05NotificatDayOfWeek_3_7_2"
        , "Kcp13V05NotificatDayOfWeek_3_7_3"
        , "Kcp13V05NotificatDayOfWeek_3_7_4"
        , "Kcp13V05NotificatDueDate_3_7"
        , "Kcp13V05NotificatRecurChg_3_7"
        , "Kcp13V05ReasonCode_3_7"
        , "Kcp13V05NotificatCommAction_3_7"
        , "Kcp13V05NotificatCrintActn_3_7"
        , "Kcp13V05NotificatDrintActn_3_7"
        , "Kcp13V05NotificatFreqCode_3_8"
        , "Kcp13V05NotificatDayOfMnth_3_8"
        , "Kcp13V05NotificatDayOfWeek_3_8_0"
        , "Kcp13V05NotificatDayOfWeek_3_8_1"
        , "Kcp13V05NotificatDayOfWeek_3_8_2"
        , "Kcp13V05NotificatDayOfWeek_3_8_3"
        , "Kcp13V05NotificatDayOfWeek_3_8_4"
        , "Kcp13V05NotificatDueDate_3_8"
        , "Kcp13V05NotificatRecurChg_3_8"
        , "Kcp13V05ReasonCode_3_8"
        , "Kcp13V05NotificatCommAction_3_8"
        , "Kcp13V05NotificatCrintActn_3_8"
        , "Kcp13V05NotificatDrintActn_3_8"
      }, new Type[]{
        int.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , int.class
        , short.class
        , int.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , int.class
        , java.lang.String.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , short.class
        , short.class
        , short.class
        , short.class
        , short.class
        , java.lang.String.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , short.class
        , short.class
        , short.class
        , short.class
        , short.class
        , java.lang.String.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , short.class
        , short.class
        , short.class
        , short.class
        , short.class
        , java.lang.String.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , short.class
        , short.class
        , short.class
        , short.class
        , short.class
        , java.lang.String.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , short.class
        , short.class
        , short.class
        , short.class
        , short.class
        , java.lang.String.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , short.class
        , short.class
        , short.class
        , short.class
        , short.class
        , java.lang.String.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , short.class
        , short.class
        , short.class
        , short.class
        , short.class
        , java.lang.String.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , short.class
        , short.class
        , short.class
        , short.class
        , short.class
        , java.lang.String.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , short.class
        , short.class
        , short.class
        , short.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , int.class
        , short.class
        , int.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , int.class
        , java.lang.String.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , short.class
        , short.class
        , short.class
        , short.class
        , short.class
        , java.lang.String.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , short.class
        , short.class
        , short.class
        , short.class
        , short.class
        , java.lang.String.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , short.class
        , short.class
        , short.class
        , short.class
        , short.class
        , java.lang.String.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , short.class
        , short.class
        , short.class
        , short.class
        , short.class
        , java.lang.String.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , short.class
        , short.class
        , short.class
        , short.class
        , short.class
        , java.lang.String.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , short.class
        , short.class
        , short.class
        , short.class
        , short.class
        , java.lang.String.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , short.class
        , short.class
        , short.class
        , short.class
        , short.class
        , java.lang.String.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , short.class
        , short.class
        , short.class
        , short.class
        , short.class
        , java.lang.String.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , short.class
        , short.class
        , short.class
        , short.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , int.class
        , short.class
        , int.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , int.class
        , java.lang.String.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , short.class
        , short.class
        , short.class
        , short.class
        , short.class
        , java.lang.String.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , short.class
        , short.class
        , short.class
        , short.class
        , short.class
        , java.lang.String.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , short.class
        , short.class
        , short.class
        , short.class
        , short.class
        , java.lang.String.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , short.class
        , short.class
        , short.class
        , short.class
        , short.class
        , java.lang.String.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , short.class
        , short.class
        , short.class
        , short.class
        , short.class
        , java.lang.String.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , short.class
        , short.class
        , short.class
        , short.class
        , short.class
        , java.lang.String.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , short.class
        , short.class
        , short.class
        , short.class
        , short.class
        , java.lang.String.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , short.class
        , short.class
        , short.class
        , short.class
        , short.class
        , java.lang.String.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , short.class
        , short.class
        , short.class
        , short.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , int.class
        , short.class
        , int.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , int.class
        , java.lang.String.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , short.class
        , short.class
        , short.class
        , short.class
        , short.class
        , java.lang.String.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , short.class
        , short.class
        , short.class
        , short.class
        , short.class
        , java.lang.String.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , short.class
        , short.class
        , short.class
        , short.class
        , short.class
        , java.lang.String.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , short.class
        , short.class
        , short.class
        , short.class
        , short.class
        , java.lang.String.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , short.class
        , short.class
        , short.class
        , short.class
        , short.class
        , java.lang.String.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , short.class
        , short.class
        , short.class
        , short.class
        , short.class
        , java.lang.String.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , short.class
        , short.class
        , short.class
        , short.class
        , short.class
        , java.lang.String.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , short.class
        , short.class
        , short.class
        , short.class
        , short.class
        , java.lang.String.class
        , short.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , short.class
        , short.class
        , short.class
        , short.class
        , short.class
      }
    );
    }

  }