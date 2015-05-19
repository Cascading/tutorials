/*
 * Copyright (c) 2007-2015 Concurrent, Inc. All Rights Reserved.
 *
 * Project and contact information: http://www.cascading.org/
 *
 * This file is part of the Cascading project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package mr;

import java.io.IOException;
import java.util.*;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.conf.*;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapred.*;
import org.apache.hadoop.util.*;

import cascading.flow.hadoop.MapReduceFlow;
import cascading.property.AppProps;

public class WordCount
  {

  public static class Map extends MapReduceBase implements Mapper<LongWritable, Text, Text, IntWritable>
    {
    private final static IntWritable one = new IntWritable( 1 );
    private Text word = new Text();

    public void map( LongWritable key, Text value, OutputCollector<Text, IntWritable> output, Reporter reporter ) throws IOException
      {
      String line = value.toString();
      StringTokenizer tokenizer = new StringTokenizer( line );
      while( tokenizer.hasMoreTokens() )
        {
        word.set( tokenizer.nextToken() );
        output.collect( word, one );
        }
      }
    }

  public static class Reduce extends MapReduceBase implements Reducer<Text, IntWritable, Text, IntWritable>
    {
    public void reduce( Text key, Iterator<IntWritable> values, OutputCollector<Text, IntWritable> output, Reporter reporter ) throws IOException
      {
      int sum = 0;
      while( values.hasNext() )
        {
        sum += values.next().get();
        }
      output.collect( key, new IntWritable( sum ) );
      }
    }

  public static void main( String[] args ) throws Exception
    {

    Properties properties = new Properties();
    AppProps.addApplicationTag( properties, "tutorials" );
    AppProps.addApplicationTag( properties, "cluster:development" );
    AppProps.setApplicationName( properties, "cascading-mapreduce-flow" );

    JobConf conf = new JobConf( WordCount.class );
    conf.setJobName( "casading-mapreduce-flow" );

    conf.setOutputKeyClass( Text.class );
    conf.setOutputValueClass( IntWritable.class );

    conf.setMapperClass( Map.class );
    conf.setCombinerClass( Reduce.class );
    conf.setReducerClass( Reduce.class );

    conf.setInputFormat( TextInputFormat.class );
    conf.setOutputFormat( TextOutputFormat.class );

    FileInputFormat.setInputPaths( conf, new Path( args[ 0 ] ) );
    FileOutputFormat.setOutputPath( conf, new Path( args[ 1 ] ) );

    MapReduceFlow flow = new MapReduceFlow( "wordcount", conf, true );

    // JobClient.runJob(conf);
    flow.complete();

    }
  }
