package pages.projects.top.milestones;

import baseEntities.BasePage;
import elements.Button;
import elements.CheckBox;
import elements.Input;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditMilestonesPage extends BasePage {
    private final By NAME_INPUT_LOCATOR = By.xpath("//input[@id = 'name']");
    private final By REFERENCES_INPUT_LOCATOR = By.xpath("//input[@id = 'reference']");
    private final By DESCRIPTION_INPUT_LOCATOR = By.xpath("//div[@id ='description_display']");
    private final By START_DATE_LOCATOR = By.xpath("//input[@id ='start_on']");
    private final By END_DATE_LOCATOR = By.xpath("//input[@id='due_on']");
    private final By CHECK_BOX_MILESTONES_COMPLETED_LOCATOR = By.id("is_completed");
    private final By ADD_MILESTONES_BUTTON = By.id("accept");
    private final By headerTitleLabelLocator = By.xpath("//div[@data-testid='testCaseContentHeaderTitle']");
    private final By DELETE_THIS_MILESTONE_BUTTON = By.xpath("//a[text()='Delete this milestone']");
    private final By DELETE_THIS_MILESTONE_CHECKBOX = By.xpath("//strong[text()='Yes, delete this milestone (cannot be undone)']/following::input");
    private final By DELETE_THIS_MILESTONE_OK_BUTTON = By.xpath("//a[@data-testid='caseFieldsTabDeleteDialogButtonOk']");
    public EditMilestonesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLabelLocator;
    }

    public Input getNameInput() {
        return new Input(driver,NAME_INPUT_LOCATOR);
    }
    public Input getReferencesInput() {
        return new Input(driver,REFERENCES_INPUT_LOCATOR);
    }
    public Input getDescriptionInput() {
        return new Input(driver,DESCRIPTION_INPUT_LOCATOR);
    }
    public Input getStartDateInput() {
        return new Input(driver,START_DATE_LOCATOR);
    }
    public Input getEndDateInput() {
        return new Input(driver,END_DATE_LOCATOR);
    }
    public CheckBox getCheckBox() {
        return new CheckBox(driver,CHECK_BOX_MILESTONES_COMPLETED_LOCATOR);
    }
    public Button getAddMilestonesButton() {
        return new Button(driver,ADD_MILESTONES_BUTTON);
    }
    public Button getDeleteThisMilestoneButton() {
        return new Button(driver,DELETE_THIS_MILESTONE_BUTTON);
    }
    public CheckBox getDeleteThisMilestoneCheckBox() {
        return new CheckBox(driver,DELETE_THIS_MILESTONE_CHECKBOX);
    }
    public Button getDeleteThisMilestoneOkButton() {
        return new Button(driver,DELETE_THIS_MILESTONE_OK_BUTTON);
    }
    public void clearAndSendName(String name) {
        getNameInput().clearAndWrite(name);
    }
    public void clearAndSendReferences(String references) {
        getReferencesInput().clearAndWrite(references);
    }
    public void clearAndSendDescription(String description) {
        getDescriptionInput().clearAndWrite(description);
    }
    public void clearAndSendStartDate(String data) {
        getStartDateInput().clearAndWrite(data);
    }
    public void clearAndSendEndDate(String data) {
        getEndDateInput().clearAndWrite(data);
    }
    public void clearAndSendCheckBox(String flag) {
        if (flag == "true") {
            getCheckBox().set();
        } else {
            getCheckBox().remove();
        }
    }
    public void clickSaveMilestones() {
        getAddMilestonesButton().click();
    }
    public void deleteMilestone() {
        getDeleteThisMilestoneButton().click();
        getDeleteThisMilestoneCheckBox().set();
        getDeleteThisMilestoneOkButton().click();
    }
}
