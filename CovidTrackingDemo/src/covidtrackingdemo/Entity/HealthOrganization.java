/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Entity;

import covidtrackingdemo.DemoDatabase;
import java.io.IOException;
import java.util.ArrayList;

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
    
    public ArrayList<User> display() throws IOException {
    
        DemoDatabase db = new DemoDatabase();
        
        ArrayList<User> userList = db.select();
        
        return userList;
    }
}
