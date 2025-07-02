package SharedData;

import SharedData.browser.BrowserFactory;
import logger.LoggerUtility;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class SharedData {
    private WebDriver driver;

   // @BeforeMethod //nu mai avem nevoie pentru ca o sa le manage-uim in clase de Hooks
    public void prepareBrowser() {
        driver = new BrowserFactory().getBrowserFactory();
        LoggerUtility.infoLog("The browser was opened with success");
    }

    //@AfterMethod
    public void clearBrowser(){
        driver.quit();
        LoggerUtility.endTestCase("The browser was closed with success");
    }

    public WebDriver getDriver() {
        return driver;
    }
}
