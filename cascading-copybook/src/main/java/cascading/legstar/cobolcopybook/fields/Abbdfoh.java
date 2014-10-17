package cascading.legstar.cobolcopybook.fields;

import java.lang.reflect.Type;

import cascading.tuple.Fields;

public class Abbdfoh extends Fields
  {

  private static final long serialVersionUID = -1L;

  public Abbdfoh()
    {
    super(
      new Comparable[]{
        "BdfoRundate"
        , "BdfoFileId"
        , "BdfoCentreId"
        , "BdfoSbiFileInd"
        , "BdfoDenReturned"
      }, new Type[]{
        java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
        , java.lang.String.class
      }
    );
    }

  }
