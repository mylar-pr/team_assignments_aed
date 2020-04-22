/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PharmacistRole;

import Business.EcoSystem;
import Business.Organization.GroceriesOrganization;
import Business.Organization.Organization;
import Business.Organization.PharmacyOrganization;
import Business.Supplies.MedicineDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author prajw
 */
public class PharmacistManagementJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PharmacistWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private PharmacyOrganization pharmaOrganization;
    private Organization org;
    private MedicineDirectory medicineDirectory;
    public PharmacistManagementJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
//        System.out.println("printing org");
//        System.out.println(organization);
        this.pharmaOrganization = (PharmacyOrganization)organization;
        System.out.println(this.pharmaOrganization);
        this.org = organization;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageOrdersBtn = new javax.swing.JButton();
        manageProductsBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageOrdersBtn.setBackground(new java.awt.Color(0, 0, 51));
        manageOrdersBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        manageOrdersBtn.setForeground(new java.awt.Color(255, 255, 255));
        manageOrdersBtn.setText("Manage Orders");
        manageOrdersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrdersBtnActionPerformed(evt);
            }
        });
        add(manageOrdersBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 140, 40));

        manageProductsBtn.setBackground(new java.awt.Color(0, 0, 51));
        manageProductsBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        manageProductsBtn.setForeground(new java.awt.Color(255, 255, 255));
        manageProductsBtn.setText("Manage Medicine");
        manageProductsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageProductsBtnActionPerformed(evt);
            }
        });
        add(manageProductsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 140, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void manageOrdersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrdersBtnActionPerformed
        // TODO add your handling code here:
        PharmacistWorkJPanel processWorkRequestJPanel = new PharmacistWorkJPanel( userProcessContainer,  userAccount,  org,  business);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_manageOrdersBtnActionPerformed

    private void manageProductsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageProductsBtnActionPerformed
        // TODO add your handling code here:
        AddMedicineJPanel addMedJPanel = new AddMedicineJPanel(userProcessContainer,userAccount, business,  medicineDirectory);
        userProcessContainer.add("addMedJPanel", addMedJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageProductsBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton manageOrdersBtn;
    private javax.swing.JButton manageProductsBtn;
    // End of variables declaration//GEN-END:variables
}