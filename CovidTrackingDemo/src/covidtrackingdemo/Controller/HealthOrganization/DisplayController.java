/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Controller.HealthOrganization;

import covidtrackingdemo.Entity.HealthOrganization;
import covidtrackingdemo.Entity.User;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class DisplayController {
    
    public DisplayController() {}
    
    public ArrayList<User> display() throws IOException {
    
        HealthOrganization ho = new HealthOrganization();
        
        return ho.display();
    }
}
