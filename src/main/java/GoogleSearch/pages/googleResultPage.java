package GoogleSearch.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class googleResultPage{

    WebDriver driver = null;
    @FindBy(how = How.CSS, using = "a[href='https://www.guru99.com/selenium-tutorial.html']")
    WebElement linkToAccess;


    public googleResultPage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void clickLink()
    {
        linkToAccess.click();
    }

}
