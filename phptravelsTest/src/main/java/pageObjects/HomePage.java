package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;



public class HomePage extends PageObject{


    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void Flight(){
        WebElement flightsTab = driver.findElement(By.xpath("//*[@id=\"flights-tab\"]"));
        flightsTab.click();
    }

    public void OneWay() {
        WebElement oneway = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div[2]/div[2]/div[2]/form/div[1]/div[1]/div/div[1]/div/input"));
        oneway.click();
    }



    public void FlightType() {
        WebElement flight_type = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/select"));
        flight_type.click();
    }
    public void BusinessType(){
        WebElement Business = driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div[2]/div[2]/div[2]/form/div[1]/div[2]/select/option[3]"));
        Business.click();

    }
    public void flyFrom(){
        WebElement flyFrom = driver.findElement(By.id("autocomplete"));
        flyFrom.sendKeys("Ho Chi Minh");
        WebDriverWait wait = new WebDriverWait(driver, 5, 500);

        // Wait and click element with "Tansonnhat (SGN)"
        try{
            wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.xpath("//*[@id=\"onereturn\"]/div[1]/div/div[1]/div/div/div/div/div"))));
        }
        catch(Exception e){
        }
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[@id=\"onereturn\"]/div[1]/div/div[1]/div/div/div/div/div[1]")));
    }

    public void arriveAt() {
        WebElement arriveAt = driver.findElement(By.id("autocomplete2"));
        arriveAt.sendKeys("HAN");
        WebDriverWait wait = new WebDriverWait(driver, 5, 500);
        // Wait and click element with Noibai (HAN)"
        try{
            wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.xpath("//*[@id=\"onereturn\"]/div[1]/div/div[2]/div/div[2]/div/div/div[1]"))));
        }
        catch(Exception e){
        }
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[@id=\"onereturn\"]/div[1]/div/div[2]/div/div[2]/div/div/div[1]")));
    }

    public void Depart() {
        WebElement departF = driver.findElement(By.xpath("//*[@id=\"departure\"]"));
        departF.clear();
        departF.sendKeys("31-12-2022");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", departF);
    }




    public SearchPage submit() {
        WebElement submit= driver.findElement(By.xpath("//*[@id=\"flights-search\"]"));
        submit.click();

        return  new SearchPage(driver);
    }
}
