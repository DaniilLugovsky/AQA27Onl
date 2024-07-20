package baseEntities;

import configuration.ReadProperties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import services.BrowsersService;
import services.WaitsService;

public class BaseTest {

    protected WebDriver driver;
    protected WaitsService waitsService;

    @BeforeMethod
    public void setUp() {
        driver = new BrowsersService().getDriver();


        waitsService = new WaitsService(driver);
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
