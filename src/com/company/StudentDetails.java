package com.company;

// This file explains the Student's details

public class StudentDetails {
    final private int studentRoll;
    final private String studentName;
    final private String studentAddress;

    StudentDetails(int studentRoll,String studentName,String studentAddress){
        this.studentRoll = studentRoll;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public int getStudentRoll() {
        return studentRoll;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }
}
