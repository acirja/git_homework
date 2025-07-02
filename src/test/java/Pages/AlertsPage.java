package Pages;

import HelperMethods.AlertsMethods;
import HelperMethods.ElementsMethods;
import logger.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class AlertsPage extends CommonPage{
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

    public AlertsPage(WebDriver driver){
        super(driver);
    }


    public void interactWithSimpleAlert(){
        // Alert simplu: Doar Text si OK button
        elementsMethods.clickOnElement(alertOkButtonElement);
        LoggerUtility.infoLog("The user clicks on alertOkButton field");

        alertsMethods.interactWithAlertOk();
        LoggerUtility.infoLog("The user interacts with an alert with ok option");
    }

    public void interactWithDelayedAlert(){
        // Alert cu delay la afisare
        elementsMethods.clickOnElement(delayedAlertButtonElement);
        LoggerUtility.infoLog("The user clicks on delayedAlertButton field");

        alertsMethods.interactAlertWithDelay();
        LoggerUtility.infoLog("The user interacts with an alert with delay mechanism");
    }

    public void interactWithConfirmAlert(boolean isConfirmed) {
        // Alert cu Confirm - OK/cancel
        elementsMethods.clickOnElement(alertConfirmButtonElement);
        LoggerUtility.infoLog("The user clicks on alertConfirmButton field");

        if (isConfirmed) {
            alertsMethods.interactWithAlertOk();
            LoggerUtility.infoLog("The user interacts with an alert with ok option");
        } else {
            alertsMethods.dismissAlert();
            LoggerUtility.infoLog("The user interacts with an alert with cancel option");
        }
    }

    public void interactWithPromptAlert(String inputText, boolean isConfirmed){
        // Alert cu Prompt Text
        elementsMethods.clickOnElement(alertPromptButtonElement);
        LoggerUtility.infoLog("The user clicks on alertPromptButton field");

        if (isConfirmed) {
            alertsMethods.interactWithPromptAlertAndConfirm(inputText);
            LoggerUtility.infoLog("The user interacts with an alert with prompt option");

        } else {
            alertsMethods.interactWithPromptAlertAndCancel(inputText);
            LoggerUtility.infoLog("The user interacts with an alert with cancel option");

        }

    }
}
