package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BaseTest {

    static String browser = "Chrome";

    static String baseUrl = "https://demo.nopcommerce.com/";

    public static WebDriver driver;

    public void openBrowser(String baseUrl){
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name");
        }

        //  get() to open the URL in to browser
        driver.get(baseUrl);

        // Maximise the Browser
        driver.manage().window().maximize();

        // We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    public void closeBrowser() {
        driver.quit();
    }
}
