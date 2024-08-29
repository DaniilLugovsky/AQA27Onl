package steps;

import baseEntities.BaseStep;
import pages.CartOfGoodsPage;
import pages.CheckoutOverviewPage;
import pages.CompletingYourOrderPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class OrderStep extends BaseStep {
    public OrderStep() {
        super();
    }

    public CartOfGoodsPage addingItemToCart() {
        if (!productsPage.getAddToCartButton().isDisplayed()) {
            productsPage.getRemoveButton().click();
        }
        productsPage.clickAddToCartButton();
        productsPage.topMenuPage.clickShoppingButton();
        return cartOfGoodsPage;
    }

    public CheckoutOverviewPage enteringPersonalData() {
        cartOfGoodsPage.clickCheckoutButton();
        checkoutInformationPage.setFirstNameInput(faker.name().firstName());
        checkoutInformationPage.setLastNameInput(faker.name().lastName());
        checkoutInformationPage.setPostalInput(faker.bothify("#######"));
        checkoutInformationPage.clickContinueButton();
        return checkoutOverviewPage;
    }

    public CompletingYourOrderPage purchaseOfGoods() {
        checkoutOverviewPage.clickFinishButton();
        return completingYourOrderPage;
    }

    public CompletingYourOrderPage finalCheck() {
        $(completingYourOrderPage.getFinalTitle()).shouldBe(visible);
        return completingYourOrderPage;
    }
}
