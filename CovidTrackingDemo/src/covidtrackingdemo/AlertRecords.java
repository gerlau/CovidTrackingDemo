/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author barry
 */
public class AlertRecords {
    
    final String path; 

    public AlertRecords() {
       
        path = "dataset\\AlertRecords.csv";
    }

    public void sendVacAlert(String puUsername, String alertType, String strVaccinationDate) throws FileNotFoundException, IOException {
        
        try (BufferedWriter csvWriter = new BufferedWriter(new FileWriter(path, true))) {
            
            String row = puUsername + "," + alertType + "," + strVaccinationDate + "," + 1 + "," + "No";
            
            csvWriter.newLine();
            
            csvWriter.write(row);
            
            csvWriter.close();
        }
    }
    
    public void sendInfAlert(String puUsername, String alertType, String strInfectionDate) throws FileNotFoundException, IOException {
        
        try (BufferedWriter csvWriter = new BufferedWriter(new FileWriter(path, true))) {
            
            String row = puUsername + "," + alertType + "," + strInfectionDate + "," + 1 + "," + "No";
            
            csvWriter.newLine();
            
            csvWriter.write(row);
            
            csvWriter.close();
        }
    }
}
