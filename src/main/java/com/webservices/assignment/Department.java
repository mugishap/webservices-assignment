package com.webservices.assignment;

import org.springframework.stereotype.Component;

@Component("studentDepartment")
public class Department {
    private int departmentId;
    private String departmentName;
    public Department() {
    }
    public int getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void displayDept(){
        System.out.println("My department is: " + this.getDepartmentName());
    }
}