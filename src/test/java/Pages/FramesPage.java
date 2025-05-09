package Pages;

import HelperMethods.ElementsMethods;
import HelperMethods.FramesMethods;
import HelperMethods.JavaScriptMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FramesPage extends CommonPage{
//    WebDriver driver;
//    ElementsMethods elementsMethods;
//    JavaScriptMethods javascriptHelpers;
//    FramesMethods framesMethods;
    @FindBy(id = "frame1")
    WebElement frame1Element;
    @FindBy(id = "sampleHeading")
    WebElement sampleHeadingFromFrame1Element;
    @FindBy(id = "frame2")
    WebElement frame2Element;
    @FindBy(id = "sampleHeading")
    WebElement sampleHeadingFromFrame2Element;

    public FramesPage(WebDriver driver) {
        super(driver);
    }
//    public FramesPage(WebDriver driver) {
//        this.driver = driver;
//        this.elementsMethods = new ElementsMethods(driver);
//        this.javascriptHelpers = new JavaScriptMethods(driver);
//        this.framesMethods = new FramesMethods(driver);
//        PageFactory.initElements(driver, this);
//    }

    public void interactWithFrame1() {
        // Frame 1:
        js.scrollDown(400);
        framesMethods.switchFrame(frame1Element);
        Assert.assertEquals(sampleHeadingFromFrame1Element.getText(), "This is a sample page");
    }

    public void interactWithFrame2() {
        // Frame 2:
        framesMethods.switchFrame(frame2Element);
        Assert.assertEquals(sampleHeadingFromFrame2Element.getText(), "This is a sample page");
    }
}
