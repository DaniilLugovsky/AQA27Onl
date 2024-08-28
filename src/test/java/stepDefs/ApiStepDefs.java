package stepDefs;

import baseEntities.BaseTest;
import io.cucumber.java.en.Given;

public class ApiStepDefs extends BaseTest {
    private BaseTest baseTest;

    public ApiStepDefs(BaseTest baseTest) {
        this.baseTest = baseTest;
    }

    @Given("service is running")
    public void serviceIsRunning() {
        System.out.println(baseTest.servise);
    }
}
