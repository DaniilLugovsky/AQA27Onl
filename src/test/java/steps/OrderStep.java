package steps;

import baseEntities.BaseStep;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.CartOfGoodsPage;
import pages.CheckoutOverviewPage;
import pages.CompletingYourOrderPage;

public class OrderStep extends BaseStep {
    public OrderStep(WebDriver driver) {
        super(driver);
    }

    @Step(value = "Добавление товара в корзину")
    public CartOfGoodsPage addingItemToCart() {
        productsPage.clickAddToCartButton();
        productsPage.topMenuPage.clickShoppingButton();
        return cartOfGoodsPage;
    }

    @Step(value = "Ввод информации для оформления заказа")
    public CheckoutOverviewPage enteringPersonalData() {
        cartOfGoodsPage.clickCheckoutButton();
        checkoutInformationPage.setFirstNameInput("Name");
        checkoutInformationPage.setLastNameInput("LastName");
        checkoutInformationPage.setPostalInput("12345");
        checkoutInformationPage.clickContinueButton();
        return checkoutOverviewPage;
    }

    @Step(value = "Покупка товара")
    public CompletingYourOrderPage purchaseOfGoods() {
        checkoutOverviewPage.clickFinishButton();
        return completingYourOrderPage;
    }

    @Step(value = "Финальная проверка")
    public CompletingYourOrderPage finalCheck() {
        Assert.assertTrue(completingYourOrderPage.getFinalTitle().isDisplayed());
        return completingYourOrderPage;
    }
}
