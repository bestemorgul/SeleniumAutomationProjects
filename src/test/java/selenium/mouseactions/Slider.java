package selenium.mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Slider {

    public static void main(String[] args) {
        WebDriver driver = new SafariDriver();
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        Actions action = new Actions(driver);

        WebElement minSlider = driver.findElement(By.xpath("//span[1]"));
        System.out.println("Current location of min slider:"+ minSlider.getLocation());
        action.dragAndDropBy(minSlider,100, 250).perform();
        System.out.println("Location of min slider after moving"+minSlider.getLocation());


        WebElement maxSlider = driver.findElement(By.xpath("//span[2]"));
        System.out.println("Current location of min slider:"+ maxSlider.getLocation());
        action.dragAndDropBy(maxSlider,-96, 250).perform();
        System.out.println("Location of min slider after moving"+maxSlider.getLocation());

        driver.quit();


    }
}
