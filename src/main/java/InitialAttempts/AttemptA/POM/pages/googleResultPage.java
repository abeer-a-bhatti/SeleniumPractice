package InitialAttempts.AttemptA.POM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class googleResultPage {

    WebDriver driver = null;

    By linkToAccess = By.cssSelector("a[href='https://www.guru99.com/selenium-tutorial.html']");

    public googleResultPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void clickLink()
    {
        driver.findElement(linkToAccess).click();
    }

}
