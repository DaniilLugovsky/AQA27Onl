package pages.projects.milestones;

import baseEntities.BasePage;
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
    private final By START_DATE_BUTTON_LOCATOR = By.xpath("//a[text() ='31']");
    private final By ADD_MILESTONES_BUTTON = By.id("accept");
    public AddMilestonesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLabelLocator;
    }

    public WebElement getNameInput() {
        return waitsService.presenceOfElementLocated(NAME_INPUT_LOCATOR);
    }
    public WebElement getReferenceInput() {
        return waitsService.presenceOfElementLocated(REFERENCES_INPUT_LOCATOR);
    }
    public WebElement getParentInput() {
        return waitsService.presenceOfElementLocated(PARENT_INPUT_LOCATOR);
    }
    public WebElement getDescriptionInput() {
        return waitsService.presenceOfElementLocated(DESCRIPTION_INPUT_LOCATOR);
    }
    public WebElement getAddMilestonesButton() {
        return waitsService.presenceOfElementLocated(ADD_MILESTONES_BUTTON);
    }
    public WebElement getStartDate() {
        return waitsService.presenceOfElementLocated(START_DATE_LOCATOR);
    }
    public WebElement getStartDateButton() {
        return waitsService.presenceOfElementLocated(START_DATE_BUTTON_LOCATOR);
    }

    public void sendName(String name) {
        getNameInput().sendKeys(name);
    }
    public void sendReference(String reference) {
        getReferenceInput().sendKeys(reference);
    }
    public void sendParent(String parent) {
        getParentInput().sendKeys(parent);
    }
    public void sendDescription(String description){
        getDescriptionInput().sendKeys(description);
    }
    public void clickAddMilestones() {
        getAddMilestonesButton().click();
    }
    public void clickStartDateButton() {
        getStartDate().click();
        getStartDateButton().click();
    }
}
