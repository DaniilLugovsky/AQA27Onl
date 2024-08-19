package steps;

import baseEntities.BaseStep;
import pages.ProductsPage;

public class UserStep extends BaseStep {

    public UserStep() {
        super();
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
