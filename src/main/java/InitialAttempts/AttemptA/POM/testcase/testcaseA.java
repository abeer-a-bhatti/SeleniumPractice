package InitialAttempts.AttemptA.POM.testcase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.time.Duration;

import InitialAttempts.AttemptA.POM.pages.googleResultPage;
import InitialAttempts.AttemptA.POM.pages.googleSearchPage;

public class testcaseA{
    private static WebDriver driver = null;
    public static void main(String[] args) {
        googleSearch();
    }

    public static void googleSearch()
    {
        String searchText = "Tutorial for Selenium";
        String baseUrl = "https://www.google.com/";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);

        googleSearchPage searchPage = new googleSearchPage(driver);
        searchPage.searchBoxSetText(searchText);
        searchPage.searchButtonClick();

        //Assertion
        String searchToAssert = searchText + " - Google Search";
        String titleofPage = driver.getTitle();
        Assert.assertEquals(titleofPage, searchToAssert);

        googleResultPage resultPage = new googleResultPage(driver);
        resultPage.clickLink();

//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.quit();
    }
}
