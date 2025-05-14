package HelperMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class WindowsMethods {
    private WebDriver driver;

    public WindowsMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToOpenedTab(){
       // driver.getWindowHandles() -> returneaza toate windows-urile deschise
        List<String> tabList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabList.get(1));
    }

    public void switchToMainTab(){
        switchToMainTab();
    }

    public void switchToOpenedWindow(){
        switchToOpenedWindow();
    }

    public void close(){
        driver.close();
    }

    public void closeTab(){
        close();
    }

    public void closeWindow(){
        close();
    }

    public void switchToMain(){
        List<String> tabList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabList.get(0));
    }
}
