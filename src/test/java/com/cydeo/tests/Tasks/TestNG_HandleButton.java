package com.cydeo.tests.Tasks;

import com.cydeo.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestNG_HandleButton {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }

    @BeforeClass
    public void setupMethod(){
        System.out.println("---->BeforeClass is running!");
    }

    @AfterClass
    public void teardownClass(){
        System.out.println("---->AfterClass is running");
    }


    @Test(priority = 1)
    public void test1(){


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


    }
    @Test(priority = 2)
    public void Test2(){
        //2. Go to
        Driver.getDriver().get("https://letcode.in/dropdowns");


        //Select the apple using visible text
        // Driver.getDriver().findElement(By.id("fruits"));
        WebElement fruits =  Driver.getDriver().findElement(By.cssSelector("#fruits"));
        Select myFruits = new Select(fruits);
        myFruits.selectByVisibleText("Apple");
        myFruits.selectByVisibleText("Banana");
        System.out.println(myFruits.isMultiple());
        List<WebElement> allfruits = myFruits.getOptions();
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
    }

    @Test(priority = 3)
    public void Test3(){
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
    }

}
