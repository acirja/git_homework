package Tests_session_intermediate_module;

import HelperMethods.FramesMethods;

import Pages.CommonPage;
import Pages.FramesPage;
import Pages.HomePage;
import SharedData.Hooks;
import extendUtility.ExtendUtility;
import extendUtility.ReportStep;
import org.junit.jupiter.api.Test;


public class FramesTest extends Hooks {
    private HomePage homePage;
    private CommonPage commonPage;
    private FramesPage framesPage;
    private FramesMethods framesMethods;

    @Test
    public void automationMethod(){

        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());
        framesMethods = new FramesMethods(getDriver());
        framesPage = new FramesPage(getDriver());

        homePage.goToDesiredMenu("Alerts, Frame & Windows");
        ExtendUtility.attachLog(ReportStep.PASS_STEP, "The user enters on Alerts, Frame & Windows menu");

        commonPage.goToDesiredSubMenu("Frames");
        ExtendUtility.attachLog(ReportStep.PASS_STEP, "The user enters  on Frame sub-menu");

        //Frame 1
        framesPage.interactWithFrame1();
        ExtendUtility.attachLog(ReportStep.PASS_STEP, "The user interacts with the first iframe");

        //revenim cu focusul pe pagina principala
        framesMethods.switchToMainContent();

        //Frame 2
        framesPage.interactWithFrame2();
        ExtendUtility.attachLog(ReportStep.PASS_STEP, "The user interacts with the second iframe");

        framesMethods.switchToMainContent();

    }
}
