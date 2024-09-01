package stepDefs;

import baseEntities.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.projects.top.OverviewPage;
import pages.projects.top.testCases.AddTestCasesPage;
import pages.projects.top.testCases.PersonalTestCasePage;
import pages.projects.top.testCases.TestsCasesPage;

public class TestCasesStepDefs extends BaseTest {
    BaseTest baseTest;
    OverviewPage overviewPage;
    TestsCasesPage testsCasesPage;
    AddTestCasesPage addTestCasesPage;
    PersonalTestCasePage personalTestCasePage;

    public TestCasesStepDefs(BaseTest baseTest) {
        this.baseTest = baseTest;
        overviewPage = new OverviewPage(baseTest.driver);
        testsCasesPage = new TestsCasesPage(baseTest.driver);
        addTestCasesPage = new AddTestCasesPage(baseTest.driver);
        personalTestCasePage = new PersonalTestCasePage(baseTest.driver);
    }
    ///атамарные
    @When("user clicks on top TestCases list button")
    public void userClicksOnTopTestCasesListButton() {
        overviewPage.clickTestsCasesListButton();
    }
    @When("user clicks on add TestCases Button")
    public void userClicksOnAddTestCasesButton() {
        testsCasesPage.clickAddCasesButton();
    }
    @When("Send Title {string}")
    public void sendTitle(String title) {
        addTestCasesPage.sendTitle(title);
    }
    @When("Send Section {string}")
    public void sendSection(String section) {
        addTestCasesPage.sendSection(section);
    }
    @When("Send Template {string}")
    public void sendTemplate(String template) {
        addTestCasesPage.sendTemplate(template);
    }
    @When("Send Type {string}")
    public void sendType(String type) {
        addTestCasesPage.sendType(type);
    }
    @When("Send Priority {string}")
    public void sendPriority(String priority) {
        addTestCasesPage.sendPriority(priority);
    }
    @When("Send Assigned To {string}")
    public void sendAssigned(String assigned) {
        addTestCasesPage.sendAssignedTo(assigned);
    }
    @When("Send Estimate {string}")
    public void sendEstimate(String estimate) {
        addTestCasesPage.sendEstimate(estimate);
    }
    @When("Send Test Case References {string}")
    public void sendTestCaseReferences(String references) {
        addTestCasesPage.sendReferences(references);
    }
    @When("Send Automation Type {string}")
    public void sendAutomationType(String type) {
        addTestCasesPage.sendAutomationType(type);
    }
    @When("Send Preconditions {string}")
    public void sendPreconditions(String preconditions) {
        addTestCasesPage.sendPreconditions(preconditions);
    }
    @When("Send Steps {string}")
    public void sendSteps(String steps) {
        addTestCasesPage.sendSteps(steps);
    }
    @When("Send Expected Result {string}")
    public void sendExpectedResult(String result) {
        addTestCasesPage.sendExpectedResult(result);
    }
    @When("user clicks on button add test case")
    public void clickAddTestCase() throws InterruptedException {
        addTestCasesPage.clickAddTestCase();
        Thread.sleep(2000);
    }
    @When("user clicks on personal Test Case")
    public void userClicksOnPersonalTestCase() {
        testsCasesPage.clickOnPersonalTestCase();
    }
    @When("user clicks on personal update Test Case")
    public void userClicksOnPersonalUpdateTestCase() {
        testsCasesPage.clickOnPersonalUpdateTestCase();
    }
    @When("user clicks on edit Test Case button")
    public void userClicksOnEditTestCaseButton() {
        personalTestCasePage.clickTestCaseEditButton();
    }
    @Then("Read All info")
    public void readInputName() {
        System.out.println(addTestCasesPage.getTitleInput().getAttribute("value"));
        System.out.println(addTestCasesPage.getSectionDropDown().readTextElement());
        System.out.println(addTestCasesPage.getTemplateDropDown().readTextElement());
        System.out.println(addTestCasesPage.getTypeDropDown().readTextElement());
        System.out.println(addTestCasesPage.getPriorityDropDown().readTextElement());
        System.out.println(addTestCasesPage.getAssignedToDropDown().readTextElement());
        System.out.println(addTestCasesPage.getEstimateInput().getAttribute("value"));
        System.out.println(addTestCasesPage.getReferencesInput().getAttribute("value"));
        System.out.println(addTestCasesPage.getAutomationTypeDropDown().readTextElement());
        System.out.println(addTestCasesPage.getPreconditionsInput().getText());
        System.out.println(addTestCasesPage.getStepsInput().getText());
        System.out.println(addTestCasesPage.getExpectedResultInput().getText());

    }
    @When("Update Title {string}")
    public void updateTitle(String title) {
        addTestCasesPage.getTitleInput().clearAndWrite(title);
    }
    @When("Update Section {string}")
    public void updateSection(String section) {
        addTestCasesPage.getSectionDropDown().selectByText(section);
    }
    @When("Update Template {string}")
    public void updateTemplate(String template) {
        addTestCasesPage.getTemplateDropDown().selectByText(template);
    }
    @When("Update Type {string}")
    public void updateType(String type) {
        addTestCasesPage.getTypeDropDown().selectByText(type);
    }
    @When("Update Priority {string}")
    public void updatePriority(String priority) {
        addTestCasesPage.getPriorityDropDown().selectByText(priority);
    }
    @When("Update Assigned To {string}")
    public void updateAssignedTo(String assigned) {
        addTestCasesPage.getAssignedToDropDown().selectByText(assigned);
    }
    @When("Update Estimate {string}")
    public void updateEstimate(String estimate) {
        addTestCasesPage.getEstimateInput().clearAndWrite(estimate);
    }
    @When("Update Test Case References {string}")
    public void updateReferences(String references) {
        addTestCasesPage.getReferencesInput().clearAndWrite(references);
    }
    @When("Update Automation Type {string}")
    public void updateAutomationType(String type) {
        addTestCasesPage.getAutomationTypeDropDown().selectByText(type);
    }
    @When("Update Preconditions {string}")
    public void updatePreconditions(String preconditions) {
        addTestCasesPage.getPreconditionsInput().clearAndWrite(preconditions);
    }
    @When("Update Steps {string}")
    public void updateSteps(String steps) {
        addTestCasesPage.getStepsInput().clearAndWrite(steps);
    }
    @When("Update Expected Result {string}")
    public void updateExpectedResult(String result) {
        addTestCasesPage.getExpectedResultInput().clearAndWrite(result);
    }
    @When("user clicks on button save test case")
    public void userClicksOnButtonSaveTestCase() throws InterruptedException {
        addTestCasesPage.clickAddTestCase();
        Thread.sleep(5000);
    }
    @When("user clicks on delete Test Case button")
    public void userClicksOnDeleteTestCaseButton() {
        addTestCasesPage.deleteTestCase();
    }
    ///проверки

    @Given("TestCases Page is displayed")
    public void testcasesPageIsDisplayed() {
        testsCasesPage.isPageOpened();
    }

    @Given("AddTestCases Page is displayed")
    public void addTestCasesPageIsDisplayed() {
        addTestCasesPage.isPageOpened();
    }
    @Given("Personal Test Case Page is displayed")
    public void personalTestCasePageIsDisplayed() {
        personalTestCasePage.isPageOpened();
    }

    @Given("Edit Test Case Page is displayed")
    public void editTestCasePageIsDisplayed() {
        addTestCasesPage.isPageOpened();
    }

    @Then("message Add Test Case is displayed")
    public void messageAddTestCaseIsDisplayed() {
        personalTestCasePage.TestCaseAddSuccess();
    }

    @Then("message Update Test Case is displayed")
    public void messageUpdateTestCaseIsDisplayed() {
        personalTestCasePage.TestCaseAddSuccess();
    }

    @Then("Message Delete Test Case is displayed")
    public void messageDeleteTestCaseIsDisplayed() {
        testsCasesPage.messageDeleteTestCaseIsDisplayed();
    }
}
