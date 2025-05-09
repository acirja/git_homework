package Tests_session_intermediate_module;

import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptMethods;
import Pages.CommonPage;
import Pages.HomePage;
import SharedData.SharedData;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static java.nio.file.Files.size;

public class WebTableTest extends SharedData {
    //WebDriver driver;
    ElementsMethods elementsMethods;
    JavaScriptMethods js;
    HomePage homePage;
    CommonPage commonPage;

    @Test
    public void automationMethod() throws  InterruptedException{
//        //deschidem un browser de Chrome
//        driver = new ChromeDriver();
//
//        //facem browserul in modul maximize
//        driver.manage().window().maximize();
//
//        //accesam o pagina web
//        driver.get("https://demoqa.com");

        elementsMethods = new ElementsMethods(getDriver());
        js = new JavaScriptMethods(getDriver());
        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());

//        js.scrollDown(400);
//
//        WebElement elementsFields = driver.findElement(By.xpath("//h5[text()='Elements']"));
//        elementsMethods.clickOnElement(elementsFields);
        homePage.goToDesiredMenu("Elements");

//        WebElement webTableElement = driver.findElement(By.xpath("//span[text()='Web Tables']"));
//        elementsMethods.clickOnElement(webTableElement);
        commonPage.goToDesiredSubMenu("Web Tables");

        List<WebElement> tableElements = getDriver().findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -even' or @class='rt-tr -odd']"));

        int actualTabSize = tableElements.size();

        WebElement addNewRecordButton = getDriver().findElement(By.id("addNewRecordButton"));
        elementsMethods.clickOnElement(addNewRecordButton);

        //declaram valorile cu care se populeaza formul
        String firstNameValue = "Alina";
        String lastNameValue = "Popescu";
        String emailValue = "alina@test.com";
        String ageValue = "30";
        String salaryValue = "2000";
        String departmentValue = "CLD";

        WebElement firstNameField = getDriver().findElement(By.id("firstName"));
        elementsMethods.fillElement(firstNameField, firstNameValue);

        WebElement lastNameField = getDriver().findElement(By.id("lastName"));
        elementsMethods.fillElement(lastNameField, lastNameValue);

        WebElement emailField = getDriver().findElement(By.id("userEmail"));
        elementsMethods.fillElement(emailField, emailValue);

        WebElement ageField = getDriver().findElement(By.id("age"));
        elementsMethods.fillElement(ageField, ageValue);

        WebElement salaryField = getDriver().findElement(By.id("salary"));
        elementsMethods.fillElement(salaryField, salaryValue);

        WebElement departamentField = getDriver().findElement(By.id("department"));
        elementsMethods.fillElement(departamentField, departmentValue);

        Thread.sleep(3000);

        WebElement submitButton = getDriver().findElement(By.id("submit"));
        elementsMethods.clickOnElement(submitButton);

        List<WebElement> expectedTableElements = getDriver().findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -even' or @class='rt-tr -odd']"));
        Integer expectedTableSize = actualTabSize + 1;

    }
}
