package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import pages.CartOfGoodsPage;

public class RemovingAProductTest extends BaseTest {

    @Test(description = "Тест на удаление товара")
    @Description("Данный тест проверяет коректность удаления товара в корзину")
    @Severity(SeverityLevel.CRITICAL)
    public void removingAProduct() {
        userStep.successfulLogin(ReadProperties.getUsername(),ReadProperties.getPassword());
        orderStep.addingItemToCart();
        CartOfGoodsPage cartOfGoodsPage = new CartOfGoodsPage(driver);
        cartOfGoodsPage.clickDeleteItemInCartButton();
    }

}
