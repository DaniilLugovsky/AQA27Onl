package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void successLoginTest() {
        Assert.assertTrue(
                userStep.successfulLogin(
                                ReadProperties.getUsername(),
                                ReadProperties.getPassword()
                        )
                        .isPageOpened()
        );
        Assert.assertTrue(false);
    }

    @Test
    public void incorrectEmailLoginTest() {
        Assert.assertEquals(
                userStep.incorrectLogin("sdsd", ReadProperties.getPassword()).getErrorTextElement().getText(),
                "Email/Login or Password is incorrect. Please try again.",
                "Неверное сообщение об ошибке");
    }

    @Test
    public void incorrectPswLoginTest() {
        Assert.assertEquals(
                loginStep.incorrectLogin(ReadProperties.getUsername(), "123456").getErrorTextElement().getText(),
                "Email/Login or Password is incorrect. Please try again.",
                "Неверное сообщение об ошибке");
    }

    @Test
    public void shortPswLoginTest() {
        Assert.assertEquals(
                loginStep.incorrectLogin(ReadProperties.getUsername(), "123").getErrorFieldTextElement().getText(),
                "Password is too short (5 characters required).",
                "Неверное сообщение об ошибке");
    }
}
