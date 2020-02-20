/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AirlinerUserInterface;

import Business.AirlinerDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author prajw
 */
public class AirlinerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AirlinerJPanel
     */
    JPanel rightPanel;
    AirlinerDirectory airliner_dir;
    

    
    public AirlinerJPanel(JPanel rightPanel, AirlinerDirectory airliner_dir) {
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

        createAirlinerBtn = new javax.swing.JButton();
        manageAirlinerBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        createAirlinerBtn.setText("Create Airliner");
        createAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAirlinerBtnActionPerformed(evt);
            }
        });
        add(createAirlinerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 110, -1));

        manageAirlinerBtn.setText("Manage Airliner");
        manageAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAirlinerBtnActionPerformed(evt);
            }
        });
        add(manageAirlinerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 110, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void createAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAirlinerBtnActionPerformed
        // TODO add your handling code here:
        CreateAirliner a = new CreateAirliner(rightPanel, airliner_dir);
        rightPanel.add("CreateAirliner",a);
        CardLayout cardLayout = (CardLayout) rightPanel.getLayout();
        cardLayout.next(rightPanel);
        
        
        
    }//GEN-LAST:event_createAirlinerBtnActionPerformed

    private void manageAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAirlinerBtnActionPerformed
        // TODO add your handling code here:
        
        ManageAirlinerJPanel m = new ManageAirlinerJPanel(rightPanel, airliner_dir);
        rightPanel.add("ManageAirlinersJPanel",m);
        CardLayout cardLayout = (CardLayout) rightPanel.getLayout(); 
        cardLayout.next(rightPanel);           
        
    }//GEN-LAST:event_manageAirlinerBtnActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createAirlinerBtn;
    private javax.swing.JButton manageAirlinerBtn;
    // End of variables declaration//GEN-END:variables
}
