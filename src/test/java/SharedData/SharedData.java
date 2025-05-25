package SharedData;

import SharedData.browser.BrowserFactory;
import configFile.ConfigFile;
import configFile.configNode.ConfigurationNode;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class SharedData {
    private WebDriver driver;

    @BeforeMethod
    public void prepareBrowser(){
        driver = new BrowserFactory().getBrowserFactory();

//        ConfigurationNode configurationNode = ConfigFile.createConfigNode(ConfigurationNode.class);
//        //configurationNode.driverConfigNode.localBrowser;
//
//        //deschidem un browser de Chrome
//        driver = new ChromeDriver();
//
//        //facem browserul in modul maximize
//        driver.manage().window().maximize();
//
//        //accesam o pagina web
////        driver.get("https://demoqa.com/");
//        driver.get(configurationNode.driverConfigNode.url);
//
//
//        //definim un wait implicit pentru un interval maxim de timp (pt ca avem a doua alerta ca apare dupa 5 secunde)
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void clearBrowser(){
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
