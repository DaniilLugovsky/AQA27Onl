package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DynamicControlsTest extends BaseTest {

    @Test
    public void controlsTest() {
        driver.get(ReadProperties.getUrl() + "dynamic_controls");

        driver.findElement(By.xpath("//button[text() = 'Remove']")).click();

        waitsService.waitVisibilityOf(By.id("message"));

        waitsService.invisibilityOf(By.id("checkbox"));

        Assert.assertFalse(driver.findElement(By.xpath("//input[@type = 'text']")).isEnabled());

        driver.findElement(By.xpath("//button[text() = 'Enable']")).click();

        waitsService.waitVisibilityOf(By.id("message"));

        Assert.assertTrue(driver.findElement((By.xpath("//input[@type = 'text']"))).isEnabled());
    }
}
