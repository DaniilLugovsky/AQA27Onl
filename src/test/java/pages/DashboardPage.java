package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage extends BasePage {
    private final static String pagePath = "/index.php?/dashboard";

    public TopMenuPage topMenuPage;

    // Блок описания селекторов для элементов
    private final By headerTitleLabelLocator = By.xpath("//div[contains(@class, 'content-header-title') and contains(text(), 'All Projects')]");
    private final By ADD_PROJECT_BUTTON_LOCATOR = By.id("sidebar-projects-add");
    private final By PROJECT_BUTTON_LOCATOR = By.xpath("//a[text()='AQA27AQA27']");

    public DashboardPage(WebDriver driver) {
        super(driver);

        topMenuPage = new TopMenuPage(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return headerTitleLabelLocator;
    }

    public void openPageByUrl() {
        super.openPageByUrl(pagePath);
    }

    // Блок атомарных методов
    public WebElement getHeaderTitleLabel() {
        return driver.findElement(headerTitleLabelLocator);
    }

    public WebElement getAddProjectButton() {
        return waitsService.presenceOfElementLocated(ADD_PROJECT_BUTTON_LOCATOR);
    }
    public WebElement getProjectButton() {
        return waitsService.presenceOfElementLocated(PROJECT_BUTTON_LOCATOR);
    }
    public void clickAddProjectButton() {
        getAddProjectButton().click();
    }
    public void clickProjectButton() {
        getProjectButton().click();
    }
}
