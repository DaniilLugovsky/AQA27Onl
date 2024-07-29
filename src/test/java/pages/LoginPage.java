package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    private final By LOGIN_INPUT_LOCATOR = By.id("user-name");
    private final By PASSWORD_INPUT_LOCATOR = By.id("password");
    private final By BUTTON_LOGIN = By.id("login-button");



    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return LOGIN_INPUT_LOCATOR;
    }



    public WebElement getLoginInput() {
        return pageDriver.findElement(LOGIN_INPUT_LOCATOR);
    }
    public WebElement getPasswordInput() {
        return pageDriver.findElement(PASSWORD_INPUT_LOCATOR);
    }
    public WebElement getLoginButton() {
        return pageDriver.findElement(BUTTON_LOGIN);
    }

    public void setLoginValue(String value) {
        getLoginInput().sendKeys(value);
    }
    public void setPasswordValue(String value) {
        getPasswordInput().sendKeys(value);
    }
    public void clickLoginButton() {
        getLoginButton().click();
    }
}
