package com.ui.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectAction {

    /**
     * func: select an option from a dropdown
     * param: WebDriver driver, By locator, String text
     * return: void
     * Steps: 
     * 1. Wait for element to be visible
     * 2. Select the option from the dropdown
     */

     public static void selectByVisibleText(WebDriver driver, By locator, String text) {
        WaitUtils.waitForElementToBeVisible(driver, locator);  
        SelectAction.selectByVisibleText(driver, locator, text);
    }      

      

    /**
     * func: select an option from a dropdown
     * param: WebDriver driver, By locator, int index
     * return: void
     * Steps: 
     * 1. Wait for element to be visible
     * 2. Select the option from the dropdown
     */
    public static void selectByIndex(WebDriver driver, By locator, int index) {
        WaitUtils.waitForElementToBeVisible(driver, locator);  
        SelectAction.selectByIndex(driver, locator, index);
    }   

    /**
     * func: select an option from a dropdown
     * param: WebDriver driver, By locator, String value
     * return: void
     * Steps: 
     * 1. Wait for element to be visible
     * 2. Select the option from the dropdown
     */
    
    public static void selectByValue(WebDriver driver, By locator, String value) {
        WaitUtils.waitForElementToBeVisible(driver, locator);  
        SelectAction.selectByValue(driver, locator, value);
    }   
    
}