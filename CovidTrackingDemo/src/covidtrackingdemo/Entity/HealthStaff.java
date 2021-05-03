/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Entity;

/**
 *
 * @author User
 */
public class HealthStaff extends User {
    
    public HealthStaff() {}
    
    public void showUser() {}
    
    public void update() {}
    
<<<<<<< Updated upstream
    public void display() {}
=======
    public ArrayList<PublicUser> display() throws IOException {
        
        HealthRecords hr = new HealthRecords();
        
        ArrayList<PublicUser> userList = hr.select();
        
        return userList;
    }
>>>>>>> Stashed changes
}
