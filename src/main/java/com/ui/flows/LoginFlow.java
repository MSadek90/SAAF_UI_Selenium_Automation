package com.ui.flows;

import org.openqa.selenium.WebDriver;

import com.ui.models.pojo.Login.LoginPojo;
import com.ui.pages.LoginPage;
import com.ui.utils.LoggerUtil;


public class LoginFlow {

    private static final LoggerUtil logger =
            LoggerUtil.getLogger(LoginFlow.class);

    private final LoginPage loginPage;

    public LoginFlow(WebDriver driver) {
        this.loginPage = new LoginPage(driver);
    }

    public void loginExecution(LoginPojo testCase) {

        logger.info("Starting loginExecution for user: "
                + testCase.getUsername());

        loginPage.openUrl();
        loginPage.enterUsername(testCase.getUsername());
        loginPage.enterPassword(testCase.getPassword());
        loginPage.clickLogin();

        logger.info("Login action performed for user: "
                + testCase.getUsername());
    }
}
