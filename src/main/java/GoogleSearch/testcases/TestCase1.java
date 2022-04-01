package GoogleSearch.testcases;

import GoogleSearch.pages.*;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import GoogleSearch.Utilities.*;

import java.time.Duration;

public class TestCase1 {
    static String baseUrl = "https://www.google.com/";
    static WebDriver driver;
    //static String browser = "Chrome";
    static String searchText = "Tutorial for Selenium";
    
    @BeforeTest
    @Parameters("browser")
    public void setup(String browser){
        driver = navigateBrowser.startBrowser(browser, baseUrl);
    }
    @AfterTest
    public void  tearDown(){
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.quit();
    }
    @Test
    public void searchAndVerify()
    {
        googleSearchPage searchPage= PageFactory.initElements(driver, googleSearchPage.class);
        searchPage.searchText(searchText);

        //Assertion
        String searchToAssert = searchText + " - Google Search";
        String titleofPage = driver.getTitle();
        Assert.assertEquals(titleofPage, searchToAssert);

       googleResultPage resultPage = PageFactory.initElements(driver, googleResultPage.class);
       resultPage.clickLink();
    }
}
