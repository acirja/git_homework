package SharedData;

import logger.LoggerUtility;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class Hooks extends SharedData{

    public String testName;

    @BeforeMethod
    public void prepareEnvironment(){
        testName = this.getClass().getSimpleName();
        LoggerUtility.startTestCase(testName); //putem accesa metodele din clasa LoggerUtility, fara sa fie nevoie sa cream un
        //obiect din clasa amintita, pentru ca metodele declarate in LoggerUtility sunt STATICE
        prepareBrowser();
    }

    @AfterMethod
    public void clearEnvironment(ITestResult result){ //ITestResult - "asculta" rezultatul testului
        if (result.getStatus() == ITestResult.FAILURE) { //status = failure
            LoggerUtility.errorLog(result.getThrowable().getMessage());  //"pune-mi" o eroare
        }
        clearBrowser();
        //prentru moment toate sunt bune
        LoggerUtility.endTestCase(testName);
    }

    @AfterSuite
    public void finaliseLogFiles(){
        LoggerUtility.mergeLogFileIntoOne();
    }
}
