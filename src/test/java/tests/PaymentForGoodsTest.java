package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class PaymentForGoodsTest extends BaseTest {

    @Test(description = "Тест на оплату")
    @Description("Данный тест проверяет коректность оплаты товара")
    @Severity(SeverityLevel.CRITICAL)
    public void payment() {
        userStep.successfulLogin(ReadProperties.getUsername(), ReadProperties.getPassword());
        orderStep.addingItemToCart();
        orderStep.enteringPersonalData();
        orderStep.purchaseOfGoods();
        orderStep.finalCheck();
    }
}
