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
public class UpdateInfStatusCtrler {

    public UpdateInfStatusCtrler() {}
    
    public int update(String hsUsername, String puUsername, String vacStats, Date vaccinationDate, String infStats, Date infectionDate) throws IOException {
   
        HealthStaff hs = new HealthStaff();

        String strInfectionDate = validateDate(infectionDate);

        // Update occurs when date is valid 
        
        if (!strInfectionDate.equals("")) {
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
            String strVaccinationDate = sdf.format(vaccinationDate);

            hs.update(hsUsername, puUsername, vacStats, strVaccinationDate, infStats, strInfectionDate);
            
            return 0;
        }
            
        else {

            return 1;  
        } 
    }
    
    private String validateDate(Date vaccinationDate) throws IOException {

        Date dateDate = vaccinationDate;
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        String strDate = sdf.format(dateDate);
        
        if (!strDate.equals(sdf.format(dateDate))) {
            return ""; 
        }
        
        else {
            return strDate;
        } 
    }
}
