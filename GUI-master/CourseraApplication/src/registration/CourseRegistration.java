/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration;

import course.Course;
import course.Grade;
import course.coursework.Submission;
import user.Member;

/**
 *
 * @author Leila
 */
public class CourseRegistration extends Registration{
    private Course regCourse; //different naming to avoid confusion
    private Submission[] submissions;

    public CourseRegistration(Course regCourse, boolean isAudit, Member member) {
        super(isAudit, member);
        this.regCourse = regCourse;
    }
    
    

    public CourseRegistration(Course regCourse, Submission[] submissions, 
            boolean isAudit, boolean isComplete, Grade grade, Member member,
            String paymentMethod, String transactionStatus) {
        super(isAudit, isComplete, grade, member, paymentMethod, transactionStatus);
        this.regCourse = regCourse;
        this.submissions = submissions;
    }
    
    
}
