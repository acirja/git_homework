package Pages;

import HelperMethods.ElementsMethods;
import HelperMethods.FramesMethods;
import HelperMethods.JavaScriptMethods;
import jdk.dynalink.linker.LinkerServices;
import logger.LoggerUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.NoSuchElementException;

public class HomePage extends CommonPage{
    //metode si web elments specifice pentru Home Page

//    WebDriver driver;
//    ElementsMethods elementsMethods;
//    JavaScriptMethods js;

    @FindBy(xpath = "//h5")
    private List<WebElement> menuElement;

    @FindBy(xpath ="//p[text()='Consent']")
    private WebElement consentElement;

//    public HomePage(WebDriver driver) {
//        this.driver = driver;
//        this.elementsMethods = new ElementsMethods(driver);
//        this.js = new JavaScriptMethods(driver);
//
//        //asta e pentru partea de driver.FindElement
//        PageFactory.initElements(driver, this);
//    }

    //identificam web elementele specifice pentru pagina curenta
   // WebElement menuElement = driver.findElement(By.cssSelector(".category-cards"));

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //cream metode specifice pentru pagina
    public void goToDesiredMenu(String menu){
        try{
            LoggerUtility.infoLog("The user clicks on consentElement");
            elementsMethods.clickOnElement(consentElement);
        } catch (NoSuchElementException ignored){}

        js.scrollDown(400);
        LoggerUtility.infoLog("The user clicks scrools down the page");

        elementsMethods.selectElementFromListByText(menuElement, menu);
        LoggerUtility.infoLog("The user selects from menu the option with the value: " + menu);
    }
}
