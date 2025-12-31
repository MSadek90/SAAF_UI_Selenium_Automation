package com.ui.Controller;

import com.ui.base.BaseTest;
import com.ui.flows.LoginFlow;
import com.ui.models.pojo.Login.LoginPojo;

import org.testng.annotations.Test;



/**
 * Test class for Login functionality
 */
public class LoginTest extends BaseTest {
    

    @Test
    public void testLogin(LoginPojo loginTestCase) {
       
        new LoginFlow(driver).loginExecution(loginTestCase);
    }   
}
