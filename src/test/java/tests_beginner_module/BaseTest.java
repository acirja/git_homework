package tests_beginner_module;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.FormPage;

public class BaseTest {
    static WebDriver driver;
    FormPage formPage;

    @BeforeAll //BeforeAll si AfterAll snt statice
    static void setUpBeforeClass(){
        System.out.println("Inainte de toate testele"); //configureaza chromedriver-ul
        WebDriverManager.chromedriver().setup(); //initiaza o sesiune de chrome
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
    }

    @BeforeEach
    void setUp(){
        formPage = new FormPage(driver);
        System.out.println("Inainte de FIECARE test");
    }

    @AfterEach
    void tearDown(){
        System.out.println("Dupa fiecare test");
    }

    @AfterAll
    static void tearDownAfterClass(){
        System.out.println("Dupa ce SUITA de teste a fost executata");
    }
}
