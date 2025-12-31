package com.ui.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Utility class for screenshot operations
 */
public class ScreenshotUtils {
    
    private static final String SCREENSHOT_DIR = System.getProperty("user.dir") + "/test-output/screenshots/";
    
    /**
     * Capture screenshot
     */
    public static String captureScreenshot(WebDriver driver, String screenshotName) {
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String fileName = screenshotName + "_" + timestamp + ".png";
        String filePath = SCREENSHOT_DIR + fileName;
        
        try {
            // Create directory if it doesn't exist
            File directory = new File(SCREENSHOT_DIR);
            if (!directory.exists()) {
                directory.mkdirs();
            }
            
            // Capture screenshot
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File source = screenshot.getScreenshotAs(OutputType.FILE);
            File destination = new File(filePath);
            FileUtils.copyFile(source, destination);
            
            System.out.println("Screenshot captured: " + filePath);
            return filePath;
        } catch (IOException e) {
            System.err.println("Failed to capture screenshot: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
    
    /**
     * Capture screenshot with default name
     */
    public static String captureScreenshot(WebDriver driver) {
        return captureScreenshot(driver, "screenshot");
    }
}
