/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ContactTracingAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author nitya
 */
public class ContactTracingOrganization extends Organization {
      public ContactTracingOrganization() {
        super(Organization.Type.ContactTracing.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ContactTracingAdminRole());
        return roles;
    }
    
}
