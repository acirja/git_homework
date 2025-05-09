package tests_beginner_module;

import org.junit.jupiter.api.Test;
import pages.AlertPage;

public class AlertTest extends BaseTest{
    @Test
    public void alertTest(){
        AlertPage alertPage = new AlertPage(driver);
        alertPage.navigateAlertPage();
        alertPage.clickAlertButton();
        alertPage.acceptAlert();
       // alertPage.dismissAlert();
        int dummy = 11; //o folosim doar ca sa punem breakpoint pe linia aceasta;
    }
}
