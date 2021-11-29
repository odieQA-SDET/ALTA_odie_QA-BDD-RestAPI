package starter.Steps.LoginDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Test.Login;

public class loginEmptyPassSteps {
    @Steps
    Login login;

    @When("I filled my username correctly and the empty Password")
    public void i_filled_my_username_and_Password_incorrectly() {
        login.setBodyReqEmptyPass();
    }

    @And("I clicked {string} button the empty Password")
    public void i_clicked_button_the_empty_Password(String string) {
        login.hitEndPointLoginEmptyPass();
    }

    @Then("Warning massage UserName and Password required and stay Sign in page")
    public void warning_massage_UserName_and_Password_required_and_stay_Sign_in_page() {

    }

}
