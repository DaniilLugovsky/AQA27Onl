package stepDefs;

import baseEntities.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.DashboardPage;
import pages.projects.top.milestones.EditMilestonesPage;
import pages.projects.top.milestones.PersonalMilestonesPage;
import pages.projects.top.OverviewPage;
import pages.projects.top.milestones.AddMilestonesPage;
import pages.projects.top.milestones.MilestonesPage;

public class MilestonesStepDefs extends BaseTest {
    BaseTest baseTest;

    OverviewPage overviewPage;
    DashboardPage dashboardPage;
    AddMilestonesPage addMilestonesPage;
    MilestonesPage milestonesPage;
    PersonalMilestonesPage personalMilestonesPage;
    EditMilestonesPage editMilestonesPage;

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
        overviewPage = new OverviewPage(baseTest.driver);
        overviewPage.clickAddMilestonesButton();
    }
    @When("Send name {string}")
    public void sendName(String name) {
        addMilestonesPage.sendName(name);
    }
    @When("Send References {string}")
    public void sendReference(String reference) {
        addMilestonesPage.sendReference(reference);
    }
    @When("Send Parent {string}")
    public void sendParent(String parent) {
        addMilestonesPage.sendParent(parent);
    }
    @When("Send Description {string}")
    public void sendDescription(String description) {
        addMilestonesPage.sendDescription(description);
    }
    @When("Send Start Date {string}")
    public void SendStartDate(String data) {
        addMilestonesPage.clickStartDateButton(data);
    }
    @When("Send End Date {string}")
    public void SendEndDate(String data) {
        addMilestonesPage.clickEndDateButton(data);
    }
    @When("CLick CheckBox This milestone is completed {string}")
    public void ClickCheckBox(String flag) {
        addMilestonesPage.setFlag(flag);
    }
    @When("Click Add Milestones")
    public void clickAddMilestones() {
        addMilestonesPage.clickAddMilestones();
    }
    @When("user clicks on top milestones list button")
    public void userClicksOnTopMilestonesListButton() {
        overviewPage.clickMilestonesListButton();
    }
    @When("user clicks on personal Milestones button")
    public void userClicksOnPersonalMilestonesButton() {
        milestonesPage.clickMilestonesPersonalButton();
    }
    @When("user clicks on personal Milestones update button")
    public void userClicksOnPersonalMilestonesUpdateButton() {
        milestonesPage.clickMilestonesPersonalUpdateButton();
    }
    @When("user clicks on edit Milestones button")
    public void userClicksOnEditMilestonesButton() {
        personalMilestonesPage.clickMilestonesEditButton();
    }
    @Then("Read input Name")
    public void readInputName() {
        System.out.println(editMilestonesPage.getNameInput().getAttribute("value"));
    }
    @Then("Read input References")
    public void readInputReferences() {
        System.out.println(editMilestonesPage.getReferencesInput().getAttribute("value"));
    }
    @Then("Read input Description")
    public void readInputDescription() {
        System.out.println(editMilestonesPage.getDescriptionInput().getText());
    }
    @Then("Read input Start Date")
    public void readInputStartDate() {
        System.out.println(editMilestonesPage.getStartDateInput().getAttribute("value"));
    }
    @Then("Read input End Date")
    public void readInputEndDate() {
        System.out.println(editMilestonesPage.getEndDateInput().getAttribute("value"));
    }
    @Then("Read CheckBox")
    public void readCheckBox() {
        System.out.println(editMilestonesPage.getCheckBox().readCheckBox());
    }
    @When("Update Input Name {string}")
    public void updateInputName(String name) {
        editMilestonesPage.clearAndSendName(name);
    }
    @When("Update Input References {string}")
    public void updateInputReferences(String references) {
        editMilestonesPage.clearAndSendReferences(references);
    }
    @When("Update Input Description {string}")
    public void updateInputDescription(String description) {
        editMilestonesPage.clearAndSendDescription(description);
    }
    @When("Update input Start Date {string}")
    public void updateStartDate(String data) {
        editMilestonesPage.clearAndSendStartDate(data);
    }
    @When("Update input End Date {string}")
    public void updateEndDate(String data) throws InterruptedException {
        editMilestonesPage.clearAndSendEndDate(data);
    }
    @When("Update CheckBox {string}")
    public void updateCheckBox(String flag){
        editMilestonesPage.clearAndSendCheckBox(flag);
    }
    @When("Click Save Milestones")
    public void clickSaveMilestones() {
        editMilestonesPage.clickSaveMilestones();
    }
    @When("user clicks on button delete Milestone")
    public void userClicksOnButtonDeleteMilestone() {
        editMilestonesPage.deleteMilestone();
    }
    // Проверки
    @Given("project page is displayed")
    public void IsProjectPageDisplayed() {
        overviewPage = new OverviewPage(baseTest.driver);
        Assert.assertTrue(overviewPage.isPageOpened());

    }
    @Given("Milestones Add Page is displayed")
    public void milestonesAddPageIsDisplayed() {
        addMilestonesPage = new AddMilestonesPage(baseTest.driver);
        Assert.assertTrue(addMilestonesPage.isPageOpened());
    }
    @Given("Milestones Page is displayed")
    public void milestonesPageIsDisplayed() {
        milestonesPage = new MilestonesPage(baseTest.driver);
        milestonesPage.isPageOpened();
    }
    @And("Message Success is displayed")
    public void messageSuccessIsDisplayed() {
        milestonesPage.isMessageSuccessDisplayed();
    }
    @And("Message Success update is displayed")
    public void messageSuccessUpdateIsDisplayed() {
        milestonesPage.isMessageUpdateSuccessDisplayed();
    }
    @And("Message Successfully deleted the milestone is displayed")
    public void messageSuccessfullyDeletedTheMilestoneIsDisplayed() {
        milestonesPage.isMessageSuccessfullyDeletedTheMilestoneDisplayed();
    }
    @Given("Milestones personal Page is displayed")
    public void milestonesPersonalPageIsDisplayed() {
        personalMilestonesPage = new PersonalMilestonesPage(baseTest.driver);
        Assert.assertTrue(personalMilestonesPage.isPageOpened());
    }


    @Given("Milestones edit Page is displayed")
    public void milestonesEditPageIsDisplayed() {
        editMilestonesPage = new EditMilestonesPage(baseTest.driver);
        editMilestonesPage.isPageOpened();
    }

}

