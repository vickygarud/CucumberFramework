package stepDefinations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;


@RunWith(Cucumber.class)
public class MyStepdefs {

    @Given("^User in home page$")
    public void user_in_home_page() throws Throwable {
        System.out.println("Hello World 1");
//        throw new PendingException();
    }

    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
        System.out.println("Hello World 2");
        System.out.println(strArg1 + " " + strArg2);
//        throw new PendingException();
    }

    @Then("^Dashboard page displayed \"([^\"]*)\"$")
    public void dashboard_page_displayed_something(String strArg1) throws Throwable {
        System.out.println("Hello World 3");
        System.out.println("Should be display: " + strArg1);

        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd MM yyy hh-mm-ss"));
        System.out.println(time);
//        throw new PendingException();
    }

    @And("^User profile should be displayed$")
    public void User_profile_should_be_displayed(DataTable data) throws Throwable {
        System.out.println("Hello World 4");
        List<List<String>> ob = data.asLists();
        System.out.println(ob.get(0).get(0) + " " + ob.get(1).get(0));
//        throw new PendingException();
    }


    @And("^Invalid credential message should be displayed$")
    public void invalid_credential_message_should_be_displayed() throws Throwable {
//        throw new PendingException();
    }

}
