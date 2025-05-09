package Tests_session_intermediate_module;

import HelperMethods.ElementsMethods;
import HelperMethods.FramesMethods;
import HelperMethods.JavaScriptMethods;
import Pages.CommonPage;
import Pages.HomePage;
import SharedData.SharedData;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class FramesTest extends SharedData {
    //WebDriver driver;
    ElementsMethods elementsMethods;
    // javaScriptMethods;
    FramesMethods framesMethods;
    HomePage homePage;
    CommonPage commonPage;

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

        //javaScriptMethods =  new JavaScriptMethods(driver);
        //elementsMethods = new ElementsMethods(driver);
        framesMethods = new FramesMethods(getDriver());
        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());

        //facem un scrol;
//        JavascriptExecutor js = (JavascriptExecutor) driver; refactorizam
//        js.executeScript("window.scrollBy(0,400)");
        //javaScriptMethods.scrollDown(400);


//        WebElement alertFrameWindowElement = driver.findElement((By.xpath("//h5[text()='Alerts, Frame & Windows']")));
//        //alertFrameWindowElement.click(); refactorizam
//        elementsMethods.clickOnElement(alertFrameWindowElement);
        homePage.goToDesiredMenu("Alerts, Frame & Windows");

//        WebElement frameElement = driver.findElement(By.xpath("//span[text()='Frames']"));
//        //frameElement.click(); //refactorizam
//        elementsMethods.clickOnElement(frameElement);
        commonPage.goToDesiredSubMenu("Frames");

        WebElement frame1Element = getDriver().findElement(By.id("frame1"));
        //driver.switchTo().frame(frame1Element); refactorizam
        framesMethods.switchFrame(frame1Element);

        WebElement sampleHeadingFrameElement = getDriver().findElement(By.id("sampleHeading"));
        //System.out.println("textul din new frame este: " + sampleHeadingFrameElement.getText()); refactorizam
        elementsMethods.displayContentofElement(sampleHeadingFrameElement);

        //driver.switchTo().defaultContent(); //revenim cu focusul din frame in pagina principala
        framesMethods.switchToMainContent();

        //webelement pentru cel de-al doilea frame de pe pagina

        WebElement frame2Element = getDriver().findElement(By.id("frame2"));
        //driver.switchTo().frame(frame2Element); refactorizam
        framesMethods.switchFrame(frame2Element);
        WebElement sampleHeadingFrame2Element = getDriver().findElement(By.id("sampleHeading"));
        elementsMethods.displayContentofElement(sampleHeadingFrame2Element);

        //js.executeScript("window.scrollBy(200,200)");

//        javaScriptMethods.scrollDown(200);
//        javaScriptMethods.scrollRight(200);

        framesMethods.switchToMainContent();

        //Thread.sleep(5000); //ca sa apucam sa vedem ce se intampla la rulare
       // driver.quit();
    }
}
