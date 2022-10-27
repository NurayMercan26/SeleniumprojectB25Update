package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T4_checkboxes {
    public static void main(String[] args) throws InterruptedException {
        //Practice Checkboxes
        //1.Go to https://practice.cydeo.com/checkboxes
       WebDriver driver =  WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.get("https://practice.cydeo.com/checkboxes");

       //We have to locate checkbox

        WebElement checkbox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));

        //Confirm Checkbox #1: is Not selected

        System.out.println("checkbox1.isSelected(), expecting true " + checkbox1.isSelected());

        //Click Checkbox #1: is to selected

        System.out.println("checkbox2.isSelected(), expecting false " + checkbox2.isSelected());

        //Click Checkbox #1: is  deselected to

        Thread.sleep(2000);
        checkbox1.click();

        //Confirm Checkbox #1: is  SELECTED

        Thread.sleep(2000);
        checkbox2.click();

        //Confirm Checkbox #1: is SELECTED

        System.out.println("checkbox1.isSelected(), expecting true " + checkbox1.isSelected());

        //Confirm Checkbox #2: is NOT selected

        System.out.println("checkbox2.isSelected(), expecting false " + checkbox2.isSelected());
    }
}
