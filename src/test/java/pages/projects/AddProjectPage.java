package pages.projects;

import elements.Button;
import elements.CheckBox;
import elements.Input;
import elements.RadioButton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.DashboardPage;

public class AddProjectPage extends BaseProjectPage {
    private final By ADD_PROJECT_BUTTON_LOCATOR = By.id("accept");
    private final By PROJECT_TYPE_RADIO_BUTTON_LOCATOR = By.cssSelector("[name='suite_mode']");
    private final By CHECKBOX_SHOW_ANNOUNCEMENT_LOCATOR = By.id("show_announcement");
    private final By CHECKBOX_ENABLE_TEST_CASE_LOCATOR = By.name("case_statuses_enabled");
    private final By NAME_FIELD_LOCATOR =By.id("name");
    private final By ANNOUNCEMENT_FIELD_LOCATOR =By.id("announcement_display");


    public AddProjectPage(WebDriver driver) {
        super(driver);
    }

    public Button getAddProjectButton() {
        return new Button(pageDriver, ADD_PROJECT_BUTTON_LOCATOR);
    }

    public RadioButton getProjectTypeRadioButton() {
        return new RadioButton(pageDriver, PROJECT_TYPE_RADIO_BUTTON_LOCATOR);
    }

    public CheckBox getShowAnnouncementCheckBox() {
        return new CheckBox(pageDriver, CHECKBOX_SHOW_ANNOUNCEMENT_LOCATOR);
    }

    public CheckBox getEnableTestCaseCheckBox() {
        return new CheckBox(pageDriver, CHECKBOX_ENABLE_TEST_CASE_LOCATOR);
    }

    public Input getProjectNameInput() {
        return new Input(pageDriver, NAME_FIELD_LOCATOR);
    }

    public Input getAnnouncementInput() {
        return new Input(pageDriver, ANNOUNCEMENT_FIELD_LOCATOR);
    }


    public AddProjectPage addProjectName(String name) {
        getProjectNameInput().write(name);
        return new AddProjectPage(pageDriver);
    }

    public AddProjectPage addProjectAnnouncement(String text) {
        getAnnouncementInput().write(text);
        return new AddProjectPage(pageDriver);
    }

    public AddProjectPage setShowAnnouncement() {
        getShowAnnouncementCheckBox().setCheckBox();
        return new AddProjectPage(pageDriver);
    }

    public AddProjectPage setProjectType(int projectType) {
        getProjectTypeRadioButton().selectByIndex(projectType);
        return new AddProjectPage(pageDriver);
    }

    public AddProjectPage setEnableTestCase() {
        getEnableTestCaseCheckBox().setCheckBox();
        return new AddProjectPage(pageDriver);
    }

    public void createProject() {
        getAddProjectButton().click();
    }
}