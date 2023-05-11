package com.ebay;

public class LoginFeatures {
    String validUserName = "admin";
    String validPassword = "admin@123";

    public boolean doLogin(String username, String password) {
        return username.equals(validUserName) && password.equals(validPassword);
    }
}
