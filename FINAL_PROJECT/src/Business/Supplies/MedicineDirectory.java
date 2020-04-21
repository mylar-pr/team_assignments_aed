/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplies;

import java.util.ArrayList;
import userinterface.GroceryStoreManagerRole.AddGroceryJPanel;
import userinterface.MainJFrame;

/**
 *
 * @author prajw
 */
public class MedicineDirectory {
    
    private ArrayList<Medicine> medicineDirectory ;
//    private GroceriesDirectory groceries_Di;
    MainJFrame main;
    AddGroceryJPanel addGroceries;
    
    public MedicineDirectory(){
        medicineDirectory = new ArrayList<Medicine>();
//        System.out.println("inside GroceriesDir constructor");
//        System.out.println(groceriesDirectory);
    }

    public ArrayList<Medicine> getMedicine_Directory() {
        System.out.println("inside grocery dir get");
        return medicineDirectory;
    }

    public void setMedicineDirectory(ArrayList<Medicine> medicineDirectory) {
        this.medicineDirectory = medicineDirectory;
    }


    public void add(String name, String price, String manufaturer) {
        Medicine item = new Medicine(name,price,manufaturer);
        medicineDirectory.add(item);
        System.out.println(medicineDirectory);
    }
    
    public Medicine getItem(String itemName){
        for(Medicine item: medicineDirectory){
            if(item.getMedName().equalsIgnoreCase(itemName)){
                return item;
            }
        }
        return null;
       
    }
    
    public boolean checkIfNameIsUnique(String name){
        for (Medicine ua : medicineDirectory){
            if (ua.getMedName().equals(name))
                return false;
        }
        return true;
    }

    public MedicineDirectory getMedicineDirectory() {
        MedicineDirectory md = main.getMDir();
        return md;
    }
    
}
