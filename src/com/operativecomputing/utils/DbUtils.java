/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.operativecomputing.utils;

import java.sql.*;

/**
 *
 * @author steve.linck
 */
public class DbUtils {
    
private static String DBConnection = "";
private static String SqlQry = "";
private static String dbURL = "";
private static String dbDriver = "";

private static Connection conn;
private static Statement sqlStmnt;
private static ResultSet rs;
private static PreparedStatement prepStmt;


    public static boolean ConnectDB(String dbType, String dbUser, 
                          String dbPassword, String dbHost, String dbPort, String dbName) {

// Future Proof for different database types
        
        if (dbType.equalsIgnoreCase("MSSQL")) {
            dbDriver = "com.microsoft.jdbc.sqlserver.SQLServerDriver";
            dbURL = "jdbc:sqlserver://" + dbHost + ":" + dbPort + 
                    ";DatabaseName=" + dbName;
        }
        
        if (dbType.equalsIgnoreCase("ORACLE")) {
            dbDriver = "oracle.jdbc.OracleDriver";
            dbURL = "";
        }
        
        if (dbType.equalsIgnoreCase("SQLITE")) {
            dbDriver = "";
            dbURL = "";
        }
        
        try {
            //Class.forName(dbDriver);
            conn = DriverManager.getConnection(dbURL, dbUser, dbPassword);
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }

        return true;
    }

    public static Connection getConnection() {
        return conn;
    }
    
}
