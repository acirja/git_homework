package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class FormPage {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(name = "username")
    private WebElement username;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(xpath = "//textarea[@name='comments']")
    private WebElement commentsArea;

    @FindBy(xpath ="//input[@value='cb2']")
    private WebElement checkBox2;

    @FindBy(xpath ="//input[@value='cb3']")
    private WebElement checkBox3;

    @FindBy(xpath = "//input[@value='rd1']")
    private WebElement radioButton1;

    @FindBy(xpath = "//input[@value='rd2']")
    private WebElement radioButton2;

    @FindBy(name = "dropdown")
    private WebElement dropDown;

    @FindBy(xpath = "//input[@value='submit']")
    private WebElement submitButton;

    @FindBy(id = "back_to_form")
    private WebElement backToFormButton;

    @FindBy(xpath = "//select[@name='dropdown']//option")
    private List<WebElement> dropdownList;

    @FindBy (name = "dropdown")
    private WebElement dropdownSelect;

    @FindBy(id = "htmlformtest")
    private WebElement form;

//    @FindBy(name = "//input[@name='username2']")
//    private WebElement username2;

    public FormPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void fillInUsername(String usernameValue){
        username.sendKeys(usernameValue);
    }

    public void fillInComments(String commentValue){
        commentsArea.clear();
        commentsArea.sendKeys(commentValue);
    }

    public void selectCheckBox2(){
        uncheckCheckBox();
        checkBox2.click();
    }

    public void uncheckCheckBox(){
        checkBox3.click();
    }

    private void uncheckRadioButton(){
        radioButton2.click();
    }

    public void selectRadioButton1(){
        uncheckRadioButton();
        radioButton1.click();
    }

    public void selectDropDownValue(){
        String[] dropDownValues = {
                "Drop Down Item 1",
                "Drop Down Item 2",
                "Drop Down Item 3",
                "Drop Down Item 4",
                "Drop Down Item 5",
                "Drop Down Item 6"
        };
        Random random = new Random();
        int randomIndex = random.nextInt(dropDownValues.length);
        String randomElement = dropDownValues[randomIndex];

        Select dropDownObject = new Select(dropDown);
        dropDownObject.selectByVisibleText(randomElement);
    }

    public void clickOnSubmit(){
        submitButton.click();
    }

    public boolean isBackButtonDisplayed(){
        return backToFormButton.isDisplayed();
    }

    public void selectRandomDropDown(){
        Random rand = new Random();
        int index = rand.nextInt(dropdownList.size());
        WebElement randomDropdown = dropdownList.get(index);

        Select dropwdown = new Select(dropdownSelect);
        dropwdown.selectByIndex(index);
    }

//    public void waitUntilClickable(){
//        wait.until(ExpectedCondition.elementToBeClickable(submitButton));
//    }
}
