package com.ui.base;
import org.openqa.selenium.WebDriver;

import com.ui.utils.LoggerUtil;


public class BasePage {
    
    protected WebDriver driver;
    protected final LoggerUtil logger;

    
    public BasePage(WebDriver driver2) {
        
        this.driver = DriverFactory.getDriver();
        this.logger = LoggerUtil.getLogger(this.getClass());
    }
}
