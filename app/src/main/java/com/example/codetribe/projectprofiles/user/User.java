package com.example.codetribe.projectprofiles.user;

/**
 * Created by Codetribe on 2016/09/13.
 */
public class User {
    private String name,gender,password,email;

    public User() {
    }

    public User(String name, String gender, String password, String email) {
        this.name = name;
        this.gender = gender;
        this.password = password;
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public String getGender(){
        return gender;
    }
    public String email(){
        return email;
    }

}
