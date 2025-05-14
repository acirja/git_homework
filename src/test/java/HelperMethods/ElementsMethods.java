package HelperMethods;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.List;

public class ElementsMethods {
    private WebDriver driver;
    private JavascriptExecutor js;
    private Actions actions;

    public ElementsMethods(WebDriver driver) {
        this.driver = driver;
        js = (JavascriptExecutor) driver;
        this.actions = new Actions(driver);
    }

    public void clickOnElement(WebElement element){
        element.click();
    }

    public void fillElement(WebElement element, String value){
        element.sendKeys(value);
    }

    public void uploadPicture(WebElement element){
        File file = new File("src/test/resources/useforJavacourse.png");
        element.sendKeys(file.getAbsolutePath());
    }

    public void selectElementFromListByText(List<WebElement> elementsList, String value){
        for (int i=0; i<elementsList.size(); i++){
            if (elementsList.get(i).getText().equals(value)){
                clickOnElement(elementsList.get(i));
            }
        }
    }

    public void displayContentofElement(WebElement element){
        System.out.println("textul din new frame este: " + element.getText());
    }

    public void selectByValue(WebElement element, String value){
        Select yearSelect = new Select(element);
        yearSelect.selectByValue(value);
    }

    public void selectByVisibleText(WebElement element, String text) {
        Select dropdown = new Select(element);
        dropdown.selectByVisibleText(text);
    }

//    public void fillMultipleValues(WebElement element, List<WebElement>elementsList){
//        String valueToFill = element.getText();
//        for(int i=0; i<elementsList.size(); i++){
//            element.sendKeys(valueToFill); //fill each element with the value from "element"
//        }
//    }

    public void fillMultipleValues(WebElement element, List<String>values){
        for (String value : values){
            element.sendKeys(value);
            element.sendKeys(Keys.ENTER);
        }
    }

    public void fillWithActions(WebElement element, String value){
        actions.sendKeys(value).perform();  //methoda pentru a completa fieldul de Subjects unde avem nevoie sa scriem o valoarea
        //iar apoi sa dam si click
        waitVisiblityElement(element);
        actions.sendKeys(Keys.ENTER);
    }

    public void fillElementFollowedByEnter(WebElement element, String value){
        element.sendKeys(value);
        element.sendKeys(Keys.ENTER);
    }

    public void clickMultipleValues(List<WebElement> elements, List<String> list){
        for (String value : list){
            for (WebElement element : elements){
                if (element.getText().equals(value)){
                    element.click();
                }
            }
        }
    }


    public void waitVisiblityElement(WebElement element){
        //definim un wait explicit ca sa astepte dupa alerta
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));    }

    public void checkMultipleElementsByListOfValues(List<WebElement> elements, List<String> values){
        for (String value : values){
            for (WebElement element : elements){
                if (element.getText().equals(value)){
                    element.click();
                }
            }
        }
    }

    public void changeElements(List<WebElement> elements){
        for (WebElement element : elements){
            element.click();
        }
    }

//    public void changeElements(List<WebElement> list){
//        for (int index = 0; index < list.size(); index++){
//            Actions actions = new Actions(driver);
//            WebElement element = list.get(index);
//            WebElement nextElement = list.get(index++);
//            printText(WebElement);
//            actions.clickAndHold(element)
//                    .moveToElement(nextElement)
//                    .release()
//                    .build()
//                    .perform();
//        }
//        try{
//            Thread.sleep(100000);
//        }
//        catch (InterruptedException e){
//            e.printStackTrace();
//        }
//    }





}
