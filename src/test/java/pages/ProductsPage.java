package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage extends BasePage {

    public TopMenuPage topMenuPage;

    private final By HEADER_TITLE_LABEL_LOCATION = By.xpath("//span[text() ='Products']");
    private final By ADD_TO_CART_BUTTON = By.id("add-to-cart-sauce-labs-backpack");
    private final By REMOVE_BUTTON = By.id("remove-sauce-labs-backpack");



    public ProductsPage(WebDriver driver) {
        super(driver);

        topMenuPage = new TopMenuPage(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return HEADER_TITLE_LABEL_LOCATION;
    }



    public WebElement getAddToCartButton() {
        return pageDriver.findElement(ADD_TO_CART_BUTTON);
    }
    public WebElement getRemoveButton() {
        return pageDriver.findElement(REMOVE_BUTTON);
    }


    public void clickAddToCartButton() {
        getAddToCartButton().click();
    }
    public void clickRemoveButton() {
        getRemoveButton().click();
    }

}
