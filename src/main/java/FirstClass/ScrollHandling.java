package FirstClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ScrollHandling extends BatchDriverTest{

    String url = "https://www.arogga.com/";
    @Test

   public void scrollHandling() throws InterruptedException{
        driver.manage().window().maximize();
        driver.get(url);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        //scroll down
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(5000);

        //scroll up
        js.executeScript("window.scrollTo(0,0)");
        Thread.sleep(5000);

        //Specific location
        WebElement location1 = driver.findElement(By.xpath("//h2[normalize-space()='Smile Bright with Systema']"));
        js.executeScript("arguments[0].scrollIntoView()", location1);
        Thread.sleep(5000);

    }


}
