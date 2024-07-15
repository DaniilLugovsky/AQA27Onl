package baseEntities;

import configuration.ReadProperties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import services.BrowsersService;
import steps.OrderStep;
import steps.UserStep;

public class BaseTest {

    protected WebDriver driver;

    protected UserStep userStep;

    protected OrderStep orderStep;

    @BeforeMethod
    public void setUp() {
        driver = new BrowsersService().getDriver();

        userStep = new UserStep(driver);
        orderStep = new OrderStep(driver);


        driver.get(ReadProperties.getUrl());
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
