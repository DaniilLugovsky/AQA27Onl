package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.annotations.Test;

public class PaymentForGoodsTest extends BaseTest {

    @Test
    public void payment() {
        userStep.successfulLogin(ReadProperties.getUsername(), ReadProperties.getPassword());
        userStep.addingItemToCart();
        userStep.enteringPersonalData();
        userStep.purchaseOfGoods();
        userStep.finalCheck();
    }
}
