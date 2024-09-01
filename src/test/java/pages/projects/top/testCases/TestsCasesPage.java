package pages.projects.top.testCases;

import baseEntities.BasePage;
import elements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestsCasesPage extends BasePage {
    private final By headerTitleLabelLocator = By.xpath("//div[@data-testid='testCaseContentHeaderTitle']");
    private final By ADD_TEST_CASES_BUTTON_LOCATOR = By.id("sidebar-cases-add");
    private final By PERSONAL_TEST_CASE_BUTTON_LOCATOR = By.xpath("//span[@data-testid='sectionCaseTitle' and text()='Title']");
    private final By PERSONAL_TEST_CASE_BUTTON_UPDATE = By.xpath("//span[@data-testid='sectionCaseTitle' and text()='Tuutle']");
    private final By MESSAGE_DELETE_TEST_CASE_LOCATOR = By.xpath("//div[text()='Successfully deleted the test case.']");
    public TestsCasesPage(WebDriver driver) {
        super(driver);
    }
    @Override
    protected By getPageIdentifier() {
        return headerTitleLabelLocator;
    }

    public Button getAddCasesButton() {
        return new Button(driver,ADD_TEST_CASES_BUTTON_LOCATOR);
    }
    public Button getPersonalTestCaseButton() {
        return new Button(driver, PERSONAL_TEST_CASE_BUTTON_LOCATOR);
    }
    public Button getPersonalTestCaseUpdateButton() {
        return new Button(driver, PERSONAL_TEST_CASE_BUTTON_UPDATE);
    }
    public WebElement getMessageDeleteTestCase() {
        return waitsService.presenceOfElementLocated(MESSAGE_DELETE_TEST_CASE_LOCATOR);
    }

    public void clickAddCasesButton() {
        getAddCasesButton().click();
    }
    public void clickOnPersonalTestCase() {
        getPersonalTestCaseButton().click();
    }
    public void clickOnPersonalUpdateTestCase() {
        getPersonalTestCaseUpdateButton().click();
    }
    public void messageDeleteTestCaseIsDisplayed() {
        getMessageDeleteTestCase().isDisplayed();
    }
}
