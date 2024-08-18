package steps;

import baseEntities.BaseStep;
import configuration.ReadProperties;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.DashboardPage;
import pages.LoginPage;
import pages.TestCase.AddTestCasePage;
import pages.TestCase.TestCasePage;
import pages.projects.AddProjectPage;

public class UserStep extends BaseStep {

    public UserStep(WebDriver driver) {
        super(driver);
    }

    @Step(value = "Успешный логин")
    public DashboardPage successfulLogin(String username, String password) {
        login(username, password);

        return dashboardPage;
    }

    public DashboardPage successfulLogin() {
        loginFull();

        return dashboardPage;
    }

    @Step(value = "Некорректный логин")
    public LoginPage incorrectLogin(String username, String password) {
        login(username, password);

        return loginPage;
    }

    private void login(String username, String password) {
        loginPage.setEmailValue(username);
        loginPage.setPasswordValue(password);
        loginPage.clickLogin();
    }

    private void loginFull() {
        loginPage.setEmailValue(ReadProperties.username());
        loginPage.setPasswordValue(ReadProperties.password());
        loginPage.clickLogin();
    }

    private void openEditProject() {
        dashboardPage.clickEdit();
    }

    public AddProjectPage openEditProjectPage() {
        openEditProject();

        return addProjectPage;
    }

    public TestCasePage transitionInTestCasePage () {
        openTestCases();
        return testCasePage;
    }

    private void openTestCases() {
        dashboardPage.clickTestCases();
    }

    public AddTestCasePage addTestCase() {
        testCasePage.clickAddTestCase();

        return addTestCasePage;
    }

    public void selectDropDownByIndex(int index) {
        addTestCasePage.getPriorityDropDown(By.id("section_id_chzn")).selectByIndex(index);
    }

}


