package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.annotations.Test;
import pages.CartOfGoodsPage;

public class RemovingAProductTest extends BaseTest {

    @Test
    public void removingAProduct() {
        userStep.successfulLogin(ReadProperties.getUsername(),ReadProperties.getPassword());
        userStep.addingItemToCart();
        CartOfGoodsPage cartOfGoodsPage = new CartOfGoodsPage(driver);
        cartOfGoodsPage.clickDeleteItemInCartButton();
    }

}
