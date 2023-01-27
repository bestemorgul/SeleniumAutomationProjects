package selenium.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {

    public static void main(String[] args) {

        WebDriver driver = new SafariDriver();
        WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        WebElement userName = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
        userName.sendKeys("Testing");

        WebElement password = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Testing Password")));
        password.sendKeys("Testing Password");

        driver.quit();






        /*
        1) Conditional based, it will work more effectively.
        2) finding element is inclusive
        3) it will wait for condition to be true, consider the time
        4) we need to write multiple statements for multiple elements
         */



    }
}
