 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author prajw
 */
public class Airliner {
    
    private String airlinerID;
    private String airlinerName;
    private String allianceName;
    private String manufacturerName;
    private int customerCareNumber;
    private String headQuarters;
    private FlightDirectory flights_dir;
    
    private ArrayList<Flights> flightScheduleList;

    
    public FlightDirectory getFlights_dir() {
        return flights_dir;
    }

    public void setFlights_dir(FlightDirectory flights_dir) {
        this.flights_dir = flights_dir;
    }

    public ArrayList<Flights> getFlightScheduleList() {
        return flightScheduleList;
    }

    public void setFlightScheduleList(ArrayList<Flights> flightScheduleList) {
        this.flightScheduleList = flightScheduleList;
    }

    public Airliner() {
        flights_dir = new FlightDirectory();
        flightScheduleList = new ArrayList<Flights>();
        
    }

    public String getAllianceName() {
        return allianceName;
    }

    public void setAllianceName(String allianceName) {
        this.allianceName = allianceName;
    }
    
    

    public String getAirlinerID() {
        return airlinerID;
    }

    public void setAirlinerID(String airlinerID) {
        this.airlinerID = airlinerID;
    }

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getCustomerCareNumber() {
        return customerCareNumber;
    }

    public void setCustomerCareNumber(int customerCareNumber) {
        this.customerCareNumber = customerCareNumber;
    }

    public String getHeadQuarters() {
        return headQuarters;
    }

    public void setHeadQuarters(String headQuarters) {
        this.headQuarters = headQuarters;
    }
    
    @Override
    public String toString() {
        return airlinerName;
    }
    
    
    
}
