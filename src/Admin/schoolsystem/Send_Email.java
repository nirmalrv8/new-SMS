/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin.schoolsystem;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author tharindu
 */
public class Send_Email {
   
    public void Email(String To_Email,String TUserName,String TPassword)
    {
        final String From = "sureshudaya3@gmail.com";
            final String password = "suresh2768972";
            
          Properties pros = new Properties();

        pros.put("mail.smtp.host", "smtp.gmail.com");
        pros.put("mail.smtp.socketFactory.port", "465");
        pros.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        pros.put("mail.smtp.auth", "true");
        pros.put("mail.smtp.port", "465");
        
        Session session = Session.getDefaultInstance(pros,
                
                new javax.mail.Authenticator() {
            
                protected PasswordAuthentication getPasswordAuthentication() 
            {
                return new PasswordAuthentication(From, password);
            }
            }
            );

        try 
        {
            Message message = new MimeMessage(session);
  
            message.setFrom(new InternetAddress(From));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(To_Email));
            message.setSubject("Welcome to Clyton College"); 
            message.setText("User Name: "+TUserName+"\n"+"Password : "+TPassword);
        
            Transport.send(message);
            
            JOptionPane.showMessageDialog(null,"Message Sent");            
        } 
        catch(MessagingException e) 
        {
            JOptionPane.showMessageDialog(null,e);
            
        }
    }
    
}
