package stepDefs;

import baseEntities.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.DashboardPage;
import pages.projects.ProjectPage;
import pages.projects.milestones.AddMilestonesPage;

public class MilestonesStepDefs extends BaseTest {
    BaseTest baseTest;

    ProjectPage projectPage;
    DashboardPage dashboardPage;
    AddMilestonesPage addMilestonesPage;

    public MilestonesStepDefs(BaseTest baseTest) {
        this.baseTest = baseTest;
    }

    // Атамарные
    @When("user clicks on project")
    public void userClicksOnProject() {
        dashboardPage = new DashboardPage(baseTest.driver);
        dashboardPage.clickProjectButton();
    }
    @When("user click on button add Milestones")
    public void userClickOnButtonAddMilestones() {
        projectPage = new ProjectPage(baseTest.driver);
        projectPage.clickAddMilestonesButton();
    }

    @When("Send name {string}")
    public void sendName(String name) {
        addMilestonesPage.sendName(name);
    }

    @When("Send References {string}")
    public void sendReference(String reference) throws InterruptedException {
        addMilestonesPage.sendReference(reference);
        Thread.sleep(2000);
    }

    @When("Send Parent {string}")
    public void sendParent(String parent) throws InterruptedException {
        addMilestonesPage.sendParent(parent);
        Thread.sleep(2000);
    }
    @When("Send Description {string}")
    public void sendDescription(String description) throws InterruptedException {
        addMilestonesPage.sendDescription(description);
        Thread.sleep(2000);
    }

    @When("Click Start Date")
    public void ClickStartDate() {
        addMilestonesPage.clickStartDateButton();
    }

    @When("Click Add Milestones")
    public void clickAddMilestones() {
        addMilestonesPage.clickAddMilestones();
    }

    // Проверки
    @Then("project page is displayed")
    public void IsProjectPageDisplayed() {
        Assert.assertTrue(new ProjectPage(baseTest.driver).isPageOpened());
    }


    @Given("Milestones Add Page is displayed")
    public void milestonesAddPageIsDisplayed() {
        addMilestonesPage = new AddMilestonesPage(baseTest.driver);
        Assert.assertTrue(addMilestonesPage.isPageOpened());
    }



}

