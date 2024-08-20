package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProductsPage extends BasePage {

    public TopMenuPage topMenuPage;

    private final By HEADER_TITLE_LABEL_LOCATION = By.xpath("//span[text() ='Products']");
    private final By ADD_TO_CART_BUTTON = By.id("add-to-cart-sauce-labs-backpack");
    private final By REMOVE_BUTTON = By.id("remove-sauce-labs-backpack");

    public ProductsPage() {
        super();

        topMenuPage = new TopMenuPage();
    }

    @Override
    protected By getPageIdentifier() {
        return HEADER_TITLE_LABEL_LOCATION;
    }

    public SelenideElement getAddToCartButton() {
        return $(ADD_TO_CART_BUTTON);
    }

    public SelenideElement getRemoveButton() {
        return $(REMOVE_BUTTON);
    }

    public void clickAddToCartButton() {
        getAddToCartButton().click();
    }

    public void clickRemoveButton() {
        getRemoveButton().click();
    }

}
