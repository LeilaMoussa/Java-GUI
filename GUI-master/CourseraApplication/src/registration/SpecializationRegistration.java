/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration;

import course.Course;
import course.Specialization;
import user.Member;
import java.io.File;

public class SpecializationRegistration extends Registration {
    private boolean capstoneProjectCompleted;
    private File CapstoneFile;
    private Specialization specialization;
    
   
    public SpecializationRegistration(boolean isAudit, Member member, 
            Specialization specialization, String paymentMethod,
            String transactionStatus) {
        super(isAudit, member, paymentMethod, transactionStatus);
        this.specialization = specialization;
        
    }
    
    public boolean isCapstoneProjectCompleted() {
        return capstoneProjectCompleted;
    }

    public void setCapstoneProjectCompleted(boolean capstoneProjectCompleted) {
        this.capstoneProjectCompleted = capstoneProjectCompleted;
    }

    public File getCapstoneFile() {
        return CapstoneFile;
    }

    public void setCapstoneFile(File CapstoneFile) {
        this.CapstoneFile = CapstoneFile;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public void setSpecialization(Specialization specialization) {
        this.specialization = specialization;
    }
    
    @Override
    public String getRegistrationReceipt () { 
        double sum = 0;
        String str = super.getRegistrationReceipt();
        if (!isAudit){
            for (Course c : specialization.getSpecializationCourses()) {
                str += "\nCourse title: " + c.getTitle() + "\t" + "Course fees" + c.getFees();
                sum += c.getFees();
            }
            str += "Total amount charged: " + sum + "Payment method: " + paymentMethod
                + " Transaction status: " + transactionStatus;
        }
        
        
        return str;
    }
    
    
    
}
