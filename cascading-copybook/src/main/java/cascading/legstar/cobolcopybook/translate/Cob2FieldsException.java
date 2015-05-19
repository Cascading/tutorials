package cascading.legstar.cobolcopybook.translate;

import java.io.IOException;

public class Cob2FieldsException extends IOException
  {

  private static final long serialVersionUID = 4656496860697582974L;

  public Cob2FieldsException( final String message )
    {
    super( message );
    }

  public Cob2FieldsException( final String message, Throwable cause )
    {
    super( message, cause );
    }

  public Cob2FieldsException( Throwable cause )
    {
    super( cause );
    }

  }
