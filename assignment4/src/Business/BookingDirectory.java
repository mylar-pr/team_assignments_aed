/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nitya
 */
public class BookingDirectory {
    private List<Booking> bookingList;

    public BookingDirectory() {
        bookingList = new ArrayList<>();
    }

    public List<Booking> getBookingList() {
        return bookingList;
    }

    public void setBookingList(List<Booking> bookingList) {
        this.bookingList = bookingList;
    }
    
    public Booking addBooking() {
        Booking booking = new Booking();
        bookingList.add(booking);
        return booking;
}
    
    
    public void removeBooking(Booking booking)
    {
        bookingList.remove(booking);
    }
}