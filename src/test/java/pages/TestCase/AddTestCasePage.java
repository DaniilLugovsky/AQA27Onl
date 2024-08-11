package pages.TestCase;

import baseEntities.BasePage;
import elements.DropDown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AddTestCasePage extends BasePage {
    private final By ADD_TEST_CASE_BUTTON_LOCATOR = By.id("accept");

    public AddTestCasePage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return ADD_TEST_CASE_BUTTON_LOCATOR;
    }

    public DropDown getPriorityDropDown(By by) {
        return new DropDown(pageDriver, by);
    }
}
