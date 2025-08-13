package FirstClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertHandle extends BatchDriverTest{

    String url = "https://demoqa.com/alerts";

    @Test

    public void alertTest() throws InterruptedException{
        driver.manage().window().maximize();
        driver.get(url);

        WebElement alertButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
        alertButton.click();
        Thread.sleep(500);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(500);

        WebElement confirmButton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
        confirmButton.click();
        Thread.sleep(500);
        alert.dismiss();
        Thread.sleep(300);

        WebElement resultButton = driver.findElement(By.id("confirmResult"));
        System.out.println(resultButton.getText());


        WebElement promtButton = driver.findElement(By.xpath("//button[@id='promtButton']"));
        promtButton.click();
        Thread.sleep(1000);
        alert.sendKeys("Hello");
        alert.accept();
        Thread.sleep(1000);


    }
}
