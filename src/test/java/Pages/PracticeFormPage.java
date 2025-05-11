package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class PracticeFormPage extends CommonPage{
//    WebDriver driver;
//    ElementsMethods elementsMethods;

//    public PracticeFormPage(WebDriver driver){
//        this.driver = driver;
//        this.elementsMethods = new ElementsMethods(driver);
//
//        //asta e pentru partea de driver.findElement
//        PageFactory.initElements(driver, this); //initializeaza elementele declarate mai jos cu @FindBy
//    }

    @FindBy(id = "firstName")
    private WebElement firstNameElement;

    @FindBy(id = "lastName")
    private WebElement lastNameElement;

    @FindBy(id = "userEmail")
    private WebElement emailElement;

    @FindBy(css = "input[placeholder='Mobile Number']")
    private WebElement  mobileNumberElement;

    @FindBy(xpath = "//label[@for='gender-radio-1']")
    private WebElement maleGenderElement;

    @FindBy(xpath = "//label[@for='gender-radio-2']")
    private WebElement femaleGenderElement;

    @FindBy(xpath = "//label[@for='gender-radio-3']")
    private WebElement otherGenderElement;

    @FindBy(id = "dateOfBirthInput")
    private WebElement dateOfBirthElement;
    @FindBy(xpath = "//select[@class='react-datepicker__year-select']")
    private  WebElement yearOfBirthElement;
    @FindBy(xpath = "//select[@class='react-datepicker__month-select']")
    private WebElement monthOfBirthElement;

    //    @FindBy(xpath = "//div[@id='subjectsContainer']")
//    WebElement subjects;
    @FindBy(id = "subjectsInput")
    private WebElement subjects;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-1']")
    private WebElement sportHobbyElement;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-2']")
    private WebElement readingHobbyElement;

    @FindBy(xpath = "//label[@for='hobbies-checkbox-3']")
    private WebElement musicHobbyElement;

    @FindBy(id = "uploadPicture")
    private WebElement uploadPictureElement;

    @FindBy(id = "currentAddress")
    private WebElement addressElement;

    @FindBy(id = "react-select-3-input")
    private WebElement stateElement;

    @FindBy(id= "react-select-4-input")
    private WebElement cityElement;

    @FindBy(id = "submit")
    private WebElement submitElement;

    public PracticeFormPage(WebDriver driver) {
        super(driver);
    }

    public void completeFirstRegionFromForm(String firstName, String lastName, String email, String address, String mobileNumber){
        elementsMethods.fillElement(firstNameElement, firstName);
        elementsMethods.fillElement(lastNameElement, lastName);
        elementsMethods.fillElement(emailElement, email);
        elementsMethods.fillElement(addressElement, address);
        elementsMethods.fillElement(mobileNumberElement, mobileNumber);
    }

    public void completeGender(String gender){
        switch (gender){
            case "Male" : elementsMethods.clickOnElement(maleGenderElement);
            break;

            case "Female" : elementsMethods.clickOnElement(femaleGenderElement);
            break;

            case "Other" : elementsMethods.clickOnElement(otherGenderElement);
            break;
        }
    }

    public void completeSubject(String value){
        elementsMethods.clickOnElement(subjects);
        elementsMethods.fillElement(subjects, value);
    }

    public void completeSubjectWithList(List<String> list){
        elementsMethods.clickOnElement(subjects);
        elementsMethods.fillMultipleValues(subjects, list);
    }

    public void completeHobbies(List<String> hobbies){
        List<WebElement> hobbiesElement = new ArrayList<>();
        hobbiesElement.add(sportHobbyElement);
        hobbiesElement.add(readingHobbyElement);
        hobbiesElement.add(musicHobbyElement);
        elementsMethods.clickMultipleValues(hobbiesElement, hobbies);
        js.scrollDown(400);
    }

    public void completeDateOfBirth(int year, int month, int day){
        elementsMethods.clickOnElement(dateOfBirthElement);
        elementsMethods.selectByValue(yearOfBirthElement, String.valueOf(year));
        elementsMethods.selectByValue(monthOfBirthElement, String.valueOf(month -1));
        js.scrollDown(400);
        String dayOfBirthElementXPath =  "//div[@class='react-datepicker__day react-datepicker__day--0" + day + "']";
        WebElement dayOfBirthElement = driver.findElement(By.xpath(dayOfBirthElementXPath));
        elementsMethods.clickOnElement(dayOfBirthElement);
    }

    public void uploadPicture(){
        elementsMethods.uploadPicture(uploadPictureElement);
    }

    public void completeStateAndCity(String state, String city){
        js.forceClick(stateElement);
        elementsMethods.fillElementFollowedByEnter(stateElement, state);

        js.forceClick(cityElement);
        elementsMethods.fillElementFollowedByEnter(cityElement, city);
    }

    public void submitForm(){
        js.forceClick(submitElement);
    }
}
