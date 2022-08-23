package stepDefinations.orangehrm;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import util.BaseClass;
import orangehrmPages.HomePage;

import java.util.Set;

@RunWith(Cucumber.class)
public class MyStepDefinitions extends BaseClass {

    static HomePage homePage;
    @BeforeAll
    public static void before_all() {
        getBrowserInstance("chrome");
        homePage = new HomePage();
    }

    @Given("^User in OrangeHrm Home page \"([^\"]*)\"$")
    public void user_in_orangehrm_home_page_something(String url) {
        driver.get(url);
    }

    @When("^User login OrangeHrm application with (.+) and (.+)$")
    public void user_login_orangehrm_application_with_and(String username, String password) throws Throwable {
        homePage.username.sendKeys(username);
        homePage.password.sendKeys(password);
        homePage.loginBth.click();
    }

    @Then("^OrangeHrm Dashboard page displayed \"([^\"]*)\"$")
    public void OrangeHrm_dashboard_page_displayed_something(String strArg1) throws Throwable {
        boolean flag = driver.getTitle().contains("dashboard");
        System.out.println(flag);
    }

    @And("^Profile page displayed \"([^\"]*)\"$")
    public void profile_page_displayed_something(String strArg1) throws Throwable {

    }

    @AfterAll
    public static void after_all() {
        driver.close();
    }
}
