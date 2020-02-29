/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author prajw
 */
public class Flights {
    
    private String flightName;
    private String flightType;
    private String flightID;
    private String destination;
    private String source;
    private Date departureTime;
    private Date arrivalTime;
    private String TimeofDay;
    private int flightPrice;
    private ArrayList<String> seatList;
    private int totalSeats = 156;
    private int flightDuration;
    private String AirlinerName;

    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public ArrayList<String> getSeatList() {
        return seatList;
    }

    public void setSeatList(ArrayList<String> seatList) {
        this.seatList = seatList;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }
    
    
    
    public String getAirlinerName() {
        return AirlinerName;
    }

    public void setAirlinerName(String AirlinerName) {
        this.AirlinerName = AirlinerName;
    }
    
    

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getFlightType() {
        return flightType;
    }

    public void setFlightType(String flightType) {
        this.flightType = flightType;
    }

    public String getFlightId() {
        return flightID;
    }

    public void setFlightId(String flightID) {
        this.flightID = flightID;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getTimeofDay() {
        return TimeofDay;
    }

    public void setTimeofDay(String TimeofDay) {
        this.TimeofDay = TimeofDay;
    }

    public int getFlightPrice() {
        return flightPrice;
    }

    public void setFlightPrice(int flightPrice) {
        this.flightPrice = flightPrice;
    }

//    public ArrayList<String> getSeatList() {
//        return seatList;
//    }

    public void setTotalSeats(ArrayList<String> totalSeats) {
        this.seatList = totalSeats;
    }

    public int getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(int flightDuration) {
        this.flightDuration = flightDuration;
    }
    
    @Override
     public String toString()
    {
        return flightID;
    }
     
    public void generateSeats(){
        seatList = new ArrayList<String>();
        String alph[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        for(String j: alph){
            for(int i = 1; i<=6; i++){
                seatList.add(j+i);
            }
        }
        
    }
    
    public ArrayList<String> removeSeat(String s){
        
        seatList.remove(s);
        return seatList;
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
