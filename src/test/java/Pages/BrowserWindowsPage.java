package Pages;

import HelperMethods.ElementsMethods;
import HelperMethods.WindowsMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BrowserWindowsPage extends CommonPage {
//    WebDriver driver;
//    ElementsMethods elementsMethods;
//    WindowsMethods windowsMethods;
    @FindBy(id = "tabButton")
    private WebElement newTabButtonElement;
    @FindBy(id = "sampleHeading")
    private  WebElement sampleHeadingFromNewTabElement;
    @FindBy(id = "windowButton")
    private WebElement newWindowButtonElement;
    @FindBy(id = "sampleHeading")
    private WebElement sampleHeadingFromNewWindowElement;

    public BrowserWindowsPage(WebDriver driver) {
        super(driver);
    }

//    public BrowserWindowsPage(WebDriver driver) {
//        this.driver = driver;
//        this.elementsMethods = new ElementsMethods(driver);
//        this.windowsMethods = new WindowsMethods(driver);
//        PageFactory.initElements(driver, this);
//    }

    public void interactWithTheNewTab() {
        // New Tab:
        elementsMethods.clickOnElement(newTabButtonElement);
        windowsMethods.switchToOpenedTab();
        Assert.assertEquals(sampleHeadingFromNewTabElement.getText(), "This is a sample page");
        windowsMethods.closeTab();
    }

    public void interactWithTheNewWindow() {
        // New Window:
        elementsMethods.clickOnElement(newWindowButtonElement);
        windowsMethods.switchToOpenedWindow();
        Assert.assertEquals(sampleHeadingFromNewWindowElement.getText(), "This is a sample page");
        windowsMethods.closeWindow();
    }

}
