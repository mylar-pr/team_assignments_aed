/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CivilianRole;

import Business.Civilian.Civilian;
import userinterface.DoctorRole.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.CivilianOrganization;
import Business.Organization.DoctorOrganization;
import Business.Organization.HospitalOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AssignWardWorkRequest;
import Business.WorkQueue.IsolationWorkRequest;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class CheckStatusJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private DoctorOrganization docOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    private Organization org;
    private Organization orgHospital;
    private String message;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public CheckStatusJPanel(JPanel userProcessContainer, UserAccount account, DoctorOrganization organization, Enterprise enterprise, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.docOrganization = (DoctorOrganization)organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.system = ecosystem;
//        valueLabel.setText(enterprise.getName());
        populateRequestTable();
        testResult();
        populateMessageLabel();
        
    }
    
    
    
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
//        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
////            System.out.println("printing from loop");
////            System.out.println(request.getClass());
//            for (WorkRequest r : userAccount.getWorkQueue().getWorkRequestList()) {
//            System.out.println("printing loop from check status");
//            System.out.println(r);}
//
//            if (request instanceof IsolationWorkRequest) {
//                Object[] row = new Object[4];
//                row[0] = "VocationalTraining";
//                row[1] = request.getReceiver();
//                row[2] = request.getStatus();
//
//                row[3] = request.getRequestDate();
//
//                model.addRow(row);
//            }
//
//    }
         org = null;

        for (Network network : system.getNetworkList()) {
            //Step 2.a: check against each enterprise
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                //                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);

                //Step 3:check against each organization for each enterprise
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof LabOrganization) {
                        org = organization;
                        break;
                    }

                }
            }
        }
        if (org != null) {
            for (WorkRequest request : org.getWorkQueue().getWorkRequestList()) {
            
            if (request instanceof LabTestWorkRequest) {
                
                if(((LabTestWorkRequest) request).getUsername().equalsIgnoreCase(userAccount.getUsername())){
                     
                    Object[] row = new Object[10];
                    row[0] = "Training";
                    row[1] = ((LabTestWorkRequest) request).getReceiver();
                    row[2] = ((LabTestWorkRequest) request).getStatus();

                    row[3] = ((LabTestWorkRequest) request).getRequestDate();
                    row[4] = ((LabTestWorkRequest) request).getTestUpdate();
                    row[7] = message;
                    model.addRow(row);
            }
        }
    }
  
            
        }
        
        
        orgHospital = null;

        for (Network network : system.getNetworkList()) {
            //Step 2.a: check against each enterprise
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                //                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);

                //Step 3:check against each organization for each enterprise
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (organization instanceof HospitalOrganization) {
                        orgHospital = organization;
                        break;
                    }

                }
            }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        requestTestJButton = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        messageLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        addDeliveryBackBtn = new javax.swing.JButton();

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Status", "Result", "Testing", "Test Result", "Ward", "Appointment"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        requestTestJButton.setText("View Details");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        messageLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N

        jButton1.setText("View Appointment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        addDeliveryBackBtn.setText("Back");
        addDeliveryBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDeliveryBackBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(requestTestJButton)
                .addGap(73, 73, 73)
                .addComponent(jButton1)
                .addGap(116, 116, 116))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(addDeliveryBackBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refreshTestJButton)
                .addGap(103, 103, 103))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshTestJButton)
                    .addComponent(addDeliveryBackBtn))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestTestJButton)
                    .addComponent(jButton1))
                .addGap(49, 49, 49)
                .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        userProcessContainer.add("RequestLabTestJPanel", new RequestLabTestJPanel(userProcessContainer, userAccount, enterprise));
//        layout.next(userProcessContainer);
        int selectedRow = workRequestJTable.getSelectedRow();
        int count = workRequestJTable.getSelectedRowCount();
        if(count == 1){
            if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Do you want to take the test?", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Please check back for result");
                for (WorkRequest request : org.getWorkQueue().getWorkRequestList()) {
            
            if (request instanceof LabTestWorkRequest) {
                
                if(((LabTestWorkRequest) request).getUsername().equalsIgnoreCase(userAccount.getUsername())){
   
                    ((LabTestWorkRequest) request).setTestRequest("Yes");
                    
            }
        }
    }
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Stay safe! Please self isolate yourself.");
            }
        } 
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
        
    }//GEN-LAST:event_requestTestJButtonActionPerformed
    
    public void testResult(){
        String result = "";
        for (WorkRequest request : org.getWorkQueue().getWorkRequestList()) {
            
            if (request instanceof LabTestWorkRequest) {
                
                if(((LabTestWorkRequest) request).getUsername().equalsIgnoreCase(userAccount.getUsername())){
   
                    result = ((LabTestWorkRequest) request).getTestResult();
            }
        }
    }
    
        if(result.equalsIgnoreCase("N")){
        
            JOptionPane.showMessageDialog(null, "You have been tested negative, Stay safe!");
            
        }
    }
    
    public void populateMessageLabel(){
    
         for (WorkRequest request : orgHospital.getWorkQueue().getWorkRequestList()) {
         
             if (request instanceof AssignWardWorkRequest) {
                    if(((AssignWardWorkRequest) request).getUsername().equalsIgnoreCase(userAccount.getUsername())){
                    
                        if(((AssignWardWorkRequest) request).getWardAssigned().equals("Yes")){
                            message = ("Important!! you have been assigned a " + ((AssignWardWorkRequest) request).getWardType());
                            populateRequestTable();
                          
                        }
                    }
                 
             
             }
         
         }
        
    }
    
    public void display(){
    
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to view details.", "Warning", JOptionPane.WARNING_MESSAGE);
        } else 
        {
            {
                String msg = String.valueOf(workRequestJTable.getModel().getValueAt(selectedRow, 7));
                messageLabel.setText(msg);
               
            }
        }
    
    }
    
    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();
        
    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        display();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addDeliveryBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDeliveryBackBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        //        StoreManagementJPanel manageMenuJPanel = (StoreManagementJPanel) component;
        //        manageMenuJPanel.populate();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_addDeliveryBackBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDeliveryBackBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
