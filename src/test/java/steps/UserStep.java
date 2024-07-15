package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.ProductsPage;

public class UserStep extends BaseStep {

    public UserStep(WebDriver driver) {
        super(driver);
    }

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
