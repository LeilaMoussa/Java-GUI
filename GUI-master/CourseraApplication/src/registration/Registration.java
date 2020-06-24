/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration;

import course.Grade;
import user.Member;

public class Registration {

    protected boolean isAudit;
    protected boolean isComplete;
    protected Grade grade;
    protected Member member;
    protected String paymentMethod;
    protected String transactionStatus;

    public Registration(boolean isAudit, Member member) {
        this.isAudit = isAudit;
        this.member = member;
    }

    public Registration(boolean isAudit, Member member, String paymentMethod,
            String transactionStatus) {
        this.isAudit = isAudit;
        this.member = member;
        this.paymentMethod = paymentMethod;
        this.transactionStatus = transactionStatus;
    }

    public Registration(boolean isAudit, boolean isComplete, Grade grade, Member member, String paymentMethod,
            String transactionStatus) {
        this.isAudit = isAudit;
        this.isComplete = isComplete;
        this.grade = grade;
        this.member = member;
        this.paymentMethod = paymentMethod;
        this.transactionStatus = transactionStatus;
    }

    /**
     * @return the isAudit
     */
    public boolean get_isAudit() {
        return isAudit;
    }

    /**
     * @param isAudit the isAudit to set
     */
    public void set_isAudit(boolean isAudit) {
        this.isAudit = isAudit;
    }

    /**
     * @return the isComplete
     */
    public boolean isCompleted_inProgress() {
        return isComplete;
    }

    /**
     * @param isComplete the isComplete to set
     */
    public void setCompleted_inProgress(boolean isComplete) {
        this.isComplete = isComplete;
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

    @Override
    public String toString() {
        return "Registration{" + "isAudit=" + isAudit + ", isComplete=" + isComplete + ", grade=" + grade.name() + ", member=" + member + '}';
    }

    public String getString() {
        return paymentMethod;
    }

    public void setString(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public String getRegistrationReceipt() {
        String str = "Name: " + member.getProfile().getF_name() + member.getProfile().getL_name();
        if (isAudit) {
            str += " Registered as auditing: NO FEES.";
        }
        return str;
    }

}
