package Tests_session_intermediate_module;

import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptMethods;
import Pages.CommonPage;
import Pages.HomePage;
import Pages.WebTablesPage;
import SharedData.Hooks;
import extendUtility.ExtendUtility;
import extendUtility.ReportStep;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

import static java.nio.file.Files.size;

public class WebTableTest extends Hooks {

    private HomePage homePage;
    private CommonPage commonPage;
    private WebTablesPage webTablesPage;

    @Test
    public void automationMethod() throws  InterruptedException{
        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());
        webTablesPage = new WebTablesPage(getDriver());

        homePage.goToDesiredMenu("Elements");
        ExtendUtility.attachLog(ReportStep.PASS_STEP, "The user enters on Elements menu");


        commonPage.goToDesiredSubMenu("Web Tables");
        ExtendUtility.attachLog(ReportStep.PASS_STEP, "The user enters on Web Tables sub-menu");

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
        ExtendUtility.attachLog(ReportStep.PASS_STEP, "The user fills the entire form with valid values");
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

    }
}
