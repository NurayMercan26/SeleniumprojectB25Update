package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {

    public static void main(String[] args) {

  //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS
        //TC #1: XPATH and cssSelector Practices
        //Open Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        // Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

        //Locate all the WebElements on the page using XPATH and/or CSS
        //Locator only(total of 6)
        //a."Home"link

        //locate homeLink using cssSelector class value
        WebElement homeLink_ex1 = driver.findElement(By.cssSelector("a[class = 'nav-link']"));
        //locate homeLink using cssSelector syntax #2
        WebElement homeLink_ex2 = driver.findElement(By.cssSelector("a.nav-link"));
        //locate homeLink using cssSelector href value
        WebElement homeLink_ex3 = driver.findElement(By.cssSelector("a[href='/']"));

        //b."Forgot password" header
        //locate header using cssSelector: Locate parent element and move down to h2

        WebElement header_ex1= driver.findElement(By.cssSelector("div.example > h2"));

        //locate header using xpath, and using web element text"Forgot Password"
       // WebElement header_ex2 = driver.findElement(By.cssSelector("//h2[text()='Forgot Password']"));
        //c. "E-mail" text

        WebElement emailLabel= driver.findElement(By.xpath("//label[@for='email']"));

        //d.Email input box
         // tagName[contains (@attribute,'value']

       // WebElement inputBox_ex1 = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement inputBox_ex2 = driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));

        //e."Retrieve password"button
        //button[@type='submit']
        //button[@class='radius']
       WebElement retrievePasswordBtn = driver.findElement(By.xpath("//button[@id='form_submit']"));


        //f."Powered by Cydeo"text

       // WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align:center;']"));
        //4. Verify all web elements are displayed
        System.out.println("homeLink_ex1.isDisplayed() = " + homeLink_ex1.isDisplayed());
        System.out.println("header_ex1.isDisplayed() = " + header_ex1.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("inputBox_ex2.isDisplayed() = " + inputBox_ex2.isDisplayed());
        System.out.println("retrievePasswordBtn.isDisplayed() = " + retrievePasswordBtn.isDisplayed());
        


    }
}
