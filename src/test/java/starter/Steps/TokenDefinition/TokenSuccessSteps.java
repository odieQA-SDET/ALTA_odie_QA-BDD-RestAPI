package starter.Steps.TokenDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TokenSuccessSteps {
    @Steps
    starter.Test.token token;
    @Given("I was on the Token page")
    public void i_was_on_the_Token_page() {
    }

    @When("I filled username and password correctly")
    public void i_filled_username_and_Password_correctly() {
       token.setBodyReqToken();
    }

    @When("I clicked {string} button carefully and fun")
    public void i_clicked_button_carefully_and_fun(String string) {
        token.hitEndpointToken();
    }

    @Then("I was taken to New Dashboard")
    public void i_was_taken_to_New_Dashbord() {
    }

}