/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.austinsmith.c169;

/**
 *Scripting and Programming Application Project - C169 - VGT1
 * Student Class
 * @author Austin Smith 
 */
public class Student {
    //B1. Include the instance variables for each header in the table of information
    private String studentID;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private int age;
    private int[] grades;

    //B2a. Add accessor to each variable
    public String getStudentID() {
        return studentID;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public int getAge() {
        return age;
    }
    public int[] getGrades() {
        return grades;
    }
    
    
    //B2b. Add mutator to each variable
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGrades(int[] grades) {
        this.grades = grades;
    }
    
    /**
     * B2c. Constructor for all variables
     * @param studentID
     * @param firstName
     * @param lastName
     * @param emailAddress
     * @param age
     * @param grades 
     */
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Student(String studentID, String firstName, String lastName, String emailAddress, int age, int[] grades) {
        setStudentID(studentID);
        setFirstName(firstName);
        setLastName(lastName);
        setEmailAddress(emailAddress);
        setAge(age);
        setGrades(grades);
    }
    
    //B2d. Print out all the student data 
    public void print() {
        System.out.println(getStudentID() + "\tFirst Name: " + getFirstName() + "\tLast Name: " + getLastName() + "\tAge: " + getAge() + "\t\tEmail Address: " + getEmailAddress() + "\tGrades:{" + getGrades()[0] + ", " + getGrades()[1] + ", " + getGrades()[2] + "}");
    }

}
