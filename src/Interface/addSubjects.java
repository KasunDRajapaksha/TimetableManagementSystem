/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;


import Code.DBConnect_2;
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static javax.management.Query.match;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static jdk.nashorn.internal.objects.NativeString.match;
import static sun.security.util.HostnameChecker.match;

/**
 *
 * @author Dilshan
 */
public class addSubjects extends javax.swing.JFrame {

    /**
     * Creates new form addSubjects
     */
    public addSubjects() {
        initComponents();
        con = DBConnect_2.connect();
       // setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    Connection con;
    PreparedStatement pst;
    DefaultTableModel df;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        home = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        subName = new javax.swing.JTextField();
        subCode = new javax.swing.JTextField();
        offYear = new javax.swing.JComboBox<>();
        offSem = new javax.swing.JComboBox<>();
        lecHours = new javax.swing.JComboBox<>();
        tutHours = new javax.swing.JComboBox<>();
        labHours = new javax.swing.JComboBox<>();
        evaHours = new javax.swing.JComboBox<>();
        offSemVal = new javax.swing.JLabel();
        subNameVal = new javax.swing.JLabel();
        subCodeVal = new javax.swing.JLabel();
        labVal = new javax.swing.JLabel();
        offYearVal = new javax.swing.JLabel();
        lecVal = new javax.swing.JLabel();
        evaVal = new javax.swing.JLabel();
        tutVal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        manageSub = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        home.setBackground(new java.awt.Color(15, 19, 52));
        home.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(15, 19, 52));
        back.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel2.setText("Subject Name");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel3.setText("Subject Code");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel4.setText("Offered Year ");

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel5.setText("Offered Semester");

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel6.setText("Number of Lecture Hours");

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel7.setText("Number of Tutorial Hours");

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel8.setText("Number of Lab Hours");

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel9.setText("Number of Evaluation Hours");

        subName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subNameActionPerformed(evt);
            }
        });
        subName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                subNameKeyReleased(evt);
            }
        });

        subCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                subCodeKeyReleased(evt);
            }
        });

        offYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Year 1", "Year 2", "Year 3", "Year 4", " " }));
        offYear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                offYearMouseEntered(evt);
            }
        });

        offSem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Semester 1", "Semester 2" }));

        lecHours.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "0 Hours/Week", "1 Hours/Week", "2 Hours/Week", "3 Hours/Week", "4 Hours/Week", "5 Hours/Week" }));

        tutHours.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "0 Hours/Week", "1 Hours/Week", "2 Hours/Week", "3 Hours/Week", "4 Hours/Week", "5 Hours/Week", " " }));

        labHours.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "0 Hours/Week", "1 Hours/Week", "2 Hours/Week", "3 Hours/Week", "4 Hours/Week", "5 Hours/Week" }));

        evaHours.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "0 Hours/Week", "1 Hours/Week", "2 Hours/Week", "3 Hours/Week", "4 Hours/Week", "5 Hours/Week" }));

        offSemVal.setForeground(new java.awt.Color(255, 51, 51));

        subNameVal.setForeground(new java.awt.Color(255, 51, 51));

        subCodeVal.setForeground(new java.awt.Color(255, 51, 51));

        labVal.setForeground(new java.awt.Color(255, 51, 51));

        offYearVal.setForeground(new java.awt.Color(255, 51, 51));

        lecVal.setForeground(new java.awt.Color(255, 51, 51));

        evaVal.setForeground(new java.awt.Color(255, 51, 51));

        tutVal.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(offSem, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(offSemVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(subNameVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(offYear, 0, 180, Short.MAX_VALUE)
                                .addGap(145, 145, 145))
                            .addComponent(subCodeVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(offYearVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(subCode, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subName, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(evaHours, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labHours, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tutHours, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(58, 58, 58)
                            .addComponent(lecHours, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labVal, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(evaVal, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tutVal, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lecVal, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(subName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lecHours, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 4, Short.MAX_VALUE)
                        .addComponent(lecVal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tutHours, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(tutVal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(subNameVal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(subCode, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(subCodeVal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(offYear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labHours, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(offYearVal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labVal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(offSem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(evaHours, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(offSemVal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(evaVal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(15, 19, 52));
        jLabel1.setText("ADD SUBJECT");

        save.setBackground(new java.awt.Color(15, 19, 52));
        save.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(15, 19, 52));
        clear.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        manageSub.setBackground(new java.awt.Color(15, 19, 52));
        manageSub.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        manageSub.setForeground(new java.awt.Color(255, 255, 255));
        manageSub.setText("Manage Subjects");
        manageSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageSubActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(15, 19, 52));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete_32px.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 983, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(manageSub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(105, Short.MAX_VALUE))))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageSub, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void subNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subNameActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        
        //Validations
        
        if(subName.getText().trim().isEmpty()){
            subNameVal.setText("* Please Enter Subject Name !");
        }
        else
            subNameVal.setText("");
            
        
        if(subCode.getText().trim().isEmpty()){
            subCodeVal.setText("* Please Enter Subject Code !");
        }
        else
            subCodeVal.setText(""); 

        if(offYear.getSelectedIndex() == 0){
            offYearVal.setText("* Please Select !");
        }
        else
            offYearVal.setText("");
        
        if(offSem.getSelectedIndex() == 0){
            offSemVal.setText("* Please Select !");
        }
        else
            offSemVal.setText("");
        
        if(lecHours.getSelectedIndex() == 0){
            lecVal.setText("* Please Select !");
        }
        else
            lecVal.setText("");
        
        if(tutHours.getSelectedIndex() == 0){
            tutVal.setText("* Please Select !");
        }
        else
            tutVal.setText("");
        
        if(labHours.getSelectedIndex() == 0){
            labVal.setText("* Please Select !");
        }
        else
            labVal.setText("");
        
        if(evaHours.getSelectedIndex() == 0){
            evaVal.setText("* Please Select !");
        }
        else
            evaVal.setText("");
        
        String sNamePATTERN = "[a-zA-Z]{2,5}$";
            Pattern sNamepatt = Pattern.compile(sNamePATTERN);
            Matcher sNamematch = sNamepatt.matcher(subName.getText());
            if(!sNamematch.matches()){
            subNameVal.setText("* Invalid Subject Name !");   
            }
            
            else
                subNameVal.setText("");  
        
        String sCodePATTERN = "^[a-zA-Z]{2}[0-9]{4}$";
            Pattern sCodepatt = Pattern.compile(sCodePATTERN);
            Matcher sCodematch = sCodepatt.matcher(subCode.getText());
            if(!sCodematch.matches()){
            subCodeVal.setText("* Invalid Subject Code !");   
            }
            
            else
                subCodeVal.setText("");
            
          
        
        
        if(subName.getText().trim().isEmpty() || !sNamematch.matches() || subCode.getText().trim().isEmpty() || !sCodematch.matches() || offYear.getSelectedIndex() == 0 || offSem.getSelectedIndex() == 0 || lecHours.getSelectedIndex() == 0 || 
                tutHours.getSelectedIndex() == 0 || labHours.getSelectedIndex() == 0 || evaHours.getSelectedIndex() == 0 ){
            Component frame = null;
            
            JOptionPane.showMessageDialog(frame, "Please fill in a valid value for all required fields");
            
            
        
        }
        
        //Data Input
        
        else{
      
        try {
        
            String SubName = subName.getText().trim();
            String SubCode = subCode.getText().trim();
            String OfferedYear = offYear.getSelectedItem().toString();
            String OfferedSemester = offSem.getSelectedItem().toString();
            String LecHours = lecHours.getSelectedItem().toString();
            String TutHours = tutHours.getSelectedItem().toString();
            String LabHours = labHours.getSelectedItem().toString();
            String EvaHours = evaHours.getSelectedItem().toString();
            
            
            
            
                pst = con.prepareStatement("insert into subjects(subject_name,subject_code,year,semester,lecture_hours,tutorial_hours,lab_hours,evaluation_hours) values(?,?,?,?,?,?,?,?)");
                pst.setString(1,SubName);
                pst.setString(2,SubCode);
                pst.setString(3,OfferedYear);
                pst.setString(4,OfferedSemester);
                pst.setString(5,LecHours);
                pst.setString(6,TutHours);
                pst.setString(7,LabHours);
                pst.setString(8,EvaHours);
                
                pst.executeUpdate();
                
            JOptionPane.showMessageDialog(this, "New Subject Added Successfully");
           // this.setVisible(false);
            
            subName.setText("");
            subCode.setText("");
            offYear.setSelectedIndex(0);
            offSem.setSelectedIndex(0);
            lecHours.setSelectedIndex(0);
            tutHours.setSelectedIndex(0);
            labHours.setSelectedIndex(0);
            evaHours.setSelectedIndex(0);
            
            subNameVal.setText("");
            subCodeVal.setText("");
            offYearVal.setText("");
            offSemVal.setText("");
            lecVal.setText("");
            tutVal.setText("");
            labVal.setText("");
            evaVal.setText("");
            
            } catch (SQLException ex) {
                Logger.getLogger(addSubjects.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
            
            
        
        
    }//GEN-LAST:event_saveActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
            subName.setText("");
            subCode.setText("");
            offYear.setSelectedIndex(0);
            offSem.setSelectedIndex(0);
            lecHours.setSelectedIndex(0);
            tutHours.setSelectedIndex(0);
            labHours.setSelectedIndex(0);
            evaHours.setSelectedIndex(0);
            
            subNameVal.setText("");
            subCodeVal.setText("");
            offYearVal.setText("");
            offSemVal.setText("");
            lecVal.setText("");
            tutVal.setText("");
            labVal.setText("");
            evaVal.setText("");
        
    }//GEN-LAST:event_clearActionPerformed

    private void manageSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageSubActionPerformed
        // TODO add your handling code here:
        
        ManageSubjects Msub = new ManageSubjects();
        Msub.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_manageSubActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPanel3MouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void subCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subCodeKeyReleased
        // TODO add your handling code here:
        String sCodePATTERN = "^[a-zA-Z]{2}[0-9]{4}$";
            Pattern sCodepatt = Pattern.compile(sCodePATTERN);
            Matcher sCodematch = sCodepatt.matcher(subCode.getText());
            if(sCodematch.matches()){
            subCodeVal.setText("");   
            }  
   
    }//GEN-LAST:event_subCodeKeyReleased

    private void subNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subNameKeyReleased
        // TODO add your handling code here:
        String sNamePATTERN = "[a-zA-Z]{2,5}$";
            Pattern sNamepatt = Pattern.compile(sNamePATTERN);
            Matcher sNamematch = sNamepatt.matcher(subName.getText());
            if(sNamematch.matches()){
           subNameVal.setText("");   
            }
      
    }//GEN-LAST:event_subNameKeyReleased

    private void offYearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_offYearMouseEntered
        // TODO add your handling code here:
        if(offYear.getSelectedIndex() != 0){
            offYearVal.setText("");
        }
    }//GEN-LAST:event_offYearMouseEntered

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        Home home = new Home();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeActionPerformed

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
            java.util.logging.Logger.getLogger(addSubjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addSubjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addSubjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addSubjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addSubjects().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton clear;
    private javax.swing.JComboBox<String> evaHours;
    private javax.swing.JLabel evaVal;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> labHours;
    private javax.swing.JLabel labVal;
    private javax.swing.JComboBox<String> lecHours;
    private javax.swing.JLabel lecVal;
    private javax.swing.JButton manageSub;
    private javax.swing.JComboBox<String> offSem;
    private javax.swing.JLabel offSemVal;
    private javax.swing.JComboBox<String> offYear;
    private javax.swing.JLabel offYearVal;
    private javax.swing.JButton save;
    private javax.swing.JTextField subCode;
    private javax.swing.JLabel subCodeVal;
    private javax.swing.JTextField subName;
    private javax.swing.JLabel subNameVal;
    private javax.swing.JComboBox<String> tutHours;
    private javax.swing.JLabel tutVal;
    // End of variables declaration//GEN-END:variables
}