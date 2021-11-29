package starter.Steps.LoginDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Test.Login;

public class loginSuccessSteps {
    @Steps
    Login login;

    @Given("I was on the Login page")
    public void i_was_on_the_Login_page() {
    }

    @When("I filled my username and password correctly")
    public void i_filled_my_username_and_password_correctly() {
        login.setBodyReq();
    }

    @When("I clicked {string} button")
    public void i_clicked_button(String string) {
        login.hitEndpointLogin();
    }

    @Then("I was taken to the dashboard")
    public void i_was_taken_to_the_dashboard() {
        login.valDateEndpointLogin();
    }

}
