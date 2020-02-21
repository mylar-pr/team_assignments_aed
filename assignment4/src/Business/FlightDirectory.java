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
public class FlightDirectory {
    
    private ArrayList<Flights> flightDirectory;

    public FlightDirectory() {
        flightDirectory = new ArrayList<Flights>();
        
        
        
    }

    public ArrayList<Flights> getFlightDirectory() {
        return flightDirectory;
    }

    public void setFlightDirectory(ArrayList<Flights> flightDirectory) {
        this.flightDirectory = flightDirectory;
    }
    
    public Flights addFlights(){
        Flights f = new Flights();
        flightDirectory.add(f);
        return f;
    }
    
    public Flights searchFlightByName(String name){
        for(Flights f: flightDirectory){
            if(name.equalsIgnoreCase(f.getFlightName())){
                return f;
            }
        }
        
        return null;
    }
    
    
    public Flights searchFlightByID(String ID){
        for(Flights f: flightDirectory){
            if(ID.equalsIgnoreCase(f.getFlightId())){
                return f;
            }
        }
        
        return null;
    }
    
    public void deleteFlight(Flights f){
        flightDirectory.remove(f);
    }
    
    
    
    
}
