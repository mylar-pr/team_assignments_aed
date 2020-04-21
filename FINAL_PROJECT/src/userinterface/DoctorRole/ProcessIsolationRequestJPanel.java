/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.Civilian.CivilianDirectory;
import Business.EcoSystem;
import Business.Civilian.Civilian;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author paipr
 */
public class ProcessIsolationRequestJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private IsolationWorkRequest request;
    private EcoSystem system;
    private UserAccount account;
    private String username;
    /**
     * Creates new form ProcessIsolationRequestJPanel
     */
    public ProcessIsolationRequestJPanel(JPanel userProcessContainer, UserAccount account,IsolationWorkRequest request, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.system = ecosystem;
        this.account = account;
//        CivilianDirectory cd = system.getCd();
        String civilianName = "";
        String civilianAge = "";
        String civilianSex = "";
        for (Civilian c : system.getCd().getCivilianList()) {
            if (c.getUsername().equals(request.getSender().getUsername())) {
                civilianName = c.getFirstName()+ " "+ c.getLastName();
                civilianAge = c.getAge();
                civilianSex = c.getSex();
                
                break;

            }
        }
        
        String symptom1 = ((IsolationWorkRequest)request).getSymptom1();
        String symptom2 = ((IsolationWorkRequest)request).getSymptom2();
        String symptom3 = ((IsolationWorkRequest)request).getSymptom3();
        String symptom4 = ((IsolationWorkRequest)request).getSymptom4();
        String symptom5 = ((IsolationWorkRequest)request).getSymptom5();
        String comments = ((IsolationWorkRequest)request).getComment();
        String symptoms = ((IsolationWorkRequest)request).getSymptoms();
        
        
        lblSymptoms.setText(symptoms.substring(0,symptoms.length() - 1) + ".");
        lblName.setText(civilianName);
        lblAge.setText(civilianAge);
        lblComments.setText(comments);
        lblSex.setText(civilianSex);
        
        this.username = ((IsolationWorkRequest)request).getUsername();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea_Comments = new javax.swing.JTextArea();
        lbl = new javax.swing.JLabel();
        txtArea_analysis = new javax.swing.JTextField();
        BtnHospital = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblSex = new javax.swing.JLabel();
        lblSymptoms = new javax.swing.JLabel();
        lblComments = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Process Isolation Request:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 64, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Patient Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 123, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Symptoms:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 225, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Comments:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 259, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Age:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 157, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Sex:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 191, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 332, -1, 35));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Doctor Analysis:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 64, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("Comments:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 183, -1, -1));

        txtArea_Comments.setColumns(20);
        txtArea_Comments.setRows(5);
        jScrollPane1.setViewportView(txtArea_Comments);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 173, 225, 133));

        lbl.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbl.setText("Analysis:");
        add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 123, -1, -1));
        add(txtArea_analysis, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 123, 225, -1));

        BtnHospital.setBackground(new java.awt.Color(0, 0, 51));
        BtnHospital.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        BtnHospital.setForeground(new java.awt.Color(255, 255, 255));
        BtnHospital.setText("Redirect to Lab");
        BtnHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHospitalActionPerformed(evt);
            }
        });
        add(BtnHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 332, -1, 35));

        lblName.setText("jLabel9");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 123, -1, -1));

        lblAge.setText("jLabel10");
        add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 157, -1, -1));

        lblSex.setText("jLabel11");
        add(lblSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 191, -1, -1));

        lblSymptoms.setText("jLabel12");
        add(lblSymptoms, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 225, -1, -1));

        lblComments.setText("jLabel13");
        add(lblComments, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 259, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BtnHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHospitalActionPerformed
        // TODO add your handling code here:
        
        String civilianName = "";
        String civilianAge = "";
        String civilianSex = "";
        
        for (Civilian c : system.getCd().getCivilianList()) {
            System.out.println("printing username");
            if (c.getUsername().equals(request.getSender().getUsername())) {
                civilianName = c.getFirstName()+ " "+ c.getLastName();
                civilianAge = c.getAge();
                civilianSex = c.getSex();
                
                break;

            }
        }
        
        LabTestWorkRequest request = new LabTestWorkRequest();
        
        request.setAnalysis(txtArea_analysis.getText());
        if(txtArea_analysis.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Doctor Analysis can't be empty");
             return;
         }
        request.setStatus("Sent");
//        request.setMessage(lblMainConcern.getText());
        request.setSender(account);
        request.setName(civilianName);
        request.setTestRequested("No");
        ///////////////////////////////////////////////
        request.setComments(txtArea_Comments.getText());
        if(txtArea_Comments.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Doctor Comments can't be empty");
             return;
         }
        
        request.setUsername(username);
         Organization org = null;

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
            org.getWorkQueue().getWorkRequestList().add(request);
            account.getWorkQueue().getWorkRequestList().add(request);
            System.out.println("Added labtest Request to UserAccount ");
            JOptionPane.showMessageDialog(null,"Redirected succcessfully!");
            
        }
            txtArea_analysis.setText("");
            txtArea_Comments.setText("");
    }//GEN-LAST:event_BtnHospitalActionPerformed

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
    private javax.swing.JButton BtnHospital;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblComments;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSex;
    private javax.swing.JLabel lblSymptoms;
    private javax.swing.JTextArea txtArea_Comments;
    private javax.swing.JTextField txtArea_analysis;
    // End of variables declaration//GEN-END:variables
}
