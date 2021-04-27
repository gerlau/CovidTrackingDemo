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
public class SuspendController {

    public SuspendController() {}

    public void suspend(String username, String password, String privilege, String firstName, String lastName) throws IOException {

        HealthOrganization ho = new HealthOrganization();

        ho.suspend(username, password, privilege, firstName, lastName);
    }        
    
    public boolean validate(String username, String password, String privilege, String firstName, String lastName) throws IOException {

        HealthOrganization ho = new HealthOrganization();

        boolean validationIsSuccessful = ho.validate(username, password, privilege, firstName, lastName);

        return validationIsSuccessful;
    }
}
