package Pages;

import HelperMethods.ElementsMethods;
import HelperMethods.FramesMethods;
import HelperMethods.JavaScriptMethods;
import logger.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FramesPage extends CommonPage{
    @FindBy(id = "frame1")
    private WebElement frame1Element;
    @FindBy(id = "sampleHeading")
    private WebElement sampleHeadingFromFrame1Element;
    @FindBy(id = "frame2")
    private WebElement frame2Element;
    @FindBy(id = "sampleHeading")
    private WebElement sampleHeadingFromFrame2Element;

    public FramesPage(WebDriver driver) {
        super(driver);
    }

    public void interactWithFrame1(){
        // Frame 1:
        js.scrollDown(400);
        framesMethods.switchFrame(frame1Element);
        LoggerUtility.infoLog("The user switchs on specific frame");

        elementsMethods.displayContentofElement(sampleHeadingFromFrame1Element);
        LoggerUtility.infoLog("The user deals with sampleHeadingFromFrame1Element element from specific ifframe");

        //Assert.assertEquals(sampleHeadingFromFrame1Element.getText(), "This is a sample page");

        framesMethods.switchToMainContent();
        LoggerUtility.infoLog("The user switches on parent form");
    }

    public void interactWithFrame2(){
        // Frame 2:
        framesMethods.switchFrame(frame2Element);
        LoggerUtility.infoLog("The user switchs on specific frame");

        elementsMethods.displayContentofElement(sampleHeadingFromFrame2Element);
        LoggerUtility.infoLog("The user deals with sampleHeadingFromFrame2Element element from specific ifframe");

        //Assert.assertEquals(sampleHeadingFromFrame2Element.getText(), "This is a sample page");

        js.scrollDown(400);
        LoggerUtility.infoLog("The user scrolls down the page");

        framesMethods.switchToMainContent();
        LoggerUtility.infoLog("The user switches on parent form");
    }
}
