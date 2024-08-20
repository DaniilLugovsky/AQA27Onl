package tests;

import baseEntities.BaseTest;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTest {

    @Test
    public void dropDownTest() {
        userStep.successfulLogin();
        userStep.transitionInTestCasePage();
        userStep.addTestCase();
        userStep.selectDropDownByIndex(6);
        userStep.selectDropDownByText("Other");
    }
}
