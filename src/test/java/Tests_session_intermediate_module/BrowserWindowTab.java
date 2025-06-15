package Tests_session_intermediate_module;

import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptMethods;
import HelperMethods.WindowsMethods;
import Pages.BrowserWindowsPage;
import Pages.CommonPage;
import Pages.HomePage;
import SharedData.Hooks;
import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class BrowserWindowTab extends Hooks {
    //WebDriver driver;
//    JavaScriptMethods javaScriptMethods;
//    ElementsMethods elementsMethods;
    private HomePage homePage;
    private CommonPage commonPage;
    private WindowsMethods windowsMethods;
    private BrowserWindowsPage browserWindowsPage;

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

        //definim un wait implicit pentru un interval maxim de timp (pt ca avem a doua alerta ca apare dupa 5 secunde)
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        javaScriptMethods = new JavaScriptMethod(driver); //nu mai avem nevoie
//        elementsMethods = new ElementsMethods(driver);
        //windowsMethods = new WindowsMethods(getDriver());
        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());
        windowsMethods = new WindowsMethods(getDriver());
        browserWindowsPage = new BrowserWindowsPage(getDriver());

        //javaScriptMethods.scrollDown(400);
        //facem un scroll
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,400)");


//        WebElement alertFrameWindowElement = driver.findElement((By.xpath("//h5[text()='Alerts, Frame & Windows']")));
//        alertFrameWindowElement.click();
        homePage.goToDesiredMenu("Alerts, Frame & Windows");

//        WebElement alertElement = driver.findElement(By.xpath("//span[text()='Browser Windows']"));
//        alertElement.click();
        commonPage.goToDesiredSubMenu("Browser Windows");

        //butonul de New Tab
        browserWindowsPage.interactWithTheNewTab();
        windowsMethods.switchToMain();

//        WebElement newTabElement = getDriver().findElement(By.id("tabButton"));
//        newTabElement.click();

//        //trebuie sa mutam focusul Seleniumului pe noul tab deschis
//        ArrayList<String> tabList = new ArrayList<>(getDriver().getWindowHandles()); //getWindowHandles - returneaza cate taburi sunt deschise
//        getDriver().switchTo().window(tabList.get(1));
//
//        WebElement newTabOpenElement = getDriver().findElement(By.id("sampleHeading"));
//        System.out.println("textul din noul tab deschis este: " + newTabOpenElement.getText());
//
//        //inchidem tabul nou dechis
//        getDriver().close();
//        getDriver().switchTo().window(tabList.get(0));

          //butonul de New Window
        browserWindowsPage.interactWithTheNewWindow();
        windowsMethods.switchToMain();
//        WebElement newWindowElement = getDriver().findElement(By.id("windowButton"));
//        newWindowElement.click();

        //trebuie sa mutam focusul Seleniumului pe noua fereastra dechisa
//        ArrayList<String> windowList = new ArrayList<>(getDriver().getWindowHandles()); //getWindowHandles - returneaza cate taburi sunt deschise
//        getDriver().switchTo().window(windowList.get(1));
//
//        WebElement sampleHeadingWindowElement = getDriver().findElement(By.id("sampleHeading"));
//        System.out.println("textul din noul tab deschis este: " + sampleHeadingWindowElement.getText());
//
//        //inchidem si noua fereastra deschisa
//        getDriver().close();
//        getDriver().switchTo().window(tabList.get(0));
    }

}

