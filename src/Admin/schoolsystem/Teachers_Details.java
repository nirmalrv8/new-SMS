/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin.schoolsystem;

import static Admin.schoolsystem.Student_Details.phone;
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author tharindu
 */
public class Teachers_Details extends javax.swing.JFrame {

    Connection con=null;
    PreparedStatement pst =null;
    ResultSet rs=null;
    
            private String Id;
            private String Fname;
            private String Address;
            private int Pno;
            private int Age;
            private String Date;
            private String password;
            private String Email; 
            
    public Teachers_Details() {
        initComponents();
        
        con=Profile.MainInterface.DBconnect.connect();
        
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, 
        size.height/2 - getHeight()/2);
        
        setTableValue();
    }
    
    public void getdetails()
    {
            this.Id=id.getText();
            this.Fname=fname.getText();
            this.Address=address.getText();
            this.Pno=Integer.parseInt(phone.getText());
            this.Age=Integer.parseInt(age.getText());
            
            SimpleDateFormat da=new SimpleDateFormat("yyyy-MM-dd");
            this.Date=da.format(date.getDate());
            this.Email=email.getText();
            this.password=pass.getText();
            
            
            
    }
    
    public void setTableValue()
     {
         try{
             
            String sql= "select Teacher_ID,name,address,phone,age,Date_Joined from teacher ";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            
            table.setModel(DbUtils.resultSetToTableModel(rs));
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,e);
         }
     
     }
     public void getTableValue()
     {
         try{
              int row=table.getSelectedRow();
              String Table_click=(table.getModel().getValueAt(row,0).toString());
              String sql="select * from teacher where Teacher_ID='"+Table_click+"'";
              pst=con.prepareStatement(sql);
              rs=pst.executeQuery();
              
              if(rs.next())
              {
                id.setText(rs.getString("Teacher_ID"));
                fname.setText(rs.getString("name"));
                address.setText(rs.getString("address"));
                phone.setText(rs.getString("phone"));
                age.setText(rs.getString("age"));
                date.setDate(rs.getDate("Date_Joined"));
                email.setText(rs.getString("email"));
              }
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,e);
         }
     
     }
     public void add()
    {
        try{
           
            String sql="INSERT INTO teacher(Teacher_ID,name,Password,address,phone,age,Date_Joined,email)"
                    +"VALUES('"+Id+"','"+Fname+"','"+password+"','"+Address+"','"+Pno+"','"+Age+"','"+Date+"','"+Email+"')";
           
            pst = con.prepareStatement(sql);
            pst.execute(sql);
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    public void search()
    {
        String sql="select * from teacher where Teacher_ID=?";
    
        try{
             pst=con.prepareStatement(sql);
             pst.setString(1,id.getText());
             rs=pst.executeQuery();
            
            if(rs.next())
            {
                lableteacher.setText(null);
                
                id.setText(rs.getString("Teacher_ID"));
                fname.setText(rs.getString("name"));
                address.setText(rs.getString("address"));
                phone.setText(rs.getString("phone"));
                age.setText(rs.getString("age"));
                date.setDate(rs.getDate("Date_Joined"));
                email.setText(rs.getString("email"));
            }
            else
            {
                lableteacher.setText("Enter Valid ID");
            }
        }
        catch(Exception e)
        {
            System.out.println("erro");
        }
    }
    public void delete()
    {
        try{
            String de="DELETE FROM teacher WHERE Teacher_ID=?";
            pst=con.prepareStatement(de);
            
            pst.setString(1,Id);
            
           int msg= JOptionPane.showConfirmDialog(null,"Do you want to delete Teacher ID : "+Id,"close",JOptionPane.YES_OPTION,JOptionPane.NO_OPTION);
            if(msg==JOptionPane.YES_OPTION)
            {
                pst.executeUpdate();
            }
           
         
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    public void update()
    {
         try{
   
       String sq="update teacher set name=?,address=?,phone=?,age=?,Date_Joined=?,email=? where Teacher_ID=?";
            
            pst=con.prepareStatement(sq);
             
            pst.setString(1,fname.getText());
            pst.setString(2,address.getText());
            pst.setString(3,phone.getText());
            pst.setString(4,age.getText());
            
            SimpleDateFormat da=new SimpleDateFormat("yyyy-MM-dd");
            
            String Sdate=da.format(date.getDate());
            
            pst.setString(5,Sdate);
            pst.setString(6,email.getText());
            pst.setString(7,id.getText());
            
            pst.executeUpdate();

       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,"Invalid Teacher ID.....");
       }
    }
    
    public void reset()
    {
        id.setText(null);
        fname.setText(null); 
        address.setText(null);
        phone.setText(null);
        age.setText(null);
        date.setDate(null);
        pass.setText(null);
        email.setText(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lable2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        lable1 = new javax.swing.JLabel();
        lableteacher = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setToolTipText("huudid");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TEACHERS DETAILS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jLabel2.setText("TEACHER ID  :");

        jLabel4.setText("NAME  :");

        jLabel6.setText("ADDRESS  :");

        jLabel7.setText("CONTACT NUMBER  :");

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        phone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                phoneMouseExited(evt);
            }
        });
        phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phoneKeyPressed(evt);
            }
        });

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("SEARCH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Teacher ID", "Name", "Address", "Contact Number", "Age", "Join Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.setToolTipText("");
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(50);
            table.getColumnModel().getColumn(4).setPreferredWidth(100);
            table.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        jButton4.setText("CLEAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("UPDATE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setText("AGE :");

        age.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ageMouseMoved(evt);
            }
        });
        age.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ageMouseClicked(evt);
            }
        });
        age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ageKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ageKeyTyped(evt);
            }
        });

        jLabel8.setText("DATE JOIN :");

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin/image/WhatsApp Image 2017-08-20 at 21.00.30.jpeg"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin/image/WhatsApp Image 2017-08-20 at 21.00.29.jpeg"))); // NOI18N

        lable1.setForeground(new java.awt.Color(255, 0, 0));

        lableteacher.setForeground(new java.awt.Color(255, 0, 51));

        jLabel9.setText("PASSWORD :");

        jLabel5.setText("Email :");

        javax.swing.GroupLayout lable2Layout = new javax.swing.GroupLayout(lable2);
        lable2.setLayout(lable2Layout);
        lable2Layout.setHorizontalGroup(
            lable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lable2Layout.createSequentialGroup()
                .addGroup(lable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lable2Layout.createSequentialGroup()
                        .addGroup(lable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lable2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(lable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addGroup(lable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3))
                                    .addGroup(lable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(lable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(lable2Layout.createSequentialGroup()
                                        .addGroup(lable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(address, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(age, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(lable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(lable2Layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(lable1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(lable2Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(lable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addGroup(lable2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lableteacher, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(lable2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lable2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        lable2Layout.setVerticalGroup(
            lable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lable2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(lable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(lableteacher, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(lable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(lable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lable2Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(lable1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lable2Layout.createSequentialGroup()
                        .addGroup(lable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(lable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(lable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))))
                .addGroup(lable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(lable2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel5))
                    .addGroup(lable2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton7)
                    .addComponent(jButton6))
                .addContainerGap())
            .addGroup(lable2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lable2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lable2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
            getdetails();            
            add();
            setTableValue();
            reset();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        reset();
        setTableValue();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        search();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        new Admin_Panel().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        getdetails();
        delete();
        reset();
        setTableValue();      
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        getdetails();
        update();
        setTableValue();
        reset();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        getTableValue();
    }//GEN-LAST:event_tableMouseClicked

    private void phoneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneMouseExited
        
    }//GEN-LAST:event_phoneMouseExited

    private void phoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()>=KeyEvent.VK_0 && evt.getKeyCode()<=KeyEvent.VK_9 || evt.getKeyCode()==KeyEvent.VK_BACKSPACE || evt.getKeyCode() == KeyEvent.VK_DELETE)
        {
            if(phone.getText().length()<10)
            {
                phone.setEditable(true);
                phone.setBackground(Color.white);
            }
            else
            {
                phone.setEditable(false);
                phone.setBackground(Color.white);
            }
        }
        else
        {
            phone.setEditable(false);
            phone.setBackground(Color.red);
        }
               

    }//GEN-LAST:event_phoneKeyPressed

    private void ageKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ageKeyTyped

    private void ageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_ageKeyReleased

    private void ageMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ageMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_ageMouseMoved

    private void ageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ageMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ageMouseClicked

    private void ageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()>=KeyEvent.VK_2 && evt.getKeyCode()<=KeyEvent.VK_9 || evt.getKeyCode()==KeyEvent.VK_BACKSPACE || evt.getKeyCode()==KeyEvent.VK_DELETE)
        {
            if(age.getText().length()<2)
            {
                age.setEditable(true);
                age.setBackground(Color.white);
            }
            else
            {
                age.setEditable(false);
                age.setBackground(Color.white);
            }
        }
        else
        {
            age.setEditable(false);
            age.setBackground(Color.red);
        }

    }//GEN-LAST:event_ageKeyPressed

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
            java.util.logging.Logger.getLogger(Teachers_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teachers_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teachers_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teachers_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teachers_Details().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField address;
    public static javax.swing.JTextField age;
    public static com.toedter.calendar.JDateChooser date;
    private javax.swing.JTextField email;
    public static javax.swing.JTextField fname;
    public static javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lable1;
    private javax.swing.JPanel lable2;
    private javax.swing.JLabel lableteacher;
    private javax.swing.JPasswordField pass;
    public static javax.swing.JTextField phone;
    public javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}


