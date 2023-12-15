/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author abhinavdholi
 */
public class LandingForm extends javax.swing.JFrame {

    Connection con;
    ResultSet rs;
    Statement stmt;
    String conUsername;
    String conPass;

    /**
     * Creates new form LandingForm
     */
    public LandingForm(String username, String password) {

        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        try
        {
        this.conUsername = username;
        this.conPass = password;
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel",conUsername,conPass);
        stmt = con.createStatement();
        }
        
        catch (Exception e)
        {
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

        jMenuItem4 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuMenu = new javax.swing.JMenu();
        mnuItemStaffLogin = new javax.swing.JMenuItem();
        mnuItemCustomerLogin = new javax.swing.JMenuItem();
        mnuExit = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        jLabel1.setText("Restaurant Management Application");

        mnuMenu.setText("Menu");

        mnuItemStaffLogin.setText("Staff Login");
        mnuItemStaffLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemStaffLoginActionPerformed(evt);
            }
        });
        mnuMenu.add(mnuItemStaffLogin);

        mnuItemCustomerLogin.setText("Customer Login");
        mnuItemCustomerLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemCustomerLoginActionPerformed(evt);
            }
        });
        mnuMenu.add(mnuItemCustomerLogin);

        mnuExit.setText("Exit Application");
        mnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExitActionPerformed(evt);
            }
        });
        mnuMenu.add(mnuExit);

        jMenuBar1.add(mnuMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel1)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1)
                .addContainerGap(573, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuItemStaffLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemStaffLoginActionPerformed
        // TODO add your handling code here:
        StaffSignUp staffForm = new StaffSignUp(this.conUsername, this.conPass);
        staffForm.setVisible(true);
    }//GEN-LAST:event_mnuItemStaffLoginActionPerformed

    private void mnuItemCustomerLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemCustomerLoginActionPerformed
        // TODO add your handling code here:
        CustomerSignUp custForm = new CustomerSignUp(this.conUsername, this.conPass);
        custForm.setVisible(true);
    }//GEN-LAST:event_mnuItemCustomerLoginActionPerformed

    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExitActionPerformed
        int i = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?");
        
        if (i==0)
        {
            System.exit(0);
            
        }
    }//GEN-LAST:event_mnuExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenuItem mnuItemCustomerLogin;
    private javax.swing.JMenuItem mnuItemStaffLogin;
    private javax.swing.JMenu mnuMenu;
    // End of variables declaration//GEN-END:variables
}
