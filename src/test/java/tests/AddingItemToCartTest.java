package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartOfGoodsPage;

public class AddingItemToCartTest extends BaseTest {

    @Test
    public void addingItem() {
        userStep.successfulLogin(ReadProperties.getUsername(),ReadProperties.getPassword());
        orderStep.addingItemToCart();
        CartOfGoodsPage cartOfGoodsPage = new CartOfGoodsPage(driver);
        Assert.assertTrue(cartOfGoodsPage.getItemInCart().isDisplayed());
    }
}
