package pages.projects.top.milestones;

import baseEntities.BasePage;
import elements.Button;
import elements.CheckBox;
import elements.Input;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddMilestonesPage extends BasePage {
    private final By headerTitleLabelLocator = By.xpath("//div[@data-testid='testCaseContentHeaderTitle']");
    private final By NAME_INPUT_LOCATOR = By.xpath("//input[@id = 'name']");
    private final By REFERENCES_INPUT_LOCATOR = By.xpath("//input[@id = 'reference']");
    private final By PARENT_INPUT_LOCATOR = By.xpath("//div[@id = 'parent_id_chzn']");
    private final By DESCRIPTION_INPUT_LOCATOR = By.xpath("//div[@id ='description_display']");
    private final By START_DATE_LOCATOR = By.xpath("//input[@data-testid ='addEditMilestoneStartOn']");
    private final By END_DATE_LOCATOR = By.xpath("//input[@id='due_on']");
    private final By CHECK_BOX_MILESTONES_COMPLETED_LOCATOR = By.id("is_completed");
    private final By ADD_MILESTONES_BUTTON = By.id("accept");

    public AddMilestonesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLabelLocator;
    }

    public Input getNameInput() {
        return new Input(driver, NAME_INPUT_LOCATOR);
    }

    public Input getReferenceInput() {
        return new Input(driver, REFERENCES_INPUT_LOCATOR);
    }

    public Input getParentInput() {
        return new Input(driver, PARENT_INPUT_LOCATOR);
    }

    public Input getDescriptionInput() {
        return new Input(driver, DESCRIPTION_INPUT_LOCATOR);
    }

    public Button getAddMilestonesButton() {
        return new Button(driver, ADD_MILESTONES_BUTTON);
    }

    public Input getStartDateInput() {
        return new Input(driver, START_DATE_LOCATOR);
    }

    public Input getEndDateInput() {
        return new Input(driver, END_DATE_LOCATOR);
    }

    public CheckBox getCheckBox() {
        return new CheckBox(driver, CHECK_BOX_MILESTONES_COMPLETED_LOCATOR);
    }

    public void sendName(String name) {
        getNameInput().write(name);
    }

    public void sendReference(String reference) {
        getReferenceInput().write(reference);
    }

    public void sendParent(String parent) {
        getParentInput().write(parent);
    }

    public void sendDescription(String description) {
        getDescriptionInput().write(description);
    }

    public void clickAddMilestones() {
        getAddMilestonesButton().click();
    }

    public void clickStartDateButton(String data) {
        getStartDateInput().write(data);
    }

    public void clickEndDateButton(String data) {
        getEndDateInput().write(data);
    }

    public void setFlag(String flag) {
        if (flag.equals("true")) {
            getCheckBox().set();
        } else {
            getCheckBox().remove();
        }
    }
}
