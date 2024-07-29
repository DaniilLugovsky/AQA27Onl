package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartOfGoodsPage;

public class AddingItemToCartTest extends BaseTest {

    @Test(description = "Тест на добавление товара")
    @Description("Данный тест проверяет коректность добавление товара в корзину")
    @Severity(SeverityLevel.CRITICAL)
    public void addingItem() {
        userStep.successfulLogin(ReadProperties.getUsername(),ReadProperties.getPassword());
        orderStep.addingItemToCart();
        CartOfGoodsPage cartOfGoodsPage = new CartOfGoodsPage(driver);
        Assert.assertTrue(cartOfGoodsPage.getItemInCart().isDisplayed());
    }
}
