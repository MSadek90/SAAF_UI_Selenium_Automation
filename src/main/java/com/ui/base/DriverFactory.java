package com.ui.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.ui.config.BrowserConfig;

import java.time.Duration;

/**
 * Factory class for creating and managing WebDriver instances
 */
public class DriverFactory {
    
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    
    public static WebDriver initializeDriver(String browserType) {
        WebDriver webDriver = null;
        
        switch (browserType.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                webDriver = new ChromeDriver();
                break;
                
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                webDriver = new FirefoxDriver();
                break;
                
            case "edge":
                WebDriverManager.edgedriver().setup();
                webDriver = new EdgeDriver();
                break;
                
            default:
                throw new IllegalArgumentException("Browser type not supported: " + browserType);
        }
        
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(BrowserConfig.IMPLICIT_WAIT));
        webDriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(BrowserConfig.PAGE_LOAD_TIMEOUT));
        webDriver.manage().window().maximize();
        
        driver.set(webDriver);
        return webDriver;
    }
    
    /**
     * Get the current WebDriver instance
     * @return WebDriver instance
     */
    public static WebDriver getDriver() {
        return driver.get();
    }
    
    /**
     * Quit and remove the WebDriver instance
     */
    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}
