package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import services.BrowsersService;

public class CssSelectorTest {
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
    public void cssSelectorsTest() {
        driver.get("file:F:\\ITDAn\\AQA27Onl\\src\\test\\resources\\index.html");

        Assert.assertTrue(driver.findElement(By.id("my-Address")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("#my-Address")).isDisplayed());

        Assert.assertTrue(driver.findElement(By.className("newsletter")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector(".newsletter")).isDisplayed());

        Assert.assertTrue(driver.findElement(By.tagName("h1")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.cssSelector("h1")).isDisplayed());

        Assert.assertTrue(driver.findElement(By.cssSelector("div.intro")).isDisplayed());

        Assert.assertEquals(2, driver.findElements(By.cssSelector("#Lastname span.markup")).size());
        Assert.assertEquals(2, driver.findElement(By.id("Lastname")).findElements(By.cssSelector(".markup")).size());

        Assert.assertEquals(2, driver.findElements(By.cssSelector("body #helpIntro div.intro #Lastname")).size());
        WebElement body = driver.findElement(By.tagName("body"));
        WebElement helpIntro = body.findElement(By.id("helpIntro"));
        WebElement divIntro = helpIntro.findElement(By.cssSelector("div.intro"));
        WebElement lastname = divIntro.findElement(By.id("lastname"));
        Assert.assertTrue(lastname.isDisplayed());

        Assert.assertEquals(8, driver.findElements(By.cssSelector("h1, p")).size());

        Assert.assertEquals(6, driver.findElements(By.cssSelector("div > p")).size());

        Assert.assertEquals(1, driver.findElements(By.cssSelector("ul + p")).size());
    }
}
