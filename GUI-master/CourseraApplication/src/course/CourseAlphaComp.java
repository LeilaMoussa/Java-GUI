/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

import java.util.Comparator;

/**
 *
 * @author Leila
 */
public class CourseAlphaComp implements Comparator<Course> {
    
    @Override
    public int compare(Course a, Course b){
        return (a.getTitle().compareTo(b.getTitle()));
    }
}
