package com.ui.actions;
import org.openqa.selenium.WebDriver;

import com.ui.pages.LoginPage;

/**
 * Action class for Login operations
 */
public class LoginActions {
   
    private LoginPage loginPage;



    public LoginActions(WebDriver driver) {
        this.loginPage = new LoginPage(driver);
    }
   
    public void performLoginAndVerify(String username, String password) {
        
        loginPage.login(username, password);
    }
}
