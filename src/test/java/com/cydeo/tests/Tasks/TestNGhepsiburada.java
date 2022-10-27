package com.cydeo.tests.Tasks;

import com.cydeo.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestNGhepsiburada {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

   @AfterMethod
    public void tearDownMethod() {
        System.out.println("test bitti");
      //  driver.close();
    }

    @BeforeClass
    public void setupMethod() {
        System.out.println("---->BeforeClass is running!");
    }

    @AfterClass
    public void teardownClass() {
        System.out.println("---->AfterClass is running");
    }


    @Test(priority = 1)
    public void test1() {

        Driver.getDriver().get("https://www.hepsiburada.com/");
        //Enter Search
        WebElement search = Driver.getDriver().findElement(By.xpath("//input[@placeholder='Ürün, kategori veya marka ara']"));
        search.sendKeys("iPhone 13 128 GB", Keys.ENTER);

      //  WebElement searcBtn = Driver.getDriver().findElement(By.className("SearchBoxOld-cHxjyU99nxdIaAbGyX7F"));
     //  search.sendKeys("iPhone 13 128 GB");
         //Enter item
     // WebElement ıtem = Driver.getDriver().findElement(By.xpath("//h3[@class='moria-ProductCard-gLyfvY cXehI swibq13sqou']"));
     // ıtem.click();


        //ıphone 13 color
       // WebElement ıphoneColor = driver.findElement(By.xpath("//h3[@text='iPhone 13 128 GB']"));



    }
}