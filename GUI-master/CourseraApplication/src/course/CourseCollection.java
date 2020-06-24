/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Leila
 */
public class CourseCollection {

    List<Course> courses;

    public CourseCollection() {
        this.courses = new LinkedList<>();
        Course course2 = new Course("Advanced Programming", 5000);
        courses.add(course2);
    }

    public boolean addCourse(Course toAdd) {
        if (courses.contains(toAdd)) {
            return false;
        }
        courses.add(toAdd);
        return true;
    }

    public boolean removeCourse(Course toRemove) {
        if (courses.contains(toRemove)) {
            courses.remove(toRemove);
            return true;
        }
        return false;
    }

    public boolean modifyCourse(Course toModify, Course newCourse) {
        int idx = courses.indexOf(toModify);
        if (idx >= 0) {
            courses.set(idx, newCourse);
            return true;
        }
        return false;
    }

    public ArrayList<Course> findCoursesWithFees(double fees) {
        ArrayList<Course> searchResults = new ArrayList<>();
        ListIterator<Course> iter = courses.listIterator();
        while (iter.hasNext()) {
            Course c = iter.next();
            if (c.getFees() <= fees) {
                searchResults.add(c);
            }
        }
        return searchResults;
    }

    public void sortCourses(Comparator CourseAlphaComp) {
        Collections.sort(courses, CourseAlphaComp);
    }

}
