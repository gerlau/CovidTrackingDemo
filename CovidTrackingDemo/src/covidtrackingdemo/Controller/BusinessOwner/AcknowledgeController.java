/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Controller.BusinessOwner;

import covidtrackingdemo.Entity.Alert;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class AcknowledgeController {
    
    public AcknowledgeController() {}
    
    public void acknowledge(ArrayList<String> selectedList) throws IOException {
    
        Alert alert = new Alert();
        
        for (String sel : selectedList) {
        
            String[] data = sel.split(" ");
            
            alert.acknowledge(data[0], data[1], data[5]);
        }
    }
}
