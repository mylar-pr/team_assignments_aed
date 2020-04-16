/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Civilian;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;
import userinterface.MainJFrame;
/**
 *
 * @author paipr
 */
public class CivilianDirectory {
    UserAccountDirectory account;
    private ArrayList<Civilian> civilianDirectory; 
    MainJFrame main;

    public CivilianDirectory(){
      civilianDirectory = new ArrayList<Civilian>();
    }

    public ArrayList<Civilian> getCivilianDirectory() {
        return civilianDirectory;
    }

    public void setCivilianDirectory(ArrayList<Civilian> civilianDirectory) {
        this.civilianDirectory = civilianDirectory;
    }
    
     public Civilian addCivilian()
    {
        Civilian c = new Civilian();
        civilianDirectory.add(c);
        return c;
    }
//     public CivilianDirectory getCivilianDirectory() {
//        CivilianDirectory cd = main.getDir();
//        return vd;
//    }
    
    
}
