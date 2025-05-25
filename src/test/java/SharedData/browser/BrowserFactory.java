package SharedData.browser;

import SharedData.browser.service.ChromeBrowserService;
import SharedData.browser.service.EdgeBrowserService;
import configFile.ConfigFile;
import configFile.configNode.ConfigurationNode;
import org.openqa.selenium.WebDriver;

public class BrowserFactory {
    //aici definim ce serviciu sa fiu apelat in functie de alege userul in .yml

    //totodata rolul acestei clase este ca sa decida ce browser este folosit cand este rulat pe local un test

    public WebDriver getBrowserFactory(){

        String ciCD = System.getProperty("ciCd");  //verificam/aflam ce valori pentru browser a definit userul pentru noi
        String browser = System.getProperty("browser").toLowerCase();

        //System.out.println("uita-te aici" + browser);

        ConfigurationNode configurationNode = ConfigFile.createConfigNode(ConfigurationNode.class);

        if (Boolean.parseBoolean(ciCD)) { //convertim Stringul de mai sus la boolean
            configurationNode.driverConfigNode.headless = "--headless";   //pt remote
        }
        else {
            browser = configurationNode.driverConfigNode.localBrowser; //pt local(va lua valoare din shareDataConfig.xml
        }

        switch (browser){
            case BrowserType.BROWSER_CHROME:
                ChromeBrowserService chromeService = new ChromeBrowserService();
                chromeService.openBrowser(configurationNode.driverConfigNode);
                return chromeService.getDriver();

            case BrowserType.BROWSER_EDGE:
                EdgeBrowserService edgeService = new EdgeBrowserService();
                edgeService.openBrowser(configurationNode.driverConfigNode);
                return  edgeService.getDriver();
        }

        return null;
    }
}
