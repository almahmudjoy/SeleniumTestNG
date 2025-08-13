package FirstClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoverHandling extends BatchDriverTest {

//    String url = "https://www.daraz.com.bd/products/-i466794822-s2245484963.html?laz_trackid=2:mm_158272437_426481230_4181480734:clkgg2dgt1j27r9684kmci&mkttid=clkgg2dgt1j27r9684kmci";
//    String url = "https://chaldal.com/";
      String url = "https://osudpotro.com/";


    @Test

    public void mouseHoverTest() throws InterruptedException{
        driver.manage().window().maximize();
        driver.get(url);

        Actions action = new Actions(driver);

//        WebElement home = driver.findElement(By.xpath("//span[contains(text(), 'Home & Lifestyle')]"));
//        WebElement home = driver.findElement(By.xpath("//span[normalize-space()='Home & Lifestyle']"));
//        action.moveToElement(home).perform();
//        Thread.sleep(500);
//        System.out.println("Element found");
//
//        WebElement furniture = driver.findElement(By.xpath("//body/div[@id='New_LzdSiteNav']/div[@id='topActionHeaderWrapper']/div[@id='topActionHeader']/div[@class='lzd-site-nav-menu lzd-site-nav-menu-active']/div[@class='lzd-site-menu-nav-container']/div[@class='lzd-site-menu-nav-category']/div[@class='lzd-site-menu-nav-menu']/div[@class='lzd-site-nav-menu-dropdown']/ul[@class='lzd-site-menu-root']/ul[@class='lzd-site-menu-sub Level_1_Category_No10']/li[11]/a[1]"));
//        action.moveToElement(furniture).perform();
//        Thread.sleep(1000);


//        WebElement food = driver.findElement(By.xpath("//div[@class='name']//a[normalize-space()='Food']"));
//        action.moveToElement(food).perform();
//
//        food.click();
//        Thread.sleep(1000);
//
//        WebElement meatAndfish = driver.findElement(By.xpath("//a[contains(text(),'Meat & Fish')]"));
//        action.moveToElement(meatAndfish).perform();
//        meatAndfish.click();
//        Thread.sleep(500);
//
//        WebElement frozen = driver.findElement(By.xpath("//a[contains(text(),'Frozen Fish')]"));
//        action.moveToElement(frozen).perform();
//        frozen.click();
//        Thread.sleep(500);


        WebElement home = driver.findElement(By.xpath("//body/div[@id='__next']/div[@class='pages__AppWrapper-sc-1981mdw-0 birYPk']/div[contains(@class,'layout')]/header[@class='normal-header']/div[@class='nav-menu-header-cont-higher-width']/div[@class='container']/div[@class='row']/div[@class='px-0 col']/nav[@class='navbar navbar-expand navbar-light']/ul[@class='m-auto main-menu-area navbar-nav d-flex justify-content-between navbar-nav']/li[3]/div[1]"));
        action.moveToElement(home).perform();
        Thread.sleep(500);

        WebElement furniture = driver.findElement(By.xpath("//a[normalize-space()='Healthcare Products']"));
        furniture.click();
        Thread.sleep(5000);


    }
}
