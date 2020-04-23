/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CivilianRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Civilian.Civilian;
import Business.Network.Network;
import Business.Organization.CivilianOrganization;
import Business.Organization.DoctorOrganization;
import Business.WorkQueue.IsolationWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author paipr
 */
public class SymptomsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SymptomsJPanel
     */
    private EcoSystem system;
    private UserAccount account;
    private JPanel userProcessContainer;
    public SymptomsJPanel(JPanel userProcessContainer, UserAccount account, DoctorOrganization organization, Enterprise enterprise, EcoSystem ecosystem) {
        initComponents();
        this.system = ecosystem;
        this.account = account;
        this.userProcessContainer = userProcessContainer;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkBoxS1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        checkBoxS3 = new javax.swing.JCheckBox();
        checkBoxS2 = new javax.swing.JCheckBox();
        checkBoxS4 = new javax.swing.JCheckBox();
        checkBoxS5 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        txtComments = new javax.swing.JTextField();
        BtnSubmit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        checkBoxS1.setText("Fever");

        jLabel1.setText("Include one or more symptoms:");

        checkBoxS3.setText("Shortess of Breath");

        checkBoxS2.setText("Dry Cough");

        checkBoxS4.setText("Throat Pain");

        checkBoxS5.setText("Chills");

        jLabel2.setText("Comments:");

        txtComments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommentsActionPerformed(evt);
            }
        });

        BtnSubmit.setText("Report Symptoms");
        BtnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSubmitActionPerformed(evt);
            }
        });

        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtComments, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(checkBoxS5)
                            .addComponent(checkBoxS4)
                            .addComponent(checkBoxS2)
                            .addComponent(checkBoxS3)
                            .addComponent(jLabel1)
                            .addComponent(checkBoxS1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton1)
                        .addGap(98, 98, 98)
                        .addComponent(BtnSubmit)))
                .addContainerGap(435, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(checkBoxS1)
                .addGap(18, 18, 18)
                .addComponent(checkBoxS2)
                .addGap(18, 18, 18)
                .addComponent(checkBoxS3)
                .addGap(18, 18, 18)
                .addComponent(checkBoxS4)
                .addGap(18, 18, 18)
                .addComponent(checkBoxS5)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtComments, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSubmit)
                    .addComponent(jButton1))
                .addContainerGap(74, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCommentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommentsActionPerformed

    private void BtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSubmitActionPerformed
        // TODO add your handling code here:
        String symptom1;
        String symptom2;
        String symptom3;
        String symptom4;
        String symptom5;
        String symptoms = "";
        
        if(checkBoxS1.isSelected()) {symptom1 = checkBoxS1.getText(); symptoms = symptoms + symptom1 + ",";} else {symptom1 = null;};
        if(checkBoxS2.isSelected()) {symptom2 = checkBoxS2.getText(); symptoms = symptoms + symptom2 + ",";} else {symptom2 = null;};
        if(checkBoxS3.isSelected()) {symptom3 = checkBoxS3.getText(); symptoms = symptoms + symptom3 + ",";} else {symptom3 = null;};
        if(checkBoxS4.isSelected()) {symptom4 = checkBoxS4.getText(); symptoms = symptoms + symptom4 + ",";} else {symptom4 = null;};
        if(checkBoxS5.isSelected()) {symptom5 = checkBoxS5.getText(); symptoms = symptoms + symptom5 + ",";} else {symptom5 = null;};
        
        
        
        String comments = txtComments.getText();
//        for (Civilian c : system.getCd().getCivilianList()) {
//                if (c.getFirstName().equalsIgnoreCase(account.getEmployee().getName())) {
//                    c.setSymptom1(symptom1);
//                    c.setSymptom2(symptom2);
//                    c.setSymptom3(symptom3);
//                    c.setSymptom4(symptom4);
//                    c.setSymptom5(symptom5);
//                    c.setComment(comments);
//                }
//        }   
        IsolationWorkRequest request = new IsolationWorkRequest();
//        request.setMessage(concern);
        request.setSender(account);
        request.setStatus("Sent");
        
        request.setSymptom1(symptom1);
        request.setSymptom2(symptom2);
        request.setSymptom3(symptom3);
        request.setSymptom4(symptom4);
        request.setSymptom5(symptom5);
        request.setSymptoms(symptoms);
        request.setComment(comments);
        request.setUsername(account.getUsername());
        Organization org = null;

        for (Network network : system.getNetworkList()) {
            //Step 2.a: check against each enterprise
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                //                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);

                //Step 3:check against each organization for each enterprise
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof DoctorOrganization) {
                        org = organization;
                        break;
                    }

                }
            }
        }
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(request);
            System.out.println("Added Reqyesr to Org ");
            account.getWorkQueue().getWorkRequestList().add(request);
            System.out.println("Added Request to UserAccount ");
            JOptionPane.showMessageDialog(null, "Registered Successfully!");
            
            
            
        }
    }//GEN-LAST:event_BtnSubmitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        //        StoreManagementJPanel manageMenuJPanel = (StoreManagementJPanel) component;
        //        manageMenuJPanel.populate();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSubmit;
    private javax.swing.JCheckBox checkBoxS1;
    private javax.swing.JCheckBox checkBoxS2;
    private javax.swing.JCheckBox checkBoxS3;
    private javax.swing.JCheckBox checkBoxS4;
    private javax.swing.JCheckBox checkBoxS5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtComments;
    // End of variables declaration//GEN-END:variables
}