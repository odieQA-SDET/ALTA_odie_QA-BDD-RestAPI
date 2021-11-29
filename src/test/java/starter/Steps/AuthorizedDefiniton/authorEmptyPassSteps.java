package starter.Steps.AuthorizedDefiniton;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class authorEmptyPassSteps {
    @Steps
    starter.Test.author author;
    @When("I filled the empty Password but Username correctly")
    public void i_filled_the_empty_Password_but_Username_correctly(){
        author.setBodyReqAuthorEmptyPass();
    }

    @When("I clicked {string} button the system")
    public void i_clicked_button_the_system(String string) {
        author.setBodyReqAuthorEmptyPass();
    }

}
