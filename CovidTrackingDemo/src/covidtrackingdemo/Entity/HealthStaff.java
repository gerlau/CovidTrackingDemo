/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Entity;

import covidtrackingdemo.DemoDatabase;
import covidtrackingdemo.HealthRecords;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class HealthStaff extends User {
    
    public HealthStaff() {}
    
    public void showUser() {}
    
    public void update() {}
    
    public ArrayList<User> display() throws IOException {
        
        HealthRecords hr = new HealthRecords();
        
        ArrayList<User> userList = hr.select();
        
        return userList;
    }
}
