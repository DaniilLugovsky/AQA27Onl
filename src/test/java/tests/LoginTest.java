package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(description = "Тест первого логина")
    @Description("Данный тест проверяет успешный логин системы с логином standard_user")
    @Severity(SeverityLevel.BLOCKER)
    public void firstLoginTest() {
        Assert.assertTrue(userStep.successfulLogin("standard_user",ReadProperties.getPassword()).isPageOpened());
    }

    @Test(description = "Тест второго логина")
    @Description("Данный тест проверяет успешный логин системы с логином performance_glitch_user")
    @Severity(SeverityLevel.BLOCKER)
    public void secondLoginTest() {
        Assert.assertTrue(userStep.successfulLogin("performance_glitch_user",ReadProperties.getPassword()).isPageOpened());
    }

    @Test(description = "Тест третьего логина")
    @Description("Данный тест проверяет успешный логин системы с логином problem_user")
    @Severity(SeverityLevel.BLOCKER)
    public void thirdLoginTest() {
        Assert.assertTrue(userStep.successfulLogin("problem_user",ReadProperties.getPassword()).isPageOpened());
        Assert.assertTrue(false);
    }
}
