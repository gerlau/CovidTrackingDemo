/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Controller.BusinessOwner;

import covidtrackingdemo.Entity.Alert;
import covidtrackingdemo.Entity.Visit;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 *
 * @author User
 */
public class ShowAlertController {
    
    public ShowAlertController() {}
    
    public ArrayList<String> showAlert(String accName) throws IOException {
                
        ArrayList<String> exposedDates = new ArrayList<>();
        
        Alert alert = new Alert();
        
        ArrayList<Alert> alertList = alert.showAlert();
        
        for (Alert a : alertList) {
            
            if (accName.equals(a.getUsername())) {
                
                exposedDates.add(a.getAlertDate());
            }            
        }
        
        return exposedDates;
    }
}
