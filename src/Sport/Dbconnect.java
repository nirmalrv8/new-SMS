/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sport;

import java.sql.*;
//import java.sql.Connection;
import javax.swing.JOptionPane;

public class Dbconnect {
    
        public static  Connection con = null;

    public static Connection connect() 
    {
        String strHost = "localhost";
        String iPort = "3306";
        String strDBName = "mydb";
        String strUserName = "root";
        String strPassword = "";

        try {
            //loading mysql jdbc driver
            Class.forName("com.mysql.jdbc.Driver");
            //connection string
            //establishing connection
            con = DriverManager.getConnection("jdbc:mysql://localhost/sms1","root","");
          //  JOptionPane.showMessageDialog(null, "hhhh");
            
            return con;
            //successfully connected
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "\n Database not accessible..please try again.", "DB Connection Failure", 1);
            return null;
        }



    }

    public void closeConnection(Connection dbCon) {
        try {
            dbCon.close(); //close connection
        } catch (Exception e) {
        }
    }

   public int executeNonQuery(String sqlString)
    {
        try {
            Statement stmt = con.createStatement();
            int rows = stmt.executeUpdate(sqlString);
            return rows;//return the number of rows affected
        } catch (SQLException e) {
            //display error message
            JOptionPane.showMessageDialog(null, e.getMessage() + "\nPlease Try Again", "Non Query Execution Failure", 1);
            return -1;
        }
    }

    public ResultSet executeSQLQuery(String sqlQuery)
    {
        try {
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(sqlQuery); //query successfully executed
            return result;
        } catch (Exception e) {
            //display error message
            JOptionPane.showMessageDialog(null, "error", sqlQuery, 1);
            JOptionPane.showMessageDialog(null, e.getMessage() + "\nPlease Try Again", "Query Execution Failure", 1);
            //JOptionPane.showMessageDialog(null, e, title, messageType)
            return null; //sql query execution failed
        }
    }
}
 
    

