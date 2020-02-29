/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author paipr
 */
public class TravelAgency {

    
    private String TravelAgencyName;
    private String TravelAgencyID;
    private String emailID;
    private String password;
    
    
    public String getTravelAgencyName() {
        return TravelAgencyName;
    }

    public void setTravelAgencyName(String TravelAgencyName) {
        this.TravelAgencyName = TravelAgencyName;
    }

    public String getTravelAgencyID() {
        return TravelAgencyID;
    }

    public void setTravelAgencyID(String TravelAgencyID) {
        this.TravelAgencyID = TravelAgencyID;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
    
    public boolean verify(String password){
        if(password.equals(getPassword()))
            return true;
        return false;
    }
    
     @Override
    public String toString()
    {
        return emailID;
    }
    
}
