package tests;

import baseEntities.BaseTest;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTest {

    @Test
    public void dropDownTest() throws InterruptedException {
        userStep.successfulLogin();
        userStep.transitionInTestCasePage();
        userStep.addTestCase();
        userStep.selectTypeDropDownByIndex(7);
        Thread.sleep(5000);
        userStep.selectTypeDropDownByText("Other");
        Thread.sleep(5000);
    }
}
