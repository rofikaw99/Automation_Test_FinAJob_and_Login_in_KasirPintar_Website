package starter.FindaJobinKasirPintar.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.FindaJobinKasirPintar.Step.findCareerSteps;

public class FindaJobStepDef {

    @Steps
    findCareerSteps findCareerSteps;

    @Given("I open career page")
    public void opencareerPage(){
        findCareerSteps.OpenFacebookPage();
    }

    @When("I input a job {}")
    public void inputajob(String job){
        findCareerSteps.InputaJob(job);
    }

    @When("I click cari button")
    public void clickcaributton(){
        findCareerSteps.clickcariButton();
    }

    @Then("I can see my job")
    public void seeMyjob(){

        findCareerSteps.verifyDahsboard();
    }
}
