package HelperMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertsMethods {
    private WebDriver driver;

    public AlertsMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void interactWithAlertOk(){
        Alert alertOk = driver.switchTo().alert();
        //ne mutam cu focusul pe alerta
        alertOk.accept();
    }

    public void explicitAlertWait(){
        //definim un wait explicit ca sa astepte dupa alerta
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public void interactAlertWithDelay(){
        explicitAlertWait();
        //ne mutam cu focusul pe alerta
        Alert alertDelayOk = driver.switchTo().alert();
        alertDelayOk.accept();
    }

    public void dismissAlert(){
        //dam cancel la alerta
        Alert alertConfirmation = driver.switchTo().alert();
        alertConfirmation.dismiss();
    }

    public void interactWithPromptAlertAndConfirm(String text){
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(text);
        alert.accept();
    }

    public void interactWithPromptAlertAndCancel(String text){
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(text);
        alert.dismiss();
    }


}
