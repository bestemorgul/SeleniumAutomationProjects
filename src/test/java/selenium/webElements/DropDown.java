package selenium.webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DropDown {

    public static void main(String[] args) {

        WebDriver driver = new SafariDriver();
        driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement country = driver.findElement(By.xpath("//select[@id='country-list']"));
        Select select = new Select(country);


        //SELECT AN OPTION FROM THE DROPDOWN
        select.selectByVisibleText("USA");
        select.selectByValue("4");
        select.selectByIndex(3);  //FRANCE

        //FIND TOTAL OPTIONS IN DROPDOWN
        List<WebElement> options = select.getOptions();
        System.out.println("total number of options:"+ options.size());

        //PRINT OPTIONS IN CONSOLE WINDOW
        for (int i=0; i<options.size(); i++){
            System.out.println(options.get(i).getText());
        }

        //USING ENHANCED LOOP
        for (WebElement op: options){
            System.out.println(op.getText());
        }



        //DROPDOWN NOT HAVING SELECT TAG NAME (BOOSTRAP DROPDOWN)
        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_3");
        driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
        List<WebElement> multiOptions = driver.findElements(By.xpath("//ul[contains(@class,multiselect)]//label"));

        //FIND TOTAL NUMBER OF OPTIONS
        System.out.println("Total numbrt of options:"+multiOptions.size());

        //PRINT ALL THE OPTIONS FROM DROPDOWN
        for (int i=0; i<multiOptions.size(); i++){
            System.out.println(multiOptions.get(i).getText());
        }

        //SELECT OPTIONS FROM DROPDOWN
        for (int i=0; i<multiOptions.size(); i++){
            String option = multiOptions.get(i).getText();
            if (option.equals("Java")){
                multiOptions.get(i).click();
                break;
            }
        }

        //USING ENHANCED LOOP
        for (WebElement optionSelected : multiOptions){
            String txt = optionSelected.getText();
            if(txt.equals("Java")){
                optionSelected.click();
            }
        }



    }
}
