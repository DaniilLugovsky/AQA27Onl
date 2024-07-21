package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutInformationPage extends BasePage {

    public TopMenuPage topMenuPage;

    private final By FIRST_NAME_INPUT_LOCATOR = By.id("first-name");
    private final By LAST_NAME_INPUT_LOCATOR = By.id("last-name");
    private final By POSTAL_CODE_INPUT_LOCATOR = By.id("postal-code");
    private final By CANCEL_BUTTON = By.id("cancel");
    private final By CONTINUE_BUTTON = By.id("continue");



    public CheckoutInformationPage(WebDriver driver) {
        super(driver);

        topMenuPage = new TopMenuPage(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return POSTAL_CODE_INPUT_LOCATOR;
    }



    public WebElement getFirstNameInput() {
        return pageDriver.findElement(FIRST_NAME_INPUT_LOCATOR);
    }
    public WebElement getLastNameInput() {
        return pageDriver.findElement(LAST_NAME_INPUT_LOCATOR);
    }
    public WebElement getPostalInput() {
        return pageDriver.findElement(POSTAL_CODE_INPUT_LOCATOR);
    }
    public WebElement getCanselButton() {
        return pageDriver.findElement(CANCEL_BUTTON);
    }
    public WebElement getContinueButton() {
        return pageDriver.findElement(CONTINUE_BUTTON);
    }


    public void setFirstNameInput(String firstName){
        getFirstNameInput().sendKeys(firstName);
    }
    public void setLastNameInput(String lastName){
        getLastNameInput().sendKeys(lastName);
    }
    public void setPostalInput(String postal){
        getPostalInput().sendKeys(postal);
    }
    public void clickCanselButton(){
        getCanselButton().click();
    }
    public void clickContinueButton(){
        getContinueButton().click();
    }
}
