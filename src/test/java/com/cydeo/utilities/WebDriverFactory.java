package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverFactory {
     /*
    Task: New Method Creation
    Method name: getDriver
    Static method
    Accepts String arg: browserType
    - This arg will determine what type of browser is opened
    - if "chrome" passed --> it will open Chrome browser
    - if "firefox" passed --> it will open Firefox browser
    RETURN TYPE: "WebDriver"
     */

    public static org.openqa.selenium.WebDriver getDriver(String browserType){
        if (browserType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }else if(browserType.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else if(browserType.equalsIgnoreCase("safari")){
            WebDriverManager.safaridriver().setup();
            return new SafariDriver();
        }else {
            System.out.println("Given browser type does not exist/or is not currently supported");
            System.out.println("Driver = null");
            return null;
        }
    }
}
