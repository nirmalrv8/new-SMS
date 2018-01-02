/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Attendance;



import AcademicReports.DBclass;
import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static Profile.MainInterface.Login.reg;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author Pooh
 */
public class LeaveRequest extends javax.swing.JFrame {

    Connection con=null;
        PreparedStatement pst=null;
             private String dcount;
    
    /**
     * Creates new form LeaveRequest
     */
    public LeaveRequest() {
        initComponents();
        jLabel3.setText(reg);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        count_txt = new javax.swing.JTextField();
        reset_txt = new javax.swing.JButton();
        apply_txt = new javax.swing.JButton();
        paytype_txt = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        descr_txt = new javax.swing.JTextArea();
        jButton7 = new javax.swing.JButton();
        from_txt = new com.toedter.calendar.JDateChooser();
        to_txt = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Apply A Leave");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("From                 :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("To                     :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Days Count       :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Payment Type   :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Description       :");

        count_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                count_txtMouseClicked(evt);
            }
        });
        count_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                count_txtActionPerformed(evt);
            }
        });
        count_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                count_txtKeyPressed(evt);
            }
        });

        reset_txt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        reset_txt.setText("Reset");
        reset_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_txtActionPerformed(evt);
            }
        });

        apply_txt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        apply_txt.setText("Apply");
        apply_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apply_txtActionPerformed(evt);
            }
        });

        paytype_txt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No pay", "Paid" }));

        descr_txt.setColumns(20);
        descr_txt.setRows(5);
        jScrollPane2.setViewportView(descr_txt);

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin/image/WhatsApp Image 2017-08-20 at 21.00.30.jpeg"))); // NOI18N
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        from_txt.setDateFormatString("yyyy-MM-dd");

        to_txt.setDateFormatString("yyyy-MM-dd");
        to_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                to_txtFocusLost(evt);
            }
        });
        to_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                to_txtMouseExited(evt);
            }
        });
        to_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                to_txtKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("EMP ID            :");

        jButton1.setText("Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(apply_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reset_txt)
                .addGap(72, 72, 72))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(paytype_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(to_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(from_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(count_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(227, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(from_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(to_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(count_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(paytype_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reset_txt)
                            .addComponent(apply_txt)
                            .addComponent(jButton1))
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void apply_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apply_txtActionPerformed
        System.out.println(reg);
            String reg="";
                JTextField frmdate=(JTextField)from_txt.getDateEditor().getUiComponent();
                    JTextField todate=(JTextField)to_txt.getDateEditor().getUiComponent();

          
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                String dt=sdf.format(from_txt.getDate());
                    SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");           
                        String dt1=sdf1.format(to_txt.getDate());
                
            Date fd1=from_txt.getDate();
                 Date td1=to_txt.getDate();
          
                 String paytype=paytype_txt.getSelectedItem().toString();
                         String descr=descr_txt.getText();
                
                            Date nowdate = new Date();
            
            int x = td1.compareTo(fd1);
                int y = fd1.compareTo(nowdate);
             
                                 System.out.println(x);
                                     System.out.println(y);
            
          
            try{
             String sql="insert into leave_requests (empId,from_,to_,dateCount,paymentType,description )values (?,?,?,?,?,?)";
                pst=con.prepareStatement(sql);
           
                pst.setString(1, reg);
                    pst.setString(2, dt);
                        pst.setString(3, dt1);
                            pst.setString(4, dcount);
                                pst.setString(5, paytype);
                                    pst.setString(6, descr);   
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            
          
            
            


            try{      
                
             if(x >= 1 || y >= 0 ){
                pst.execute();
                    JOptionPane.showMessageDialog(null, "Request submitted");
             }
                else if(x==0 || -1 == x || y<0){
                        JOptionPane.showMessageDialog(rootPane, "Please select a valid day combination","error",JOptionPane.ERROR_MESSAGE);
                }   
             }
                      catch(HeadlessException | SQLException e )
                        {
                                System.out.println(e);
                        }
    
            
       //}
               
    }//GEN-LAST:event_apply_txtActionPerformed

    private void count_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_count_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_count_txtActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
          new Profile.MainInterface.Main().setVisible(true);
                this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void reset_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_txtActionPerformed
        from_txt.setDate(null);
            to_txt.setDate(null);
                count_txt.setText("");
                    descr_txt.setText("");
                      count_txt.setEditable(false);
                        count_txt.setBackground(Color.white);
    }//GEN-LAST:event_reset_txtActionPerformed

    private void count_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_count_txtKeyPressed
        // TODO add your handling code here:
        count_txt.setEditable(false);
                        count_txt.setBackground(Color.red);
         
    }//GEN-LAST:event_count_txtKeyPressed

    private void to_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_to_txtKeyReleased
    }//GEN-LAST:event_to_txtKeyReleased

    private void count_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_count_txtMouseClicked
        
           
            Date fd1=from_txt.getDate();
                Date td1=to_txt.getDate();
                    long durInMili=td1.getTime()-fd1.getTime();
                        int durInDays=(int)durInMili/(1000*60*60*24);
           
            
                            dcount=Integer.toString(durInDays);
                                count_txt.setText(dcount);  
    
    }//GEN-LAST:event_count_txtMouseClicked

    private void to_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_to_txtFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_to_txtFocusLost

    private void to_txtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_to_txtMouseExited
        
    }//GEN-LAST:event_to_txtMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            java.sql.Connection con=DBclass.connect();
            JasperDesign jd=JRXmlLoader.load("C:\\Users\\Dell\\Documents\\GitHub\\SMSnewest\\src\\Attendance\\report1.jrxml");
//            String sql="select * from leave_requests where empId ="+reg;
//            JRDesignQuery newQuery=new JRDesignQuery();
//            newQuery.setText(sql);
//            jd.setQuery(newQuery);
            JasperReport jr=JasperCompileManager.compileReport(jd);
            JasperPrint jp=JasperFillManager.fillReport(jr,null, con);
            JasperViewer.viewReport(jp);
        }
        catch(Exception e){JOptionPane.showMessageDialog(null, e);}
                                            

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(LeaveRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LeaveRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LeaveRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LeaveRequest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LeaveRequest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apply_txt;
    private javax.swing.JTextField count_txt;
    private javax.swing.JTextArea descr_txt;
    private com.toedter.calendar.JDateChooser from_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox<String> paytype_txt;
    private javax.swing.JButton reset_txt;
    private com.toedter.calendar.JDateChooser to_txt;
    // End of variables declaration//GEN-END:variables
}


