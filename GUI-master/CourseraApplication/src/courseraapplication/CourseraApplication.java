/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseraapplication;

import user.DataBaseCollection;
import course.Course;
import course.Material;
import course.Topic;
import exceptions.*;
import registration.Registration;
import registration.SpecializationRegistration;
import course.Specialization;
import java.awt.BorderLayout;
import java.util.Scanner;
import javax.swing.JFrame;
import myGUI.CourseraGUI;
import user.*;

public class CourseraApplication {

    private static DataBaseCollection userColl = new DataBaseCollection();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Gender gender = null;
//        HighestDegree highest_degree = null;
//        String email = null;
//        String password;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter your First name: ");
//        String F_name = sc.nextLine();
//        System.out.println("Enter your last name: ");
//        String L_name = sc.nextLine();
//        System.out.println("Enter your location: ");
//        String location = sc.nextLine();
//        System.out.println("Enter your occupation: ");
//        String occupation = sc.nextLine();
//        System.out.println("Enter your field: ");
//        String majorField = sc.nextLine();
//        System.out.println("Enter your skills: ");
//        String skills = sc.nextLine();
//        System.out.println("Enter your career goals: ");
//        String careerGoals = sc.nextLine();
//
//        while (true) {
//            try {
//                System.out.println("Enter your gender (Male/Female): ");
//                gender = Gender.valueOf(sc.next().toUpperCase());
//                break;
//            } catch (IllegalArgumentException ex) {
//                System.out.println(ex.getMessage());
//                Gender.getList(gender);
//            }
//        }
//
//        while (true) {
//            try {
//                System.out.println("Enter your highest degree (highschool/associate/bachelor/masters/phd): ");
//                highest_degree = HighestDegree.valueOf(sc.next().toUpperCase());
//                break;
//            } catch (IllegalArgumentException ex) {
//                System.out.println(ex.getMessage());
//                HighestDegree.getList(highest_degree);
//            }
//        }
//
//        System.out.println("Enter your birth year: ");
//        int year = sc.nextInt();
//        System.out.println("Enter your birth month: ");
//        int month = sc.nextInt();
//        System.out.println("Enter your birth day: ");
//        int dayOfMonth = sc.nextInt();
//        Profile profile = new Profile(F_name, L_name, location, occupation, majorField, skills, careerGoals, gender, highest_degree, year, month, dayOfMonth);
//        Member user = new Member();
//        String temp = sc.nextLine(); //because of buffer issues
//        while (true) {
//            try {
//                System.out.println("Enter your email: ");
//                email = sc.nextLine();
//                user.setEmail(email);
//                break;
//            } catch (InvalidEmailException i) {
//                i.getMessage();
//                i.getEmailFormat(email);
//            }
//        }
//
//        while (true) {
//            try {
//
//                System.out.println("Enter your password: ");
//                password = sc.next();
//                password += sc.nextLine();
//                user.setPassword(password);
//                break;
//            } catch (InvalidPasswordException i) {
//                i.getMessage();
//                i.PasswordCriteria();
//            }
//        }
//
//        //user = new Member(email, password, profile);
//        System.out.println("Enter topic title: ");
//        String topic_title = sc.nextLine();
//        System.out.println("Enter course description: ");
//        String description = sc.nextLine();
//        Topic topic = new Topic(topic_title, description, new Material[5]);
//        System.out.println(topic);
//
//        System.out.println("Now registering for a course");
//        System.out.println("Course title: ");
//        String course_title = sc.nextLine();
//        System.out.println("Course Fees: ");
//        double course_fees = sc.nextDouble();
//        Course course = new Course(course_title, course_fees);
//        System.out.println("Would you like to audit (1) or get a certificate (0)?");
//        int choice = sc.nextInt();
//        boolean isAudit = false;
//        if (choice == 1) {
//            isAudit = true;
//        }
//
//        Course course2 = new Course("Advanced Programming", 5000);
//        Course[] specializationCourses = new Course[2];
//        specializationCourses[0] = course;
//        specializationCourses[1] = course2;
//
//        Specialization special = new Specialization("Machine Learning", 7000,
//                specializationCourses, new SpecializationRegistration[10]);
//        //specializationRegistrations is a list of registrations
//        //each element relates one member to the specialization
//        //and contains capstone file and completed boolean
//        //so the size of the list is the number of users registered for the specialization "ML"
//        Registration cr;
//        cr = new SpecializationRegistration(isAudit, user, special, "VISA", "PENDING");
//
//        System.out.println(cr.getRegistrationReceipt());
//
//        Course wishlisted = new Course("Programming Challenges", 4000);
//        Course[] wishlist = new Course[3];
//        Registration[] memberRegistrations = new Registration[3];
//
//        wishlist[0] = wishlisted;
//        memberRegistrations[0] = cr;
//
//        user = new Member(email, password, profile, memberRegistrations, wishlist);
//
//        System.out.println(user.forgotPassword(email));
//        
//        System.out.println(user);
//        
//        
        //GUIs
        CourseraGUI form = new CourseraGUI();
        // form.setLayout(new BorderLayout());
        form.pack();
        form.setResizable(true);
        form.setVisible(true);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

}
