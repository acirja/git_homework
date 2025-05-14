package Tests_session_intermediate_module;

import Pages.CommonPage;
import Pages.HomePage;
import Pages.PracticeFormPage;
import SharedData.SharedData;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PracticeFormTest extends SharedData {
   // WebDriver driver;
    //ElementsMethods elementsMethods;
    //JavaScriptMethods js;
    private HomePage homePage;
    private CommonPage commonPage;
    private PracticeFormPage  practiceFormPage;

    @Test
    public void automationMethod(){
//        ///deschidem un browser de Chrome
//        driver = new ChromeDriver();
//
//        //accesam o pagina web
//        driver.get("https://demoqa.com/");
//
//        elementsMethods = new ElementsMethods(driver);//avem obiectul
//        js = new JavaScriptMethods(driver);

        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());
        practiceFormPage = new PracticeFormPage(getDriver());


//        WebElement elementFields = driver.findElement(By.xpath("//h5[text()='Forms']"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;

        //js.executeScript("window.scrollBy(0,400)");
        //elementFields.click();

        //inlocuim metoda click() de mai sus cu metoda scrisa universala scrisa in clasa MethodsElement
       // elementsMethods.clickOnElement(elementFields);


        //WebElement elementsTable = driver.findElement(By.xpath("//span[text()='Practice Form']"));
       // elementsTable.click();
       // elementsMethods.clickOnElement(elementsTable);

//        WebElement formsElement = driver.findElement(By.xpath("//h5[text()='Forms']"));
//        elementsMethods.clickOnElement(formsElement);

//        List<WebElement> elements = driver.findElements(By.xpath("//h5"));
//        elementsMethods.selectElementFromListByText(elements, "Forms");

        homePage.goToDesiredMenu("Forms");

//        List<WebElement> subElementList = driver.findElements(By.xpath("//span[@class='text']"));
//        elementsMethods.selectElementFromListByText(subElementList, "Practice Form");

        commonPage.goToDesiredSubMenu("Practice Form");
        practiceFormPage.completeFirstRegionFromForm("Alina", "Popescu", "test@test.com", "Address: my address", "0744121212");
        practiceFormPage.completeGender("Female");
        practiceFormPage.completeDateOfBirth(1999, 1, 21);

        //Subjects
        List<String> subjects = new ArrayList<>();
        subjects.add("Maths");
        subjects.add("English");
        practiceFormPage.completeSubjectWithList(subjects);

        //Hobbies
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Sports");
        hobbies.add("Music");
        hobbies.add("Reading");
        practiceFormPage.completeHobbies(hobbies);

        practiceFormPage.uploadPicture();
        practiceFormPage.completeStateAndCity("NCR", "Delhi");

        practiceFormPage.submitForm();


//        WebElement addFirstName = driver.findElement(By.id("firstName"));
////        String addFirstNameValue = "Alina";
////        addFirstName.sendKeys(addFirstNameValue);
//        elementsMethods.fillElement(addFirstName, "Alina");    //refactorizam
//
//        WebElement addLastName = driver.findElement(By.id("lastName"));
////        String addLastNameValue = "Popescu";
////        addLastName.sendKeys(addLastNameValue);
//        elementsMethods.fillElement(addLastName, "Popescu"); //refactorizam
//
//        WebElement addEmail = driver.findElement(By.id("userEmail"));
////        String addEmailValue = "alina.popescu@test.com";
////        addEmail.sendKeys(addEmailValue);
//        elementsMethods.fillElement(addEmail, "alina.popescu@test.com"); //refactorizam
//
//        WebElement addMobile = driver.findElement(By.cssSelector("input[placeholder='Mobile Number']"));
////        String addMobileValue = "+40744123123";
////        addMobile.sendKeys(addMobileValue);
//        elementsMethods.fillElement(addMobile, "+40744123123");
//
//        WebElement addPicture = driver.findElement(By.id("uploadPicture"));
////        File file = new File("src/test/resources/useforJavacourse.png");
////        addPicture.sendKeys(file.getAbsolutePath());
//        elementsMethods.uploadPicture(addPicture);
//
//        WebElement maleElement = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
//        WebElement femaleElement = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
//        WebElement otherElement = driver.findElement(By.xpath("//label[@for='gender-radio-3']"));
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
