/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Controller.HealthStaff;

import covidtrackingdemo.Entity.HealthOrganization;
import covidtrackingdemo.Entity.HealthStaff;
import covidtrackingdemo.Entity.User;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author barry
 */
public class DisplayController {
    
    public DisplayController() {}
    
    public ArrayList<User> display() throws IOException {
    
        HealthStaff hs = new HealthStaff();
        
        return hs.display();
    }
}
