/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Library.DBconnect;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author LuCif3R
 */
public class Book {
    int ISBN;
    int pages;
    String Book_name;
    String Pub_Year;
    String Language;
    String Catagory_type;
    int Quntity;
    int available_number;
    double Price;
    Connection con;
      PreparedStatement pst;
        ResultSet rest, rs;
    
    
    void add_Book(int pISbn, String pname ,String pubYear , String language,String Catogry,int pquntity,double price1,int ppages){
    
        this.ISBN = pISbn;
        this.Book_name = pname;
        this.Pub_Year = pubYear;
        this.Language = language;
        this.Catagory_type = Catogry;
        this.Quntity = pquntity;
        this.Price = price1;
        this.pages=ppages;
    
    }
    
    void stor_details(){
    
        con = DBconnect.connect();
        try {
            
            
            
            String sql = "Insert into book_details VALUES ("+ISBN+",'"+Book_name+"','"+Pub_Year+"','"+Language+"','"+Catagory_type+"',"+Quntity+","+available_number+","+pages+","+Price+")";
            pst=con.prepareStatement(sql);
            System.out.println(sql);
            pst.execute();
            
            JOptionPane.showMessageDialog(null,"Done ");
            
        } 
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "wrong sql " + ex.getMessage());
        }  
        
    
        } 
        
    void searchbook(String word){
    
        
        
    
    }
    void remove_Book(int isbn){
     con = DBconnect.connect();
        try {
            String sql = "DELETE FROM book_details WHERE ISBN ="+isbn;
              pst = con.prepareStatement(sql);
            boolean ck=  pst.execute();
            System.out.println(isbn);
           //   if(ck==true){
              JOptionPane.showMessageDialog(null,"Successfully Deleted ");
           //   }else{
        //  
          
           //   }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"Errror"+e);
        }

    
    }
    boolean update_book(int pISbn , String name, String date,String lang , String cat, int quntity , int number , int pagess , double price){
        //System.out.println(pISbn+name+date+cat+lang+quntity+number+price);
      
        con = DBconnect.connect();
        try {
            String sql = "UPDATE book_details SET Name = '"+name+"', pub_date = '"+date+"', Language = '"+lang+"',Category = '"+cat+"', Quntity = "+quntity+", Available_amount = " +number+ ", Pages = "+pagess+", Price ="+price+" where ISBN ="+ISBN;
            System.out.println("asdaf");
            pst = con.prepareStatement(sql);
            int b = pst.executeUpdate();
                System.out.println(sql);
                 if(b != 2&&b!=0){
                     
                     JOptionPane.showMessageDialog(null, " Successfull updated");
                     return true;
                 }else{
                     
                     JOptionPane.showMessageDialog(null, "no recorded data on this ("+pISbn+") ISBN");
                    
                 }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex );
            }
           return false;
    }

    

}
