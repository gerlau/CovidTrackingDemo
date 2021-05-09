/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Entity;

import covidtrackingdemo.VisitRecords;
import java.io.IOException;
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
    public Set<String> findExposed(ArrayList<String> infectedList, String currentDate) throws IOException {
        
        Set<String> exposedList = new HashSet<>();
        
        VisitRecords vr = new VisitRecords();
        ArrayList<Visit> visitorList = vr.select();
        
        for (Visit visit : visitorList) {
            
            String visitor = visit.getPublicUser();
            String dateOfVisit = visit.getVisitedDate();
            
            if (infectedList.contains(visitor) && currentDate.equals(dateOfVisit)) {
            
                exposedList.add(visit.getBusinessOwner());
            }
        }
        
        for (Visit visit : visitorList) {
           
            String owner = visit.getBusinessOwner();
            String visitor = visit.getPublicUser();
            String dateOfVisit = visit.getVisitedDate();
            
            if ((exposedList.contains(owner) && currentDate.equals(dateOfVisit)) && !infectedList.contains(visitor)) {
            
                exposedList.add(visitor);
            }
        }
        
        return exposedList;
    }
}
