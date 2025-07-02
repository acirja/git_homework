package Tests_session_intermediate_module;

import HelperMethods.JavaScriptMethods;
import ObjectData.PracticeFormObject;
import Pages.CommonPage;
import Pages.HomePage;
import Pages.PracticeFormPage;
import PropertyUtility.PropertyUtility;
import SharedData.Hooks;
import extendUtility.ExtendUtility;
import extendUtility.ReportStep;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PracticeFormTest extends Hooks {
    private HomePage homePage;
    private CommonPage commonPage;
    private PracticeFormPage  practiceFormPage;

    @Test
    public void automationMethod(){

         PropertyUtility propertyUtility = new PropertyUtility("PracticeFormTest");
         PracticeFormObject practiceFormObject = new PracticeFormObject(propertyUtility.getData()); /// folosim datele din
        //propertyUtility (adica din fisier) in obiectul practiceFormObject; salvam data de acolo, din fisier, ca
        //proprietati ale obiectului curent

        JavaScriptMethods javaScriptMethods = new JavaScriptMethods(getDriver());
        javaScriptMethods.scrollDown(400);

        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());
        practiceFormPage = new PracticeFormPage(getDriver());


        homePage.goToDesiredMenu("Forms");
        ExtendUtility.attachLog(ReportStep.PASS_STEP, "The user enters on Forms menu");

        commonPage.goToDesiredSubMenu("Practice Form");
        ExtendUtility.attachLog(ReportStep.PASS_STEP, "The user enters on Practice form sub-menu");

        practiceFormPage.completeFirstRegionFromForm(practiceFormObject);
        ExtendUtility.attachLog(ReportStep.PASS_STEP, "The user fills the entire first region section");
        //practiceFormPage.completeFirstRegionFrom("Alina", "Popescu", "test@test.com", "Address: my address", "0744121212");

        practiceFormPage.completeGender(practiceFormObject);
        ExtendUtility.attachLog(ReportStep.PASS_STEP, "The user fills the gender section");
        practiceFormPage.completeDateOfBirth(1999, 1, 21);

        //Subjects
//        List<String> subjects = new ArrayList<>();
//        subjects.add("Maths");
//        subjects.add("English");
        practiceFormPage.completeSubjectWithList(practiceFormObject);
        ExtendUtility.attachLog(ReportStep.PASS_STEP, "The user fills the subject section");

        //Hobbies
//        List<String> hobbies = new ArrayList<>();
//        hobbies.add("Sports");
//        hobbies.add("Music");
//        hobbies.add("Reading");
        practiceFormPage.completeHobbies(practiceFormObject);
        ExtendUtility.attachLog(ReportStep.PASS_STEP, "The user fills the hobbies section");

        practiceFormPage.uploadPicture();
        practiceFormPage.completeStateAndCity(practiceFormObject);
        ExtendUtility.attachLog(ReportStep.PASS_STEP, "The user fills the state section");

        practiceFormPage.submitForm();
        ExtendUtility.attachLog(ReportStep.PASS_STEP, "The user clicks on Submit");

//
//        //cream lista de WebElement cu cele de mai sus
//        List<WebElement> genderElement = new ArrayList<>();
//        genderElement.add(0, maleElement);
//        genderElement.add(1, femaleElement);
//        genderElement.add(2, otherElement);
//        elementsMethods.selectElementFromListByText(genderElement, "Female"); //luam value de pe radio button
//        String gender = "Other";
//        if (maleElement.getText().equals(gender)){
//            maleElement.click();
//        }
//        else if (femaleElement.getText().equals(gender)){
//            femaleElement.click();
//        }
//        else if (otherElement.getText().equals(gender)){
//            otherElement.click();
//        }


//        //Date of Birth:
//        String yearOfBirthValue = "1988";
//        String monthOfBirthValue = "March";
//        String dayOfBirthValue = "01";
//
//        WebElement dateOfBirthInputElement = driver.findElement(By.id("dateOfBirthInput"));
//        dateOfBirthInputElement.click();
//
//       ////!!!  js.scrollDown(400); !!!
//
//        WebElement yearElement = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
//        elementsMethods.selectByValue(yearElement, yearOfBirthValue);
//
//        WebElement monthElement = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
//        elementsMethods.selectElementFromListByText(monthElement, monthOfBirthValue);
//
//        String dayOfBirthxPath = "//div[@class='react-datepicker__day react-datepicker__day--0]" + dayOfBirthValue + "']";
//        WebElement dayOfBirthElement = driver.findElement(By.xpath(dayOfBirthxPath));
//        elementsMethods.clickOnElement(dayOfBirthElement);
//
//        //Subjects:
//        List<String> subjectValues  = new ArrayList<>();
//        subjectValues.add("Social Media");
//        subjectValues.add("Maths");
//        subjectValues.add("History");
//
//        WebElement subjectsInputElement = driver.findElement(By.id("subjectsInput"));
//        elementsMethods.fillMultipleValues(subjectsInputElement, subjectValues);


//        WebElement subjectElement = driver.findElement(By.id("subjectInput"));
//        elementsMethods.fillElement(subjectElement, "Social Studies");
//        elementsMethods.clickOnElement(subjectElement);
//
//        WebElement addressElement = driver.findElement(By.id("currentAddress2"));
//        elementsMethods.fillElement(addressElement, "strada Vantului, nr 25");
//
//        WebElement stateElement = driver.findElement(By.id("react-select-3-input"));
//        elementsMethods.clickOnElement(stateElement); //as avea nevoie de metoda clickOnElementWithJS
//        elementsMethods.fillElement(stateElement, "NCR");
//        elementsMethods.clickOnElement(stateElement); //as avea nevoie de metoda clickOnElementWithKeyboard
//
//        WebElement cityElement = driver.findElement(By.id("react-select-4-input"));
//        elementsMethods.clickOnElement(cityElement); //as avea nevoie de metoda clickOnElementWithJS
//        elementsMethods.fillElement(cityElement, "Delhi");
//        elementsMethods.clickOnElement(cityElement); //as avea nevoie de metoda clickOnElementWithKeyboard
//
//        WebElement submitElement = driver.findElement(By.id("submit"));
//        elementsMethods.clickOnElement(submitElement); //as avea nevoie de metoda clickOnElementWithJS

//        List<WebElement> table2 = driver.findElements(By.xpath("//tr"));
//
//        assertMethods.assertEqualValues(table2.get(0).getText(), "Label Values");
//        assertMethods.assertEqualValues(table2.get(1).getText(), "Student Name Popescu Ana");
//        assertMethods.assertEqualValues(table2.get(2).getText(), "Student Email test@test.com");
//        assertMethods.assertEqualValues(table2.get(3).getText(), "Gender Female");
//        assertMethods.assertEqualValues(table2.get(4).getText(), "Mobile 0744112233");
//        assertMethods.assertEqualValues(table2.get(5).getText(), "Subject Social Media");
//        assertMethods.assertEqualValues(table2.get(6).getText(), "Picture useforJavacourse.png");
//        assertMethods.assertEqualValues(table2.get(7).getText(), "Address street, number");
//        assertMethods.assertEqualValues(table2.get(8).getText(), "State and City values");
//
//        WebElement closeButtonElement = driver.findElement(By.id("closeLargeModal"));
//        elementsMethods.clickOnElement(closeButtonElement);

    }
}
