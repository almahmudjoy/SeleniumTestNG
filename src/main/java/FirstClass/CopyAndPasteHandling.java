package FirstClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.security.Key;

public class CopyAndPasteHandling extends BatchDriverTest {

    String url = "https://demoqa.com/automation-practice-form";

    @Test

    public void webElementsTest() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(url);

        Actions action = new Actions(driver);

        WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstName.sendKeys("Mahmud");
        Thread.sleep(3000);

        //all select
        action.keyDown(Keys.CONTROL);
        action.sendKeys("A");
        action.keyUp(Keys.CONTROL);
        action.build().perform();

        //copy
        action.keyDown(Keys.CONTROL);
        action.sendKeys("C");
        action.keyUp(Keys.CONTROL);
        action.build().perform();
        Thread.sleep(3000);

        //Tab
        action.sendKeys(Keys.TAB);
        action.build().perform();
        Thread.sleep(3000);

        //paste
        action.keyDown(Keys.CONTROL);
        action.sendKeys("V");
        action.keyUp(Keys.CONTROL);
        action.build().perform();
        Thread.sleep(3000);


}
}
