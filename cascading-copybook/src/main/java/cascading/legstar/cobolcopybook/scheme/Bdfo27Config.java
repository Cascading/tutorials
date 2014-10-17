package cascading.legstar.cobolcopybook.scheme;

import java.util.Map;

import cascading.legstar.cobolcopybook.beans.abbdfoc.bind.BdfoCommonDataBinding;
import cascading.legstar.cobolcopybook.beans.kc3ogp03.Ogp03AccountTaxData;
import cascading.legstar.cobolcopybook.beans.kc3ogp04.Ogp04RepaymentData;
import cascading.legstar.cobolcopybook.beans.kc3ogp06.Ogp06ReferralData;
import cascading.legstar.cobolcopybook.beans.kcp01v05.Kcp01V05AccountDetails;
import cascading.legstar.cobolcopybook.beans.kcp02v05.Kcp02V05AccountStatus;
import cascading.legstar.cobolcopybook.beans.kcp05v10.Kcp05V10ProfileMarkers;
import cascading.legstar.cobolcopybook.beans.kcp07v05.Kcp07V05BalDetails;
import cascading.legstar.cobolcopybook.beans.kcp08v05.Kcp08V05AuthLimits;
import cascading.legstar.cobolcopybook.beans.kcp09v05.Kcp09V05OtherLimits;
import cascading.legstar.cobolcopybook.beans.kcp13v05.Kcp13V05NotifDiaryFormat;
import cascading.legstar.cobolcopybook.beans.kcp16v05.Kcp16V05ProdAgreeStmtHist;
import cascading.legstar.cobolcopybook.beans.kcp17v05.Kcp17V05AccAddresses;
import cascading.legstar.cobolcopybook.beans.kcp18v05.Kcp18V05AccLongName;
import cascading.legstar.cobolcopybook.beans.kcp83v05.Kcp83V05InterestRewardData;
import cascading.legstar.cobolcopybook.beans.kcp93v05.Kcp93V05AccLevelCrint;
import cascading.legstar.cobolcopybook.beans.kcp94v05.Kcp94V05AccLevelCrint;
import cascading.legstar.cobolcopybook.beans.kcp96v05.Kcp96V05AccLevelDrint;
import cascading.legstar.cobolcopybook.beans.kcp97v05.Kcp97V05DrintRates;
import cascading.legstar.cobolcopybook.fields.Abbdfoc;
import cascading.legstar.cobolcopybook.fields.Kc3ogp03;
import cascading.legstar.cobolcopybook.fields.Kc3ogp04;
import cascading.legstar.cobolcopybook.fields.Kc3ogp06;
import cascading.legstar.cobolcopybook.fields.Kcp01v05;
import cascading.legstar.cobolcopybook.fields.Kcp02v05;
import cascading.legstar.cobolcopybook.fields.Kcp05v10;
import cascading.legstar.cobolcopybook.fields.Kcp07v05;
import cascading.legstar.cobolcopybook.fields.Kcp08v05;
import cascading.legstar.cobolcopybook.fields.Kcp09v05;
import cascading.legstar.cobolcopybook.fields.Kcp13v05;
import cascading.legstar.cobolcopybook.fields.Kcp16v05;
import cascading.legstar.cobolcopybook.fields.Kcp17v05;
import cascading.legstar.cobolcopybook.fields.Kcp18v05;
import cascading.legstar.cobolcopybook.fields.Kcp83v05;
import cascading.legstar.cobolcopybook.fields.Kcp93v05;
import cascading.legstar.cobolcopybook.fields.Kcp94v05;
import cascading.legstar.cobolcopybook.fields.Kcp96v05;
import cascading.legstar.cobolcopybook.fields.Kcp97v05;
import cascading.tuple.Fields;
import com.google.common.collect.Maps;

/**
 * Immutable class that holds the static configuration data needed by {@link Bdfo27Scheme}
 */
public class Bdfo27Config
  {

  /** Associates a sub record with a legstar generated java bean class. */
  private final Map<String, Class<?>> beans = Maps.newLinkedHashMap();

  /** Associates a sub record with a cascading field. */
  private final Map<String, Fields> fields = Maps.newLinkedHashMap();

  private final Fields commonDataFields = new Abbdfoc();

  /** The fixed size of the common area in all bdfo27 records. */
  private final int bdfoCommonDataLen;

  public Bdfo27Config()
    {

    beans.put( "Kcp01v05", Kcp01V05AccountDetails.class );
    beans.put( "Kcp02v05", Kcp02V05AccountStatus.class );
    beans.put( "Kc3ogp03", Ogp03AccountTaxData.class );
    beans.put( "Kc3ogp04", Ogp04RepaymentData.class );
    beans.put( "Kcp05v10", Kcp05V10ProfileMarkers.class );
    beans.put( "Kc3ogp06", Ogp06ReferralData.class );
    beans.put( "Kcp07v05", Kcp07V05BalDetails.class );
    beans.put( "Kcp08v05", Kcp08V05AuthLimits.class );
    beans.put( "Kcp09v05", Kcp09V05OtherLimits.class );
    beans.put( "Kcp13v05", Kcp13V05NotifDiaryFormat.class );
    beans.put( "Kcp16v05", Kcp16V05ProdAgreeStmtHist.class );
    beans.put( "Kcp17v05", Kcp17V05AccAddresses.class );
    beans.put( "Kcp18v05", Kcp18V05AccLongName.class );
    beans.put( "Kcp93v05", Kcp93V05AccLevelCrint.class );
    beans.put( "Kcp94v05", Kcp94V05AccLevelCrint.class );
    beans.put( "Kcp96v05", Kcp96V05AccLevelDrint.class );
    beans.put( "Kcp97v05", Kcp97V05DrintRates.class );
    beans.put( "Kcp83v05", Kcp83V05InterestRewardData.class );

    fields.put( "Kcp01v05", new Kcp01v05() );
    fields.put( "Kcp02v05", new Kcp02v05() );
    fields.put( "Kc3ogp03", new Kc3ogp03() );
    fields.put( "Kc3ogp04", new Kc3ogp04() );
    fields.put( "Kcp05v10", new Kcp05v10() );
    fields.put( "Kc3ogp06", new Kc3ogp06() );
    fields.put( "Kcp07v05", new Kcp07v05() );
    fields.put( "Kcp08v05", new Kcp08v05() );
    fields.put( "Kcp09v05", new Kcp09v05() );
    fields.put( "Kcp13v05", new Kcp13v05() );
    fields.put( "Kcp16v05", new Kcp16v05() );
    fields.put( "Kcp17v05", new Kcp17v05() );
    fields.put( "Kcp18v05", new Kcp18v05() );
    fields.put( "Kcp93v05", new Kcp93v05() );
    fields.put( "Kcp94v05", new Kcp94v05() );
    fields.put( "Kcp96v05", new Kcp96v05() );
    fields.put( "Kcp97v05", new Kcp97v05() );
    fields.put( "Kcp83v05", new Kcp83v05() );

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
