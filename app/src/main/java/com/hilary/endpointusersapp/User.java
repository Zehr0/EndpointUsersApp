package com.hilary.endpointusersapp;

public class User {
    private String fname;
    private String lname;
    private String email;

    public User(String fname, String lname, String email) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
    }

    public String getFName() {
        return fname;
    }

    public String getLName() {
        return lname;
    }

    public String getEmail() {
        return email;
    }
}

