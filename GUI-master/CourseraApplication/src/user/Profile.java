/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Profile {
    private String F_name;
    private String L_name;
    private String location;
    private String occupation;
    private String majorField;
    private String skills;
    private String careerGoals;
    private Gender gender;
    private GregorianCalendar birthDate;
    private HighestDegree highest_degree;
    
    public Profile(String F_name, String L_name, String location, String occupation, String majorField, String skills, String careerGoals, Gender gender, HighestDegree highest_degree, int year, int month, int dayOfMonth) {
        this.birthDate = new GregorianCalendar(year,month,dayOfMonth);
        this.F_name = F_name;
        this.L_name = L_name;
        this.location = location;
        this.occupation = occupation;
        this.majorField = majorField;
        this.skills = skills;
        this.careerGoals = careerGoals;
        this.gender = gender;
        
        
        this.highest_degree = highest_degree;
    }

    public String getF_name() {
        return F_name;
    }

    /**
     * @param F_name the F_name to set
     */
    public void setF_name(String F_name) {
        this.F_name = F_name;
    }

    /**
     * @return the L_name
     */
    public String getL_name() {
        return L_name;
    }

    /**
     * @param L_name the L_name to set
     */
    public void setL_name(String L_name) {
        this.L_name = L_name;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the occupation
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * @param occupation the occupation to set
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    /**
     * @return the majorField
     */
    public String getMajorField() {
        return majorField;
    }

    /**
     * @param majorField the majorField to set
     */
    public void setMajorField(String majorField) {
        this.majorField = majorField;
    }

    /**
     * @return the skills
     */
    public String getSkills() {
        return skills;
    }

    /**
     * @param skills the skills to set
     */
    public void setSkills(String skills) {
        this.skills = skills;
    }

    /**
     * @return the careerGoals
     */
    public String getCareerGoals() {
        return careerGoals;
    }

    /**
     * @param careerGoals the careerGoals to set
     */
    public void setCareerGoals(String careerGoals) {
        this.careerGoals = careerGoals;
    }

    /**
     * @return the gender
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /**
     * @return the birthDate
     */
    public GregorianCalendar getbirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setbirthDate(GregorianCalendar birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return the highest_degree
     */
    public HighestDegree getHighest_degree() {
        return highest_degree;
    }

    /**
     * @param highest_degree the highest_degree to set
     */
    public void setHighest_degree(HighestDegree highest_degree) {
        this.highest_degree = highest_degree;
    }
    
    @Override
    public String toString(){
        return "Full Name: "+ F_name + " "+L_name + "\nGender: "+ gender.name() +
                "\nBirthdate: " + birthDate.get(Calendar.YEAR) + "/ " + 
                birthDate.get(Calendar.MONTH)+ "/ " + birthDate.get(Calendar.DATE) + 
                "\nLocation: " + location + "\nHighest Degree: "+ highest_degree.name()+ 
                "\nOccupation: "+ occupation + "\nMajor field: "+ majorField + 
                "\nSkills: " + skills + "\nGoals: " + careerGoals;
    }

}
