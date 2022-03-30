package starter.FindaJobinKasirPintar.Page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

@DefaultUrl("https://kasirpintar.co.id/careers/")
public class careerPage extends PageObject {


    @FindBy(id="posisi")
    WebElement careerfield;


    @FindBy(how=How.XPATH, using = "/html/body/section[2]/div")
    WebElement cariButton;

    @FindBy(how=How.XPATH, using = "/html/body/section[3]/div/table/tbody/tr/td[2]")
    WebElement jobfinded;


    public void inputaJob(String job){
        careerfield.sendKeys(job);
    }

    public void clickcari(){
        cariButton.click();
    }

    public String getjobQA(){
        return jobfinded.getText();
    }

}
