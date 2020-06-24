/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

import course.coursework.Coursework;
import java.util.*;
import java.nio.file.Path;
import registration.CourseRegistration;
import user.Member;

public class Course {

    private String reference;
    private String title;
    private String description;
    private String ilos;
    private String partnerInstitution;
    private String creators[];
    private double fees;
    private Path certificate; //can we make this a class?
    private CertificateChoice certification;
    private GregorianCalendar sessionTime;
    private Topic[] courseTopics; //at least one topic
    private Coursework[] coursework;
    private CourseRegistration[] courseRegistrations;

    public Course(String title, double fees) {
        this.title = title;
        this.fees = fees;
    }
    
    public Course(String reference, String title, String description, double fees,
            int hour, int minute, CertificateChoice certification){
        this.sessionTime = new GregorianCalendar(2019, 12, 30, hour, minute);
        this.reference = reference;
        this.title = title;
        this.description = description;
        this.fees = fees;
        this.certification = certification;
    }

    public Course(String reference, String title, String description, String ilos,
            String partnerInstitution, String[] creators, double fees, Path certificate,
            int year, int month, int dayOfMonth, int hour, int minute, Topic[] courseTopics,
            Coursework[] coursework, CourseRegistration[] courseRegistrations, 
            CertificateChoice certification) {
        this.sessionTime = new GregorianCalendar(year, month, dayOfMonth, hour, minute);
        this.reference = reference;
        this.title = title;
        this.description = description;
        this.ilos = ilos;
        this.partnerInstitution = partnerInstitution;
        this.creators = creators;
        this.fees = fees;
        this.certificate = certificate;
        this.courseRegistrations = courseRegistrations;
        this.courseTopics = courseTopics;
        this.coursework = coursework;
        this.certification = certification;
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
     * @return the ilos
     */
    public String getIlos() {
        return ilos;
    }

    /**
     * @param ilos the ilos to set
     */
    public void setIlos(String ilos) {
        this.ilos = ilos;
    }

    /**
     * @return the partnerInstitution
     */
    public String getPartnerInstitution() {
        return partnerInstitution;
    }

    /**
     * @param partnerInstitution the partnerInstitution to set
     */
    public void setPartnerInstitution(String partnerInstitution) {
        this.partnerInstitution = partnerInstitution;
    }

    /**
     * @return the creators
     */
    public String[] getCreators() {
        return creators;
    }

    /**
     * @param creators the creators to set
     */
    public void setCreators(String[] creators) {
        this.creators = creators;
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
     * @return the certificate
     */
    public Path getCertificate() {
        return certificate;
    }

    /**
     * @param certificate the certificate to set
     */
    public void setCertificate(Path certificate) {
        this.certificate = certificate;
    }

    /**
     * @return the sessionTime
     */
    public GregorianCalendar getSessionTime() {
        return sessionTime;
    }

    /**
     * @param sessionTime the sessionTime to set
     */
    public void setSessionTime(GregorianCalendar sessionTime) {
        this.sessionTime = sessionTime;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "course{" + "reference=" + reference + ", title=" + title +
                ", description=" + description + ", fees=" + fees + 
                ", certificate=" + certificate.toString() +
                ", sessionTime=" + sessionTime.toString() + '}';
    }

    /**
     * @return the courseTopics
     */
    public Topic[] getCourseTopics() {
        return courseTopics;
    }

    /**
     * @return the coursework
     */
    public Coursework[] getCoursework() {
        return coursework;
    }

    /**
     * @return the courseRegistrations
     */
    public CourseRegistration[] getCourseRegistrations() {
        return courseRegistrations;
    }
    
    @Override
    public boolean equals(Object obj){ //searching for a coirse matalan
        return(obj!=null && (obj instanceof Course) && (((Course)obj).getReference().equals(this.reference)));
    }
    
    public boolean Register(Member member){
        System.out.println("Member" + member.getProfile().getF_name() + "registered");
        //should be added to courseRegistrations
        return true; //if not already there
    }

    /**
     * @return the certification
     */
    public CertificateChoice getCertification() {
        return certification;
    }

}
