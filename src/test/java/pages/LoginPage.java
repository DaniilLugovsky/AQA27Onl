package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage {

    private final By LOGIN_INPUT_LOCATOR = By.id("user-name");
    private final By PASSWORD_INPUT_LOCATOR = By.id("password");
    private final By BUTTON_LOGIN = By.id("login-button");

    @Override
    protected By getPageIdentifier() {
        return LOGIN_INPUT_LOCATOR;
    }

    public SelenideElement getLoginInput() {
        return $(LOGIN_INPUT_LOCATOR);
    }

    public SelenideElement getPasswordInput() {
        return $(PASSWORD_INPUT_LOCATOR);
    }

    public SelenideElement getLoginButton() {
        return $(BUTTON_LOGIN);
    }

    public void setLoginValue(String value) {
        getLoginInput().val(value);
    }

    public void setPasswordValue(String value) {
        getPasswordInput().val(value);
    }

    public void clickLoginButton() {
        getLoginButton().click();
    }
}
