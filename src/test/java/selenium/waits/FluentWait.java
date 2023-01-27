package selenium.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class FluentWait {

    public static void main(String[] args) {

        WebDriver driver = new SafariDriver();

        Wait<WebDriver> myWait = new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        // Waiting 30 seconds for an element to be present on the page, checking
        // for its presence once every 5 seconds.

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        WebElement userName = myWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id("user-name"));
            }
        });

          userName.sendKeys("Admin");

          driver.quit();
    }
}
