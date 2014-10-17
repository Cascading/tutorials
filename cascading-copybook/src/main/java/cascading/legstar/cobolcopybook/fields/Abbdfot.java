package cascading.legstar.cobolcopybook.fields;

import java.lang.reflect.Type;

import cascading.tuple.Fields;

public class Abbdfot extends Fields
  {

  private static final long serialVersionUID = -1L;

  public Abbdfot()
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
