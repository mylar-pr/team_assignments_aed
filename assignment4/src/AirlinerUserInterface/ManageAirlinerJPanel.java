/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AirlinerUserInterface;


import Business.Airliner;
import Business.AirlinerDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author prajw
 */
public class ManageAirlinerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAirlinerJPanel
     */
    JPanel rightPanel;
    AirlinerDirectory airliner_dir;
    Airliner airliner;
    
    public ManageAirlinerJPanel(JPanel rightPanel, AirlinerDirectory airliner_dir) {
        initComponents();
        this.rightPanel = rightPanel;
        this.airliner_dir = airliner_dir;
        
        populateAirlinerDetails();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        airlinerTbl = new javax.swing.JTable();
        addAirlinerManageTF = new javax.swing.JButton();
        deleteAirlinerBtn = new javax.swing.JButton();
        viewAirlinerBtn = new javax.swing.JButton();
        manageFlightsBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Manage Airliners");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 170, 20));

        airlinerTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airliner Name", "Airliner ID", "Alliance Name", "Customer Care Number"
            }
        ));
        jScrollPane1.setViewportView(airlinerTbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 70, 500, 150));

        addAirlinerManageTF.setText("Add Airliner");
        addAirlinerManageTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAirlinerManageTFActionPerformed(evt);
            }
        });
        add(addAirlinerManageTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 100, -1));

        deleteAirlinerBtn.setText("Delete Airliner");
        deleteAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAirlinerBtnActionPerformed(evt);
            }
        });
        add(deleteAirlinerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 100, -1));

        viewAirlinerBtn.setText("View Airliner");
        viewAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAirlinerBtnActionPerformed(evt);
            }
        });
        add(viewAirlinerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        manageFlightsBtn.setText("Manage Flights");
        manageFlightsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageFlightsBtnActionPerformed(evt);
            }
        });
        add(manageFlightsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, 40));
    }// </editor-fold>//GEN-END:initComponents

    
    private void deleteAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAirlinerBtnActionPerformed
        // TODO add your handling code here:
//        int row = airlinerTbl.getSelectedRow();
//        
//        if(row<0){
//            JOptionPane.showMessageDialog(null, "Please select an airliner", "Warning", JOptionPane.WARNING_MESSAGE);
//            return;
//        }
//        
//        Airliner s = (Airliner)airlinerTbl.getValueAt(row, 0);
//        airliner_dir.deleteAirliner(s);
//        populateAirlinerDetails();
        
        int row = airlinerTbl.getSelectedRow();

        if (row < 0) {
            JOptionPane.showMessageDialog(null, "Please select an airliner", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }else{
        Airliner s = (Airliner) airlinerTbl.getValueAt(row, 0);
        airliner_dir.deleteAirliner(s);
        populateAirlinerDetails();
        }
        
    }//GEN-LAST:event_deleteAirlinerBtnActionPerformed

    private void addAirlinerManageTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAirlinerManageTFActionPerformed
        // TODO add your handling code here:
        
        CreateAirliner createAirPanel = new CreateAirliner(rightPanel, airliner_dir);
        rightPanel.add("CreateAirlinerManagePanel", createAirPanel);
        CardLayout cardLayout = (CardLayout) rightPanel.getLayout();
        cardLayout.next(rightPanel);
        
    }//GEN-LAST:event_addAirlinerManageTFActionPerformed
    
    public void populateAirlinerDetails(){
        int rowCount = airlinerTbl.getRowCount();
        DefaultTableModel model = (DefaultTableModel) airlinerTbl.getModel();
        
        for(int i = rowCount-1; i>=0; i--){
            
//            System.out.println("Row count -->"+Integer.toString(rowCount));
            model.removeRow(i);
        }
        
        for(Airliner s: airliner_dir.getAirlinerDir()){
            Object row[] = new Object[4];
            row[0] = s;
            row[1] = s.getAirlinerID();
            row[2] = s.getAllianceName();
            row[3] = s.getCustomerCareNumber();
            
            model.addRow(row); 
            
        }
    }
    
    
    
    private void viewAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAirlinerBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = airlinerTbl.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select the airliner you want to view the details of");
        }else{
            Airliner a = (Airliner)airlinerTbl.getValueAt(selectedRow, 0);
            ViewAirlinerPanel panel = new ViewAirlinerPanel(rightPanel, a);
            rightPanel.add("ViewAirlinerPanel",panel);
            CardLayout layout = (CardLayout)rightPanel.getLayout();
            layout.next(rightPanel);
        }
        
    }//GEN-LAST:event_viewAirlinerBtnActionPerformed

    private void manageFlightsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageFlightsBtnActionPerformed
        // TODO add your handling code here:
        int selectedrow = airlinerTbl.getSelectedRow();
        if(selectedrow<0){
            JOptionPane.showMessageDialog(null,"Please set the airliner you want to manage.","WARNING",JOptionPane.WARNING_MESSAGE);
        }else{
            Airliner airliner = (Airliner) airlinerTbl.getValueAt(selectedrow, 0);
            FleetManagePanel fleetPanel  = new FleetManagePanel(rightPanel, airliner);
            rightPanel.add("FlightManagePanel",fleetPanel);
            CardLayout fleetLayout = (CardLayout)rightPanel.getLayout();
            fleetLayout.next(rightPanel);
            
            
            
        }
    }//GEN-LAST:event_manageFlightsBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAirlinerManageTF;
    private javax.swing.JTable airlinerTbl;
    private javax.swing.JButton deleteAirlinerBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton manageFlightsBtn;
    private javax.swing.JButton viewAirlinerBtn;
    // End of variables declaration//GEN-END:variables
}
