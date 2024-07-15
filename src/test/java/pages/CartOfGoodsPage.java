package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartOfGoodsPage extends BasePage {

    public TopMenuPage topMenuPage;

    private final By TITLE_LABEL = By.xpath("//span[text() ='Your Cart']");
    private final By CONTINUE_SHOPPING_BUTTON = By.id("continue-shopping");
    private final By CHECKOUT_BUTTON = By.id("checkout");
    private final By ITEM_IN_CART = By.xpath("//div[@class ='inventory_item_name']");
    private final By DELETE_ITEM_IN_CART_BUTTON = By.id("remove-sauce-labs-backpack");



    public CartOfGoodsPage(WebDriver driver) {
        super(driver);

        topMenuPage = new TopMenuPage(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return TITLE_LABEL;
    }



    public WebElement getTitleLabel() {
        return pageDriver.findElement(TITLE_LABEL);
    }
    public WebElement getItemInCart() {
        return pageDriver.findElement(ITEM_IN_CART);
    }
    public WebElement getContinueShoppingButton() {
        return pageDriver.findElement(CONTINUE_SHOPPING_BUTTON);
    }
    public WebElement getCheckoutButton() {
        return pageDriver.findElement(CHECKOUT_BUTTON);
    }
    public WebElement getDeleteItemInCartButton() {
        return pageDriver.findElement(DELETE_ITEM_IN_CART_BUTTON);
    }


    public void clickContinueShoppingButton() {
        getContinueShoppingButton().click();
    }
    public void clickCheckoutButton() {
        getCheckoutButton().click();
    }
    public void clickDeleteItemInCartButton() {
        getDeleteItemInCartButton().click();
    }
}
