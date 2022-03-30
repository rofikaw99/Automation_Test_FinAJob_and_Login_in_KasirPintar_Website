package starter.LoginKasirPintar.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.LoginKasirPintar.step.LoginStep;

public class LoginStepDefinition {

    @Steps
    LoginStep loginStep;

    @Given("I open kasir pintar login page")
    public void i_open_kasir_pintar_login_page() {
        loginStep.openKasirPintarLoginPage();
    }
    @When("user login as owner")
    public void userLoginAsOwner() {
        loginStep.clickOptionsLoginAs();
        loginStep.clickLoginasOwner();
    }
    @When("I input email {} and password {} in Kasir Pintar")
    public void i_input_email_and_password_in_kasir_pintar(String email, String password) {
        loginStep.inputEmailAndPassword(email, password);
    }
    @When("I click button masuk kasir pintar")
    public void i_click_button_masukkasirpintar() {
        loginStep.clickLoginButton();
    }
    @Then("I can see kasir pintar dashbord")
    public void i_can_see_my_dashbord() {
        loginStep.verifyDahsboard();
    }

}
