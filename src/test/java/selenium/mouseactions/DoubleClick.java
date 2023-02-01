package selenium.mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class DoubleClick {

    public static void main(String[] args) {
        WebDriver driver = new SafariDriver();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.switchTo().frame("iframeResult");

        WebElement fieldFirst = driver.findElement(By.xpath("//input[@id='field1']"));
        fieldFirst.clear();
        fieldFirst.sendKeys("Welcome");

        WebElement button = driver.findElement(By.xpath("//button[@normalize-space()='Copy Text']"));

        Actions action = new Actions(driver);

        action.doubleClick(button).perform();

        WebElement fieldSecond = driver.findElement(By.xpath("//input[@id='field2']"));

        String copiedText = fieldSecond.getAttribute("value");

        System.out.println("Copied text is:"+copiedText);

        if (copiedText.equals("Welcome")){
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }

        driver.quit();












    }
}
