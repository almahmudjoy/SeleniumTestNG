package FirstClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorsExample extends BatchDriverTest{
    @Test
    public void testLocators()throws InterruptedException{
        driver.manage().window().maximize();
        driver.get("https://www.shohoz.com/contact-us");
        Thread.sleep(5000);

        //By ID
        WebElement bus = driver.findElement(By.id("purpose"));
        bus.click();
        Thread.sleep(5000);

        //By Name
        WebElement YourName = driver.findElement(By.id("name"));
        YourName.click();
        Thread.sleep(5000);

        //By Link
        WebElement Login = driver.findElement(By.linkText("Login"));
        Login.click();
        Thread.sleep(5000);


        //By PartialLink Text
//        WebElement Login = driver.findElement(By.partialLinkText("Logi"));
//        Login.click();
//        Thread.sleep(5000);


        //By ClassName
        WebElement Send = driver.findElement(By.className("bg-green-600"));
        Send.click();
        Thread.sleep(5000);


        /*
        *Custom Xpath->
        * //tagName[@attribute="value"]
        * //tagName[contains(text(),'text')]
        * //*[contains(text(),'text')]
        * //table[@id='customers']/tbody/tr[2]/td[3]
        * /jokhn kono location er unique identify korte na pari tokhni
        xpath use krbo, otherwise 'id','name' etc unique jinis die identify krbo.
         */

        //By XPath
//        WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
//        Email.sendKeys("noemail@gmail.com");
//        Thread.sleep(5000);

        //css -> elementName[attributename="attributevalue"]
//        WebElement name = driver.findElement(By.cssSelector("input[name='dest_from']"));


    }
}
