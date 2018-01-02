/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calendar1.calander;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author DELL
 */
public class StudentCalendar extends javax.swing.JFrame {

    /**
     * Creates new form StudentCalendar
     */
    
       Connection con = Calendar1.calander.dbconnect.connect();
       java.awt.GridBagConstraints gridBagConstraints;
    public StudentCalendar() {
        initComponents();
        
        DateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date1=new Date();
        System.out.println(dateformat.format(date1));
        
     
        
        JPanel panelMain = new JPanel(new GridBagLayout());
         
      
         ResultSet rs=null;
         
      
                  String q1="Select * from calander";
                  
        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
                  
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//        gridBagConstraints = new java.awt.GridBagConstraints();
//        gridBagConstraints.gridx = 0;
//        gridBagConstraints.gridy = 4;
//        gridBagConstraints.gridwidth = 7;
//        gridBagConstraints.ipadx = 752;
//        gridBagConstraints.ipady = 1;
//        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
//        gridBagConstraints.insets = new java.awt.Insets(18, 12, 0, 12);
//        panelMain.add(jSeparator1, gridBagConstraints);

        jTextField1.setForeground(new java.awt.Color(102, 99, 99));
        jTextField1.setText("Search Event By Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 211;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 168, 0, 0);
       panelMain.add(jTextField1, gridBagConstraints);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
            jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
            });


        jButton1.setText("Search");
          jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 150, 0, 0);
        panelMain.add(jButton1, gridBagConstraints);

        
         jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin/image/WhatsApp Image 2017-08-20 at 21.00.30.jpeg")));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 35;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 32, 0, 0);
        panelMain.add(jButton2, gridBagConstraints);
         panelMain.add(jButton2, gridBagConstraints);
         jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 30)); // NOI18N
        jLabel1.setText("Event Calender");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 193;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 80, 0, 0);
      panelMain.add(jLabel1, gridBagConstraints);
        
        pack();
            
                try{
                PreparedStatement ps=con.prepareStatement(q1);
                rs=ps.executeQuery();
                
                int a=0;
                int b=0;
                
                 while(rs.next()){
                    
                    int i=0,x=0;
                    String ename1=rs.getString("ename");
                    String vanue=rs.getString("vanue");
                    String dis=rs.getString("description");
                    byte[]imagedata=rs.getBytes("image");
                    format =new ImageIcon(imagedata);
                    String date=rs.getString("date");
                    String chief=rs.getString("chief");
                     Image img=format.getImage();
                    
                    
                     jPanel1 = new javax.swing.JPanel();
                     jLabel2 = new javax.swing.JLabel();
                     jLabel3 = new javax.swing.JLabel();
                     jLabel4 = new javax.swing.JLabel();
                     jLabel5 = new javax.swing.JLabel();
                     jButton3 = new javax.swing.JButton();
                     jDesktopPane1 = new javax.swing.JDesktopPane();
                     jLabel7 = new javax.swing.JLabel();
                      Image newimg=img.getScaledInstance(360,260, Image.SCALE_SMOOTH);
                      ImageIcon image=new ImageIcon(newimg);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(360,520));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(360, 30));
        jLabel2.setText(" Date :"+date);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 167;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 32, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(360, 30));
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText(" Event Name :"+ename1);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 173;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 32, 0, 0);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(360, 30));
        jLabel4.setText(" Discription :"+dis);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 192;
        gridBagConstraints.ipady = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 32, 0, 0);
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tekton Pro Ext", 1, 24)); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(360, 30));
        jLabel5.setForeground(new java.awt.Color(0, 255, 0));
        jLabel5.setText(" Vanue :"+vanue);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 151;
        gridBagConstraints.ipady = 33;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 32, 0, 0);
        jPanel1.add(jLabel5, gridBagConstraints);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton3.setPreferredSize(new java.awt.Dimension(360, 30));
        jButton3.setText("Subscribe To "+ename1);
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 134;
        gridBagConstraints.ipady = 13;
        //gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, -52, 2, 0);
        jPanel1.add(jButton3, gridBagConstraints);

        
         jLabel7.setIcon(image);
         //jLabel7.setText("asd");
         jLabel7.setPreferredSize(new java.awt.Dimension(360,260));
         
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
       // gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 307;
        gridBagConstraints.ipady = 200;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(-280, 0, 20,0 );
        jPanel1.add(jLabel7, gridBagConstraints);
//        jLabel6.setIcon(format);
//        jDesktopPane1.setBackground(new java.awt.Color(240, 240, 240));
//        jDesktopPane1.setLayout(new java.awt.GridBagLayout());
//        gridBagConstraints = new java.awt.GridBagConstraints();
//        gridBagConstraints.gridx = 0;
//        gridBagConstraints.gridy = 0;
//        gridBagConstraints.ipadx = 253;
//        gridBagConstraints.ipady = 169;
//        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
//        gridBagConstraints.insets = new java.awt.Insets(13, 12, 13, 12);
//        jDesktopPane1.add(jLabel6, gridBagConstraints);

//        gridBagConstraints = new java.awt.GridBagConstraints();
//        gridBagConstraints.gridx = 0;
//        gridBagConstraints.gridy = 0;
//        gridBagConstraints.gridwidth = 3;
//        gridBagConstraints.ipadx = 318;
//        gridBagConstraints.ipady = 211;
//        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
//        gridBagConstraints.insets = new java.awt.Insets(2, 2, 0, 2);
//        jPanel1.add(jDesktopPane1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        if(a%3==0){
            b++;
            a=0;
         }
        gridBagConstraints.gridx = a;
        gridBagConstraints.gridy = b;
       // gridBagConstraints.gridwidth = 2;
       // gridBagConstraints.ipadx = 53;
       // gridBagConstraints.ipady = 84;
       // gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(150, 0, 0, 30);
        panelMain.add(jPanel1, gridBagConstraints);

        a++;
        pack();
                
                
                 }
                 
                         JScrollPane scrollPanel = new JScrollPane(panelMain);
                         getContentPane().add(scrollPanel, BorderLayout.CENTER);
                         pack();
                         
                
                }
                catch(Exception e){
                
                    JOptionPane.showMessageDialog(null, e);
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
     private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
               
         ResultSet rs1=null;
         ResultSet rs2=null;
         ResultSet rs3=null;
   
         Connection con = Calendar1.calander.dbconnect.connect();
         PreparedStatement ps=null;
         PreparedStatement ps1=null;
         PreparedStatement ps2=null;
       
        String a=(evt.getActionCommand());    
        String val[]=a.split(" ");
         ename=val[2];
        //System.out.println("Event name is " +ename);
        
        try{
            String q="INSERT INTO student_calendar values(?,?)";
        
       ps =con.prepareStatement(q); 
         ps.setString(1, "001");
        // ps.setString(2, eid);
         ps.setString(2, ename);
        
         
         
         ps.execute();
         JOptionPane.showMessageDialog(null, "You have successfully subscribed to "+ename);

        }
        catch(SQLException sqe){
            JOptionPane.showMessageDialog(null, "You have already subscribe for this event");
            System.out.println(" "+sqe);
        }
        
        
//        try{
//           String sql3="select c.date from student_calendar s,calander c where s.ename=c.ename and s.regNum='001'";
//            ps2=con.prepareStatement(sql3);
//            rs2=ps2.executeQuery();
//            while(rs2.next()){
//            
//         java.util.Date date1=rs2.getDate("date");
//                
//        LocalDate now = LocalDate.now();
//        LocalDate ld = new java.sql.Date(date1.getTime()).toLocalDate();
//        Period diff = Period.between(ld, now);
//        int day=diff.getDays();
// 
//                System.out.println(" "+day);
//       
//       String sql4="select count(message) as count from notification where message=? and regNum=?";
//        ps=con.prepareStatement(sql4);
//         ps.setString(1, "You have 2 days for the event "+ename);
//         ps.setString(2, "001");
//         int count=0;
//         rs3=ps.executeQuery();
//         while(rs3.next()){
//         
//             count=rs3.getInt("count");
//         
//         }
//                System.out.println("  "+count);
//               
//        
//         
//       if(count==0){
//       if(day==2){
//           String q="INSERT INTO notification (message,regNum) values(?,?)";
//        
//       ps =con.prepareStatement(q); 
//         ps.setString(1, "You have 2 days for the event "+ename);
//         ps.setString(2, "001");
//       
//        
//         
//         
//         ps.execute();
//       }
//    
//       }
//        }
//        }
//        catch(SQLException e){
//        
//            JOptionPane.showMessageDialog(null, e);
//        }
        
   
       

        
    } 
     
     private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
        jTextField1.selectAll();
        
    }           
     
     private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {                                       
         char key = (char) evt.getKeyCode();
              
               if((key>=evt.VK_A && key<=evt.VK_Z)||(key == evt.VK_BACK_SPACE)||(key == evt.VK_SPACE)||(key == evt.VK_PERIOD)||(key==KeyEvent.VK_ENTER)){
                   
                   jTextField1.setEditable(true);
                   jTextField1.setBackground(Color.white);
               }
               else{
                    jTextField1.setEditable(false);
                    jTextField1.setBackground(Color.red);
               }
               
                  if(key==KeyEvent.VK_ENTER){
               
                   search();
                   
               }
        
    }
     
        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {     
            
            search();
        }  
        public void search(){
            String enam=jTextField1.getText();
            if(enam.equalsIgnoreCase("Search Event By Name")){
            
                JOptionPane.showMessageDialog(null, "Need an event name to search events");
            }
            
            else{
                
                getContentPane().removeAll();
            String sql="Select * from calander where ename like '%"+enam+"%'";
            
             JPanel panelMain = new JPanel(new GridBagLayout());
             
              
                        // PanelMain.repaint();
         
      
         ResultSet rs=null;
         
              
                
         
      
                  String q1="Select * from calander";
                  
        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        int a=0;
        int b=0;
                  
          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);


        jTextField1.setForeground(new java.awt.Color(102, 99, 99));
        jTextField1.setText("Search Event By Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 211;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 168, 0, 0);
       panelMain.add(jTextField1, gridBagConstraints);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        
             jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
            });


        jButton1.setText("Search");
          jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.weighty = 1;
       // gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(-600, 150, 0, 0);
        panelMain.add(jButton1, gridBagConstraints);

       
        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin/image/WhatsApp Image 2017-08-20 at 21.00.30.jpeg"))); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 35;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 32, 0, 0);
        panelMain.add(jButton2, gridBagConstraints);
         jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 30)); // NOI18N
        jLabel1.setText("Event Calender");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 193;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 80, 0, 0);
      panelMain.add(jLabel1, gridBagConstraints);
        
        pack();
            try{
                PreparedStatement ps=con.prepareStatement(sql);
                ResultSet rs1=ps.executeQuery();
                if(!rs1.isBeforeFirst()){
                
                        JOptionPane.showMessageDialog(null, "No result");
                        this.dispose();
                        new StudentCalendar().setVisible(true);
                }
                while(rs1.next()){
                
                                   
                    int i=0,x=0;
                    String ename1=rs1.getString("ename");
                    String vanue=rs1.getString("vanue");
                    String dis=rs1.getString("description");
                    byte[]imagedata=rs1.getBytes("image");
                    format =new ImageIcon(imagedata);
                    String date=rs1.getString("date");
                    String chief=rs1.getString("chief");
                     Image img=format.getImage();
                    
                    
                     jPanel1 = new javax.swing.JPanel();
                     jLabel2 = new javax.swing.JLabel();
                     jLabel3 = new javax.swing.JLabel();
                     jLabel4 = new javax.swing.JLabel();
                     jLabel5 = new javax.swing.JLabel();
                     jButton3 = new javax.swing.JButton();
                     jDesktopPane1 = new javax.swing.JDesktopPane();
                     jLabel7 = new javax.swing.JLabel();
                      Image newimg=img.getScaledInstance(360,260, Image.SCALE_SMOOTH);
                      ImageIcon image=new ImageIcon(newimg);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(360,520));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(420, 30));
        jLabel2.setText(" Date :"+date);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 167;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 32, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(360, 30));
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText(" Event Name :"+ename1);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 173;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 32, 0, 0);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(360, 30));
        jLabel4.setText(" Discription :"+dis);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 192;
        gridBagConstraints.ipady = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 32, 0, 0);
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tekton Pro Ext", 1, 24)); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(360, 30));
        jLabel5.setForeground(new java.awt.Color(0, 255, 0));
        jLabel5.setText(" Vanue :"+vanue);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 151;
        gridBagConstraints.ipady = 33;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 32, 0, 0);
        jPanel1.add(jLabel5, gridBagConstraints);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton3.setText("Subscribe To "+ename1);
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 134;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.insets = new java.awt.Insets(7, -52, 2, 0);
        jPanel1.add(jButton3, gridBagConstraints);

        
         jLabel7.setIcon(image);
         
         jLabel7.setPreferredSize(new java.awt.Dimension(360,220));
         
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
       // gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 307;
        gridBagConstraints.ipady = 200;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(-280, 0, 20,0 );
        jPanel1.add(jLabel7, gridBagConstraints);


        gridBagConstraints = new java.awt.GridBagConstraints();
        if(a%3==0){
            b++;
            a=0;
         }
        gridBagConstraints.gridx = a;
        gridBagConstraints.gridy = b;
    
        gridBagConstraints.insets = new java.awt.Insets(180, 0, 0, 50);
        panelMain.add(jPanel1, gridBagConstraints);

        a++;
        pack();
        
                
                
                 }
                 
                         JScrollPane scrollPanel = new JScrollPane(panelMain);
                         getContentPane().add(scrollPanel, BorderLayout.CENTER);
                        
                                                
                         pack();
                         getContentPane().revalidate();
                         getContentPane().validate();
                        // getContentPane().repaint();
            
                
                }
            
            catch(SQLException e){
            
                JOptionPane.showMessageDialog(null, e);
            }
             
            }   
    }
         private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {  
         
              this.dispose();
              new Profile.MainInterface.Main().setVisible(true);
         
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
            java.util.logging.Logger.getLogger(StudentCalendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentCalendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentCalendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentCalendar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentCalendar().setVisible(true);
            }
        });
    }
    public  String ename;
    private ImageIcon format=null;
    int s=0;
    byte[] event_image=null;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
