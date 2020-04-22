/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplies;

import Business.Supplies.Groceries;
import java.util.ArrayList;
import userinterface.GroceryStoreManagerRole.AddGroceryJPanel;
import userinterface.MainJFrame;

/**
 *
 * @author prajw
 */
public class GroceriesDirectory {
    private ArrayList<Groceries> groceriesDirectory ;
//    private GroceriesDirectory groceries_Di;
    MainJFrame main;
    AddGroceryJPanel addGroceries;
    
    public GroceriesDirectory(){
        groceriesDirectory = new ArrayList<Groceries>();
//        System.out.println("inside GroceriesDir constructor");
//        System.out.println(groceriesDirectory);
    }

    public ArrayList<Groceries> getGroceries_Directory() {
        System.out.println("inside grocery dir get");
        return groceriesDirectory;
    }

    public void setGroceriesDirectory(ArrayList<Groceries> groceriesDirectory) {
        this.groceriesDirectory = groceriesDirectory;
    }


    public void add( String name, String price, String description) {
        Groceries item = new Groceries(name,price,description);
        groceriesDirectory.add(item);
    }
    
    public Groceries getItem(String itemName){
        for(Groceries item: groceriesDirectory){
            if(item.getProductName().equalsIgnoreCase(itemName)){
                return item;
            }
        }
        return null;
       
    }

    public boolean checkIfNameIsUnique(String name){
        for (Groceries ua : groceriesDirectory){
            if (ua.getProductName().equals(name))
                return false;
        }
        return true;
    }
    
    public GroceriesDirectory getGroceriesDirectory() {
        GroceriesDirectory gd = main.getGDir();
        return gd;
    }
//    public void updateFoodItem( String name, String description, Double price) {
//        for(Groceries item: groceriesDirectory){
//            if(item.getItemId().equalsIgnoreCase(itemId)){
//                item.setItemName(name);
//                item.setDescription(description);
//                item.setPrice(price);
//                item.setPhoto(img);
//            }
//        }
//    }
//    
//    public void deleteItem(String id){
//        for(int i =0; i< menuDirectory.size();i++){
//            if(menuDirectory.get(i).getItemId().equalsIgnoreCase(id)){
//                menuDirectory.remove(i);
//            }
//        }
//    }
//    
//    public FoodItem getFoodItemByIndex(int index){
//        return menuDirectory.get(index);
//    }
}