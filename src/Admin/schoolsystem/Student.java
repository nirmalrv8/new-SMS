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
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author tharindu
 */
public class Student {
    
    Connection con=null;
    PreparedStatement pst =null;
    ResultSet rs=null;
    
    public Student()
    {
        con=ConnectDB.connect();
    }
    
    public void setTableValue(JTable jtable )
     {
         try{
            String sql= "select regNum as Reg_No,name as Name,grade as Grade,parent_name as Parent_Name,address as Address,contact as Phone,email as Email from student";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            
            jtable.setModel(DbUtils.resultSetToTableModel(rs));
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,e);
         }
     
     }
    
    public void getTableValue(String Tableclick,JTextField sid,JTextField sname,JTextField saddress,JDateChooser sdob,JTextField sage,JDateChooser sregdate,JComboBox sgrade,JTextField spassword,JTextField sparent,JTextField scontact,JTextField semail)
     {
         try{
              String sql="select * from student where regNum='"+Tableclick+"'";
              pst=con.prepareStatement(sql);
              rs=pst.executeQuery();
              
              if(rs.next())
              {
                sid.setText(rs.getString("regnum"));
                sname.setText(rs.getString("name"));
                saddress.setText(rs.getString("address"));
                sdob.setDate(rs.getDate("dob"));
                sage.setText(rs.getString("age"));
                sregdate.setDate(rs.getDate("regDate"));
                sgrade.setSelectedItem(rs.getString("grade"));
                spassword.setText(rs.getString("password"));
                sparent.setText(rs.getString("parent_name"));
                scontact.setText(rs.getString("contact"));
                semail.setText(rs.getString("email"));
              }
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,e);
         }
     }
    
    public void Insert(String SId,String SName,String SAddress,String SDob,int SAge,String SRegDate,String SGrade,String SPwd,String Sparent,int Scontact,String Email)
    {
        try{
           
            String sql="INSERT INTO student(regNum,name,address,dob,age,regDate,grade,password,parent_name,contact,email)"
                    +"VALUES('"+SId+"','"+SName+"','"+SAddress+"','"+SDob+"','"+SAge+"','"+SRegDate+"','"+SGrade+"','"+SPwd+"','"+Sparent+"','"+Scontact+"','"+Email+"')";
           
            pst = con.prepareStatement(sql);
            pst.execute(sql);
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    public void search(String ID,JTextField sid,JTextField sname,JTextField saddress,JDateChooser sdob,JTextField sage,JDateChooser sregdate,JComboBox sgrade,JTextField spassword,JTextField sparent,JTextField scontact,JTextField semail)
    {
        String sql="select * from student where regNum=?";
    
        try{
             pst=con.prepareStatement(sql);
             pst.setString(1,ID);
             rs=pst.executeQuery();
            
            if(rs.next())
            {
                sid.setText(rs.getString("regnum"));
                sname.setText(rs.getString("name"));
                saddress.setText(rs.getString("address"));
                sdob.setDate(rs.getDate("dob"));
                sage.setText(rs.getString("age"));
                sregdate.setDate(rs.getDate("regDate"));
                sgrade.setSelectedItem(rs.getString("grade"));
                spassword.setText(rs.getString("password"));
                sparent.setText(rs.getString("parent_name"));
                scontact.setText(rs.getString("contact"));
                semail.setText(rs.getString("email"));
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid Student Reg_ID..");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public void Delete(String sid)
    {
        try{
            String de="DELETE FROM student WHERE regNum=?";
            pst=con.prepareStatement(de);
            
            pst.setString(1,sid);
            
           int msg= JOptionPane.showConfirmDialog(null,"Do you want to delete Reg_NO : "+sid,"close",JOptionPane.YES_OPTION,JOptionPane.NO_OPTION);
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
    public void Update(String SId,String SName,String SAddress,String SDob,int SAge,String SRegDate,String SGrade,String SPwd,String Sparent,int Scontact,String SEmail)
    {
         try{
   
       String sq="update student set name=?,address=?,dob=?,age=?,regDate=?,grade=?,password=?,parent_name=?,contact=?,email=? where regNum=?";
            
            pst=con.prepareStatement(sq);
             
            pst.setString(1,SName);
            pst.setString(2,SAddress);
            pst.setString(3,SDob);
            pst.setString(4,Integer.toString(SAge));
            pst.setString(5,SRegDate);
            pst.setString(6,SGrade);
            pst.setString(7,SPwd);
            pst.setString(8,Sparent);
            pst.setString(9,Integer.toString(Scontact));
            pst.setString(10,SEmail);
            
            pst.setString(11,SId);
            
            
            pst.executeUpdate();

       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,e);
       }
    }
    
}
