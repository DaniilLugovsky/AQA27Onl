package baseEntities;

import org.openqa.selenium.WebDriver;
import pages.DashboardPage;
import pages.LoginPage;
import pages.TestCase.AddTestCasePage;
import pages.TestCase.TestCasePage;
import pages.projects.EditProjectPage;

public class BaseStep {
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected DashboardPage dashboardPage;
    protected EditProjectPage editProjectPage;
    protected TestCasePage testCasePage;
    protected AddTestCasePage addTestCasePage;

    public BaseStep(WebDriver driver) {
        this.driver = driver;
        editProjectPage = new EditProjectPage(driver);
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        testCasePage = new TestCasePage(driver);
        addTestCasePage = new AddTestCasePage(driver);
    }
}