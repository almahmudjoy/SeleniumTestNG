package FirstClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGExample {

    WebDriver driver;

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("🔵 Before Suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("🔵 After Suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("🔵 Before Test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("🔵 After Test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("🔃 Before Class");
        // Setup ChromeDriver (Make sure chromedriver is in your PATH or provide path)
        driver = new ChromeDriver();
    }

    @AfterClass
    public void afterClass() {
        System.out.println("✅ After Class");
        if (driver != null) {
            driver.quit();
        }
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("🔃 Before Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("✅ After Method");
    }

    @Test(priority = 1)
    public void testOne() {
        System.out.println("🧪 Running Test ONE");
        driver.get("https://www.google.com");
        Assert.assertEquals(driver.getTitle(), "Google");
    }

    @Test(priority = 2)
    public void testTwo() {
        System.out.println("🧪 Running Test TWO");
        driver.get("https://www.google.com");
        Assert.assertTrue(driver.getTitle().contains("Google"));
    }

    @Test
    public void testGoogleTitle() {
        System.out.println("🧪 Running Test Google Title");
        driver.get("https://www.google.com");
        Assert.assertEquals(driver.getTitle(), "Google");
    }

}
