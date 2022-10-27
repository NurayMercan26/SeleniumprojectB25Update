package com.cydeo.tests.Tasks;

import com.cydeo.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandleDropDown {



    public static void main(String[] args) {
//1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //2. Go to
        Driver.getDriver().get("https://letcode.in/dropdowns");


        //Select the apple using visible text
       // Driver.getDriver().findElement(By.id("fruits"));
       WebElement fruits =  Driver.getDriver().findElement(By.cssSelector("#fruits"));
        Select myFruits = new Select(fruits);
        myFruits.selectByVisibleText("Apple");
        myFruits.selectByVisibleText("Banana");
        System.out.println(myFruits.isMultiple());
        List<WebElement>allfruits = myFruits.getOptions();
        allfruits.forEach(i -> System.out.println(i.getText()));


        //Select India using value & print the selected value
       WebElement country =  Driver.getDriver().findElement(By.id("country"));
       Select myCountry = new Select(country);
       myCountry.selectByValue("India");
       WebElement selectedCountry = myCountry.getFirstSelectedOption();
        System.out.println(selectedCountry.getText());

       //Select your super hero's
        WebElement heros = Driver.getDriver().findElement(By.id("superheros"));
        Select myHeros = new Select(heros);
        boolean isMul = myHeros.isMultiple();
        System.out.println("Is Multiple? "+isMul);
        myHeros.selectByIndex(1);
        myHeros.selectByValue("bt");
        //TODO:loops
        List<WebElement>allHeros = myHeros.getAllSelectedOptions();
        for (WebElement webElement : allHeros) {
            System.out.println(webElement.getText());

        }

       myHeros.deselectByIndex(1);
      // myFruits.deselectByVisibleText("Banana");

      //bootStrap dd
        Driver.getDriver().get("https://semantic-ui.com/modules/dropdown.html");
        Driver.getDriver().findElement(By.xpath("//div[contains(@class,'ui selection')]"));
        Driver.getDriver().findElement(By.xpath("(//div[text()='Male'])[1]")).click();


    }
}
