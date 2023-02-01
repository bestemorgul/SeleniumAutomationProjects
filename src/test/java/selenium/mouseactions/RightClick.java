package selenium.mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class RightClick {

        public static void main(String[] args) {
            WebDriver driver = new SafariDriver();
            driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

            Actions action = new Actions(driver);

            //Right Click
            action.contextClick(button).perform();

            /*Action myAction = action.contextClick(button).build();     creating action and storing it in a variable
            myAction.perform();*/

            driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();

            driver.switchTo().alert().accept();

            driver.quit();






        }
    }


