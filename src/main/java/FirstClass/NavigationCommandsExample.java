package FirstClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NavigationCommandsExample extends BatchDriverTest {

    String url = "https://www.shopify.com/?gad_source=1&gad_campaignid=22839576894&gbraid=0AAAABASFGiM26Krucr8UAWU-yB4ZE8u_X&gclid=Cj0KCQjwndHEBhDVARIsAGh0g3DUHW9EXVTCtmsC0g0YfiGCI6XCgtL1NfSln3LSv5aZL6zHe-LLD3EaAje-EALw_wcB";

    @Test

    public void navigateTest() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(url);

        WebElement signUp = driver.findElement(By.xpath("//a[@class='whitespace-nowrap hover:underline text-white']"));
        signUp.click();
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(1000);

        driver.navigate().forward();
        Thread.sleep(1000);

        driver.navigate().refresh();
        Thread.sleep(1000);



    }
}
