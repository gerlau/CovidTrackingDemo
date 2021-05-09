/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Controller.HealthStaff;

import covidtrackingdemo.Entity.Alert;
import covidtrackingdemo.Entity.HealthStaff;
import covidtrackingdemo.Entity.PublicUser;
import covidtrackingdemo.Entity.Visit;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Set;

/**
 *
 * @author barry
 */
public class SendExpAlertCtrler {
    
    public SendExpAlertCtrler() {}
    
    public Set<String> sendExpAlert(String currentDate) throws IOException, ParseException {
        
        // HealthRecords
        HealthStaff hs = new HealthStaff();
        ArrayList<String> infectedList = hs.findInfected(currentDate);
        
        // Vists
        Visit vist = new Visit();
        Set<String> exposedList = vist.findExposed(infectedList, currentDate);
        
        // Alerts
        Alert alert = new Alert();
        alert.sendExpAlert(exposedList, currentDate);
        
        return exposedList;
    }
}
