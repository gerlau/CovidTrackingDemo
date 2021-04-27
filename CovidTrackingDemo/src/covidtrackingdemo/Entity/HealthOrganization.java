/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Entity;

import covidtrackingdemo.DemoDatabase;
import java.io.IOException;
import javax.swing.JOptionPane;

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
    
    public boolean validate(String username, String password, String privilege, String firstName, String lastName) throws IOException {

        String regex_password = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()+=])(?=\\S+$).{8,}$";

        //Validate empty fields
        if (username.equals("") || password.equals("") || firstName.equals("") || lastName.equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill in all fields");
            return false; 
        }

        //Validate password
        else if (!password.matches(regex_password)) {
            JOptionPane.showMessageDialog(null, "Please enter a stronger password");
            return false;
        }

        //Validate email
        else if (!username.contains("@")) {
            JOptionPane.showMessageDialog(null, "Please enter a valid email");   
            return false;
        }

        else 
            return true;
    }
}
