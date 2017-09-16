/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author LuCif3R
 */


public class  BorrowedBooks extends Book{
    
    String due_date;
    double amount;
    
    
    double calculateFine(){
    
    return amount;
    }
    
    public void removwborrowed(int numb, int ISbn,int lend) {
          Connection con = DBconnect.connect();
                   
                  try{
                      String sql3 = "DELETE  FROM Borrowers_details WHERE lend_No = "+lend;
                       PreparedStatement ps = con.prepareStatement(sql3);
                         boolean p =ps.execute();
                         
                                     System.out.println(sql3);         
                    }catch(SQLException e){
                        
                        System.out.println(e);
                        
                    } 
                     
                         try{
                             numb=numb+1;
                             System.out.println(numb);
                       String sql4 = " UPDATE book_details SET Available_amount = "+numb+" where ISBN ="+ISbn;
                            
                      PreparedStatement   ps4 = con.prepareStatement(sql4);
                            ps4.execute();
                   
                         }catch(SQLException ex){
                         
                         }
                     }
                     
    
       
    
    
}
     