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
public class DeliveryMan {
    
    private String deliveryManName;
    private String phoneNumber;
    private String age;

    public DeliveryMan(String deliveryManName, String phoneNumber, String age) {
        this.deliveryManName = deliveryManName;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    
    
    public String getDeliveryManName() {
        return deliveryManName;
    }

    public void setDeliveryManName(String deliveryManName) {
        this.deliveryManName = deliveryManName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
    @Override
    public String toString(){
        return deliveryManName;
    }
    
}
