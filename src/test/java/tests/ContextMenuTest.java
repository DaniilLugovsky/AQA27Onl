package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTest {

    @Test
    public void contextTest() {
        driver.get(ReadProperties.getUrl() + "context_menu");

        WebElement field = driver.findElement(By.id("hot-spot"));
        actions.contextClick(field).build().perform();

        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "You selected a context menu");

        alert.dismiss();
    }
}
