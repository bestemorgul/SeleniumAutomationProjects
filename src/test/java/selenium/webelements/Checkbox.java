package selenium.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
import java.util.List;

public class Checkbox {

    public static WebDriver driver;
    public static String browser = "safari";

    public static void main(String[] args) {

        if (browser.equals("safari")) {
            driver = new SafariDriver();
        }

        driver.navigate().to("https://demoqa.com");
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/elements");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        WebElement checkboxButton = driver.findElement(By.xpath("//span[text()='Check Box']"));
        checkboxButton.click();

        WebElement homeButton = driver.findElement(By.xpath("//span[contains(text(),'Home')]"));
        homeButton.click();
        System.out.println(homeButton.isSelected());


        List<WebElement> homeText = driver.findElements(By.className("text-success"));

       if(homeButton.isSelected()){
            for(WebElement result : homeText){
                System.out.println(result.getText());}
            } else{
            System.out.println("Home is not selected!");
        }

        WebElement toggleButton = driver.findElement(By.xpath("//button[@title='Toggle']"));
        toggleButton.click();

        WebElement checkBoxDesktop = driver.findElement(By.xpath("//span[contains(text(),'Desktop')]"));
        WebElement checkBoxDocuments = driver.findElement(By.xpath("//span[contains(text(),'Documents')]"));
        WebElement checkBoxDownloads = driver.findElement(By.xpath("//span[contains(text(),'Downloads')]"));

        System.out.println(checkBoxDesktop.isDisplayed());
        System.out.println(checkBoxDocuments.isDisplayed());
        System.out.println(checkBoxDownloads.isDisplayed());

        checkBoxDesktop.click();
        System.out.println(checkBoxDesktop.isSelected());
        System.out.println(homeButton.isSelected());

        driver.quit();
    }
}
