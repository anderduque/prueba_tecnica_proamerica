package Helpers;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

public class BrowserConfig {

    private WebDriver driver;
    Helpers helpers = new Helpers();


    public WebDriver setUpBrowser(String browserString){
        String headless_mode = helpers.readConfigBrowserParameters("headless");
            if(browserString.equals("chrome")) {
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                if(headless_mode.equals("true")) {
                    chromeOptions.setHeadless(true);
                    chromeOptions.addArguments("--headless");
                }
                chromeOptions.addArguments("--no-sandbox");
                chromeOptions.addArguments("--disable-gpu");
                chromeOptions.addArguments("--test-type=ui");
                chromeOptions.addArguments("--disable-gpu-sandbox");
                chromeOptions.addArguments("--disable-dev-shm-usage");

                driver = new ChromeDriver(chromeOptions);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.manage().window().maximize();
                driver.manage().window().setSize(new Dimension(1920, 1080));
                return driver;
            }
        else if(browserString.equals("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxoptions = new FirefoxOptions();
                if(headless_mode.equals("true")) {
                    firefoxoptions.setHeadless(true);
                    firefoxoptions.addArguments("--headless");
                }
                firefoxoptions.addArguments("--no-sandbox");
                driver = new FirefoxDriver(firefoxoptions);
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.manage().window().maximize();
                driver.manage().window().setSize(new Dimension(1920, 1080));
                return driver;
        }
            return null;
    }
}
