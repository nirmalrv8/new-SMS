/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sport;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static sport.Dbconnect.con;

/**
 *
 * @author Ruvindi
 */

 
      
public class sport {
    
    //initComponents();
    //conn =Dbconnect.connect();

public void add_student(String id){
PreparedStatement ps;
    // Connection conn =Dbconnect.connect();
    try{
    String Sql = "Select * from student where regNum ='"+id+"'";
    PreparedStatement ps1 = con.prepareStatement(Sql) ;
    
    
     ResultSet r = ps1.executeQuery();
        System.out.println(r);
    while(r.next()){
    String name=r.getString("name");
            String date = r.getString("dob").toString();
                    String contact= r.getString("contact");
                    
                    System.out.println(name);
                    System.out.println(date);
                    System.out.println(contact);
                    
                    
                    String sql_1="Insert into sports_member(name,Dob,contact)values('"+name+"','"+date+"','"+contact+"')";
                     
                    ps = con.prepareStatement(sql_1);
                    ps.execute();
                    JOptionPane.showMessageDialog(null, "Student Added Successfully", "Complete", JOptionPane.INFORMATION_MESSAGE);

    //}
    //else{
      //  JOptionPane.showMessageDialog(null,"Error Invalid number");
                }
    }catch(Exception ex){
        
        System.out.print(ex);
    
    }  
            
            }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   /* void add_student(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
  
    
    

}
