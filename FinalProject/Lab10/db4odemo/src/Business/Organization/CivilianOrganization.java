/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CivilianRole;
import Business.Role.Role;
import java.util.ArrayList;


/**
 *
 * @author paipr
 */
public class CivilianOrganization extends Organization {
    public CivilianOrganization() {
        super(Organization.Type.Civilian.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CivilianRole());
        return roles;
    }
}
