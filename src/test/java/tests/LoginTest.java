package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void shortSuccessLoginTest() {
                userStep.successfulLogin(ReadProperties.getUsername(), ReadProperties.getPassword());
    }
    @Test
    public void incorrectEmailLoginTest() {
        Assert.assertEquals(
                userStep.incorrectLogin("sdsd", ReadProperties.getPassword()).getErrorTextElement().getText(),
                "Email/Login or Password is incorrect. Please try again.",
                "Неверное сообщение об ошибке");
    }

}


