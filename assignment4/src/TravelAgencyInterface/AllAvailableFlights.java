/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TravelAgencyInterface;

import Business.Airliner;
import Business.AirlinerDirectory;
import Business.BookingDirectory;
import Business.FlightDirectory;
import Business.Flights;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author paipr
 */
public class AllAvailableFlights extends javax.swing.JPanel {

    /**
     * Creates new form AllAvailableFlights
     */
    JPanel right_Panel;
    SimpleDateFormat formatter;
    AirlinerDirectory airlinerDirectory;
    Flights flights;
    Airliner airliner;
    ArrayList<Flights> AllflightsSchedule;
    BookingDirectory bookingList;

    public AllAvailableFlights(JPanel right_Panel, AirlinerDirectory airlinerDirectory,Airliner airliner,BookingDirectory bookingList) {
        initComponents();
        this.right_Panel = right_Panel;
        this.airlinerDirectory = airlinerDirectory;
        this.airliner = airliner;
        this.bookingList = bookingList;
        formatter = new SimpleDateFormat("dd-MMM-yyyy");
        AllflightsSchedule = new ArrayList<Flights>();
        getAllFlights();
        Populate_Table();

    }

    public void getAllFlights() {
        
        System.out.println("Outside Loop");

        for (Airliner airliner : airlinerDirectory.getAirlinerDir()) {
            FlightDirectory a = airliner.getFlights_dir();
            for (Flights f : a.getFlightDirectory()) {
                AllflightsSchedule.add(f);
                System.out.println("here");
            }
        }
        for (Flights f : AllflightsSchedule) {
            System.out.println("flights re " + f.getFlightID() + "fdg" + f.getSource() + "fdg" + f.getTimeofDay());
        }

    }

    public void Populate_Table() {

        DefaultTableModel model = (DefaultTableModel) tblallFlights.getModel();
        model.setRowCount(0);
        for (Flights f : AllflightsSchedule) {

            Object row[] = new Object[7];
            row[0] = f.getAirlinerName();
            row[1] = f;
            row[2] = f.getDepartureTime();
            row[3] = f.getSource();
            row[4] = f.getDestination();
            row[5] = f.getTotalSeats();
            row[6] = f.getFlightPrice();
            model.addRow(row);

        }

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
        tblallFlights = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBook = new javax.swing.JButton();

        tblallFlights.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airliner", "Flight ID", "Time", "Source", "Destination", "Seats", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblallFlights);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel1.setText("View All Flights");

        btnBook.setText("Book Selected Flight");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(btnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(339, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(110, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(110, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 350, Short.MAX_VALUE)
                .addComponent(btnBook)
                .addGap(91, 91, 91))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(210, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(141, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        // TODO add your handling code here:
        int selectrow = tblallFlights.getSelectedRow();
        if (selectrow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a flight to book");

        } else {

            Flights f = (Flights) tblallFlights.getValueAt(selectrow, 1);
            System.out.println("flight semdimb is"+ f);
            TravelAgencyCustomerSeatBooking tabs = new TravelAgencyCustomerSeatBooking(right_Panel, f, airlinerDirectory,bookingList);
            right_Panel.add("TA_CustomerSeatBooking", tabs);
            CardLayout layout = (CardLayout) right_Panel.getLayout();
            layout.next(right_Panel);

        }
        
        
    }//GEN-LAST:event_btnBookActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblallFlights;
    // End of variables declaration//GEN-END:variables

}
