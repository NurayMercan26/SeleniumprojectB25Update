package com.cydeo.tests.Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_YahooTitleVerification {
    public static void main(String[] args) {

    // TC #1: Yahoo Title Verification
    //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

    //2. Go to
        driver.navigate().to("https://www.yahoo.com");
    //3. Verify title:
    //Expected: Yahoo
        String expectedTitle ="Yahoo";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }

        driver.close();

    }
}
