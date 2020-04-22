/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
//import userinterface.LabAssistantRole.LabAssistantWorkAreaJPanel;
import Business.Organization.PharmacyOrganization;
import javax.swing.JPanel;
import userinterface.PharmacistRole.PharmacistWorkJPanel;
import userinterface.PharmacistRole.PharmacistManagementJPanel;
//import userinterface.PharmacistRole.PharmacistWorkJPanel;

/**
 *
 * @author raunak
 */
public class PharmacistRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PharmacistManagementJPanel(userProcessContainer, account, organization, business);
    }
    
}
