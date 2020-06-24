/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course.coursework;

import course.Grade;
import java.io.File;
import java.util.GregorianCalendar;
import user.Member;

public class Submission {
    private String title;
    private GregorianCalendar submissionDate;
    private Grade grade;
    private File work;
    private Member member;
    private Coursework coursework;

    public Submission(String title, Grade grade, File work, Member member, Coursework coursework, int year, int month, int dayOfMonth, int hour, int  minute) {
        this.title = title;
        this.grade = grade;
        this.work = work;
        this.member = member;
        this.coursework = coursework;
        this.submissionDate = new GregorianCalendar(year, month, dayOfMonth, hour, minute);
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
     * @return the submissionDate
     */
    public GregorianCalendar getSubmissionDate() {
        return submissionDate;
    }

    /**
     * @param submissionDate the submissionDate to set
     */
    public void setSubmissionDate(GregorianCalendar submissionDate) {
        this.submissionDate = submissionDate;
    }

    /**
     * @return the grade
     */
    public Grade getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    /**
     * @return the work
     */
    public File getWork() {
        return work;
    }

    /**
     * @param work the work to set
     */
    public void setWork(File work) {
        this.work = work;
    }

    /**
     * @return the member
     */
    public Member getMember() {
        return member;
    }

    /**
     * @param member the member to set
     */
    public void setMember(Member member) {
        this.member = member;
    }

    /**
     * @return the coursework
     */
    public Coursework getCoursework() {
        return coursework;
    }

    /**
     * @param coursework the coursework to set
     */
    public void setCoursework(Coursework coursework) {
        this.coursework = coursework;
    }

    public String toString() {
        return "Submission{" + "title=" + title + ", submissionDate=" + submissionDate.toString() + ", grade=" + grade + ", work=" + work.toString() + ", member=" + member + ", coursework=" + coursework + '}';
    }
    
    
    
}
