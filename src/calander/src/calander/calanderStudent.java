/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calander;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.sql.*;

/**
 *
 * @author DELL
 */
public class calanderStudent extends javax.swing.JFrame {

    /**
     * Creates new form calanderStudent
     */
//    public static void addComponentsToPane(Container pane) {
//    
//        GridBagConstraints fgridBagConstraints =new GridBagConstraints();
//    
//        fgridBagConstraints.gridwidth = 3;
//        fgridBagConstraints.gridheight = 20;
//        fgridBagConstraints.weightx = 20;
//        fgridBagConstraints.weightx =20;
//    
//    
//    }
    public calanderStudent() {
        initComponents();
        
                //Container p =getContentPane();
                Connection con = dbconnect.connect();
                ResultSet rs=null;
                String q1="Select * from calander";
                //String q2="COUNT * from calander";
                try{
                PreparedStatement ps=con.prepareStatement(q1);
                 //ps=con.prepareStatement(q2);
                rs=ps.executeQuery();
                
    
                int i=0;
                int j=0;
                 while(rs.next()){
                     

                        
                     String ename1=rs.getString("ename");
                     int id=rs.getInt("eid");
                     
                     
                    
                     java.awt.GridBagConstraints gridBagConstraints;

        
                      

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
                             // gridBagConstraints = new java.awt.GridBagConstraints();
      
        

        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      getContentPane().setLayout(new java.awt.GridBagLayout());
       //p.setLayout(new GridBagLayout());
        //jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

//        jButton1.setText("jButton1");
//
//        jLabel1.setText(ename1);
//        
        //fgridBagConstraints = new java.awt.GridBagConstraints();
       
 
    //    getContentPane().add(jPanel1, gridBagConstraints);
       
        
    
    
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        //getContentPane().setLayout(new java.awt.GridBagLayout());

        
        jPanel1.setLayout(new java.awt.GridBagLayout());
        
        gridBagConstraints = new java.awt.GridBagConstraints();
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
         
       if(i==3||i==6||i==9){
      j++;
       }
       gridBagConstraints.gridx=i;
       gridBagConstraints.gridy=j;
       gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
       gridBagConstraints.ipady = 0;
       gridBagConstraints.insets = new Insets(10,10,10,10); 
       getContentPane().add(jPanel1, gridBagConstraints);

        jButton1.setText("jButton1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(57, 32, 35, 41);
        jPanel1.add(jButton1, gridBagConstraints);

        jLabel1.setText(ename1);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 49, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);
        
        
        //for(int j=0;j<=10;j++){
                               //for(int i=0;i<=2;i++){
     

       // getContentPane().add(jPanel1, new java.awt.GridBagConstraints());
       i++;

        pack();
//        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
//        jPanel1.setLayout(jPanel1Layout);
//        jPanel1Layout.setHorizontalGroup(
//            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(jPanel1Layout.createSequentialGroup()
//                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addGroup(jPanel1Layout.createSequentialGroup()
//                        .addGap(30, 30, 30)
//                        .addComponent(jButton1))
//                    .addGroup(jPanel1Layout.createSequentialGroup()
//                        .addGap(47, 47, 47)
//                        .addComponent(jLabel1)))
//                .addContainerGap(39, Short.MAX_VALUE))
//        );
//        jPanel1Layout.setVerticalGroup(
//            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
//                .addGap(48, 48, 48)
//                .addComponent(jLabel1)
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
//                .addComponent(jButton1)
//                .addGap(33, 33, 33))
//        );
//     
//        
////        gridBagConstraints.gridwidth = 3;
////        gridBagConstraints.gridheight = 20;
////        gridBagConstraints.weightx = 20;
////        gridBagConstraints.weightx =20;
////        gridBagConstraints.gridx = 1;
//    
//        
//
//
//        pack();
                
                
                }
                  //             }
                //}
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getAccessibleContext().setAccessibleName("a1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(calanderStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calanderStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calanderStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calanderStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
               
                new calanderStudent().setVisible(true);
                
            }
        });
    }
 private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
