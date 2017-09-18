/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance;

import codes.DBconnect;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Pooh
 */
public class markEmployeeAttendance extends javax.swing.JFrame {

        Connection con=null;
        PreparedStatement pst=null;
        ResultSet rs=null;
        int count=0;
    /**
     * Creates new form markEmployeeAttendance
     */
    public markEmployeeAttendance() {
        initComponents();
        
        //dbconnection
        con=DBconnect.connect();
                
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        save_btn = new javax.swing.JButton();
        calc_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        empAtt_table = new javax.swing.JTable();
        date_txt = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Employee Attendance Register");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Date :");

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton1.setText(": Rapid Marking");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        save_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        save_btn.setText("Save");
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });

        calc_btn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        calc_btn.setText("Calculate Attendance");
        calc_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calc_btnActionPerformed(evt);
            }
        });

        empAtt_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Employee ID", "Name", "Attendance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        empAtt_table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(empAtt_table);
        if (empAtt_table.getColumnModel().getColumnCount() > 0) {
            empAtt_table.getColumnModel().getColumn(0).setMinWidth(100);
            empAtt_table.getColumnModel().getColumn(0).setPreferredWidth(100);
            empAtt_table.getColumnModel().getColumn(0).setMaxWidth(100);
            empAtt_table.getColumnModel().getColumn(1).setMinWidth(150);
            empAtt_table.getColumnModel().getColumn(1).setPreferredWidth(150);
            empAtt_table.getColumnModel().getColumn(1).setMaxWidth(150);
            empAtt_table.getColumnModel().getColumn(2).setMinWidth(100);
            empAtt_table.getColumnModel().getColumn(2).setPreferredWidth(100);
            empAtt_table.getColumnModel().getColumn(2).setMaxWidth(100);
        }

        jButton2.setText("Get All");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin/image/WhatsApp Image 2017-08-20 at 21.00.30.jpeg"))); // NOI18N
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(date_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jButton2)
                                .addGap(125, 125, 125)
                                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calc_btn)
                        .addContainerGap(39, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(calc_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addGap(102, 102, 102)
                        .addComponent(date_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(217, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btnActionPerformed
       
        try
        {
            for(int i=0; i<count; i++)
            {
                
                String eid=empAtt_table.getValueAt(i, 0).toString();
                if(eid.equals(null)){
                    eid="null";
                }
//                eid="null";
    
      
                
//                if(checked.equals(null)){
//                    checked="null";
//                }
//                checked="false";   
String checked;
                try{
                 checked=empAtt_table.getValueAt(i, 2).toString(); 
                }
                catch(NullPointerException ne){
                    checked="false";
                }
                
                String dt=((JTextField)date_txt.getDateEditor().getUiComponent()).getText();
//                if(dt.equals(null)){
//                    dt="null";
//                }
//                dt="null";
                
                System.out.println(eid);
                System.out.println(checked);
                System.out.println(dt);
                
            String sql="Insert into employee_attendance(Date_,empID,present) values(?,?,?) ";
            pst =con.prepareStatement(sql);
            pst.setString(1,dt);
            pst.setString(2,eid);
            pst.setString(3, checked);

            pst.execute();
           
            }
            
            
            JOptionPane.showMessageDialog(null, "Records saved succesfully");
        }
        catch(Exception e)
        {
        
            System.out.println(e);
        
        }
        
        
        
    }//GEN-LAST:event_save_btnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         clearAllRows();
        loadTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if(jRadioButton1.isSelected()){
        try{
            
            for(int i=0; i<count; i++){
            
            empAtt_table.setValueAt(true, i, 2);
            }
       
        }
        catch(Exception e)
        {
            System.out.println(e);
        
        }
        }
        else{
            try{
            
            for(int i=0; i<count; i++){
            
            empAtt_table.setValueAt(false, i, 2);
            }
       
        }
        catch(Exception e)
        {
            System.out.println(e);
        
        }
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void calc_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calc_btnActionPerformed
        int present = 0;
       int absent  = 0;
       
       for(int i=0; i<count; i++){
           if("true".equals(empAtt_table.getValueAt(i, 2).toString())){
               present++;
           }
           else if("false".equals(empAtt_table.getValueAt(i, 2).toString())){
               absent++;
           }
       }
        markStudentAttendance.infoBox("present:" + present + " absent: " + absent + " ","TITLE BAR MESSAGE");

    }                                          

    public static void infoBox(String infoMsg,String titleBar){
        JOptionPane.showMessageDialog(null, infoMsg , "Attendance count",JOptionPane.INFORMATION_MESSAGE );
    
    }//GEN-LAST:event_calc_btnActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        AttendanceHome ah=new AttendanceHome();
        ah.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(markEmployeeAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(markEmployeeAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(markEmployeeAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(markEmployeeAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new markEmployeeAttendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calc_btn;
    private com.toedter.calendar.JDateChooser date_txt;
    private javax.swing.JTable empAtt_table;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton save_btn;
    // End of variables declaration//GEN-END:variables

     private void loadTable() {
        DefaultTableModel mod=(DefaultTableModel)empAtt_table.getModel();
        mod.setRowCount(10);
           
        try
           
        {
         
                     
           
            String q="select Teacher_ID, name  from teacher  ";
            pst=con.prepareStatement(q);
            rs=pst.executeQuery();
            //System.out.println("ppp");
             
            int i=0;
            
            while(rs.next()){
            count++;
                String col1=rs.getString("Teacher_Id");
                String col2=rs.getString("name");
//                String col3=rs.getString("department");
//                String col4=rs.getString("designation");
                
               // System.out.println(col1+" "+col2+ " "+col3+" "+col4  );
                empAtt_table.setValueAt(col1, i, 0);
                empAtt_table.setValueAt(col2, i, 1);
//                empAtt_table.setValueAt(col3, i, 2);
//                empAtt_table.setValueAt(col4, i, 3);
                            //System.out.println("ppp");
                i++;
           
            }
          
            
            //empAtt_table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
   
    }
    
    
    private void clearAllRows() {
        
        DefaultTableModel mod=(DefaultTableModel)empAtt_table.getModel();
        mod.setRowCount(0);
    
      
      }
}
