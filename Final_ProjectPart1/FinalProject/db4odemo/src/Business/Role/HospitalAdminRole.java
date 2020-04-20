/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.HospitalOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.AdministrativeRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.HospitalAdminRole.HospitalAdminWorkAreaJPanel;

/**
 *
 * @author paipr
 */
public class HospitalAdminRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization,Enterprise enterprise,EcoSystem system ) {
        return new HospitalAdminWorkAreaJPanel(userProcessContainer, userAccount, (HospitalOrganization)organization, enterprise,system);
        
      
    }
    
}
