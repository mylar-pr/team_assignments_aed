/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author raunak
 */
public class MedicineWorkRequest extends WorkRequest{
    
    private String testResult;
    private String medName;
    private String medPrice;
    private int quantity;

    public String getMedName() {
        return medName;
    }

    public void setMedName(String productName) {
        this.medName = productName;
    }

    public String getMedPrice() {
        return medPrice;
    }

    public void setMedPrice(String productPrice) {
        this.medPrice = productPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
    
}
