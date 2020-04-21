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
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        buyMedicineBtn.setBackground(new java.awt.Color(0, 0, 51));
        buyMedicineBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        buyMedicineBtn.setForeground(new java.awt.Color(255, 255, 255));
        buyMedicineBtn.setText("Buy Medicine ");
        buyMedicineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyMedicineBtnActionPerformed(evt);
            }
        });

        buyGroceriesBtn.setBackground(new java.awt.Color(0, 0, 51));
        buyGroceriesBtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        buyGroceriesBtn.setForeground(new java.awt.Color(255, 255, 255));
        buyGroceriesBtn.setText("Buy Groceries");
        buyGroceriesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyGroceriesBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("ORDER SUPPLIES:");

        BtnCheckStatus.setBackground(new java.awt.Color(0, 0, 51));
        BtnCheckStatus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnCheckStatus.setForeground(new java.awt.Color(255, 255, 255));
        BtnCheckStatus.setText("Check Status");
        BtnCheckStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCheckStatusActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("CHECK STATUS:");

        jButton1.setBackground(new java.awt.Color(0, 0, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Showing Symptoms?");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("GET MEDICAL HELP:");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/sixfeetapart.gif"))); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(282, 282, 282)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(286, 286, 286)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buyMedicineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buyGroceriesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(BtnCheckStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(254, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel5)
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(41, 41, 41)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buyGroceriesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)))
                .addComponent(buyMedicineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addComponent(BtnCheckStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
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
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
