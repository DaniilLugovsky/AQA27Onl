package baseEntities;

import com.github.javafaker.Faker;
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
    protected Faker faker;

    public BaseStep() {
        loginPage = new LoginPage();
        productsPage = new ProductsPage();
        cartOfGoodsPage = new CartOfGoodsPage();
        checkoutInformationPage = new CheckoutInformationPage();
        checkoutOverviewPage = new CheckoutOverviewPage();
        completingYourOrderPage = new CompletingYourOrderPage();

        faker = new Faker();
    }
}
