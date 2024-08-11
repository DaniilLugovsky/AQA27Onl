package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import steps.UserStep;

public class LoginTest extends BaseTest {

    @Test
    public void successLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setEmailValue(ReadProperties.username());
        loginPage.setPasswordValue(ReadProperties.password());
        loginPage.clickLogin();
    }

    @Test void shortSuccessLoginTest() {
        Assert.assertTrue(
                userStep.successfulLogin(ReadProperties.username(), ReadProperties.password()).isPageOpened());
    }

    @Test
    public void incorrectEmailLoginTest() {
        Assert.assertEquals(
                userStep.incorrectLogin("sdsd", ReadProperties.password()).getErrorTextElement().getText(),
                "Email/Login or Password is incorrect. Please try again.",
                "Неверное сообщение об ошибке");
    }

    @Test
    public void incorrectPswLoginTest() {
        Assert.assertEquals(
                userStep.incorrectLogin(ReadProperties.username(), "123456").getErrorTextElement().getText(),
                "Email/Login or Password is incorrect. Please try again.",
                "Неверное сообщение об ошибке");
    }

    @Test
    public void shortPswLoginTest() {
        Assert.assertEquals(
                userStep.incorrectLogin(ReadProperties.username(), "123").getErrorFieldTextElement().getText(),
                "Password is too short (5 characters required).",
                "Неверное сообщение об ошибке");
    }
}
