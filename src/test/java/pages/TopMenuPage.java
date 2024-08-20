package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class TopMenuPage extends BasePage {

    private final By HEADING = By.xpath("//div[@class ='app_logo']");
    private final By SHOPPING_CART_LINK = By.xpath("//a[@class ='shopping_cart_link']");
    private final By OPEN_MENU_BUTTON = By.id("react-burger-menu-btn");
    private final By MENU_ALL_ITEMS_BUTTON = By.id("inventory_sidebar_link");
    private final By MENU_ABOUT_BUTTON = By.id("about_sidebar_link");
    private final By MENU_LOGOUT = By.id("logout_sidebar_link");
    private final By MENU_RESET_APP_STATE_BUTTON = By.id("reset_sidebar_link");




    public TopMenuPage() {
        super();
    }

    @Override
    protected By getPageIdentifier() {
        return HEADING;
    }


    public SelenideElement getHeadingTitle() {
        return $(HEADING);
    }

    public SelenideElement getShoppingButton() {
        return $(SHOPPING_CART_LINK);
    }

    public SelenideElement getOpenMenuButton() {
        return $(OPEN_MENU_BUTTON);
    }

    public SelenideElement getMenuAllItemsButton() {
        return $(MENU_ALL_ITEMS_BUTTON);
    }

    public SelenideElement getMenuAboutButton() {
        return $(MENU_ABOUT_BUTTON);
    }

    public SelenideElement getMenuLogoutButton() {
        return $(MENU_LOGOUT);
    }

    public SelenideElement getMenuResetAppStateButton() {
        return $(MENU_RESET_APP_STATE_BUTTON);
    }

    public void clickShoppingButton() {
        getShoppingButton().click();
    }

    public void clickOpenMenuButton() {
        getOpenMenuButton().click();
    }

    public void clickMenuAllItemsButton() {
        getMenuAllItemsButton().click();
    }

    public void clickMenuAboutButton() {
        getMenuAboutButton().click();
    }

    public void clickMenuLogoutButton() {
        getMenuLogoutButton().click();
    }

    public void clickMenuResetAppStateButton() {
        getMenuResetAppStateButton().click();
    }

}
