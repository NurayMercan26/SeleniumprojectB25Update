package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {
    public static void main(String[] args) {
        //TC #3: NextBaseCrm, locators and getText(), getAttribute() paractice
        // 1- Open a Chrome browser
       WebDriver driver = WebDriverFactory.getDriver("chrome");
       // WebDriverManager.chromedriver().setup();
       // WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
        //3- Verify "Log in" button text is an expected:
        //Expected: Log In
        // WebElement signInButton = driver.findElement(By.className("login-btn");
         //              tagName[attribute='value']
        //LOCATED USING CLASS ATTRIBUTE
        // WebElement signInButton = driver.findElement(By.cssSelector("input[class='login-btn']"));
        // LOCATED USING TYPE ATTRIBUTE
        // WebElement signInButton = driver.findElement(By.cssSelector("input[type='submit']"));
        //LOCATED USING VALUE ATTRIBUTE
         WebElement signInButton = driver.findElement(By.cssSelector("input[value='Log In']"));

         String expectedButtonText = "Log In";
         //Getting the value of the attribute "value"
        String actualButtonText = signInButton.getAttribute("value");
        System.out.println("actualButtonText = " + actualButtonText);

        if(actualButtonText.equals(expectedButtonText)){
            System.out.println("Log In button text verification passed!");
        }else{
            System.out.println("Log In button text verification failed!");
        }

    }
}
