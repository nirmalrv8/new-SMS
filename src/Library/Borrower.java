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
    long ISbn;
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

    void setBorrower(String borrowID , String BorowName,long Isbn,String due,String re){
    
       
        this.BorrowersName = BorowName;
        this.ISbn = Isbn;
        this.borrowerId = borrowID;
        this.due = due;
       this.resno = re;
        
    }
    void StoreBorrowerRecord(int num){
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
                       int no = this.get_lend_number();
                      
                      JOptionPane.showMessageDialog(null," Borowed Details Stored Suddessfully \n And your lend number is "+no );
                        
                      removere(num);
                      
                       
                    
                    }
          
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
    
    void display_borrowed_record(){
    
        
        
    
    }
    void updateStatus(int ID ,long isb ){
         PreparedStatement ps,ps2,pst,ps3;
        ResultSet rs , rs1;
        Connection con = DBconnect.connect();
          Date d = new Date(System.currentTimeMillis());
            System.out.println(d);
             int Qun = 0 ;

            try{
        String sql = "SELECT Book_isbn , Borrower_ID from borrowers_details WHERE  lend_No = "+ID;
         ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
                if (rs.getRow()==0)
                {
                    String sql2 = "UPDATE borrowers_details SET Status =' Returned' ,Actual_return_date ='"+d+"'  Where lend_No ="+ID;
                    ps2=con.prepareStatement(sql2);
                    int x =ps2.executeUpdate();
                       
                    if(x==1){
                     JOptionPane.showMessageDialog(null,"recored Stored Successfully");
                          String sql3= "Select Available_amount from book_details where ISBN ="+isb;
                               pst = con.prepareStatement(sql3);
                               rs1 =pst.executeQuery();
                                 while (rs1.next()){
                
                                 Qun = rs1.getInt("Available_amount");
                                    
                                  }
                                 Qun = Qun+1;
                                 String sql4= "UPDATE  book_details SET Available_amount ="+Qun+" WHERE ISBN ="+isb;
                                 ps3=con.prepareStatement(sql4);
                                 ps3.executeUpdate();
                                 System.out.println("Done");
                                  
                    }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid Lend Number");
                }
                }
            
        }catch(SQLException e){
                System.out.println(e);
        }
    
    
    
    }
    void removere(int numb){
                    Connection con = DBconnect.connect();
                    System.out.println("num="+numb+"and"+resno );
                    if(resno!=""){
                          
                          int res = Integer.parseInt(resno);
                    try{
                      String sql3 = "DELETE  FROM book_reservation WHERE book_reservation.ReserveNo = "+res;
                       PreparedStatement ps = con.prepareStatement(sql3);
                         boolean p =ps.execute();
                         
                                            
                    }catch(SQLException e){
                        
                        
                        
                    } 
                      }else{
                         try{
                             numb=numb-1;
                             System.out.println(numb);
                       String sql4 = " UPDATE book_details SET Available_amount = "+numb+" where ISBN ="+ISbn;
                            System.out.println(numb+" "+ISbn);
                      PreparedStatement   ps4 = con.prepareStatement(sql4);
                            ps4.execute();
                   
                         }catch(SQLException ex){
                         
                         }
                     }
                     
    }
    int get_lend_number(){
 
    int number = 0;
    String sql = "Select Max(lend_no) as 'No' from borrowers_details ";
            try {
                DBconnect db = new DBconnect();
                Connection  con = db. connect();
                PreparedStatement pst= con.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while(rs.next()){
                      number = rs.getInt("No");
                    return number;
                }
                
            } catch (Exception e) {
                System.out.println(e);
            }
            return number;
}
    

    
    
    
    
}
