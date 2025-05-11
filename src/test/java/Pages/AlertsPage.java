package Pages;

import HelperMethods.AlertsMethods;
import HelperMethods.ElementsMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsPage extends CommonPage {
//    WebDriver driver;
//    ElementsMethods elementsMethods;
//    AlertsMethods alertMethods;

    @FindBy(id = "alertButton")
    private WebElement alertOkButtonElement;
    @FindBy(id = "timerAlertButton")
    private WebElement delayedAlertButtonElement;
    @FindBy(id = "confirmButton")
    private WebElement alertConfirmButtonElement;
    @FindBy(id = "promtButton")
    private WebElement alertPromptButtonElement;

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

//    public AlertsPage(WebDriver driver) {
//        this.driver = driver;
//        this.elementsMethods = new ElementsMethods(driver);
//        this.alertMethods = new AlertsMethods(driver);
//        PageFactory.initElements(driver, this);
//    }

    public void interactWithSimpleAlert() {
        // Alert simplu: Doar Text si OK button
        elementsMethods.clickOnElement(alertOkButtonElement);
        alertsMethods.interactWithAlertOk();
    }

    public void interactWithDelayedAlert() {
        // Alert cu delay la afisare
        elementsMethods.clickOnElement(delayedAlertButtonElement);
        alertsMethods.interactAlertWithDelay();
    }

    public void interactWithConfirmAlert(boolean isConfirmed) {
        // Alert cu Confirm - OK/cancel
        elementsMethods.clickOnElement(alertConfirmButtonElement);

        if (isConfirmed) {
            alertsMethods.interactWithAlertOk();
        } else {
            alertsMethods.dismissAlert();
        }
    }

    public void interactWithPromptAlert(String inputText, boolean isConfirmed){
        // Alert cu Prompt Text
        elementsMethods.clickOnElement(alertPromptButtonElement);
        if (isConfirmed) {
            alertsMethods.interactWithPromptAlertAndConfirm(inputText);
        } else {
            alertsMethods.interactWithPromptAlertAndCancel(inputText);
        }

    }
}
