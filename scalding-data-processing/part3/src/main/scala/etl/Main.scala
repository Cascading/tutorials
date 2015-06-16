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

package etl

import com.twitter.scalding._
import cascading.tuple.{Fields, TupleEntry}
import scala.util.matching.Regex

class Main( args: Args ) extends Job( args )
  {

  val input = TextLine( args( "input" ) )
  val output = Tsv( args( "output" ) )

  val inputFields = 'line
  val regexFields = ('ip, 'time, 'request, 'response, 'size)

  val filteredInput = input.read.mapTo( 'line -> regexFields )
    { te: TupleEntry =>
      val regex = new Regex( "^([^ ]*) \\S+ \\S+ \\[([\\w:/]+\\s[+\\-]\\d{4})\\] \"(.+?)\" (\\d{3}) ([^ ]*).*$" )
      val split = regex.findFirstMatchIn( te.getString( "line" ) ).get.subgroups
      (split( 0 ), split( 1 ), split( 2 ), split( 3 ), split( 4 ))
    }.filterNot( 'size )
    { size: String => size == "-"}

  val branch1 = new RichPipe( filteredInput )
  val branch2 = new RichPipe( filteredInput )

  val processedBranch1 = branch1.filterNot( 'request )
    { req: String => req == "GET /images/"}.project( 'ip ).unique( 'ip )

  processedBranch1.write( output )

  }

