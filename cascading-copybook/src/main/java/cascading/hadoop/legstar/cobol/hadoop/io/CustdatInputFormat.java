package cascading.hadoop.legstar.cobol.hadoop.io;

import java.io.IOException;

import org.apache.hadoop.io.ArrayPrimitiveWritable;
import org.apache.hadoop.mapred.FileInputFormat;
import org.apache.hadoop.mapred.InputSplit;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.RecordReader;
import org.apache.hadoop.mapred.Reporter;


public class CustdatInputFormat extends FileInputFormat<ArrayPrimitiveWritable, ArrayPrimitiveWritable>
  {

  public RecordReader<ArrayPrimitiveWritable, ArrayPrimitiveWritable> getRecordReader( InputSplit split, JobConf jobConf, Reporter reporter ) throws IOException
    {
    CustdatRecordReader reader = new CustdatRecordReader();
    reader.initialize( split, jobConf );
    return reader;
    }

  }
