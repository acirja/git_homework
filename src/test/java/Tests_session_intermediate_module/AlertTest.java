package Tests_session_intermediate_module;

import Pages.AlertsPage;
import Pages.CommonPage;
import Pages.HomePage;
import SharedData.Hooks;
import extendUtility.ExtendUtility;
import extendUtility.ReportStep;
import org.junit.jupiter.api.Test;


import java.time.Duration;

public class AlertTest extends Hooks {

    private HomePage homePage;
    private CommonPage commonPage;
    private AlertsPage alertsPage;

    @Test
    public void automationMethod(){

        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());
        alertsPage = new AlertsPage(getDriver());

        homePage.goToDesiredMenu("Alerts, Frame & Windows");
        ExtendUtility.attachLog(ReportStep.PASS_STEP, "The user enters on Alerts, Frame & Windows menu");

        commonPage.goToDesiredSubMenu("Alerts");
        ExtendUtility.attachLog(ReportStep.PASS_STEP, "The user enters on Alerts sub-menu");

        //alert simplu: doar text si OK button
        alertsPage.interactWithDelayedAlert();
        ExtendUtility.attachLog(ReportStep.PASS_STEP, "The user deals with alert with OK");

        //alert cu delay la afisare
        alertsPage.interactWithDelayedAlert();
        ExtendUtility.attachLog(ReportStep.PASS_STEP, "The user deals with alert with delay");

        //alert cu Confirm - ok/cancel
        alertsPage.interactWithConfirmAlert(true);
        ExtendUtility.attachLog(ReportStep.PASS_STEP, "The user deals with alert with prompt");

        //alert cu Prompt text
        alertsPage.interactWithPromptAlert("some automation text here...", true);
        ExtendUtility.attachLog(ReportStep.PASS_STEP, "The user deals with alert cancel");

        getDriver().quit();

    }
}
