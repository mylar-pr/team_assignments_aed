/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ContactTracingRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ContactTracingOrganization;
import Business.Organization.HospitalOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ContactTracingWorkRequest;
import Business.WorkQueue.MedicineWorkRequest;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import userinterface.PharmacistRole.ProcessWorkRequestJPanel;

/**
 *
 * @author nitya
 */
public class ContactTracingWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ContactTracingAdminWorkAreaJPanel
     */
    private JPanel userProcessContainer;
 private UserAccount userAccount;
 private EcoSystem system;
    private Enterprise enterprise;
   private ContactTracingOrganization contactTracingOrganization;
   
    public ContactTracingWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount,ContactTracingOrganization organization,Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.system = system;
        this.enterprise = enterprise;
        this.contactTracingOrganization = (ContactTracingOrganization)organization;
        populateTable();
    } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Assignbtn = new javax.swing.JButton();
        Refreshbtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Civilian_Details_Tbl = new javax.swing.JTable();

        Assignbtn.setText("Assign to me");
        Assignbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignbtnActionPerformed(evt);
            }
        });

        Refreshbtn.setText("Refresh");
        Refreshbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshbtnActionPerformed(evt);
            }
        });

        jButton1.setText("Process");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Civilian_Details_Tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient First Name", "Patient Last Name", "Address", "Age", "Gender", "Contact Number", "Message", "Sender", "Receiver", "Status", "Result"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(Civilian_Details_Tbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(Assignbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(215, 215, 215))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Refreshbtn)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Refreshbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Assignbtn)
                    .addComponent(jButton1))
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AssignbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignbtnActionPerformed
        // TODO add your handling code here:
         int selectedRow = Civilian_Details_Tbl.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        WorkRequest request = (WorkRequest)Civilian_Details_Tbl.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateTable();
        
    }//GEN-LAST:event_AssignbtnActionPerformed

    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)Civilian_Details_Tbl.getModel();
        
       model.setRowCount(0);
       
//        System.out.println(ContactTracingOrganization);
        for(WorkRequest request : contactTracingOrganization.getWorkQueue().getWorkRequestList())
                {
            Object[] row = new Object[10];
            row[0]=request;
            row[1] = request.getFirstName();
            row[2] = request.getLastName();
            row[3] = request.getAddress();
            row[4]=request.getAge();
            row[5] = request.getSex();
            row[6]=request.getContactNo();
            row[7]=request.getMessage();
            row[8] = request.getSender().getEmployee().getName();
            row[9]=request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[10]=request.getStatus();
            String result = ((MedicineWorkRequest) request).getTestResult(); 
            row[11] = result == null ? "Positive" : result;
            
         
            
            
            model.addRow(row);
        }
       
    }
    private void RefreshbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshbtnActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_RefreshbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          int selectedRow = Civilian_Details_Tbl.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        ContactTracingWorkRequest request = (ContactTracingWorkRequest)Civilian_Details_Tbl.getValueAt(selectedRow, 0);

        request.setStatus("Processing");

        ContactTracingWorkRequestJPanel contactTracingWorkRequestJPanel = new ContactTracingWorkRequestJPanel(userProcessContainer, request);
        userProcessContainer.add("ContactTracingWorkRequestJPanel", contactTracingWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Assignbtn;
    private javax.swing.JTable Civilian_Details_Tbl;
    private javax.swing.JButton Refreshbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}