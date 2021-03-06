/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Boundary;

import covidtrackingdemo.Controller.BusinessOwner.AcknowledgeController;
import covidtrackingdemo.Controller.BusinessOwner.ShowAlertController;
import covidtrackingdemo.Controller.BusinessOwner.ShowVisitorController;
import covidtrackingdemo.Controller.PublicUser.CheckInController;
import covidtrackingdemo.Controller.PublicUser.CheckVaccStatusController;
import covidtrackingdemo.Controller.PublicUser.ShowUserProfileController;
import covidtrackingdemo.Controller.PublicUser.ShowUserVisitedController;
import covidtrackingdemo.Entity.Alert;
import covidtrackingdemo.Entity.User;
import covidtrackingdemo.Entity.Visit;
import java.awt.Color;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author barry
 */
public class PublicUserPage extends javax.swing.JFrame {
    
    private String currentUser;
    
    public PublicUserPage() throws IOException {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        welcomeMsg = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        busOwnField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        dateField = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alertList = new javax.swing.JList<>();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        vaccinatedLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        privilege = new javax.swing.JTextField();
        firstName = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(127, 400));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(120, 120));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("PUBLIC USER");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel7.setPreferredSize(new java.awt.Dimension(127, 48));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        getContentPane().add(jPanel1, gridBagConstraints);

        welcomeMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeMsg.setText("Welcome, Test");
        welcomeMsg.setPreferredSize(new java.awt.Dimension(77, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 15, 0);
        getContentPane().add(welcomeMsg, gridBagConstraints);

        jTabbedPane1.setPreferredSize(new java.awt.Dimension(800, 400));

        jPanel2.setPreferredSize(new java.awt.Dimension(483, 400));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jPanel4.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Business Owner");
        jLabel1.setPreferredSize(new java.awt.Dimension(90, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 15);
        jPanel4.add(jLabel1, gridBagConstraints);

        jLabel2.setText("Date");
        jLabel2.setPreferredSize(new java.awt.Dimension(90, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 15);
        jPanel4.add(jLabel2, gridBagConstraints);

        busOwnField.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        jPanel4.add(busOwnField, gridBagConstraints);

        jButton1.setText("CHECK-IN");
        jButton1.setPreferredSize(new java.awt.Dimension(100, 23));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkIn(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel4.add(jButton1, gridBagConstraints);

        dateField.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateField.setText("jLabel5");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel4.add(dateField, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        jPanel2.add(jPanel4, gridBagConstraints);

        jScrollPane1.setViewportView(alertList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel2.add(jScrollPane1, gridBagConstraints);

        jButton3.setText("ACKNOWLEDGE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acknowledge(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel2.add(jButton3, gridBagConstraints);

        jTabbedPane1.addTab("MAIN", jPanel2);

        jPanel3.setPreferredSize(new java.awt.Dimension(700, 400));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel5.setPreferredSize(new java.awt.Dimension(300, 300));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        vaccinatedLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vaccinatedLabel.setText("YOU ARE VACCINATED");
        vaccinatedLabel.setFocusable(false);
        vaccinatedLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 15, 0);
        jPanel5.add(vaccinatedLabel, gridBagConstraints);

        jLabel4.setText("Username");
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 15);
        jPanel5.add(jLabel4, gridBagConstraints);

        jLabel6.setText("Password");
        jLabel6.setPreferredSize(new java.awt.Dimension(100, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 15);
        jPanel5.add(jLabel6, gridBagConstraints);

        jLabel8.setText("Privilege");
        jLabel8.setPreferredSize(new java.awt.Dimension(100, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 15);
        jPanel5.add(jLabel8, gridBagConstraints);

        jLabel9.setText("First Name");
        jLabel9.setPreferredSize(new java.awt.Dimension(100, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 15);
        jPanel5.add(jLabel9, gridBagConstraints);

        jLabel10.setText("Last Name");
        jLabel10.setPreferredSize(new java.awt.Dimension(100, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 15);
        jPanel5.add(jLabel10, gridBagConstraints);

        username.setEditable(false);
        username.setText("jTextField2");
        username.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 49);
        jPanel5.add(username, gridBagConstraints);

        password.setEditable(false);
        password.setText("jTextField3");
        password.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 49);
        jPanel5.add(password, gridBagConstraints);

        privilege.setEditable(false);
        privilege.setText("jTextField4");
        privilege.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 49);
        jPanel5.add(privilege, gridBagConstraints);

        firstName.setEditable(false);
        firstName.setText("jTextField5");
        firstName.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 49);
        jPanel5.add(firstName, gridBagConstraints);

        lastName.setEditable(false);
        lastName.setText("jTextField6");
        lastName.setPreferredSize(new java.awt.Dimension(100, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 49);
        jPanel5.add(lastName, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel3.add(jPanel5, gridBagConstraints);

        jPanel6.setPreferredSize(new java.awt.Dimension(400, 200));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        jLabel11.setText("Date");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 15);
        jPanel6.add(jLabel11, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        jPanel6.add(jDateChooser2, gridBagConstraints);

        jScrollPane2.setPreferredSize(new java.awt.Dimension(300, 100));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Business Owner", "Visited Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel6.add(jScrollPane2, gridBagConstraints);

        jButton2.setText("SHOW");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showVisited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 0);
        jPanel6.add(jButton2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel3.add(jPanel6, gridBagConstraints);

        logoutBtn.setText("LOGOUT");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel3.add(logoutBtn, gridBagConstraints);

        jTabbedPane1.addTab("USER", jPanel3);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jTabbedPane1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logout(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout
        // TODO add your handling code here:
        
        dispose();
        
        LoginPage lp = new LoginPage();
        lp.setVisible(true);
    }//GEN-LAST:event_logout

    private void showVisited(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showVisited
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        ShowUserVisitedController uvc = new ShowUserVisitedController();
        
        ArrayList<Visit> visitedList;
                
        try {
            
            visitedList = uvc.getVisited(jDateChooser2.getDate(), currentUser);
            
            Object rowData[] = new Object[2];
        
            for (Visit visited : visitedList) {

                rowData[0] = visited.getBusinessOwner();
                rowData[1] = visited.getVisitedDate();

                model.addRow(rowData);
            }
        
        } catch (IOException ex) {
            Logger.getLogger(PublicUserPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(PublicUserPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_showVisited

    private void acknowledge(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acknowledge
        // TODO add your handling code here:
        ArrayList<String> selectedList = new ArrayList<>();
        
        int[] selectedIx = alertList.getSelectedIndices();
        
        for (int i = 0; i < selectedIx.length; i++) {
            
            String selected = alertList.getModel().getElementAt(selectedIx[i]);
            
            selectedList.add(currentUser + " " + selected);
        }
        
        AcknowledgeController ac = new AcknowledgeController();
            
        try {
            ac.acknowledge(selectedList);
            
            JOptionPane.showMessageDialog(this, "Alert acknowledged");
            
            showAlert();
            
        } catch (IOException ex) {
            Logger.getLogger(BusinessOwnerPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_acknowledge

    private void checkIn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkIn
        // TODO add your handling code here:
                
        CheckInController cic = new CheckInController();
        
        try {
            cic.checkIn(busOwnField.getText(), currentUser, dateField.getText());
            
            JOptionPane.showMessageDialog(this, "Checked into " + busOwnField.getText());
            
        } catch (IOException ex) {
            Logger.getLogger(PublicUserPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_checkIn
        
    public void setUsername(String username) throws IOException {
    
        welcomeMsg.setText("Welcome, " + username);
        
        this.currentUser = username;
        
        // Tab 1
        // populate today's date
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
        String date = dateFormat.format(new Date());  
        dateField.setText(date);
        
        // populate alerts
        showAlert();
        
        // Tab 2
        // populate "YOU ARE VACCINATED" label
        checkVaccStatus();
        
        // populate user profile
        showUserProfile();
        // populate today's date
        jDateChooser2.setDate(new Date());
    }
    
    private void showAlert() throws IOException {
    
        DefaultListModel<String> model = new DefaultListModel<>(); 
         
        ShowAlertController sac = new ShowAlertController();
        ArrayList<Alert> alist = sac.showAlert(currentUser);
         
        for (Alert a : alist) {
            
            model.addElement(a.getAlertType() + " alert sent on " + a.getAlertDate());
        }
         
        alertList.setModel(model);
    }
    
    private void checkVaccStatus() throws IOException {
    
        CheckVaccStatusController vsc = new CheckVaccStatusController();
        
        Boolean response = vsc.checkVaccStatus(currentUser);
        
        if (response) {
            
            vaccinatedLabel.setForeground(Color.BLACK);
            vaccinatedLabel.setBackground(Color.GREEN);
            vaccinatedLabel.setOpaque(true);
        } 
        else {
            
            vaccinatedLabel.setForeground(Color.WHITE);
            vaccinatedLabel.setBackground(Color.RED);
            vaccinatedLabel.setOpaque(true);
        }
    }
    
    private void showUserProfile() throws IOException {
    
        ShowUserProfileController upc = new ShowUserProfileController();
        
        User user = upc.getUserProfile(welcomeMsg.getText().split(" ")[1]);
        
        username.setText(user.getUsername());
        password.setText(user.getPassword());
        privilege.setText(user.getPrivilege());
        firstName.setText(user.getFirstName());
        lastName.setText(user.getLastName());
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
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PublicUserPage().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(PublicUserPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> alertList;
    private javax.swing.JTextField busOwnField;
    private javax.swing.JLabel dateField;
    private javax.swing.JTextField firstName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lastName;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JTextField password;
    private javax.swing.JTextField privilege;
    private javax.swing.JTextField username;
    private javax.swing.JLabel vaccinatedLabel;
    private javax.swing.JLabel welcomeMsg;
    // End of variables declaration//GEN-END:variables
}
