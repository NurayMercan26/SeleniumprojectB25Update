package com.cydeo.tests.Tasks;

import com.cydeo.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleButtons {
    public static void main(String[] args) {

        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to
        Driver.getDriver().get("https://letcode.in/buttons");

        //Get the X & y co- ordinates

        Driver.getDriver().findElement(By.id("position"));
        WebElement ele =  Driver.getDriver().findElement(By.id("position"));
         Point point =  ele.getLocation();
         int x = point.getX();
         int y = point.getY();
        System.out.println("x=> "+x + " Y=> "+y);

        //Find the color of the button
        WebElement btnColor =  Driver.getDriver().findElement(By.id("color"));
        String color =  btnColor.getCssValue("background-color");
        System.out.println(color);

        // Find the height & width of the button
        Rectangle rect = Driver.getDriver().findElement(By.id("property")).getRect();
        System.out.println(rect.getWidth());
        System.out.println(rect.getHeight());
        System.out.println(rect.getPoint());
        Dimension dime = rect.getDimension();
        System.out.println(dime);
        System.out.println(dime.getWidth());
        System.out.println(dime.getHeight());

        //confirm button is disabled
        boolean isDisabled = Driver.getDriver().findElement(By.id("isDisabled")).isEnabled();
        System.out.println(isDisabled);

     driver.quit();
    }
}
