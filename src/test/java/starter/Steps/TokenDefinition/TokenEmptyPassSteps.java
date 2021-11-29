package starter.Steps.TokenDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TokenEmptyPassSteps {
    @Steps
    starter.Test.token token;

    @When("I filled username correctly and Password is empty")
    public void i_filled_username_correctly_and_Password_is_empty() {
        token.setBodyReqTokenEmptyPass();
    }

    @When("I clicked {string} the empty Pass")
    public void i_clicked_button_the_empty_Pass(String string) {
        token.setBodyReqTokenEmptyPass();
    }

    @Then("Warning Password invalid and stay in page")
    public void i_am_taken_to_New_Page() {
    }

}
