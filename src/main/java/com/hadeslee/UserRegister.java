package com.hadeslee;

import sun.security.util.Password;

/**
 * Created by hadeslee on 2016-11-25.
 */
public class UserRegister {
    private String userId;
    private String Password;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword(String userId) {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void savePassword(String userId, String passowrd) {

    }
}
