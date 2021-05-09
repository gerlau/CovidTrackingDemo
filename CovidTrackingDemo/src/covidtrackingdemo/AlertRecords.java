/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author barry
 */
public class AlertRecords {
    
    final String path; 

    public AlertRecords() {
       
        path = "dataset\\AlertRecords.csv";
    }
    
    // * TAKE NOTE HERE
    public void insert(String username, String alertType, String date, Boolean isAcknowledge) throws FileNotFoundException, IOException {
    
        try (BufferedWriter csvWriter = new BufferedWriter(new FileWriter(path, true))) {
            
            String row = username + "," + alertType + "," + date + "," + false;
            
            csvWriter.newLine();
            
            csvWriter.write(row);
            
            csvWriter.close();
        }
    }
}
