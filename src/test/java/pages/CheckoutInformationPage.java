package pages;

import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutInformationPage extends BasePage {

    public TopMenuPage topMenuPage;

    private final By FIRST_NAME_INPUT_LOCATOR = By.id("first-name");
    private final By LAST_NAME_INPUT_LOCATOR = By.id("last-name");
    private final By POSTAL_CODE_INPUT_LOCATOR = By.id("postal-code");
    private final By CANCEL_BUTTON = By.id("cancel");
    private final By CONTINUE_BUTTON = By.id("continue");



    public CheckoutInformationPage() {
        super();

        topMenuPage = new TopMenuPage();
    }

    @Override
    protected By getPageIdentifier() {
        return POSTAL_CODE_INPUT_LOCATOR;
    }


    public SelenideElement getFirstNameInput() {
        return $(FIRST_NAME_INPUT_LOCATOR);
    }
    public SelenideElement getLastNameInput() {
        return $(LAST_NAME_INPUT_LOCATOR);
    }
    public SelenideElement getPostalInput() {
        return $(POSTAL_CODE_INPUT_LOCATOR);
    }
    public SelenideElement getCanselButton() {
        return $(CANCEL_BUTTON);
    }
    public SelenideElement getContinueButton() {
        return $(CONTINUE_BUTTON);
    }


    public void setFirstNameInput(String firstName){
        getFirstNameInput().val(firstName);
    }
    public void setLastNameInput(String lastName){
        getLastNameInput().val(lastName);
    }
    public void setPostalInput(String postal){
        getPostalInput().val(postal);
    }
    public void clickCanselButton(){
        getCanselButton().click();
    }
    public void clickContinueButton(){
        getContinueButton().click();
    }
}
