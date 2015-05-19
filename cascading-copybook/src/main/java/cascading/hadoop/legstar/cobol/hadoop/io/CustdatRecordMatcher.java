package cascading.hadoop.legstar.cobol.hadoop.io;

import cascading.hadoop.legstar.cobol.hadoop.transform.RdwUtils;

/**
 * Encapsulates the logic that lookup the start of a record within the incoming
 * mainframe data.
 * <p/>
 * This assumes there is a unique signature that identifies the record start.
 */
public class CustdatRecordMatcher
  {

  /**
   * Lookup for the signature of the CUSTOMER-DATA record.
   *
   * @param hostData the incoming host data where the matching pattern might
   *                 appear
   * @return the position of the match or -1 if there is no match
   */
  public int match( byte[] hostData )
    {
    return match( hostData, 0, hostData.length );
    }

  /**
   * Lookup for the signature of the CUSTOMER-DATA record preceded by a RDW.
   *
   * @param hostData the incoming host data where the matching pattern might
   *                 appear
   * @param start    where to start looking in the incoming host data
   * @param length   where to stop looking in the incoming host data
   * @return the position of the match or -1 if there is no match
   */
  public int match( byte[] hostData, int start, int length )
    {

    int pos = start;
    while( length - pos >= 10 )
      {
      if( doMatch( hostData, pos, length ) )
        {
        return pos;
        }
      pos++;
      }
    return -1;

    }

  /**
   * The 10 first bytes of a record are laid out like this:
   * <ul>
   * <li>First 4 bytes are an integer with a value between 62 and 185</li>
   * <li>Next 6 characters are EBCDIC digits</li>
   * </ul>
   *
   * @param hostData the bytes to test for a match
   * @param start    where to start matching
   * @param length   total length of the buffer
   * @return true if the start position matches the start of a CUSTOMER-DATA
   * record.
   */
  private static boolean doMatch( byte[] hostData, int start, int length )
    {
    int rdw = RdwUtils.getRdw( hostData, start, length );
    if( rdw < 62 || rdw > 185 )
      {
      return false;
      }
    for( int i = start + 4; i < start + 10; i++ )
      {
      int v = hostData[ i ] & 0xFF;
      if( v < 240 || v > 249 )
        {
        return false;
        }
      }
    return true;
    }

  }
