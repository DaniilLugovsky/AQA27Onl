package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CartOfGoodsPage extends BasePage {

    public TopMenuPage topMenuPage;

    private final By TITLE_LABEL = By.xpath("//span[text() ='Your Cart']");
    private final By CONTINUE_SHOPPING_BUTTON = By.id("continue-shopping");
    private final By CHECKOUT_BUTTON = By.id("checkout");
    private final By ITEM_IN_CART = By.xpath("//div[@class ='inventory_item_name']");
    private final By DELETE_ITEM_IN_CART_BUTTON = By.id("remove-sauce-labs-backpack");

    public CartOfGoodsPage() {
        super();

        topMenuPage = new TopMenuPage();
    }

    @Override
    protected By getPageIdentifier() {
        return TITLE_LABEL;
    }

    public SelenideElement getTitleLabel() {
        return $(TITLE_LABEL);
    }

    public SelenideElement getItemInCart() {
        return $(ITEM_IN_CART);
    }

    public SelenideElement getContinueShoppingButton() {
        return $(CONTINUE_SHOPPING_BUTTON);
    }

    public SelenideElement getCheckoutButton() {
        return $(CHECKOUT_BUTTON);
    }

    public SelenideElement getDeleteItemInCartButton() {
        return $(DELETE_ITEM_IN_CART_BUTTON);
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
