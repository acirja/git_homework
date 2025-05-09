package Tests_session_intermediate_module;

import HelperMethods.ElementsMethods;
import HelperMethods.JavaScriptMethods;
import Pages.CommonPage;
import Pages.HomePage;
import SharedData.SharedData;
import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;

import java.util.List;

public class RecursionTest extends SharedData {
    //WebDriver driver;
    ElementsMethods elementsMethods;
    JavaScriptMethods js;
    HomePage homePage;
    CommonPage commonPage;

    @Test
    public void parcurgereLista() {
//        //deschidem un browser de Chrome
//        driver = new ChromeDriver();
//
//        //accesam o pagina web
//        driver.get("https://demoqa.com/sortable");
//
//        elementsMethods = new ElementsMethods(driver);
//        js = new JavaScriptMethods(driver);
//        homePage = new HomePage(driver);
//        commonPage = new CommonPage(driver);
//
//        //facem browserul in modul Maximize -pentru a evita repozitionarea elementelor cu marimea default a ferestrei
//        driver.manage().window().maximize();
//
//        //Tema - de intrat succesiv folosind ce am invatat
//        homePage.goToDesiredMenu("Interactions");
//        commonPage.goToDesiredSubMenu("Sortable");
//
//        Actions actions = new Actions(driver);
//        List<WebElement> list = driver.findElements(By.xpath("//div[@id='demo-tabpane-list']//div[@class='list-group-item list-group-item-action']"));
//        elementsMethods.changeElements(list);
//
//        assertMethods.assertEqualValues(list.get(0).getText(), "One");




//        Actions actions = new Actions(driver);
//        List<WebElement> listElement = driver.findElements(By.xpath("//div[id='demo-tabpane-list]//div[@class='list-group-item list]"));
//        for (int i=0; i<listElement.size()-1; i++){
//            WebElement currentElement = listElement.get(i);
//            WebElement nextElement = listElement.get(i+1);
//            System.out.println("Element: " + currentElement.getText());
//            actions.clickAndHold(currentElement)
//                    .moveToElement(nextElement)
//                    .release()
//                    .build()
//                    .perform();
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e){
//                e.printStackTrace();
//            }
//        }
    }

}
