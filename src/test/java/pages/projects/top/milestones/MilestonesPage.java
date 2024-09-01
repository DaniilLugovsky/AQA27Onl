package pages.projects.top.milestones;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class MilestonesPage extends BasePage {
    private final By headerTitleLabelLocator = By.xpath("//div[@data-testid='testCaseContentHeaderTitle']");

    private final By MESSAGE_SUCCESS_LOCATOR = By.xpath("//div[@class='message message-success']");
    private final By MESSAGE_SUCCESS_UPDATE_LOCATOR = By.xpath("//div[text()='Successfully updated the milestone.']");
    private final By MESSAGE_SUCCESS_DELETE_LOCATOR = By.xpath("//div[text()='Successfully deleted the milestone.']");
    private final By MILESTONES_PERSONAL_BUTTON = By.xpath("//a[text()='name']");
    private final By MILESTONES_PERSONAL_BUTTON_UPDATE = By.xpath("//a[text()='Jo']");

    public MilestonesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLabelLocator;
    }

    public WebElement getMessageSuccess() {
        return waitsService.presenceOfElementLocated(MESSAGE_SUCCESS_LOCATOR);
    }
    public WebElement getMessageUpdateSuccess() {
        return waitsService.presenceOfElementLocated(MESSAGE_SUCCESS_UPDATE_LOCATOR);
    }
    public WebElement getMessageDeleteSuccess() {
        return waitsService.presenceOfElementLocated(MESSAGE_SUCCESS_DELETE_LOCATOR);
    }
    public WebElement getMilestonesPersonalButton() {
        return waitsService.presenceOfElementLocated(MILESTONES_PERSONAL_BUTTON);
    }
    public WebElement getMilestonesPersonalUpdateButton() {
        return waitsService.presenceOfElementLocated(MILESTONES_PERSONAL_BUTTON_UPDATE);
    }
    public void clickMilestonesPersonalButton() {
        getMilestonesPersonalButton().click();
    }
    public void clickMilestonesPersonalUpdateButton() {
        getMilestonesPersonalUpdateButton().click();
    }
    public void isMessageSuccessDisplayed() {
        Assert.assertTrue(getMessageSuccess().isDisplayed());
    }
    public void isMessageUpdateSuccessDisplayed() {
        Assert.assertTrue(getMessageUpdateSuccess().isDisplayed());
    }
    public void isMessageSuccessfullyDeletedTheMilestoneDisplayed() {
        Assert.assertTrue(getMessageDeleteSuccess().isDisplayed());
    }
}
