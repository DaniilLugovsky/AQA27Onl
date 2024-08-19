package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CompletingYourOrderPage extends BasePage {

    private final By FINAL_TITLE = By.className("complete-header");
    private final By BACK_HOME_BUTTON = By.id("back-to-products");



    public CompletingYourOrderPage() {
        super();
    }

    @Override
    protected By getPageIdentifier() {
        return FINAL_TITLE;
    }


    public SelenideElement getFinalTitle() {
        return $(FINAL_TITLE);
    }
    public SelenideElement getBackHomeButton() {
        return $(BACK_HOME_BUTTON);
    }


    public void clickBackHomeButton(){
        getBackHomeButton().click();
    }
}
