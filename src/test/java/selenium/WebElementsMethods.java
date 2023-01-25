package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class WebElementsMethods {

    public static void main(String[] args) {

        WebDriver driver = new SafariDriver();

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("Testing");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Testing Password");

        WebElement button = driver.findElement(By.id("login-button"));
        button.click();

        username.clear();
        password.clear();

        System.out.println(driver.findElement(By.id("user-name")).getAttribute("class"));
        System.out.println(driver.findElement(By.id("user-name")).getCssValue("font-size"));
        System.out.println(driver.findElement(By.id("user-name")).getSize());
        System.out.println(driver.findElement(By.id("user-name")).getLocation());
        System.out.println(driver.findElement(By.id("user-name")).getText());
        System.out.println(driver.findElement(By.id("user-name")).getTagName());

        System.out.println(driver.findElement(By.id("user-name")).isDisplayed());
        System.out.println(driver.findElement(By.id("user-name")).isEnabled());
        System.out.println(driver.findElement(By.id("user-name")).isSelected());

        driver.quit();

    }

}
