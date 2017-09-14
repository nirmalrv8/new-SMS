package Profile.MainInterface;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author LuCif3R
 */
public class DBconnect {
    
    
    public static Connection connect() 
    {
        Connection con = null;
        try{
            //con = DriverManager.getConnection("jdbc:mysql://localhost/sms","root","");
            con = DriverManager.getConnection("jdbc:mysql://mysql5.gear.host/sms1?useSSL=false","sms1","Ss9E?hre_1gC");
        } 
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex + " failed connection");
            return null;
        }
        //JOptionPane.showMessageDialog(null, "connection success");
        return con;
    }
    
    
}
