package selenium.mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class MouseHover {

    public static void main(String[] args) {
        WebDriver driver = new SafariDriver();
        driver.get("https://demo.opencart.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement desktop = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
        WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));

        Actions action=new Actions(driver);

        //Mouse Hover
       // action.moveToElement(desktop).moveToElement(mac).click().build().perform();
        action.moveToElement(desktop).moveToElement(mac).click().perform();

        driver.quit();





    }
}
