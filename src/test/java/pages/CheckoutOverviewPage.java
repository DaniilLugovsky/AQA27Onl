package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutOverviewPage extends BasePage {
    public TopMenuPage topMenuPage;

    private final By CANCEL_BUTTON = By.id("cancel");
    private final By FINISH_BUTTON = By.id("finish");



    public CheckoutOverviewPage() {
        super();

        topMenuPage = new TopMenuPage();
    }
    @Override
    protected By getPageIdentifier() {
        return FINISH_BUTTON;
    }


    public SelenideElement getCanselButton() {
        return $(CANCEL_BUTTON);
    }
    public SelenideElement getFinishButton() {
        return $(FINISH_BUTTON);
    }


    public void clickCanselButton(){
        getCanselButton().click();
    }
    public void clickFinishButton(){
        getFinishButton().click();
    }
}
