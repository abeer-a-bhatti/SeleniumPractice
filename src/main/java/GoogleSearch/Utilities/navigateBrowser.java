package GoogleSearch.Utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import javax.annotation.processing.SupportedSourceVersion;

public class navigateBrowser {
    static WebDriver driver;
    public static WebDriver startBrowser(String browser, String url){

        if (browser.equalsIgnoreCase("Chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("Firefox"))
        {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else if (browser.equalsIgnoreCase("IE"))
        {
            WebDriverManager.safaridriver().setup();
            driver = new SafariDriver();
        }
        else if (browser.equalsIgnoreCase("IE"))
        {
            WebDriverManager.edgedriver().setup();
            driver = new InternetExplorerDriver();
        }
        else
        {
            System.out.println("The provided driver is not supported");
            driver.quit();
        }

        driver.get(url);
        return driver;
    }
}
