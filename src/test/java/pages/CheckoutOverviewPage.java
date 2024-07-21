package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutOverviewPage extends BasePage {

    public TopMenuPage topMenuPage;

    private final By CANCEL_BUTTON = By.id("cancel");
    private final By FINISH_BUTTON = By.id("finish");



    public CheckoutOverviewPage(WebDriver driver) {
        super(driver);

        topMenuPage = new TopMenuPage(driver);
    }
    @Override
    protected By getPageIdentifier() {
        return FINISH_BUTTON;
    }



    public WebElement getCanselButton() {
        return pageDriver.findElement(CANCEL_BUTTON);
    }
    public WebElement getFinishButton() {
        return pageDriver.findElement(FINISH_BUTTON);
    }


    public void clickCanselButton(){
        getCanselButton().click();
    }
    public void clickFinishButton(){
        getFinishButton().click();
    }
}
