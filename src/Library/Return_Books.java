/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;
import java.sql.*;

import javax.swing.JOptionPane;
import javax.xml.transform.Source;

/**
 *
 * @author LuCif3R
 */
public class Return_Books extends javax.swing.JFrame {

    /**
     * Creates new form Return_Books
     */
    int xmouse;
    int ymouse;
    public Return_Books() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ISBN = new javax.swing.JTextField();
        Borrower = new javax.swing.JTextField();
        lend = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        ret = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        stat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ISBN.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        ISBN.setForeground(new java.awt.Color(204, 102, 0));

        Borrower.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Borrower.setForeground(new java.awt.Color(204, 102, 0));

        lend.setText("Enter Lend No Here");
        lend.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lendFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lendFocusLost(evt);
            }
        });
        lend.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lendKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lendKeyReleased(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(240, 128, 17));
        jButton2.setText("Go Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ret.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ret.setForeground(new java.awt.Color(240, 128, 17));
        ret.setText("Returned");
        ret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 128, 17));
        jLabel2.setText("Lend Number");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 128, 17));
        jLabel3.setText("Borrower Id");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 128, 17));
        jLabel5.setText("Book Isbn");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(lend, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(Borrower, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(ret, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53)
                .addComponent(stat, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lend, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(stat, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Borrower, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(ret, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(675, 489));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
       
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void lendKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lendKeyReleased
       
        String SID= this.lend.getText();
        int ID = Integer.parseInt(SID);
        PreparedStatement ps;
        ResultSet rs;
        Connection con = DBconnect.connect();
        String sql = "SELECT Book_isbn , Borrower_ID from borrowers_details WHERE  lend_No = "+ID;
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.getRow() == 0){
            while (rs.next()) {
                    ISBN.setText(rs.getString("Book_isbn"));
                    Borrower.setText(rs.getString("Borrower_ID"));  
                 
            }
            }
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
//        
//         String SID= this.lend.getText();
//        int ID = Integer.parseInt(SID);  
//        ResultSet rs;
//        Connection con = DBconnect.connect(); 
        String Status = null ;
          String sql1 = "SELECT Status from borrowers_details WHERE  lend_No = "+ID;
        try {
            PreparedStatement ps1;
            ps1 = con.prepareStatement(sql1);
            rs = ps1.executeQuery();
            if(rs.getRow() == 0){
            while (rs.next()) {
                    
                    Status = rs.getString("Status");
            }
                stat.setText(Status);
                
            }
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_lendKeyReleased

    private void retActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retActionPerformed
         
        String SID= this.lend.getText();
        int ID = Integer.parseInt(SID);
       
        ResultSet rs;
        Connection con = DBconnect.connect();
        Date d = new Date(System.currentTimeMillis());
        System.out.println(d);
         Borrower b1 = new Borrower();
            String SBN = ISBN.getText();
            int ISB = Integer.parseInt(SBN);
           String c;
                 c = stat.getText().toString();
        System.out.println(c);
            if ("Borrowed".equals(c)){
               
                  b1.updateStatus(ID ,ISB);
            }else
            {
                JOptionPane.showMessageDialog(null,"Already udated the return status");
            }
            
          
     
      setnull();
      lend.setText(null);
    }//GEN-LAST:event_retActionPerformed

    private void lendFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lendFocusLost
         
       
    }//GEN-LAST:event_lendFocusLost

    private void lendFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lendFocusGained
       lend.setText(null);
    }//GEN-LAST:event_lendFocusGained

    private void lendKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lendKeyPressed
        setnull();
    }//GEN-LAST:event_lendKeyPressed

    public void setnull(){
      //  lend.setText(null);
        Borrower.setText(null);
        ISBN.setText(null);
        stat.setText(null);
    
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
            java.util.logging.Logger.getLogger(Return_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Return_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Return_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Return_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Return_Books().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Borrower;
    private javax.swing.JTextField ISBN;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField lend;
    private javax.swing.JButton ret;
    private javax.swing.JLabel stat;
    // End of variables declaration//GEN-END:variables
}
