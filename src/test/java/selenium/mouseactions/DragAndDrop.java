package selenium.mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class DragAndDrop {

        public static void main(String[] args) {
            WebDriver driver = new SafariDriver();
            driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            Actions action = new Actions(driver);

            WebElement rome = driver.findElement(By.xpath("//div[@id='box6']"));
            WebElement italy = driver.findElement(By.xpath("//div[@id='box106']"));

            action.dragAndDrop(rome, italy).perform();

            driver.quit();



        }
    }
