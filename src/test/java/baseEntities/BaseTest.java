package baseEntities;

import configuration.ReadProperties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import services.BrowsersService;
import services.WaitsService;
import steps.LoginStep;
import steps.NavigationStep;
import steps.UserStep;

public class BaseTest {
    protected WebDriver driver;
    protected LoginStep loginStep;
    protected NavigationStep navigationStep;
    protected WaitsService waitsService;

    protected UserStep userStep;

    @BeforeMethod
    public void setup() {
        driver = new BrowsersService().getDriver();
        waitsService = new WaitsService(driver);
        loginStep = new LoginStep(driver);
        navigationStep = new NavigationStep(driver);
        userStep = new UserStep(driver);

        driver.get(ReadProperties.getUrl());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
