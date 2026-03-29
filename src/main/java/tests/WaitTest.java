package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WaitTest extends BaseTest {

    String url = "https://www.selenium.dev/";

    @Test

    public void testWait() throws InterruptedException{
        driver.manage().window().maximize();
        driver.get(url);

        //Implicit Wait
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)


        //Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement blog = (WebElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Blog']")));
        blog.click();
        Thread.sleep(3000);


    }
}
