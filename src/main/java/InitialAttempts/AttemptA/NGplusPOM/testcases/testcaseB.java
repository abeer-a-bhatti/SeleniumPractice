package InitialAttempts.AttemptA.NGplusPOM.testcases;

import InitialAttempts.AttemptA.POM.pages.googleResultPage;
import InitialAttempts.AttemptA.POM.pages.googleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class testcaseB {
    WebDriver driver = null;
    String searchText = "Tutorial for Selenium";

    @BeforeTest
    public void openBrowser()
    {
        String baseUrl = "https://www.google.com/";
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @Test
    public void search()
    {
        googleSearchPage searchPage = new googleSearchPage(driver);
        searchPage.searchBoxSetText(searchText);
        searchPage.searchButtonClick();

        //Assertion
        String searchToAssert = searchText + " - Google Search";
        String titleofPage = driver.getTitle();
        Assert.assertEquals(titleofPage, searchToAssert);

        googleResultPage resultPage = new googleResultPage(driver);
        resultPage.clickLink();
    }

    @AfterTest
    public void closeBrowser()
    {
        //        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.quit();
    }

}
