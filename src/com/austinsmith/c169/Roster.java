/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.austinsmith.c169; 
import java.util.ArrayList;
/**
 *Scripting and Programming Application Project - C169 - VGT1
 * Roster Class
 * @author Austin Smith
 */

public class Roster {
    
    /**
     *Input all the the student info, including personal info from the table
     */
    public static String [] students = {"1,John,Smith,John1989@gmail.com,20,88,79,59", 
                                        "2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85",
                                        "3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87",
                                        "4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
                                        "5,Austin,Smith,asmi817@wgu.com,24,99,97,88"};

    /**
     * Create the ArrayList to hold all the student information
     */
    static ArrayList<Student> studentRoster = new ArrayList<>();

    public static void main(String[] args){
		
	//B. Convert the Strings shown above to an ArrayList of Student objects.	
        for (String s : students) {
            String[] studentList = s.split(",");
            String studentID = studentList[0];
            String studentFirstName = studentList[1];
            String studentLastName = studentList[2];
            String studentEmailAddress = studentList[3];
            int studentAge = Integer.parseInt(studentList[4]);
            int studentGrade1 = Integer.parseInt(studentList[5]);
            int studentGrade2 = Integer.parseInt(studentList[6]);
            int studentGrade3 = Integer.parseInt(studentList[7]);
            add(studentID, studentFirstName, studentLastName, studentEmailAddress, studentAge, studentGrade1, studentGrade2, studentGrade3);
	}
	
        //C. Demonstrate the program’s required functionality
        print_all();
        print_invalid_emails();
	for(Student student : studentRoster) 
            print_average_grade(student);
        remove("3");
	remove("3");
    }

    
    public static void add(String studentID, String firstName, String lastName, String emailAddress, int age, int grade1, int grade2, int grade3) {
	int[] grades = {grade1, grade2, grade3};
	Student student = new Student(studentID, firstName, lastName, emailAddress, age, grades);
	studentRoster.add(student);
    }    

    /**
     * B3a. Remove the student from the roster based on studentID
     * @param studentID string reference to the StudentID number
     */
    public static void remove(String studentID) {
	for (int i = 0; i < studentRoster.size(); i++) {
            String findID = studentRoster.get(i).getStudentID();
            if (findID.equals(studentID)) {
		studentRoster.remove(i);
		System.out.printf("\nERROR -------> StudentID: %s is not found.\n", studentID);
                return;
            }
	}
    }
    
    /**
     * B3b. Prints a complete tab-separated list of student data using accessor method print() in the Student class
     */
    public static void print_all() {
        for (Student s : studentRoster) {
            s.print();
	}
    }
    
    /**
     * B3c. Correctly prints a student’s average grade by student ID and prints a double, float .00
     * @param id 
     */
    public static void print_average_grade(Student id) {
        double averageGrade = (double)((id.getGrades()[0]+ id.getGrades()[1] + id.getGrades()[2])/3.0);
        System.out.print("Student ID: " + id.getStudentID() + "\t Average Grade:\t");
        System.out.printf("%.2f", averageGrade);
        System.out.println("");
        
    }
    
    /**
     * B3d. Verifies student e-mail addresses contain '@' and '.' and there are no spaces 
     *      If invalid, print the email address in output
     */
    public static void print_invalid_emails() {
        System.out.println("\nInvalid Email Address: ");
        for (Student student : studentRoster) {
            if (!(student.getEmailAddress().contains("@") && student.getEmailAddress().contains(".") && !(student.getEmailAddress().contains(" ")))) {
                System.out.println(student.getEmailAddress());
            }
        }
        //Formating output
        System.out.println(" ");
    }
}
