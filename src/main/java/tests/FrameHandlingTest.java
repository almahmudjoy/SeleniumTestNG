package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import javax.sql.rowset.WebRowSet;

public class FrameHandlingTest extends BaseTest {
    String url = "https://www.selenium.dev/selenium/docs/api/java/index.html";

    @Test
    public  void frameTest() throws InterruptedException{
        driver.manage().window().maximize();
        driver.get(url);

        WebElement selenium = driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']"));
        selenium.click();
        Thread.sleep(3000);

        int iframeNumber = driver.findElements(By.tagName("iframe")).size();
        System.out.println(iframeNumber);

//        driver.switchTo().frame("");
//        WebElement selenium = driver.findElement(By.xpath(""));
//        selenium.click();
//        Thread.sleep(3000);
//
//        driver.switchTo().defaultContent();
//
//        driver.switchTo().frame("");
        WebElement alert = driver.findElement(By.xpath("//a[normalize-space()='Alert']"));
        alert.click();
        Thread.sleep(3000);
//
//        driver.switchTo().defaultContent();
//
//        driver.switchTo().frame("");
        WebElement accept = driver.findElement(By.xpath("//a[normalize-space()='accept']"));
        accept.click();
        Thread.sleep(3000);









    }
}
