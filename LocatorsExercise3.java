package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsExercise3 {

    public static void main (String...args) throws InterruptedException{
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.nasa.gov/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement misions= driver.findElement(By.partialLinkText("Missions"));
        String cadena= misions.getAttribute("href");
        System.out.println("El texto es:" +cadena);
        WebElement nasaTv= driver.findElement(By.linkText("NASA TV"));
        String cadena2= nasaTv.getAttribute("href");
        System.out.println("El texto es:" +cadena2);
        WebElement mars= driver.findElement(By.partialLinkText("MARS"));
        String cadena3 = mars.getAttribute("href");
        System.out.println("El texto es:" +cadena3);
        List<WebElement> listInputElement = driver.findElements(By.tagName("input"));
        for (int i=0; i<listInputElement.size(); i++){
            System.out.println(listInputElement.get(i).getText());
        }
        driver.close();

    }
}
