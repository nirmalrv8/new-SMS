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
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author LuCif3R
 */
public class View_Details extends javax.swing.JFrame {
    int qun;
          long ISBN;
    /**
     * Creates new form View_Details
     */
    public View_Details() {
        initComponents();
        
         ButtonGroup group = new ButtonGroup();
        group.add(BD);
        group.add(BRD);
        group.add(RD);
        lab1.setVisible(false);
        lab2.setVisible(false);
        lab3.setVisible(false);
        tx1.setEditable(false);
         tx2.setEditable(false);
          tx3.setEditable(false);
         
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lab2 = new javax.swing.JLabel();
        lab3 = new javax.swing.JLabel();
        lab1 = new javax.swing.JLabel();
        tx1 = new javax.swing.JTextField();
        tx2 = new javax.swing.JTextField();
        tx3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        RD = new javax.swing.JRadioButton();
        BRD = new javax.swing.JRadioButton();
        BD = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin/image/WhatsApp Image 2017-08-20 at 21.00.30.jpeg"))); // NOI18N
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(667, 412, 70, 59);

        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tab);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 42, 553, 358);

        jButton1.setText("View Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(691, 100, 118, 37);

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(645, 347, 106, 39);

        lab2.setText("jLabel1");
        getContentPane().add(lab2);
        lab2.setBounds(605, 262, 82, 14);

        lab3.setText("jLabel1");
        getContentPane().add(lab3);
        lab3.setBounds(605, 288, 82, 14);

        lab1.setText("jLabel1");
        getContentPane().add(lab1);
        lab1.setBounds(605, 236, 82, 14);
        getContentPane().add(tx1);
        tx1.setBounds(705, 233, 104, 20);

        tx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx2ActionPerformed(evt);
            }
        });
        getContentPane().add(tx2);
        tx2.setBounds(705, 259, 104, 20);
        getContentPane().add(tx3);
        tx3.setBounds(705, 285, 104, 20);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 828, 36);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        RD.setText("Reservations");

        BRD.setText("Borrwed Books");
        BRD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRDActionPerformed(evt);
            }
        });

        BD.setText("Book Details");
        BD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BD)
                    .addComponent(BRD)
                    .addComponent(RD))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(BD)
                .addGap(14, 14, 14)
                .addComponent(BRD)
                .addGap(14, 14, 14)
                .addComponent(RD)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(570, 70, 250, 260);

        setSize(new java.awt.Dimension(844, 521));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
       
        tableloadcall();
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMouseClicked
       int r = tab.getSelectedRow();
        if(BD.isSelected()){
            
                String SBN = tab.getValueAt(r, 0).toString();
                   String name = tab.getValueAt(r, 1).toString();
                      String Qu = tab.getValueAt(r, 5).toString();
                      
                      tx1.setText(SBN);
                      tx2.setText(name);
                      tx3.setText(Qu);
                
            }else if(BRD.isSelected()){
                
                String len = tab.getValueAt(r, 7).toString();
                   String stts = tab.getValueAt(r, 8).toString();
                      String BOOKID = tab.getValueAt(r, 5).toString();
                      
                      tx1.setText(len);
                      tx2.setText(stts);
                      tx3.setText(BOOKID);
           ISBN = Long.parseLong(BOOKID);
                    
             
            }else{
                   String res = tab.getValueAt(r, 0).toString();
                   String ID = tab.getValueAt(r, 1).toString();
                      String BN = tab.getValueAt(r, 4).toString();
                       String BOOKID = tab.getValueAt(r, 3).toString();
                      tx1.setText(res);
                      tx2.setText(ID);
                      tx3.setText(BN);
             ISBN = Long.parseLong(BOOKID);
       
             
            }
       
       
       
    }//GEN-LAST:event_tabMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      Connection con = DBconnect.connect();
  
            if((BD.isSelected()||BRD.isSelected()||RD.isSelected())&&(!tx1.getText().isEmpty())){
                int x=JOptionPane.showConfirmDialog(null, "You Really want to Delete");
                    if(x==0){
                        if(BD.isSelected()){

                            String sbn  =  tx1.getText();
                            long ISBN = Long.parseLong(sbn);
                            Book b1= new Book();
                            b1.remove_Book(ISBN);
                                    
                           }else if(BRD.isSelected()){
                                String slen  =  tx1.getText();
                                  int len = Integer.parseInt(slen);
                                  String st = tx2.getText();
                                        BorrowedBooks b1 = new BorrowedBooks();
                                        
                                        
                                        if("Borrowed".equals(st)){
                                            System.out.println(len);
                                       String sql2 = "Select Name ,Quntity from book_details where ISBN ="+ISBN; 
                                      
                                  try{
                                     
                                       PreparedStatement  ps2 = con.prepareStatement(sql2);
                                     ResultSet rs2 = ps2.executeQuery();
                                       int quntity = 0  ;
                                     while(rs2.next()){
                                       quntity=rs2.getInt("Quntity");
                                        }
                                            System.out.println(quntity+"  "+ISBN+" "+len);
                                          b1.removwborrowed(quntity,ISBN, len);
                                          
                                          JOptionPane.showMessageDialog(null, "Successfully Removed");
                                  }catch(SQLException e){
                                      System.out.println(e);
                                  }
                                        
                                        }else{
                                             
                   
                                              try{
                                         String sql3 = "DELETE  FROM Borrowers_details  WHERE lend_No = "+len;
                                          PreparedStatement ps = con.prepareStatement(sql3);
                                            boolean p =ps.execute();
                                             JOptionPane.showMessageDialog(null, "Successfully Removed");

                                       }catch(SQLException e){
                        
                                                  System.out.println(e);
                        
                                            } 
                                        }   
                                        
                              
             
                            }else{
                                String res  =  tx1.getText();
                                   int ress = Integer.parseInt(res);
                                   System.out.println(ress);
                                   
                                   try{
                                String sql3 = "DELETE  FROM book_reservation WHERE book_reservation.ReserveNo = "+res;
                                 PreparedStatement ps = con.prepareStatement(sql3);
                                   boolean p =ps.execute();

                                    JOptionPane.showMessageDialog(null, "Record removed sucessfully");
                              }catch(SQLException e){



                              } 
//                               

                                     String sql3 = "Select Name ,Available_amount from book_details where ISBN ="+ISBN;   
                                  try{
                                       
                                       PreparedStatement  ps2 = con.prepareStatement(sql3);
                                     ResultSet rs2 = ps2.executeQuery();
                                       int quntity = 0  ;
                                     while(rs2.next()){
                                       quntity=rs2.getInt("Available_amount");
                                       
                                        }
                                   quntity=  quntity+1;
                                     String sql4 = " UPDATE book_details SET Available_amount = "+quntity+" where ISBN ="+ISBN;
                                       System.out.println(quntity+" "+ISBN);
                                    PreparedStatement   ps4 = con.prepareStatement(sql4);
                                        ps4.execute();
                                        JOptionPane.showMessageDialog(null, "Record removed sucessfully");
                                  }catch(SQLException e){
                                  }

                            }
            
                        }           
        
           
            
        }else{
            JOptionPane.showMessageDialog(null, "select one catagory");
            return;
        }
        
        
        tableloadcall();
        
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BDActionPerformed

    private void BRDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BRDActionPerformed

    private void tx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        //new Profile.
        this.dispose();
        
    }//GEN-LAST:event_jButton7ActionPerformed

    
    public void tableload( String tabname){
        
        try {
             Connection con = DBconnect.connect();
             ResultSet rest;
             PreparedStatement pst;
              String sql="SELECT * FROM "+tabname;
              pst=con.prepareStatement(sql);
              rest=pst.executeQuery();
              tab.setModel(DbUtils.resultSetToTableModel(rest));
              System.out.println(sql);
        } 
        catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "wrong sql " + ex.getMessage());
        }  
        
    }
    public void tableloadcall(){
    
      if(BD.isSelected()||BRD.isSelected()||RD.isSelected()){
        
            if(BD.isSelected()){
            
                tableload("Book_details");
                lab1.setText("ISBN");
                 lab2.setText("Name");
                  lab3.setText("Quntity");
                   lab1.setVisible(true);
                     lab2.setVisible(true);
                      lab3.setVisible(true);
                
                
            }else if(BRD.isSelected()){
            
             tableload("Borrowers_details");
              lab1.setText("Lend No");
               lab2.setText("Status");
                lab3.setText("ISBN");
                    lab1.setVisible(true);
                     lab2.setVisible(true);
                      lab3.setVisible(true);
             
            }else{
             tableload("book_reservation");
              lab1.setText("Reservation No");
               lab2.setText("Borrower ID");
                lab3.setText("Book Name");
                    lab1.setVisible(true);
                     lab2.setVisible(true);
                      lab3.setVisible(true);
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "select one catagory");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BD;
    private javax.swing.JRadioButton BRD;
    private javax.swing.JRadioButton RD;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lab1;
    private javax.swing.JLabel lab2;
    private javax.swing.JLabel lab3;
    private javax.swing.JTable tab;
    private javax.swing.JTextField tx1;
    private javax.swing.JTextField tx2;
    private javax.swing.JTextField tx3;
    // End of variables declaration//GEN-END:variables
}
