/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HospitalAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.HospitalOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AssignWardWorkRequest;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.MedicineWorkRequest;
//import Business.WorkQueue.LabTestWorkRequest; ADD PHARMACY WORK REQUEST
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author paipr
 */


public class HospitalAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalAdminWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private HospitalOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    private AssignWardWorkRequest request;
    
    
    public HospitalAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, HospitalOrganization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.system = system;
        this.request = request;
        valueLabel.setText(enterprise.getName());
    }
    
 
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        BtnAssignIsolation = new javax.swing.JButton();
        RequestMedicineBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        valueLabel.setText("<value>");

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Enterprise :");

        BtnAssignIsolation.setBackground(new java.awt.Color(0, 0, 51));
        BtnAssignIsolation.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        BtnAssignIsolation.setForeground(new java.awt.Color(255, 255, 255));
        BtnAssignIsolation.setText("Assign Isolation Ward");
        BtnAssignIsolation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAssignIsolationActionPerformed(evt);
            }
        });

        RequestMedicineBtn.setBackground(new java.awt.Color(0, 0, 51));
        RequestMedicineBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        RequestMedicineBtn.setForeground(new java.awt.Color(255, 255, 255));
        RequestMedicineBtn.setText("Request Medicines Stock");
        RequestMedicineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestMedicineBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RequestMedicineBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnAssignIsolation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(346, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(BtnAssignIsolation, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(RequestMedicineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(405, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAssignIsolationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAssignIsolationActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("AssignWardJPanel", new AssignWardJPanel(userProcessContainer, userAccount, enterprise, system, organization));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_BtnAssignIsolationActionPerformed

    private void RequestMedicineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestMedicineBtnActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestTestWorkAreaJPanel", new RequestTestWorkAreaJPanel(userProcessContainer, userAccount,organization, enterprise, system ));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_RequestMedicineBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAssignIsolation;
    private javax.swing.JButton RequestMedicineBtn;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
