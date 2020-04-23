/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DeliveryManRole;
import Business.Role.Role;
import Business.Role.StoreManagerRole;
import java.util.ArrayList;

/**
 *
 * @author prajw
 */
public class DeliveryOrganization extends Organization{

    public DeliveryOrganization() {
        super(Organization.Type.Delivery.getValue());
    }
// change needed below.
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DeliveryManRole());
        return roles;
    }
}