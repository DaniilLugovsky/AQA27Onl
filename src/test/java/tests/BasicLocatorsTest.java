package tests;

import configuration.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import services.BrowsersService;


public class BasicLocatorsTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new BrowsersService().getDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void basicLocator_1() {
        driver.get(ReadProperties.getUrl());

        driver.findElement(By.id("name")).sendKeys(ReadProperties.username());

        driver.findElement(By.name("password")).sendKeys(ReadProperties.password());

        driver.findElement(By.tagName("button")).click();

    }

    @Test
    public void basicLocator_2() {
        driver.get(ReadProperties.getUrl());

        driver.findElement(By.linkText("Forgot your password?")).click();

        driver.findElement(By.className("passwordpage-button")).click();

        driver.findElement(By.partialLinkText("your password")).click();



    }
}