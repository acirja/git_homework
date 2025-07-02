package Tests_session_intermediate_module;

import Pages.CommonPage;
import Pages.HomePage;
import SharedData.Hooks;
import extendUtility.ExtendUtility;
import extendUtility.ReportStep;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class RecursionTest extends Hooks {
    private HomePage homePage;
    private CommonPage commonPage;

    @Test
    public void parcurgereLista() {
        homePage = new HomePage(getDriver());
        commonPage = new CommonPage(getDriver());

        homePage.goToDesiredMenu("Interactions");
        ExtendUtility.attachLog(ReportStep.PASS_STEP, "The user enters on Interactions menu");

        commonPage.goToDesiredSubMenu("Sortable");
        ExtendUtility.attachLog(ReportStep.PASS_STEP, "The user enters on Sortable sub-menu");


        //declaram elementele prin Drag and Drop
        Actions actions = new Actions(getDriver());
        //List<WebElement> listElement = getDriver().findElements(By.xpath("//div[id='demo-tabpane-list]//div[@class='list-group-item list]"));
        String listElementsXPath = "//div[@id='demo-tabpane-list']//div[@class='list-group-item list-group-item-action']";
        List<WebElement> elementsList = getDriver().findElements(By.xpath(listElementsXPath));
        for (int i=0; i<elementsList.size()-1; i++){
            WebElement currentElement = elementsList.get(i);
            WebElement nextElement = elementsList.get(i+1);
            System.out.println("Element: " + currentElement.getText());
            actions.clickAndHold(currentElement)
                    .moveToElement(nextElement)
                    .release()
                    .build()
                    .perform();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        ExtendUtility.attachLog(ReportStep.PASS_STEP, "The user changes the order of elements");
    }

}
