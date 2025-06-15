package Pages;

import HelperMethods.*;
import logger.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CommonPage{ //sub Menu page (meniul gri de unde putem accesa Elements, Forms, Alert, Frame&Windows.. etc
    protected WebDriver driver;
    protected ElementsMethods elementsMethods;
    protected JavaScriptMethods js;
    protected AlertsMethods alertsMethods;
    protected Actions actions;
    protected FramesMethods framesMethods;
    protected WindowsMethods windowsMethods;

    //identificam web elementele specifice pentru sub-meniul gri
    // WebElement menuElement = driver.findElement(By.cssSelector(".category-cards"));
    @FindBy(xpath = "//span[@class='text']")
    private List<WebElement> subMenuElement;

    public CommonPage(WebDriver driver){
        this.driver = driver;
        this.elementsMethods = new ElementsMethods(driver);
        this.js = new JavaScriptMethods(driver);
        this.alertsMethods = new AlertsMethods(driver);
        this.actions = new Actions(driver);
        this.framesMethods = new FramesMethods(driver);
        this.windowsMethods = new WindowsMethods(driver);

        //asta e pentru partea de driver.FindElement
        PageFactory.initElements(driver, this);
    }

    //cream metode specifice pentru pagina
    public void goToDesiredSubMenu(String subMenu){
        js.scrollDown(400);
        LoggerUtility.infoLog("The user scrolls down the page");

        elementsMethods.selectElementFromListByText(subMenuElement, subMenu);
        LoggerUtility.infoLog("The user selects from subMenu the option with the value: " + subMenu);
    }

}