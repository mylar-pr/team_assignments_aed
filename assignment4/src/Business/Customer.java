/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author nitya
 */
public class Customer {
    private String emailID;
    private String password;
    private String firstName;
    private String lastName;
    private String flightID;
    private String gender;
    private int customerID;
    private String passportNum;
    private String airlinerName;
    private ArrayList<String> BookedSeats;

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getPassportNum() {
        return passportNum;
    }

    public void setPassportNum(String passportNum) {
        this.passportNum = passportNum;
    }

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public ArrayList<String> getBookedSeats() {
        return BookedSeats;
    }

    public void setBookedSeats(ArrayList<String> BookedSeats) {
        this.BookedSeats = BookedSeats;
    }
    
     public Customer(){
        BookedSeats = new ArrayList<>();
    }
     
      public boolean verify(String password){
        if(password.equals(getPassword()))
            return true;
        return false;
    }
    @Override
        public String toString()
    {
        return emailID;
    }
      
    
}
