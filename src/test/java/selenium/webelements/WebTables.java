package selenium.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class WebTables {

    public static void main(String[] args) {

        WebDriver driver = new SafariDriver();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //FIND TOTAL NUMBER OF ROWS

        int rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
        System.out.println("Number Of Rows = "+rows);


        //FIND TOTAL NUMBER OF COLUMNS

        int columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th")).size();
        System.out.println("Number Of Columns = "+columns);


        //READ SPECIFIC ROW AND COLUMN DATA

        String value= driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[2]")).getText();
        System.out.println(value); // Maria Anders


        //READ DATA FROM ALL THE ROWS AND COLUMNS

        for (int r=2; r<=rows; r++){

            for (int c=1; c<=columns; c++){
                String v = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+r+"]/td["+c+"]")).getText();
                System.out.println(v);
            }
        }


        //PRINT COMPANY NAME WHICH IS GOOGLE

        for (int r=2; r<=rows; r++){

            String company = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+r+"]/td[1]")).getText();

            if (company.equals("Google")){
                String contactName = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+r+"]/td[2]")).getText();
                System.out.println(company+"   "+contactName);
            }

        }
















    }
}
