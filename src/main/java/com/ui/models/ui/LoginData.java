package com.ui.models.ui;

/**
 * Data model for Login UI data
 */
public class LoginData {
    
    private String username;
    private String password;
    private boolean rememberMe;
    
    public LoginData() {
    }
    
    public LoginData(String username, String password) {
        this.username = username;
        this.password = password;
        this.rememberMe = false;
    }
    
    public LoginData(String username, String password, boolean rememberMe) {
        this.username = username;
        this.password = password;
        this.rememberMe = rememberMe;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean isRememberMe() {
        return rememberMe;
    }
    
    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }
    
    @Override
    public String toString() {
        return "LoginData{" +
                "username='" + username + '\'' +
                ", password='[PROTECTED]'" +
                ", rememberMe=" + rememberMe +
                '}';
    }
}
