/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AcademicReports;

import java.sql.*;
import javax.swing.JOptionPane;






public class Marks {
      
    public void addMarks(String sId,String subId,double marks)
    {
      
        Connection con=DBclass.connect();
        PreparedStatement ps;
        try {
            
            ps=con.prepareStatement("INSERT INTO marks VALUES(?,?,?)");
            ps.setString(1, sId);
            ps.setString(2, subId);
            ps.setDouble(3, marks);
            
            ps.execute();
            
            JOptionPane.showMessageDialog(null,"Successfuly added to the database");
        
        }
        catch (SQLException e) {
        
            JOptionPane.showMessageDialog(null,"wrong sql " + e.getMessage());
        
        }
        
        
    }

    
    
    
    


public ResultSet getMarks(String sId)
{
       Connection c;
       c=DBclass.connect();
       PreparedStatement ps;
       ResultSet r=null;
       try{
       
          
          ps=c.prepareStatement("SELECT * FROM Marks WHERE regNum = ?");
          ps.setString(1, sId);
          
           r = ps.executeQuery();
          
           if(!r.isBeforeFirst())
              JOptionPane.showMessageDialog(null, "Invalid Student ID number.Enter Student ID number again");
           
             return r;
          
          }
        catch(SQLException ex){
          JOptionPane.showMessageDialog(null, ex);
          return null;
          }
}






public void updateMarks(String sID,String subID,double marks){

Connection c;
PreparedStatement ps;

c=DBclass.connect();
try{

    ps = c.prepareStatement("update marks set results=? where subjectID=? and regNum=? ");
    ps.setDouble(1, marks);
    ps.setString(2, subID);
    ps.setString(3, sID);
    
    ps.execute();
    JOptionPane.showMessageDialog(null, "Successfully updated");

}
catch(SQLException e){
    
    JOptionPane.showMessageDialog(null, e);
    
}
    
}







public void removeMarks(String subiD,String siD)
{

    PreparedStatement ps;
    Connection c;
    
    c=DBclass.connect();
    
    try{
    
        ps=c.prepareStatement("delete from marks where regNum=? and subjectID=?");
        ps.setString(1,siD);
        ps.setString(2,subiD);
        
        ps.execute();
        
        JOptionPane.showMessageDialog(null, "Successfully deleted");
    }
    
    
    catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
    }
    
    
}





public ResultSet getAnalysis(String subId){

     PreparedStatement ps;
     Connection c;
     ResultSet r=null;
     
     c=DBclass.connect();
    
     try{
    
        ps=c.prepareStatement ("select max(results) as Maximum,min(results) as Minimum,avg(results) as Average from marks where subjectID = ?");
        ps.setString(1, subId);
        
        r=ps.executeQuery();
       

        
    }
   catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
    }
   
    return r;
}
 

public ResultSet teacherViewResults(String subId){

 Connection c;
 c=DBclass.connect();
 PreparedStatement ps;
 ResultSet r=null;
 
 try {
          ps=c.prepareStatement("SELECT * FROM marks WHERE subjectID = ?");
          ps.setString(1, subId);
          
           r = ps.executeQuery();
           
            if(!r.isBeforeFirst())
              JOptionPane.showMessageDialog(null, "Invalid Subject ID number. Enter Subject ID number again");
           
             return r;
 }
 catch (SQLException e){
 
     JOptionPane.showMessageDialog(null, e);
     return null;
 }

}



    
}
