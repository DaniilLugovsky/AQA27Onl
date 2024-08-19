package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class AddingItemToCartTest extends BaseTest {

    @Test
    public void addingItem() {
        userStep.successfulLogin(ReadProperties.getUsername(),ReadProperties.getPassword());
        orderStep.addingItemToCart();
        $(cartOfGoodsPage.getItemInCart()).shouldBe(visible);
    }
}
