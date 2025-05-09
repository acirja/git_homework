package tests_beginner_module;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FormTest extends BaseTest {

    @Test
    public void myFirstTest(){
        formPage.fillInUsername("Ana");
        formPage.fillInComments("test comments");
        formPage.selectCheckBox2();
        formPage.selectRadioButton1();
        formPage.selectDropDownValue();
        formPage.clickOnSubmit();
        formPage.selectRandomDropDown();

        assertTrue(formPage.isBackButtonDisplayed());

        int dummy = 12;
        System.out.println("acesta este un test");
    }

    @Test
    public void myFirstTest2(){
        System.out.println("acesta este un test");
    }


}
