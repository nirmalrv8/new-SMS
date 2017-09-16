/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AcademicReports;

import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author jayakody
 */
public class Validation {
    
    
    public int checkStudent(String sid){
    
        Connection con=DBclass.connect();
        PreparedStatement ps;
        ResultSet r=null;
        
        try {
            ps =con.prepareStatement("select * from student where regNum = ? ");
            ps.setString(1, sid);
            r = ps.executeQuery();
            
               if(!r.isBeforeFirst())
                return 1;
        }
        
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return 0;
    }
    
    public int checkSubject(String subid){
        
        Connection con=DBclass.connect();
        PreparedStatement ps;
        ResultSet r=null;
        
        try {
            ps =con.prepareStatement("select * from subject where subjectID = ? ");
            ps.setString(1, subid);
            r = ps.executeQuery();
            
            if(!r.isBeforeFirst())
                return 1;
            
            
        }
        
        catch(SQLException e){
        JOptionPane.showMessageDialog(null, e);
            
        }
    return 0;
    }
    
    
}
