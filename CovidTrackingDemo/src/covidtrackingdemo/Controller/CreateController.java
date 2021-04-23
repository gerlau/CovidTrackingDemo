/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Controller;

import covidtrackingdemo.Entity.HealthOrganization;
import java.io.IOException;

/**
 *
 * @author barry
 */
public class CreateController {
    
    public CreateController() {}

    public void create(String username, String password, String privilege, String fname, String lname) throws IOException {

            HealthOrganization ho = new HealthOrganization();
            
            ho.create(username, password, privilege, fname, lname);
    }
}
