package com.webservices.classwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ClassworkApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ClassworkApplication.class, args);
        Student student = ctx.getBean(Student.class);
        student.setGender(new Gender(EGender.MALE));
        System.out.println(student.getGender().displayGender());
    }

}
