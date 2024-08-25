package tests;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

@Epic("Allure Epic")
@Feature("Allure feature")
public class AllureTest {

    @Test(description = "Human-readable test name")
    public void testName() {
        Assert.assertTrue(true);
    }
    @Test(testName = "Human-readable test name")
    public void testName1() {
        Assert.assertTrue(true);
    }
    @Test
    @Description("Some detailed test description")
    @Story("Test Story")
    public void testDescription() {
        Assert.assertTrue(true);
    }
    @Test(description = "Тест на проверку логина")
    @Description("Данный тест проверяет успешный логин системыы")
    @Story("Test Story1")
    public void testNameAndDescription() {
        Assert.assertTrue(true);
    }
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Story("Test Story")
    public void testSeverity() {
        Assert.assertTrue(true);
    }
    @Test
    @TmsLink("spock/")
    @TmsLink("testng/")
    public void testTMS() {
        Assert.assertTrue(true);
    }
    @Test
    @Issue("2613")
    public void testIssues() {
        Assert.assertTrue(true);
    }
    @Test
    @Link("https://example.org")
    @Link(name = "allureLink", type = "myLink", url = "https://onliner.by")
    public void testLinks() {
        Assert.assertTrue(true);
    }
}
