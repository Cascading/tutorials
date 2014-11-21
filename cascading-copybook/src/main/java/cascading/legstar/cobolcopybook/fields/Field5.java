package cascading.legstar.cobolcopybook.fields;

import java.lang.reflect.Type;

import cascading.tuple.Fields;

public class Field5 extends Fields
  {

  private static final long serialVersionUID = -1L;

  public Field5()
    {
    super(
      new Comparable[]{
        "Ogp04LbloanMat"
        , "Ogp04Repamt"
        , "Ogp04Repfreq"
        , "Ogp04Repdte"
        , "Ogp04Reptyp"
        , "Ogp04Borrow"
        , "Ogp04Amtsanc"
        , "Ogp04MirasDate"
      }, new Type[]{
        java.lang.String.class
        , java.math.BigDecimal.class
        , short.class
        , java.lang.String.class
        , short.class
        , short.class
        , java.math.BigDecimal.class
        , java.lang.String.class
      }
    );
    }

  }
