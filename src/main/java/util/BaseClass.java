package util;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

    public static WebDriver driver = null;

    public static void getBrowserInstance(String browser) {
//		browser = System.getProperty("browser");
        try {
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
//				System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
                    driver = new ChromeDriver();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
                    break;

                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;

                case "firefox":
//                    System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;

                default:
                    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
                    driver = new ChromeDriver();
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // driver.close();
        }
    }

    public void setBrowserCapabilities() {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setAcceptInsecureCerts(false);
        chromeOptions.addArguments("start-maximized"); // to maximize
        chromeOptions.addExtensions(new File("C:\\Selenium\\extension_4_3_5_0.crx"));
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory", "/directory/path");
        chromeOptions.setExperimentalOption("prefs", prefs);

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setAcceptInsecureCerts(false);
        edgeOptions.addArguments("start-maximized");

    }

    public static String generateRandomString(int count) {
        Random random = new Random();
        return random.ints(65, 90).limit(count)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();

    }

    public void createFolder(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            file.mkdir();
        }
    }
}

