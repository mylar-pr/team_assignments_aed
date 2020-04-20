/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ContactTracingOrganization;
import Business.Organization.HospitalOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.ContactTracingAdminRole.ContactTracingWorkAreaJPanel;
import userinterface.HospitalAdminRole.RequestTestWorkAreaJPanel;

/**
 *
 * @author nitya
 */
public class ContactTracerRole extends Role {
        @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ContactTracingWorkAreaJPanel(userProcessContainer, account, (ContactTracingOrganization)organization, enterprise, business);
    }
    
    
}
