package pages.projects.top.testCases;

import baseEntities.BasePage;
import elements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PersonalTestCasePage extends BasePage {
        private final By headerTitleLabelLocator = By.xpath("//div[@data-testid='testCaseContentHeaderTitle']");
        private final By TEST_CASE_EDIT_BUTTON_LOCATOR = By.xpath("//span[text()='Edit']");
        private final By MESSAGE_SUCCESS_LOCATOR = By.xpath("//div[@class='message message-success']");

        public PersonalTestCasePage(WebDriver driver) {
            super(driver);
        }
        @Override
        protected By getPageIdentifier() {
            return headerTitleLabelLocator;
        }
        public Button getTestCaseEditButton() {
            return new Button(driver,TEST_CASE_EDIT_BUTTON_LOCATOR);
        }
        public WebElement getMessageSuccess() {
            return waitsService.presenceOfElementLocated(MESSAGE_SUCCESS_LOCATOR);
        }
        public void clickTestCaseEditButton() {
            getTestCaseEditButton().click();
        }
        public void TestCaseAddSuccess() {
            Assert.assertTrue(getMessageSuccess().isDisplayed());
        }

}
