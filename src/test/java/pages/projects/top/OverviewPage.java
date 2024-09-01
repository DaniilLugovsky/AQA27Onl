package pages.projects.top;

import baseEntities.BasePage;
import elements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage extends BasePage {
    private final By headerTitleLabelLocator = By.xpath("//div[@data-testid='testCaseContentHeaderTitle']");
    private final By ADD_MILESTONES_BUTTON_LOCATOR = By.id("navigation-overview-addmilestones");
    private final By TOP_MILESTONES_LIST_BUTTON_LOCATOR = By.id("navigation-milestones");
    private final By TOP_TESTS_CASES_LIST_BUTTON_LOCATOR = By.id("navigation-suites");

    public OverviewPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLabelLocator;
    }

    public Button getAddMilestonesButton() {
        return new Button(driver, ADD_MILESTONES_BUTTON_LOCATOR);
    }

    public Button getTopMilestonesListButton() {
        return new Button(driver, TOP_MILESTONES_LIST_BUTTON_LOCATOR);
    }

    public Button getTopTestsCasesListButton() {
        return new Button(driver, TOP_TESTS_CASES_LIST_BUTTON_LOCATOR);
    }

    public void clickAddMilestonesButton() {
        getAddMilestonesButton().click();
    }

    public void clickMilestonesListButton() {
        getTopMilestonesListButton().click();
    }

    public void clickTestsCasesListButton() {
        getTopTestsCasesListButton().click();
    }
}
