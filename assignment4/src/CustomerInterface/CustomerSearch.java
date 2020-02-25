/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerInterface;

import Business.Airliner;
import Business.AirlinerDirectory;
import Business.BookingDirectory;
import Business.Customer;
import Business.CustomerDirectory;
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
 * @author nitya
 */
public class CustomerSearch extends javax.swing.JPanel {

    /**
     * Creates new form CustomerSeachJPanel
     */
    
    JPanel RightPanel;
    SimpleDateFormat formatter;
    AirlinerDirectory airlinerDirectory;
    Flights flights;
    Airliner airliner;
    Customer c;
    CustomerDirectory customer_dir;
    BookingDirectory booking_dir;
    ArrayList<Flights> AllflightsSchedule;
    ArrayList<Flights> FilteredFlights;
     public CustomerSearch(JPanel rightPanel, Customer c,  CustomerDirectory customer_dir, AirlinerDirectory airlinerDirectory, BookingDirectory booking_dir) {
        initComponents();
        this.RightPanel=rightPanel;
        this.airlinerDirectory = airlinerDirectory;
        this.airliner = airliner;
        this.c =c;
        this.customer_dir =customer_dir;
        this.booking_dir = booking_dir;
        
        formatter = new SimpleDateFormat("dd-MMM-yyyy");
        AllflightsSchedule = new ArrayList<Flights>();
        getAllFlights();
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
        sourcetxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        desttxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Time = new javax.swing.JLabel();
        timetxt = new javax.swing.JComboBox();
        searchbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Seattable = new javax.swing.JTable();
        bookselectedbtn = new javax.swing.JButton();
        DateChooser = new com.toedter.calendar.JDateChooser();

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Search Flight");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Source:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Destination:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Date:");

        Time.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Time.setText("Time:");

        timetxt.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Morning", "Afternoon", "Evening" }));

        searchbtn.setBackground(new java.awt.Color(51, 255, 51));
        searchbtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });

        Seattable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airliner Name", "FlightID", "Time", "Seat", "Price"
            }
        ));
        jScrollPane1.setViewportView(Seattable);

        bookselectedbtn.setBackground(new java.awt.Color(0, 255, 102));
        bookselectedbtn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        bookselectedbtn.setText("Book Selected");
        bookselectedbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookselectedbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(sourcetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(42, 42, 42)
                                .addComponent(desttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Time)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(timetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(bookselectedbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(searchbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sourcetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(desttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(Time)
                        .addComponent(timetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(searchbtn)
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(bookselectedbtn)
                .addContainerGap(59, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
       public void getAllFlights() 
       {

        for (Airliner airliner : airlinerDirectory.getAirlinerDir()) {
            FlightDirectory a = airliner.getFlights_dir();
            for (Flights f : a.getFlightDirectory()) {
                AllflightsSchedule.add(f);
            }
        }

        for (Flights f : AllflightsSchedule) {
            System.out.println("flights re " + f.getFlightId() + "fdg" + f.getSource() + "fdg" + f.getTimeofDay());
        }

    }
    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
        Populate_Table();
    }//GEN-LAST:event_searchbtnActionPerformed

       public void Populate_Table() {
        SimpleDateFormat parser = new SimpleDateFormat("MM-dd-yyyy");

        FilteredFlights = new ArrayList<Flights>();

        for (Flights fs : AllflightsSchedule) {
            System.out.println(fs.getDepartureTime() + "chgvjbknl" + DateChooser.getDate());
            if (fs.getSource().equalsIgnoreCase(sourcetxt.getText())
                    && fs.getDestination().equalsIgnoreCase(desttxt.getText())
                    && parser.format(fs.getDepartureTime()).equals(parser.format(DateChooser.getDate()))
                    && fs.getTimeofDay().equalsIgnoreCase((String) timetxt.getSelectedItem())) {
                FilteredFlights.add(fs);
            }

            DefaultTableModel model = (DefaultTableModel) Seattable.getModel();
            model.setRowCount(0);
            for (Flights f : FilteredFlights) {
                Object row[] = new Object[5];
                row[0] = f.getAirlinerName();
                row[1] = f;
                row[2] = f.getDepartureTime();
                row[3] = f.getTotalSeats();
                row[4] = f.getFlightPrice();
                model.addRow(row);

            }

        }

    }
    
    
    private void bookselectedbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookselectedbtnActionPerformed
        int selectrow = Seattable.getSelectedRow();
        if (selectrow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a flight to book");

        } else {

            Flights f = (Flights) Seattable.getValueAt(selectrow, 1);
            //            System.out.println("flight semdimb is"+ f);
            Customerbooking bs = new Customerbooking(RightPanel, f, airlinerDirectory, c, booking_dir);
            RightPanel.add("CustomerSeatBooking", bs);
            CardLayout layout = (CardLayout) RightPanel.getLayout();
            layout.next(RightPanel);
            // TODO add your handling code here:
    }//GEN-LAST:event_bookselectedbtnActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateChooser;
    private javax.swing.JTable Seattable;
    private javax.swing.JLabel Time;
    private javax.swing.JButton bookselectedbtn;
    private javax.swing.JTextField desttxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTextField sourcetxt;
    private javax.swing.JComboBox timetxt;
    // End of variables declaration//GEN-END:variables
}
