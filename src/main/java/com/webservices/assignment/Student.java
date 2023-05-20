package com.webservices.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Autowired
    @Qualifier("studentDepartment")
    private Department studentDepartment;


    private int studentId;
    private String studentName;

    public Student() {
        System.out.println("The student class has been created!!!");
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Department getStudentDepartment() {
        return studentDepartment;
    }

    public void setStudentDepartment(Department studentDepartment) {
        this.studentDepartment = studentDepartment;
    }

    public void showStudentDepartment() {
        studentDepartment.displayDept();
    }
}