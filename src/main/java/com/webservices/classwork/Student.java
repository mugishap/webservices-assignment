package com.webservices.classwork;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Student {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private Gender gender;

    private static void main(String args[]){
        Student student = new Student();
        student.setGender(new Gender(EGender.MALE));
        student.setFirstName("Mugisha");
        student.setLastName("Precieux");
        student.gender.displayGender();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
