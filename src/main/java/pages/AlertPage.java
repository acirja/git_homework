package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPage {
    WebDriver driver;

    @FindBy(id = "alerttest")
    private WebElement alertPage;

    @FindBy(id = "alertexamples")
    private WebElement alertButton;

    public AlertPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateAlertPage(){
        alertPage.click();
    }

    public void clickAlertButton()
    {
        alertButton.click();
    }

    public void acceptAlert(){
        Alert alert = driver.switchTo().alert();
        //acceptam
        alert.accept();
    }

    public void dismissAlert(){
        Alert alert =  driver.switchTo().alert();
        alert.dismiss();
    }
}
