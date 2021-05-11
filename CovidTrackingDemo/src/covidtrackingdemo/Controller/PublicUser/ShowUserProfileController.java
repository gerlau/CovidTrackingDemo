/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Controller.PublicUser;

import covidtrackingdemo.Entity.HealthOrganization;
import covidtrackingdemo.Entity.PublicUser;
import covidtrackingdemo.Entity.User;
import java.io.IOException;

/**
 *
 * @author User
 */
public class ShowUserProfileController {
    
    public ShowUserProfileController() {}
    
    public User getUserProfile(String accName) throws IOException {
        
        HealthOrganization ho = new HealthOrganization();
        
        return ho.display(accName);
    }
}
