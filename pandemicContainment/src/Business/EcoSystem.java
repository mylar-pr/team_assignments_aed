/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Civilian.CivilianDirectory;
import Business.Supplies.GroceriesDirectory;
import Business.Supplies.DeliveryManDirectory;
import Business.Supplies.MedicineDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private CivilianDirectory cd;
    private UserAccountDirectory user_dir;
    private MedicineDirectory mD;
    private GroceriesDirectory gD;
    private DeliveryManDirectory dmd;
    
     private EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
//        cd = new CivilianDirectory();

    }
     
    public EcoSystem(GroceriesDirectory gD, MedicineDirectory mD, CivilianDirectory cd, DeliveryManDirectory dmd) {
        super(null);
   
        this.gD = gD;
        this.cd = cd;
        this.mD = mD;
        this.dmd = dmd;
    }

    public MedicineDirectory getmD() {
        return mD;
    }

    public void setmD(MedicineDirectory mD) {
        this.mD = mD;
    }

    public GroceriesDirectory getgD() {
        return gD;
    }

    public void setgD(GroceriesDirectory gD) {
        this.gD = gD;
    }

    public DeliveryManDirectory getDmd() {
        return dmd;
    }

    public void setDmd(DeliveryManDirectory dmd) {
        this.dmd = dmd;
    }
    
    
    
    public CivilianDirectory getCd() {
        return cd;
    }

    public void setCd(CivilianDirectory cd) {
        this.cd = cd;
    }

    public UserAccountDirectory getUser_dir() {
        return user_dir;
    }

    public void setUser_dir(UserAccountDirectory user_dir) {
        this.user_dir = user_dir;
    }
    
    
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
   

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }
}
