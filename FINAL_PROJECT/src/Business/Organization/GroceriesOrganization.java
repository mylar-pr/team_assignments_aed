/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.LabAssistantRole;
import Business.Role.Role;
import Business.Role.StoreManagerRole;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class GroceriesOrganization extends Organization{

    public GroceriesOrganization() {
        super(Organization.Type.Groceries.getValue());
    }
// change needed below.
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new StoreManagerRole());
        return roles;
    }
     
   
    
    
}
