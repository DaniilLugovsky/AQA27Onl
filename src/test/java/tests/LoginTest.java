package tests;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void firstLoginTest() {
        Assert.assertTrue(userStep.successfulLogin("standard_user",ReadProperties.getPassword()).isPageOpened());
    }

    @Test
    public void secondLoginTest() {
        Assert.assertTrue(userStep.successfulLogin("performance_glitch_user",ReadProperties.getPassword()).isPageOpened());
    }

    @Test
    public void thirdLoginTest() {
        Assert.assertTrue(userStep.successfulLogin("problem_user",ReadProperties.getPassword()).isPageOpened());
    }
}
