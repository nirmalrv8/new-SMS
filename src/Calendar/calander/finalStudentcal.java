/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calendar.calander;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author DELL
 */
public class finalStudentcal extends javax.swing.JFrame {

    /**
     * Creates new form finalStudentcal
     */
    public finalStudentcal() {
        initComponents();
        
      
        
         JPanel panelMain = new JPanel(new GridBagLayout());
         Connection con = Profile.MainInterface.DBconnect.connect();
         ResultSet rs=null;
      //  ResultSet rs1=null;
                  String q1="Select * from calander";
            
                try{
                PreparedStatement ps=con.prepareStatement(q1);
                rs=ps.executeQuery();
                
                int a=0;
                int b=0;
                
                 //send notification
                 
                  //String date1=rs.getString("date");
//                  String q2="select datediff(cdate,date)as left_date from calander";
//                  
//                                PreparedStatement ps1=con.prepareStatement(q2);
//                                rs1=ps1.executeQuery();
//                                int date2=Integer.parseInt(rs1.getString("left_date"));
////                  
//                  if(date2==1){
//                  
//                      //notification to nirmal
//                  }
//                  
//                  else if(date2<0){
//                      
//                      //remove the event
//                  
//                  
//                  
//                  }
                 
        
                //send notification
        java.awt.GridBagConstraints gridBagConstraints;


 
                while(rs.next()){
                    
                    String ename1=rs.getString("ename");
                    String vanue=rs.getString("vanue");
                    String dis=rs.getString("description");
                    byte[]imagedata=rs.getBytes("image");
                    format =new ImageIcon(imagedata);
                    String date=rs.getString("date");

                        
       

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

     

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jButton1.setText("Subscribe");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 81, 19, 0);
        jPanel1.add(jButton1, gridBagConstraints);

        jLabel1.setIcon(format);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 225;
        gridBagConstraints.ipady = 129;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 0, 2);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setText(date);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 225;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 2, 0, 2);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setText(ename1);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 127;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 42, 0, 0);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setText(dis);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 225;
        gridBagConstraints.ipady = 69;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 2, 0, 2);
        jPanel1.add(jLabel4, gridBagConstraints);
        
        gridBagConstraints = new java.awt.GridBagConstraints();
        if(a%3==0){
            b++;
            a=0;
         }
        gridBagConstraints.gridx = a;
        gridBagConstraints.gridy = b;
        gridBagConstraints.ipadx = 53;
       gridBagConstraints.ipady = 84;
       // gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 10);
        panelMain.add(jPanel1, gridBagConstraints);
        a++;
        pack();
                }
                
                JScrollPane scrollPanel = new JScrollPane(panelMain);
             getContentPane().add(scrollPanel, BorderLayout.CENTER);
             pack();

                }
                catch(SQLException e){
                
                    System.out.println(""+e);
                }
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin/image/WhatsApp Image 2017-08-20 at 21.00.30.jpeg"))); // NOI18N
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        //new Profile.
        this.dispose();
        new Profile.MainInterface.Main().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(finalStudentcal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(finalStudentcal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(finalStudentcal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(finalStudentcal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new finalStudentcal().setVisible(true);
            }
        });
    }
    private ImageIcon format=null;
    int s=0;
    byte[] event_image=null;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    // End of variables declaration//GEN-END:variables
}
