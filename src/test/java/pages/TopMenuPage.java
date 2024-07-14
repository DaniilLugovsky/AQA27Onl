package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopMenuPage extends BasePage {

    private final By HEADING = By.xpath("//div[@class ='app_logo']");
    private final By SHOPPING_CART_LINK = By.xpath("//a[@class ='shopping_cart_link']");
    private final By OPEN_MENU_BUTTON = By.id("react-burger-menu-btn");
    private final By MENU_ALL_ITEMS_BUTTON = By.id("inventory_sidebar_link");
    private final By MENU_ABOUT_BUTTON = By.id("about_sidebar_link");
    private final By MENU_LOGOUT = By.id("logout_sidebar_link");
    private final By MENU_RESET_APP_STATE_BUTTON = By.id("reset_sidebar_link");




    public TopMenuPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return HEADING;
    }



    public WebElement getHeadingTitle() {
        return pageDriver.findElement(HEADING);
    }
    public WebElement getShoppingButton() {
        return pageDriver.findElement(SHOPPING_CART_LINK);
    }
    public WebElement getOpenMenuButton() {
        return pageDriver.findElement(OPEN_MENU_BUTTON);
    }
    public WebElement getMenuAllItemsButton() {
        return pageDriver.findElement(MENU_ALL_ITEMS_BUTTON);
    }
    public WebElement getMenuAboutButton() {
        return pageDriver.findElement(MENU_ABOUT_BUTTON);
    }
    public WebElement getMenuLogoutButton() {
        return pageDriver.findElement(MENU_LOGOUT);
    }
    public WebElement getMenuResetAppStateButton() {
        return pageDriver.findElement(MENU_RESET_APP_STATE_BUTTON);
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
