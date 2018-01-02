/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Attendance;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Pooh
 */
public class Employee extends markEmployeeAttendance{
    Connection con=null;
    PreparedStatement pst=null;
    
    public Employee(){

         con=DBconnect.connect();
    }
 
    public boolean addRecords(String dt,  String eid,  String  checked)throws SQLException{
    
        boolean status=true;   
    
        try  {
    
             String sql="Insert into employee_attendance(Date_,empID,present) values(?,?,?) ";
             pst =con.prepareStatement(sql);
             pst.setString(1,dt);
             pst.setString(2,eid);
             pst.setString(3, checked);

             pst.execute();
     
    }
     catch(HeadlessException | SQLException e)
         {
             System.out.println(e);
         }
        return status;
        
        }

    
    public boolean applyLeave(String reg, String frmdate, String todate, String datecount, String paytype, String descr, int f, int t) throws SQLException{
    
    boolean status=true;
    int x = f, y = t;
    
    try{
    
    String sql="insert into leave_requests (empId,from_,to_,dateCount,paymentType,description )values ('"+reg+"','"+frmdate+"','"+todate+"','"+datecount+"',"+paytype+"','"+descr+"')";
            pst=con.prepareStatement(sql);
           
            pst.setString(1, reg);
            pst.setString(2, frmdate);
            pst.setString(3, todate);
            pst.setString(4, datecount);
            pst.setString(5, paytype);
            pst.setString(6, descr);
          
//           String datecount=count_txt.setText((String.valueOf(diff/(60*60*24*1000))));  
            
            if(x >= 1 || y >= 0 ){
                pst.execute();
                 if(pst.execute()==true) {
                        status=true; 
                        JOptionPane.showMessageDialog(null,"Leave Request submitted !");
                         return status;
                    }
                
             else if(x==0 || -1 == x || y<0){
                    JOptionPane.showMessageDialog(null,"Please enter a valid day combination !");
                //JOptionPane.showMessageDialog(rootPane, "Please select a valid day combination","error",JOptionPane.ERROR_MESSAGE);
                }    
            }
    
    }
     catch(HeadlessException | SQLException e)
         {
             System.out.println(e);
         }
        return status;
      
    
    }
    
    }
    
