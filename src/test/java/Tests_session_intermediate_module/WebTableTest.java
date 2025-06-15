package Tests_session_intermediate_module;

import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptMethods;
import Pages.CommonPage;
import Pages.HomePage;
import Pages.WebTablesPage;
import SharedData.Hooks;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

import static java.nio.file.Files.size;

public class WebTableTest extends Hooks {
    //WebDriver driver;
//    private ElementsMethods elementsMethods;
//    private JavaScriptMethods js;
    private HomePage homePage;
    private CommonPage commonPage;
    private WebTablesPage webTablesPage;

    @Test
    public void automationMethod() throws  InterruptedException{
        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());
        webTablesPage = new WebTablesPage(getDriver());

//        js.scrollDown(400);
//
//        WebElement elementsFields = driver.findElement(By.xpath("//h5[text()='Elements']"));
//        elementsMethods.clickOnElement(elementsFields);
        homePage.goToDesiredMenu("Elements");

//        WebElement webTableElement = driver.findElement(By.xpath("//span[text()='Web Tables']"));
//        elementsMethods.clickOnElement(webTableElement);
        commonPage.goToDesiredSubMenu("Web Tables");

        //List<WebElement> tableElements = getDriver().findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -even' or @class='rt-tr -odd']"));

        //int actualTabSize = tableElements.size();
        int initialTableSize = webTablesPage.getCurrentTableSize();

        webTablesPage.addNewRecord();

        // Declararea valorilor cu care se populeaza formul
        String firstNameValue = "Alina";
        String lastNameValue = "Test";
        String emailValue = "alina@test.com";
        String ageValue = "35";
        String salaryValue = "10000";
        String departmentValue = "Marketing";

        webTablesPage.fillRegistrationForm(firstNameValue, lastNameValue, emailValue, ageValue, salaryValue, departmentValue);
        webTablesPage.submitForm();

        // Validari:
        int finalTableSize = webTablesPage.getCurrentTableSize();
        int expectedTableSize = initialTableSize + 1;
        Assert.assertEquals(finalTableSize, expectedTableSize);

        String actualTableValue = webTablesPage.getRowContentAsString(finalTableSize - 1);

        Assert.assertTrue(actualTableValue.contains(firstNameValue));
        Assert.assertTrue(actualTableValue.contains(lastNameValue));
        Assert.assertTrue(actualTableValue.contains(emailValue));
        Assert.assertTrue(actualTableValue.contains(ageValue));
        Assert.assertTrue(actualTableValue.contains(salaryValue));
        Assert.assertTrue(actualTableValue.contains(departmentValue));


//        WebElement addNewRecordButton = getDriver().findElement(By.id("addNewRecordButton"));
//        elementsMethods.clickOnElement(addNewRecordButton);
//
//        //declaram valorile cu care se populeaza formul
//        String firstNameValue = "Alina";
//        String lastNameValue = "Popescu";
//        String emailValue = "alina@test.com";
//        String ageValue = "30";
//        String salaryValue = "2000";
//        String departmentValue = "CLD";
//
//        WebElement firstNameField = getDriver().findElement(By.id("firstName"));
//        elementsMethods.fillElement(firstNameField, firstNameValue);
//
//        WebElement lastNameField = getDriver().findElement(By.id("lastName"));
//        elementsMethods.fillElement(lastNameField, lastNameValue);
//
//        WebElement emailField = getDriver().findElement(By.id("userEmail"));
//        elementsMethods.fillElement(emailField, emailValue);
//
//        WebElement ageField = getDriver().findElement(By.id("age"));
//        elementsMethods.fillElement(ageField, ageValue);
//
//        WebElement salaryField = getDriver().findElement(By.id("salary"));
//        elementsMethods.fillElement(salaryField, salaryValue);
//
//        WebElement departamentField = getDriver().findElement(By.id("department"));
//        elementsMethods.fillElement(departamentField, departmentValue);
//
//        Thread.sleep(3000);
//
//        WebElement submitButton = getDriver().findElement(By.id("submit"));
//        elementsMethods.clickOnElement(submitButton);
//
//        List<WebElement> expectedTableElements = getDriver().findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -even' or @class='rt-tr -odd']"));
//        Integer expectedTableSize = actualTabSize + 1;

    }
}
