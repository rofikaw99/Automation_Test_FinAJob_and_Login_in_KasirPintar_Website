package starter.LoginKasirPintar.step;

import net.thucydides.core.annotations.Step;
import starter.LoginKasirPintar.Page.LoginPage;
import static net.thucydides.core.matchers.BeanMatcherAsserts.shouldMatch;
import static org.junit.Assert.*;

public class LoginStep {
    LoginPage loginPage;

    @Step
    public void openKasirPintarLoginPage(){
        loginPage.open();
    }

    @Step
    public void clickOptionsLoginAs(){
        loginPage.clickOptionsLoginButton();
    }

    @Step
    public void clickLoginasOwner(){
        loginPage.clickLoginasOwnerButton();
    }

    @Step
    public void inputEmailAndPassword(String email, String password){
        loginPage.fillUsername(email);
        loginPage.fillPassword(password);
    }

    @Step
    public void clickLoginButton(){
        loginPage.clickLoginButton();
    }

    @Step
    public void verifyDahsboard(){
        assertEquals("Dashbord",loginPage.getDashboard());
    }
}
