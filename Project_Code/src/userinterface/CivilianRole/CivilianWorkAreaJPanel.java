/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CivilianRole;

import Business.Civilian.CivilianDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.GroceriesOrganization;
//import Business.Organization.Organization;
import Business.Organization.PharmacyOrganization;
import Business.Supplies.GroceriesDirectory;
import Business.Supplies.MedicineDirectory;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author paipr
 */
public class CivilianWorkAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount account;
    private DoctorOrganization docOrganization;
    private Enterprise enterprise;
    private CivilianDirectory cd;
    private EcoSystem system;
    private GroceriesOrganization gO;
    private PharmacyOrganization pO;
    private GroceriesDirectory groceriesDirectory;
    private MedicineDirectory medicineDirectory;
    /**
     * Creates new form CivilianWorkAreaJPanel
     */
//    public CivilianWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise) {
//        this.userProcessContainer = userProcessContainer;
//        this.account = account;
//        this.organization = organization;
//        this.enterprise = enterprise;
//        initComponents();
//    }
    
     public CivilianWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem system) {

        this.userProcessContainer = userProcessContainer;
        this.cd = cd;
        this.account = userAccount;
        this.system = system;
        this.docOrganization = (DoctorOrganization)organization;
        
        initComponents();
//        system = dB4OUtil.retrieveSystem();
//        populateRequestTable();
//        populateTable();

    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buyMedicineBtn = new javax.swing.JButton();
        buyGroceriesBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BtnCheckStatus = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        buyMedicineBtn.setText("Buy Medicine ");
        buyMedicineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyMedicineBtnActionPerformed(evt);
            }
        });

        buyGroceriesBtn.setText("Buy Groceries");
        buyGroceriesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyGroceriesBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("GET SUPPLIES:");

        BtnCheckStatus.setText("Check Status");
        BtnCheckStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCheckStatusActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("CHECK STATUS:");

        jButton1.setText("Showing Symptoms?");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("GET MEDICAL HELP:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnCheckStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buyMedicineBtn)
                            .addComponent(buyGroceriesBtn))))
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(58, 58, 58)
                        .addComponent(buyGroceriesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(58, 58, 58)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addComponent(buyMedicineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addGap(59, 59, 59)
                .addComponent(BtnCheckStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buyMedicineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyMedicineBtnActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("GroceryShoppingJPanel", new MedicineShoppingJPanel(userProcessContainer,account, enterprise, system,  pO));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_buyMedicineBtnActionPerformed

    private void buyGroceriesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyGroceriesBtnActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("GroceryShoppingJPanel", new GroceryShoppingJPanel(userProcessContainer,account, enterprise, system,  gO));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_buyGroceriesBtnActionPerformed

    private void BtnCheckStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCheckStatusActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("CheckStatusJPanel", new CheckStatusJPanel(userProcessContainer, account, docOrganization, enterprise, system));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_BtnCheckStatusActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("SymptomsJPanel", new SymptomsJPanel(userProcessContainer, account, docOrganization, enterprise, system));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCheckStatus;
    private javax.swing.JButton buyGroceriesBtn;
    private javax.swing.JButton buyMedicineBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
