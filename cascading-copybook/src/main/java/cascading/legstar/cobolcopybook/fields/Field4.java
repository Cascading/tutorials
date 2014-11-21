package cascading.legstar.cobolcopybook.fields;

import java.lang.reflect.Type;

import cascading.tuple.Fields;

public class Field4 extends Fields
  {

  private static final long serialVersionUID = -1L;

  public Field4()
    {
    super(
      new Comparable[]{
        "Ogp03TaxReliefTypeInd"
        , "Ogp03Earner"
        , "Ogp03TaxcertHeld"
        , "Ogp03VatMarker"
        , "Ogp03PartiesToAccount"
        , "Ogp03IntCertIss"
        , "Ogp03OresCode"
      }, new Type[]{
        short.class
        , short.class
        , java.lang.String.class
        , short.class
        , short.class
        , short.class
        , short.class
      }
    );
    }

  }
