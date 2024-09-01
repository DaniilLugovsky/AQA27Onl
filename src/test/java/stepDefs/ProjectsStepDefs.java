package stepDefs;

import baseEntities.BaseTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.DashboardPage;
import pages.projects.AddProjectPage;

public class ProjectsStepDefs extends BaseTest {
    private BaseTest baseTest;

    public ProjectsStepDefs(BaseTest baseTest) {
        this.baseTest = baseTest;
    }

    DashboardPage dashboardPage;
    AddProjectPage addProjectPage;

    @When("user clicks add project button")
    public void userClicksAddProjectButton() {
        dashboardPage = new DashboardPage(baseTest.driver);
        dashboardPage.getAddProjectButton().click();
    }

    @Then("add project page is displayed")
    public void addProjectPageIsDisplayed() {
        addProjectPage = new AddProjectPage(baseTest.driver);
        Assert.assertTrue(addProjectPage.isPageOpened());
    }
}
