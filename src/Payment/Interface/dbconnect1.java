/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Payment.Interface;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author SURESH_UDAYA
 */
public class dbconnect1 {
    
    public static Connection connect(){
    
        Connection conn = null;
        
        try{
        
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sms1","root","");
        }
        catch(Exception e){
            System.out.println("db not connected !!!");
        }
        
        return conn;
    
    }
    
}
