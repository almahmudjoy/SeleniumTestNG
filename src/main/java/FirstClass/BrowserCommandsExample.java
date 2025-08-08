package FirstClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrowserCommandsExample extends BatchDriverTest{

    String url = "https://www.shopify.com/?gad_source=1&gad_campaignid=22839576894&gbraid=0AAAABASFGiM26Krucr8UAWU-yB4ZE8u_X&gclid=Cj0KCQjwndHEBhDVARIsAGh0g3DUHW9EXVTCtmsC0g0YfiGCI6XCgtL1NfSln3LSv5aZL6zHe-LLD3EaAje-EALw_wcB";

    @Test

    public void BrowserTest() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(url);

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        WebElement signUp = driver.findElement(By.xpath("//a[@class='whitespace-nowrap hover:underline text-white']"));
        signUp.click();
        Thread.sleep(3000);

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());



    }
}
