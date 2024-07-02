package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import services.BrowsersService;

public class SmokeTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new BrowsersService().getDriver();
    }
    @AfterMethod
    public void setDown() {
        driver.quit();
    }

    @Test
    public void validateIKTCalculaion() throws InterruptedException {


        driver.get("https://clinic-cvetkov.ru/company/kalkulyator-imt/");

        WebElement weight = driver.findElement(By.name("weight"));
        WebElement height = driver.findElement(By.name("height"));
        WebElement button = driver.findElement(By.id("calc-mass-c"));

        weight.sendKeys("71");
        weight.sendKeys(Keys.TAB);

        height.sendKeys("169");
        button.click();

        Thread.sleep(5000);

        WebElement result = driver.findElement(By.id("imt-result"));

        Assert.assertEquals(result.getText(), "24.9 - Норма");

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(result.getText(), "24.9 - Норма");
        softAssert.assertEquals(result.getText(), "24.8 - Норма");
        softAssert.assertEquals(button.getText(), "1Рассчитать");

        softAssert.assertAll();

    }


    @Test
    public void validateSKF() throws InterruptedException {
        driver.get("https://bymed.top/calc/%D1%81%D0%BA%D1%84-2148");
        Thread.sleep(2000);

        driver.switchTo().frame(1);

        WebElement selectWebElement = driver.findElement(By.id("cr-size"));
        Select selectCreateninType = new Select(selectWebElement);

        selectCreateninType.selectByIndex(1);
        Thread.sleep(2000);

        selectCreateninType.selectByValue("mg");
        Thread.sleep(2000);

        selectCreateninType.selectByVisibleText("мкмоль/л");
        Thread.sleep(2000);
    }
}
