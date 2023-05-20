package com.webservices.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Employee {
    private int empId;
    private String empName;

    private int employeeDepartment;

    public Employee() {
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getDepartmentId() {
        return employeeDepartment;
    }

    public void setDepartmentId(int departmentId) {
        this.employeeDepartment = departmentId;
    }
}