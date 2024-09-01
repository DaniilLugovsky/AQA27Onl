package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

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
        if (index >= 0 && index < parametersElementList.size()) {
            if (parametersElementList.get(index).isEnabled()) {
                parametersElementList.get(index).click();
            }
        } else {
            throw new IndexOutOfBoundsException("Индекс больше размера коллекции");
        }
    }

    public void selectByText(String text) {
        actionElement.click();
        for (UIElement uiElement : parametersElementList) {
            if (uiElement.getText().equals(text) && uiElement.isEnabled()) {
                uiElement.click();
                return;
            }
        }
        throw new IllegalArgumentException("Элемента с таким текстом не существует");
    }

    public String readTextElement() {
        return actionElement.getText();
    }
}