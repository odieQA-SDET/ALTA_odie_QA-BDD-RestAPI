package starter.Steps.TokenDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TokenEmptySteps {
    @Steps
    starter.Test.token token;
    @When("I filled my Password is Empty")
    public void i_filled_my_Password_is_Empty() {
        token.setBodyReqTokenEmpty();
    }

    @When("I clicked {string} in Token Page")
    public void i_clicked_button_Token_page(String string) {
        token.setBodyReqTokenEmpty();
    }

    @Then("I was stay in Token page")
    public void i_was_stay_in_token_Page() {
    }

}
