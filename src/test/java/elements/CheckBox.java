package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBox {
    private final UIElement uiElement;

    public CheckBox(WebDriver driver, By by) {
        this.uiElement = new UIElement(driver,by);
    }

    public void setCheckBox() {
        if (!uiElement.isSelected()) {
            uiElement.click();
        }
    }

    public void removeCheckBox() {
        if (uiElement.isSelected()) {
            uiElement.click();
        }
    }
}