package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class WebDriverMethods {

    public static WebDriver driver;
    public static String browser = "safari";

    public static void main(String[] args) {

        if (browser.equals("safari")) {
            driver = new SafariDriver();
        }

        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //GET METHODS
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        System.out.println(driver.getWindowHandle());
        System.out.println(driver.getPageSource());

        // NAVIGATE METHODS
        driver.get("https://demoqa.com");
        driver.navigate().to("https://demoqa.com/elements");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();

        //MANAGE METHODS
        System.out.println(driver.manage().window().getSize());
        driver.manage().window().setSize(new Dimension(800, 600));
        System.out.println(driver.manage().window().getPosition());
        driver.manage().window().setPosition(new Point(200, 15));
        System.out.println("New Dimension: " + driver.manage().window().getSize());
        System.out.println("New Position: " + driver.manage().window().getPosition());

        driver.manage().window().fullscreen();
        driver.manage().window().minimize();
        driver.manage().window().maximize();

        driver.quit();

    }
}
