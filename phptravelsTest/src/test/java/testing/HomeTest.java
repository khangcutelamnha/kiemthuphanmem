package testing;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SearchPage;
public class HomeTest extends FunctionalTest{

    @Test
    public void FlightTest() {
        driver.get("http://www.phptravels.net");
        HomePage homePage = new HomePage(driver);
        homePage.Flight();
        homePage.OneWay();
        homePage.FlightType();
        homePage.BusinessType();
        homePage.flyFrom();
        homePage.arriveAt();
        homePage.Depart();

        SearchPage searchPage = homePage.submit();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(searchPage.getTitle(), "Flights - PHPTRAVELS");

    }

}

