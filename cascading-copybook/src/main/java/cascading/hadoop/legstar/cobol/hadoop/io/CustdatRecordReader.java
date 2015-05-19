package cascading.hadoop.legstar.cobol.hadoop.io;

import java.io.EOFException;
import java.io.IOException;

import cascading.hadoop.legstar.cobol.hadoop.transform.RdwUtils;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.ArrayPrimitiveWritable;
import org.apache.hadoop.mapred.FileSplit;
import org.apache.hadoop.mapred.InputSplit;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.RecordReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A hadoop mr1 {@link org.apache.hadoop.mapred.RecordReader} tailored for file BDE27.
 * <p/>
 * The key produced is a {@link ArrayPrimitiveWritable} and corresponds to the
 * common data in the incoming file, without the RDW as unconverted mainframe
 * bytes.
 * <p/>
 * The value is a {@link ArrayPrimitiveWritable} that contains a a complete
 * record as unconverted mainframe bytes.
 */
public class CustdatRecordReader implements RecordReader<ArrayPrimitiveWritable, ArrayPrimitiveWritable>
  {

  private static Logger log = LoggerFactory.getLogger( CustdatRecordReader.class );

  // Start and end positions of current split
  private long start = 0;
  private long end = 0;

  // Number of logical records produced (one per account)
  private long recordNum = 0;

  // Number of bytes read from the incoming file
  private long bytesRead = 0;

  // Incoming file holding mainframe data
  private FSDataInputStream filein;

  int commonDataLen;
  byte[] commonDataBytes;
  boolean isInitCommonData;

  public void initialize( InputSplit genericSplit, JobConf jobConf ) throws IOException
    {

    commonDataLen = 10; // FIXME given by CustdatRecordMatcher really
    commonDataBytes = new byte[ commonDataLen ];

    // Retrieve the split to be processed
    FileSplit split = (FileSplit) genericSplit;
    final Path file = split.getPath();
    start = split.getStart();
    end = start + split.getLength();

    // Open incoming file
    FileSystem fs = file.getFileSystem( jobConf );
    filein = fs.open( split.getPath() );

    // Position at start of record
    if( start == 0 )
      {
      // This is the first split
      read( filein, commonDataBytes );
      }
    else
      {
      // This is a subsequent split
      --start;
      filein.seek( start );

      // Position at the start of a Kcp01v05 type record
      positionAtRecordStart();
      }

    // Indicates common data was already read from incoming file
    isInitCommonData = true;

    log.info( "CustdatByteArrayRecordReader#initialize" + ", thread=" + Thread.currentThread().getName() + ", start=" + start + ", end=" + end + ", length=" + split.getLength() + ", Record at pos=" + bytesRead );

    }

  /**
   * Match incoming data with the start of record pattern.
   * <p/>
   * After the initial try, slides one byte at a time until the start of a
   * record is found.
   *
   * @throws java.io.IOException
   */
  private void positionAtRecordStart() throws IOException
    {
    read( filein, commonDataBytes );
    CustdatRecordMatcher matcher = new CustdatRecordMatcher();
    while( true )
      {
      if( matcher.match( commonDataBytes ) > -1 )
        {
        return;
        }
      // Shift the buffer one byte to the left
      System.arraycopy( commonDataBytes, 1, commonDataBytes, 0, commonDataBytes.length - 1 );

      // Read one byte at end of buffer
      filein.read( commonDataBytes, commonDataBytes.length - 1, 1 );
      bytesRead++;
      }
    }

  public boolean next( ArrayPrimitiveWritable key, ArrayPrimitiveWritable value ) throws IOException
    {

    if( key == null )
      {
      throw new IllegalArgumentException( "Key parameter is null" );
      }
    if( value == null )
      {
      throw new IllegalArgumentException( "Value parameter is null" );
      }

    // If we have already read all bytes from this split, time to stop
    if( bytesRead >= ( end - start ) )
      {
      return false;
      }

    // On first pass, data for the common structure would have been
    // already read off the file
    if( isInitCommonData )
      {
      isInitCommonData = false;
      }
    else
      {
      commonDataBytes = read( filein, commonDataLen );
      }
    if( commonDataBytes == null )
      {
      return false;
      }
    key.set( commonDataBytes );
    int rdw = RdwUtils.getRdw( commonDataBytes );

    int subRecordLen = rdw - commonDataLen;

    byte[] hostData = read( filein, subRecordLen );
    if( hostData == null )
      {
      throw new IOException( "Record is truncated (Found common data but nothing follows)" );
      }
    value.set( hostData );

    recordNum++;

    return true;
    }

  public ArrayPrimitiveWritable createKey()
    {
    return new ArrayPrimitiveWritable( byte.class );
    }

  public ArrayPrimitiveWritable createValue()
    {
    return new ArrayPrimitiveWritable( byte.class );
    }

  public float getProgress()
    {
    if( start == end )
      {
      return 0.0f;
      }
    else
      {
      return Math.min( 1.0f, bytesRead / (float) ( end - start ) );
      }
    }

  public long getPos()
    {
    return bytesRead;
    }

  public void close() throws IOException
    {
    log.info( "CustdatByteArrayRecordReader#close" + ", thread=" + Thread.currentThread().getName() + ", start=" + start + ", end=" + end + ", total bytes read=" + bytesRead + ", record produced=" + recordNum );
    if( filein != null )
      {
      filein.close();
      }
    }

  private byte[] read( FSDataInputStream is, int hostDataLen ) throws IOException
    {
    try
      {
      byte[] hostData = new byte[ hostDataLen ];
      read( is, hostData );
      return hostData;
      }
    catch( EOFException e )
      {
      return null;
      }
    }

  /**
   * Read enough bytes from incoming stream to fill a given buffer.
   * <p/>
   * Increment global bytes read counter.
   *
   * @param is       incoming mainframe file
   * @param hostData buffer to fill
   * @throws java.io.IOException
   */
  private void read( FSDataInputStream is, byte[] hostData ) throws IOException
    {
    is.readFully( hostData );
    bytesRead += hostData.length;
    }
  }
