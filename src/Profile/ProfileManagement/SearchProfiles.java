/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profile.ProfileManagement;

import Profile.MainInterface.DBconnect;
import static Profile.MainInterface.Login.reg;
import static Profile.MainInterface.Login.type;
import Profile.MainInterface.Main;
import Profile.OtherResources.TextPrompt;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 * 
 * 
 */



public class SearchProfiles extends javax.swing.JFrame {
    
    ButtonGroup group1 = new ButtonGroup();
    ButtonGroup group2 = new ButtonGroup();
    public SearchProfiles() {
        initComponents();
        jPanel3.setVisible(false);
        //jPanel1.setVisible(false);
        //jPanel2.setVisible(false);
        setPreferredSize(new Dimension(800, 500));
        pack();
        setLocationRelativeTo(null);       
          
        TextPrompt tp7 = new TextPrompt("Search using given criteria", jTextField1);       
        tp7.changeAlpha(0.5f); 
        
        comboChange();
        
        
        group1.add(jRadioButton1);
        group1.add(jRadioButton2);
        group1.add(jRadioButton3);
        
        
        group2.add(jRadioButton4);
        group2.add(jRadioButton5);
        
    }
    
    public void searchProfile(){
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jButton1.setText("search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jRadioButton4.setText("Staff ID");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton4);

        jRadioButton5.setText("Name");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton5);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Teacher" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jComboBox1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jComboBox1PropertyChange(evt);
            }
        });

        jLabel2.setText("Select which type you want to search");

        jRadioButton1.setText("Reg No");
        jPanel1.add(jRadioButton1);

        jRadioButton2.setText("Name");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);

        jRadioButton3.setText("Class");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false);
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(287, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(306, 306, 306))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(216, 216, 216))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(252, 252, 252)
                                .addComponent(jLabel2)
                                .addGap(47, 47, 47)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jButton2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton2)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//    public void search(){
//        Connection c = DBconnect.connect();        
//        PreparedStatement ps;
//        ResultSet result;   
//        String stt="";        
//        
//        if(jTextField1.getText().equals("")){
//            JOptionPane.showMessageDialog(null, "Enter a keyword to search");
//            return;
//        }
//        
//        if(jRadioButton1.isSelected()){
//            stt="select * from student where regNum like ?";
//        }
//        else if(jRadioButton2.isSelected()){
//            stt="select * from student where name like ? ";
//        }
//        else if(jRadioButton3.isSelected()){
//            stt="select * from student where grade like ?";
//        }
//        else if(jRadioButton4.isSelected()){
//            stt="select * from teacher where Teacher_ID like ?";
//        }
//        else if(jRadioButton5.isSelected()){
//            stt="select * from teacher where fname like ?";
//        }         
//        else{
//            JOptionPane.showMessageDialog(null, "Please select search criteria");
//            return;
//        }
//        
//        
//        try{
//                
//            DefaultTableModel model = new DefaultTableModel(new String[]{"RegNo","Name", "Age", "Class","DOB","Contact","Address","Email"}, 0);
//            
//            ps = c.prepareStatement(stt);             
//            ps.setString(1, "%" + jTextField1.getText() + "%" );
//            ResultSet re = ps.executeQuery();       
//            
//            if(!re.next()){
//                JOptionPane.showMessageDialog(null, "No users found");
//                return;
//            }
//            re.previous();
//            
//            while(re.next()){   
//                
//                if(jRadioButton1.isSelected() || jRadioButton2.isSelected() || jRadioButton3.isSelected()  ){
//                    String regno = re.getString("regNum");
//                    String name = re.getString("name");
//                    String age = re.getString("age");
//                    String grade = re.getString("grade");
//                    
//                    Date dob = re.getDate("dob");
//                    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//                    String stringDOB = df.format(dob);
//                    
//                    String contact = re.getString("contact");
//                    String add = re.getString("address");
//                    String email = re.getString("email");
//                    String button = "view" + name;
//                    model.addRow(new Object[]{button,regno,name,age,grade,stringDOB,contact,add,email});
//                      
//                }
//                else{
//                    //meeka hadapaaaaaaaaan
//                    String id = re.getString("Teacher_ID");
//                    System.out.println(id);
//                }              
//                
//            }
//            jPanel3.setVisible(true);
//            jTable1.setModel(model);
//            
//        }
//        catch(SQLException ex){
//            System.out.println("sql error " + ex.getMessage());
//        }
//    }
    
    public void search(){
        Connection c = DBconnect.connect();        
        PreparedStatement ps;
        ResultSet result;   
        String stt="";        
        
        if(jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Enter a keyword to search");
            return;
        }
        
        if(jRadioButton1.isSelected()){
            stt="select * from student where regNum like ?";
        }
        else if(jRadioButton2.isSelected()){
            stt="select * from student where name like ? ";
        }
        else if(jRadioButton3.isSelected()){
            stt="select * from student where grade like ?";
        }
        else if(jRadioButton4.isSelected()){
            stt="select * from teacher where Teacher_ID like ?";
        }
        else if(jRadioButton5.isSelected()){
            stt="select * from teacher where name like ?";
        }         
        else{
            JOptionPane.showMessageDialog(null, "Please select search criteria");
            return;
        }
        
        
        try{          
            
            ps = c.prepareStatement(stt);             
            ps.setString(1, "%" + jTextField1.getText() + "%" );
            ResultSet re = ps.executeQuery();       
            
            if(!re.isBeforeFirst()){
                JOptionPane.showMessageDialog(null, "No users found");
                return;
            }
            
            DefaultTableModel model1 = new DefaultTableModel(new String[]{"RegNo","Name", "Age", "Class","DOB","Contact","Address","Email"}, 0);
            DefaultTableModel model2 = new DefaultTableModel(new String[]{"ID","Name", "Address", "Contact"}, 0);
            while(re.next()){   
                //display student in table
                
                if(jRadioButton1.isSelected() || jRadioButton2.isSelected() || jRadioButton3.isSelected()  ){
                    
                    String regno = re.getString("regNum");
                    String name = re.getString("name");
                    String age = re.getString("age");
                    String grade = re.getString("grade");
                    
                    Date dob = re.getDate("dob");
                    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                    String stringDOB = df.format(dob);
                    
                    String contact = re.getString("contact");
                    String add = re.getString("address");
                    String email = re.getString("email");
                    
                    model1.addRow(new Object[]{regno,name,age,grade,stringDOB,contact,add,email});
                    jTable1.setModel(model1); 
                }
                
                else{
                    
                    
                    String ID = re.getString("Teacher_ID");
                    String name = re.getString("name");
                    String add = re.getString("address");
                    String contact = re.getString("phone");               
        
                    
                    model2.addRow(new Object[]{ID,name,add,contact});
                    jTable1.setModel(model2);
                }      
                
            }
              
            jPanel3.setVisible(true);
            
        }
        catch(SQLException ex){
            System.out.println("sql error " + ex.getMessage());
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        search();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        new Main().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jComboBox1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jComboBox1PropertyChange
        
    }//GEN-LAST:event_jComboBox1PropertyChange

    String value="Student";
    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
         value = jComboBox1.getSelectedItem().toString(); 
         comboChange();
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){            
            search();
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    public void comboChange(){
        group1.clearSelection();
        group2.clearSelection();
        
        if(value == "Student"){
            jPanel1.setVisible(true);
            jPanel2.setVisible(false);
        }
        else{
            jPanel2.setVisible(true);
            jPanel1.setVisible(false);         
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
            java.util.logging.Logger.getLogger(SearchProfiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchProfiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchProfiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchProfiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchProfiles().setVisible(true);
            }
        });        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
