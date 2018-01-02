/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin.schoolsystem;

import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.awt.*;
import static java.lang.Thread.sleep;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author tharindu
 */
public class Teacher{
       
    Connection con=null;
    PreparedStatement pst =null;
    ResultSet rs=null;
      
    public Teacher()
    {
        con=ConnectDB.connect();
    }
    
    public void setTableValue(JTable jtable )
     {
         try{
            String sql= "select Teacher_ID ,name as Name,address as Address,phone as Phone,Date_Joined,email as Email from teacher ";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            
            jtable.setModel(DbUtils.resultSetToTableModel(rs));
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,e);
         }
     
     }
    
    public void getTableValue(String Tableclick,JTextField tid,JTextField tname,JTextField taddress,JTextField tpno,JTextField tage,JDateChooser tdate,JTextField temail)
     {
         try{
              String sql="select * from teacher where Teacher_ID='"+Tableclick+"'";
              pst=con.prepareStatement(sql);
              rs=pst.executeQuery();
              
              if(rs.next())
              {
                tid.setText(rs.getString("Teacher_ID"));
                tname.setText(rs.getString("name"));
                taddress.setText(rs.getString("address"));
                tpno.setText(rs.getString("phone"));
                tage.setText(rs.getString("age"));
                tdate.setDate(rs.getDate("Date_Joined"));
                temail.setText(rs.getString("email"));
              }
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,e);
         }
     }
    
    public void Insert(String Id,String Name,String Address,int Pno,int Age,String Date,String Pwd,String Email)
    {
        try{
           
            String sql="INSERT INTO teacher(Teacher_ID,name,address,phone,age,Date_Joined,Password,email)"
                    +"VALUES('"+Id+"','"+Name+"','"+Address+"','"+Pno+"','"+Age+"','"+Date+"','"+Pwd+"','"+Email+"')";
           
            pst = con.prepareStatement(sql);
            pst.execute(sql);
            
            new Send_Email().Email(Email,Id,Pwd);
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void search(String ID,JTextField tid,JTextField tname,JTextField taddress,JTextField tpno,JTextField tage,JDateChooser tdate,JTextField temail)
    {
        String sql="select * from teacher where Teacher_ID=?";
    
        try{
             pst=con.prepareStatement(sql);
             pst.setString(1,ID);
             rs=pst.executeQuery();
            
            if(rs.next())
            {
                tid.setText(rs.getString("Teacher_ID"));
                tname.setText(rs.getString("name"));
                taddress.setText(rs.getString("address"));
                tpno.setText(rs.getString("phone"));
                tage.setText(rs.getString("age"));
                tdate.setDate(rs.getDate("Date_Joined"));
                temail.setText(rs.getString("email"));
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid Teacher ID..");
            }
        }
        catch(Exception e)
        {
            System.out.println("erro");
        }
    }
    
    public void Delete(String id)
    {
        try{
            String de="DELETE FROM teacher WHERE Teacher_ID=?";
            pst=con.prepareStatement(de);
            
            pst.setString(1,id);
            
           int msg= JOptionPane.showConfirmDialog(null,"Do you want to delete Teacher ID : "+id,"close",JOptionPane.YES_OPTION,JOptionPane.NO_OPTION);
            if(msg==JOptionPane.YES_OPTION)
            {
                pst.executeUpdate();
            }
           
         
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    public void Update(String id,String name,String address,int pno,int age,String date,String pw,String email)
    {
         try{
   
       String sq="update teacher set name=?,address=?,phone=?,age=?,Date_Joined=?,email=? where Teacher_ID=?";
            
            pst=con.prepareStatement(sq);
             
            pst.setString(1,name);
            pst.setString(2,address);
            pst.setString(3,Integer.toString(pno));
            pst.setString(4,Integer.toString(age));
            pst.setString(5,date);
            pst.setString(6,email);
            pst.setString(7,id);
            
            pst.executeUpdate();

       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,e);
       }
    }
    
}
