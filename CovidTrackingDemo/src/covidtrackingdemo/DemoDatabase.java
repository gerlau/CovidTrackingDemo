/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo;

import covidtrackingdemo.Entity.User;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class DemoDatabase {

    /**
     * @param args the command line arguments
     */
     
    final String path; 
    
    public DemoDatabase() {
       
        path = "C:\\Users\\User\\Downloads\\covid_dataset.xlsx - covid_dataset.csv";
    }
    
    // Insert 
    public void insert(String username, String password, String privilege, String fname, String lname, String email) throws FileNotFoundException, IOException {
        
        // Insert validations here
        
        try (BufferedWriter csvWriter = new BufferedWriter(new FileWriter(path, true))) {
            
            String row = username + "," + password + "," + privilege + "," + fname + "," + lname + "," + email;
            
            csvWriter.newLine();
            
            csvWriter.write(row);
            
            csvWriter.close();
        }
    }
    
    // Update
    public void update(String username, String password, String privilege, String fname, String lname, String email) throws FileNotFoundException, IOException {
        
        String newData = "";
    
        try (BufferedReader csvReader = new BufferedReader(new FileReader(path))) {
            
            newData = csvReader.readLine();
            
            String row;
            
            while ((row = csvReader.readLine()) != null) {
                
                String[] data = row.split(",");
                
                if (username.equals(data[0])) {
                
                    row = username + "," + password + "," + privilege + "," + fname + "," + lname + "," + email;
                }

                newData = newData + "\n" + row;
            }
            
            csvReader.close();
        }
        
        try (BufferedWriter csvWriter = new BufferedWriter(new FileWriter(path))) {
               
            csvWriter.write(newData);
            
            csvWriter.close();
        }
    }
   
    // Delete
    public void delete() {}
    
    // Select - individual
    public User select(String username, String password) throws IOException {
        
        try (BufferedReader csvReader = new BufferedReader(new FileReader(path))) {
            
            csvReader.readLine();
            
            String row;
            
            while ((row = csvReader.readLine()) != null) {
                
                String[] data = row.split(",");
                
                if (username.equals(data[0]) && password.equals(data[1])){
                    
                    User user = new User();
                    
                    user.setUsername(data[0]);
                    user.setPassword(data[1]);
                    user.setPrivilege(data[2]); 
                    user.setFirstName(data[3]); 
                    user.setLastName(data[4]);
                    user.setEmail(data[5]); 
                    
                    return user;
                } 
            }
            
            csvReader.close();
        }
         
        return null;
    }
    
    // Select - all
    public ArrayList<User> select() throws FileNotFoundException, IOException {
                
        ArrayList<User> userList;
        
        try (BufferedReader csvReader = new BufferedReader(new FileReader(path))) {
            
            userList = new ArrayList<>();
            
            csvReader.readLine();
            
            String row;
            while ((row = csvReader.readLine()) != null) {
                
                String[] data = row.split(",");
                
                User user = new User();
                
                user.setUsername(data[0]);
                user.setPassword(data[1]);
                user.setPrivilege(data[2]);
                user.setFirstName(data[3]);
                user.setLastName(data[4]);
                user.setEmail(data[5]);
                
                userList.add(user);
            }
            
            csvReader.close();
        }
      
        return userList; 
    }
}
