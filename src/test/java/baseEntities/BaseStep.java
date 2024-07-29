package baseEntities;

import org.openqa.selenium.WebDriver;
import pages.*;

public class BaseStep {
    protected WebDriver driver;

    protected LoginPage loginPage;

    protected ProductsPage productsPage;

    protected CartOfGoodsPage cartOfGoodsPage;

    protected CheckoutInformationPage checkoutInformationPage;

    protected CheckoutOverviewPage checkoutOverviewPage;

    protected CompletingYourOrderPage completingYourOrderPage;

    public BaseStep(WebDriver driver) {
        this.driver = driver;
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
        cartOfGoodsPage = new CartOfGoodsPage(driver);
        checkoutInformationPage = new CheckoutInformationPage(driver);
        checkoutOverviewPage = new CheckoutOverviewPage(driver);
        completingYourOrderPage = new CompletingYourOrderPage(driver);
    }
}
