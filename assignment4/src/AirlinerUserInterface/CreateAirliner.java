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

/**
 *
 * @author prajw
 */
public class CreateAirliner extends javax.swing.JPanel {

    /**
     * Creates new form CreateAirliner
     */
    AirlinerDirectory airliner_dir;
    JPanel rightPanel;
    
    public CreateAirliner(JPanel rightPanel, AirlinerDirectory airliner_dir) {
        initComponents();
        this.rightPanel = rightPanel;
        this.airliner_dir = airliner_dir;
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
        jLabel7 = new javax.swing.JLabel();
        airlinerNameTF = new javax.swing.JTextField();
        airlinerIdTF = new javax.swing.JTextField();
        manufacturerTF = new javax.swing.JTextField();
        ccnTF = new javax.swing.JTextField();
        hqTF = new javax.swing.JTextField();
        allianceDropDown = new javax.swing.JComboBox<>();
        saveAirlinerBtn = new javax.swing.JButton();
        backCreateAirliner = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Create an Airliner");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        jLabel2.setText("Airliner Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        jLabel3.setText("Airliner ID");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        jLabel4.setText("Alliance Name");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        jLabel5.setText("Manufacturer");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        jLabel6.setText("Customer Care Number");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        jLabel7.setText("Head Quarters");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));
        add(airlinerNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 100, -1));
        add(airlinerIdTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 100, -1));
        add(manufacturerTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 100, -1));

        ccnTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccnTFActionPerformed(evt);
            }
        });
        add(ccnTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 100, -1));

        hqTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hqTFActionPerformed(evt);
            }
        });
        add(hqTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 100, -1));

        allianceDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Star Alliance", "Oneworld", "SkyTeam", " " }));
        add(allianceDropDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 100, -1));

        saveAirlinerBtn.setText("Save");
        saveAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAirlinerBtnActionPerformed(evt);
            }
        });
        add(saveAirlinerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        backCreateAirliner.setText("Back");
        backCreateAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backCreateAirlinerActionPerformed(evt);
            }
        });
        add(backCreateAirliner, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void ccnTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccnTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ccnTFActionPerformed

    private void hqTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hqTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hqTFActionPerformed

    private void saveAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAirlinerBtnActionPerformed
        // TODO add your handling code here:
        
        if(airlinerIdTF.getText().equals("") ||
                airlinerNameTF.getText().equals("") ||
                allianceDropDown.getSelectedItem().equals("")||
                manufacturerTF.getText().equals("")||
                ccnTF.getText().equals("")||
                hqTF.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Please enter all the fields.", "Warning", JOptionPane.WARNING_MESSAGE);
        return;
        }
        
        try{
            Integer.parseInt(airlinerIdTF.getText());
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Enter a valid ID number","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        try{
            Integer.parseInt(ccnTF.getText());
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Enter a valid customer care number","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Airliner airliner = airliner_dir.addAirliner();
        airliner.setAirlinerID(airlinerIdTF.getText());
        airliner.setAirlinerName(airlinerNameTF.getText());
        airliner.setAllianceName((String)allianceDropDown.getSelectedItem());
        airliner.setCustomerCareNumber(Integer.parseInt(ccnTF.getText()));
        airliner.setManufacturerName(manufacturerTF.getText());
        airliner.setHeadQuarters(hqTF.getText());
        
        JOptionPane.showMessageDialog(null, "Airliner added successfully.");
        
        airlinerIdTF.setText("");
        airlinerNameTF.setText("");
        manufacturerTF.setText("");
        hqTF.setText("");
        ccnTF.setText("");
        
        
        
    }//GEN-LAST:event_saveAirlinerBtnActionPerformed

    private void backCreateAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backCreateAirlinerActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        CardLayout backCreateAirlinerPanel = (CardLayout) rightPanel.getLayout();
        backCreateAirlinerPanel.previous(rightPanel);
    }//GEN-LAST:event_backCreateAirlinerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airlinerIdTF;
    private javax.swing.JTextField airlinerNameTF;
    private javax.swing.JComboBox<String> allianceDropDown;
    private javax.swing.JButton backCreateAirliner;
    private javax.swing.JTextField ccnTF;
    private javax.swing.JTextField hqTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField manufacturerTF;
    private javax.swing.JButton saveAirlinerBtn;
    // End of variables declaration//GEN-END:variables
}
