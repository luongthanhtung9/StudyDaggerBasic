package com.example.studydaggerbasic.dipattern.lesson_seven_named_param;

import javax.inject.Named;

public class Login {

    private String username;
    private String password;


    public Login(@Named("username") String username, @Named("password") String password) {
        this.username = username;
        this.password = password;
    }

    String getUserInfo() {
        return username + " " + password;
    }
}
