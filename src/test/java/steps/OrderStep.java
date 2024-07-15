package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.CartOfGoodsPage;
import pages.CheckoutOverviewPage;
import pages.CompletingYourOrderPage;

public class OrderStep extends BaseStep {
    public OrderStep(WebDriver driver) {
        super(driver);
    }

    public CartOfGoodsPage addingItemToCart() {
        productsPage.clickAddToCartButton();
        productsPage.topMenuPage.clickShoppingButton();
        return cartOfGoodsPage;
    }

    public CheckoutOverviewPage enteringPersonalData() {
        cartOfGoodsPage.clickCheckoutButton();
        checkoutInformationPage.setFirstNameInput("Name");
        checkoutInformationPage.setLastNameInput("LastName");
        checkoutInformationPage.setPostalInput("12345");
        checkoutInformationPage.clickContinueButton();
        return checkoutOverviewPage;
    }

    public CompletingYourOrderPage purchaseOfGoods() {
        checkoutOverviewPage.clickFinishButton();
        return completingYourOrderPage;
    }

    public CompletingYourOrderPage finalCheck() {
        Assert.assertTrue(completingYourOrderPage.getFinalTitle().isDisplayed());
        return completingYourOrderPage;
    }
}
