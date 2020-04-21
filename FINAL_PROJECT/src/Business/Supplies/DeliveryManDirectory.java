/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplies;

import java.util.ArrayList;
import userinterface.DeliveryManRole.AddDeliveryMenJPanel;
import userinterface.MainJFrame;

/**
 *
 * @author prajw
 */
public class DeliveryManDirectory {
    private ArrayList<DeliveryMan> deliveryManDirectory;
    MainJFrame main;
    AddDeliveryMenJPanel addDeliveryMan;
    
    public DeliveryManDirectory(){
        deliveryManDirectory = new ArrayList<DeliveryMan>();

    }

    public DeliveryManDirectory(ArrayList<DeliveryMan> deliveryManDirectory) {
        deliveryManDirectory = new ArrayList<DeliveryMan>();;
    }
    
    public ArrayList<DeliveryMan> getDeliveryMan_Directory() {
        System.out.println("inside grocery dir get");
        return deliveryManDirectory;
    }
    
    public void setDeliveryManDirectory(ArrayList<DeliveryMan> deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }


    public void add( String name, String price, String description) {
        DeliveryMan item = new DeliveryMan(name,price,description);
        deliveryManDirectory.add(item);
    }
    
    
    public void deleteItem(DeliveryMan dMan){
        deliveryManDirectory.remove(dMan);
    }
    public DeliveryMan getItem(String Name){
        for(DeliveryMan item: deliveryManDirectory){
            if(item.getDeliveryManName().equalsIgnoreCase(Name)){
                return item;
            }
        }
        return null;
       
    }
    
    public boolean isPhoneUnique(String phoneNum){
        for(DeliveryMan dMan: deliveryManDirectory){
            if(dMan.getPhoneNumber().equalsIgnoreCase(phoneNum)){
                return false;
            }
        }
        return true;
    }

    public DeliveryManDirectory getDeliveryManDirectory() {
        DeliveryManDirectory dmd = main.getDDir();
        return dmd;
    }
    
    
    
}
