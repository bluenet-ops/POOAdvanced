package com.generation;

import com.generation.exceptions.CourseNotFoundException;
import com.generation.exceptions.StudentNotFoundException;
import com.generation.students.Student;
import com.generation.students.StudentService;

public class Main {

    public static void main(String[] args) throws CourseNotFoundException, StudentNotFoundException {
	    StudentService studentService = new StudentService();

        studentService.addStudents(new Student( "Carlos", "1030", 31 ) );
        studentService.addStudents(new Student( "Ian", "1040", 28 ) );
        studentService.addStudents(new Student( "Elise", "1050", 26 ) );
        studentService.addStudents(new Student( "Santiago", "1020", 33 ) );
        
        try {
            studentService.enrollStudents("Math", "1030");
        } catch (CourseNotFoundException | StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            studentService.enrollStudents("History", "1040");
        } catch (CourseNotFoundException | StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
        
        studentService.showAllCourses();
        System.out.println();
        studentService.showEnrolledStudents("Math");
        studentService.showEnrolledStudents("History");
        
        try {
            studentService.unEnrollStudents("Math", "1030");
        } catch (CourseNotFoundException | StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }// main
}// class Main