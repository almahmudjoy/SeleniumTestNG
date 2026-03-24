package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorsTestPractice extends BaseTest {

    @Test
    public void testlocetorspractice() throws InterruptedException{
        driver.get("https://www.shwapno.com/?srsltid=AfmBOooGz0MnIJkJX9IAIzFUa-GU-XVCthMV0fNTYwv6iI4gNfTcKBzW");
        driver.manage().window().maximize();
        Thread.sleep(3000);

//        //By Food
//        WebElement food = driver.findElement(By.xpath("//a[normalize-space()='Food']"));
//        food.click();
//        Thread.sleep(3000);

//        //By Search
//        WebElement search = driver.findElement((By.xpath("(//input[@id='search-input'])[1]")));
//        search.click();
//        Thread.sleep(3000);

        // By BabyfOOD
        WebElement baby = driver.findElement(By.xpath("//a[contains(text(),'Baby Food & Care')]"));
        baby.click();
        Thread.sleep(3000);






    }

}
