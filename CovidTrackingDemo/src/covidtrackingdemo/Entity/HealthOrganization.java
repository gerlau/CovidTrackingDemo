/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Entity;

import covidtrackingdemo.DemoDatabase;
import java.io.IOException;

/**
 *
 * @author barry
 */
public class HealthOrganization extends User {

    public HealthOrganization() {}

    public void create(String username, String password, String privilege, String firstName, String lastName) throws IOException {
                
        DemoDatabase db = new DemoDatabase();
        
        db.insert(username, password, privilege, firstName, lastName);
    }    
    
    public void update(String username, String password, String privilege, String firstName, String lastName) throws IOException {
                
        DemoDatabase db = new DemoDatabase();
        
        db.update(username, password, privilege, firstName, lastName);
    }
    
    public void suspend(String username, String password, String privilege, String firstName, String lastName) throws IOException {
    
        DemoDatabase db = new DemoDatabase();
        
        db.update(username, password, privilege, firstName, lastName);
    }
}
