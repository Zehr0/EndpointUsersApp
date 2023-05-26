package com.hilary.endpointusersapp;

public class User {
    private String first_name;
    private String last_name;
    private String email;

    public User(String fname, String lname, String email) {
        this.first_name = fname;
        this.last_name = lname;
        this.email = email;
    }

    public String getFName() {
        return first_name;
    }

    public String getLName() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }
}

