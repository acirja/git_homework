package Pages;

import logger.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.NoSuchElementException;

public class HomePage extends CommonPage{
    //metode si web elements specifice pentru Home Page

    @FindBy(xpath = "//h5")
    private List<WebElement> menuElement;

    @FindBy(xpath ="//p[text()='Consent']")
    private WebElement consentElement;

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
