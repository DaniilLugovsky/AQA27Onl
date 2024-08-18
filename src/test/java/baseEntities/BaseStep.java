package baseEntities;

import org.openqa.selenium.WebDriver;
import pages.DashboardPage;
import pages.LoginPage;
import pages.TestCase.AddTestCasePage;
import pages.TestCase.TestCasePage;
import pages.projects.AddProjectPage;

public class BaseStep {
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected DashboardPage dashboardPage;
    protected AddProjectPage addProjectPage;
    protected TestCasePage testCasePage;
    protected AddTestCasePage addTestCasePage;

    public BaseStep(WebDriver driver) {
        this.driver = driver;
        addProjectPage = new AddProjectPage(driver);
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        testCasePage = new TestCasePage(driver);
        addTestCasePage = new AddTestCasePage(driver);
    }
}