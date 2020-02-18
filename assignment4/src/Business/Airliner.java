 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

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

    public Airliner() {
        
        
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
    
    
    
}
