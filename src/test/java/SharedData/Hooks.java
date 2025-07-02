package SharedData;

import extendUtility.ExtendUtility;
import logger.LoggerUtility;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Hooks extends SharedData{

    public String testName;

    @BeforeSuite
    public void initiateTestReport(){
        ExtendUtility.initiateReport();
    }

    @BeforeMethod
    public void prepareEnvironment(){
        testName = this.getClass().getSimpleName();
        LoggerUtility.startTestCase(testName); //putem accesa metodele din clasa LoggerUtility, fara sa fie nevoie sa cream un
        //obiect din clasa amintita, pentru ca metodele declarate in LoggerUtility sunt STATICE
        ExtendUtility.createTest(testName);
        prepareBrowser();
    }

    @AfterMethod
    public void clearEnvironment(ITestResult result){ //ITestResult - "asculta" rezultatul testului
        if (result.getStatus() == ITestResult.FAILURE) {
            String errorMessage = result.getThrowable().getMessage();
            //status = failure
            LoggerUtility.errorLog(errorMessage);  //"pune-mi" o eroare
            ExtendUtility.attachLog(testName, errorMessage, getDriver());
        }
        clearBrowser();
        //prentru moment toate sunt bune
        LoggerUtility.endTestCase(testName);
        ExtendUtility.finishTest(testName);
    }

    @AfterSuite
    public void finaliseLogFiles(){
        LoggerUtility.mergeLogFileIntoOne();
        ExtendUtility.generateReport();
    }
}
