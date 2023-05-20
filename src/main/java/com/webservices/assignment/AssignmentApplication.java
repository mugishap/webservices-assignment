package com.webservices.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AssignmentApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(AssignmentApplication.class, args);
        Student student1 = ctx.getBean(Student.class);
        Student student2 = ctx.getBean(Student.class);

        Department department1 = ctx.getBean(Department.class);
        department1.setDepartmentName("Department 1");
        department1.setDepartmentId(1);

        Department department2 = ctx.getBean(Department.class);
        department2.setDepartmentName("Department 2");
        department2.setDepartmentId(2);

        student1.setStudentName("Mugisha Precieux");
        student1.setStudentId(1);
        student1.setStudentDepartment(department2);

        student2.setStudentName("Another Student");
        student2.setStudentId(2);
        student2.setStudentDepartment(department2);

        student1.showStudentDepartment();
        student2.showStudentDepartment();
    }

}
