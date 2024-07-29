package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompletingYourOrderPage extends BasePage {

    private final By FINAL_TITLE = By.className("complete-header");
    private final By BACK_HOME_BUTTON = By.id("back-to-products");



    public CompletingYourOrderPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return FINAL_TITLE;
    }



    public WebElement getFinalTitle() {
        return pageDriver.findElement(FINAL_TITLE);
    }
    public WebElement getBackHomeButton() {
        return pageDriver.findElement(BACK_HOME_BUTTON);
    }


    public void clickBackHomeButton(){
        getBackHomeButton().click();
    }
}
