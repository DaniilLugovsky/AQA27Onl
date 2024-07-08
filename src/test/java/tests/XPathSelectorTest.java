package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import services.BrowsersService;

public class XPathSelectorTest {
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
    public void xpathSelectorsTest() {
        driver.get("F:\\ITDAn\\AQA27Onl\\src\\test\\resources\\index.html");

        // Абсолютный xpath
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div/div/div[4]/form/div[3]/input[3]")).isDisplayed());

        // Все эелемнты на странице начина с HTML
        driver.findElements(By.xpath("//*"));

        // Аналог поиска по tagName
        Assert.assertTrue(driver.findElement(By.xpath("//h1")).isDisplayed());

        // Аналог родительского div и на один уровень ниже р1
        Assert.assertTrue(driver.findElement(By.xpath("//div/h1")).isDisplayed());

        // Аналог родительского div и на любом уровене ниже div
        Assert.assertTrue(driver.findElement(By.xpath("//div//div")).isDisplayed());

        // Поиск элемента с тэгом div у которого есть аьттрибут id
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id]")).isDisplayed());

        // Поиск элемента у которого есть аттрибут id cо значением top-logo
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id = 'my-Address']")).isDisplayed());

        // Поиск элемента у которого есть аттрибут method cо значением и фттрибут target со значением
        Assert.assertTrue(driver.findElement(By.xpath("//*[@lang = 'it' and @title = 'Hello beautiful']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@lang = 'it' or @title = 'Hello beautiful']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[@lang = 'it'][@title = 'Hello beautiful']")).isDisplayed());

        // Поиск элемента у которого значение аттрибута начинается с
        Assert.assertTrue(driver.findElement(By.xpath("//*[starts-with(@id, 'iframe')]")).isDisplayed());

        // Поиск элемента у которого значение аттрибута содержит подстроку
        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@id, 'Result')]")).isDisplayed());

        // Поиск элемента у которого текстовое значение содержит равно
        Assert.assertTrue(driver.findElement(By.xpath("//h4[text() = 'Subscribe to my newsletter:']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//*[. = 'Dogs:']")).isDisplayed());

        // Поиск элемента у которого текстовое значение содержит подстроку
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(), 'animals!')]")).isDisplayed());

        // Поиск элемента по индексу
        Assert.assertTrue(driver.findElement(By.xpath("//table/tbody/tr[2]")).isDisplayed());
    }

    @Test
    public void axesSelectorsTest() {
        driver.get("F:\\ITDAn\\AQA27Onl\\src\\test\\resources\\index.html");

        // Поиск родителя у элемента с тэгом h1
        Assert.assertTrue(driver.findElement(By.xpath("//h1/..")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//h1/parent::div")).isDisplayed());

        // Поиск всех предков с тэгом div у элемента с тэгом h1
        Assert.assertTrue(driver.findElement(By.xpath("//h1/ancestor::div")).isDisplayed());

        // Использование child - все дочерние элементы с тэго a от div
        Assert.assertTrue(driver.findElement(By.xpath("//div/child::h1")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//div/h1")).isDisplayed());

        // Использование descendant - все дочерние элементы с тэго a от div
        Assert.assertTrue(driver.findElement(By.xpath("//div/descendant::h1")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//div//h1")).isDisplayed());

        //Использование following - Выбирает всё в документе после закрытия тэга текущего узла
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='noSel' and @style='margin-top:10px;']/following::h4")).isDisplayed());

        //Использование following-sibling - Выбирает все узлы одного уровня после текущего узла
        Assert.assertFalse(driver.findElement(By.xpath("//div[@class='noSel' and @style='margin-top:10px;']/following-sibling::*[@class and @style]")).isDisplayed());

        //Использование preceding- Выбирает все узлы, которые появляются перед текущим узлом в документе
        Assert.assertTrue(driver.findElement(By.xpath("//p[@lang]/preceding::p[@class]")).isDisplayed());

        //Использование preceding-sibling - Выбирает все узлы одного уровня до текущего узла
        Assert.assertTrue(driver.findElement(By.xpath("//p[@lang]/preceding-sibling::div[@id]")).isDisplayed());
    }
}
