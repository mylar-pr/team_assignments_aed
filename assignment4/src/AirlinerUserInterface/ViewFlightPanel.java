/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AirlinerUserInterface;

import Business.Flights;
import javax.swing.JPanel;

/**
 *
 * @author prajw
 */
public class ViewFlightPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewFlightPanel
     */
    JPanel rightPanel;
    Flights flights;
    public ViewFlightPanel(JPanel rightJPanel, Flights flights) {
        initComponents();
        this.rightPanel = rightPanel;
        this.flights = flights;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        flightTypeTF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        flightDurTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        todCB = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        flightPrice = new javax.swing.JTextField();
        flightNameTF = new javax.swing.JTextField();
        flightIDTF = new javax.swing.JTextField();
        flightDateChooser = new com.toedter.calendar.JDateChooser();
        sourceCityTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        destCityTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Destination City:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        flightTypeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightTypeTFActionPerformed(evt);
            }
        });
        add(flightTypeTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 265, 134, -1));

        jLabel10.setText("Departure Date:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        flightDurTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightDurTFActionPerformed(evt);
            }
        });
        add(flightDurTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 236, 134, -1));

        jLabel9.setText("Flight Duration");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        jLabel7.setText("Time of Day:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        todCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Morning", "Noon", "Night" }));
        add(todCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 296, 134, -1));

        jLabel8.setText("Price:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        jLabel11.setText("Flight Type");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        flightPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightPriceActionPerformed(evt);
            }
        });
        add(flightPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 328, 134, -1));
        add(flightNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 64, 134, -1));
        add(flightIDTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 102, 134, -1));
        add(flightDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 201, -1, -1));
        add(sourceCityTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 140, 134, -1));

        jButton1.setText("Save");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 366, -1, -1));

        destCityTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destCityTFActionPerformed(evt);
            }
        });
        add(destCityTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 172, 134, -1));

        jLabel4.setText("Source City:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        jLabel2.setText("Flight Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 67, -1, -1));

        jLabel3.setText("Flight ID");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 105, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void flightTypeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightTypeTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flightTypeTFActionPerformed

    private void flightDurTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightDurTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flightDurTFActionPerformed

    private void flightPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flightPriceActionPerformed

    private void destCityTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destCityTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destCityTFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField destCityTF;
    private com.toedter.calendar.JDateChooser flightDateChooser;
    private javax.swing.JTextField flightDurTF;
    private javax.swing.JTextField flightIDTF;
    private javax.swing.JTextField flightNameTF;
    private javax.swing.JTextField flightPrice;
    private javax.swing.JTextField flightTypeTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField sourceCityTF;
    private javax.swing.JComboBox<String> todCB;
    // End of variables declaration//GEN-END:variables
}
