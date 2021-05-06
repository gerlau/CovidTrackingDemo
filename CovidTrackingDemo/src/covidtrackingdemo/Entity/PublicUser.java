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
    private String vaccinationDate;
    private String determinedBy;
    private String infectionStatus;
    private String infectionDate;

    public PublicUser() {
    }
    
    // Accessor Methods
    public String getVaccinatedBy() { return vaccinatedBy; }
    public String getVaccinationStatus() { return vaccinationStatus; }
    public String getVaccinationDate() { return vaccinationDate; }
    public String getDeterminedBy() { return determinedBy; }
    public String getInfectionStatus() { return infectionStatus; }
    public String getInfectionDate() { return infectionDate; }

    // Mutator Methods
    public void setVaccinatedBy(String vaccinatedBy) { this.vaccinatedBy = vaccinatedBy; }
    public void setVaccinationStatus(String vaccinationStatus) { this.vaccinationStatus = vaccinationStatus; }
    public void setVaccinationDate(String vaccinationDate) { this.vaccinationDate = vaccinationDate; }
    public void setDeterminedBy(String determinedBy) { this.determinedBy = determinedBy; }
    public void setInfectionStatus(String infectionStatus) { this.infectionStatus = infectionStatus; }
    public void setInfectionDate(String infectionDate) { this.infectionDate = infectionDate; }
    
}
