package InitialAttempts.AttemptA.NGplusPOM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class googleSearchPage {
    WebDriver driver = null;

    By searchBox = By.cssSelector("input[type='text']");
    By searchButton = By.cssSelector("div.FPdoLc.lJ9FBc > center > input.gNO89b");

    public googleSearchPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void searchBoxSetText(String str)
    {
        driver.findElement(searchBox).sendKeys(str);
    }

    public void searchButtonClick()
    {
        driver.findElement(searchButton).click();
    }

}
