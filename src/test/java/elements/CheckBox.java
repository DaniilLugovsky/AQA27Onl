package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.swing.*;

public class CheckBox {
    private final UIElement uiElement;

    public CheckBox(WebDriver driver, By by) {
        this.uiElement = new UIElement(driver, by);
    }

    public CheckBox(WebDriver driver, UIElement uiElement) {
        this.uiElement = new UIElement(driver, uiElement);
    }

    public void setCheckBox(boolean flag) {
        if (!uiElement.isSelected() && flag) {
            uiElement.click();
        }
    }

    public void set() {
        setCheckBox(true);
    }

    public void remove() {
        setCheckBox(false);
    }

    public void ClickElement() {
        uiElement.click();
    }

    public String readCheckBox() {
        if (uiElement.isSelected()) {
            return "true";
        } else if (!uiElement.isSelected()) {
            return "false";
        }
        return null;
    }
}