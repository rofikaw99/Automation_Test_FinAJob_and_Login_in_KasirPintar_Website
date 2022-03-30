package starter.LoginKasirPintar.StepDefinition;

import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import starter.LoginKasirPintar.step.LoginStep;

public class CommonStepDefinition {
    @Steps
    LoginStep loginStep;

    @Given("I already Login to the dashboard")
    public void alreadyLogin(String email, String password){
        loginStep.openKasirPintarLoginPage();
        loginStep.inputEmailAndPassword(email, password);
        loginStep.clickLoginButton();
    }



}
