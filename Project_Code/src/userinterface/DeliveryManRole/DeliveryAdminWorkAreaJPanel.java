/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;

import java.awt.CardLayout;
import Business.EcoSystem;
//import Business.Organization.DeliveryOrganization;
import Business.Organization.GroceriesOrganization;
import Business.Organization.Organization;
import Business.Organization.PharmacyOrganization;
import Business.Supplies.DeliveryManDirectory;
import Business.Supplies.GroceriesDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.GroceriesWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author prajw
 */
public class DeliveryAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDeliveryMenJPanel
     */
    
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
//    private DeliveryOrganization deliveryOrganization;
    private Organization org;
    private DeliveryManDirectory deliveryManDirectory;
    public DeliveryAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
//        this.deliveryOrganization = (DeliveryOrganization)organization;
        System.out.println("Debug inside storeManagement constructor.");
        System.out.println(organization);
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

        manageDeliveryMenBtn = new javax.swing.JButton();
        createDeliveryMenBtn1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageDeliveryMenBtn.setText("Manage Delivery Men");
        manageDeliveryMenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDeliveryMenBtnActionPerformed(evt);
            }
        });
        add(manageDeliveryMenBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 230, 60));

        createDeliveryMenBtn1.setText("Create Delivery Men");
        createDeliveryMenBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDeliveryMenBtn1ActionPerformed(evt);
            }
        });
        add(createDeliveryMenBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 230, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void manageDeliveryMenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDeliveryMenBtnActionPerformed
        // TODO add your handling code here:
        ManageDeliveryMenJPanel manageProductJPanel = new ManageDeliveryMenJPanel(userProcessContainer,userAccount, business,  deliveryManDirectory);
        userProcessContainer.add("ManageDeliveryMenJPanel", manageProductJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageDeliveryMenBtnActionPerformed

    private void createDeliveryMenBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDeliveryMenBtn1ActionPerformed
        // TODO add your handling code here:
        AddDeliveryMenJPanel addProductJPanel = new AddDeliveryMenJPanel(userProcessContainer,userAccount, business,  deliveryManDirectory);
        userProcessContainer.add("ManageDeliveryMenJPanel", addProductJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_createDeliveryMenBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createDeliveryMenBtn1;
    private javax.swing.JButton manageDeliveryMenBtn;
    // End of variables declaration//GEN-END:variables
}
