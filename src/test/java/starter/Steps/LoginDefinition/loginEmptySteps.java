package starter.Steps.LoginDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Test.Login;

public class loginEmptySteps {
    @Steps
    Login login;

    @When("I filled the empty username and Password")
    public void i_filled_the_empty_username_and_Password() {
        login.setBodyReqEmpty();
    }

    @And("I clicked {string} button in page")
    public void i_clicked_button_in_page(String string) {
        login.hitEndPointLoginEmpty();
    }
}
