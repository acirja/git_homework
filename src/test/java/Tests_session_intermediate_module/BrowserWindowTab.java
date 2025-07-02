package Tests_session_intermediate_module;

import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptMethods;
import HelperMethods.WindowsMethods;
import Pages.BrowserWindowsPage;
import Pages.CommonPage;
import Pages.HomePage;
import SharedData.Hooks;
import extendUtility.ExtendUtility;
import extendUtility.ReportStep;
import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class BrowserWindowTab extends Hooks {
    private HomePage homePage;
    private CommonPage commonPage;
    private WindowsMethods windowsMethods;
    private BrowserWindowsPage browserWindowsPage;

    @Test
    public void automationMethod(){

        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());
        windowsMethods = new WindowsMethods(getDriver());
        browserWindowsPage = new BrowserWindowsPage(getDriver());

        homePage.goToDesiredMenu("Alerts, Frame & Windows");
        ExtendUtility.attachLog(ReportStep.PASS_STEP, "The user enters on Alerts, Frame & Windows menu");

        commonPage.goToDesiredSubMenu("Browser Windows");
        ExtendUtility.attachLog(ReportStep.PASS_STEP, "The user enters on Browser Windows sub-menu");

        //butonul de New Tab
        browserWindowsPage.interactWithTheNewTab();
        ExtendUtility.attachLog(ReportStep.PASS_STEP, "The user interacts with new tab process");
        windowsMethods.switchToMain();

          //butonul de New Window
        browserWindowsPage.interactWithTheNewWindow();
        ExtendUtility.attachLog(ReportStep.PASS_STEP, "The user interacts with new windows process");
        windowsMethods.switchToMain();
    }

}

