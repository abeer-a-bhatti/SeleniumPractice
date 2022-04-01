package GoogleSearch.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class googleSearchPage {
    WebDriver driver = null;

    @FindBy(css = "input[type='text']")
    WebElement searchBox;
    //By searchBox = By.cssSelector("input[type='text']");
    @FindBy(how = How.CSS, using = "div.FPdoLc.lJ9FBc > center > input.gNO89b")
    WebElement searchButton;
    //By searchButton = By.cssSelector("div.FPdoLc.lJ9FBc > center > input.gNO89b");

    public googleSearchPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void searchText(String str)
    {
        searchBox.sendKeys(str);
        searchButton.click();
    }

}
