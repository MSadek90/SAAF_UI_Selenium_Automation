package com.ui.base;

import com.ui.config.EnvConfig;
import com.ui.flows.LoginFlow;
import com.ui.models.pojo.Login.LoginPojo;
import com.ui.utils.ScreenshotUtils;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import com.ui.utils.DataLoader.LoginLoadData;


public class BaseTest {
    
    protected WebDriver driver;
    private LoginFlow loginFlow;
    private LoginPojo loginData;


    @BeforeMethod()
    public void setUp() {
        driver = DriverFactory.initializeDriver("chrome");
        driver.get(EnvConfig.BASE_URL);
        loginFlow = new LoginFlow(driver);
        loginData = LoginLoadData.getLoginData();
        loginFlow.loginExecution(loginData);
    }



    
    
   @AfterMethod(alwaysRun = true)
    public void tearDown(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            System.out.println("Test Failed: " + result.getName());
            ScreenshotUtils.captureScreenshot(driver, result.getName());
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            System.out.println("Test Passed: " + result.getName());
        } else if (result.getStatus() == ITestResult.SKIP) {
            System.out.println("Test Skipped: " + result.getName());
        }
        
       // DriverFactory.quitDriver();
    }
    
    /**
     * Get WebDriver instance
     */
    protected WebDriver getDriver() {
        return driver;
    }
}
