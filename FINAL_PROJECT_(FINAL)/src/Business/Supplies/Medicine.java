/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplies;

/**
 *
 * @author prajw
 */
//public class Medicine {
//    
//}
public class Medicine {
    
    private String medName;
    private String medPrice;
    private String medManufacturer;

    public Medicine(String medName, String medPrice, String medManufacturer) {
        this.medName = medName;
        this.medPrice = medPrice;
        this.medManufacturer = medManufacturer;
    }

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    public String getMedPrice() {
        return medPrice;
    }

    public void setMedPrice(String medPrice) {
        this.medPrice = medPrice;
    }

    public String getMedManufacturer() {
        return medManufacturer;
    }

    public void setMedManufacturer(String medManufacturer) {
        this.medManufacturer = medManufacturer;
    }
    
    

    
    
    @Override
    public String toString(){
        return medName;
    }
    
}
