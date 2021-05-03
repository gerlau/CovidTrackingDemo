/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Entity;

/**
 *
 * @author barry
 */
public class PublicUser extends User {
    
    private String vaccinatedBy;
    private String vaccinationStatus;
    private String vaccinatedDate;
    private String determinedBy;
    private String infectionStatus;
    private String infectedDate;

    public PublicUser() {
    }
    
    // Accessor Methods
    public String getVaccinatedBy() { return vaccinatedBy; }
    public String getVaccinationStatus() { return vaccinationStatus; }
    public String getVaccinatedDate() { return vaccinatedDate; }
    public String getDeterminedBy() { return determinedBy; }
    public String getInfectionStatus() { return infectionStatus; }
    public String getInfectedDate() { return infectedDate; }

    // Mutator Methods
    public void setVaccinatedBy(String vaccinatedBy) { this.vaccinatedBy = vaccinatedBy; }
    public void setVaccinationStatus(String vaccinationStatus) { this.vaccinationStatus = vaccinationStatus; }
    public void setVaccinatedDate(String vaccinatedDate) { this.vaccinatedDate = vaccinatedDate; }
    public void setDeterminedBy(String determinedBy) { this.determinedBy = determinedBy; }
    public void setInfectionStatus(String infectionStatus) { this.infectionStatus = infectionStatus; }
    public void setInfectedDate(String infectedDate) { this.infectedDate = infectedDate; }
    
}
