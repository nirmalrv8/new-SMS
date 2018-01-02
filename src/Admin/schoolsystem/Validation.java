/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin.schoolsystem;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author tharindu
 */
public class Validation {
    
    public boolean validateEmail(String email) {

        if (email.equals("")) {
            
            return false;
        }

        try{
            InternetAddress emailAddr = new InternetAddress(email);
            emailAddr.validate();
        } 
        catch(Exception ex) 
        {
            return false;
        }
        return true;
    }
}
    

