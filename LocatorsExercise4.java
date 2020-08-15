package ejercicios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WebDriverFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsExercise4 {

    public static void main(String...args) throws InterruptedException{

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
        WebElement portada= driver.findElement(By.linkText("Portada"));
        String portadaText= portada.getAttribute("href");
        System.out.println("El texto es: " +portadaText);
        List<WebElement> listPortada = driver.findElements(By.partialLinkText("Página"));

        for (int i=0; i<listPortada.size(); i++){

            System.out.println(listPortada.get(i).getAttribute("href"));

        }

         List<WebElement> button = driver.findElements(By.tagName("button"));

        for (int j=0; j<button.size();j++){
            System.out.println(button.get(j).getAttribute("href"));
        }


        driver.close();
    }
}
