package selenium.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class ThreadWait {

    static Long millis = 20L;

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new SafariDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        Thread.sleep(millis);

        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("Testing");
        Thread.sleep(millis);

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Testing Password");
        Thread.sleep(millis);

        driver.quit();

        /*

        sleep() : provided by java itself( not selenium command)
        Adv:
        1) easy to use

        DisAdvantage:

        1) if the time is not sufficient, we will get exception.
        2) it will wait for maximum time out. This will reduce the performance script.
        3) multiple times
      */


    }
}
