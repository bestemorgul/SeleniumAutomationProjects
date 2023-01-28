package selenium.webelements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Alerts {

    public static void main(String[] args) {
        WebDriver driver = new SafariDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        //ALERT WITH OK AND CANCEL BUTTON
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

        //FIRST WAY
        //Alert alert= driver.switchTo().alert();

        //SECOND WAY (WITH EXPLICIT WAIT)
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        System.out.println(alert.getText());

        alert.accept(); // THIS WILL CLOSE ALERT WINDOW USING OK BUTTON
        //alert.dismiss(); // THIS WILL CLOSE ALERT WINDOW BY USING CANCEL BUTTON


        //ALERT WITH INPUTBOX AND OK/CANCEL BUTTON
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));

        Alert alertTwo = driver.switchTo().alert();
        System.out.println(alertTwo.getText());
        alertTwo.sendKeys("Welcome");
        alertTwo.accept();
        //alertTwo.dismiss();

        String actualText = driver.findElement(By.xpath("//p[@id='result']")).getText();
        String expectedText = "You entered: Welcome";

        if (actualText.equals(expectedText)){
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed!");
        }



        /*Alerts/Popus

        1) alert with ok
        2) alert with ok & Cancel
        3) alert with inputbox along with ok & Cancel
        4) alert with no elements*/

    }
}
