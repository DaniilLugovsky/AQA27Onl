package baseEntities;


import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import configuration.ReadProperties;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import pages.CartOfGoodsPage;
import pages.ProductsPage;
import steps.OrderStep;
import steps.UserStep;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    protected UserStep userStep;
    protected OrderStep orderStep;
    protected CartOfGoodsPage cartOfGoodsPage;

    @BeforeSuite
    public void setupBrowser() {
        Configuration.browser = Browsers.CHROME;
    }
    @BeforeMethod
    public void setUp() {
        open(ReadProperties.getUrl());
        WebDriverRunner.driver().getWebDriver().manage().window().maximize();

        userStep = new UserStep();
        orderStep = new OrderStep();
        cartOfGoodsPage = new CartOfGoodsPage();
    }
}
