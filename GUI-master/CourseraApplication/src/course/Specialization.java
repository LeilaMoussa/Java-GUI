/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

import registration.SpecializationRegistration;

public class Specialization {

    private String reference, title, description, FAQs, project;
    private double fees;
    private Course[] specializationCourses;
    private SpecializationRegistration[] specializationRegistrations;

    public Specialization(String title, double fees, Course[] specializationCourses, 
            SpecializationRegistration[] specializationRegistrations) {
        this.title = title;
        this.fees = fees;
        this.specializationCourses = specializationCourses;
        this.specializationRegistrations = specializationRegistrations;

    }

    public Specialization(String reference, String title, String description,
            String FAQs, String project, double fees, Course[] specializationCourses) {
        this.reference = reference;
        this.title = title;
        this.description = description;
        this.FAQs = FAQs;
        this.project = project;
        this.fees = fees;
        this.specializationCourses = specializationCourses;
    }

    /**
     * @return the reference
     */
    public String getReference() {
        return reference;
    }

    /**
     * @param reference the reference to set
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the FAQs
     */
    public String getFAQs() {
        return FAQs;
    }

    /**
     * @param FAQs the FAQs to set
     */
    public void setFAQs(String FAQs) {
        this.FAQs = FAQs;
    }

    /**
     * @return the project
     */
    public String getProject() {
        return project;
    }

    /**
     * @param project the project to set
     */
    public void setProject(String project) {
        this.project = project;
    }

    /**
     * @return the fees
     */
    public double getFees() {
        return fees;
    }

    /**
     * @param fees the fees to set
     */
    public void setFees(double fees) {
        this.fees = fees;
    }

    /**
     * @return the specializationCourses
     */
    public Course[] getSpecializationCourses() {
        return specializationCourses;
    }

    
    @Override
    public String toString() {
        return "Specialization{" + "reference=" + reference + ", title=" + title + ", description=" + description + ", FAQs=" + FAQs + ", project=" + project + ", fees=" + fees + '}';
    }

    /**
     * @return the specializationRegistrations
     */
    public SpecializationRegistration[] getSpecializationRegistrations() {
        return specializationRegistrations;
    }
    
    @Override
    public boolean equals(Object obj){
        return(obj!=null && (obj instanceof Specialization) && (((Course)obj).getReference().equals(this.reference)));
    }
    
    public boolean Register(){
        //logic? adding a user?
        return true;
    }

}
