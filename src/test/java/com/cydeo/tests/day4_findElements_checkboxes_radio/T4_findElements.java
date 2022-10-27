package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_findElements {

    public static void main(String[] args) {
        //TC#4: findElements  Task
        //1- Open a browser

        WebDriver driver =  WebDriverFactory.getDriver("chrome");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2- Goto https://practice.cydeo.com/abtest

        driver.get(" https://practice.cydeo.com/abtest");

        //3-locate all the links in the page

        //windows: alt+ enter-----> pres enter again
        //mac:option+ enter-----> pres enter again

        List<WebElement> alllinks = driver.findElements(By.tagName("a"));
        
        //4- Print out the number of links on the page
        System.out.println("alllinks.size() = " + alllinks.size());
        
        //5- Print out the number of links on the links

        for (WebElement each: alllinks) {
            System.out.println("Text of link: "+each.getText());
            System.out.println("HREF values: "+each.getAttribute("href"));
        }
        //6- Print out the HREF attribute values of the links
    }
}
