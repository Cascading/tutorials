package cascading.hadoop.legstar.cobol.hadoop.transform;

import java.nio.ByteBuffer;

public class RdwUtils
  {

  public static final int RDW_LEN = 4;

  private RdwUtils()
    {
    }

  /**
   * RDW is a 4 bytes numeric stored in Big Endian as a binary 2's complement.
   *
   * @param hostData the mainframe data
   * @return the integer value of the RDW
   */
  public static int getRdw( byte[] hostData )
    {
    return getRdw( hostData, 0, hostData.length );
    }

  /**
   * RDW is a 4 bytes numeric stored in Big Endian as a binary 2's complement.
   *
   * @param hostData the mainframe data
   * @param start    where the RDW starts
   * @param length   the total size of the mainframe data
   * @return the integer value of the RDW
   */
  public static int getRdw( byte[] hostData, int start, int length )
    {
    if( length - start < RDW_LEN )
      {
      throw new IllegalArgumentException( "Not enough bytes for an RDW" );
      }
    ByteBuffer buf = ByteBuffer.allocate( RDW_LEN );
    buf.put( 0, hostData[ start + 2 ] );
    buf.put( 1, hostData[ start + 3 ] );
    buf.put( 2, hostData[ start + 0 ] );
    buf.put( 3, hostData[ start + 1 ] );
    return buf.getInt();
    }

  }
