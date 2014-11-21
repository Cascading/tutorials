package cascading.legstar.cobolcopybook.fields;

import java.lang.reflect.Type;

import cascading.tuple.Fields;

public class Field1 extends Fields
  {

  private static final long serialVersionUID = -1L;

  public Field1()
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
