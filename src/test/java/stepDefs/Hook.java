package stepDefs;

import baseEntities.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import services.BrowsersService;

public class Hook extends BaseTest {
    private BaseTest baseTest;

    public Hook(BaseTest baseTest) {
        this.baseTest = baseTest;
    }

    // Подготовительные
    @Before(value = "@gui")
    public void initBrowser() {
        baseTest.driver = new BrowsersService().getDriver();
    }

    @Before(value = "@api")
    public void initService() {
        baseTest.servise = "Servise is on";
    }

    @Before(value = "@gui and @smoke", order = 10002)
    public void initSmokeTest() {
        System.out.println("initSmokeTest started...");
    }

    @Before(value = "@gui and @smoke", order = 10001)
    public void initSmokeTest1() {
        System.out.println("initSmokeTest started1...");
    }

    @After(value = "@gui")
    public void closeBrowser() {
        baseTest.driver.quit();
    }
}
