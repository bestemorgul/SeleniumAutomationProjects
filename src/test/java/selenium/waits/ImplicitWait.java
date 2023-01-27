package selenium.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class ImplicitWait {

    public static void main(String[] args) {

        WebDriver driver = new SafariDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("Testing");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Testing Password");

        driver.quit();

        /*
        Adv:
      1) single time/one statement
      2) it will not wait till maximum time if the element is available
      3) Applicable for all the elements
      4) easy to use

        Disadvantge:
      1) if the time is not sufficient then we will get exception
       */



    }
}
