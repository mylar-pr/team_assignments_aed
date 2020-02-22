/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AirlinerUserInterface;

import Business.Airliner;
import Business.Flights;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author prajw
 */
public class AddFlight extends javax.swing.JPanel {

    /**
     * Creates new form AddFlight
     */
    
    JPanel rightPanel;
    Airliner airliner;
    
    
    public AddFlight(JPanel rightPanel, Airliner airliner) {
        initComponents();
        this.airliner = airliner;
        this.rightPanel = rightPanel;
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
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        flightNameTF = new javax.swing.JTextField();
        flightIDTF = new javax.swing.JTextField();
        sourceCityTF = new javax.swing.JTextField();
        destCityTF = new javax.swing.JTextField();
        flightTypeTF = new javax.swing.JTextField();
        flightDurTF = new javax.swing.JTextField();
        todCB = new javax.swing.JComboBox<>();
        flightPrice = new javax.swing.JTextField();
        flightDateChooser = new com.toedter.calendar.JDateChooser();
        saveFlightBtn = new javax.swing.JButton();
        backAddFlightBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ADD A FLIGHT");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 11, -1, 35));

        jLabel2.setText("Flight Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 67, -1, -1));

        jLabel3.setText("Flight ID");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 105, -1, -1));

        jLabel4.setText("Source City:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        jLabel5.setText("Destination City:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        jLabel10.setText("Departure Date:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        jLabel9.setText("Flight Duration");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        jLabel7.setText("Time of Day:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        jLabel8.setText("Price:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        jLabel11.setText("Flight Type");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));
        add(flightNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 64, 134, -1));
        add(flightIDTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 102, 134, -1));
        add(sourceCityTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 140, 134, -1));

        destCityTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destCityTFActionPerformed(evt);
            }
        });
        add(destCityTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 172, 134, -1));

        flightTypeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightTypeTFActionPerformed(evt);
            }
        });
        add(flightTypeTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 265, 134, -1));

        flightDurTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightDurTFActionPerformed(evt);
            }
        });
        add(flightDurTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 236, 134, -1));

        todCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Morning", "Noon", "Night" }));
        add(todCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 296, 134, -1));

        flightPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightPriceActionPerformed(evt);
            }
        });
        add(flightPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 328, 134, -1));
        add(flightDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 201, -1, -1));

        saveFlightBtn.setText("Save");
        saveFlightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFlightBtnActionPerformed(evt);
            }
        });
        add(saveFlightBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 366, -1, -1));

        backAddFlightBtn.setText("Back");
        backAddFlightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backAddFlightBtnActionPerformed(evt);
            }
        });
        add(backAddFlightBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 70, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void destCityTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destCityTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destCityTFActionPerformed

    private void flightTypeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightTypeTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flightTypeTFActionPerformed

    private void flightDurTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightDurTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flightDurTFActionPerformed

    private void flightPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flightPriceActionPerformed

    private void saveFlightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFlightBtnActionPerformed
        // TODO add your handling code here:
        if(flightNameTF.getText().equals("") ||
                flightIDTF.getText().equals("") ||
                sourceCityTF.getText().equals("") || 
                destCityTF.getText().equals("")||
                flightDateChooser.getDate().equals("")||
                flightDurTF.getText().equals("") ||
                flightTypeTF.getText().equals("") ||
                todCB.getSelectedItem().equals("") ||
                flightPrice.getText().equals("")){
            
            JOptionPane.showMessageDialog(null, "Please enter all the fields", "WARNING", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try{
            Integer.parseInt(flightIDTF.getText());
        }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Enter a valid ID number", "WARNING", JOptionPane.WARNING_MESSAGE);
                return;
                }
        
        try{
            Integer.parseInt(flightDurTF.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Enter valid flight duration", "WARNING", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try{
            Integer.parseInt(flightPrice.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Enter a valid price", "WARNING", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        
        Flights f = airliner.getFlights_dir().addFlights();
        f.setAirlinerName(airliner.getAirlinerName());
        f.setFlightName(flightNameTF.getText());
        f.setFlightId(flightIDTF.getText());
        f.setSource(sourceCityTF.getText());
        f.setDestination(destCityTF.getText());
        f.setDepartureTime(flightDateChooser.getDate());
        f.setFlightDuration(Integer.parseInt(flightDurTF.getText()));
        f.setFlightType(flightTypeTF.getText());
        f.setTimeofDay(String.valueOf(todCB.getSelectedItem()));
        f.setFlightPrice(Integer.parseInt(flightPrice.getText()));
        
        f.generateSeats();
        
        JOptionPane.showMessageDialog(null, "All flight details saved Successfully.");
        
        flightNameTF.setText("");
        flightIDTF.setText("");
        sourceCityTF.setText("");
        destCityTF.setText("");
        todCB.setSelectedItem("Morning");
        flightDurTF.setText("");
        flightTypeTF.setText("");
        flightPrice.setText("");
        
        
        
        
    }//GEN-LAST:event_saveFlightBtnActionPerformed

    private void backAddFlightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backAddFlightBtnActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        CardLayout backAddFlightsLayout = (CardLayout) rightPanel.getLayout();
        backAddFlightsLayout.next(rightPanel);
    }//GEN-LAST:event_backAddFlightBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backAddFlightBtn;
    private javax.swing.JTextField destCityTF;
    private com.toedter.calendar.JDateChooser flightDateChooser;
    private javax.swing.JTextField flightDurTF;
    private javax.swing.JTextField flightIDTF;
    private javax.swing.JTextField flightNameTF;
    private javax.swing.JTextField flightPrice;
    private javax.swing.JTextField flightTypeTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton saveFlightBtn;
    private javax.swing.JTextField sourceCityTF;
    private javax.swing.JComboBox<String> todCB;
    // End of variables declaration//GEN-END:variables
}
