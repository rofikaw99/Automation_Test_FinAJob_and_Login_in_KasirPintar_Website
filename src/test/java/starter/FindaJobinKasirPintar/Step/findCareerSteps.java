package starter.FindaJobinKasirPintar.Step;

import net.thucydides.core.annotations.Step;
import starter.FindaJobinKasirPintar.Page.careerPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class findCareerSteps {

    careerPage careerPage;

    @Step
    public void OpenFacebookPage(){
        careerPage.open();
    }
    @Step
    public void InputaJob(String job){
    careerPage.inputaJob(job);
    }
    @Step
    public void clickcariButton(){careerPage.clickcari();}
    @Step
    public void verifyDahsboard(){assertEquals("QA Automation Engineer",careerPage.getjobQA());}

}
