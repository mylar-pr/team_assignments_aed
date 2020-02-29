/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.TravelAgency;
import Business.TravelAgencyDirectory;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author paipr
 */
public class TravelAgencyRegister extends javax.swing.JPanel {

    /**
     * Creates new form TravelAgencyRegister
     */
     JPanel right_Panel;
     TravelAgencyDirectory travel_dir;
    public TravelAgencyRegister(JPanel RightPanel,TravelAgencyDirectory travel_dir) {
        initComponents();
           this.right_Panel=RightPanel;
        this.travel_dir = travel_dir;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtemailID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        txtRePassword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        txtAgencyID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAgencyName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        txtemailID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailIDActionPerformed(evt);
            }
        });

        jLabel1.setText("Email Id");

        jLabel2.setText("Password:");

        jLabel3.setText("Re-enter Password :");

        btnRegister.setText("Create");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        txtAgencyID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgencyIDActionPerformed(evt);
            }
        });

        jLabel4.setText("Travel Agency ID");

        txtAgencyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgencyNameActionPerformed(evt);
            }
        });

        jLabel5.setText("Travel Agency Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Register Travel Agency ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(22, 22, 22))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel1))
                                        .addGap(18, 18, 18))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtemailID, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAgencyID, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAgencyName, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabel6)))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAgencyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAgencyID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtemailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnRegister)
                .addContainerGap(126, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtemailIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailIDActionPerformed

      private boolean usernamePatternCorrect() {
       Pattern p = Pattern.compile("^[a-zA-Z0-9]+_[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
       Matcher m = p.matcher(txtemailID.getText());
       boolean b = m.matches();
       return b;
   }
        private boolean PasswordPatternCorrect() {
      // boolean equalsRule = txtPword.equals(txtRePword);
    boolean lengthRule = txtPassword.getText().length() >= 8 && txtPassword.getText().length() <= 50;

    boolean upperRule = !String.valueOf(txtPassword.getText()).equals(String.valueOf(txtPassword.getText()).toLowerCase());
    boolean lowerRule = !String.valueOf(txtPassword.getText()).equals(String.valueOf(txtPassword.getText()).toUpperCase());
    boolean numeralRule = String.valueOf(txtPassword.getText()).matches("(.*)[0-9](.*)");
    boolean nonAlphaRule = String.valueOf(txtPassword.getText()).matches("(.*)[^A-Za-z0-9](.*)");
    if( !upperRule || !lowerRule || !numeralRule || !nonAlphaRule ){
            return true;
    }
            return false;
   }
    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        String p1 = txtPassword.getText();
        String p2 = txtRePassword.getText();
       
         String Name= txtAgencyName.getText();
        if(Name == null || Name.equals("") ){
            JOptionPane.showMessageDialog(null,"Last Name cant be empty");
            return;
        }
         String custID = txtAgencyID.getText();
         if(custID.equals("")){
             JOptionPane.showMessageDialog(null," TravelAgency ID can't be empty");
             return;
         }
         try{
         Integer.parseInt(custID);
         }
         catch(NumberFormatException ex){
          JOptionPane.showMessageDialog(null,"TravelAgency ID cannot be String");
           return;
         }
          String username = txtemailID.getText();
        if(username == null || username.equals("") ){
          
           
            JOptionPane.showMessageDialog(null,"Email ID Name cant be empty");
               return;
        }
        if(!usernamePatternCorrect()){
            JOptionPane.showConfirmDialog(null,"Email ID should be the form of xxx_xxx@xxx.xxx");
            txtemailID.setBorder(BorderFactory.createLineBorder(Color.RED));
           
            return;
        }
        if(PasswordPatternCorrect()){
            JOptionPane.showMessageDialog(null,"Your Password must contain 1 Capital letter , one small Letter, 1 numerical value , one special character and length should be between 8 to 50.");

            txtPassword.setBorder(BorderFactory.createLineBorder(Color.RED));
           

            return;
        }
        if(!(txtPassword.getText().equals(txtRePassword.getText()))){
            JOptionPane.showConfirmDialog(null,"Password and Re entered password does not match");
            txtPassword.setBorder(BorderFactory.createLineBorder(Color.RED));
            
            txtRePassword.setBorder(BorderFactory.createLineBorder(Color.RED));
           
            return;
        }

              TravelAgency ta = travel_dir.addTravelAgency();
              ta.setTravelAgencyName(txtAgencyName.getText());
              ta.setTravelAgencyID(txtemailID.getText());
              ta.setEmailID(txtemailID.getText());
              ta.setPassword(txtPassword.getText());
               JOptionPane.showMessageDialog(null,"Travel Agency Registered Successfully");
//        if(radioSupplier.isSelected()){
//            admin.getSuppDir().getSupplierList().add(new Supplier(p1,username));
//            JOptionPane.showMessageDialog(null,"Supplier Registered Successfully");
//            toMainScreen();
//        }
//        if(radioCustomer.isSelected()){
//            admin.getCustDir().getCustomerList().add(new Customer(p1,username));
//            JOptionPane.showMessageDialog(null,"Customer Registered Successfully");
//            toMainScreen();
//        }
                 txtAgencyName.setText("");
                 txtAgencyID.setText("");
                 txtemailID.setText("");
                 txtPassword.setText("");
                 txtRePassword.setText("");
              
                txtemailID.setBorder(BorderFactory.createLineBorder(Color.BLACK));
              txtPassword.setBorder(BorderFactory.createLineBorder(Color.BLACK));
               txtRePassword.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void txtAgencyIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgencyIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgencyIDActionPerformed

    private void txtAgencyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgencyNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgencyNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtAgencyID;
    private javax.swing.JTextField txtAgencyName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtRePassword;
    private javax.swing.JTextField txtemailID;
    // End of variables declaration//GEN-END:variables
}
