package com.ui.pages;

import com.ui.base.BasePage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static com.ui.utils.SendKeys.sendKeys;
import static com.ui.utils.ClickAction.*;
import static com.ui.utils.Scrolling.scrollToElement;

/**
 * Page Object for Login Page
 */
public class LoginPage extends BasePage {
    
    // logger removed: inherited from BasePage
    
    // Locators
    private final By usernameField = By.id("email");
    private final By passwordField = By.id("password");
    private final By loginButton = By.xpath("//button[normalize-space()='Login']");
    
   
    
    public LoginPage(WebDriver driver) {
        super(driver);
    }



    
    /*
        get login page url    
    */
    public String openUrl() {
        logger.info("Opening login page URL");
        return driver.getCurrentUrl();
    }


    public WebDriver getDriver() {
        return this.driver;
    }


    /*
     * Enter username
     */
    public LoginPage enterUsername(String username) {
        logger.debug("Entering username: " + username);
        sendKeys(driver, usernameField, username); 
        return this;
    }
    
    /**
     * Enter password
     */
    public LoginPage enterPassword(String password) {
        logger.debug("Entering password: [PROTECTED]");
        sendKeys(driver, passwordField, password);
        return this;
    }
    
    /**
     * Click login button
     */
    public void clickLogin() {
        logger.info("Clicking login button");
        try{
        click(driver,loginButton);
        }catch(Exception e){
            System.out.println("Exception occurred while clicking login button: " + e.getMessage());
            clickUsingJavaScript(driver, loginButton);
        }
    }

  
    
    /**
     * Perform login
     */
    public void login(String username, String password) {
        logger.info("Logging in with username: " + username);
        enterUsername(username);
        enterPassword(password);
        scrollToElement( driver, loginButton);
        clickLogin();
    }
   
}
