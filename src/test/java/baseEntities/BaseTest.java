package baseEntities;

import configuration.ReadProperties;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import services.BrowsersService;
import steps.OrderStep;
import steps.UserStep;
import utils.InvokedListener;

@Listeners(InvokedListener.class)
public class BaseTest {

    protected WebDriver driver;

    protected UserStep userStep;

    protected OrderStep orderStep;

    @BeforeMethod
    public void setUp(ITestContext iTestContext) {
        driver = new BrowsersService().getDriver();
        iTestContext.setAttribute("webdriver", driver);
        userStep = new UserStep(driver);
        orderStep = new OrderStep(driver);
        driver.get(ReadProperties.getUrl());
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
