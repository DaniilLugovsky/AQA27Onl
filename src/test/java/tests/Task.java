package tests;

import configuration.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import services.BrowsersService;



public class Task {
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
    public void checkingWebElements() throws InterruptedException {
        driver.get(ReadProperties.getUrl());

        // id
        driver.findElement(By.id("user-name")).sendKeys(ReadProperties.username());

        // name
        driver.findElement(By.name("password")).sendKeys(ReadProperties.password());

        // classname
        driver.findElement(By.className("submit-button")).click();

        Thread.sleep(1000);




        //css [attribute|=value]
        Assert.assertEquals(6,driver.findElements(By.cssSelector("[class|= 'inventory_item_name ']")).size());

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        // css #id
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-bike-light")).click();

        driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
        driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();

        // css .class
        driver.findElement(By.cssSelector(".shopping_cart_link")).click();

        Thread.sleep(1000);




        // linktext
        Assert.assertTrue(driver.findElement(By.linkText("Sauce Labs Backpack")).isDisplayed());

        // partiallinktext
        Assert.assertTrue(driver.findElement(By.partialLinkText("Light")).isDisplayed());

        // .class1 .class2
        Assert.assertEquals(6,driver.findElements(By.cssSelector(".item_pricebar .inventory_item_price")).size());

        // xpath Поиск по тексту
        Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']")).isDisplayed());

        // xpath Поиск по частичному совпадению текста
        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'Labs Onesie')]")).isDisplayed());

        Assert.assertTrue(driver.findElement(By.linkText("Test.allTheThings() T-Shirt (Red)")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.linkText("Sauce Labs Backpack")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//div[text() = '9.99']")).isDisplayed());

        //xpath ancestor
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='inventory_item_price']/ancestor::div[@class='cart_item_label']/a/div[text()='Sauce Labs Bolt T-Shirt']")).isDisplayed());

        Assert.assertTrue(driver.findElement(By.xpath("//div[text() = '49.99'] ")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//div[text() = '7.99'] ")).isDisplayed());

        // xpath following
        Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Test.allTheThings() T-Shirt (Red)']/following::div[@class='inventory_item_price']")).isDisplayed());

        Assert.assertTrue(driver.findElement(By.xpath("//div[text() = '29.99'] ")).isDisplayed());

        //css tagname.class
        driver.findElement(By.cssSelector("button.checkout_button")).click();
        Thread.sleep(1000);




        //css [attribute=value]
        driver.findElement(By.cssSelector("[placeholder = 'First Name']")).sendKeys("name");

        //css [attribute^=value]
        driver.findElement(By.cssSelector("[name ^= 'last']")).sendKeys("last");

        //css [attribute~=value]
        driver.findElement(By.cssSelector("[placeholder~= 'Code']")).sendKeys("code");

        //css [attribute$=value]
        driver.findElement(By.cssSelector("[value$= 'nue']")).click();

        Thread.sleep(1000);



        //xpath Поиск по атрибуту
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).isDisplayed());


        //xpath Поиск по частичному совпадению атрибута
        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(@id,'_0_title_link')]")).isDisplayed());


        //css .class1.class2
        Assert.assertTrue(driver.findElement(By.cssSelector(".btn.btn_secondary.back.btn_medium.cart_cancel_link")).isDisplayed());

        // tagname
        Assert.assertEquals(4,driver.findElements(By.tagName("button")).size());

        //xpath parent
        Assert.assertTrue(driver.findElement(By.xpath("//div/parent::a[@id='item_4_title_link']")).isDisplayed());

        //xpath descendant
        Assert.assertEquals(6,driver.findElements(By.xpath("//div[@class='cart_list']/descendant::div[@class='inventory_item_name']")).size());

        //xpath поиск элемента с условием AND
        Assert.assertTrue(driver.findElement(By.xpath("//button[@data-test and @name='cancel']")).isDisplayed());

        //xpath preceding
        Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']/preceding::div[@class='inventory_item_price']")).isDisplayed());

        //css [attribute*=value]
        driver.findElement(By.cssSelector("[data-test*= 'ini']")).click();




        Thread.sleep(1000);

        //css tagname
        Assert.assertEquals(3,driver.findElements(By.cssSelector("img")).size());
    }


}


