package starter.Steps.AuthorizedDefiniton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class authorSuccessSteps {
    @Steps
    starter.Test.author author;

    @Given("I was on the Authorized page")
    public void i_was_on_the_Authorized_page() {
    }

    @When("I filled my username and Password is correctly")
    public void i_filled_my_username_and_Password_is_correctly() {
        author.setBodyReqAuthor();
    }

    @When("I clicked {string} button carefully")
    public void i_clicked_button_carefully(String string) {
        author.hitEndpointAuthor();
    }

    @Then("I was taken the new page of Authorized")
    public void i_was_taken_the_new_page_of_Authorized() {
    }

}
