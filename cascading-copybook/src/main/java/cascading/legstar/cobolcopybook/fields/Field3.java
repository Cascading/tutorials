package cascading.legstar.cobolcopybook.fields;

import java.lang.reflect.Type;

import cascading.tuple.Fields;

public class Field3 extends Fields
  {

  private static final long serialVersionUID = -1L;

  public Field3()
    {
    super(
      new Comparable[]{
        "BdfoFileTally"
        , "BdfoFileHash"
        , "BdfoNumAccountsSelected"
      }, new Type[]{
        int.class
        , int.class
        , int.class
      }
    );
    }

  }
