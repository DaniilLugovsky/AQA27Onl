package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DropDown {
    private UIElement actionElement;
    private List<UIElement> parametersElementList;

    public DropDown(WebDriver driver, By by) {
        this.actionElement = new UIElement(driver, by);
        parametersElementList = new ArrayList<>();
        for (WebElement element : actionElement.findUIElements(By.tagName("li"))) {
            UIElement uiElement = new UIElement(driver, element);
            parametersElementList.add(uiElement);
        }

    }
    public void selectByIndex(int index) {
        actionElement.click();
        parametersElementList.get(index).click();
    }
}