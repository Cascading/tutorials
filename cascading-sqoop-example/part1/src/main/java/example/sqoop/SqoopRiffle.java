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

package example.sqoop;

import cascading.CascadingException;
import cascading.tap.Tap;
import org.apache.hadoop.conf.Configuration;
import riffle.process.DependencyIncoming;
import riffle.process.DependencyOutgoing;
import riffle.process.ProcessComplete;
import riffle.process.ProcessConfiguration;
import riffle.process.ProcessCounters;
import riffle.process.ProcessStart;
import riffle.process.ProcessStop;

import java.beans.ConstructorProperties;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@riffle.process.Process
public class SqoopRiffle
  {

  /** List of source taps */
  private final Collection<Tap> sources;

  /** sink of the Riffle. */
  private final Tap sink;

  private Future<Throwable> future;

  private String url; // URL to the Sqoop Service
  private long jobId; // Target Sqoop Job ID to trigger

  @ConstructorProperties({"sources", "sink", "url", "jobId"})
  public SqoopRiffle( Collection<Tap> sources, Tap sink, String url, long jobId )
    {
    this.sources = sources;
    this.sink = sink;
    this.url = url;
    this.jobId = jobId;
    }

  @ProcessCounters
  public Map<String, Map<String, Long>> processCounters()
    {
    Map<String, Map<String, Long>> counters = new HashMap<String, Map<String, Long>>();
    return counters;
    }

  @ProcessStart
  public void start()
    {
    internalStart();
    }

  /**
   * Custom code we want here. Call external process, APIs, etc.
   */
  private synchronized void internalStart()
    {
    if( future != null )
      return;

    ExecutorService executorService = Executors.newSingleThreadExecutor();
    Callable<Throwable> sqoopJobRunner = new SqoopJobRunner( this.url, this.jobId );
    future = executorService.submit( sqoopJobRunner );
    executorService.shutdown();

    }

  @ProcessStop
  public void stop()
    {
    }

  @ProcessComplete
  public void complete()
    {

    internalStart();

    try
      {
      Throwable throwable = future.get();
      if( throwable != null )
        {
        if( throwable instanceof RuntimeException )
          throw ( (RuntimeException) throwable );
        else
          throw new CascadingException( "exception when future.get() on Sqoop Job", throwable );
        }

      }
    catch( Exception exception )
      {
      throw new CascadingException( "exception while executing Sqoop Job", exception );
      }
    }

  @ProcessConfiguration
  public Configuration getConfiguration()
    {
    return new Configuration(  );
    }

  @DependencyOutgoing
  public Collection outGoing()
    {
    return Collections.unmodifiableCollection( Arrays.asList( sink ) );
    }

  @DependencyIncoming
  public Collection incoming()
    {
    return sources;
    }
  }
