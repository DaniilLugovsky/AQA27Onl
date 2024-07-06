package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import services.BrowsersService;

public class HomeWorkTests {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new BrowsersService().getDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


    @Test
    public void validateSKF() {
        driver.get("https://bymed.top/calc/%D1%81%D0%BA%D1%84-2148");

        driver.switchTo().frame(1);

        WebElement age = driver.findElement(By.id("age"));
        age.sendKeys("23");

        WebElement gender = driver.findElement(By.id("sex"));
        Select genderType = new Select(gender);
        genderType.selectByVisibleText("Мужской");

        WebElement creatinine = driver.findElement(By.id("cr"));
        creatinine.sendKeys("100");

        WebElement selectCreatinineType = driver.findElement(By.id("cr-size"));
        Select CreatinineType = new Select(selectCreatinineType);
        CreatinineType.selectByVisibleText("мкмоль/л");

        WebElement selectRace = driver.findElement(By.id("race"));
        Select raceType = new Select(selectRace);
        raceType.selectByVisibleText("Другая");

        WebElement weight = driver.findElement(By.id("mass"));
        weight.sendKeys("70");

        WebElement height = driver.findElement(By.id("grow"));
        height.sendKeys("169");

        WebElement buttonCalculate = driver.findElement(By.cssSelector("#input-data > p:nth-child(7) > button"));
        buttonCalculate.click();

        WebElement valueByMDRD = driver.findElement(By.id("mdrd_res"));
        Assert.assertEquals(valueByMDRD.getText(), "80.32");

        WebElement valueByCKDEPI = driver.findElement(By.id("ckd_epi_res"));
        Assert.assertEquals(valueByCKDEPI.getText(),"90.99");

        WebElement valueByCockcroftGaultFormula = driver.findElement(By.id("cge_res"));
        Assert.assertEquals(valueByCockcroftGaultFormula.getText(),"100.56");
    }
    @Test
    public void validateEUHCalculator() {
        driver.get("https://kermi-fko.ru/raschety/Calc-Rehau-Solelec.aspx");

        WebElement width = driver.findElement(By.id("el_f_width"));
        width.sendKeys("50");

        WebElement length = driver.findElement(By.id("el_f_lenght"));
        length.sendKeys("10");

        WebElement room = driver.findElement(By.id("room_type"));
        Select roomType = new Select(room);
        roomType.selectByVisibleText("Кухня или спальня");

        WebElement heating = driver.findElement(By.id("heating_type"));
        Select heatingType = new Select(heating);
        heatingType.selectByVisibleText("Подогрев для комфорта");

        WebElement heatLossWatt = driver.findElement(By.id("el_f_losses"));
        heatLossWatt.sendKeys("200");

        WebElement buttonCalculate = driver.findElement(By.name("button"));
        buttonCalculate.click();

        WebElement powerOfHeatingCablePowerWatt = driver.findElement(By.id("floor_cable_power"));
        Assert.assertEquals(powerOfHeatingCablePowerWatt.getAttribute("value"),"111");

        WebElement specificHeatingPowerCableOrMatWatt = driver.findElement(By.id("spec_floor_cable_power"));
        Assert.assertEquals(specificHeatingPowerCableOrMatWatt.getAttribute("value"),"0");

    }
}
