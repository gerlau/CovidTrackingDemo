/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Controller.BusinessOwner;

import covidtrackingdemo.Entity.Visit;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 *
 * @author User
 */
public class DisplayController {
    
    public DisplayController() {}
    
    public ArrayList<Visit> display(java.util.Date date) throws IOException, ParseException {
        
        Visit visit = new Visit();
        ArrayList<Visit> visitorList = visit.display();
        
        Iterator itr = visitorList.iterator();
        
        while (itr.hasNext()) {
            
            Visit v = (Visit) itr.next();
            
            Date visitDate = new SimpleDateFormat("dd/MM/yyyy").parse(v.getVisitedDate());
            
            if (!visitDate.equals(date)) {
                
                itr.remove();
            }            
        }

        return visitorList;
    }
}
