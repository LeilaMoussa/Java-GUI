/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import course.Course;
import exceptions.InvalidEmailException;
import exceptions.InvalidPasswordException;
import java.util.*;
import registration.Registration;

public class Member {

    private String email;
    private String password;
    private Profile profile;
    private Registration[] memberRegistrations;
    private Course[] wishlist;

    public Member() { //we need this for the main
    }

    public Member(String email, String password, Profile profile,
            Registration[] memberRegistrations, Course[] wishlist) {
        this.email = email;
        this.password = password;
        this.profile = profile;
        this.memberRegistrations = memberRegistrations;
        this.wishlist = wishlist;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws InvalidEmailException { //ideally the conditions are changed
        if ((!email.contains("@") || !email.contains(".")) || email.length() < 7 || email.contains(" ")) {
            throw new InvalidEmailException("Wrong email format");
        }
        this.email = email;

    }

    public void setPassword(String password) throws InvalidPasswordException {
        boolean flag1 = false, flag2 = false, flag3 = false;
        if (password.length() >= 6) {
            flag3 = true;
        }
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                flag1 = true;
            }
            if (Character.isDigit(ch)) {
                flag2 = true;
            }
        }
        if (!flag1 || !flag2 || !flag3) {
            throw new InvalidPasswordException("Password is Weak!");
        }
        this.password = password;
    }

    public void changePassword(String password) { //changePassword should call set(), like in modify() -> set() ?
        this.password = password;
    }

    public Profile getProfile() {
        return profile;
    }

    /**
     * @param profile the profile to set
     */
    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    /**
     * @return the memberRegistrations
     */
    public Registration[] getMemberRegistrations() {
        return memberRegistrations;
    }

    /**
     * @return the wishlist
     */
    public Course[] getWishlist() {
        return wishlist;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    public boolean authenticate(String email, String password) { //um?
        return Objects.equals(this.email, email) && Objects.equals(this.getPassword(), password);
    }

    public String forgotPassword(String email) { //make this throw something?
        return "A verification email has been sent to " + email; //Coursera sends a verification email regardless whether the email exists or not.
    }

    @Override
    public String toString() {
        String str = "User email: " + email + "\nProfile: \n" + getProfile().toString();
        for(Registration r : memberRegistrations){
            str += r.toString();
        }
        for(Course c : wishlist){
            str += c.toString();
        }
        return str;
    }

    @Override
    public boolean equals(Object obj) {
        return (obj != null && (obj instanceof Member) && (((Member) obj).getEmail().equals(this.email))); //email as criteria fine?
    }
}
