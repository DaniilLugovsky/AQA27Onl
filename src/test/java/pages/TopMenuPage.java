package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopMenuPage extends BasePage {
    private final By topPanelLocator = By.className("top-panel");

    public TopMenuPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected WebElement getPageIdentifier() {
       return pageDriver.findElement(topPanelLocator);
    }

    public void logout() {};
}
