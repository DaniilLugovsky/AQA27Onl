package steps;

import baseEntities.BaseStep;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.ProductsPage;

public class UserStep extends BaseStep {

    public UserStep(WebDriver driver) {
        super(driver);
    }

    @Step(value = "Успешный логин")
    public ProductsPage successfulLogin(String login, String password) {
        login(login, password);
        return productsPage;
    }

    private void login(String login, String password) {
        loginPage.setLoginValue(login);
        loginPage.setPasswordValue(password);
        loginPage.clickLoginButton();
    }

}
