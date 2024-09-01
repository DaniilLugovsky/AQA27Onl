package pages.projects.top.milestones;

import baseEntities.BasePage;
import elements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PersonalMilestonesPage extends BasePage {
    private final By headerTitleLabelLocator = By.xpath("//div[@data-testid='testCaseContentHeaderTitle']");
    private final By MILESTONES_EDIT_BUTTON_LOCATOR = By.xpath("//a[text()='Edit']");

    public PersonalMilestonesPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLabelLocator;
    }

    public Button getMilestonesEditButton() {
        return new Button(driver, MILESTONES_EDIT_BUTTON_LOCATOR);
    }

    public void clickMilestonesEditButton() {
        getMilestonesEditButton().click();
    }
}
