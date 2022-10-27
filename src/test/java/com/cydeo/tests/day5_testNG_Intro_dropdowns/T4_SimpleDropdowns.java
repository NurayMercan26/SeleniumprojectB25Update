package com.cydeo.tests.day5_testNG_Intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_SimpleDropdowns {
    WebDriver driver;
@BeforeMethod
public void setupMethod(){
    // 1. Open Chrome browser

    driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    // 2. Go to https://practice.cydeo.com/dropdown
    driver.get("https://practice.cydeo.com/dropdown");
    // 3. Verify “Simple dropdown” default selected value is correct
}
    @Test
    public void simpleDropdownTest(){
       // TC#4: Verifying “Simple dropdown” and “State selection” dropdown

        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        WebElement currentLySelectedOption =  simpleDropdown.getFirstSelectedOption();

        String actualSimpleDropdownText = currentLySelectedOption.getText();
        String expectedSimpleDropdownText = "Please select an option";


       // Expected: “Please select an option”
        Assert.assertEquals(actualSimpleDropdownText,expectedSimpleDropdownText);

       // 4. Verify “State selection” default selected value is correct
        Select stateDropDown = new Select (driver.findElement(By.xpath("//select[@id='state']")));


       // Expected: “Select a State”
        String expectedStateDropdownText = "Select a State";
        String actualStateDropdownText =  stateDropDown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualStateDropdownText,expectedStateDropdownText);

        Assert.assertEquals(stateDropDown.getFirstSelectedOption().getText(),"Select a State");
    }
}
