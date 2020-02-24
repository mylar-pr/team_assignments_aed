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
 * @author Mahesh
 */
public class TravelAgencyDirectory {
 private List<TravelAgency> travelAgencyList;
    public List<TravelAgency> getTravelAgencyList() {
        return travelAgencyList;
    }

    public void setTravelAgencyList(List<TravelAgency> travelAgencyList) {
        this.travelAgencyList = travelAgencyList;
    }
     
    
    public TravelAgencyDirectory(){
        travelAgencyList = new ArrayList<>();
    }
     public TravelAgency addTravelAgency(){
    TravelAgency ta = new TravelAgency();
    travelAgencyList.add(ta);
    return ta;
 }

  
}
