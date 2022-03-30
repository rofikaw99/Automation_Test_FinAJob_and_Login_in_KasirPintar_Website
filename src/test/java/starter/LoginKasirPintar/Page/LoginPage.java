package starter.LoginKasirPintar.Page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

@DefaultUrl("https://kasirpintar.co.id/login/")
public class LoginPage extends PageObject {
    @FindBy(id="sebagai")
    WebElement loginAs;
    @FindBy(how= How.XPATH, using = "//*[@id=\"sebagai\"]/option[1]")
    WebElement owner;
    @FindBy(how= How.XPATH, using = "/html/body/section/div/div/div[1]/form/div[1]/input")
    WebElement username;
    @FindBy(id = "password")
    WebElement passwordfield;
    @FindBy(how= How.XPATH, using = "/html/body/section/div/div/div[1]/form/button")
    WebElement btnLogin;
    @FindBy(how= How.XPATH, using = "//*[@id=\"tourDash\"]")
    WebElement dashboardField;

    public void clickOptionsLoginButton(){loginAs.click();}
    public void clickLoginasOwnerButton(){owner.click();}
    public void fillUsername(String email){username.sendKeys(email);}
    public void fillPassword(String password){
        passwordfield.sendKeys(password);
    }
    public void clickLoginButton(){btnLogin.click();}
    public String getDashboard(){return dashboardField.getText();}



}
