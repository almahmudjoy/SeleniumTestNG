package tests;

import base.BaseTest;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class TabHandlingTest extends BaseTest {

    String url1 = "https://demoqa.com/frames";
    String url2 = "https://www.selenium.dev/selenium/docs/api/java/index.html";

    @Test
    public void tabtest() throws InterruptedException{
        driver.manage().window().maximize();
        driver.get(url1);
        String originalTab = driver.getWindowHandle();
        Thread.sleep(3000);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(url2);
        Thread.sleep(3000);

        driver.switchTo().window(originalTab);
        Thread.sleep(3000);
    }

}
