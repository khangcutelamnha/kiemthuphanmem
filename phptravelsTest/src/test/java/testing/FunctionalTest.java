package testing;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;






public class FunctionalTest {
    protected WebDriver driver;


    @BeforeClass
    public void setupDriver() {
        WebDriverManager.chromedriver().setup(); // Gọi phiên bản browser
        driver = new ChromeDriver();
    }
    @AfterClass
    public void quitDriver (){
        driver.quit();
    }
}
