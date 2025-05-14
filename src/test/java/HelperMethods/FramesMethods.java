package HelperMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramesMethods {
    private WebDriver driver;

    public FramesMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void switchFrame(WebElement element){
        driver.switchTo().frame(element); //schimbam focusul pe un anumit Frame
    }

//    public void switchDefaultContent(){
//        driver.switchTo().defaultContent(); //ne mutam cu focusul pe pagina principala
//    }

    public void switchToMainContent(){
        driver.switchTo().defaultContent(); //revenim cu focusul din frame in pagina principala
    }

    public void forceClick(WebElement element){
        //cand de ex nu putem face click pe un element din cauza unei reclame; atunci, JavaScript Executor iti permite
        //sa faci actiuni extra
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].click()", element);
    }

}
