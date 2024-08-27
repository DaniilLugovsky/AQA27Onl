package stepDefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class FirstStepDefs {
    @Given("открыт браузер")
    public void startBrowser() {
        System.out.println("Браузер Запущен");
    }

    @Given("страница логина открыта")
    @When("открываем страницу логина")
    public void openLoginPage() {
        System.out.println("Открыта страница логина");
    }

    @When("пользователь вводит значения")
    public void userEnterValues() {
        System.out.println("Открыта страница логина");
    }

    @Then("поле логина отображается")
    public void isLoginFieldDisplayed() {
        Assert.assertTrue(true, "Поле логина не отображается");
    }

    @Then("кнопка логина становиться активной")
    public void isLoginButtonClickable() {
        Assert.assertTrue(true, "кнопка логина не активна");
    }

    @Then("кнопка логина не становиться активной")
    public void isLoginButtonNotClickable() {
        Assert.assertTrue(true, "кнопка логина активна");
    }

    @When("user {string} with password {string} log in")
    public void login(String username, String password) {
        System.out.println(username);
        System.out.println(password);
    }

    @Then("^page title is ([^\"]*)$")
    public void isPageTitleIs(String title) {
        System.out.println(title);
    }

    @Then("^all elements (are|are not) visible$")
    public void elementsVisibility(String parameter) {
        System.out.println(parameter);
        if (parameter.equals("are")) {
            System.out.println("Вы изпользавали are");
        } else if (parameter.equals("are not")) {
            System.out.println("Вы использавали are not");
        }
    }

    @Then("^all elements \"(are|are not)\" visible$")
    public void elementsVisibility1(String title) {
        System.out.println(title);
    }


    @And("project ID is {int}")
    public void isProjectIDEqual(int id) {
        System.out.println(id);
    }

    @And("^project ID equal to (\\d+)$")
    public void isProjectIDEqual1(int id) {
        System.out.println(id);
    }

    @And("^project ID is \"(\\d+)\"$")
    public void isProjectIDEqual2(int id) {
        System.out.println(id);
    }

    @When("user logged in with")
    public void userLoggedInWith(DataTable parameters) {
        Map<String, String> expectedValues = parameters.asMap(String.class, String.class);
        System.out.println(expectedValues.get("username"));
        System.out.println(expectedValues.get("password"));
        System.out.println(expectedValues.get("age"));
        System.out.println(expectedValues.get("sex"));
    }

    @When("user logged in with 1")
    public void userLoggedInWith1(DataTable parameters) {
        List<Map<String, String>> exexpectedValues = parameters.asMaps(String.class, String.class);
        System.out.println(exexpectedValues.get(0).get("username"));
        System.out.println(exexpectedValues.get(0).get("password"));
        System.out.println(exexpectedValues.get(0).get("age"));
        System.out.println(exexpectedValues.get(0).get("sex"));
        System.out.println(exexpectedValues.get(1).get("username"));
        System.out.println(exexpectedValues.get(1).get("password"));
        System.out.println(exexpectedValues.get(1).get("age"));
        System.out.println(exexpectedValues.get(1).get("sex"));
    }

    @Then("error {string} is displayed")
    public void errorIsDisplayed(String errorMsg) {
        System.out.println(errorMsg);
    }
}
