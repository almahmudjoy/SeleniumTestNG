package FirstClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebElementCommandsExample extends BatchDriverTest {
    String url = "https://demoqa.com/automation-practice-form";

    @Test

    public void webElementsTest() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(url);

        WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstName.sendKeys("Mahmud");
        Thread.sleep(500);

        WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastName.clear();
        lastName.sendKeys("Joy");
        Thread.sleep(500);

        WebElement mobile = driver.findElement(By.xpath("//input[@id='userNumber']"));
        mobile.sendKeys("1682062401");
        Thread.sleep(500);

        WebElement dob = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
        dob.click();
        Thread.sleep(500);

//        WebElement submit = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
//        submit.click();
//        Thread.sleep(500);

        WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
        System.out.println("Attribute Value : "+email.getAttribute("pattern"));
        Thread.sleep(500  );

        WebElement text = driver.findElement(By.xpath("//h5[normalize-space()='Student Registration Form']"));
        String formValue = text.getText();
        System.out.println(formValue);
        Thread.sleep(500  );

        System.out.println("CSS Value : "+ text.getCssValue("font-size"));
        System.out.println("CSS Value : "+ text.getCssValue("color"));

        WebElement c_add = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        System.out.println("Attribute Value : "+c_add.getAttribute("id"));
        Thread.sleep(500  );

        if(email.isDisplayed()){
            email.sendKeys("Test@nomail.com");
            Thread.sleep(500);
        }else {
            System.out.println("Email address is not found");
        }

//        WebElement sports = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
//
//        if (!sports.isSelected()) {
//            sports.click();
//            Thread.sleep(500);
//        }else {
//            System.out.println("Sports is already selected");
//        }





    }
}
