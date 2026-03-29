package practiceproject;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class login extends BaseTest {

    String url = "//https:www.daraz.com";

    @Test


    public void loginTest() throws InterruptedException{
        driver.manage().window().maximize();

        WebElement log = driver.findElement(By.id("sdjfn"));
        log.click();
        Thread.sleep(500);


    }

}
