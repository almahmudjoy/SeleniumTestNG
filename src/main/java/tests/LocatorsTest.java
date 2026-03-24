package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorsTest extends BaseTest {

    @Test
    public void testLocators() throws InterruptedException {
        driver.get("https://www.shohoz.com/contact-us");
        driver.manage().window().maximize();
        Thread.sleep(3000);
//        driver.get("https://train.shohoz.com/?_gl=1*1p32pq9*_gcl_au*MTE2MzI2OTI1OC4xNzY5NTI3Mzk2LjgzOTg5NTg4My4xNzc0MDM3MTE4LjE3NzQwMzcxMTc.");
//        Thread.sleep(3000);

        //By ID
        WebElement bus = driver.findElement(By.id("purpose"));
        bus.click();
        Thread.sleep(500);

        //By name
        WebElement name = driver.findElement(By.id("name"));
        name.click();
        Thread.sleep(500);


        //By email
        WebElement email = driver.findElement(By.id("email"));
        email.click();
        Thread.sleep(500);

        //By message
         WebElement comment = driver.findElement(By.id("comment"));
         comment.click();
         Thread.sleep(500);

         //By city
        WebElement city = driver.findElement(By.id("city"));
        city.click();
        Thread.sleep(500);

        //By phonenumber
        WebElement phone = driver.findElement(By.id("phone_number"));
        phone.click();
        Thread.sleep(500);

        //By Linktext
        WebElement launch = driver.findElement(By.linkText("Launch"));
        launch.click();
        Thread.sleep(300);

//        //By Class- 2nd deliver
//        WebElement send = driver.findElement(By.className("form-group"));
//        send.click();
//        Thread.sleep(300);

//        /*
//        *Custom Xpath->
//        * //tagName[@attribute="value"]
//        * //tagName[contains(text(),'text')]
//        * //*[contains(text(),'text')]
//        * //table[@id='customers']/tbody/tr[2]/td[3]
//        * /jokhn kono location er unique identify korte na pari tokhni
//        xpath use krbo, otherwise 'id','name' etc unique jinis die identify krbo.
//         */

//        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
//        email.sendKeys("xyz@gmail.com");
//        Thread.sleep(3000);
//
//        WebElement bus = driver.findElement(By.xpath("(//div)[55]"));
//        bus.click();
//        Thread.sleep(300);



    }
}
