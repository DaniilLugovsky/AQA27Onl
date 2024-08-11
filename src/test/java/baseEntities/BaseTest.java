package baseEntities;

import configuration.ReadProperties;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pages.DashboardPage;
import services.BrowsersService;
import services.WaitsService;
import steps.UserStep;
import utils.InvokedListener;

@Listeners(InvokedListener.class)
public class BaseTest {
    protected WebDriver driver;
    protected UserStep userStep;
    protected WaitsService waitsService;

    protected DashboardPage dashboardPage;

    @BeforeMethod
    public void setup(ITestContext iTestContext) {
        driver = new BrowsersService().getDriver();
        waitsService = new WaitsService(driver);

        iTestContext.setAttribute("webdriver", driver);

        userStep = new UserStep(driver);

        dashboardPage = new DashboardPage(driver);

        driver.get(ReadProperties.getUrl());
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
