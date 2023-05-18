package com.webservices.classwork;


import java.util.UUID;

public class Gender {

    private UUID id;
    private EGender genderName;

    public EGender displayGender() {
        return genderName;
    }

    public Gender(EGender genderName){
        this.id = UUID.randomUUID();
        this.genderName = genderName;
    }

}
