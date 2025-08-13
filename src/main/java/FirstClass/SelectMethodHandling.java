package FirstClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectMethodHandling extends BatchDriverTest {
    String url = "https://www.arogga.com/";

    @Test

    public void selectTest() throws InterruptedException{
        driver.manage().window().maximize();
        driver.get(url);

        WebElement all = driver.findElement(By.xpath("//select[@class='SearchInput_top__middle__search__select__option__pNYwP']"));

        Select select = new Select(all);
        select.selectByIndex(3);
        Thread.sleep(5000);

        select.selectByValue("healthcare");
        Thread.sleep(5000);

        select.selectByVisibleText("Beauty");
        Thread.sleep(5000);

    }
}
