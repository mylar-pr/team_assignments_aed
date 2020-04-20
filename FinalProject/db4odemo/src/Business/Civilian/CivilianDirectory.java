/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Civilian;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;
import userinterface.MainJFrame;
/**
 *
 * @author paipr
 */
public class CivilianDirectory {
   private ArrayList<Civilian> civilianDirectory;
   MainJFrame main;
   
   public CivilianDirectory() {
        civilianDirectory = new ArrayList<Civilian>();
    }

    public ArrayList<Civilian> getCivilianList() {
        return civilianDirectory;
    }

    public void setCivilianList(ArrayList<Civilian> customerList) {
        this.civilianDirectory = customerList;
    }
     public CivilianDirectory getCivilianDirectory() {
        CivilianDirectory cd = main.getDir();
        return cd;
    }
    
    public Civilian createCivilian(String firstName, String lastName, String age, String sex, UserAccount userAccount, String username){
        Civilian c = new Civilian();
        c.setFirstName(firstName);
        c.setLastName(lastName);
        c.setAge(age);
        c.setSex(sex);
        c.setUsername(username);
//        c.setUserAccount(userAccount);
        civilianDirectory.add(c);  
        return c;
    } 
    
}
