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
 * @author Mahesh
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

        txt_travel_emailID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPword = new javax.swing.JTextField();
        txtRePword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        txt_TravelAgencyID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTravelAgencyName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        txt_travel_emailID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_travel_emailIDActionPerformed(evt);
            }
        });

        jLabel1.setText("Email Id");

        jLabel2.setText("Password:");

        jLabel3.setText("Re-enter Password :");

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        txt_TravelAgencyID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TravelAgencyIDActionPerformed(evt);
            }
        });

        jLabel4.setText("Travel Agency ID");

        txtTravelAgencyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTravelAgencyNameActionPerformed(evt);
            }
        });

        jLabel5.setText("Travel Agency Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Register Travel Agency ");

        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

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
                            .addComponent(txt_travel_emailID, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPword, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRePword, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_TravelAgencyID, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTravelAgencyName, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btnBack)
                        .addGap(89, 89, 89)
                        .addComponent(jLabel6)))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTravelAgencyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_TravelAgencyID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_travel_emailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRePword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnCreate)
                .addContainerGap(126, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_travel_emailIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_travel_emailIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_travel_emailIDActionPerformed

      private boolean usernamePatternCorrect() {
       Pattern p = Pattern.compile("^[a-zA-Z0-9]+_[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
       Matcher m = p.matcher(txt_travel_emailID.getText());
       boolean b = m.matches();
       return b;
   }
        private boolean PasswordPatternCorrect() {
      // boolean equalsRule = txtPword.equals(txtRePword);
    boolean lengthRule = txtPword.getText().length() >= 8 && txtPword.getText().length() <= 50;

    boolean upperRule = !String.valueOf(txtPword.getText()).equals(String.valueOf(txtPword.getText()).toLowerCase());
    boolean lowerRule = !String.valueOf(txtPword.getText()).equals(String.valueOf(txtPword.getText()).toUpperCase());
    boolean numeralRule = String.valueOf(txtPword.getText()).matches("(.*)[0-9](.*)");
    boolean nonAlphaRule = String.valueOf(txtPword.getText()).matches("(.*)[^A-Za-z0-9](.*)");
    if( !upperRule || !lowerRule || !numeralRule || !nonAlphaRule ){
            return true;
    }
            return false;
   }
    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String p1 = txtPword.getText();
        String p2 = txtRePword.getText();
       
         String Name= txtTravelAgencyName.getText();
        if(Name == null || Name.equals("") ){
            JOptionPane.showMessageDialog(null,"Last Name cant be empty");
            return;
        }
         String custID = txt_TravelAgencyID.getText();
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
          String username = txt_travel_emailID.getText();
        if(username == null || username.equals("") ){
          
           
            JOptionPane.showMessageDialog(null,"Email ID Name cant be empty");
               return;
        }
        if(!usernamePatternCorrect()){
            JOptionPane.showConfirmDialog(null,"Email ID should be the form of xxx_xxx@xxx.xxx");
            txt_travel_emailID.setBorder(BorderFactory.createLineBorder(Color.RED));
           
            return;
        }
        if(PasswordPatternCorrect()){
            JOptionPane.showMessageDialog(null,"Your Password must contain 1 Capital letter , one small Letter, 1 numerical value , one special character and length should be between 8 to 50.");

            txtPword.setBorder(BorderFactory.createLineBorder(Color.RED));
           

            return;
        }
        if(!(txtPword.getText().equals(txtRePword.getText()))){
            JOptionPane.showConfirmDialog(null,"Password and Re entered password does not match");
            txtPword.setBorder(BorderFactory.createLineBorder(Color.RED));
            
            txtRePword.setBorder(BorderFactory.createLineBorder(Color.RED));
           
            return;
        }

              TravelAgency ta = travel_dir.addTravelAgency();
              ta.setTravelAgencyName(txtTravelAgencyName.getText());
              ta.setTravelAgencyID(txt_travel_emailID.getText());
              ta.setEmailID(txt_travel_emailID.getText());
              ta.setPassword(txtPword.getText());
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
                 txtTravelAgencyName.setText("");
                 txt_TravelAgencyID.setText("");
                 txt_travel_emailID.setText("");
                 txtPword.setText("");
                 txtRePword.setText("");
              
                txt_travel_emailID.setBorder(BorderFactory.createLineBorder(Color.BLACK));
              txtPword.setBorder(BorderFactory.createLineBorder(Color.BLACK));
               txtRePword.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txt_TravelAgencyIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TravelAgencyIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TravelAgencyIDActionPerformed

    private void txtTravelAgencyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTravelAgencyNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTravelAgencyNameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        right_Panel.remove(this);
        CardLayout layout =(CardLayout) right_Panel.getLayout();
        layout.previous(right_Panel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtPword;
    private javax.swing.JTextField txtRePword;
    private javax.swing.JTextField txtTravelAgencyName;
    private javax.swing.JTextField txt_TravelAgencyID;
    private javax.swing.JTextField txt_travel_emailID;
    // End of variables declaration//GEN-END:variables
}
