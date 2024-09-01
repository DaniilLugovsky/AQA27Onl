package pages.projects.top.testCases;

import baseEntities.BasePage;
import elements.Button;
import elements.DropDown;
import elements.Input;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddTestCasesPage extends BasePage {
    private final By headerTitleLabelLocator = By.xpath("//div[@data-testid='testCaseContentHeaderTitle']");
    private final By TITLE_INPUT_LOCATOR = By.id("title");
    private final By SECTION_DROPDOWN_LOCATOR = By.id("section_id_chzn");
    private final By TEMPLATE_DROPDOWN_LOCATOR = By.id("template_id_chzn");
    private final By TYPE_DROPDOWN_LOCATOR = By.id("type_id_chzn");
    private final By PRIORITY_DROPDOWN_LOCATOR = By.id("priority_id_chzn");
    private final By ASSIGNED_TO_DROPDOWN_LOCATOR = By.id("assigned_to_id_chzn");
    private final By ESTIMATE_INPUT_LOCATOR = By.id("estimate");
    private final By REFERENCES_INPUT_LOCATOR = By.id("refs");
    private final By AUTOMATION_TYPE_DROPDOWN_LOCATOR = By.id("custom_automation_type_chzn");
    private final By PRECONDITIONS_INPUT_LOCATOR = By.id("custom_preconds_display");
    private final By STEPS_INPUT_LOCATOR = By.id("custom_steps_display");
    private final By EXPECTED_RESULT_INPUT_LOCATOR = By.id("custom_expected_display");
    private final By ADD_TEST_CASE_BUTTON_LOCATOR = By.id("accept");
    private final By DELETE_THIS_TEST_CASE_BUTTON_LOCATOR = By.xpath("//span[text()='Delete this test case']");
    private final By FINAL_DELETE_TEST_CASE_BUTTON_LOCATOR = By.xpath("//input[@id='suite_id']/following::a[@data-testid='deleteCaseDialogActionSecondary']");
    private final By DELETE_TEST_CASE_BUTTON_LOCATOR = By.xpath("//input[@id='caseID']/following::a[@data-testid='deleteCaseDialogActionDefault']");

    public AddTestCasesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLabelLocator;
    }

    public Input getTitleInput() {
        return new Input(driver, TITLE_INPUT_LOCATOR);
    }

    public DropDown getSectionDropDown() {
        return new DropDown(driver, SECTION_DROPDOWN_LOCATOR);
    }

    public DropDown getTemplateDropDown() {
        return new DropDown(driver, TEMPLATE_DROPDOWN_LOCATOR);
    }

    public DropDown getTypeDropDown() {
        return new DropDown(driver, TYPE_DROPDOWN_LOCATOR);
    }

    public DropDown getPriorityDropDown() {
        return new DropDown(driver, PRIORITY_DROPDOWN_LOCATOR);
    }

    public DropDown getAssignedToDropDown() {
        return new DropDown(driver, ASSIGNED_TO_DROPDOWN_LOCATOR);
    }

    public Input getEstimateInput() {
        return new Input(driver, ESTIMATE_INPUT_LOCATOR);
    }

    public Input getReferencesInput() {
        return new Input(driver, REFERENCES_INPUT_LOCATOR);
    }

    public DropDown getAutomationTypeDropDown() {
        return new DropDown(driver, AUTOMATION_TYPE_DROPDOWN_LOCATOR);
    }

    public Input getPreconditionsInput() {
        return new Input(driver, PRECONDITIONS_INPUT_LOCATOR);
    }

    public Input getStepsInput() {
        return new Input(driver, STEPS_INPUT_LOCATOR);
    }

    public Input getExpectedResultInput() {
        return new Input(driver, EXPECTED_RESULT_INPUT_LOCATOR);
    }

    public Button getAddTestCaseButton() {
        return new Button(driver, ADD_TEST_CASE_BUTTON_LOCATOR);
    }
    public Button getDeleteTestCaseButton() {
        return new Button(driver, DELETE_THIS_TEST_CASE_BUTTON_LOCATOR);
    }
    public Button getFinalDeleteTestCaseButton() {
        return new Button(driver, FINAL_DELETE_TEST_CASE_BUTTON_LOCATOR);
    }
    public Button getExaminationFinalDeleteTestCaseButton() {
        return new Button(driver,DELETE_TEST_CASE_BUTTON_LOCATOR);
    }

    public void sendTitle(String title) {
        getTitleInput().write(title);
    }

    public void sendSection(String section) {
        getSectionDropDown().selectByText(section);
    }

    public void sendTemplate(String template) {
        getTemplateDropDown().selectByText(template);
    }

    public void sendType(String type) {
        getTypeDropDown().selectByText(type);
    }

    public void sendPriority(String priority) {
        getPriorityDropDown().selectByText(priority);
    }

    public void sendAssignedTo(String assignedTo) {
        getAssignedToDropDown().selectByText(assignedTo);
    }

    public void sendEstimate(String estimate) {
        getEstimateInput().write(estimate);
    }

    public void sendReferences(String references) {
        getReferencesInput().write(references);
    }

    public void sendAutomationType(String type) {
        getAutomationTypeDropDown().selectByText(type);
    }

    public void sendPreconditions(String preconditions) {
        getPreconditionsInput().write(preconditions);
    }

    public void sendSteps(String steps) {
        getStepsInput().write(steps);
    }

    public void sendExpectedResult(String expectedResult) {
        getExpectedResultInput().write(expectedResult);
    }
    public void clickAddTestCase() {
        getAddTestCaseButton().click();
    }
    public void deleteTestCase() {
        getDeleteTestCaseButton().click();
        getFinalDeleteTestCaseButton().click();
        getExaminationFinalDeleteTestCaseButton().click();
    }
}
