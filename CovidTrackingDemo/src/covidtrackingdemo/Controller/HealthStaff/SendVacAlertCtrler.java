/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Controller.HealthStaff;

import covidtrackingdemo.Entity.HealthStaff;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author barry
 */
public class SendVacAlertCtrler {

    public void sendVacAlert(String puUsername, String alertType, Date vaccinationDate) throws IOException {

        // Convert Vaccination Date to String Type
                
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        String strVaccinationDate = sdf.format(vaccinationDate);
                
        // SendVacAlert

        HealthStaff hs = new HealthStaff();
        
        hs.sendVacAlert(puUsername, alertType, strVaccinationDate);
    }
}
