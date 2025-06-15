package Tests_session_intermediate_module;

import HelperMethods.AlertsMethods;
import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptMethods;
import Pages.AlertsPage;
import Pages.CommonPage;
import Pages.HomePage;
import SharedData.Hooks;
import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AlertTest extends Hooks {
    //WebDriver driver; dispare pentru ca deja exista in clasa parinte
//    ElementsMethods elementsMethods;
    //JavaScriptMethods js;
//    AlertsMethods alertMethods;

    private HomePage homePage;
    private CommonPage commonPage;
    private AlertsPage alertsPage;

    @Test
    public void automationMethod(){
//        //deschidem un browser de Chrome
//        driver = new ChromeDriver();
//
//        //facem browserul in modul maximize
//        driver.manage().window().maximize();
//
//        //accesam o pagina web
//        driver.get("https://demoqa.com/");
//
//        //definim un wait implicit pentru un interval maxim de timp (pt ca avem a doua alerta ca apare dupa 5 secunde)
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        elementsMethods = new ElementsMethods(driver); //avem obiectul  //le avem in CommonPage
//        alertMethods = new AlertsMethods(driver); //initializam obiectul
//        js = new JavaScriptMethods(driver);
        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());
        alertsPage = new AlertsPage(getDriver());

        //facem un scroll
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,400)");
//        js.scrollDown(400);
//
//        WebElement alertFrameWindowElement = driver.findElement((By.xpath("//h5[text()='Alerts, Frame & Windows']")));
//        alertFrameWindowElement.click();
//        elementsMethods.clickOnElement(alertFrameWindowElement);

        homePage.goToDesiredMenu("Alerts, Frame & Windows");

//        WebElement alertElement = driver.findElement(By.xpath("//span[text()='Alerts']"));
//        elementsMethods.clickOnElement(alertElement);
        //alertElement.click(); //comentat pt ca am refactorizat mai sus
        commonPage.goToDesiredSubMenu("Alerts");

        //alert simplu: doar text si OK button
        alertsPage.interactWithDelayedAlert();

        //alert cu delay la afisare
        alertsPage.interactWithDelayedAlert();

        //alert cu Confirm - ok/cancel
        alertsPage.interactWithConfirmAlert(true);

        //alert cu Prompt text
        alertsPage.interactWithPromptAlert("some automation text here...", true);

        getDriver().quit();

//        //identificarea primului butonul Click Me (primului tip de alerta)
//        WebElement alertOkElement = getDriver().findElement(By.id("alertButton"));
//        elementsMethods.clickOnElement(alertOkElement);
//        //alertOkElement.click(); //comentat pt ca am refactorizat mai sus
//
//        alertMethods.interactWithAlertOk();
//
//        //identificarea celui de-al doilea buton Click Me (al 2 lea tip de alerta)
//        WebElement alertDelayOkElement = getDriver().findElement(By.id("timerAlertButton"));
//        elementsMethods.clickOnElement(alertDelayOkElement);
//        //alertOkElement.click();
//
//
//        alertMethods.interactAlertWithDelay();
////        //definim un wait explicit ca sa astepte dupa alerta REFACTORTIZARE cu linia de mai sus
////        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
////        wait.until(ExpectedConditions.alertIsPresent());
////
////        //ne mutam cu focusul pe alerta
////        Alert alertDelayOk = driver.switchTo().alert();
////        alertDelayOk.accept();
//
//        //identificarea celui de-al treilea buton Click Me (al 3 lea tip de alerta)
//        WebElement alertConfirmationOkElement = getDriver().findElement(By.id("confirmButton"));
//        alertConfirmationOkElement.click();
//
//        //ne mutam cu focusul pe alerta
//        Alert alertConfirmationOk = getDriver().switchTo().alert();
//        alertConfirmationOk.dismiss(); //ca sa mergem pe varianta de Cancel din alerta
//
//     //   !! de verificat ca dupa click pe Cancel din alert apare textul specific pe pagina web !!!
//
//        //identificarea celui de-al treilea buton Click Me (al 3 lea tip de alerta)
//        WebElement alertPromptElement = getDriver().findElement(By.id("promtButton"));
//        alertPromptElement.click();
//
//        //ne mutam cu focusul pe alerta
//        Alert alertPromptOk = getDriver().switchTo().alert();
//        alertPromptOk.sendKeys("Alina");
//        alertPromptOk.accept();



    }
}
