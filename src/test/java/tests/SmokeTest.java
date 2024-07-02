package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.BrowsersService;

public class SmokeTest {
    @Test
    public void validateIKTCalculaion() throws InterruptedException {

        WebDriver driver = new BrowsersService().getDriver();

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

        driver.quit();
    }
}
