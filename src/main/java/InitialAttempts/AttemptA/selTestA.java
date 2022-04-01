package InitialAttempts.AttemptA;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class selTestA {
    public static void main(String[] args) throws InterruptedException {
        String search = "Tutorial for Selenium";
        String baseUrl = "https://www.google.com/";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        WebElement elementTextbox = driver.findElement(By.cssSelector("input[type='text']"));
        elementTextbox.sendKeys(search);
        WebElement searchButton = driver.findElement(By.cssSelector("div.FPdoLc.lJ9FBc > center > input.gNO89b"));
        //elementTextbox.sendKeys(Keys.ENTER);
        searchButton.click();

        //Assertion
        String searchToAssert = search + " - Google Search";
        String titleofPage = driver.getTitle();
        Assert.assertEquals(titleofPage, searchToAssert);

        WebElement linkToClick = driver.findElement(By.cssSelector("a[href='https://www.guru99.com/selenium-tutorial.html']"));
        linkToClick.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.quit();
    }
}
