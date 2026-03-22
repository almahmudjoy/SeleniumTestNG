package FirstClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BatchDriverTest {
    protected WebDriver driver;

    @BeforeClass
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-notifications");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        System.out.println("WebDriver initialized");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("WebDriver closed");
        }
    }
}























//package FirstClass;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.annotations.*;
//
//public class BatchDriverTest {
//    protected WebDriver driver;
//
//    @BeforeClass
//    public void setup() {
//        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
//
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        options.addArguments("--disable-notifications");
//        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
//
//        driver = new ChromeDriver(options);
//        driver.manage().window().maximize();
//        System.out.println("🔧 WebDriver initialized");
//    }
//
//    @AfterClass
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//            System.out.println("🧹 WebDriver closed");
//        }
//    }
//}



//package FirstClass;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.testng.annotations.*;
//
//
//public class BatchDriverTest {
//    protected WebDriver driver;
//
//    @BeforeClass
//    public void start() {
//        String browser = System.getProperty("browser", "chrome"); // Default to chrome if not specified
//
//        if (browser.contains("chrome")) {
//            WebDriverManager.chromedriver().setup();
//            ChromeOptions options = new ChromeOptions();
//            options.addArguments("--remote-allow-origins=*");
//            options.addArguments("--disable-notifications");
//            options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
//            driver = new ChromeDriver(options);
//        } else if (browser.contains("firefox")) {
//            WebDriverManager.firefoxdriver().setup();
//            driver = new FirefoxDriver();
//        } else {
//            WebDriverManager.edgedriver().setup();
//            driver = new ChromeDriver(); // Note: Replace with EdgeDriver if needed
//        }
//
//        driver.manage().window().maximize();
//        System.out.println("🔧 WebDriver initialized");
//    }
//
//    @AfterClass
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//            System.out.println("🧹 WebDriver closed");
//        }
//    }
//}