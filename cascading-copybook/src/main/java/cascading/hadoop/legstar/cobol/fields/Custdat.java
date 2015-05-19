package cascading.hadoop.legstar.cobol.fields;

import java.lang.reflect.Type;

import cascading.tuple.Fields;

public class Custdat extends Fields
  {

  private static final long serialVersionUID = -1L;

  public Custdat()
    {
    super( new Comparable[]{"CustomerId", "CustomerName", "CustomerAddress", "CustomerPhone", "TransactionNbr", "TransactionDay_0", "Filler13_0", "TransactionMonth_0", "Filler15_0", "TransactionYear_0", "TransactionAmount_0", "TransactionComment_0", "TransactionDay_1", "Filler13_1", "TransactionMonth_1", "Filler15_1", "TransactionYear_1", "TransactionAmount_1", "TransactionComment_1", "TransactionDay_2", "Filler13_2", "TransactionMonth_2", "Filler15_2", "TransactionYear_2", "TransactionAmount_2", "TransactionComment_2", "TransactionDay_3", "Filler13_3", "TransactionMonth_3", "Filler15_3", "TransactionYear_3", "TransactionAmount_3", "TransactionComment_3", "TransactionDay_4", "Filler13_4", "TransactionMonth_4", "Filler15_4", "TransactionYear_4", "TransactionAmount_4", "TransactionComment_4"}, new Type[]{long.class, String.class, String.class, String.class, long.class, String.class, String.class, String.class, String.class, String.class, java.math.BigDecimal.class, String.class, String.class, String.class, String.class, String.class, String.class, java.math.BigDecimal.class, String.class, String.class, String.class, String.class, String.class, String.class, java.math.BigDecimal.class, String.class, String.class, String.class, String.class, String.class, String.class, java.math.BigDecimal.class, String.class, String.class, String.class, String.class, String.class, String.class, java.math.BigDecimal.class, String.class} );
    }

  }
