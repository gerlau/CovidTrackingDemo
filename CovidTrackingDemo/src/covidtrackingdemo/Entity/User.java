/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Entity;

import covidtrackingdemo.DemoDatabase;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author User
 */
public class User {
    
    private String username;
    private String password;
    private String privilege;
    private String firstName;
    private String lastName;
    
    private String vaccinatedBy;
    private String vaccinationStatus;
    private String vaccinatedDate;
    private String determinedBy;
    private String infectionStatus;
    private String infectedDate;
    
    public User(){}
    
    // Accessor Methods
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getPrivilege() { return privilege; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    
    public String getVaccinatedBy() { return vaccinatedBy; }
    public String getVaccinationStatus() { return vaccinationStatus; }
    public String getVaccinatedDate() { return vaccinatedDate; }
    public String getDeterminedBy() { return determinedBy; }
    public String getInfectionStatus() { return infectionStatus; }
    public String getInfectedDate() { return infectedDate; }
   
    // Mutator Methods
    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; } 
    public void setPrivilege(String privilege) { this.privilege = privilege; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
         
    public void setVaccinatedBy(String vaccinatedBy) { this.vaccinatedBy = vaccinatedBy; }
    public void setVaccinationStatus(String vaccinationStatus) { this.vaccinationStatus = vaccinationStatus; }
    public void setVaccinatedDate(String vaccinatedDate) { this.vaccinatedDate = vaccinatedDate; }
    public void setDeterminedBy(String determinedBy) { this.determinedBy = determinedBy; }
    public void setInfectionStatus(String infectionStatus) { this.infectionStatus = infectionStatus; }
    public void setInfectedDate(String infectedDate) { this.infectedDate = infectedDate; }
    
    public String login(String username, String password) throws FileNotFoundException, IOException {
                
        DemoDatabase db = new DemoDatabase();
        
        User user = db.select(username, password);
        
        if (user == null) { 
            return ""; 
        }
        else { 
            return user.getPrivilege(); 
        }
    }
    
    // public String toString() {}
}
