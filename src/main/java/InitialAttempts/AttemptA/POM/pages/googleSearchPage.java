package InitialAttempts.AttemptA.POM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class googleSearchPage {
    WebDriver driver = null;

    @FindBy(css = "input[type='text']")
    WebElement searchBox;

    @FindBy(how = How.CSS, using = "div.FPdoLc.lJ9FBc > center > input.gNO89b")
    WebElement searchButton;
    //@FindBy(css = "div.FPdoLc.lJ9FBc > center > input.gNO89b") WebElement searchButton;
    //By searchBox = By.cssSelector();
    //By searchButton = By.cssSelector("div.FPdoLc.lJ9FBc > center > input.gNO89b");

    public googleSearchPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void searchBoxSetText(String str)
    {
        searchBox.sendKeys(str);
    }

    public void searchButtonClick()
    {
        searchButton.click();
    }

}
