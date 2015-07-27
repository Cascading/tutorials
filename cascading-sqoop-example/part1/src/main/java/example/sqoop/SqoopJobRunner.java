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

import java.util.concurrent.Callable;

import cascading.CascadingException;
import org.apache.sqoop.client.SqoopClient;
import org.apache.sqoop.model.MSubmission;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SqoopJobRunner implements Runnable, Callable<Throwable>
  {

  private static final Logger log = LoggerFactory.getLogger( SqoopJobRunner.class );

  private final String url;
  private final long jobId;

  public SqoopJobRunner( String url, long jobId )
    {
    this.url = url;
    this.jobId = jobId;
    }

  @Override
  public void run()
    {
    // Create sqoop client from Sqop API
    SqoopClient client = new SqoopClient( this.url );
    client.setServerUrl( url );

    //Job submission start
    MSubmission submission = client.startJob( this.jobId );

    // Pass any error execptions upward
    if( submission.getError() != null )
      {
      log.info( "Exception info : " + submission.getError() );
      throw new CascadingException( submission.getError().toString() );
      }

    log.info( "Status : " + submission.getStatus() );
    if( submission.getStatus().isRunning() && submission.getProgress() != -1 )
      {
      log.info( "Progress : " + String.format( "%.2f %%", submission.getProgress() * 100 ) );
      }
    log.info( "Hadoop job id : " + submission.getExternalJobId() );
    log.info( "Job link : " + submission.getExternalLink() );
    }

  @Override
  public Throwable call() throws Exception
    {
    try
      {
      this.run();
      }
    catch( Throwable throwable )
      {
      return throwable;
      }
    return null;
    }

  }
