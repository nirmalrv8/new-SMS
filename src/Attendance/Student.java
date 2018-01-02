/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Attendance;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Pooh
 */
public class Student extends markStudentAttendance{
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    private Statement stm;
    
public Student(){
    con=DBconnect.connect();
}    
    
    
public boolean addRecords(String dt, String grd, String cls, String adm, String checked ) throws SQLException{
    boolean status=false;
          

        
            try{

         String sql="Insert into student_attendance(Date_,Admission_No,Present) values (?,?,?) ";
                pst=con.prepareStatement(sql);
                pst.setString(1,dt);  
                pst.setString(2, adm);
                pst.setString(3, checked);                
                pst.execute();
                
                
                status=true;
              
              }
         catch(HeadlessException | SQLException e)
         {
                                   
             System.out.println(e);
             
         }
        return status;
    
}
        
public String[] splitDate(String month) throws SQLException{

     String[]arr = null;
        
     try{
      
      String sql = "SELECT Date_ FROM student_attendance WHERE Date_ LIKE '_____"+month+"___' ";
      this.stm = this.con.createStatement();
      this.rs = this.stm.executeQuery(sql);
      String date;
        while(rs.next())
        {
         
           date = this.rs.getString("Date_");
           arr = date.split("-");
           
           System.out.println(arr[2]);
           
          
        }
        }
        catch(Exception e){
            System.out.println(e);
        
        }
     return arr;

}


}
