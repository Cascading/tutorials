package cascading.legstar.cobolcopybook.fields;

import java.lang.reflect.Type;

import cascading.tuple.Fields;

public class Field2 extends Fields
  {

  private static final long serialVersionUID = -1L;

  public Field2()
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
