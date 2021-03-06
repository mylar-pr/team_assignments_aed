/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AirlinerUserInterface;

import Business.Airliner;
import Business.AirlinerDirectory;
import Business.FlightDirectory;
import Business.Flights;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author prajw
 */


public class FleetManagePanel extends javax.swing.JPanel {

    /**
     * Creates new form FleetManagePanel
     */
    JPanel rightPanel;
    Airliner airliner ;
    
    AirlinerDirectory airlineDirectory;
    FlightDirectory flightDirectory; 
    
    
    public FleetManagePanel(JPanel rightPanel, Airliner airliner) {
        initComponents();
        this.rightPanel = rightPanel;
        this.airliner = airliner;
        
        populateFleetTable();
              
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
        fleetManageTbl = new javax.swing.JTable();
        addFlightBtn = new javax.swing.JButton();
        removeFlightBtn = new javax.swing.JButton();
        viewFlightBtn = new javax.swing.JButton();

        fleetManageTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight ID", "Flight Name", "Source", "Destination", "Flight Duration", "Departure"
            }
        ));
        jScrollPane1.setViewportView(fleetManageTbl);

        addFlightBtn.setText("Add Flght");
        addFlightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFlightBtnActionPerformed(evt);
            }
        });

        removeFlightBtn.setText("Remove Flight");
        removeFlightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFlightBtnActionPerformed(evt);
            }
        });

        viewFlightBtn.setText("View Flight");
        viewFlightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewFlightBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(addFlightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(removeFlightBtn)
                        .addGap(90, 90, 90)
                        .addComponent(viewFlightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addFlightBtn)
                    .addComponent(removeFlightBtn)
                    .addComponent(viewFlightBtn))
                .addContainerGap(151, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void populateFleetTable(){
        int rowCount = fleetManageTbl.getRowCount();
        DefaultTableModel table = (DefaultTableModel) fleetManageTbl.getModel();
        for(int i = rowCount-1; i>=0; i--){
            table.removeRow(i);
        }
        for(Flights f : airliner.getFlights_dir().getFlightDirectory()){
            Object row[] = new Object[6];
            row[0] = f;
            row[1] = f.getFlightId();
            row[2] = f.getSource();
            row[3] = f.getDestination();
            row[4] = f.getFlightDuration();
            row[5] = f.getDepartureTime();
             
            table.addRow(row);
        }
    
    }
    
    private void removeFlightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFlightBtnActionPerformed
        // TODO add your handling code here:
        int row = fleetManageTbl.getSelectedRow();
        
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please a flight you want to remove.","WARNING",JOptionPane.WARNING_MESSAGE);
            return;
        }else{
            Flights flight = (Flights)fleetManageTbl.getValueAt(row, 0);
            airliner.getFlights_dir().deleteFlight(flight);
            populateFleetTable();
            
        }
        
        
    }//GEN-LAST:event_removeFlightBtnActionPerformed

    private void addFlightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFlightBtnActionPerformed
        // TODO add your handling code here:
        AddFlight addFlightPanel = new AddFlight(rightPanel, airliner);
        rightPanel.add(addFlightPanel);
        CardLayout addFlightLayout = (CardLayout)rightPanel.getLayout();
        addFlightLayout.next(rightPanel);
        
        
    }//GEN-LAST:event_addFlightBtnActionPerformed

    private void viewFlightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewFlightBtnActionPerformed
        // TODO add your handling code here:
        int selected_row = fleetManageTbl.getSelectedRow();
        if(selected_row < 0){
            JOptionPane.showMessageDialog(null, "Please select the flight you want to view", "WARNING", JOptionPane.WARNING_MESSAGE);
            return;
        }else{
            Flights f = (Flights) fleetManageTbl.getValueAt(selected_row, 0);
            ViewFlightPanel panel = new ViewFlightPanel(rightPanel,f);
            rightPanel.add("ViewFlightPanel",panel);
            CardLayout flightLayout = (CardLayout)rightPanel.getLayout();
            flightLayout.next(rightPanel);
            
            
        }
    }//GEN-LAST:event_viewFlightBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFlightBtn;
    private javax.swing.JTable fleetManageTbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeFlightBtn;
    private javax.swing.JButton viewFlightBtn;
    // End of variables declaration//GEN-END:variables
}
