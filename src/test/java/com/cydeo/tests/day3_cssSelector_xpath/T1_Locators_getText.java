package com.cydeo.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_Locators_getText {
    public static void main(String[] args) {

        // TC #1: NextBaseCrm, locators and getText() paractice
        //1- Open a Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");


        //3- Verify "remember me" label text is an expected:
        //Expected: Remember me on this computer
       WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));

       String expectedRememberMeLabel = "Remember me on this computer";
       String actualRememberMeLabel = rememberMeLabel.getText();

        if(actualRememberMeLabel.equals(expectedRememberMeLabel)){
           System.out.println("label verification PASSED! ");
       }else{
          System.out.println("Label verification FAILED!!!");
        }
        //4- Verify "forgot password"link text is as expected:
        //Expected: Forgot your password?
        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));
        String expectedForgotPasswordLinkText = "Forgot your password?";
        String actualForgotPasswordLinkText = forgotPasswordLink.getText();

        if(actualForgotPasswordLinkText.equals(expectedForgotPasswordLinkText)){
            System.out.println("Forgot password link verification PASSED!");
        }else{
            System.out.println("actualForgotPasswordLinkText = " + actualForgotPasswordLinkText);
            System.out.println("expectedForgotPasswordLinkText = " + expectedForgotPasswordLinkText);
            System.out.println("Forgot password link verification FAILED!!!");
        }
        //5-Verify "forgot password"href attribute's value contains expected:
        //Expected: forgot_password=yes

          String expectedInHref = "forgot_password=yes";
        String actualHrefAttributeValue = forgotPasswordLink.getAttribute("href");
        System.out.println("actualHrefAttributeValue = " + actualHrefAttributeValue);

        if(actualHrefAttributeValue.contains(expectedInHref)){
            System.out.println("HREF attribute value verification PASSED!");
        }else{
            System.out.println("HREF attribute value verification FAILED!!!");
        }




    }
}
