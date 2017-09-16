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
    
    void borrowBook(String ID,int ISbn){
    
    }
    
}
     