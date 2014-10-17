package cascading.legstar.cobolcopybook.fields;

import java.lang.reflect.Type;

import cascading.tuple.Fields;

public class Abbdfoc extends Fields
  {

  private static final long serialVersionUID = -1L;

  public Abbdfoc()
    {
    super(
      new Comparable[]{
        "BdfoLen"
        , "BdfoKey"
        , "BdfoParmNo"
      }, new Type[]{
        short.class
        , long.class
        , int.class
      }
    );
    }

  }
