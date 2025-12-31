package com.ui.utils;

import org.testng.Assert;

/**
 * Utility class for custom assertions
 */
public class AssertionUtils {
    
    /**
     * Verify equals with custom message
     */
    public static void assertEquals(Object actual, Object expected, String message) {
        Assert.assertEquals(actual, expected, message);
    }
    
    /**
     * Verify true with custom message
     */
    public static void assertTrue(boolean condition, String message) {
        Assert.assertTrue(condition, message);
    }
    
    /**
     * Verify false with custom message
     */
    public static void assertFalse(boolean condition, String message) {
        Assert.assertFalse(condition, message);
    }
    
    /**
     * Verify contains
     */
    public static void assertContains(String actual, String expected, String message) {
        Assert.assertTrue(actual.contains(expected), 
            message + " - Expected: '" + expected + "' to be contained in '" + actual + "'");
    }
    
    /**
     * Verify not null
     */
    public static void assertNotNull(Object object, String message) {
        Assert.assertNotNull(object, message);
    }
    
    /**
     * Verify null
     */
    public static void assertNull(Object object, String message) {
        Assert.assertNull(object, message);
    }
    
    /**
     * Soft assertion - verify without stopping execution
     */
    public static void softAssertEquals(Object actual, Object expected, String message) {
        try {
            Assert.assertEquals(actual, expected, message);
        } catch (AssertionError e) {
            System.err.println("Soft Assertion Failed: " + message);
            System.err.println("Expected: " + expected + ", Actual: " + actual);
        }
    }
}
