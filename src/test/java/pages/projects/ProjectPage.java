package pages.projects;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectPage extends BasePage {
    private final By headerTitleLabelLocator = By.xpath("//div[@data-testid='testCaseContentHeaderTitle']");
    private final By ADD_MILESTONES_BUTTON_LOCATOR = By.id("navigation-overview-addmilestones");

    public ProjectPage(WebDriver driver) {
        super(driver);
    }
    @Override
    protected By getPageIdentifier() {
        return headerTitleLabelLocator;
    }

    public WebElement getAddMilestonesButton() {
        return waitsService.presenceOfElementLocated(ADD_MILESTONES_BUTTON_LOCATOR);
    }
    public void clickAddMilestonesButton() {
        getAddMilestonesButton().click();
    }
}
