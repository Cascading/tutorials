package cascading.legstar.cobolcopybook.scheme;

import java.util.Map;

import cascading.legstar.cobolcopybook.beans.bean1.bind.BdfoCommonDataBinding;
import cascading.legstar.cobolcopybook.beans.bean10.Kcp07V05BalDetails;
import cascading.legstar.cobolcopybook.beans.bean11.Kcp08V05AuthLimits;
import cascading.legstar.cobolcopybook.beans.bean12.Kcp09V05OtherLimits;
import cascading.legstar.cobolcopybook.beans.bean13.Kcp13V05NotifDiaryFormat;
import cascading.legstar.cobolcopybook.beans.bean14.Kcp16V05ProdAgreeStmtHist;
import cascading.legstar.cobolcopybook.beans.bean15.Kcp17V05AccAddresses;
import cascading.legstar.cobolcopybook.beans.bean16.Kcp18V05AccLongName;
import cascading.legstar.cobolcopybook.beans.bean17.Kcp83V05InterestRewardData;
import cascading.legstar.cobolcopybook.beans.bean18.Kcp93V05AccLevelCrint;
import cascading.legstar.cobolcopybook.beans.bean19.Kcp94V05AccLevelCrint;
import cascading.legstar.cobolcopybook.beans.bean20.Kcp96V05AccLevelDrint;
import cascading.legstar.cobolcopybook.beans.bean21.Kcp97V05DrintRates;
import cascading.legstar.cobolcopybook.beans.bean4.Ogp03AccountTaxData;
import cascading.legstar.cobolcopybook.beans.bean5.Ogp04RepaymentData;
import cascading.legstar.cobolcopybook.beans.bean6.Ogp06ReferralData;
import cascading.legstar.cobolcopybook.beans.bean7.Kcp01V05AccountDetails;
import cascading.legstar.cobolcopybook.beans.bean8.Kcp02V05AccountStatus;
import cascading.legstar.cobolcopybook.beans.bean9.Kcp05V10ProfileMarkers;
import cascading.legstar.cobolcopybook.fields.Field1;
import cascading.legstar.cobolcopybook.fields.Field10;
import cascading.legstar.cobolcopybook.fields.Field11;
import cascading.legstar.cobolcopybook.fields.Field12;
import cascading.legstar.cobolcopybook.fields.Field13;
import cascading.legstar.cobolcopybook.fields.Field14;
import cascading.legstar.cobolcopybook.fields.Field15;
import cascading.legstar.cobolcopybook.fields.Field16;
import cascading.legstar.cobolcopybook.fields.Field17;
import cascading.legstar.cobolcopybook.fields.Field18;
import cascading.legstar.cobolcopybook.fields.Field19;
import cascading.legstar.cobolcopybook.fields.Field20;
import cascading.legstar.cobolcopybook.fields.Field21;
import cascading.legstar.cobolcopybook.fields.Field4;
import cascading.legstar.cobolcopybook.fields.Field5;
import cascading.legstar.cobolcopybook.fields.Field6;
import cascading.legstar.cobolcopybook.fields.Field7;
import cascading.legstar.cobolcopybook.fields.Field8;
import cascading.legstar.cobolcopybook.fields.Field9;
import cascading.tuple.Fields;
import com.google.common.collect.Maps;

/**
 * Immutable class that holds the static configuration data needed by {@link CopybookScheme}
 */
public class CopybookConfig
  {

  /**
   * Associates a sub record with a legstar generated java bean class.
   */
  private final Map<String, Class<?>> beans = Maps.newLinkedHashMap();

  /**
   * Associates a sub record with a cascading field.
   */
  private final Map<String, Fields> fields = Maps.newLinkedHashMap();

  private final Fields commonDataFields = new Field1();

  /**
   * The fixed size of the common area in all bdfo27 records.
   */
  private final int bdfoCommonDataLen;

  public CopybookConfig()
    {

    beans.put( "Field7", Kcp01V05AccountDetails.class );
    beans.put( "Field8", Kcp02V05AccountStatus.class );
    beans.put( "Field4", Ogp03AccountTaxData.class );
    beans.put( "Field5", Ogp04RepaymentData.class );
    beans.put( "Field9", Kcp05V10ProfileMarkers.class );
    beans.put( "Field6", Ogp06ReferralData.class );
    beans.put( "Field10", Kcp07V05BalDetails.class );
    beans.put( "Field11", Kcp08V05AuthLimits.class );
    beans.put( "Field12", Kcp09V05OtherLimits.class );
    beans.put( "Field13", Kcp13V05NotifDiaryFormat.class );
    beans.put( "Field14", Kcp16V05ProdAgreeStmtHist.class );
    beans.put( "Field15", Kcp17V05AccAddresses.class );
    beans.put( "Field16", Kcp18V05AccLongName.class );
    beans.put( "Field18", Kcp93V05AccLevelCrint.class );
    beans.put( "Field19", Kcp94V05AccLevelCrint.class );
    beans.put( "Field20", Kcp96V05AccLevelDrint.class );
    beans.put( "Field21", Kcp97V05DrintRates.class );
    beans.put( "Field17", Kcp83V05InterestRewardData.class );

    fields.put( "Field7", new Field7() );
    fields.put( "Field8", new Field8() );
    fields.put( "Field4", new Field4() );
    fields.put( "Field5", new Field5() );
    fields.put( "Field9", new Field9() );
    fields.put( "Field6", new Field6() );
    fields.put( "Field10", new Field10() );
    fields.put( "Field11", new Field11() );
    fields.put( "Field12", new Field12() );
    fields.put( "Field13", new Field13() );
    fields.put( "Field14", new Field14() );
    fields.put( "Field15", new Field15() );
    fields.put( "Field16", new Field16() );
    fields.put( "Field18", new Field18() );
    fields.put( "Field19", new Field19() );
    fields.put( "Field20", new Field20() );
    fields.put( "Field21", new Field21() );
    fields.put( "Field17", new Field17() );

    this.bdfoCommonDataLen = new BdfoCommonDataBinding().getByteLength();

    }

  public Map<String, Class<?>> getBeans()
    {
    return beans;
    }

  public Map<String, Fields> getFields()
    {
    return fields;
    }

  public Fields getCommonDataFields()
    {
    return commonDataFields;
    }

  public int getBdfoCommonDataLen()
    {
    return bdfoCommonDataLen;
    }

  }
