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
        ISBN.setEditable(false);
        Borrower.setEditable(false);
         ret.setEnabled(false);
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        ISBN.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        ISBN.setForeground(new java.awt.Color(204, 102, 0));
        getContentPane().add(ISBN);
        ISBN.setBounds(319, 160, 210, 30);

        Borrower.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        Borrower.setForeground(new java.awt.Color(204, 102, 0));
        getContentPane().add(Borrower);
        Borrower.setBounds(319, 210, 210, 30);

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
        getContentPane().add(lend);
        lend.setBounds(319, 112, 210, 30);

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(240, 128, 17));
        jButton2.setText("Go Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(232, 345, 130, 40);

        ret.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ret.setForeground(new java.awt.Color(240, 128, 17));
        ret.setText("Returned");
        ret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retActionPerformed(evt);
            }
        });
        getContentPane().add(ret);
        ret.setBounds(221, 287, 160, 40);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 128, 17));
        jLabel2.setText("Lend Number");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(149, 112, 120, 30);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 128, 17));
        jLabel3.setText("Borrower Id");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(149, 210, 120, 30);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 128, 17));
        jLabel5.setText("Book Isbn");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(149, 160, 110, 30);
        getContentPane().add(stat);
        stat.setBounds(582, 112, 94, 24);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 662, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 662, 29);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 424, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 174, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(120, 90, 430, 180);

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
             if(!Borrower.getText().isEmpty()&&!ISBN.getText().isEmpty()&&!lend.getText().isEmpty()){
            ret.setEnabled(true);
        }else
        {
            ret.setEnabled(false);
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
            long ISB = Long.parseLong(SBN);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lend;
    private javax.swing.JButton ret;
    private javax.swing.JLabel stat;
    // End of variables declaration//GEN-END:variables
}
