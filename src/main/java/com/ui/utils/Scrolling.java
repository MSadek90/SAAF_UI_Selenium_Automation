package com.ui.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Scrolling {





    
    /**
     * func: scroll to an element
     * param: WebDriver driver, By locator
     * return: void
     * Steps: 
     * 1. Wait for element to be visible
     * 2. Scroll to the element
     */
    public static void scrollToElement(WebDriver driver, By locator) {
        //WaitUtils.waitForElementToBeVisible(driver, locator);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(locator));
    }
}
