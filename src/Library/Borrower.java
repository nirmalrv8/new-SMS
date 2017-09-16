/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author LuCif3R
 */
public class Borrower {
    String borrowerId;
    int ISbn;
    String BookName;
    String BorrowersName;
    String status = "Borrowed";
    String Bname;
    String due;
    String resno = null;
// Borrower_ID
//            Name
//            Borrowed_date
//            Due_date
//            Book_isbn        
//            Book_name        
//            Status        
//

    void setBorrower(String borrowID , String BorowName,int Isbn,String due,String re){
    
       
        this.BorrowersName = BorowName;
        this.ISbn = Isbn;
        this.borrowerId = borrowID;
        this.due = due;
       this.resno = re;
        
    }
    void StoreBorrowerRecord(){
    Connection con = DBconnect.connect();
    PreparedStatement pst ;
    
        try {
            int count = 0;
            String sql= "Select Name from book_details where ISBN ="+ISbn;
          pst = con.prepareCall(sql);
           ResultSet rs =pst.executeQuery();
              while (rs.next()){
                
                   BookName = rs.getString("Name");
                  ++count;
                 }
                    if (count == 0) {
                    JOptionPane.showMessageDialog(null," invalid ISBN" );
                }else{
                        System.out.println(due);
                       String sql2 ="Insert into borrowers_details (Borrower_ID , Name, Book_isbn ,Book_name, Due_date,Status)VALUES ('"+borrowerId+"','"+BorrowersName+"',"+ISbn+",'"+BookName+"','"+due+"','"+status+"')";
                        System.out.println(sql2);
                        PreparedStatement ps2 = con.prepareStatement(sql2);
                      ps2.execute();
                      removere();
                      JOptionPane.showMessageDialog(null," Borowed Details Stored Suddessfully" );
                       
                    
                    }
          
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
    
    void display_borrowed_record(){
    
        
        
    
    }
    void updateStatus(){
    
    
    
    }
    void removere(){
                    Connection con = DBconnect.connect();
                     if(resno!=null){
                          
                          int res = Integer.parseInt(resno);
                    try{
                      String sql3 = "DELETE  FROM book_reservation WHERE book_reservation.ReserveNo = "+res;
                       PreparedStatement ps = con.prepareStatement(sql3);
                         boolean p =ps.execute();
                         System.out.println(sql3+p);
                    }catch(SQLException e){
                        
                        
                        
                    } 
                      }
    }
    
}
