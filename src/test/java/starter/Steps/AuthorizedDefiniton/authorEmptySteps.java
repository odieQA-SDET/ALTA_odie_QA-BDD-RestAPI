package starter.Steps.AuthorizedDefiniton;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class authorEmptySteps {
    @Steps
    starter.Test.author author;
    @When("I filled the empty username and Password of author")
    public void i_filled_the_empty_username_and_Password_author() {
        author.setBodyReqAuthorEmpty();
    }

    @When("I clicked {string} button the page")
    public void i_clicked_button_the_page(String string) {
        author.setBodyReqAuthorEmpty();
    }

    @Then("Warning massage UserName and Password required and stay in Authorized page")
    public void warning_massage_UserName_and_Password_Required_and_stay_in_Authorized_page() {
    }
}
