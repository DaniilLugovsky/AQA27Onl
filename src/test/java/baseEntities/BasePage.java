package baseEntities;

import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public abstract class BasePage {

    protected final int WAIT_FOR_PAGE_LOADED_IN_SECONDS = 30;

    public BasePage() {
    }

    protected abstract By getPageIdentifier();

    public boolean isPageOpened() {
        return $(getPageIdentifier())
                .shouldBe(visible, Duration.ofSeconds(WAIT_FOR_PAGE_LOADED_IN_SECONDS))
                .isDisplayed();
    }
}
