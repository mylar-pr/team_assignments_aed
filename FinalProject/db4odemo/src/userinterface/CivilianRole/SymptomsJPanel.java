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
import Business.Organization.CivilianOrganization;
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
    public SymptomsJPanel(JPanel userProcessContainer, UserAccount account, CivilianOrganization organization, Enterprise enterprise, EcoSystem ecosystem) {
        initComponents();
        this.system = ecosystem;
        this.account = account;

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

        BtnSubmit.setText("Request for Isolation Ward");
        BtnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSubmitActionPerformed(evt);
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
                        .addGap(203, 203, 203)
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
                .addComponent(BtnSubmit)
                .addContainerGap(74, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCommentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommentsActionPerformed

    private void BtnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSubmitActionPerformed
        // TODO add your handling code here:
        String symptom1 = checkBoxS1.getText();
        String symptom2 = checkBoxS2.getText();
        String symptom3 = checkBoxS3.getText();
        String symptom4 = checkBoxS4.getText();
        String symptom5 = checkBoxS5.getText();
        
        String comments = txtComments.getText();
        System.out.println("Printing from symptoms submit button");
        for (Civilian c : system.getCd().getCivilianList()) {
                if (c.getFirstName().equalsIgnoreCase(account.getEmployee().getName())) {
                    c.setSymptom1(symptom1);
                    c.setSymptom2(symptom2);
                    c.setSymptom3(symptom3);
                    c.setSymptom4(symptom4);
                    c.setSymptom5(symptom5);
                    c.setComment(comments);
                }
        }        
    }//GEN-LAST:event_BtnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSubmit;
    private javax.swing.JCheckBox checkBoxS1;
    private javax.swing.JCheckBox checkBoxS2;
    private javax.swing.JCheckBox checkBoxS3;
    private javax.swing.JCheckBox checkBoxS4;
    private javax.swing.JCheckBox checkBoxS5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtComments;
    // End of variables declaration//GEN-END:variables
}