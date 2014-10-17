/*
 * Copyright (c) 2007-2014 Concurrent, Inc. All Rights Reserved.
 *
 * Project and contact information: http://www.cascading.org/
 *
 * This file is part of the Cascading project.
 */

package hivedemo.part2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 */
public class HQLTests
  {

  public static void main( String[] args ) throws Exception
    {


    String joinFullQuery = "SELECT i.i_category, COUNT(DISTINCT sc.cs_item_sk) AS quantity_sold, " +
      "COUNT(DISTINCT rc.cr_item_sk) AS quantity_returned " +
      "FROM items AS i " +
      "INNER JOIN sales_catalog AS sc ON (sc.cs_item_sk = i.i_item_sk) " +
      "INNER JOIN returns_catalog AS rc ON (rc.cr_item_sk = i.i_item_sk) " +
      "GROUP BY i.i_category " +
      "ORDER BY quantity_sold DESC " +
      "LIMIT 10";

    String joinSalesQuery = "SELECT i.i_category, COUNT(sc.cs_item_sk) AS quantity_sold " +
      "FROM items AS i " +
      "INNER JOIN sales_catalog AS sc ON (sc.cs_item_sk = i.i_item_sk) " +
      "GROUP BY i.i_category " +
      "ORDER BY quantity_sold DESC " +
      "LIMIT 10";

    String joinReturnQuery = "SELECT i.i_category, " +
      "COUNT(rc.cr_item_sk) AS quantity_returned " +
      "FROM items AS i " +
      "INNER JOIN returns_catalog AS rc ON (rc.cr_item_sk = i.i_item_sk) " +
      "GROUP BY i.i_category " +
      "ORDER BY quantity_returned DESC " +
      "LIMIT 10";


    Class.forName( "org.apache.hadoop.hive.jdbc.HiveDriver" );
    Connection con1 = DriverManager.getConnection( "jdbc:hive://", "", "" );
    Connection con2 = DriverManager.getConnection( "jdbc:hive://", "", "" );
    Connection con3 = DriverManager.getConnection( "jdbc:hive://", "", "" );

    Statement stmt1 = con1.createStatement();
    Statement stmt2 = con2.createStatement();
    Statement stmt3 = con3.createStatement();

    ResultSet rs1 = stmt1.executeQuery( joinFullQuery );
    //ResultSet rs2 = stmt2.executeQuery( topReturnedQuery );

    ResultSet rs2 = stmt2.executeQuery( joinSalesQuery );
    ResultSet rs3 = stmt3.executeQuery( joinReturnQuery );


    System.out.println( "----------------------Hive JDBC - full join --------------------------" );
    System.out.println( "***********  FULL JOIN  ************" );
    while( rs1.next() )
      System.out.printf( "data from hive table copy: i_item)sk=%s, quantity_sold=%s, quantity_returned=%s\n", rs1.getString( 1 ), rs1.getString( 2 ), rs1.getString( 3 ) );

    System.out.println( "---------------------------------------------------------\n\n" );


    System.out.println( "----------------------Hive JDBC - sales join --------------------------" );
    System.out.println( "*********** SALES JOIN  ************" );
    while( rs2.next() )
      System.out.printf( "data from hive table copy: i_item)sk=%s, quantity=%s\n", rs2.getString( 1 ), rs2.getString( 2 ) );

    System.out.println( "---------------------------------------------------------\n\n" );

    System.out.println( "----------------------Hive JDBC - returns join --------------------------" );
    System.out.println( "***********  RETURNS JOIN  ************" );
    while( rs3.next() )
      System.out.printf( "data from hive table copy: i_item)sk=%s, quantity_sold=%s\n", rs3.getString( 1 ), rs3.getString( 2 ) );//, rs3.getString( 3 ) );

    System.out.println( "---------------------------------------------------------\n\n" );

    System.out.println( "*** PROCESS COMPLETE! *** " );

    stmt1.close();
    stmt2.close();
    stmt3.close();

    con1.close();
    con2.close();
    con3.close();
    }
  }
