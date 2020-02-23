/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerInterface;

import Business.AirlinerDirectory;
import Business.Booking;
import Business.BookingDirectory;
import Business.Customer;
import Business.Flights;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nitya
 */
public class Customerbooking extends javax.swing.JPanel {

    /**
     * Creates new form Customerbooking
     */
    private Flights flights;
    JPanel RightPanel;
    Customer c;
    private AirlinerDirectory airlinerDirectory;
    private BookingDirectory bookingList;
    ArrayList<String> tempBookedSeats;
    
      public Customerbooking(JPanel RightPanel, Flights flights, AirlinerDirectory airlinerDirectory, Customer c, BookingDirectory booking_dir) {
        initComponents();
        this.RightPanel = RightPanel;
        this.flights = flights;
        this.airlinerDirectory = airlinerDirectory;
        seatingpreftxt.removeAllItems();
        this.tempBookedSeats = new ArrayList<>();
        this.bookingList = booking_dir;
        this.c = c;

        for (String s : flights.getSeatList()) {
            seatingpreftxt.addItem(s);
        }
        FirstNametxt.setText(c.getFirstName());
        Lastnametxt.setText(c.getLastName());
//        txt_Passport.setText(c.getPassportNumber());
        mailIdtxt.setText(c.getEmailID());
        flightidtxt.setText(flights.getFlightID());
        Airlinenametxt.setText(flights.getAirlinerName());
        int total = flights.getTotalSeats();
//        total = total - 1;
//        flights.setTotal_Seats(total);
        Availableseatstxt.setText(String.valueOf(flights.getTotalSeats()));
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
        FirstNametxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Lastnametxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        mailIdtxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passporttxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Genderbox = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        Airlinenametxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        flightidtxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Availableseatstxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        seatingpreftxt = new javax.swing.JComboBox();
        Addbtn = new javax.swing.JButton();
        selectedseattxt = new javax.swing.JTextField();
        Backbtn = new javax.swing.JButton();
        BookBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Customer Details");

        jLabel2.setText("First Name:");

        jLabel3.setText("Last Name:");

        jLabel4.setText("Email ID:");

        jLabel5.setText("Passport:");

        jLabel14.setText("Sex:");

        Genderbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Others" }));
        Genderbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenderboxActionPerformed(evt);
            }
        });

        jLabel15.setText("Airline Name:");

        jLabel6.setText("Filght ID:");

        jLabel8.setText("Availableseats");

        jLabel7.setText("Seating Preference:");

        seatingpreftxt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        seatingpreftxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatingpreftxtActionPerformed(evt);
            }
        });

        Addbtn.setText("Add");
        Addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbtnActionPerformed(evt);
            }
        });

        selectedseattxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedseattxtActionPerformed(evt);
            }
        });

        Backbtn.setText("<<Back");
        Backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbtnActionPerformed(evt);
            }
        });

        BookBtn.setText("Book");
        BookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Backbtn)
                                .addGap(93, 93, 93)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BookBtn)
                                        .addGap(4, 4, 4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(82, 82, 82)
                                        .addComponent(seatingpreftxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(79, 79, 79)
                                .addComponent(Addbtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(selectedseattxt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(253, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel14)
                            .addComponent(jLabel6))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(flightidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Genderbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mailIdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FirstNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3)
                                .addComponent(jLabel15))
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(passporttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Lastnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Airlinenametxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Availableseatstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(189, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Backbtn))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(FirstNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Lastnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(mailIdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(passporttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(Airlinenametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Genderbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(flightidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(Availableseatstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(seatingpreftxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Addbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectedseattxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(BookBtn)
                .addContainerGap(53, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void GenderboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenderboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenderboxActionPerformed

    private void seatingpreftxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatingpreftxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatingpreftxtActionPerformed

    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbtnActionPerformed
        // TODO add your handling code here:

        String seat = (String) seatingpreftxt.getSelectedItem();
        String tempSeat = seat;

        tempSeat = selectedseattxt.getText();

        if (!seat.equals(null) && !seat.equals("Window")) {
            System.out.println(seat);
            flights.removeSeat(seat);
            System.out.println("Seat Removed");

            if (seat.contains("1") || seat.contains("6")) {
                System.out.println("Window");

                tempSeat = tempSeat + " - Window";

            } else if ((seat.contains("2") || seat.contains("5"))) {
                System.out.println("Middle");

                tempSeat = tempSeat + " - Middle";
            } else if ((seat.contains("3") || seat.contains("4"))) {
                System.out.println("Aisle");

                tempSeat = tempSeat + " - Aisle";

            }

            seatingpreftxt.removeAllItems();

            for (String s : flights.getSeatList()) {
                seatingpreftxt.addItem(s);

            }

            tempBookedSeats.add(seat);

            System.out.println("Seat Added");

            selectedseattxt.setText(tempSeat);

        }

    }//GEN-LAST:event_AddbtnActionPerformed

    private void selectedseattxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectedseattxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectedseattxtActionPerformed

    private void BackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbtnActionPerformed
        // TODO add your handling code here:
       RightPanel.remove(this);

        Component[] componentArray = RightPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];

        CustomerSearch CustomerSearch = (CustomerSearch) component;
        CustomerSearch.Populate_Table();
        CardLayout layout = (CardLayout) RightPanel.getLayout();
        layout.previous(RightPanel);
        
    }//GEN-LAST:event_BackbtnActionPerformed

    private void BookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookBtnActionPerformed
             try {
            if (FirstNametxt.getText().equals("")
                    || Lastnametxt.getText().equals("")
                    || passporttxt.getText().equals("")
                    || mailIdtxt.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter all the fields details");
            } else {

                Booking b = bookingList.addBooking();
                b.setEmailID(mailIdtxt.getText());
                b.setFullName(FirstNametxt.getText() + " " + Lastnametxt.getText());
                b.setAirlinerName(Airlinenametxt.getText());
                b.setFlightID(flightidtxt.getText());
                b.setAirlinerName(flights.getAirlinerName());
                b.setBookedBy("Customer");
                b.setDepartureDate(flights.getDepartureTime());
                b.setDestination(flights.getDestination());
                b.setSource(flights.getSource());

                for (String s : tempBookedSeats) {
                    System.out.println("Loop - Seat Add");
                    b.getBookedSeats().add(s);
                    flights.setTotalSeats(flights.getTotalSeats() - 1);
                    Availableseatstxt.setText(String.valueOf(flights.getTotalSeats()));

                }

                JOptionPane.showMessageDialog(null, "Ticket has been booked!");
                passporttxt.setText("");
                selectedseattxt.setText("");
                

            }
        } catch (Exception e) {

            System.out.println(e);

            JOptionPane.showMessageDialog(null, "Please enter proper inputs");
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_BookBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn;
    private javax.swing.JTextField Airlinenametxt;
    private javax.swing.JTextField Availableseatstxt;
    private javax.swing.JButton Backbtn;
    private javax.swing.JButton BookBtn;
    private javax.swing.JTextField FirstNametxt;
    private javax.swing.JComboBox Genderbox;
    private javax.swing.JTextField Lastnametxt;
    private javax.swing.JTextField flightidtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField mailIdtxt;
    private javax.swing.JTextField passporttxt;
    private javax.swing.JComboBox seatingpreftxt;
    private javax.swing.JTextField selectedseattxt;
    // End of variables declaration//GEN-END:variables
}
