/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Entity;

import covidtrackingdemo.VisitRecords;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author User
 */
public class Visit {
    
    private String businessOwner;
    private String publicUser;
    private String visitedDate;
    
    public Visit() {}
    
    // Accessor Methods
    public String getBusinessOwner() { 
        return this.businessOwner; 
    }
    public String getPublicUser() { 
        return this.publicUser; 
    }
    public String getVisitedDate() { 
        return this.visitedDate; 
    }
    
    // Mutator Methods
    public void setBusinessOwner(String businessOwner) { 
        this.businessOwner = businessOwner; 
    }
    public void setPublicUser(String publicUser) {
        this.publicUser = publicUser;
    }
    public void setVisitedDate(String visitedDate) {
        this.visitedDate = visitedDate;
    }
    
    // Other Methods
    public void checkIn(String businessOwner, String publicUser, String date) throws IOException {
    
        VisitRecords vr = new VisitRecords();
        
        vr.insert(businessOwner, publicUser, date);
    }
    
    public ArrayList<Visit> display() throws IOException {
        
        VisitRecords vr = new VisitRecords();
        
        return vr.select();
    } 
    
    public Set<String> findExposed(ArrayList<String> infectedList, LocalDate startDate) throws IOException {
        
        Set<String> exposedList = new HashSet<>();
        
        VisitRecords vr = new VisitRecords();
        ArrayList<Visit> visitorList = vr.select();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dateOfVisit;
        Boolean startofIP;
        Boolean duringIP;
        Boolean endofIP;
        Boolean infectionPeriod;
        
        for (Visit visit : visitorList) {
            
            String visitor = visit.getPublicUser();  
            
            dateOfVisit = LocalDate.parse(visit.getVisitedDate(), formatter);
            startofIP = dateOfVisit.isEqual(startDate);
            duringIP = dateOfVisit.isAfter(startDate);
            endofIP = dateOfVisit.isBefore(startDate.plusDays(3)); 
            
            infectionPeriod = startofIP || (duringIP && endofIP);
                        
            if (infectedList.contains(visitor) && infectionPeriod) {
            
                exposedList.add(visit.getBusinessOwner());
            }
        }
        
        for (Visit visit : visitorList) {
           
            String owner = visit.getBusinessOwner();
            String visitor = visit.getPublicUser();
            
            dateOfVisit = LocalDate.parse(visit.getVisitedDate(), formatter);
            startofIP = dateOfVisit.isEqual(startDate);
            duringIP = dateOfVisit.isAfter(startDate);
            endofIP = dateOfVisit.isBefore(startDate.plusDays(3));
            
            infectionPeriod = startofIP || (duringIP && endofIP);
            
            if ((exposedList.contains(owner) && infectionPeriod) && !infectedList.contains(visitor)) {
            
                exposedList.add(visitor);
            }
        }
        
        return exposedList;
    }
}
