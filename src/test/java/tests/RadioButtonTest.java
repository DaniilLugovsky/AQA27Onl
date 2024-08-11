package tests;

import baseEntities.BaseTest;
import org.testng.annotations.Test;
import pages.projects.AddProjectPage;

public class RadioButtonTest extends BaseTest {

    @Test
    public void radioButtonTest() {
            userStep.successfulLogin();
            driver.get("https://aqa2704.testrail.io/index.php?/admin/projects/add");
            AddProjectPage addProjectPage = new AddProjectPage(driver);
            addProjectPage.getProjectTypeRadioButton().selectByText("Use multiple test suites to manage cases");
            addProjectPage.getProjectTypeRadioButton().selectByValue("2");
            addProjectPage.getProjectTypeRadioButton().selectByIndex(1);
        }
}