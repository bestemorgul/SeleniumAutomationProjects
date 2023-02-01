package selenium.mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class LocationOfElements {

    public static void main(String[] args) {
        WebDriver driver = new SafariDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));

        driver.manage().window().maximize();
        System.out.println("After maximizing window:"+logo.getLocation());

        driver.manage().window().minimize();
        System.out.println("After minimizing window:"+logo.getLocation());

        driver.manage().window().fullscreen();
        System.out.println("After full screen window:"+logo.getLocation());

        Point point = new Point(100, 100);
        driver.manage().window().setPosition(point);
        System.out.println("After setting new position:"+logo.getLocation());

        driver.quit();










    }
}
