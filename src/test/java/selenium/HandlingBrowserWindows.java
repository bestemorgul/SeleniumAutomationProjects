package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class HandlingBrowserWindows {

    public static void main(String[] args) {

        WebDriver driver = new SafariDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.linkText("OrangeHRM, Inc")).click();

        //CAPTURE ID'S FOR BROWSER WINDOWS

        //getWindowHandle() - return id of single window( in which driver focused)
        //getWindowHandles()- returns id's of multiple windows

        Set<String> windowsIds = driver.getWindowHandles(); // store 2 window ids

        //APPROACH 1
        List <String> idList = new ArrayList(windowsIds); // converts Set --> List

        String parentId = idList.get(0);
        String childId = idList.get(1);

        //SWITCH TO CHILD WINDOW
        driver.switchTo().window(childId);
        driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();

        //SWITCH TO PARENT WINDOW
        driver.switchTo().window(parentId);
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");

        //APPROACH 2
        for (String winid: windowsIds){
            String title = driver.switchTo().window(winid).getTitle();

            if (title.equals("OrangeHRM")) {
                driver.findElement(By.xpath("//button[@type='submit']")).click();
            }
        }


        //CLOSE SPECIFIC BROWSER WINDOW BASED ON CHOICE
        // 1-x, 2-y, 3-z, 4-a, 5-b
        /* for (String winid:windowsIds){
            String title1 = driver.switchTo().window(winid).getTitle();

            if (title1.equals("x") || title.equals("y") || title.equals("z")){

            driver.close();
            }
        }*/


        //close() - close single browser window which is focused by driver.
        //quit() - close all the browser windows which are currently opened







    }
}
