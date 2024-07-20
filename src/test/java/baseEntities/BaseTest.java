package baseEntities;

import configuration.ReadProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import services.BrowsersService;
import services.WaitsService;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;
    protected WaitsService waitsService;
    protected Actions actions;

    @BeforeMethod
    public void setUp() {
        driver = new BrowsersService().getDriver();
        actions = new Actions(driver);
        waitsService = new WaitsService(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
