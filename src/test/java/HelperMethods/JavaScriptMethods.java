package HelperMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptMethods {
    private WebDriver driver;
    private JavascriptExecutor js;

    public JavaScriptMethods(WebDriver driver){
        this.driver = driver;
        this.js = (JavascriptExecutor) driver;
    }

    public void scroll(){
        //facem un scroll ca elementul sa fie vizibil
        //JavascriptExecutor js = (JavascriptExecutor) driver; //l-am scos ca variabila globala in clasa + il initializam in constructor
        js.executeScript("window.scrollBy(0,400)"); //sau js.executeScript("window.scrollBy(" + x + "," + y +")");
    }

    public void scrollDown(int y){
        scroll();
    }

    public void scrollRight(int x){
        scroll();
    }

    public void forceClick(WebElement element){
        //JavascriptExecutor js = (JavascriptExecutor)  driver; //l-am scos ca obiect in clasa + il initializam in constructor
        js.executeScript("argument[0].click(), element");
    }
}
