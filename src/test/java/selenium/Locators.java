package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class Locators {

    public static WebDriver driver;

    public static String browser = "safari";


    public static void main(String[] args) {

        if (browser.equals("safari")) {
            driver = new SafariDriver();

        }

        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.id("user-name"));
        driver.findElement(By.className("form_input"));

        driver.findElement(By.cssSelector("#user-name"));
        driver.findElement(By.cssSelector("input"));
        driver.findElement(By.cssSelector(".form_input"));
        driver.findElement(By.cssSelector("[type='text']"));
        driver.findElement(By.cssSelector("div input"));
        driver.findElement(By.cssSelector("input#user-name"));
        driver.findElement(By.cssSelector("input.form_input"));

        driver.findElement(By.xpath("//input[@id='user-name']"));
        driver.findElement(By.xpath("//input[@id='user-name'][1]"));
        driver.findElement(By.xpath("//h4[text()='Password for all users:']"));
        driver.findElement(By.xpath("//h4[contains(text(),'Password for all users:')]"));


        //RELATIVE LOCATORS

        //ABOVE
        By usernameAbove = RelativeLocator.with(By.tagName("input")).above(By.id("password"));
        driver.findElement(usernameAbove).sendKeys("Testing");

        //BELOW
        By usernameBelow = RelativeLocator.with(By.tagName("input")).below(By.className("login_logo"));
        driver.findElement(usernameBelow).sendKeys("Testing");

        //LEFT OF
        By usernameLeftof = RelativeLocator.with(By.tagName("input")).toLeftOf(By.className("bot_column"));
        driver.findElement(usernameLeftof).sendKeys("Testing");

        //RIGHT OF
        By loginRightof = RelativeLocator.with(By.className("login_password")).toRightOf(By.id("login_credentials"));
        System.out.println(driver.findElement(loginRightof).getText());

        //NEAR
        By usernameNear= RelativeLocator.with(By.tagName("input")).near(By.id("password"));
        driver.findElement(usernameNear).sendKeys("Testing");

        driver.quit();













    }
}
