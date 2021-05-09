/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Entity;

import covidtrackingdemo.AlertRecords;
import covidtrackingdemo.HealthRecords;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author User
 */
public class HealthStaff extends User {
    
    public HealthStaff() {}
    
    public void showUser() {}
    
    public void update() {}
    
    public ArrayList<PublicUser> display() throws IOException {
        
        HealthRecords hr = new HealthRecords();
        
        ArrayList<PublicUser> userList = hr.select();
        
        return userList;
    }

    public void update(String hsUsername, String puUsername, String vacStats, String strVaccinationDate, String infStats, String strInfectionDate) throws IOException {
        
        HealthRecords hr = new HealthRecords();
        
        hr.update(hsUsername, puUsername, vacStats, strVaccinationDate, infStats, strInfectionDate);    
    }

    public void sendVacAlert(String puUsername, String alertType, String strVaccinationDate) throws IOException {

        AlertRecords ar = new AlertRecords();
        
        ar.sendVacAlert(puUsername, alertType, strVaccinationDate);
    }
    
    public void sendInfAlert(String puUsername, String alertType, String strInfectionDate) throws IOException {

        AlertRecords ar = new AlertRecords();
        
        ar.sendVacAlert(puUsername, alertType, strInfectionDate);
    }
}
