package com.cydeo.tests.Tasks;

import com.cydeo.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingInputs {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to
        Driver.getDriver().get("https://letcode.in/edit");

        //Enter your full name
        Driver.getDriver().findElement(By.xpath("//input[@id='fullName']")).sendKeys("Nuray Mercan");

        //Append a text and press keyboard tab
        Driver.getDriver().findElement(By.id("join")).sendKeys("person", Keys.TAB);

        //What is inside the text box
        String myValue = Driver.getDriver().findElement(By.id("getMe")).getAttribute("value");

        //Clear the text
        Driver.getDriver().findElement(By.id("clearMe")).clear();

        //Confirm edit field is disabled
        boolean isEdit =  Driver.getDriver().findElement(By.id("noEdit")).isEnabled();
        System.out.println(isEdit);

        //Confirm text is readonly
        String isReadonly = Driver.getDriver().findElement(By.id("dontwrite")).getAttribute("readonly");
        System.out.println(isReadonly);

        //quit browser
        driver.quit();
    }

}
