/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Customer;
import Business.CustomerDirectory;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nitya
 */
public class CustomerRegister extends javax.swing.JPanel {

    /**
     * Creates new form CustomerRegister
     */
    
    JPanel right_Panel;
    CustomerDirectory cust_dir;
    public CustomerRegister(JPanel RightPanel,CustomerDirectory cust_dir) {
    initComponents();
    this.right_Panel=RightPanel;
    this.cust_dir = cust_dir;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FirstNametxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        LastNametxt = new javax.swing.JTextField();
        CustomerID = new javax.swing.JLabel();
        CustomerIDtxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Gendercomobobox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        mailtxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        passwdtxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        repasswdtxt = new javax.swing.JTextField();
        Createbtn = new javax.swing.JButton();

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Customer Registration");

        jLabel5.setText("First Name:");

        FirstNametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNametxtActionPerformed(evt);
            }
        });

        jLabel6.setText("Last Name:");

        LastNametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNametxtActionPerformed(evt);
            }
        });

        CustomerID.setText("Customer ID:");

        CustomerIDtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerIDtxtActionPerformed(evt);
            }
        });

        jLabel7.setText("Gender:");

        Gendercomobobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male", "female", "other" }));
        Gendercomobobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GendercomoboboxActionPerformed(evt);
            }
        });

        jLabel1.setText("Email Id:");

        mailtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailtxtActionPerformed(evt);
            }
        });

        jLabel2.setText("Password:");

        jLabel3.setText("Re-enter Password :");

        Createbtn.setText("Create");
        Createbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreatebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(CustomerID))
                        .addGap(40, 40, 40)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LastNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(repasswdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Createbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustomerIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FirstNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gendercomobobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(130, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(44, 235, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(233, 233, 233))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(FirstNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(LastNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CustomerID)
                    .addComponent(CustomerIDtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gendercomobobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passwdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(repasswdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(Createbtn)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 703, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void FirstNametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNametxtActionPerformed

    private void LastNametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNametxtActionPerformed

    private void CustomerIDtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerIDtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerIDtxtActionPerformed

    private void GendercomoboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GendercomoboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GendercomoboboxActionPerformed

    private void mailtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailtxtActionPerformed

    private void CreatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreatebtnActionPerformed
        // TODO add your handling code here:

        String username = mailtxt.getText();

        if(username == null || username.equals("") ){
            mailtxt.setBorder(BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(null,"User Name cant be empty");
            return;
        }
        String firstName= FirstNametxt.getText();
        if(firstName == null || firstName.equals("") ){
            JOptionPane.showMessageDialog(null,"First Name cant be empty");
            return;
        }
        String lastName= LastNametxt.getText();
        if(lastName == null || lastName.equals("") ){
            JOptionPane.showMessageDialog(null,"Last Name cant be empty");
            return;
        }
        String custID = CustomerIDtxt.getText();
        if(custID.equals("")){
            JOptionPane.showMessageDialog(null," Customer ID can't be empty");
            return;
        }
        try{
            Integer.parseInt(custID);
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"CustomerID cannot be String");
            return;
        }
        if(username == null || username.equals("") ){
            mailtxt.setBorder(BorderFactory.createLineBorder(Color.RED));

            JOptionPane.showMessageDialog(null,"User Name cant be empty");
            return;
        }
        if(!usernamePatternCorrect()){
            JOptionPane.showConfirmDialog(null,"User name should be the form of xxx_xxx@xxx.xxx");
            mailtxt.setBorder(BorderFactory.createLineBorder(Color.RED));

            return;
        }
        if(!PasswordPatternCorrect()){
            JOptionPane.showMessageDialog(null,"Your Password must contain 1 Capital letter , one small Letter, 1 numerical value , one special character and length should be between 8 to 50.");

            passwdtxt.setBorder(BorderFactory.createLineBorder(Color.RED));

            return;
        }
        if(!(passwdtxt.getText().equals(repasswdtxt.getText()))){
            JOptionPane.showConfirmDialog(null,"Password and Re entered password does not match");
            passwdtxt.setBorder(BorderFactory.createLineBorder(Color.RED));

            repasswdtxt.setBorder(BorderFactory.createLineBorder(Color.RED));

            return;
        }

        Customer c = cust_dir.addCustomer();
        c.setFirstName(FirstNametxt.getText());
        c.setLastName(LastNametxt.getText());
        c.setCustomerID(Integer.parseInt(CustomerIDtxt.getText()));
        c.setEmailID(mailtxt.getText());
        c.setGender(String.valueOf(Gendercomobobox.getSelectedItem()));
        c.setPassword(passwdtxt.getText());
        JOptionPane.showMessageDialog(null,"Customer Registered Successfully");

        FirstNametxt.setText("");
        LastNametxt.setText("");
        CustomerIDtxt.setText("");
        passwdtxt.setText("");
        repasswdtxt.setText("");
        mailtxt.setText("");
        Gendercomobobox.setSelectedItem("male");
        mailtxt.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        passwdtxt.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        repasswdtxt.setBorder(BorderFactory.createLineBorder(Color.BLACK));

      
    }//GEN-LAST:event_CreatebtnActionPerformed

    
      private boolean usernamePatternCorrect() {
       Pattern p = Pattern.compile("^[a-zA-Z0-9]+_[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
       Matcher m = p.matcher(mailtxt.getText());
       boolean b = m.matches();
       return b;
   }
      
     boolean PasswordPatternCorrect() {
        Pattern p = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[$*#&])[A-Za-z\\d$*#&]{6,}$");
        Matcher m = p.matcher(passwdtxt.getText());
        boolean b = m.matches();
        return b;        // TODO add your handling code here:
        
        } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Createbtn;
    private javax.swing.JLabel CustomerID;
    private javax.swing.JTextField CustomerIDtxt;
    private javax.swing.JTextField FirstNametxt;
    private javax.swing.JComboBox<String> Gendercomobobox;
    private javax.swing.JTextField LastNametxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mailtxt;
    private javax.swing.JTextField passwdtxt;
    private javax.swing.JTextField repasswdtxt;
    // End of variables declaration//GEN-END:variables
}
