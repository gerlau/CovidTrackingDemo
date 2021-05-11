/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Controller.PublicUser;

import covidtrackingdemo.Entity.HealthStaff;
import covidtrackingdemo.Entity.PublicUser;
import covidtrackingdemo.Entity.User;
import java.io.IOException;

/**
 *
 * @author User
 */
public class CheckVaccStatusController {
    
    public CheckVaccStatusController() {}
    
    public Boolean checkVaccStatus(String username) throws IOException {
    
        HealthStaff hs = new HealthStaff();
        
        PublicUser user = hs.showUser(username);
        
        return user.getVaccinationStatus().equals("Y");
    }
}
