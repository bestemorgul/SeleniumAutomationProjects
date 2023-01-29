package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class HandlingFrames {

    public static void main(String[] args) {

        WebDriver driver = new SafariDriver();
        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //driver.switchTo().frame(name/id)
        //driver.switchTo().frame(WebElement)
        //driver.switchTo().frame(index)

        driver.switchTo().frame("packageListFrame");
        driver.findElement(By.linkText("org.openqa.selenium")).click(); //frame1

        driver.switchTo().defaultContent(); // switch back to main page

        driver.switchTo().frame("packageFrame");
        driver.findElement(By.linkText("WebDriver")).click(); //frame2

        driver.quit();

    }
}



