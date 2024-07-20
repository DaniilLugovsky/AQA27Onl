package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTest {

    @Test
    public void uploadTest () {
        driver.get(ReadProperties.getUrl() + "upload");

        WebElement fileUploadElement = waitsService.presenceOfElementLocated(By.id("file-upload"));
        String pathToFile = "F:\\ITDAn\\AQA27Onl\\src\\test\\resources\\data\\download.jpeg";
        fileUploadElement.sendKeys(pathToFile);
        waitsService.elementToBeClickable(By.id("file-submit")).click();

        Assert.assertEquals(driver.findElement(By.id("uploaded-files")).getText(),"download.jpeg");
    }
}
