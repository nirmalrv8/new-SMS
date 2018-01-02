/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calendar1.calander ;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author DELL
 */
public class dbconnect {
  
   
    
    
    public static Connection connect() {
    
    
    Connection con =null;
    
    try{
    
     Class.forName("com.mysql.jdbc.Driver");
     con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sms1","root","");
        
    }
    
    catch(Exception e){
    
        System.out.println("Error is "+e);
    }
    
    return con; 
    
    
    }
    
    
}
