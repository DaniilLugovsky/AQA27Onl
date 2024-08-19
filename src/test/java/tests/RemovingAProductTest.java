package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.annotations.Test;

public class RemovingAProductTest extends BaseTest {

    @Test
    public void removingAProduct() {
        userStep.successfulLogin(ReadProperties.getUsername(),ReadProperties.getPassword());
        orderStep.addingItemToCart();
        cartOfGoodsPage.clickDeleteItemInCartButton();
    }

}
