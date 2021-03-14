package StepDefinition;


import org.junit.runner.RunWith;
import


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@RunWith(Cucumber.class)

public class StepDefinition {

    @When("^User enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enter_something_and_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1);
        System.out.println(strArg2);
    }
    @Given("^User should be on login screen$")
    public void user_should_be_on_login_screen() throws Throwable {
    	 System.out.println("Given user is on home screen");
    }
}