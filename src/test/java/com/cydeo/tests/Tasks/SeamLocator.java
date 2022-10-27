package com.cydeo.tests.Tasks;

import com.cydeo.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SeamLocator {

    public static void main(String[] args) {

        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to
        Driver.getDriver().get("https://qa.seamlessly.net/index.php/settings/user");

       //Enter Username
        WebElement UserName= Driver.getDriver().findElement(By.id("user"));
        UserName.sendKeys("Employee111");

        //Enter Password
        WebElement Password= Driver.getDriver().findElement(By.id("password"));
        Password.sendKeys("Employee123");

        //Enter login button
        WebElement loginButton = Driver.getDriver().findElement(By.id("submit-form"));
        loginButton.click();

        //Enter fullName
        WebElement fullName = Driver.getDriver().findElement(By.id("displayname"));
        fullName.sendKeys("Nuray Mercan");

        //Enter email
        WebElement email = Driver.getDriver().findElement(By.id("email"));
        email.sendKeys("nuraymercan26@gmail.com");

        //Enter ScopeMenu
        WebElement scopeMenu = Driver.getDriver().findElement(By.className("icon-triangle-s"));
        scopeMenu.click();



       //Enter menu detail
       // WebElement IconPhone =Driver.getDriver().findElement(By.className("menuitem-text-detail"));

      //  Select menuIconPhone = new Select(IconPhone);
       // menuIconPhone.selectByVisibleText("Private");
       //  menuIconPhone.selectByIndex(1);

       // IconPhone.sendKeys("Private");
       // IconPhone.getAttribute("menuitem action action-v2-private permanent active");

        //WebElement Private= Driver.getDriver().findElement(By.xpath("//href[@class = "menuitem action action-v2-private permanent active"]));
        //WebElement Private = Driver.getDriver().findElement(By.className("menuitem action action-v2-local permanent "))

       // Select menuIconPhone = new Select(IconPhone);
     //  menuIconPhone.selectByVisibleText("Private");
    //   System.out.println(menuIconPhone.isMultiple());
      // List<WebElement> allPhone = menuIconPhone.getOptions();
     // allPhone.forEach(i -> System.out.println(i.getText()));

        //Enter phone
        WebElement phone = Driver.getDriver().findElement(By.id("phone"));
        phone.sendKeys("05064251475");

        //Enter Address
        WebElement Address = Driver.getDriver().findElement(By.id("address"));
        Address.sendKeys("21.Sok. Batıkent Ankara");

        //Enter Language
        WebElement language = Driver.getDriver().findElement(By.id("language"));
        Select MultiLanguage = new Select(language);
         MultiLanguage.selectByVisibleText("English (US)");
        // MultiLanguage.selectByIndex(1);
        System.out.println(MultiLanguage.isMultiple());
        List<WebElement> allLanguage = MultiLanguage.getOptions();
         allLanguage.forEach(i -> System.out.println(i.getText()));


         //Enter Locale
        WebElement Locale = Driver.getDriver().findElement(By.id("localeinput"));
        Select MultiLocale = new Select(Locale);
        MultiLocale.selectByVisibleText("Turkish");
        List<WebElement> allLocale = MultiLanguage.getOptions();
        allLocale.forEach(i -> System.out.println(i.getText()));

        //Enter Website
        WebElement webSite = Driver.getDriver().findElement(By.id("website"));
        webSite.sendKeys("https://cydeo.com/");

        //Enter Twitter
        WebElement Twitter = Driver.getDriver().findElement(By.id("twitter"));
        Twitter.sendKeys("@NurayMercan");

        //Enter Organisation
        WebElement organisation = Driver.getDriver().findElement(By.id("organisation"));
        organisation.sendKeys("CYDEO SCHOOL");


        //Enter Role
        WebElement role = Driver.getDriver().findElement(By.id("role"));
        role.sendKeys("Student");

        //Enter Headline
       WebElement headline = Driver.getDriver().findElement(By.id("headline"));
       headline.sendKeys("My life");

       //Enter about
        WebElement About = Driver.getDriver().findElement(By.id("biography"));
        About.sendKeys("Let go of the past, look to the beautiful future...");









    }

}
